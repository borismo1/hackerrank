import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution4 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] limits_array = new int[N];
        int[] palindroms_array = palindromArray();
        for(int i = 0 ; i<N;i++){
            limits_array[i] = input.nextInt();
        }
        for(int i = 0 ; i < N ;i++){
           for(int j = 0 ; j < palindroms_array.length;j++){
               if(palindroms_array[j] > limits_array[i]){
                   System.out.println(palindroms_array[j-1]);
                   break;  
               }
        }
                                    }
    }
    
    
    public static int[] palindromArray(){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 100 ; i < 1000;i++){
            for(int j = i; j< 1000;j++){
                if(isPalindrom(i*j)){
                    if(i*j < 999999 && i*j > 100000 && !list.contains(i*j)){
                        list.add(i*j);
                    }
                }
            }
        }
        Collections.sort(list);
        int[] output = new int[list.size()];
        for(int i = 0 ; i < list.size() ; i++){
            output[i] = list.get(i);
        }
        return output;
    }
    
    
    
    
    public static boolean isPalindrom(int input){
        String str = Integer.toString(input);
        int length = str.length();
        for(int i = 0 ; i < length /2;i++ ){
            if(str.charAt(i) != str.charAt(length  - 1 -i)){
                return false;
            }
        }
        return true;
    }
}
