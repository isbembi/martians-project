import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int[] myArray = new int [7];
        int count= 0;
        for (int i = 0; i<myArray.length; i++ ){
            if(count<3) {
                myArray[i] = random(myArray[i]);
                if(myArray[i]==1){
                    count++;
                }
            }
            if(i>=5 && count<3 ){
                myArray[i]=1;
            }
            if(count>3 && i >5){
                myArray[i]=0;
            }
            System.out.print(myArray[i]+" ");
        }

        int correct = 0;
        while (correct <3){
            for (int attempt=0; attempt<5; attempt++){
                System.out.println("Enter 3 kilometers , where cargo could be buried :");
                int km1 = scanner.nextInt()-1;
                int km2 = scanner.nextInt()-1;
                int km3 = scanner.nextInt()-1;
                if(myArray[km1]==1){
                    correct++;
                }
                if(myArray[km2]==1){
                    correct++;
                }
                if(myArray[km3]==1){
                    correct++;
                }
                System.out.println("Amount of correctly entered kilometers: "+correct);
                if(correct==3){
                    System.out.println("You found all boxes!");
                    break;
                }
                else{
                    System.out.println("Try again , Attempts left:" +(5-attempt));
                }
                correct=0;
            }
        }

    }
    public static  int random(int a){
        Random random = new Random();
        a = random.nextInt(2);
        return a;

    }
}
