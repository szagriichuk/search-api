package com.codingstories.itunes.result.validation;

/**
 * @author Sergii.Zagriichuk
 */
public enum WrapperType {
    TRACK("track"), COLLECTION("collection"), ARTIST("artist");
    public String value;

    private WrapperType(String value) {
        this.value = value;
    }
}
