package human;

public class Human {

	public String firstName;
	public String lastName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Human (){
		
	}
	public Human(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
}
