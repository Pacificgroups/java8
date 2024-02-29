package Predicatetesting;

import java.util.function.Predicate;

public class predtest1  {
    public static void printer(Predicate<Integer> a,int[] arr){

        for(int e:arr){
            if(a.test(e)){
                System.out.println("no > 10");
            }
        }
    }

    public static void main(String[] args) {

        int a[]={23,4,2,1,33,2,3,12,18};

    //Predicate --> ek abstract method test() namak hota hai..
        // 3 default method hota hai and , or , negate


        Predicate<Integer> p1= (ab)-> ab>10 ;
        Predicate<Integer> p2=(d)-> d%3==0;

//       printer(p1.and(p2),a);
        printer(p1.or(p2),a);


    }

}
