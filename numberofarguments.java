//Write a program to print all the arguments passed to a FindArguments.java program.

public class Main
{
	public static void main(String[] args) 
	{
	    System.out.println("the number of arguments are: " +args.length);
	    System.out.println("the argumwnts are:");
	    for(int i=0;i<args.length;i++)
	    {
	        System.out.println((i+1)+") "+args[i]);
	    }
	}
	   
}