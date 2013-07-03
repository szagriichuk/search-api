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
        SearchResults data = SearchApi.search(createParams());
        logger.info(data.toString());
        Assert.assertNotNull(data);
    }

    private SearchParameters createParams() {
        SearchParameters searchParams = new SearchParameters();
        searchParams.addQueryTerm("jack");
        searchParams.addQueryTerm("johnson");
        searchParams.setMedia(Media.MUSIC);
        searchParams.setLimit(new Limit(200));
        return searchParams;
    }
}
