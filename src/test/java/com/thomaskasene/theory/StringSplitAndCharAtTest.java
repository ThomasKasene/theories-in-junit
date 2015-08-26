package com.thomaskasene.theory;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.FromDataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Theories.class)
public class StringSplitAndCharAtTest {

    @DataPoints("TwoWords")
    public static final String[] TWO_WORDS = {"Hello World", "Good morning", "What's up"};

    @DataPoints("StartingWithT")
    public static final String[] STARTING_WITH_T = {"Thor", "Tests", "This"};

    @Theory
    public void returnsTwoItemsWhenPassedTwoWords(@FromDataPoints("TwoWords") String value) {
        int result = value.split(" ").length;
        assertThat(result, is(2));
        System.out.printf("The string \"%s\" is split into %d parts%n", value, result);
    }

    @Theory
    public void returnsTWhenValueStartsWithT(@FromDataPoints("StartingWithT") String value) {
        char result = value.charAt(0);
        assertThat(result, is('T'));
        System.out.printf("The string \"%s\" begins with the letter '%c'%n", value, result);
    }
}