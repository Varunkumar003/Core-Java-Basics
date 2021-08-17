//Write a program to find the largest 2 numbers and the smallest 2 numbers in the array initialized from the command line arguments.

public class Main
{
	public static void main(String[] args) { 
        int max=Integer.parseInt(args[0]);
        int smax=0;
        int min=Integer.parseInt(args[0]);
        int smin=0;
        for(String i : args)
        {
            int num=Integer.parseInt(i);
            if(max<num)
            {
                smax=max;
                max=num;
            }
            else if(min>num)
            {
                smin=min;
                min=num;
            }
        }
        
        System.out.println("Largext : "+max);
        System.out.println("second largest :"+smax);
        System.out.println("smallest : "+min);
        System.out.println("second smallest :"+smin);
	}
}

