package exceptionhandling;

import java.util.Scanner;


public class CustomExceptionTest {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String username = getUsernameFromUser();
		try {
		validateUsername(username);
		}catch (UsernameTooShortException e){
			System.out.println("Please enter username with at least 8 symbols");
		}
		finally{
			scanner.close();
			System.out.println("Scanner is closed");
		}
		
	}

	private static String getUsernameFromUser(){
		Scanner input = new Scanner (System.in);
		String username = input.nextLine();
		input.close();
		
		return username;
		
	}
	private static void validateUsername(String username) throws UsernameTooShortException {
		if(username.length()<8){
			throw new UsernameTooShortException();
		}
	}
}
