package practice;

@FunctionalInterface
interface fc {
	void sayHi();
}


//3 ways to use functional interface 
//1) create new class and implements interface
//2) using inner anonymous class
//3) using lambda expressions

class NewClass implements fc{

	@Override
	public void sayHi() {
		System.out.println("Hi from new class");
	}
	
}
public class LambdaExpressions {
	
	public static void main(String args[]) {
		fc newClass = new NewClass();
		newClass.sayHi();
		//anonymous inner class
		fc fc = new fc(){
			public void sayHi() {
				System.out.println("Hi from inner anonymous class class");
			}
			
		};
		fc.sayHi();
		fc fc2 = () -> System.out.println("Hi from Lambda");
		fc2.sayHi();
	}
	
}
