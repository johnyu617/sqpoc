package test.framework.poc.sqpoc;

import org.testng.annotations.Test;

public class SonarTest {

    @Test
    public void testName(){
        Sonar sonar = new Sonar();
        sonar.setName("global");
    }
}
