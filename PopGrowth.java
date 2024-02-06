import java.util.Scanner;

public class PopGrowth {

    public static void main(String[] args){

        Scanner value = new Scanner(System.in);

        double iniPop;
        double growRate;
        double duration;
        int finPop;
        double timeElapsed = 0.0;
        int generation = 0;

        System.out.printf("\n\n**************************************\n");
        System.out.printf("*                                    *\n");
        System.out.printf("*  Welcome to the Population Growth  *\n");
        System.out.printf("*  Calculation Program (C) 2022      *\n");
        System.out.printf("*                                    *\n");
        System.out.printf("**************************************\n\n\n");

        System.out.printf("Enter Initial Population: \n");
        iniPop = value.nextDouble();

        System.out.printf("Enter Growth Rate: \n");
        growRate = value.nextDouble();

        System.out.printf("Enter Period: \n");
        duration = value.nextDouble();

        System.out.printf("Enter Final Population: \n");
        finPop = value.nextInt();

        System.out.printf("%s %10s %10s\n", "Gen. No.", "Duration", "Population" );
        System.out.printf("%s %10s %10s\n", "========", "========", "==========" );

        double curPop = iniPop;

        while (curPop < finPop) {
            System.out.printf("%5d %10.1f %10.0f\n", generation, timeElapsed, curPop);
            curPop *= growRate;
            timeElapsed += duration;
            generation++;

        }
        System.out.printf("%5d %10.1f %10.0f\n", generation, timeElapsed, curPop);

        System.out.printf("\nTotal Duration to exceed %d: %.1f hours\n", finPop, timeElapsed);
        System.out.printf("Total Number of Generations: %d\n\n", generation);


    }
    
}
