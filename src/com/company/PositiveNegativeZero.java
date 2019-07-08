package com.company;

public class PositiveNegativeZero {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else if (number == 0) {
            System.out.println("zero");
        }
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet " + inches + " inches " + centimeters + " cm ");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches);
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

    public static String getDurationString(long minutes, long seconds) {
        if ((minutes < 0) || ((seconds < 0) || (seconds > 59))) {
            return "INVALID_VALUE_MESSAGE";
        }

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;

        String hoursString = hours + "h";
        if (hours < 10) {
            hoursString = "0" + hoursString;
        }

        String minutesString = remainingMinutes + "m";
        if (remainingMinutes < 10) {
            minutesString = "0" + minutesString;
        }

        String secondsString = hours + "s";
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }

        return hoursString + minutesString + secondsString;
    }

        public static String getDurationString ( long seconds){
            if (seconds < 0) {
                return "INVALID_VALUE_MESSAGE";
            }

            long minutes = seconds / 60;
            long remainingSeconds = seconds % 60;
            String x = getDurationString(minutes, remainingSeconds);
            return x;
        }

    }
