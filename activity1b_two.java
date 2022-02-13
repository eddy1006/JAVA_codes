import java.util.Scanner;

class SortingWithoutInbuilt{

	public static int compare(String one,String two){
	
		int min = one.length()<two.length() ? one.length() : two.length();
		for(int i=0;i<min;i++){
		     if(two.charAt(i)>one.charAt(i))
			return 1;
		     if(one.charAt(i) > two.charAt(i))
			return 0;
		}	
		return 1;
	}

	public static void main(String args[]){
		int n;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter the no of strings you wish to enter");
		n = s1.nextInt();
                s1.nextLine();
		String[] array = new String[10];
	        System.out.println("Please enter strings to sort");              
        	for (int i = 0; i < n;i++){
	            array[i] = s1.nextLine();
	    	    }
		for(int i = 0; i<n-1; i++)   
		{  
		 for (int j = i+1; j<n; j++)   
		  {  
		//compares each elements of the array to all the remaining elements  
			if(compare(array[i],array[j]) == 1)   
			{  
				//swapping array elements  
				String temp = array[i];  
				array[i] = array[j];  
				array[j] = temp;  
			}  
		   }  
		}
		System.out.println("Sorted array is as follows:");  
		for(int i=0;i<n;i++){
			System.out.println(array[i]);
		}
	}
   
}