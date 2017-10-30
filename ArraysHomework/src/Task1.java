
public class Task1 {

	public static void main(String[] args) {
		int[] masiv = {10, 3, 5, 8, 6, -3, 7};
		int min = masiv[0];
		for (int i = 0; i < masiv.length; i++) {
			if(masiv[i]%3 == 0 && min>masiv[i]){
				min=masiv[i];
			
			}

		}
		System.out.println(min);	
		}
	}

