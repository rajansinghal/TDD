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

        while(i > 1){
            while(i%divisior == 0){
                factors.add(divisior);
                i /= divisior;
            }
            divisior ++;
        }
       /* if(i > 1){
            factors.add(i);
        }*/
        return  factors;
    }
}
