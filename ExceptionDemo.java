package session11assignment4;
//here we cretaed package as eh which that organizes a set of related classes and interfaces.
import java.io.IOException;

public class ExceptionDemo 
//public keyword is used in the declaration of a class.
//class defines instance and class fields,methods and inner classes.
//created as class name Exceptiondemo
	{
	void show() throws ArithmeticException
	//we created the validate method that taked integer value as paramter.If the age is less than 18 we are 
	//we are throwing the ArithmeticException otherwise it will print welcome to vote//
	//this will help to display the message
	{
		System.out.println("parent class");
		//system : is a class in java language pacakge.
		//out : static member of the system class.
		//println : to print what is output.
	}
}
class Child extends ExceptionDemo{//subclass creationhere it extends the values of class1 to class2
	void show() throws IOException{//compilation error
		System.out.println("child class");
		//system is final class
//out is a static member of system class and type printStream
//println is method of printStream class.ln means nextline
	}
	public static void main(String[] args) {
				//public : it can be called from anywhere.
				//static : doesn't belong to a specific object.
				//void : returns to no value.
				//main : is special because it will start the program.
				//String[] args is actually an array of java.lang.String type and it's name is args here
		// TODO Auto-generated method stub
 try{
	 ExceptionDemo sub=new Child();//creating an object
	 sub.show();//prints the value
 }
 catch(Exception e){
	/*the code is prone to exceptions is placed in the try block
	 *when exception occurs that exception occurred is handled by the 
	 *catch block associated with it
	 */
 }
	}

}
