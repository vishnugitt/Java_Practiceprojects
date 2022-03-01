package InnerClass1;

public class InnerclassDemo2 
{
	private String msg="Inner Classes";

	 void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(msg);
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.msg();  
	 }  

	 
	public static void main(String[] args) {
		InnerclassDemo2  ob=new InnerclassDemo2();  
		ob.display();  
		}
	}


