import java.util.Scanner;
class AverageOfN{

	public static void main(String as[]){

		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		double average;
		for(int i=1;i<=n;i++){
			sum+=i;
		}
		
		average=(double)sum/(double)n;

		System.out.println("Average : "+average);
	}

}