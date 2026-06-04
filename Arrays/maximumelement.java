import java.util.Scanner;

public class maximumelement {

	public static void main(String[] args) {
		System.out.println("Enter the size of the students");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
	    int arr[]= new int[5];
		System.out.println("Enetr the array elemnts");
		for(int i = 0; i<=size-1; i++) {
			arr[i] = scan.nextInt();	
		}
		int max = arr[0];
		for(int i =0;i<size;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.print("[");
		for(int i =0;i<=size-1;i++) {
			if(i == size-1) {
				System.out.print(arr[i]+"]");	
				break;
			}
			System.out.print(arr[i]+",");			
		}
		System.out.println("maximum element in the array is :"+max);

	}

}
