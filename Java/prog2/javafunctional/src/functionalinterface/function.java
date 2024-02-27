package functionalinterface;

import java.util.function.Function;

public class function {
    public static void main(String[] args) {
        int increment = increment(10);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply((2));
        System.out.println(increment2);
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static  int increment(int number){
        return number + 1;
    }
}
