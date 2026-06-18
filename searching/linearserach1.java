import java.util.Scanner;

public class linearserach1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//take the size of the products
		//take the products string and store in the array
		//take the user input to serach the key product
		//iterate over the array to serach the product
		//logic- for i = 0 to array.lentgh
       //if keystring = array[i]
		//print found and stop traversing
		//if not continue to nxt
		Scanner sc = new Scanner(System.in);
		System.out.println("size");
		int size = sc.nextInt();
		String arr[] = new String[size];
		System.out.println("enter the products");
		for(int i =0;i<size;i++) {
			arr[i] = sc.next();
		}
		String key = sc.next();
		for(int i =0;i<size;i++) {
			if(key.equals(arr[i])) {
		       System.out.println("found");
		       return;//*****imp
               }
			
		}	
		
	       System.out.println("not found");//***

	}

}
