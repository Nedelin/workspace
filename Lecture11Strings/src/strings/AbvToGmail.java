package strings;

import java.util.Arrays;

public class AbvToGmail {

	public static void main(String[] args) {
		String firstEmail = "petar.manolov@abv.bg";
		String secondEmail = "antoan.rusinov@abv.bg";
		String thirdEmail = "vladislav.borisov@abv.bg";

		String[] gmailEmails = convertAbvToGmail(firstEmail,secondEmail,thirdEmail);
		System.out.println(Arrays.toString(gmailEmails));
	}
	private static String[] convertAbvToGmail(String ...abvEmails){
		String [] gmailEmails = new String [abvEmails.length];
		for (int i = 0; i < abvEmails.length; i++) {
			gmailEmails[i] = abvEmails[i].replace("abv.bg", "gmail.com");
		}
		return gmailEmails;
		
	}

}
