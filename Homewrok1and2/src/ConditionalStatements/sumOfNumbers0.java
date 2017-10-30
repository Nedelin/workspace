package ConditionalStatements;

public class sumOfNumbers0 {
    public static void main(String[] args) {
        int[] array = {-2,-1,1,};
        for(int index=0; index< array.length; index++){
            if(array[index]+ array[index+1]==0){
                System.out.println(array[index]);
                System.out.println(array[index+1]);
            }
            else{
                System.out.println("No sum 0");
            }

        }
    }
}
