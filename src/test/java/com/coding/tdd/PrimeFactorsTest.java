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
        assertEquals(asList(2), of(2));
        assertEquals(asList(3), of(3));
        assertEquals(asList(2,2), of(4));
        assertEquals(asList(5), of(5));
        assertEquals(asList(2,3), of(6));
        assertEquals(asList(7), of(7));
        assertEquals(asList(2,2,2), of(8));
        assertEquals(asList(3,3), of(9));
    }
}