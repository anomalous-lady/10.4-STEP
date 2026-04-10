package com.train;

import java.util.Arrays;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Example input (unsorted intentionally)
        String[] bogieIds = {"BG309","BG101","BG550","BG205","BG412"};

        String searchKey = "BG205";

        boolean result = binarySearch(bogieIds, searchKey);

        if (result) {
            System.out.println("Bogie ID " + searchKey + " found.");
        } else {
            System.out.println("Bogie ID " + searchKey + " not found.");
        }
    }

    // ✅ Binary Search Method (TEST READY)
    public static boolean binarySearch(String[] arr, String key) {

        // Handle empty array
        if (arr == null || arr.length == 0) {
            return false;
        }

        // Sort array (handles unsorted input case)
        Arrays.sort(arr);

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2; // safer mid calculation

            int cmp = arr[mid].compareTo(key);

            if (cmp == 0) {
                return true;
            }
            else if (cmp < 0) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return false;
    }
}