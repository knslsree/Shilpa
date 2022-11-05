
public class Arraysorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    
		        //Initialize array   
		        int [] arr =  {1,2,3,4,5,6,7,8,9,10,11,12,13,1,4,15,16,17,18,19,20};   
		        
		        int temp = 0;  
		          
		        //Displaying elements of original array  
		        System.out.println("Elements of original array: ");  
		        for (int i = 0; i < arr.length; i++) {   
		            System.out.print(arr[i] + " ");  
		        }  
		          
		        //Sort the array in descending order  
		        for (int i = 0; i < arr.length; i++) {   
		            for (int j = i+1; j < arr.length; j++) {   
		               if(arr[i] < arr[j]) {  
		                   temp = arr[i];  
		                   arr[i] = arr[j];  
		                   arr[j] = temp;  
		               }   
		            }   
		        }  
		          
		        System.out.println();  
		          
		        //Displaying elements of array after sorting  
		        System.out.println("Elements of array sorted in descending order: ");  
		        for (int i = 0; i < arr.length; i++) {   
		            System.out.print(arr[i] + " ");  
		        }  
		    }  
		}  
	


