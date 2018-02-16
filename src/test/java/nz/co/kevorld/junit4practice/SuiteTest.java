package nz.co.kevorld.junit4practice;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({FirstE2ETest.class, SecondE2ETest.class})
public class SuiteTest {

}
