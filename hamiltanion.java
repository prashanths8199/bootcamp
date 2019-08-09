package FirstProg;
import java.util.*;
import java.util.Scanner;
public class Hamiltonian {
public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	System.out.println("enter number of students");
	int n=s.nextInt();
	int[] arr=new int[n];
	int count;
	System.out.println("enter marks of student's");
	for(int i=0;i<n;i++)
	{
		arr[i]=s.nextInt();
	}
	for(int i=0;i<n-1;i++)
	{
		count = n-1-i;
		for(int j=i+1;j<n;j++)
		{
			if(arr[i]>=arr[j]) count=count - 1;
			else break;
		}
		if(count == 0)
		System.out.println(arr[i]);
	}
	System.out.println(arr[n-1]);

	
}
}
