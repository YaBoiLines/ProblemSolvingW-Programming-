import java.util.Scanner;

public class Projectile
 {


    public static void main(String[] args)
    {
        Scanner value = new Scanner(System.in);

        System.out.println("Enter the initial height (in meters): ");
        double iniHeight = value.nextDouble();

        System.out.println("Enter the initial velocity (in meters per second): ");
        double iniVelocity = value.nextDouble();

        System.out.println("Enter the time elapsed since launch (in seconds): ");
        double time = value.nextFloat();

        double accel = -9.80665;

        double Velocity = accel * time + iniVelocity;
        double Height = 0.5 * accel * time * time + iniVelocity * time + iniHeight;

        System.out.println("The current velocity of the projectile is: " + Velocity + " m/s");
        System.out.println("The current height of the projectile is: " + Height + " m");
    }
}