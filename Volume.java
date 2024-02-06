import java.util.Scanner;
public class Volume {
    
    public static void main(String[] args) 
    {

        final double PI = 3.141592;
        int radius;
        double height;
        double volume;

        Scanner buffer = new Scanner(System.in);

        System.out.println("Enter radius: " );
        radius = buffer.nextInt();

        System.out.println("Enter Height: ");
        height = buffer.nextDouble();


        volume = (height/3) *PI*radius*radius;
        
        System.out.println("Volume of cone is: " +volume);

    }
    
    
}
