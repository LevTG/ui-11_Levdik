package NegativeUnitTests;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static main.MatrixSort.matrixSort;
import static org.junit.Assert.assertTrue;

public class emptyMatrix_test {
    ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
    ArrayList<ArrayList<Integer>> orig_matrix = new ArrayList<ArrayList<Integer>>();

    @Test
    public void checkingOneElement(){
        matrixSort(matrix);
        assertTrue(orig_matrix.equals(matrix));
    }
}
