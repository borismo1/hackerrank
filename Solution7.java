import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Solution7 {
	
	private static int[] build_prime_array(int upperlimit){
		int[] prime_array = new int[upperlimit];
		int pointer = 0;
		prime_array[pointer] = 2;
		pointer++;
		for(int i=3;pointer < prime_array.length;i=i+2){
			for(int j =0;j<pointer;j++){
				if(i % prime_array[j] == 0){
					break;
				}
				if(j == pointer-1){
					prime_array[pointer] = i;
					pointer++;
				}
			}
		}
		return prime_array;
	}	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Integer[] queries = new Integer[scan.nextInt()];
		for(int i=0;i< queries.length;i++){
			queries[i] = scan.nextInt();
		}
		scan.close();
		int[] prime_array = build_prime_array(Collections.max(Arrays.asList(queries)));
		for(int j=0;j< queries.length;j++){
			System.out.println(prime_array[queries[j] - 1]);
		}
	}
	
}
