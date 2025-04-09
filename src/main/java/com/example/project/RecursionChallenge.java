    package com.example.project;

    public class RecursionChallenge {

            public static int bunnyEars(int n){
                if (n == 1) {
                    return 2;
                }
                return bunnyEars(n - 1) + 2;
            }
        
            public static int factorial(int n){
                if (n == 1) {
                    return 1;
                }
                return n * factorial(n - 1);
            }

            public static int sumNumbers(int n){
                if (n == 1) {
                    return 1;
                }
                return n + sumNumbers(n - 1);
            }

            public static String countDown(int n){
                if (n == 0) {
                    return "Blast Off!";
                }
                return n + "," + countDown(n - 1);
            }

            public static int power(int x, int n){
                if (n == 1) {
                    return x;
                } else if (n == 0) {
                    return 1;
                }
                return x * power(x, n - 1);
            }

            public static int fib(int n){
                if (n < 2) {
                    return n;
                }
                int minusOne = fib(n - 1);
                int minusTwo = fib(n - 2);
                return minusOne + minusTwo;
            }

            public static int countX(String s){
                if (s.length() == 1) {
                    if (s.equals("x")) {
                        return 1;
                    } else {
                        return 0;
                    }
                } else if (s.length() < 1) {
                    return 0;
                }
                int midPoint = (s.length()) / 2;
                String firstHalf = s.substring(0, midPoint);
                String secondHalf = s.substring(midPoint);
                return countX(firstHalf) + countX(secondHalf);
            }

            public static String changePi(String s){
                if (s.indexOf("pi") == -1) {
                    return s;
                }
                if (s.startsWith("pi")) {
                    return "3.14" + changePi(s.substring(2));
                } else {
                    return s.substring(0, 1) + changePi(s.substring(1));
                }
            }


            public static String reverse(String s){
                if (s.length() == 1) {
                    return s;
                }
                if (s.length() < 1) {
                    return "";
                }
                int midPoint = s.length() / 2;
                return reverse(s.substring(midPoint)) + reverse(s.substring(0, midPoint));
            }

            public static Boolean isPalindrome(String s){
                if (s.length() > 1) {
                    if (s.substring(0, 1).equals(s.substring(s.length() - 1))) {
                        return isPalindrome(s.substring(1, s.length() - 1));
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            }


            public static void main(String[] args) {
                System.out.println(RecursionChallenge.countX(""));
            }
    }