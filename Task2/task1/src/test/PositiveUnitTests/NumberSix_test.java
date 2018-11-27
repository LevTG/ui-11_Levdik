package PositiveUnitTests;

import org.junit.Test;

import java.util.ArrayList;

import static java.util.Arrays.asList;
import static main.PrimeNumbers.PrimeNumbersArray;
import static org.junit.Assert.assertTrue;

public class NumberSix_test {

    int N = 6;
    ArrayList<Integer> test_list = new ArrayList<>(asList(2, 3, 5));

    @Test
    public void checkingSix() {
        assertTrue(test_list.equals(PrimeNumbersArray(N)));
    }
}
