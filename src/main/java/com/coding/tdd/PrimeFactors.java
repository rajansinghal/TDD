package com.coding.tdd;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rsinghal on 1/6/2018.
 */
public class PrimeFactors {
    public static List<Integer> of(int i) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        if(i > 1){
            while(i%2 == 0){

                factors.add(2);
                i /= 2;
            }

        }
        if(i > 1){
            factors.add(i);
        }
        return  factors;
    }
}
