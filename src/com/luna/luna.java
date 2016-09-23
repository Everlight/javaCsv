/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luna;

import com.luna.manager.Reader;
import com.luna.model.Countries;
import com.opencsv.CSVReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 *
 * @author Jocelyn
 */
public class luna {

    public static void main(String[] args) {
        initalizeLoggger();
        initializeCountries();
        Reader.initializeAirports(); // store csv files in memory // maybe find a better way to prevent long time at app opening
        Reader.initializeRunways();

        System.out.println("Please, enter country code / name (case-insensitive) :");
        System.out.println("Example : FR | US | CR / France | United States | Costa Rica...");

        String countryCode = null;
        String countryName = null;

        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.nextLine();
            if (input.length() == 2) { // country code
                countryCode = input;
            } else {
                countryName = input;
            }
        }

        Iterator<Countries> CountryIterator = countriesLst.iterator(); // Iterator for search
        Countries CheckCountry = null;
        boolean found = false;

        while (CountryIterator.hasNext()) {
            CheckCountry = CountryIterator.next();

            // Country exists if code or name given by the user are same as in the list.
            if (CheckCountry.getCode().equalsIgnoreCase(countryCode) || CheckCountry.getName().equalsIgnoreCase(countryName)) {
                found = true;
                break;
            }
        }

        if (!found) {
            // If the code is not found, the program will error out. 
            System.out.println("Country not found. Please restart Application.");
        } else {
            Reader.WriteInConsole(CheckCountry);
        }
    }

    private static ArrayList<Countries> countriesLst;

    public static void initializeCountries() {
        boolean firstLine = true; // ignore header

        CSVReader reader;
        String[] line;

        try {
            reader = new CSVReader(new FileReader("data/countries.csv"));
            countriesLst = new ArrayList<>();
            while ((line = reader.readNext()) != null) {
                if (line != null && !firstLine) {
                    Countries country = new Countries(line[0], line[1], line[2], line[3], line[4], line[5]);
                    countriesLst.add(country);
                }
                if (firstLine) {
                    firstLine = false;
                }
            }
        } catch (FileNotFoundException fnf) {
            System.out.println("Error: File countries.csv not found.");
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(0);
        }
    }

    /**
     * Function to store log from previous search
     */
    private static void initalizeLoggger() {
        new File("./log/backup/").mkdirs();
        File[] files = new File("log").listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".log");
            }
        });

        if (files != null && files.length > 0) {
            byte[] buf = new byte[1024];
            try {
                String outFilename = "./log/backup/" + new SimpleDateFormat("yyyy-MM-dd HHmmss").format(new Date()) + ".zip";
                ZipOutputStream out = new ZipOutputStream(new FileOutputStream(outFilename));
                out.setMethod(ZipOutputStream.DEFLATED);
                out.setLevel(Deflater.BEST_COMPRESSION);

                for (File logFile : files) {
                    FileInputStream in = new FileInputStream(logFile);
                    out.putNextEntry(new ZipEntry(logFile.getName()));
                    int len;
                    while ((len = in.read(buf)) > 0) {
                        out.write(buf, 0, len);
                    }
                    out.closeEntry();
                    in.close();
                    logFile.delete();
                }
                out.close();
            } catch (IOException e) {
            }
        }
    }
}
