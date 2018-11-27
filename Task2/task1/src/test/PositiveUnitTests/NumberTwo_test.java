package PositiveUnitTests;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import static org.junit.Assert.assertTrue;
import static main.PrimeNumbers.PrimeNumbersArray;

public class NumberTwo_test {
    int N = 2;
    ArrayList<Integer> test_list = null;

    @Before
    public void init() {
        test_list.add(2);
    }

    @Test
    public void checkingTwo() {
        assertTrue(test_list.equals(PrimeNumbersArray(N)));
    }
}
