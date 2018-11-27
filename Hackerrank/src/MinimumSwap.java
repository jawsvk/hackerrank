import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MinimumSwap {
	   // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int count = 0;
      
        int temp = 0;
        for(int i = 0; i< arr.length -1; i++){
        	//using while loop
       /* 	while(arr[i] != i+1) {
        		System.out.println(" i is "+ i);
        		int swapKey = arr[i] - 1;
        		temp = arr[i];
        		arr[i] = arr[swapKey];
        		arr[swapKey] = temp;
        		count ++;
        		*/
        	//using for loop
        	if(arr[i]== i+1) continue;
           
            for(int j = i + 1; j <arr.length; j++) {
                   if(arr[j] == i + 1) {
                	  
                	   temp = arr[i];
                       arr[i] = arr[j];
                       arr[j] = temp;
                       count ++;
                       break;
                   }
         
                }    
                
             
            
        }

        for(int i : arr) System.out.print(i+ ",");

        return count;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
     /*   BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

       
        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();*/
    	
    	int[]arr = new int[] {2, 31, 1, 38, 29, 5,44 , 6, 12, 18, 39, 9, 48, 49, 13, 11, 7, 27, 14, 33, 50, 21, 46, 23, 15, 26, 8, 47, 40, 3, 32, 22, 34, 42, 16, 41, 24, 10, 4, 28, 36, 30, 37, 35, 20, 17, 45, 43, 25, 19};
    	//int[] arr = new int[] {1,3,5,2,4,6,7};
    	int res = minimumSwaps(arr);
    	
    	System.out.println();
    	System.out.println("count is "+ res);
    }

}
