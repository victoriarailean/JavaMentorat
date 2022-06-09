package Generic.Ex3;

import java.util.*;

public class Ex3  {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(345434);
        list.add(4);
        list.add(43);
        maxValue(list);
        System.out.println(maxValue(list));

    }

    public static <T> T maxValue(List<T> list) {
       // Collections.sort( list, Comparator.comparing() );

        try {
            Collections.max(list, null);

        } catch (ClassCastException e) {
            System.out.println("exception thrown : " + e);
        } catch (NoSuchElementException e) {
            System.out.println("Exception thrown: " + e);
        }
        return Collections.max(list, null);
    }


}


