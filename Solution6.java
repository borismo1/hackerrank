import java.math.BigInteger;
import java.util.Scanner;

public class Solution6 {

	
	public static BigInteger calc(int upperlimit){
		BigInteger zero = BigInteger.valueOf(upperlimit);
		BigInteger first = BigInteger.valueOf(upperlimit +1);
		BigInteger second = BigInteger.valueOf(3*upperlimit +2);
		BigInteger third = BigInteger.valueOf(upperlimit -1);
		BigInteger output = (zero.multiply(first).multiply(second).multiply(third)).divide(BigInteger.valueOf(12));
		return output;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] test_cases = new int[scan.nextInt()];
		for(int i =0;i < test_cases.length;i++){
			test_cases[i] = scan.nextInt();
		}
		scan.close();
		for(int j =0;j<test_cases.length;j++){
			System.out.println(calc(test_cases[j]));
		}
	}
	
}
