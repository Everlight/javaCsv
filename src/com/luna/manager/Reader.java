/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luna.manager;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.luna.model.Airports;
import com.luna.model.Countries;
import com.luna.model.Runways;
import com.opencsv.CSVReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jocelyn
 */
public class Reader {

    private static ArrayList<Airports> airportsLst;
    private static ArrayList<Runways> runwaysLst;

    public static void initializeAirports() {
        boolean firstLine = true; // ignore header

        CSVReader reader;
        String[] line;

        // airports
        try {
            reader = new CSVReader(new FileReader("data/airports.csv"));
            airportsLst = new ArrayList<>();
            firstLine = true;
            while ((line = reader.readNext()) != null) {
                if (line != null && !firstLine) {
                    if (line[4].isEmpty()) { // no latitude_deg
                        line[4] = "0";
                    }
                    if (line[5].isEmpty()) { // no longitude_deg
                        line[5] = "0";
                    }
                    if (line[6].isEmpty()) { // no elevation_ft
                        line[6] = "0";
                    }

                    Airports airport = new Airports(line[0], line[1], line[2], line[3], Float.parseFloat(line[4]), Float.parseFloat(line[5]), Float.parseFloat(line[6]), line[7], line[8], line[9], line[10], line[11], line[12], line[13], line[14], line[15], line[16], line[17]);
                    airportsLst.add(airport);
                }
                if (firstLine) {
                    firstLine = false;
                }
            }
        } catch (FileNotFoundException fnf) {
            System.out.println("Error: File airports.csv not found.");
            System.exit(0);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(0);
        }
    }

    public static void initializeRunways() {

        boolean firstLine = true; // ignore header

        CSVReader reader;
        String[] line;

        // runways
        try {
            reader = new CSVReader(new FileReader("data/runways.csv"));
            runwaysLst = new ArrayList<>();
            firstLine = true;
            while ((line = reader.readNext()) != null) {
                if (line != null && !firstLine) {
                    if (line[3].isEmpty()) { // no length_ft
                        line[3] = "0";
                    }
                    if (line[4].isEmpty()) { // no width_ft
                        line[4] = "0";
                    }
                    if (line[9].isEmpty()) { // no le_latitude_deg
                        line[9] = "0";
                    }
                    if (line[10].isEmpty()) { // no le_longitude_deg
                        line[10] = "0";
                    }
                    if (line[11].isEmpty()) { // no le_elevation_ft
                        line[11] = "0";
                    }
                    if (line[12].isEmpty()) { // no le_heading_degT
                        line[12] = "0";
                    }
                    if (line[13].isEmpty()) { // no le_displaced_threshold_ft
                        line[13] = "0";
                    }
                    if (line[15].isEmpty()) { // no he_latitude_deg
                        line[15] = "0";
                    }
                    if (line[16].isEmpty()) { // no he_longitude_deg
                        line[16] = "0";
                    }
                    if (line[17].isEmpty()) { // no he_elevation_ft
                        line[17] = "0";
                    }
                    if (line[18].isEmpty()) { // no he_heading_degT
                        line[18] = "0";
                    }
                    if (line[19].isEmpty()) { // no he_displaced_threshold_ft
                        line[19] = "0";
                    }

                    Runways runway = new Runways(line[0], line[1], line[2], Float.parseFloat(line[3]), Float.parseFloat(line[4]), line[5], line[6], line[7], line[8], Double.parseDouble(line[9]), Double.parseDouble(line[10]), Float.parseFloat(line[11]), Double.parseDouble(line[12]), Float.parseFloat(line[13]), line[14], Double.parseDouble(line[15]), Double.parseDouble(line[16]), Float.parseFloat(line[17]), Double.parseDouble(line[18]), Float.parseFloat(line[19]));
                    runwaysLst.add(runway);
                }
                if (firstLine) {
                    firstLine = false;
                }
            }
        } catch (FileNotFoundException fnf) {
            System.out.println("Error: File runways.csv not found.");
            System.exit(0);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(0);
        }
    }


