import java.util.Scanner;
class CheckerPattern2x{


	public static void main(String as[]){
			
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();

		for(int row=8;0<row;row--){
			for(int col=0;col<row;col++){
				System.out.print("# ");
				
			}
			System.out.println();
		}
	}

}