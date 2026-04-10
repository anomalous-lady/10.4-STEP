package com.train;

import java.util.ArrayList;
import java.util.Arrays;
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

        System.out.println("\nPassenger Bogies:");
        System.out.println(passengerBogies);

        // =========================
        // UC3
        // =========================
        Set<String> bogieIdsSet = new HashSet<>();
        bogieIdsSet.add("BG101");
        bogieIdsSet.add("BG102");

        System.out.println("\nUnique Bogie IDs:");
        System.out.println(bogieIdsSet);

        // =========================
        // UC20 STARTS HERE
        // =========================

        // Try with empty array to test exception
        String[] bogieIds = {};   // change to non-empty to test normal flow

        String searchKey = "BG101";

        try {
            boolean found = binarySearchWithValidation(bogieIds, searchKey);

            if (found) {
                System.out.println("\nBogie ID " + searchKey + " found.");
            } else {
                System.out.println("\nBogie ID " + searchKey + " not found.");
            }

        } catch (IllegalStateException e) {
            System.out.println("\nError: " + e.getMessage());
        }

        // Program continues...
    }

    // Binary Search with validation
    public static boolean binarySearchWithValidation(String[] arr, String key) {

        // ✅ Fail-fast validation
        if (arr == null || arr.length == 0) {
            throw new IllegalStateException("Cannot perform search: Train has no bogies.");
        }

        // Ensure sorted
        Arrays.sort(arr);

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = arr[mid].compareTo(key);

            if (comparison == 0) {
                return true;
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
}