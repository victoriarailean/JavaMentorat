package Generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex2 {
        public static final <T> void number(T[] a, int i, int j) {
            T t = a[i];
            a[i] = a[j];
            a[j] = t;
        }

        public static final <T> void number(List<T> l, int i, int j) {
            Collections.<T>swap(l, i, j);
        }

        private static void test() {
            String [] a = {"zY", "zX"};
            number(a, 0, 1);
            System.out.println(Arrays.toString(a));
            List<String> l = new ArrayList<>(Arrays.asList(a));
            number(l, 0, 1);
            System.out.println(l);
        }
        public static void main(String...args)
        {
            test();
        }

    }

//Write a generic method to exchange the positions of two different elements in an array.

