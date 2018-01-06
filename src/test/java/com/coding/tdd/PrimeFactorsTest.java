package com.coding.tdd;

import org.junit.Test;

import java.util.Arrays;

import static com.coding.tdd.PrimeFactors.*;
import static java.util.Arrays.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by rsinghal on 1/6/2018.
 */
public class PrimeFactorsTest {
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }


    @Test
    public  void  shouldReturnPrimeFactors() {
        assertEquals(asList(), of(1));
    }
}