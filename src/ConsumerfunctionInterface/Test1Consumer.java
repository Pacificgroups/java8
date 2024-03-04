package ConsumerfunctionInterface;

import java.util.function.Consumer;

public class Test1Consumer {
    public static void main(String[] args) {

        Consumer<String> st=(a)->
                System.out.println("my name is "+a);

        st.accept("Prashant");
    }


}
