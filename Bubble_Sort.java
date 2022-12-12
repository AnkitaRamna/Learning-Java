import java.util.Scanner;

class Bubble_Sort{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size of Array : ");
		int n = sc.nextInt();
		
		System.out.println("Enter Elements in Array : ");
		int []arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] =  sc.nextInt();
		}
		
		int temp=0;
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-1-i;j++){
				if(arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println("After Sort Using Bubble Sort : ");
		
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
			
		}
		
	}
}