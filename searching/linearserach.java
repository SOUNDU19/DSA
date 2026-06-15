import java.util.Scanner;

public class linearserach {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size of the array:");
     int size = sc.nextInt();
     int arr[] = new int[size];
     boolean found = false;
     System.out.println("Enter the elements of the array:");
     for(int i=0; i<size;i++) {
    	 arr[i]=sc.nextInt();
     }
     System.out.println("Enter the element to be search:");
     int key = sc.nextInt();

//     for(int i=0; i<arr.length; i++) {
//    	 if(key==arr[i]) {
//    	     found = true;
//    	     System.out.println("elemnets found:");
//    	     break;
//    	 }
//     }
//   if(!found) {
//    	   System.out.println("elemnets not found:");
//   }
     
     
	//other  type
	for(int i=0; i<arr.length; i++) {
   	 if(key==arr[i])//key.equals(arr[i]) this is for string search
   	 {
   	     System.out.println("elemnets found:");
   	     return;//return to jvm
   	 }
    }
   System.out.println("elemnets not found:");


   	 }
     }
      
	


