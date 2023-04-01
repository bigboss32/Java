package competencia;
import java.util.*;
import java.lang.*;
import java.io.*;

 
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		for(int i = 1;i<=testCase;i++){
			int n = scan.nextInt();
			int[] arr = new int[n];
			for(int j = 0;j<n;j++){
				arr[j] = scan.nextInt();
			}
			System.out.println("Case " + i + ": " + arr[n/2]);
		}
	}
}