package com.codingstories.itunes.result;

import java.util.List;

/**
 * @author Sergii.Zagriichuk
 */
public class SearchResults {
    private int resultCount;
    private List<SearchResult> results;

    public int getResultCount() {
        return resultCount;
    }

    public void setResultCount(int resultCount) {
        this.resultCount = resultCount;
    }

    public List<SearchResult> getResults() {
        return results;
    }

    public void setResults(List<SearchResult> results) {
        this.results = results;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SearchResults that = (SearchResults) o;

        if (resultCount != that.resultCount) return false;
        if (results != null ? !results.equals(that.results) : that.results != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = resultCount;
        result = 31 * result + (results != null ? results.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SearchResults{" +
                "resultCount=" + resultCount +
                ", results=" + results +
                '}';
    }
}
