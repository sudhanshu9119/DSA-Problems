package searchingAndSorting;

public class Binarysearch {

	public static int binarySearch(int arr[] , int key) {
		int s=0, e=arr.length-1;
		int mid = s+(e-s)/2;
		
		while (s<=e) {
			if (key == arr[mid]) {
				return mid;
			} else if (key > arr[mid]) {
				s = mid+1;
			}else if(key <arr[mid]) {
				e = mid-1;
			}else {
				return -1;
			}
		}
	return mid;	
	}
	
	
	public static void main (String[] args) {
		int num[] = {1,3,7,9,11,12,45,};
		binarySearch(num,3);
	}
}
