package com.codingstories.itunes;

import com.codingstories.itunes.parameters.LookUpParameters;
import com.codingstories.itunes.parameters.SearchParameters;
import com.codingstories.itunes.parameters.parameter.Term;

import java.util.List;

/**
 * @author szagriichuk
 */
class ParametersStringBuilder {
    public static String buildLookUpStringParams(LookUpParameters params) {
        throw new UnsupportedOperationException("The lookup method is not yet implemented.");
    }

    public static String buildSearchStringParams(SearchParameters params) {
        StringBuilder resultQuery = new StringBuilder();
        buildTerms(params.getTerms(), resultQuery);
        resultQuery.append(params.getCountry().createSearchParameter()).append("&");
        resultQuery.append(params.getMedia().createSearchParameter()).append("&");
        //TODO: implement entities
        if (params.getEntity() != null) {
            resultQuery.append(params.getEntity().createSearchParameter()).append("&");
        }
        //TODO: implement attribute
        if (params.getAttribute() != null) {
            resultQuery.append(params.getAttribute().createSearchParameter()).append("&");
        }

        resultQuery.append(params.getLimit().createSearchParameter()).append("&");
        resultQuery.append(params.getLang().createSearchParameter());
        return resultQuery.toString();
    }

    private static void buildTerms(List<String> terms, StringBuilder resultQuery) {
        if (terms != null) {
            resultQuery.append(new Term(terms).createSearchParameter()).append("&");
        } else {
            throw new iTunesSearchApiException("Terms are mandatory for search, please specify and try again.");
        }
    }
}
