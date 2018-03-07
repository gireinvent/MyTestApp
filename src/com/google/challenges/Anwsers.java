package com.google.challenges;
import java.util.ArrayList;
import java.util.Arrays;

public class Anwsers {


    public static  ArrayList<Integer> anwser(ArrayList x, ArrayList y)
    {
        ArrayList<Integer> z = new ArrayList<Integer>();

        if(x.size() > y.size())
        {
            x.removeAll(y);

            //System.out.println(x);
            return x;
        }
        else
        {
            y.removeAll(x);
            //System.out.println(y);
            return y;
        }
        /*for(int i=0; i < x.size(); i++)
        {
            for(int j =0; j < y.size(); j++)
               if(x.get(i).equals(y.get(j)))
               {

               }
               else {
                   z.add(<Integer>x.get(i));
               }
        }
        x.removeAll(y);*/

        //return 1;
    }

}
