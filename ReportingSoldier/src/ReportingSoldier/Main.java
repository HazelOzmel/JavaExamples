package ReportingSoldier;

import java.util.Scanner;

public class Main {
	
	public static void reporting_rank(int[] ranks) 
	{
		
		  int reporting_soldier = 0;
	      
	      for (int i = 0; i < ranks.length; i++) 
	      {
	    	  int r = ranks [i]+1;
	          for (int j = 0; j < ranks.length; j++) 
	          { 
	        	  
	        	  if(ranks[j] == r) 
	        	  {
	        		  reporting_soldier +=1 ;
	        		  break;
	        	  }
	          }
	      }
	        
			System.out.println("The number of soldiers who can report to some Superior: " + reporting_soldier);
	}
	
	public static int[] getArray() 
	{
    	
		int count;
    	//User inputs the array size
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements you want in the array: ");
        count = scan.nextInt();
    
        int num[] = new int[count];
        System.out.println("Enter array elements:");
        
        for (int i = 0; i < count; i++) 
        {
            num[i] = scan.nextInt();
        }
        scan.close();
        
       return num;
	}
	
	public static void main(String[] args) 
	{
	
		reporting_rank(getArray());
		
	}
}
