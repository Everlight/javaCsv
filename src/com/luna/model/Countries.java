/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luna.model;

/**
 *
 * @author Jocelyn
 */
public class Countries {

    private String countryId;
    private String code;
    private String name;
    private String continent;
    private String wikipedia_link;
    private String keywords;

    public Countries(String id, String code, String name, String cont, String wiki, String keyw) {
        this.countryId = id;
        this.code = code;
        this.name = name;
        this.continent = cont;
        this.wikipedia_link = wiki;
        this.keywords = keyw;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getWikipedia_link() {
        return wikipedia_link;
    }

    public void setWikipedia_link(String wikipedia_link) {
        this.wikipedia_link = wikipedia_link;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

}
