package exceptionhandling;

public class UsernameTooShortException extends Exception  {

	private static final long serialVersionUID = 1L;
	public UsernameTooShortException(){
		System.out.println("Your username is too short");
	}

}
