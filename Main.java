import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner= new Scanner(System.in);
        int[] myArray = new int [7];
        int[] km_inputs= new int[3];
        System.out.println("Enter 3 spots , where cargo could be:");
        for (int i =0; i<km_inputs.length; i++){
            km_inputs[i]=scanner.nextInt()-1;
        }
        int count= 0;
        for (int i = 0; i<myArray.length; i++ ){
            if(count<3) {
                myArray[i] = random(myArray[i]);
                if(myArray[i]==1){
                    count++;
                }
            }
            if(i>=5 && count!=3 ){
                myArray[i]=1;
            }
            System.out.print(myArray[i]+" ");
            if(count>3){
                myArray[i]=0;
            }
        }
        int right =0;
        while(right==3){
                for(int i =0; i<km_inputs.length; i++){
                    int x = km_inputs[i];
                    checking(myArray[x],right);

                }
                System.out.println("Amount of correctly entered kilometers:  "+ right);

                if(right==3){
                    System.out.println("Congratulations ! You found all boxes!");
                    System.exit(0);
                }

        }
    }
    public static  int random(int a){
        Random random = new Random();
        a = random.nextInt(2);
        return a;

    }
    public static int checking (int a, int b){
        if(a==1){
            b++;
        }
        return b;
    }
}
