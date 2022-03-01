package InnerClass1;

public class InnerClassDemo1 
{
 private String msg="Welcome to Java"; 
	 
	 class Inner
	 {  
	    void hello()
	    {
		  System.out.println(msg+", Let us start learning Inner Classes");
	    }  
	 }  


	public static void main(String[] args) 
	{

		InnerClassDemo1 obj=new InnerClassDemo1();
		InnerClassDemo1.Inner in=obj.new Inner();  
		in.hello();  
	}
 }

