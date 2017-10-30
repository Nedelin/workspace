
public class Task5 {

	public static void main(String[] args) {
		int[][] arr = { 
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
				};
		int sumRow = 0;
		int sumCol = 0;
		int maxSumRow = 0;
		int maxSumCol = 0;
		for (int i = 0; i < arr.length; i++) {
			sumRow= 0;
			for (int j = 0; j < arr.length; j++) {
				sumRow =  sumRow + arr[i][j];
				if (maxSumRow < sumRow) {
					maxSumRow = sumRow;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			sumCol = 0;
			for (int j = 0; j < arr.length; j++) {
				sumCol = sumCol + arr[j][i];
				if (maxSumCol < sumCol) {
					maxSumCol = sumCol;
				}
			}
		}
		System.out.println("Nai golqmata suma po redovete e "+maxSumRow);
		System.out.println("Nai golqmata suma po kolonite e "+maxSumCol);
		if(maxSumRow>maxSumCol){
			System.out.println("Maksimalnata suma na redovete e > ot maksimalnata suma na kolonite!");
		}
		else{
			System.out.println("Maksimalnata suma na kolonite e > ot maksimalnata suma na redovete!");
		}
	}
}
