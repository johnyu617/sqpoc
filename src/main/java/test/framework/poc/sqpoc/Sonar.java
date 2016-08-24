package test.framework.poc.sqpoc;

public class Sonar {
    private String name;
    private int version;
    private String coverage;
 
    public Sonar(){
    	reset();
    }
    
    public Sonar(String name,String coverage, int version){
        this.name=name;
        this.coverage=coverage;
        this.version = version;
    }
 
    public void reset(){
        this.name="";
        this.coverage="";
        this.version = 0;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getVersion() {
        return version;
    }
    public void setVersion(int version) {
        this.version = version;
    }
    public String getCoverage() {
        return coverage;
    }
    public void setCoverage(String coverage) {
        this.coverage = coverage;
    }
}
