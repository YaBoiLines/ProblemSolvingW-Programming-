import java.util.Scanner;

public class WageCalculator
{
    public static void main(String[] args)
    {
        Scanner value = new Scanner(System.in);

        char payMethod;
        final double hourPay = 25.00;
        double hoursWorked;
        String employeeName;
        double salaryPay;
        double weeklyPay;
        String payType;
        

        System.out.println("Enter your name: ");
        employeeName = value.nextLine();

        System.out.println("Are you hourly or salary? (S for salary, H for hourly)");
        payMethod = value.next().charAt(0);

        weeklyPay = 0;
        payType = "";

        if (payMethod == 'S'||payMethod == 's')
        {
            System.out.println("What is your salary?: ");
            salaryPay = value.nextDouble();
            weeklyPay = salaryPay / 52;
            payType = "Hourly";
        }
        else if (payMethod == 'H'||payMethod == 'h' )
        {
            System.out.println("Enter hours worked: ");
            hoursWorked = value.nextDouble();
            weeklyPay = (40*hourPay) + ((hoursWorked-40) * 1.5 * hourPay); 
            payType = "Salary";
        }

        System.out.println("Employee name: "+ employeeName);
        System.out.println("Type of wage: " + payType);
        System.out.printf("Weekly pay is: $%.2f\n", weeklyPay);
    }
}
    

