import java.util.Scanner;
class CheckerPattern5x{


	public static void main(String as[]){
			
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int row=1;row<=n;row++){
				int k=1;
			for(int col=n;col>0;col--){
				
				if(col>row){
					System.out.print("  ");
				}
				else{
					
					System.out.print(k+" ");
					k++;
				}
				
				
			}
			System.out.println();
		}
	}

}