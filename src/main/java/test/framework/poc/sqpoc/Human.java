package test.framework.poc.sqpoc;

public class Human {
    private String name, fname, lname;
    private String address1;
    
    public Human(String name,String address1){
        this.name=name;
        this.address1=address1;
    }

    //jhjkhkhkj
    public Human(){
    	reset();
    }
    
    public void reset(){
        this.fname="";
        this.lname="";
        this.address1="";
    }

    //add comments
    public String getFName(){
        return fname;
    }
    
    public String getLName(){
        //String n= name+this.address1;
        //return it for testing
        return lname;
    }  
    
    //add comments
    public void setFName(String name)
    {
    	this.fname=name;
    }
    
    //add comments
    public void setLName(String name)
    {
    	this.lname=name;
    }
    
    //add comments
    public void setAddress(String address1)
    {
    	this.address1=address1;
    }
    
    //add comments
    public String getAddress(){
        return address1;
    }
}
