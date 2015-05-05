import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;


public class Solution2 {
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number_of_cases = in.nextInt();
		BigInteger[] limits = new BigInteger[number_of_cases];
		for(int i=0;i<number_of_cases;i++){
			limits[i] = in.nextBigInteger();
		}
		in.close();
		for(int j=0;j< number_of_cases;j++){
            System.out.println(fibonacciLoop(limits[j]));
        }
	}
	
	public static BigInteger fibonacciLoop(BigInteger number){
        if(number.equals(BigInteger.ONE) || number.equals(BigInteger.ZERO)){
        	return BigInteger.ZERO;
        }
        if(number.equals(BigInteger.valueOf(2))){
        	return BigInteger.valueOf(2);
        }
        BigInteger sum = BigInteger.valueOf(2);
        BigInteger fibo1=BigInteger.ONE, fibo2=BigInteger.valueOf(2), fibonacci=BigInteger.ZERO;
        while(fibo1.add(fibo2).compareTo(number) <= 0){
            fibonacci = fibo1.add(fibo2); 
            fibo1 = fibo2;
            fibo2 = fibonacci;
            if(fibonacci.mod(BigInteger.valueOf(2)) == BigInteger.ZERO){
            	sum = sum.add(fibonacci);
            }
        }
        return sum;
    }  
	
	
}
