package javabasic;

public class ConstructorTest {

	public static void main(String[] args) {
		
		ConstructorExample constructorExample1 = new ConstructorExample();
		constructorExample1.display();

		ConstructorExample constructorExample = new ConstructorExample("Ravi","male");
		constructorExample.display();
	}

}
