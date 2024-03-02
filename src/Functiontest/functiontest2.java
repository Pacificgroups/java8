package Functiontest;

import java.util.ArrayList;
import java.util.*;
import java.util.function.Function;
//Write a lambda expression that doubles a given number.
//Write a method that takes a list of strings and returns a list of their lengths using a functional interface.
//Write a program that filters a list of integers and keeps only even numbers using a functional interface.
public class functiontest2 {


//
    public static void main(String[] args) {
        String str="my name is prashant ranjan";


        List<String> li= Arrays.asList("abc","hs","sgs");
        Function<List<String>,List<Integer>> a=(r)-> {
            List<Integer> ls=new ArrayList<>();

            for(String s:r){
                ls.add(s.length());
            }

            return ls;
        };


        System.out.println(a.apply(li));

        Integer num=22;

        Function<Integer,Integer> s=(b)-> b*2;
        System.out.println(s.apply(num));

       // Function<String,String> t=(a)-> a.replaceAll("a"," ");
      //  System.out.println(t.apply(str));
    }
}
