package nz.co.kevorld.junit4practice;


import org.junit.Rule;
import org.junit.rules.ErrorCollector;
import org.junit.rules.RuleChain;
import org.junit.rules.TestName;
import org.junit.rules.Timeout;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class EndToEndTestBase {

    protected static final Logger logger = LoggerFactory.getLogger(EndToEndTestBase.class);

    @Rule
    public RuleChain ruleChain = RuleChain.outerRule(new LoggingRule("A")).around(new LoggingRule("B")).around(
            new LoggingRule("C")
    ).around(new Timeout(1000));//.around(new ErrorCollector());

    @Rule
    public TestName rule = new TestName();
}
