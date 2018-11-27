package PositiveUnitTests;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static main.MatrixSort.matrixSort;
import static org.junit.Assert.assertTrue;

public class matrix2x3_test {
    ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
    ArrayList<ArrayList<Integer>> sort_matrix = new ArrayList<ArrayList<Integer>>();
    @Before
    public void init(){
        ArrayList<Integer> elem = new ArrayList<Integer>();
        elem.add(2);
        elem.add(3);
        elem.add(4);

        ArrayList<Integer> elem_ = new ArrayList<Integer>();
        elem_.add(0);
        elem_.add(0);
        elem_.add(0);

        matrix.add(elem_);
        matrix.add(elem);
        sort_matrix.add(elem);
        sort_matrix.add(elem_);
    }
    @Test
    public void checkingOneElement(){
        matrixSort(matrix);
        assertTrue(sort_matrix.equals(matrix));
    }
}
