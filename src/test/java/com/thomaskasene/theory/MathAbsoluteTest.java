package com.thomaskasene.theory;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Theories.class)
public class MathAbsoluteTest {

    @DataPoint
    public static final int NEGATIVE_VALUE = -2;

    @DataPoint
    public static final int POSITIVE_VALUE = 2;

    @Theory
    public void returnsAbsoluteValue(int value) {
        int result = Math.abs(value);
        assertThat(result, is(2));
        System.out.printf("The absolute value of %d is %d%n", value, result);
    }
}