package com.codingstories.itunes.parameters.parameter;

import com.codingstories.itunes.utils.UrlUtils;

import java.util.List;

/**
 * @author szagriichuk
 */
public class Term implements Parameter {
    private final static String predicate = "term=";
    private List<String> queryValues;

    public Term(List<String> queryValues) {
        this.queryValues = queryValues;
    }

    private String makeQueryString(List<String> queryValues) {
        final StringBuilder stringBuilder = new StringBuilder();
        for (String queryValue : queryValues) {
            stringBuilder.append(queryValue).append(" ");
        }
        return stringBuilder.toString();
    }

    @Override
    public String createSearchParameter() {
        String query = makeQueryString(queryValues);
        query = UrlUtils.encodeUrl(query);
        return predicate + query;
    }
}
