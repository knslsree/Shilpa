
public class Lowest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				// TODO Auto-generated method stub
	
		        int[] arr = {25, 86, 41, 97, 22, 34,23,89,91,20};
		        //initialize with largest possible value
		        int smallest = Integer.MAX_VALUE;
		        //find smallest element of array
		        int index=0;
		        while(index<arr.length) {
		            //check if smallest is greater than element
		            if(smallest>arr[index]) {
		                //update smallest
		                smallest=arr[index];
		            }
		            index++;
		        }
		        System.out.println("The smallest number is : "+ smallest);
		    }
		}

