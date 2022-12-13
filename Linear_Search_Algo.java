import java.util.Scanner;

class Linear_Search_Algo{
	
	public static int L_search(int []a,int element){
		
		for(int i=0;i<a.length;i++){
			if(a[i]==element){
				return i;
			}
		}
		return -1;
	}
	
	
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of Array :");
		int n=sc.nextInt();
		
		System.out.println("Enter Element of Array :");
		int []arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter Element which you want to find :");
		int elmt = sc.nextInt();
		
		int index = L_search(arr,elmt);
		
		if(index != -1){
			System.out.println(elmt+ " is found at index : "+index);	
		}
		else{
			System.out.println("Opps ! Element "+ elmt + " is not found.");
		}
		
		
	}
}