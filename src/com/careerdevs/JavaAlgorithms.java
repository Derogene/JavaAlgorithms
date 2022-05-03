package com.careerdevs;

import java.util.Arrays;

public class JavaAlgorithms {


    //Create a function that takes an integer and outputs an n x n square solely consisting of the integer n.
    public class Challenge {
        public static int[][] squarePatch(int n) {

            // n will determine the number of sub-arrays
            ///n will determine the number of elements in each sub-array
            // n will determine the value of each element within each sub-array

            int numOfSubArr = n;
            int numOfSubArrElms = n;
            int valueOfElms = n;

            int[][] squareArray = new int[numOfSubArr][numOfSubArrElms];

            for (int i = 0; i < squareArray.length; i++) {
//                System.out.println(Arrays.toString(squareArray[i]));
                for (int j = 0; j < squareArray[i].length; j++) {

//                    System.out.println(squareArray[i][j]);
                    squareArray[i][j] = valueOfElms;

                }
            }

//            System.out.println("\n\n" + Arrays.toString(squareArray));
            return squareArray;
        }


        public static void main(String[] args) {

            int num = 3;

            int[][] square = squarePatch(num);

            System.out.println(Arrays.deepToString((square)));

        }
    }

//        public class Solution {
//            public static void main(String[] args) {
//                // Create a Scanner object to read input from stdin.
//                Scanner scan = new Scanner(System.in);
//
//                // Read a full line of input from stdin and save it to our variable, inputString.
//                String inputString = scan.nextLine();
//
//                // Close the scanner object, because we've finished reading
//                // all of the input from stdin needed for this challenge.
//                scan.close();
//
//                // Print a string literal saying "Hello, World." to stdout.
//                System.out.println("Hello, World.");
//
//                // TODO: Write a line of code here that prints the contents of inputString to stdout.
//                System.out.println(inputString);
//            }
//        }
//    }
//
//    // Create a function that takes two number strings and returns their sum as a string.
//    // Warmup 4/11/22
//
//    public class NumericString {
//        public static String add(String a, String b) {
//            if (a == null || b == null || a.equals("") || b.equals("")) {
//                return "Invalid Operation"}
//            int c = Integer.parseInt(a);
//            int d = Integer.parseInt(b);
//
//            int sum = c + d;
//            return String.valueOf(sum);
//
//        }
//    }
//
//    public class NumericString {
//        public static String add(String a, String b) {
//            try {
//                int c = Integer.parseInt(a);
//                int d = Integer.parseInt(b);
//
//                int sum = c + d;
//                return String.valueOf(sum);
//            } catch (Exception e) {
//                return "Invalid Operation";
//            }
//        }
//    }
//
//
//    // Create a function that takes an array and returns the sum of all numbers in the array.
//    // HW: 4/11/22
//
//    public class Program {
//        public static int arraySum(int[] arr) {
//            int sum = 0;
//
//            for (int i = 0; i < arr.length; i++) { //.size for array lists
//                sum += arr[i];
//            }
//            return sum;
//        }
//    }
//
//    // Write a function that takes the base and height of a triangle and return its area.
//    // Warmup 4/12/22
//
//
//    public class Challenge {
//        public static int triArea(int base, int height) {
//            int area = (base * height) / 2;
//            return area;
//        }
//    }
//
//    // Write a function that returns true if all integers in an array are factors of a number, and false otherwise.
//    // Bonus 4/11/22

    public class ExistsANumberHigher {
        public static boolean existsHigher(int[] arr, int n) {
            boolean isHigher = false;
            for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= n) return true;
            }
            return isHigher;
        }
    }

    // Create a function that takes an array and returns the difference between the biggest and smallest numbers.
    // Warmup 4/25/22

    public class Challenge {
        public static int differenceMaxMin(int[] arr) {
            int max = arr[0];
            int min = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= max) {
                    max = arr[i];
                }
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] <= min) {
                    min = arr[j];
                }
            }
            return max - min;
        }
    }

    // Create a method that takes a string as its argument and returns the string in reversed order.
    // Warmup 4/26/22

    //    You hired three programmers and you (hopefully) pay them. Create a function that takes three numbers (the hourly wages of each programmer) and returns the difference between the highest-paid programmer and the lowest-paid.
    //Warmup 4/28/22

    // A word has been split into a left part and a right part. Re-form the word by adding both halves together, changing the first character to an uppercase letter.
    //Warmup Bonus 4/28/22



    // Andy, Ben and Charlotte are playing a board game. The three of them decided to come up with a new scoring system. A player's first initial ("A", "B" or "C") denotes that player scoring a single point. Given a string of capital letters, return an array of the players' scores.
    //For instance, if ABBACCCCAC is written when the game is over, then Andy scored 3 points, Ben scored 2 points, and Charlotte scored 5 points, since there are 3 instances of letter A, 2 instances of letter B, and 5 instances of letter C. So the array [3, 2, 5] should be returned
    //Warmup 5/2/22
    public class Challenge {
        public static int[] calculateScores(String str) {
            int a = 0;
            int b = 0;
            int c = 0;

            for (int i = 0; i < str.length(); i++){
                if (str.charAt(i) == 'A') {
                    a++;
                } else if (str.charAt(i) == 'B') {
                    b++;
                } else if (str.charAt(i) == 'C') {
                    c++;
                }
            }
            return new int[]{a, b, c};
        }
    }
}
