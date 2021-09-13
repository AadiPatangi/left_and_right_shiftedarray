import java.util.Scanner;
public class rightshiftedarray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter values for the array");
		for (int x = 0; x<arr.length;x++) {
			arr[x] = scan.nextInt();
		}
        for (int x = 0; x<arr.length;x++) {
        	System.out.println(" "+arr[x]);
        }
        //1 2 3 4 5 
        //5 4 3 2 1 
        int y = arr[arr.length-1];
        
        for(int i = arr.length-1;i>0;i--) {
        	arr[i] = arr[i-1];
        }
        System.out.println("****************************\n Right shifted Array:");
        arr[0] = y;
        for (int x =0;x<arr.length;x++ ) {
        	System.out.println(" "+arr[x]);
        }
	}

}
