package com.length;


import org.junit.Assert;
import org.junit.Test;

public class MileTest {
    @Test
    public void three_miles_should_equal_three_miles(){
        Mile threeMiles = new Mile(3);
        Mile anotherThreeMiles = new Mile(3);

        Assert.assertTrue(threeMiles.equals(anotherThreeMiles));
    }

    @Test
    public void three_miles_should_not_equal_two_miles(){
        Mile threeMiles = new Mile(3);
        Mile twoMiles = new Mile(2);

        Assert.assertFalse(threeMiles.equals(twoMiles));
    }

    @Test
    public void three_miles_should_not_equal_for_miles(){
        Mile threeMiles = new Mile(3);
        Mile fourMiles = new Mile(4);

        Assert.assertFalse(threeMiles.equals(fourMiles));
    }

    @Test
    public void three_miles_should_not_equal_null(){
        Mile threeMiles = new Mile(3);

        Assert.assertFalse(threeMiles.equals(null));
    }
}
