package nz.co.kevorld.junit4practice;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class TheoriesTest extends EndToEndTestBase
{

    @DataPoints
    public static String[] names = {"Tony", "Jim"};

    @DataPoints
    public static int[] ageValue1 = {10, 20, 30};

    @Theory
    public void testMethod(String name, int age)
    {
        System.out.println(String.format("%s's age is %s", name, age));
    }
}
