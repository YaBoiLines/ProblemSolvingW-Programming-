import java.util.Scanner;

public class AverageTestScore {
    public static void main(String[] args){
        Scanner value = new Scanner(System.in);
        double score1,score2, score3;
        double average;

        System.out.println("what is the first test score");
        score1 = value.nextDouble();

        System.out.println("what is teh second score?: ");
        score2 = value.nextDouble();

        System.out.println("What is teh third score?: ");
        score3 = value.nextDouble();

        average = (score1 + score2 + score3)/3;
         if (average >=90) 
         {
            System.out.println("Great job!");
         }


    }
    
}
