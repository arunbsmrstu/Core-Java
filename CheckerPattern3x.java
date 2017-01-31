import java.util.Scanner;
class CheckerPattern3x{


	public static void main(String as[]){
			
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();

		for(int row=n;0<row;row--){
				int k=row;
			for(int col=0;col<row;col++){
				while(k!=n){
					System.out.print("  ");
					k++;
				}
				 System.out.print("# ");	
			}
			System.out.println();
		}
	}

}