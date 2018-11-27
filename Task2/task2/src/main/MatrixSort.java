package main;

import java.util.ArrayList;
import java.util.Scanner;

public class MatrixSort {
    public static int rowSum(ArrayList<Integer> row){
        int sum = 0;

        for (int num : row)
            sum += num;
        return sum;
    }

    public static ArrayList<ArrayList<Integer>> readMatrix(){
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();

        Scanner in = new Scanner(System.in);
        in.useDelimiter("\n");

        while (in.hasNextLine()){
            String line = in.nextLine();
            if(line.equals(""))
                break;
            String lineArr[] = line.split(" ");
            ArrayList<Integer> row = new ArrayList(lineArr.length);
            for (int i = 0; i < lineArr.length; i++){
                row.add(Integer.parseInt(lineArr[i]));
            }
            matrix.add(row);
        }
        in.close();
        return matrix;
    }

    public static void matrixSort(ArrayList<ArrayList<Integer>> arr){
        for(int i = arr.size()-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            if( rowSum(arr.get(j)) < rowSum(arr.get(j + 1))){
                ArrayList<Integer> tmp = arr.get(j);
                arr.set(j, arr.get(j + 1));
                arr.set(j + 1, tmp);
            }
        }
    }
}

    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> matrix = readMatrix();
        matrixSort(matrix);
        for(ArrayList<Integer> row : matrix){
            for(Integer elem : row){
                System.out.print(elem + " ");
            }
            System.out.println();
        }

    }
}
