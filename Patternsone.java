import java.util.Scanner;
class Patternsone{


	public static void main(String as[]){
			
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int row=1;row<=n;row++){
				
			for(int col=1;col<=n;col++){
				
				 if(row!=1 && col!=1 && row!=n && col!=n)
					System.out.print(" ");
				else
				     System.out.print("#");
			}
			System.out.println();
		}
	}

}