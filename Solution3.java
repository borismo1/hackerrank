import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;


public class Solution3 {

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number_of_cases = in.nextInt();
		double[] limits = new double[number_of_cases];
		for(int i =0 ;i<number_of_cases;i++){
			limits[i] = in.nextDouble();
		}
		in.close();
		for(int j =0;j<number_of_cases;j++){
			System.out.println(new BigDecimal(fetch_prime(limits[j])).toBigInteger());
		}
	}
	
	
	public static double fetch_prime(double input){
		double output = input;
		for(double i =2;i <= Math.sqrt(input);i++){
			if(i == output){
				break;
			}
			if(output % i == 0){
				output = output/i;
				i--;
			}
		}
		return output;
	}
	
	
}
