package com.google.challenges;
import java.util.ArrayList;
import java.util.Arrays;

public class ExecuteAnwsers {
    public static void main(String[] args)
    {

        ArrayList<Integer> x = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        ArrayList<Integer> y = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 7, 6,5, 20));

        Anwsers ans = new Anwsers();

        System.out.println(ans.anwser(x,y));


    }
}
