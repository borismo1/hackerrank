import java.util.Scanner;


public class Solution73{

	public static void main(String[] args) {
		int max_denum;
		int given_denum;
		Scanner in = new Scanner(System.in);
        given_denum = in.nextInt();
		max_denum = in.nextInt();

	}

    private static int counter =0;
	
	public static void recurr(int a,int b,int max_denum){
		if(a + b <= max_denum){
			counter++;
			recurr(a+b,a, max_denum);
			recurr(a+b,b, max_denum);
		}
	}
    
}
