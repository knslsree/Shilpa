
public class DivisiblebySeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int sum = 0, count = 0;
		 for (int i = 0; i <50; i++)
		 {
		     if (i % 7 == 0)
		     {
		         sum = sum + i;
		         count++;
		     }
		 }
		 System.out.println("The Sum of the number between 0 to 50 which are divisible by 7 is: "+sum);
		
		 }
}
		  
	


