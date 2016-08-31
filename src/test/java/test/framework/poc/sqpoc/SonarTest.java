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
        
        Human man = new Human("my home", "619");
        String address=man.getAddress();
        String name=man.getFName();
        man.setFName(name);
        man.setAddress(address);
        name=man.getLName();
        man.setLName(name);
    }
}
