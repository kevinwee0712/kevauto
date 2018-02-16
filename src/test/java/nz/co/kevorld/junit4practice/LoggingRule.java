package nz.co.kevorld.junit4practice;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class LoggingRule implements TestRule {

    String note;

    LoggingRule(String note){
        this.note = note;
    }

    @Override
    public Statement apply(Statement base, Description description) {

        System.out.println("Rule: " + note +" applied!!!");
        return new IgnoreStatement(base, "kevin is sleepy!");
    }

    class IgnoreStatement extends Statement{

        String message;

        Statement base;

        IgnoreStatement(Statement base, String message){
            this.base = base;
            this.message = message;
        }

        @Override
        public void evaluate() throws Throwable {

            base.evaluate();
            //System.out.println("do nothing due to " + message);
        }
    }
}
