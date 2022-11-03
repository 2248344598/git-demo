package cn.edu.jinjiang;

import java.util.ArrayList;
import java.util.function.IntConsumer;

public class Test222 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr =  new int[]{1, 2, 3, 4};
        forArr(list::add, arr);
        System.out.println(list);
    }

    public static void forArr(IntConsumer intConsumer, int[] arr) {
        for (int i : arr) {
            intConsumer.accept(i);
        }
    }
}
