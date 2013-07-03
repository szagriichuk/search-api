package com.codingstories.itunes.result;

/**
 * @author Sergii.Zagriichuk
 */
public class SearchResult {
    private String wrapperType;
    private String explicitness;
    private String kind;
    private String trackName;
    private String artistName;
    private String collectionName;
    private String censoredName;
    private String artistId;
    private String trackId;
    private String collectionId;

    public String getWrapperType() {
        return wrapperType;
    }

    public void setWrapperType(String wrapperType) {
        this.wrapperType = wrapperType;
    }

    public String getExplicitness() {
        return explicitness;
    }

    public void setExplicitness(String explicitness) {
        this.explicitness = explicitness;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public String getCensoredName() {
        return censoredName;
    }

    public void setCensoredName(String censoredName) {
        this.censoredName = censoredName;
    }

    public String getArtistId() {
        return artistId;
    }

    public void setArtistId(String artistId) {
        this.artistId = artistId;
    }

    public String getTrackId() {
        return trackId;
    }

    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }

    public String getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SearchResult that = (SearchResult) o;

        if (artistId != null ? !artistId.equals(that.artistId) : that.artistId != null) return false;
        if (artistName != null ? !artistName.equals(that.artistName) : that.artistName != null) return false;
        if (censoredName != null ? !censoredName.equals(that.censoredName) : that.censoredName != null) return false;
        if (collectionId != null ? !collectionId.equals(that.collectionId) : that.collectionId != null) return false;
        if (collectionName != null ? !collectionName.equals(that.collectionName) : that.collectionName != null)
            return false;
        if (explicitness != null ? !explicitness.equals(that.explicitness) : that.explicitness != null) return false;
        if (kind != null ? !kind.equals(that.kind) : that.kind != null) return false;
        if (trackId != null ? !trackId.equals(that.trackId) : that.trackId != null) return false;
        if (trackName != null ? !trackName.equals(that.trackName) : that.trackName != null) return false;
        if (wrapperType != null ? !wrapperType.equals(that.wrapperType) : that.wrapperType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = wrapperType != null ? wrapperType.hashCode() : 0;
        result = 31 * result + (explicitness != null ? explicitness.hashCode() : 0);
        result = 31 * result + (kind != null ? kind.hashCode() : 0);
        result = 31 * result + (trackName != null ? trackName.hashCode() : 0);
        result = 31 * result + (artistName != null ? artistName.hashCode() : 0);
        result = 31 * result + (collectionName != null ? collectionName.hashCode() : 0);
        result = 31 * result + (censoredName != null ? censoredName.hashCode() : 0);
        result = 31 * result + (artistId != null ? artistId.hashCode() : 0);
        result = 31 * result + (trackId != null ? trackId.hashCode() : 0);
        result = 31 * result + (collectionId != null ? collectionId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SearchResult{" +
                "wrapperType='" + wrapperType + '\'' +
                ", explicitness='" + explicitness + '\'' +
                ", kind='" + kind + '\'' +
                ", trackName='" + trackName + '\'' +
                ", artistName='" + artistName + '\'' +
                ", collectionName='" + collectionName + '\'' +
                ", censoredName='" + censoredName + '\'' +
                ", artistId='" + artistId + '\'' +
                ", trackId='" + trackId + '\'' +
                ", collectionId='" + collectionId + '\'' +
                '}';
    }
}
