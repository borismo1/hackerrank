import java.util.Scanner;

public class Solution5 {

	public static int[] prime_factorization(int input){
		int[] output = new int[40];
		if(input <= 2){
			output[input -1]++;
			return output;
		}
		for(int i = 2;input > 1;i++){
			if(input%i == 0){
				output[i-1]++;
				input = input / i ;
				i--;
			}
		}
		return output;
	}
	
	public static int[] series_factorization(int upper_limit){
		int[] output = new int[40];
		if(upper_limit <= 2){
			output[upper_limit-1]++;
			return output;
		}
		for(int i=2;i<=upper_limit;i++){
			int[] temp = prime_factorization(i);
			for(int k=0;k<40;k++){
				output[k]= Math.max(output[k], temp[k]);
			}
		}
		return output;
	}
	
	public static int product_of_dominanat_factors(int[] input){
		int output= 1 ;
		for(int i =0;i<40;i++){
			if(input[i] != 0){
				output = output * (int) Math.pow((double)(i+1), input[i]);
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number_of_tests = scan.nextInt();
		int[] upper_limits = new int[number_of_tests];
		for(int i =0;i< number_of_tests;i++){
			upper_limits[i] = scan.nextInt();
		}
		scan.close();
		for(int j = 0;j < number_of_tests;j++){
			System.out.println(product_of_dominanat_factors(series_factorization(upper_limits[j])));
		}
	}
	
}
