package human;

public class Worker extends Human implements Comparable<Worker>{

	private int nadnica;
	private int timeWorked;
	
	public int getNadnica() {
		return nadnica;
	}
	public void setNadnica(int nadnica) {
		this.nadnica = nadnica;
	}
	public int getTimeWorked() {
		return timeWorked;
	}
	public void setTimeWorked(int timeWorked) {
		this.timeWorked = timeWorked;
	}
	
	static double moneyEarnedForOneHour(int nadnica, int timeWorked){
		double moneyForOneHour = nadnica/timeWorked;
		return moneyForOneHour;
	}
	public Worker(int nadnica, int timeWorked,String firstName, String lastName) {
		super(firstName,lastName);
		this.nadnica = nadnica;
		this.timeWorked = timeWorked;
	}
	
	@Override
	public int compareTo(Worker o) {
		if(getNadnica()==o.getNadnica()){
			return 0;
		}
		if(getNadnica()<o.getNadnica()){
			return -1;
		}
		return 1;
	}
	@Override
	public String toString() {
		return "Worker [nadnica=" + nadnica + ", timeWorked=" + timeWorked + ", firstName=" + firstName + ", lastName="
				+ lastName + "]";
	}
}
