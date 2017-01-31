import java.util.Scanner;
class CheckerPattern1x{


	public static void main(String as[]){
			
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();

		for(int row=1;row<=n;row++){
			if(row%2==0)
				{
				System.out.print(" ");
				}
			for(int col=1;col<=n/2;col++){
				System.out.print("# ");
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}