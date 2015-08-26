package com.thomaskasene.theory;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Theories.class)
public class StringFormatTest {

    @DataPoint
    public static final String NAME_PETER = "Peter";

    @DataPoint
    public static final String NAME_BRUCE = "Bruce";

    @DataPoint
    public static final int AGE_18 = 18;

    @DataPoint
    public static final int AGE_25 = 25;

    @Theory
    public void returnsFormattedString(String name, int age) {
        String expected = name + " is " + age + " years old";
        String result = String.format("%s is %d years old", name, age);
        assertThat(result, is(equalTo(expected)));
        System.out.println(result);
    }
}