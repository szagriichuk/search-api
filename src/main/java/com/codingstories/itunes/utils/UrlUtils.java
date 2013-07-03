package com.codingstories.itunes.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author szagriichuk
 */
public final class UrlUtils {
    private final static Logger logger = Logger.getAnonymousLogger();

    private UrlUtils() {
    }

    public static String encodeUrl(String data) {
        try {
            return URLEncoder.encode(data, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            logger.log(Level.WARNING, e.getMessage(), e);
        }
        return data;
    }
}
