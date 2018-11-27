package NegativeUnitTests;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static main.MatrixSort.matrixSort;
import static org.junit.Assert.assertTrue;


public class oneElementMatrix_test {
    ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
    ArrayList<ArrayList<Integer>> orig_matrix = new ArrayList<ArrayList<Integer>>();
    @Before
    public void init(){
        ArrayList<Integer> elem = new ArrayList<Integer>();
        elem.add(2);
        matrix.add(elem);
        orig_matrix.add(elem);
    }
    @Test
    public void checkingOneElement(){
        matrixSort(matrix);
        assertTrue(orig_matrix.equals(matrix));
    }
}
