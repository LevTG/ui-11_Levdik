package PositiveUnitTests;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static main.MatrixSort.matrixSort;
import static org.junit.Assert.assertTrue;

public class oneLineMatrix_test {
    ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
    ArrayList<ArrayList<Integer>> sort_matrix = new ArrayList<ArrayList<Integer>>();
    @Before
    public void init(){
        ArrayList<Integer> elem = new ArrayList<Integer>();
        elem.add(2);
        elem.add(3);
        elem.add(4);

        matrix.add(elem);
        sort_matrix.add(elem);
    }
    @Test
    public void checkingOneElement(){
        matrixSort(matrix);
        assertTrue(sort_matrix.equals(matrix));
    }
}
