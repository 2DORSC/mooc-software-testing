package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TwoNumbersSumTest {

    @Test
    public void sumSameSize(){

         TwoNumbersSum twoNum=  new TwoNumbersSum();

        ArrayList<Integer> one = new ArrayList<>();
        one.add(1);
        one.add(0);
        ArrayList<Integer> two = new ArrayList<>();
        two.add(1);
        two.add(0);
        ArrayList<Integer> integerArrayList = twoNum.addTwoNumbers(one, two);

        Assertions.assertEquals(2, integerArrayList.size());
        Assertions.assertEquals(2, integerArrayList.get(0).intValue());
        Assertions.assertEquals(0, integerArrayList.get(1).intValue());
    }

    @Test
    public void sumDifSize(){

        TwoNumbersSum twoNum=  new TwoNumbersSum();

        ArrayList<Integer> one = new ArrayList<>();
        one.add(1);
        one.add(0);
        one.add(1);

        ArrayList<Integer> two = new ArrayList<>();
        two.add(1);
        two.add(0);
        ArrayList<Integer> integerArrayList = twoNum.addTwoNumbers(one, two);

        Assertions.assertEquals(3, integerArrayList.size());
        Assertions.assertEquals(1, integerArrayList.get(0).intValue());
        Assertions.assertEquals(1, integerArrayList.get(1).intValue());
        Assertions.assertEquals(1, integerArrayList.get(1).intValue());

    }
    @Test
    public void sumComplementBigger(){

        TwoNumbersSum twoNum=  new TwoNumbersSum();

        ArrayList<Integer> one = new ArrayList<>();
        one.add(9);
        one.add(9);
        one.add(9);

        ArrayList<Integer> two = new ArrayList<>();
        two.add(3);
        two.add(2);
        ArrayList<Integer> integerArrayList = twoNum.addTwoNumbers(one, two);

        Assertions.assertEquals(4, integerArrayList.size());
        Assertions.assertEquals(1, integerArrayList.get(0).intValue());
        Assertions.assertEquals(0, integerArrayList.get(1).intValue());
        Assertions.assertEquals(3, integerArrayList.get(2).intValue());
        Assertions.assertEquals(1, integerArrayList.get(3).intValue());

    }

    @Test
    public void sumComplementBigger1(){

        TwoNumbersSum twoNum=  new TwoNumbersSum();

        ArrayList<Integer> one = new ArrayList<>();
        one.add(1);
        one.add(1);
        one.add(1);

        ArrayList<Integer> two = new ArrayList<>();
        two.add(9);
        two.add(0);
        two.add(0);
        ArrayList<Integer> integerArrayList = twoNum.addTwoNumbers(one, two);

        Assertions.assertEquals(4, integerArrayList.size());
        Assertions.assertEquals(1, integerArrayList.get(0).intValue());
        Assertions.assertEquals(0, integerArrayList.get(1).intValue());
        Assertions.assertEquals(1, integerArrayList.get(2).intValue());
        Assertions.assertEquals(1, integerArrayList.get(3).intValue());

    }

    @Test
    public void sumComplementBigger2(){

        TwoNumbersSum twoNum=  new TwoNumbersSum();

        ArrayList<Integer> one = new ArrayList<>();
        one.add(2);


        ArrayList<Integer> two = new ArrayList<>();
        two.add(9);

       ArrayList<Integer> integerArrayList = twoNum.addTwoNumbers(one, two);

        Assertions.assertEquals(2, integerArrayList.size());
        Assertions.assertEquals(1, integerArrayList.get(0).intValue());
        Assertions.assertEquals(1, integerArrayList.get(1).intValue());

    }



}
