package nz.co.kevorld.junit4practice;

import nz.co.kevorld.utils.City;
import nz.co.kevorld.utils.EnumUtil;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class SecondE2ETest {

    @Test
    @Category(AttributeFun.class)
    public void test1() {
        new User(City.Beijing);
    }

    @Test
    public void test2() {
        new User(City.Auckland);
    }
}
