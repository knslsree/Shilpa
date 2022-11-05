import java.util.*;

public class Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double[] arr = {5,8,9};


Scanner sc = new Scanner(System.in);
//System.out.println("Enter average of your marks (less than 10)");
int average= (int)(arr[0]+arr[1]+arr[2])/3;
char grade=0;

if(average>=9){
   grade = 'A';
}else if(average>=7 && average<9){
   grade = 'B';
}
else if(average==6){
   grade = 'C';
}


switch(grade) {
   case 'A' :
      System.out.println("Excellent!");
      break;
   case 'B' :System.out.println( "Well Done");
   break;
   case 'C' :
      System.out.println("Pass and the student has cleared the course");
      break;
   
}
System.out.println("Your grade is " + grade);
}
}


	


