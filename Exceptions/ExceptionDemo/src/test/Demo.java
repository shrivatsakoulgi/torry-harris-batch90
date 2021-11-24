package test;

public class Demo {

	public static void main(String[] args) {
		try {
			//opened a file, Session
		int a=1,b=0;
		//int c=a/b;
		//System.out.println(c);
		String s=null;
		//System.out.println(s.length());
		int arr[]=new int[10];
		arr[11]=100;
		//closed session, file
		
		}
		
		catch(NullPointerException e) {
			System.out.println("NUll Exception Caught!!");
			System.out.println(e.toString());
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception Caught!!");
			System.out.println(e.toString());
		}
		
		catch (Exception e) {
			System.out.println("Generic Exception Caught!!");
			System.out.println(e.toString());
		}
		
		finally {
			System.out.println("Finally block");
			
		}
		System.out.println("After Exception");
	}

}
