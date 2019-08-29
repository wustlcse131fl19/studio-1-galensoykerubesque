package studio1;

import support.cse131.ArgsProcessor;

public class Average {
     public static void main(String[] args) {
         ArgsProcessor ap = new ArgsProcessor(args);
         double n1 = ap.nextInt("What is the first integer?");
         double n2 = ap.nextInt("What is the second integer?");

         double numberAverage = (n1 + n2)/2;

         System.out.println(numberAverage + " is the average.");
    }
}
