package com.codingstories.itunes;

import com.codingstories.itunes.parameters.SearchParameters;
import com.codingstories.itunes.parameters.parameter.Limit;
import com.codingstories.itunes.parameters.parameter.Media;
import com.codingstories.itunes.result.SearchResults;
import junit.framework.Assert;
import org.junit.Test;

import java.util.logging.Logger;

/**
 * @author szagriichuk
 */
public class SearchApiTest {
    private static Logger logger = Logger.getGlobal();

    @Test
    public void testSearch() throws Exception {
        SearchResults data = SearchApi.search(createParams("jack", "johnson"));
        logger.info(data.toString());
        Assert.assertNotNull(data);
    }

    @Test
    public void testSearchAlbum() throws Exception {
        SearchResults data = SearchApi.search(createParams("jack", "johnson", "Sing-a-Longs and Lullabies for the " +
                "Film Curious George"));
        logger.info(data.toString());
        Assert.assertNotNull(data);
        Assert.assertNotNull(data.getResults().get(0).getReleaseDate() != null);
    }

    private SearchParameters createParams(String... terms) {
        SearchParameters searchParams = new SearchParameters();
        for (String term : terms) {
            searchParams.addQueryTerm(term);
        }
        searchParams.setMedia(Media.MUSIC);
        searchParams.setLimit(new Limit(200));
        return searchParams;
    }
}
