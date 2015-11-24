	
	import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Eulerproject_9 {

	private static int[] findtriplet(int input){
		int[] triplet  = new int[3];
		if(input % 2 != 0){
			return triplet;
		}
		for(int a = 1;a < input / 3;a++){
			for(int b = a+1;b +a +  Math.pow(Math.pow(a, 2) + Math.pow(b, 2), 0.5) <= input;b++){
				double c = Math.pow(Math.pow(a, 2) + Math.pow(b, 2), 0.5);
				if(a + b + c == input && Math.floor(c) == c){
					if( triplet[0]*triplet[1]*triplet[2] < a*b*c){
						triplet[0] = a;
						triplet[1] = b;
						triplet[2] = (int) c;
					}
				}
			}
		}
		return triplet;
		
		
 }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int test_cases = scan.nextInt();
		int[] auxarray = new int[test_cases];
		for(int i =0;i< test_cases;i++){
			auxarray[i] = scan.nextInt();
		}
		scan.close();
		for(int j =0 ;j < test_cases;j++){
			int[] triplet = findtriplet(auxarray[j]);
			if(triplet[0]*triplet[1]*triplet[2] == 0){
				System.out.println(-1);
			}
			else{
				System.out.println(triplet[0]*triplet[1]*triplet[2]);
		}
	  }
	}
	
	
}
