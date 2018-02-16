package nz.co.kevorld.junit4practice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class TestGenerateParams
{

    private String greeting;
    private String someone;

    public TestGenerateParams(String greeting, String someone)
    {
        this.greeting = greeting;
        this.someone = someone;
    }

    @Test
    public void testParams()
    {
        System.out.println(greeting);
        System.out.println(someone);
    }

    /**
     * 这里的返回至少是二维数组
     * @return
     */
    @Parameterized.Parameters
    public static List<String[]> getParams()
    {
        return
                Arrays.asList(new String[][]{{"hello","Kevin"},
                        {"hi","Sunny"},
                        {"good morning","Ethan"},
                        {"how are you","Alex"}});
    }
}
