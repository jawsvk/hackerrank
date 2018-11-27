import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Array2D {
	  // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int max = Integer.MIN_VALUE;
        int sum;
        for(int i=0; i<4; i++){
            
            for(int j = 0; j<4; j++){
                sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1]
                        + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
               
                max = sum > max ? sum : max ;                
                System.out.println(sum);


            }
            System.out.println();

        }
    

        return max;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[][] {
        	{0,-4,-6,0,-7,-6},
        	{-1,-2,-6,8,-3,-1},
        	{-8,-4,-2,-8,-8,-6},
        	{-3,-1,-2,-5,-7,-4},
        	{-3,-5,-3,-6,-6,-6},
        	{-3,-6,0,-8,-6,-7}
        };
        
        int result = hourglassSum(arr);
        System.out.println("result is "+ result);

      

    }

}
