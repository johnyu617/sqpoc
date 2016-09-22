package test.framework.poc.sqpoc;

public class Human {
    private String name;
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
        this.name="";
        this.address1="";
    }

    //add comments
    public String getName(){
        return name;
    }
    
    public String getName2(){
        String n= name+this.address1;
        //return it for testing
        return n;
    }  
    
    //add comments
    public void setName(String name)
    {
    	this.name=name+"update";
    	// add a comment
    	
    	// add two comments
    	
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
