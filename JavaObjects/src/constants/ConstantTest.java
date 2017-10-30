package constants;

public class ConstantTest {
	// konstantite ne se promenqt vednuj kato budat suzadadeni
	// te sa edinstvenite fields , chieto ime se pishe s glavni bukvi
	// dumata final koqto e validna za vsekq promenliva i za vseki obekt
	// oznachava che tazi promenliva/obekt nqma da moje da se promenq sled kato
	// e suzdaden.
	//Konstantite mogat da se izpolzvat ott vsqkade kato konstanta
	public static final String JANUARY = "JANUARY";
	
	private static String name;
	
	public static void main (String[] args){
		System.out.println(JANUARY);
	}
	private void testFinalVariable(){
		final String april = "April";
	}
}
