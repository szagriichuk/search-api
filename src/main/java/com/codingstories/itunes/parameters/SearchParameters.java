package com.codingstories.itunes.parameters;

import com.codingstories.itunes.parameters.parameter.Country;
import com.codingstories.itunes.parameters.parameter.Lang;
import com.codingstories.itunes.parameters.parameter.Limit;
import com.codingstories.itunes.parameters.parameter.Media;
import com.codingstories.itunes.parameters.parameter.attributes.Attribute;
import com.codingstories.itunes.parameters.parameter.entities.Entity;

import java.util.ArrayList;
import java.util.List;

import static com.codingstories.itunes.parameters.DefaultParameters.*;

/**
 * @author szagriichuk
 */
public class SearchParameters implements Parameters {
    private List<String> terms = new ArrayList<>();
    private Country country = DEFAULT_COUNTRY;
    private Media media = DEFAULT_MEDIA;
    private Entity entity;
    private Attribute attribute;
    private Limit limit = DEFAULT_LIMIT;
    private Lang lang = DEFAULT_LANG;

    public void addQueryTerm(String queryTerm) {
        terms.add(queryTerm);
    }

    public List<String> getTerms() {
        return terms;
    }

    /**
     * Returns instance of {@link Country}. If {@code Country} was set uped to {@code null} will be returned
     * {@link DefaultParameters#DEFAULT_COUNTRY}
     */

    public Country getCountry() {
        return country == null ? DEFAULT_COUNTRY : country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    /**
     * Returns instance of {@link Media}. If {@code Media} was set uped to {@code null} will be returned
     * {@link DefaultParameters#DEFAULT_MEDIA}
     */
    public Media getMedia() {
        return media == null ? DEFAULT_MEDIA : media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    /**
     * Returns instance of {@link Lang}. If {@code Lang} was set uped to {@code null} will be returned
     * {@link DefaultParameters#DEFAULT_LANG}
     */
    public Lang getLang() {
        return lang == null ? DEFAULT_LANG : lang;
    }

    public void setLang(Lang lang) {
        this.lang = lang;
    }

    /**
     * Returns instance of {@link Limit}. If {@code Limit} was set uped to {@code null} will be returned
     * {@link DefaultParameters#DEFAULT_LIMIT}
     */

    public Limit getLimit() {
        return limit == null ? DEFAULT_LIMIT : limit;
    }

    public void setLimit(Limit limit) {
        this.limit = limit;
    }
}
