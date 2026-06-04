import java.util.Scanner;

public class array1 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the size of the students");
	int size = scan.nextInt();
     int arr[]= new int[5];
	System.out.println("Enetr the array elemnts");
	for(int i = 0; i<=size-1; i++) {
		arr[i] = scan.nextInt();	
	}
	System.out.print("[");
	for(int i = 0; i<=size-1; i++) {
	
		if(i == size-1) {
			System.out.print(arr[i]+"]");
			break;
		}
		System.out.print(arr[i]+",");	
	}
 }
}
