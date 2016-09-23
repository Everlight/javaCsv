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
public class Runways {

    private String runwayId;
    private String airport_ref;
    private String airport_ident;
    private float length_ft;
    private float width_ft;
    private String surface;
    private String lighted;
    private String closed;
    private String le_ident;
    private double le_latitude_deg;
    private double le_longitude_deg;
    private float le_elevation_ft;
    private double le_heading_degT;
    private float le_displaced_threshold_ft;
    private String he_ident;
    private double he_latitude_deg;
    private double he_longitude_deg;
    private float he_elevation_ft;
    private double he_heading_degT;
    private float he_displaced_threshold_ft;

    public Runways(String id, String airport_ref, String airport_ident, float length_ft, float width_ft, String surface, String lighted, String closed, String le_ident, double le_latitude_deg, double le_longitude_deg, float le_elevation_ft, double le_heading_degT, float le_displaced_threshold_ft, String he_ident, double he_latitude_deg, double he_longitude_deg, float he_elevation_ft, double he_heading_degT, float he_displaced_threshold_ft) {
        this.runwayId = id;
        this.airport_ref = airport_ref;
        this.airport_ident = airport_ident;
        this.length_ft = length_ft;
        this.width_ft = width_ft;
        this.surface = surface;
        this.lighted = lighted;
        this.closed = closed;
        this.le_ident = le_ident;
        this.le_latitude_deg = le_latitude_deg;
        this.le_longitude_deg = le_latitude_deg;
        this.le_elevation_ft = le_elevation_ft;
        this.le_heading_degT = le_heading_degT;
        this.le_displaced_threshold_ft = le_displaced_threshold_ft;
        this.he_ident = he_ident;
        this.he_latitude_deg = he_latitude_deg;
        this.he_longitude_deg = he_longitude_deg;
        this.he_elevation_ft = he_elevation_ft;
        this.he_heading_degT = he_heading_degT;
        this.he_displaced_threshold_ft = he_displaced_threshold_ft;
    }

    public String getRunwayId() {
        return runwayId;
    }

    public void setRunwayId(String runwayId) {
        this.runwayId = runwayId;
    }

    public String getAirport_ref() {
        return airport_ref;
    }

    public void setAirport_ref(String airport_ref) {
        this.airport_ref = airport_ref;
    }

    public String getAirport_ident() {
        return airport_ident;
    }

    public void setAirport_ident(String airport_ident) {
        this.airport_ident = airport_ident;
    }

    public float getLength_ft() {
        return length_ft;
    }

    public void setLength_ft(float length_ft) {
        this.length_ft = length_ft;
    }

    public float getWidth_ft() {
        return width_ft;
    }

    public void setWidth_ft(float width_ft) {
        this.width_ft = width_ft;
    }

    public String getSurface() {
        return surface;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }

    public String getLighted() {
        return lighted;
    }

    public void setLighted(String lighted) {
        this.lighted = lighted;
    }

    public String getClosed() {
        return closed;
    }

    public void setClosed(String closed) {
        this.closed = closed;
    }

    public String getLe_ident() {
        return le_ident;
    }

    public void setLe_ident(String le_ident) {
        this.le_ident = le_ident;
    }

    public double getLe_latitude_deg() {
        return le_latitude_deg;
    }

    public void setLe_latitude_deg(double le_latitude_deg) {
        this.le_latitude_deg = le_latitude_deg;
    }

    public double getLe_longitude_deg() {
        return le_longitude_deg;
    }

    public void setLe_longitude_deg(double le_longitude_deg) {
        this.le_longitude_deg = le_longitude_deg;
    }

    public float getLe_elevation_ft() {
        return le_elevation_ft;
    }

    public void setLe_elevation_ft(float le_elevation_ft) {
        this.le_elevation_ft = le_elevation_ft;
    }

    public double getLe_heading_degT() {
        return le_heading_degT;
    }

    public void setLe_heading_degT(double le_heading_degT) {
        this.le_heading_degT = le_heading_degT;
    }

    public float getLe_displaced_threshold_ft() {
        return le_displaced_threshold_ft;
    }

    public void setLe_displaced_threshold_ft(float le_displaced_threshold_ft) {
        this.le_displaced_threshold_ft = le_displaced_threshold_ft;
    }

    public String getHe_ident() {
        return he_ident;
    }

    public void setHe_ident(String he_ident) {
        this.he_ident = he_ident;
    }

    public double getHe_latitude_deg() {
        return he_latitude_deg;
    }

    public void setHe_latitude_deg(double he_latitude_deg) {
        this.he_latitude_deg = he_latitude_deg;
    }

    public double getHe_longitude_deg() {
        return he_longitude_deg;
    }

    public void setHe_longitude_deg(double he_longitude_deg) {
        this.he_longitude_deg = he_longitude_deg;
    }

    public float getHe_elevation_ft() {
        return he_elevation_ft;
    }

    public void setHe_elevation_ft(float he_elevation_ft) {
        this.he_elevation_ft = he_elevation_ft;
    }

    public double getHe_heading_degT() {
        return he_heading_degT;
    }

    public void setHe_heading_degT(double he_heading_degT) {
        this.he_heading_degT = he_heading_degT;
    }

    public float getHe_displaced_threshold_ft() {
        return he_displaced_threshold_ft;
    }

    public void setHe_displaced_threshold_ft(float he_displaced_threshold_ft) {
        this.he_displaced_threshold_ft = he_displaced_threshold_ft;
    }

}
