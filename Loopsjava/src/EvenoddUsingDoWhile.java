
public class EvenoddUsingDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
	      do{
	    	  if (i%2==0)
				{
					System.out.println("The number "+i+" is even");
				}
					else
					{
						System.out.println("The number "+i+" is odd");
					}
	       i++;
	       }while(i<=20);
	}

}
