package javainterview.oopBasics;

class Animal {

	public Animal(String name, String type) {
		this.name = name;
		this.type = type;
	}

	String name;
	String type;
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", type=" + type + "]";
	}
	
	// To generate toString() method from Eclipse, Right Click -> Source -> Select "Generate toString()" option.
	// In the "Generate toString()" window, there are different ways (Code style) of generating toString().
	// Such as using String Concatenation, String Builder, Custom toString() etc etc.
	// Recommended format is using "String.format" code style.
	// Because, when String Concatenation is used, it creates multiple objects which may
	// lead to performance issue.
	// We can overcome the above issue when we use "String.format" code style. 
}

public class ToStringExamples {
	public static void main(String[] args) {
		Animal animal = new Animal("Tommy", "Dog");
		System.out.println(animal);// Animal [name=Tommy, type=Dog]
	}
}