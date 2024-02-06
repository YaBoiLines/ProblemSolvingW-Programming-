import java.util.Scanner; 

public class XY {
    public static void main(String[] args){
        Scanner value = new Scanner(System.in);
        double x, y;
        double answer;

        System.out.println(" Enter value for x: ");
        x = value.nextDouble();

        System.out.println("Enter value for y: ");
        y = value.nextDouble();

        if (y == 0){
            System.out.println("Error");

        }
        else{
            answer = (x/y);
            System.out.println("The answer is "+answer);

        }
    }
    
}
