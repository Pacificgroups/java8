package ConsumerfunctionInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Test2Consumer {
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

       Consumer<List<String>> ds=(st)->{
           System.out.println(a.apply(st));
       };


       Consumer<List<String>> rs=(f)->{
           System.out.println(f);
       };

       rs.andThen(ds).andThen(rs).accept(li);

//       ds.accept(li);

        System.out.println();


//        System.out.println(a.apply(li));

        Integer num=22;

        Function<Integer,Integer> s=(b)-> b*2;
        System.out.println(s.apply(num));

        // Function<String,String> t=(a)-> a.replaceAll("a"," ");
        //  System.out.println(t.apply(str));

    }
}
