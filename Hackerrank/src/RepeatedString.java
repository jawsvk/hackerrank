import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
       long count = 0;
       long remainder = 0;
       
       for(char c: s.toCharArray()) {
    	   if(c== 'a') count++;
       }
       
       int substring_len = Math.toIntExact(n%s.length());
     

       
       if(n%s.length()> 0) {
    	   System.out.println("find out modulus");
    
       for(char c : s.substring(0,substring_len).toCharArray()){
    	   if(c== 'a') remainder++;
       }
       }

       return (count * (n/s.length())) + remainder;
       
       

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        /*BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();*/
    	
    	System.out.println(repeatedString("beeaabc", 711560125001L));
    }
}
