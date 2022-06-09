import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class Collection {
    public static class Ex3 {
        public static void main(String[] args) throws NoSuchFieldException {

            LinkedList<String> firstList = new LinkedList<>();
            firstList.add("math");
            firstList.add("elements");
            firstList.add("enghlish");
            firstList.add("abccd");
            firstList.add("abcr");
            firstList.add("abcn");
            bleep(firstList);
        }

        public static void bleep(LinkedList<String> list) throws NoSuchFieldException {
            LinkedList<String> new_list = new LinkedList<>();
            for (String l : list) {
                if (l.length() <= 4) {
                    new_list.add(l);
                }
            }

            String x = new_list.get(0);
            list.remove(x);
            System.out.println(list);

            String y = new_list.get(new_list.size() - 1);
            list.remove(y);
            System.out.println(list);

            if(list == null){
              try {
                  throw new NullPointerException("demo");
              }catch (NullPointerException e){
                throw e;
              }
          }if( list != null || list.size() != 4 || list.size() == 4 ){
             throw new NoSuchFieldException();
        }

        }
    }

    public static class Ex5 {
            public static void main(String [] args){
                List<Integer> list=new ArrayList<>();
                List<Integer> list1=new ArrayList<>();
                List<Integer> list2=new ArrayList<>();

                list.add(1); list.add(1); list.add(2); list.add(3); list.add(4); list.add(1); list.add(2); list.add(3);
                list1.add(7); list1.add(5); list1.add(3); list1.add(1);
                list2.add(1); list2.add(1); list2.add(1); list2.add(1);

                System.out.println("First list: " + list);
                System.out.println(removeDuplicates(list));

                System.out.println("Second list: " +list1);
                System.out.println(removeDuplicates(list1));

                System.out.println("List:" + list2);
                System.out.println(removeDuplicates(list2));
            }

            public static List<Integer> removeDuplicates(List<Integer> list){
                LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(list);

                ArrayList<Integer> listWithoutDuplicates = new ArrayList<>(hashSet);

                return listWithoutDuplicates;
            }
        }

    public static class EX9 {
        public static void main (String [] args){
            LinkedList<Integer> linkedList = new LinkedList();
            for(int i =0; i <= 10; i++){
                linkedList.add(i);
            }
            System.out.println("Elements:" + linkedList);
            linkedList= reverseLinkedList(linkedList);
            System.out.print("\nElements after reversing: " + linkedList);
        }
        public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> llist)
        {
            LinkedList<Integer> revLinkedList = new LinkedList<>();
            for (int i = llist.size() - 1; i >= 0; i--) {
                revLinkedList.add(llist.get(i));
            }
            return revLinkedList;
        }
    }

    public static class Ex4 {
            public static void main(String [] args){
                System.out.println("Comparable is in the java.util package." + "is false");

                Integer number  = 120000;
                Integer number1 = 1000;
                System.out.println(number.compareTo(number1));

                System.out.println("Comparator is in the java.util package." +  "is true");

                Integer nr1 = 110;
                Integer nr2 = 110;

                System.out.println(nr1.compare(nr2, nr1));
                System.out.println(nr1.equals(nr2));


                System.out.println("compare() is in the Comparable interface." + " is false .");
                System.out.println("compare() is in the Comparator interface." + " is true");
                System.out.println("compare() takes one method parameter"      + " is false. ");
                System.out.println("compare() takes two method parameters."    + " is true. ");
            }
        }
}
