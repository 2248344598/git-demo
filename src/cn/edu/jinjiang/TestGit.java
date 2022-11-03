package cn.edu.jinjiang;


import java.util.function.IntPredicate;

public class TestGit {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        printNums(arr, v -> v % 2 == 0);
    }

    public static void printNums(int[] arr, IntPredicate intPredicate) {
        for (int i : arr) {
            if (intPredicate.test(i)) {
                System.out.println(i);
            }
        }
    }
}

