package Functiontest;

import java.util.function.Function;
import java.util.function.Predicate;

public class functiontesting  {

//Question--> Employee class whose salary > 10,000;
    public static void printer(Function<Integer,Boolean> a, int[] arr){

        for(int e:arr){
            if(a.apply(e)){
                System.out.println("no > 10");
            }
        }
    }

    public static void main(String[] args) {

        int[] arr={2,43,56,7,43,83,48};

        Function<Integer,Boolean> t =(a)-> a>=10;

        printer(t,arr);


    }

}
