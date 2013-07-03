package com.codingstories.itunes;

import com.codingstories.itunes.parameters.LookUpParameters;
import com.codingstories.itunes.parameters.SearchParameters;
import com.codingstories.itunes.result.SearchResults;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import static com.codingstories.itunes.ParametersStringBuilder.buildLookUpStringParams;
import static com.codingstories.itunes.ParametersStringBuilder.buildSearchStringParams;

/**
 * @author szagriichuk
 */
public class SearchApi {
    //    TODO: query string as configurable
    private static final String searchUrl = "https://itunes.apple.com/search?";
    private static final String lookupUrl = "https://itunes.apple.com/lookup?";
    private static final Logger logger = Logger.getLogger(SearchApi.class.getName());

    public static SearchResults search(SearchParameters params) {
        URL url;
        url = createUrl(searchUrl, buildSearchStringParams(params));
        HttpURLConnection connection = openConnection(url);
        return parseResponseData(readResponse(connection));
    }

    public static SearchResults lookup(LookUpParameters params) {
        URL url = createUrl(lookupUrl, buildLookUpStringParams(params));
        HttpURLConnection connection = openConnection(url);
        return parseResponseData(readResponse(connection));
    }

    private static HttpURLConnection openConnection(URL url) {
        HttpURLConnection connection;
        try {
            connection = (HttpURLConnection) url.openConnection();
        } catch (IOException e) {
            logger.log(Level.ALL, e.getMessage(), e);
            throw new iTunesSearchApiException(e.getMessage());
        }
        return connection;
    }

    private static SearchResults parseResponseData(String data) {
        Gson gson = new Gson();
        return gson.fromJson(data, SearchResults.class);
    }

    private static String readResponse(HttpURLConnection connection) {
        return readDataFromResponseStream(createResponseReader(connection));
    }

    private static String readDataFromResponseStream(BufferedReader responseReader) {
        StringBuilder builder = new StringBuilder();
        String line;
        try {
            while ((line = responseReader.readLine()) != null) {
                builder.append(line);
            }
            responseReader.close();
        } catch (IOException e) {
            logger.log(Level.ALL, e.getMessage(), e);
            throw new iTunesSearchApiException(e.getMessage());
        }
        return builder.toString();
    }

    private static BufferedReader createResponseReader(HttpURLConnection connection) {
        BufferedReader in;
        try {
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
        } catch (IOException e) {
            logger.log(Level.ALL, e.getMessage(), e);
            throw new iTunesSearchApiException(e.getMessage());
        }
        return in;
    }

    private static URL createUrl(String mainUrl, String stringParams) {
        URL url;
        try {
            url = new URL(mainUrl + stringParams);
        } catch (MalformedURLException e) {
            logger.log(Level.ALL, e.getMessage(), e);
            throw new iTunesSearchApiException(e.getMessage());
        }
        return url;
    }
}
