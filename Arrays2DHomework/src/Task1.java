
public class Task1 {

	public static void main(String[] args) {
		int[][] arr = { 
						{48,72,13,14,15},
						{21,22,53,24,75},
						{31,57,33,34,35},
						{41,95,43,44,45},
						{59,52,53,54,55},
						{61,69,63,64,65}
						};
		int max = -999999;
		int min = 9999999;
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col] > max) {
				max = arr[row][col];
				}
				
				if (arr[row][col] < min) {
				min = arr[row][col];
				}
				}
				}
		System.out.println("Nai malkoto e "+ min);
		System.out.println("Nai golqmoto e "+ max);
	}
}

		