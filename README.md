iTunes Search API for Java. (http://www.apple.com/itunes/affiliates/resources/documentation/itunes-store-web-service-search-api.html)

How to use it:

Firstly you need to create search or look up parameters. For instance for finding all tracks of Johnnie Johnson (http://en.wikipedia.org/wiki/Johnnie_Johnson_(musician)) 
create next search parameters:

```java
    private SearchParameters createParams() {
        SearchParameters searchParams = new SearchParameters();
        searchParams.addQueryTerm("Johnnie");
        searchParams.addQueryTerm("Johnson");
        searchParams.setMedia(Media.MUSIC);
        return searchParams;
    }
```
And after it juts call ``` SearchApi.search(createParams())``` method.
Result will be first 50 (default limit, you can configure it changing ``` searchParams.setLimit(new Limit(200));)``` records
from iTunes search API bound to ``` SearchResults``` object.


