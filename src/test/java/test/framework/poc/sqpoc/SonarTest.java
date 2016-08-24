package test.framework.poc.sqpoc;

import org.testng.annotations.Test;

public class SonarTest {

    @Test
    public void testName(){
        Sonar sonar = new Sonar();
        sonar.reset();
        sonar.setName("global");
        sonar.setVersion(1);
        sonar.setCoverage("coverage");
    }
}
