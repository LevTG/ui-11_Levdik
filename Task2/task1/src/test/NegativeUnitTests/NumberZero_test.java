package NegativeUnitTests;

import java.util.ArrayList;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertTrue;
import static main.PrimeNumbers.PrimeNumbersArray;

public class NumberZero_test {

    int N = 0;
    ArrayList<Integer> test_list = new ArrayList<>();

    @Test
    public void chekingZero() {
        assertTrue(test_list.equals(PrimeNumbersArray(N)));
    }
}
