package javainterview.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class House implements Serializable
{	
	public House(int number) {
		super();
		this.number = number;
	}

	transient Wall wall;
//	Wall wall;
	int number;
}

//class Wall implements Serializable{
class Wall {
	int length;
	int breadth;
	int color;
}

// We need to serialize House class which has Wall class.
// House class implements Serializable.
// If Wall class doesn't implement Serializable, we will get java.io.NotSerializableException.

// Solution : Wall class has to be marked as transient. (which is not recommended because, contents of
// Wall class won't be serialized.

// So, the recommended solution is to make Wall class implement Serializable.
// By doing this, we can serialize the contents of House Class along with the contents of Wall Class.

public class SerializationExamples2 {

	public static void main(String[] args) throws IOException {

		FileOutputStream fileStream = new FileOutputStream("House.ser");
		ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);
		Wall wall = new Wall();
		wall.length = 20;
		House house = new House(10);
		house.wall = wall;
		// Exception in thread "main" java.io.NotSerializableException:
		// com.rithus.serialization.Wall
		objectStream.writeObject(house);
		objectStream.close();
		
		System.out.println(house.number);
		System.out.println(house.wall.length);
	}
}
