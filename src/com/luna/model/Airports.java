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
public class Airports {

    private String airportId;
    private String ident;
    private String type;
    private String name;
    private float latitude_deg;
    private float longitude_deg;
    private float elevation_ft;
    private String continent;
    private String iso_country;
    private String iso_region;
    private String municipality;
    private String scheduled_service;
    private String gps_code;
    private String iata_code;
    private String local_code;
    private String home_link;
    private String wikipedia_link;
    private String keywords;

    public Airports(String id, String iden, String type, String name, float lat, float lon, float ele, String cont, String coun, String reg, String mun, String sched, String gps, String iata, String local, String home, String wiki, String keyw) {
        this.airportId = id;
        this.ident = iden;
        this.type = type;
        this.name = name;
        this.latitude_deg = lat;
        this.longitude_deg = lon;
        this.elevation_ft = ele;
        this.continent = cont;
        this.iso_country = coun;
        this.iso_region = reg;
        this.municipality = mun;
        this.scheduled_service = sched;
        this.gps_code = gps;
        this.iata_code = iata;
        this.local_code = local;
        this.home_link = home;
        this.wikipedia_link = wiki;
        this.keywords = keyw;
    }

    public String getId() {
        return airportId;
    }

    public void setId(String id) {
        this.airportId = id;
    }

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getLatitude_deg() {
        return latitude_deg;
    }

    public void setLatitude_deg(float latitude_deg) {
        this.latitude_deg = latitude_deg;
    }

    public float getLongitude_deg() {
        return longitude_deg;
    }

    public void setLongitude_deg(float longitude_deg) {
        this.longitude_deg = longitude_deg;
    }

    public float getElevation_ft() {
        return elevation_ft;
    }

    public void setElevation_ft(float elevation_ft) {
        this.elevation_ft = elevation_ft;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getIso_country() {
        return iso_country;
    }

    public void setIso_country(String iso_country) {
        this.iso_country = iso_country;
    }

    public String getIso_region() {
        return iso_region;
    }

    public void setIso_region(String iso_region) {
        this.iso_region = iso_region;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public String getScheduled_service() {
        return scheduled_service;
    }

    public void setScheduled_service(String scheduled_service) {
        this.scheduled_service = scheduled_service;
    }

    public String getGps_code() {
        return gps_code;
    }

    public void setGps_code(String gps_code) {
        this.gps_code = gps_code;
    }

    public String getIata_code() {
        return iata_code;
    }

    public void setIata_code(String iata_code) {
        this.iata_code = iata_code;
    }

    public String getLocal_code() {
        return local_code;
    }

    public void setLocal_code(String local_code) {
        this.local_code = local_code;
    }

    public String getHome_link() {
        return home_link;
    }

    public void setHome_link(String home_link) {
        this.home_link = home_link;
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
