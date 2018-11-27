package NegativeUnitTests;

import org.junit.Test;

import static main.PrimeNumbers.PrimeNumbersArray;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

public class NumberOne_test {
    int N = 1;
    ArrayList<Integer> test_list = new ArrayList<>();


    @Test
    public void checkingOne() {
        ArrayList<Integer> list = PrimeNumbersArray(N);
        assertTrue(test_list.equals(list));
    }

}
