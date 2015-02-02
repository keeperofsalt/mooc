package ap2014.t1.lesson13;
/*
 * Lesson 13 Coding Activity 6 
 * We are going to redo the last coding activity from Lesson 12,
 * but this time it will also print out a message if the temperature is OK.
 * 
 * You are running an experiment that involves hatching chicken eggs.
 * Bird eggs are very sensitive to temperature and chickens' eggs will hatch between 99 and 102 degrees Fahrenheit.
 *
 * Write the code for the sensor that will be tracking the temperature. 
 * If the temperature falls below 99 or above 102 your code should print �WARNING� otherwise �Temperature is OK�.
 * The values 99 and 102 are considered to be included in the ok range and the input will be in doubles.
 *
 * 
 *     Sample Run 1
 *         What is the temperature?
 *         45.3
 *         WARNING
 *
 *         
 *      Sample Run 2
 *         What is the temperature?
 *         100    
 *         Temperature is OK
 * 
 */


import java.util.Scanner;

class Lesson_13_Activity_Six {
  public static void main(String[] args) {
    System.out.println("What is the temperature?");
    Scanner s = new Scanner(System.in);
    double temp = s.nextDouble();
    if (temp < 99.0 || temp > 102.0) {
      System.out.print("WARNING");
    } else {
      System.out.print("Temperature is OK");
    }
  }
}