package cn.edu.jinjiang;

import java.util.function.Function;

public class TestLambda {
    static Integer num;

    public static void main(String[] args) {
        String string = typeConver(str -> str + "锦江", "pf");
        System.out.println(string);

    }

    public static <R> R typeConver(Function<String, R> function, String str) {
        return function.apply(str);
    }
}
