package FirstProg;
import java.util.*;
import java.util.Scanner;
public class Micro {
public static void main(String[] args)
{
	
	Scanner s=new Scanner(System.in);
	System.out.println("enter array size");
	int n=s.nextInt();
	int[] arr=new int[n];
    System.out.println("enter array value");
    for(int i=0;i<n;i++)
    {
    	arr[i]=s.nextInt();
    }
    System.out.println("enter k value");
    int k=s.nextInt();
    int min=999;
    for(int i=0;i<n;i++)
    {
    	if(arr[i]<min)
    		min=arr[i];
    }
    int res=k-min;
    System.out.println(res);    
}
}
