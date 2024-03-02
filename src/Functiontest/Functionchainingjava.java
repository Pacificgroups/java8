package Functiontest;


import java.util.function.Function;

public class Functionchainingjava {
    public static void main(String[] args) {

        Function<Integer,Integer> li=(s)-> s*2;
        Function<Integer,Integer> li2=(g)-> g*g;

        System.out.println(li2.andThen(li).apply(4));

        System.out.println(li.compose(li2).apply(4));
    }
}
