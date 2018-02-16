package nz.co.kevorld.junit4practice;

import nz.co.kevorld.utils.City;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.io.IOException;

public class FirstE2ETest extends EndToEndTestBase {

    @Test
    @Category(AttributeFun.class)
    public void test1() {
        new User(City.Auckland);
        //logger.info(folder.newFile().getAbsolutePath());
    }

    @Test
    @Ignore
    @Category(AttributeSad.class)
    public void test2() throws Exception {
        logger.error("I belong to first e2e test!!!!!!!!!!!!!!!!!!!!!!!");
        //Assume.assumeTrue(false);
        Assert.assertTrue(false);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }

    @Test
    public void test3(){
       new User(City.Auckland);
       new User(City.Beijing);
    }
}
