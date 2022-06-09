import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Ex3Test {
     Collection.Ex3 newVariable = new Collection.Ex3();

     @Test
     void newTest() throws NoSuchFieldException {

         LinkedList<String> firstList = new LinkedList<>();
         firstList.add("math"); firstList.add("elements"); firstList.add("enghlish"); firstList.add("abccd"); firstList.add("abcr"); firstList.add("abcn");
         newVariable.bleep(firstList);
         assertEquals(firstList.toString(),"[elements, enghlish, abccd, abcr]");

        }

//    @Test
//    public void secondMethod(){
//        Class<Collection.Ex3> exception = Collection.Ex3.class,
//                ()->{newVariable.bleep();};);
//     }
}


