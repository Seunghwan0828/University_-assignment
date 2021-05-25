package test;
import java.util.Scanner;

public class Fibonacci {
	 
    public static void main(String[] args) {
    	System.out.print("몇번째를 출력하시겠습니까? : ");
    	Scanner s = new Scanner(System.in);
    	int input;
    	input = s.nextInt();
        
    	double f1 = 1;
        double f2 = 1;
        double f3;
        if(input == 1)
        	System.out.printf("%.0f\n",f1);
        else if(input == 2) {
        	System.out.printf("%.0f\n",f1);
        	System.out.printf("%.0f\n",f2);
        }
        else {
        	System.out.printf("%.0f\n",f1);
        	System.out.printf("%.0f\n",f2);
        	for(int i=2; i<input; i++){
        		f3=f1+f2;
        		System.out.printf("%.0f\n",f3);
        		f1=f2;
        		f2=f3;
        	}
        }        
    }
}