package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TwoNumbersSumTest {

    @Test
    public void sumZeros(){

         TwoNumbersSum twoNum=  new TwoNumbersSum();

        ArrayList<Integer> one = new ArrayList<>();
        one.add(1);
        one.add(0);
        ArrayList<Integer> two = new ArrayList<>();
        two.add(1);
        two.add(0);

        ArrayList<Integer> integerArrayList = twoNum.addTwoNumbers(one, two);

        System.out.printf("");

        Assertions.assertEquals(2, integerArrayList.size());
        Assertions.assertEquals(2, integerArrayList.get(0).intValue());
        Assertions.assertEquals(0, integerArrayList.get(1).intValue());




    }

}
