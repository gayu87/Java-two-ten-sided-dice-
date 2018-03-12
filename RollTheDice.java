/**********************************************************************************

//
// Title:    rolls dice.
// Course:     CSC 3020
// Homework:   4-3
// Author:     Gayatari patel
// Date:       26 October 2016
// Description: java program that  repeatedly rolls two ten-sided dice and tabulates the results.
//
//**********************************************************************************
 */


public class RollTheDice {
    
	 // .... main
 
    public static void main(String[] args) {
    
        int die1;   
        int die2;  
        int roll;   
        int total=0;
        int totalnumberofRolle=1;
        double totalPercentage = 0.0;
         int totalRolls = 100000; 
        int[] Array = new int[21];
        // for loop  Roll the dice 100,000 times. 
        for(int i=0;i<totalRolls;i++)
        {
        	// generating random number from 1-10
        die1 = (int)(Math.random()*10) + 1; 
        die2 = (int)(Math.random()*10) + 1; 
        roll = die1 + die2;
        Array[roll]++;
        totalnumberofRolle=i+1;
        }    
        for (int i = 0; i < Array.length; i++)
    	{
    		total+=Array[i];	
    	}  
        System.out. println("Welcome to program");
        System.out. println("....................");
       System.out. println("Sum    count     Percent");
       totalPercentage= (double)totalnumberofRolle/1000;
        // for loop for sum range from 2-20
       for (int i = 2; i < Array.length; i++)
   	{
    	      // 
   		System.out.printf("%2d%,9d%10.2f\n",i,Array[i],( 100*(double)Array[i]/total) );
   	
   	}
       System.out.println();
       System.out.printf("%-30s%,2d%n","total number of rolls:        ",totalnumberofRolle);
       System.out.printf("%-30s%2.2f%%","total percentage of rolls: ", totalPercentage);
       System.out. println("\n\nEnd of program");
    }  // end main
 
}  // end class