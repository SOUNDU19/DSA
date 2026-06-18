import java.util.Scanner;

public class binary_search {
	
	public static int binarySearch(int arr[], int key) {
		int low = 0;
		int high = arr.length- 1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid]==key) {
				return mid;
			}
			else if(key > arr[mid]) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //only for sorted array bcz we can divide 
		//linear search can be applied on both
		//binary for larger size elements
		
		//step1:var left=0 and right=array.length-1
		//step2 mid =left+right/2
		//step3 if key==arr[mid] ==>found stop
		//if not
		//step4 check if key <arr[mid]
		//step5 left =0 right=mid
		//step6 check if key>mid
		//if not
		//step7 left=mid+1 and right = array.length-1
		Scanner sc = new Scanner(System.in);
	     System.out.println("Enter the size of the array:");
	     int size = sc.nextInt();
	     int arr[] = new int[size];
	     System.out.println("Enter the elements of the array:");
	     for(int i=0; i<size;i++) {
	    	 arr[i]=sc.nextInt();
	     }
	     System.out.println("Enter the element to be search:");
	     int key = sc.nextInt();
	     int result = binarySearch(arr, key);
	     if(result == -1) {
		     System.out.println("key not found:");
	     }
	     else {
		     System.out.println("Key found:");

	     }
		
	}
}
