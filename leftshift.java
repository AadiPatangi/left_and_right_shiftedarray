import java.util.Scanner;
public class array_rotate_lefy {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter values for the array: ");
		for(int x =0;x<arr.length;x++) {
			arr[x] = scan.nextInt();
		}
		for(int x =0;x<arr.length;x++) {

		  System.out.print(" "+arr[x]);
		}
int x = arr[0];

//12  3   45  67 4
//3  45 67 4 12

for(int i=0;i<arr.length-1;i++)
{
	arr[i]=arr[i+1];
	
}

arr[arr.length-1]=x;
System.out.println("\n Left  shifted array\n :");

for(int i=0;i<arr.length;i++)
{
System.out.print("  "+arr[i]);	
}
	
