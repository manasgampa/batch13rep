package net.antra;

public class StudentNotFoundException extends Exception{//customized checked Exception

	public StudentNotFoundException(String message) {
		
		super(message);
	}
}
