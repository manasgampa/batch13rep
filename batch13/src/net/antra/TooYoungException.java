package net.antra;

public class TooYoungException extends RuntimeException{// customized unchecked exception
	
	public TooYoungException(String msg) {
		super(msg);
	}

}
