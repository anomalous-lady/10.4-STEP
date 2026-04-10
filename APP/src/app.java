package com.train;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {

    public static void main(String[] args) {

        // =========================
        // UC1
        // =========================
        System.out.println("=== Train Consist Management App ===");

        List<String> trainConsist = new ArrayList<>();
        System.out.println("Train consist initialized.");
        System.out.println("Initial bogie count: " + trainConsist.size());

        // =========================
        // UC2
        // =========================
        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("\nPassenger Bogies after addition:");
        System.out.println(passengerBogies);

        passengerBogies.remove("AC Chair");

        System.out.println("\nPassenger Bogies after removal:");
        System.out.println(passengerBogies);

        boolean isSleeperPresent = passengerBogies.contains("Sleeper");
        System.out.println("\nIs Sleeper present? " + isSleeperPresent);

        System.out.println("\nFinal Passenger Bogies List:");
        System.out.println(passengerBogies);

        // =========================
        // UC3 STARTS HERE
        // =========================

        // Create HashSet for unique bogie IDs
        Set<String> bogieIds = new HashSet<>();

        // Add bogie IDs (including duplicates intentionally)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        // Display unique bogie IDs
        System.out.println("\nUnique Bogie IDs:");
        System.out.println(bogieIds);

        // Program continues...
    }
}