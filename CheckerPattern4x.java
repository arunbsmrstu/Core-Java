import java.util.Scanner;
class CheckerPattern4x{


	public static void main(String as[]){
			
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();

		for(int row=1;row<=n;row++){
				
			for(int col=row;col>0;col--){
				System.out.print(col+"   ");
			}
			System.out.println();
		}
	}

}