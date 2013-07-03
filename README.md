iTunes Search API for Java. (http://www.apple.com/itunes/affiliates/resources/documentation/itunes-store-web-service-search-api.html)

How to use it:
First step is creating search or look up parameters.
 For instance you want to find all tracks of Johnnie Johnson (http://en.wikipedia.org/wiki/Johnnie_Johnson_(musician))

    private SearchParameters createParams() {
        SearchParameters searchParams = new SearchParameters();
        searchParams.addQueryTerm("Johnnie");
        searchParams.addQueryTerm("Johnson");
        searchParams.setMedia(Media.MUSIC);
        return searchParams;
    }

And after it juts call SearchApi.search(createParams()) method.
Result will be first 50 (default limit, you can configure it changing searchParams.setLimit(new Limit(200));) records
from iTunes search API bound to SearchResults object.


