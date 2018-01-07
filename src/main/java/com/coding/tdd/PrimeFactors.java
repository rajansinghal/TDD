package com.coding.tdd;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rsinghal on 1/6/2018.
 */
public class PrimeFactors {
    public static List<Integer> of(int i) {
       ArrayList<Integer> factors = new ArrayList<Integer>();
       int divisior = 2;
       for(;i > 1; divisior++)
           for(;i%divisior == 0; i /= divisior)
               factors.add(divisior);
        return  factors;
    }
}