    /*
     * 	Write information of country, airports and runways
     */
    public static void WriteInConsole(Countries CountryChoose) {
        long start = System.currentTimeMillis();
        int totalAirports = 0;
        int totalRunways = 0;

        System.out.println("Country name: " + CountryChoose.getName());
        System.out.println("\tDetails: " + CountryChoose.getCountryId() + ", " + CountryChoose.getCode() + ", " + CountryChoose.getContinent() + ", " + CountryChoose.getWikipedia_link() + ", " + CountryChoose.getKeywords());
        System.out.println("Airports:");
        for (int i = 0; i < airportsLst.size(); i++) {
            if (airportsLst.get(i).getIso_country().equalsIgnoreCase(CountryChoose.getCode())) {
                totalAirports++;
                System.out.println("\tAirport: " + airportsLst.get(i).getName());
                System.out.println("\tDetails: " + airportsLst.get(i).getId() + ", " + airportsLst.get(i).getIdent() + ", " + airportsLst.get(i).getType() + ", " + airportsLst.get(i).getIso_region() + ", " + airportsLst.get(i).getMunicipality() + ", " + airportsLst.get(i).getScheduled_service() + ", " + airportsLst.get(i).getHome_link());
                for (int j = 0; j < runwaysLst.size(); j++) {
                    if (runwaysLst.get(j).getAirport_ref().equalsIgnoreCase(airportsLst.get(i).getId())) {
                        totalRunways++;
                        System.out.println("\tRunway: " + runwaysLst.get(j).getRunwayId() + ", " + runwaysLst.get(j).getLength_ft() + ", " + runwaysLst.get(j).getWidth_ft() + ", " + runwaysLst.get(j).getSurface() + ", " + runwaysLst.get(j).getLighted() + ", " + runwaysLst.get(j).getClosed());
                    }
                }
                System.out.println();//go to the next line
            }
        }

        System.out.println("There are " + totalAirports + " Airports and " + totalRunways + " Runways in Country " + CountryChoose.getName() + ".");
        System.out.println("Congratulation, Search for Country " + CountryChoose.getName() + " took " + (System.currentTimeMillis() - start) / 1000 + " seconds");

        //archive to external log file :)
        FileOutputStream fis = null;
        try {
            File file = new File("log/console.log");
            fis = new FileOutputStream(file);
            PrintStream out = new PrintStream(fis);
            System.setOut(out);
            System.out.println("Country name: " + CountryChoose.getName());
            System.out.println("\tDetails: " + CountryChoose.getCountryId() + ", " + CountryChoose.getCode() + ", " + CountryChoose.getContinent() + ", " + CountryChoose.getWikipedia_link() + ", " + CountryChoose.getKeywords());
            System.out.println("Airports:");
            for (int i = 0; i < airportsLst.size(); i++) {
                if (airportsLst.get(i).getIso_country().equalsIgnoreCase(CountryChoose.getCode())) {
                    System.out.println("\tAirport: " + airportsLst.get(i).getName());
                    System.out.println("\tDetails: " + airportsLst.get(i).getId() + ", " + airportsLst.get(i).getIdent() + ", " + airportsLst.get(i).getType() + ", " + airportsLst.get(i).getIso_region() + ", " + airportsLst.get(i).getMunicipality() + ", " + airportsLst.get(i).getScheduled_service() + ", " + airportsLst.get(i).getHome_link());
                    for (int j = 0; j < runwaysLst.size(); j++) {
                        if (runwaysLst.get(j).getAirport_ref().equalsIgnoreCase(airportsLst.get(i).getId())) {
                            System.out.println("\tRunway: " + runwaysLst.get(j).getRunwayId() + ", " + runwaysLst.get(j).getLength_ft() + ", " + runwaysLst.get(j).getWidth_ft() + ", " + runwaysLst.get(j).getSurface() + ", " + runwaysLst.get(j).getLighted() + ", " + runwaysLst.get(j).getClosed());
                        }
                    }
                    System.out.println();//go to the next line
                }
            }

            System.out.println("There are " + totalAirports + " Airports and " + totalRunways + " Runways in Country " + CountryChoose.getName() + ".");
            System.out.println("Congratulation, search for Country " + CountryChoose.getName() + " took " + (System.currentTimeMillis() - start) / 1000 + " seconds.");

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Reader.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();

            } catch (IOException ex) {
                Logger.getLogger(Reader.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
