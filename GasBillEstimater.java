import java.util.Scanner; 

public class GasBillEstimater 
{
    public static void main(String[] args) {
        try (Scanner gasUse = new Scanner(System.in)) {
            double preGasRead; // Variable for the previous gas reading on meter
            double curGasRead; // Variable for the current gas reading on meter
            double monGasRead; // Variable for the total gas usage for the month

            final double firstRate = 4.00; // Sets first rate
            final double secRate = 1.28; // Sets second rate
            final double thirdRate = .59; // Sets third rate
            final double finRate = .13; // Sets final rate

            // Asks user to input gas reading at beginning of the month
            System.out.println("Enter your previous gas meter reading: ");
            preGasRead = gasUse.nextDouble();

            // Asks user to input gas reading at the current time
            System.out.println("Enter you current gas meter reading: ");
            curGasRead = gasUse.nextDouble();

            // Calculates the current gas usage based on previous and current gas readings
            monGasRead = curGasRead - preGasRead;

            double gasBill = 0;

            if (monGasRead < 0 ) {

                System.out.println("Invalid gas reading");
                
            }else if(monGasRead <= 75) { // Checks for gas uasage under 75
                gasBill = (monGasRead * firstRate); // Charges according to the first rate

            }else if (monGasRead <= 200) { // Check for gas usage under 200 to account for 1st rate capped at first 75
                gasBill = (75 * firstRate) + ((monGasRead - 75) * secRate); // Charges first rate for first 75 then substract 75 from the total gas usage
            
            } else if (monGasRead <= 450 ) { // Checks for gas usage and accounts for 1st & 2nd rates capped at 75 and 125, respectively.
                gasBill = (75 * firstRate) + (125 * secRate) + ((monGasRead - 200) * thirdRate);// Charges rate for first & second respectively then substract 20 from the total gas usage

            } else if (monGasRead > 450 ) { // For all usage above the 450 cubic meters.

                // It will charge up the max usage to the specfic rate then charge the final charge for all usage beyond 450.
                gasBill = (75 * firstRate) + (125 * secRate) + (250 * thirdRate ) + ((monGasRead - 450) * finRate);
            }

            //Prints out the total gas usage and the total cost.
            System.out.println("Your total monthly gas usage: ");
            System.out.println(monGasRead);
            System.out.printf("Your bill is $%.2f\n", gasBill );
        }



    }
}
