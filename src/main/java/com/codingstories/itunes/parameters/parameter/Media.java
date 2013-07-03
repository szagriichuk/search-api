package com.codingstories.itunes.parameters.parameter;

/**
 * @author szagriichuk
 */
public enum Media implements Parameter {
    MOVIE("movie"), POD_CAST("podcast"), MUSIC("music"), MUSIC_VIDEO("musicVideo"), AUDIO_BOOK("audiobook"),
    SHORT_FILM("shortFilm"), TV_SHOW("tvShow"), SOFTWARE("software"), E_BOOK("ebook"), ALL("all");
    public final String value;

    private Media(String value) {
        this.value = value;
    }

    public String createSearchParameter() {
        return "media=" + value;
    }
}
