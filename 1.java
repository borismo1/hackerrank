import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

//    private static Map<Integer,Integer> output ;
    private static BigInteger[] limits;
//    private static ArrayList<Integer> sorted_unique_limits;
    
    
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int number_of_cases = in.nextInt();
    	limits = new BigInteger[number_of_cases];
//    	sorted_unique_limits = new ArrayList<>();
    	for(int i=0; i < number_of_cases;i++){
    		limits[i] = in.nextBigInteger();
 //   		sorted_unique_limits.add(limits[i]);
    	}
    	in.close();
//    	Set<Integer> unique_limits = new HashSet<Integer>(sorted_unique_limits);
//   	sorted_unique_limits.clear();
//    	sorted_unique_limits.addAll(unique_limits);
//    	Collections.sort(sorted_unique_limits);
//    	int pointer =0;
//    	int sum = 0;
//    	output = new TreeMap<Integer, Integer>();
//    	for(int i = 0; i < sorted_unique_limits.get(pointer);i++){
//    		if(i % 3 == 0 || i % 5 == 0){
//    			sum = sum + i;
//    		}
//    		if(i == sorted_unique_limits.get(pointer) - 1  && pointer < sorted_unique_limits.size() - 1){
//    			output.put(sorted_unique_limits.get(pointer), sum);
//    			pointer++;
//    		}
//    		if(pointer == sorted_unique_limits.size() - 1){
//    			output.put(sorted_unique_limits.get(pointer), sum);
//    		}
    		
//    	}
    	for(int j=0 ;j < number_of_cases;j++){
//    		System.out.println(output.get(limits[j]));
    		System.out.println(faster(limits[j].subtract(BigInteger.ONE)));
    	}
    }
    
    public static BigInteger faster(BigInteger input){
    	BigInteger sum3 ;
    	BigInteger sum5 ;
    	BigInteger sum15;
    	int temp1 = input.compareTo(BigInteger.valueOf(3));
    	int temp2 = input.compareTo(BigInteger.valueOf(5));
    	int temp3 = input.compareTo(BigInteger.valueOf(15));
    	if(temp1 < 0 ){
    		sum3= BigInteger.ZERO;
    	}
    	else{
    		sum3 = input.divide(BigInteger.valueOf(3)).multiply(BigInteger.valueOf(3)) ;
    		sum3 = sum3.add(BigInteger.valueOf(3));
    		sum3 = sum3.multiply(input.divide(BigInteger.valueOf(3)));
    		sum3 = sum3.divide(BigInteger.valueOf(2));
    	}
    	if(temp2 < 0){
    		sum5 = BigInteger.ZERO;
    	}
    	else{
    		sum5 = input.divide(BigInteger.valueOf(5)).multiply(BigInteger.valueOf(5)) ;
    		sum5 = sum5.add(BigInteger.valueOf(5));
    		sum5 = sum5.multiply(input.divide(BigInteger.valueOf(5)));
    		sum5 = sum5.divide(BigInteger.valueOf(2));
    	}
    	if(temp3 < 0){
    		sum15 = BigInteger.ZERO;
    	}
    	else{
    		sum15 = input.divide(BigInteger.valueOf(15)).multiply(BigInteger.valueOf(15)) ;
    		sum15 = sum15.add(BigInteger.valueOf(15));
    		sum15 = sum15.multiply(input.divide(BigInteger.valueOf(15)));
    		sum15 = sum15.divide(BigInteger.valueOf(2));
    	}
    	return sum3.add(sum5).subtract(sum15);
    }
    
    
    
}
