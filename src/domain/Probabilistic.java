/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author XPC
 */
public class Probabilistic {
    
    public double birthdayParadox(int n){
      int people = n;
      String result= "";
      final int trials = 10_000_000;
      int birthdayMatches = 0;

      // Monte Carlo simulation
      for (int i = 0; i < trials; i++) {
         if (sampleHasMatch(people)) {
            birthdayMatches++;
         }
      }

      double prob = (double) birthdayMatches / trials * 100;

      
       System.out.printf("Sample size: %d %n", people);
       System.out.printf("Number of trials: %,d %n", trials);
       System.out.printf("Probability of a match: %.2f%% %n", prob);
        return (double) prob;
   }

   private static boolean sampleHasMatch(int sampleSize) {
      final int daysInYear = 365;
      boolean[] days = new boolean[daysInYear];
      for (int i = 0; i < sampleSize; i++) {
         
         
         int j = ThreadLocalRandom.current().nextInt(days.length); 

         
         if (days[j]) { 
            return true;
         }

         days[j] = true;
      }
      return false;
   }
}
