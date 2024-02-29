package Interface;


@FunctionalInterface
public interface java8interface {
	
	//@functional interface annotation use --> it will dedicate an interface as functional interface.
	//by showing compile time error if we add more than one abstract method
	
	abstract void green();
	

	default void white() {
		
		System.out.println("hello world");
	}
	 
	 static void wshte() {
			
			System.out.println("hello world");
		}
	 
}


