package com.codingstories.itunes.parameters.parameter;

/**
 * @author szagriichuk
 */
public enum Lang implements Parameter {
    ENGLISH("en_us"), JAPAN("ja_jp");
    public final String value;

    private Lang(String value) {
        this.value = value;
    }

    public String createSearchParameter() {
        return "lang=" + value;
    }
}
