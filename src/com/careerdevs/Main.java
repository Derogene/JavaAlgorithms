package com.careerdevs;

public class Main {

    public static void main(String[] args) {
        public class Solution {
            public static void main(String[] args) {
                // Create a Scanner object to read input from stdin.
                Scanner scan = new Scanner(System.in);

                // Read a full line of input from stdin and save it to our variable, inputString.
                String inputString = scan.nextLine();

                // Close the scanner object, because we've finished reading
                // all of the input from stdin needed for this challenge.
                scan.close();

                // Print a string literal saying "Hello, World." to stdout.
                System.out.println("Hello, World.");

                // TODO: Write a line of code here that prints the contents of inputString to stdout.
                System.out.println(inputString);
            }
        }
    }

    // Create a function that takes two number strings and returns their sum as a string.
    // Warmup 4/11/22

    public class NumericString {
        public static String add(String a, String b) {
            if (a == null || b == null || a.equals("") || b.equals("")) {
                return "Invalid Operation"}
            int c = Integer.parseInt(a);
            int d = Integer.parseInt(b);

            int sum = c + d;
            return String.valueOf(sum);

        }
    }

    public class NumericString {
        public static String add(String a, String b) {
            try {
                int c = Integer.parseInt(a);
                int d = Integer.parseInt(b);

                int sum = c + d;
                return String.valueOf(sum);
            } catch (Exception e) {
                return "Invalid Operation";
            }
        }
    }


    // Create a function that takes an array and returns the sum of all numbers in the array.
    // HW: 4/11/22

    public class Program {
        public static int arraySum(int[] arr) {
            int sum = 0;

            for (int i = 0; i < arr.length; i++) { //.size for array lists
                sum += arr[i];
            }
            return sum;
        }
    }

    // Write a function that takes the base and height of a triangle and return its area.
    // Warmup 4/12/22


    public class Challenge {
        public static int triArea(int base, int height) {
            int area = (base * height) / 2;
            return area;
        }
    }



}
