package com.length;

import com.sun.org.apache.bcel.internal.generic.AASTORE;
import org.junit.Assert;
import org.junit.Test;

public class YardTest {
    @Test
    public void one_mile_equals_1760_yard(){
        Mile oneMile = new Mile(1);
        Yard yards = new Yard(1760);

        Assert.assertTrue(oneMile.equals(yards));
    }

    @Test
    public void three_yards_should_equal_three_yards(){
        Yard threeYards = new Yard(3);
        Yard anotherThreeYards = new Yard(3);

        Assert.assertTrue(threeYards.equals(anotherThreeYards));
    }

    @Test
    public void one_mile_should_not_equal_1761_yards(){
        Mile oneMile = new Mile(1);
        Yard yards = new Yard(1761);

        Assert.assertFalse(oneMile.equals(yards));
    }

    @Test
    public void three_yards_should_not_equal_four_yards(){
        Yard threeYards = new Yard(3);
        Yard fourYards = new Yard(4);

        Assert.assertFalse(threeYards.equals(fourYards));
    }

    @Test
    public void three_yards_should_not_equal_null(){
        Yard threeYards = new Yard(3);

        Assert.assertFalse(threeYards.equals(null));
    }

    @Test
    public void two_miles_should_equal_3520_yards(){
        Mile twoMiles = new Mile(2);
        Yard yards = new Yard(3520);

        Assert.assertTrue(twoMiles.equals(yards));
    }

    @Test
    public void two_miles_should_equal_3520_yards_revert(){
        Mile twoMiles = new Mile(2);
        Yard yards = new Yard(3520);

        Assert.assertTrue(yards.equals(twoMiles));
    }
}
