import java.util.Scanner;

public class Charexample {

    public static void main(String[] args){
        Scanner value = new Scanner(System.in);
        int num;
        String name;
        char resp;

        System.out.println("Enter a number: ");
        num = value.nextInt();

        value.nextLine();

        System.out.println("Enter name");
        name = value.nextLine();
        System.out.println("Name is: " +name);
        System.out.printf("Number is: " + num);






    }
    
}
