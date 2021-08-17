//Write a program to initialize an integer array with values and check if a given number is present in the array or not. If the number is not found, it will print -1 else it will print the index value of the given  number in the array//


public class Main
{
	public static void main(String[] args) 
	{
        int[] array = {1, 4, 34, 56, 7};
        int key = 90;
        for(int i=0;i<array.length;i++)
		{
		    if(array[i]==key)
		    {
		        System.out.println(i);
		        break;
		    }
		}
        System.out.println("-1");	
	    
	}
}
