import java.util.Scanner;

public class linearsearch_string {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size of the array:");
     int size = sc.nextInt();
     String arr[] = new String[size];
     boolean found = false;
     System.out.println("Enter the elements of the array:");
     for(int i=0; i<size;i++) {
    	 arr[i]=sc.next();
     }
     System.out.println("Enter the element to be search:");
     String key = sc.next();

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
   	 if(key.equals(arr[i]))//key.equals(arr[i]) this is for string search
   	 {
   	     System.out.println("elemnets found:");
   	     return;//return to jvm
   	 }
    }
   System.out.println("elemnets not found:");


   	 }
     }
      
	


