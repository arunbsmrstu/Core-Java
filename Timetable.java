import java.util.Scanner;
class Timetable{


	public static void main(String as[]){
			
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int row=1;row<=n;row++){
				
			for(int col=1;col<=n;col++){
				
				System.out.print(row*col+" ");
				
			}
			System.out.println();
		}
	}

}