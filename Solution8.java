import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Eulerproject_8 {

	
	
	private static int[] int_to_array(String input){
		int[] digitsarray = new int[input.length()];
		for(int i = 0; i < digitsarray.length;i++){
			digitsarray[i] = ((int) input.charAt(i)) - 48;
		}
		return digitsarray;
	}
	
	private static int max_terms_product(int[] intarray,int numberofdigits){
		int maxsum = productoftems(0, intarray, numberofdigits);
		for(int pointer = 1; pointer < intarray.length - numberofdigits +1;pointer++){
			if(maxsum < productoftems(pointer, intarray, numberofdigits)){
				maxsum = productoftems(pointer, intarray, numberofdigits);
			}
		}
		return maxsum;
	}
	
	
	private static int productoftems(int pointer,int[] intarray,int numberofdigits){
		int output = 1;
		for(int i =pointer;i < pointer + numberofdigits ; i++){
			output = output * intarray[i];
		}
		return output;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberofqueries = scan.nextInt();
		int[] input1 = new int[numberofqueries];
		String[] input2 = new String[numberofqueries];
		int junk = 0;
		for(int i =0; i < numberofqueries;i++){
			junk = scan.nextInt();
			input1[i] = scan.nextInt();
			input2[i] = scan.next();
		}
		scan.close();
		for(int j = 0 ; j < numberofqueries;j++){
			System.out.println(max_terms_product(int_to_array(input2[j]), input1[j]));
		}
	}
}
