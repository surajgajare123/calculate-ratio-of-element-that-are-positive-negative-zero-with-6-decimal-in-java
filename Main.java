import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the length of array : ");
	int n = sc.nextInt();
	int[] arr = new int[n];
	System.out.println("Enter the element is array : ");
	for(int i = 0; i < n; i++){
	    arr[i] = sc.nextInt();
	}
	for(int i =0; i < n; i++){
	    System.out.println("element in array is : " + arr[i]);
	}
	int positive = 0;
	int negative = 0;
	int zero = 0;
	for(int num : arr){
	    if(num > 0){
	        positive++;
	    }
	    else if(num < 0){
	        negative++;
	    }
	    zero++;
	}
	double total = n;
	double positiveRatio = positive/total;
	double negativeRatio = negative/total;
	double zeroRatio = zero/total;
	System.out.printf("%.6f%n", positiveRatio);
    System.out.printf("%.6f%n", negativeRatio);
    System.out.printf("%.6f%n", zeroRatio);
	}
	
}
