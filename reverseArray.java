import java.util.Scanner;

public class reverseArray {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int []A = new int[size];
		
		for (int i=0 ; i < size ; i++) {
			A[i] = sc.nextInt();
		} 
		
		int rotator = sc.nextInt();
		
		reverse(A, 0, rotator-1);
		reverse(A, rotator, size-1);
		reverse(A, 0, size-1);
		
		
		for(int k=0 ; k<size ; k++) {
			System.out.print(A[k]);
		}
	}
	
	
	public static void reverse(int A[], int start, int end) {
		
		while(start < end) {
			
			A[start] = A[start] + A[end];
			A[end] = A[start] - A[end];
			A[start] = A[start] - A[end];
			
			start++;
			end--;
		}
		
		
	}
}
