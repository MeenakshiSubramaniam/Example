import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Collections;

public class dpp13 {
static int max;
    // Complete the maximizingXor function below.
    static int maximizingXor(int l, int r) {
        int p=l;
        int o=0;
        int a=0;
        int arr[]=new int[100];
        int q=l-r;
        while(q!=0)
        {
        while(p<=r)
        {
            p=l+1;
            arr[o]=(l+a)+p;
            o++;
        }
        a++;
        q--;
        }
       // Arrays.sort(arr,Collections.reverseOrder());
       int n=arr.length;
       int temp;
 for (int i = 0; i < 10; i++) 
        {
            for (int j = i + 1; j < 11; j++) 
            {
                if (arr[i] < arr[j]) 
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        max=arr[1];
return max;



    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int l = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int r = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = maximizingXor(l, r);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

