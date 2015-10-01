import java.util.Arrays;
import java.util.Scanner;

public class findMax {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
         String numberString = sc.nextLine();
         String[] strs = numberString.split(",");
         int[] arr = new int[strs.length];
         for (int x = 0; x < arr.length; x++) {
                arr[x] = Integer.parseInt(strs[x]);
         }
         Arrays.sort(arr);
         System.out.println(arr[arr.length-1]);
	}

}
