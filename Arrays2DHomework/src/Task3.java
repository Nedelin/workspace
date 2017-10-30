
public class Task3 {

	public static void main(String[] args) {
		int[][] arr = { 
				{48,72,13,14,15},
				{21,22,53,24,75},
				{31,57,33,34,35},
				{41,95,43,44,45},
				{59,52,53,54,55}
				};
		double sum = 0;
		double srednoAritmetichno = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				sum= sum + arr[i][j];		
			}
		}
		System.out.println("Sumata e "+sum);
		srednoAritmetichno = sum /(arr.length*arr.length);
		System.out.println("Srednoaritmetichnoto e "+srednoAritmetichno);
	}
}
