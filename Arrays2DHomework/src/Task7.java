
public class Task7 {

	public static void main(String[] args) {
		int[][] arr = {
				{11,12,13,14,15,16},
				{21,22,23,24,25,26},
				{31,32,33,34,35,36},
				{41,42,43,44,45,46},
				{51,52,53,54,55,56},
				{61,62,63,64,65,66}
				};
		int sum = 0;
		int sum1 = 0;
		int maxSum = 0;
		for (int i = 0; i < arr.length	; i++) {
			
			if(i%2 == 0){
				sum = 0;
			for (int j = 0; j < arr.length; j+=2) {
				System.out.print(arr[i][j]+ " ");
				sum = sum +arr[i][j];
				maxSum = maxSum +arr[i][j];
			}
			System.out.println(", сума от елементите за реда "+ sum);	
		}
		if(i%2 != 0){
			sum1 = 0;
				for (int j = 1; j < arr.length; j+=2) {
					System.out.print(arr[i][j] + " ");
					sum1 = sum1 + arr[i][j];
					maxSum = maxSum +arr[i][j];
				}
				System.out.println(", сума от елементите за реда "+sum1);
			}
		}
		System.out.println("Сума на елементите: "+maxSum);
}
	
}

