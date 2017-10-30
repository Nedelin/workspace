package symbolstrings;

public class Exc5DevidesUrl {

	public static void main(String[] args) {
		String text = "http://www.devbg.org/forum/index.php";
		String text2 = "Asen Petrov asen@abv.bg";
		int index = text.indexOf("://");
		int index2 = text.indexOf("org/");
		int index3 = text2.indexOf(".");
		int index4 = text2.indexOf("v ");
		int index5 = text2.indexOf("@");
		String email = text2.substring(index4+1,index5);
		String protocol = text.substring(0,index);
		String server = text.substring(index+3,index2+3);
		String resource = text.substring(index3);
		String domain = text2.substring(index3, text2.length());
		System.out.println("Protocol - "+protocol);
		System.out.println("Server - "+server);
		System.out.println("Resource - "+resource);
		System.out.println("Email" + email);
		System.out.println(domain);
		
	}
	

}
