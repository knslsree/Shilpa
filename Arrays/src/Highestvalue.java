
public class Highestvalue {

	
		// TODO Auto-generated method stub
		
		
		    static   int[] arr = {25, 86, 41, 97, 22, 34,35,67,89,90};
		        //initialize with largest possible value
		
		               
		             // Method to find maximum in arr[]
		             static int largest()
		             {
		                 int i;
		                   
		                 // Initialize maximum element
		                 int max = arr[0];
		                
		                 // Traverse array elements from second and
		                 // compare every element with current max  
		                 for (i = 1; i < arr.length; i++)
		                     if (arr[i] > max)
		                         max = arr[i];
		                
		                 return max;
		             }
		               
		             // Driver method
		             public static void main(String[] args) 
		             {
		                 System.out.println("Largest in given array is " + largest());
		                }
		         }