package com.thomaskasene.theory;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assume.assumeThat;

@RunWith(Theories.class)
public class MathMaximumTest {

    @DataPoints
    public static final int[] VALUES = {-10, -5, 0, 5, 10};

    @Theory
    public void returnsFirstValueWhenItIsGreatest(int firstValue, int secondValue) {
        assumeThat(firstValue > secondValue, is(true));
        int result = Math.max(firstValue, secondValue);
        assertThat(result, is(firstValue));
        System.out.printf("%s: The greatest of the two values %d and %d is %d%n",
                "First value Theory", firstValue, secondValue, result);
    }

    @Theory
    public void returnsSecondValueWhenItIsGreatest(int firstValue, int secondValue) {
        assumeThat(firstValue < secondValue, is(true));
        int result = Math.max(firstValue, secondValue);
        assertThat(result, is(secondValue));
        System.out.printf("%s: The greatest of the two values %d and %d is %d%n",
                "Second value Theory", firstValue, secondValue, result);
    }
}