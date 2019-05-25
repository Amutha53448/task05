package multipleinheritance;


   
interface one 
{ 
    public void print_gits(); 
} 
   
interface two 
{ 
    public void print_for(); 
} 
   
interface three extends one,two 
{ 
    public void print_gits(); 
} 
class child implements three 
{ 
    @Override
    public void print_gits() { 
        System.out.println("GITS"); 
    } 
   
    public void print_for() 
    { 
        System.out.println("Kovilpatti"); 
    } 
} 
  
// Derived class 
public class Main {

	 public static void main(String[] args) 
	    { 
	        child c = new child(); 
	        c.print_gits(); 
	        c.print_for(); 
	         
	    } 
}
