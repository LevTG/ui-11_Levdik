package main;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbers {

    public static ArrayList<Integer> PrimeNumbersArray(int N){

        ArrayList<Integer> list = new ArrayList();

        int i = 2;
        while(i <= N)
        {
            if (isPrime(i))
                list.add(i);

            i++;
        }

        return list;
    }

    public static boolean isPrime(int num){
        int i = 2;
        while(i*i <= num){
            if (num%i == 0)
                return false;
            i++;
        }
        return true;
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        ArrayList<Integer> list = PrimeNumbersArray(N);
        ArrayList<Integer> list_1 = new ArrayList<>();
        for (int i : list)
            System.out.print(i + " ");
        list_1.equals(list);
    }
}
