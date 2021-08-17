//Write a Java program to find the common elements between two arrays.
Create and initialize two arrays.

public class Main{
	public static void main(String[] args) {
	    int[] arr1={1,2,3,4,5,6,7,8,9};
	    int[] arr2={4,10,12,5,23,6,15,19,8};
	    for(int i=0;i<arr1.length;i++){
	        for(int j=0;j<arr2.length;j++){
	            if(arr1[i]==arr2[j]){
	                System.out.println(arr1[i]);
	                arr2[j]=0;
	            }
	            else{
	                continue;
	            }
	        }
	    }
	    
	}
}
