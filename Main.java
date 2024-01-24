import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Random random = new Random();
        Scanner scanner= new Scanner(System.in);
        int[] myArray = new int [7];
        int[] km_inputs = new int[3];
        int count= 0;

        for (int i = 0; i<myArray.length; i++ ) {
            give_values(myArray[i], count);
            System.out.print(myArray[i]+" ");
        }
        System.out.println(count);
        int trues=0;
         while (trues ==3){
             for (int i= 5; i>0 ; i--){
                 for (int km=3; km>0; km--) {
                     int user = scanner.nextInt() - 1;
                     if (myArray[user] == 1) {
                         trues++;
                     }
                 }
                 if(trues==3){
                     System.out.println("Correctly entered spots: "+ trues);
                     System.out.println("Congratulations, You found all boxes!");
                     break;
                 }
             }
             System.out.println("Boxes changed their locations (((");
             for (int i = 0; i<myArray.length; i++ ) {
                 give_values(myArray[i],count);
             }

         }
    }
    public static  int random(int a){
        Random random = new Random();
        a = random.nextInt(2);
        return a;

    }
    public static int checking_the_cargo( int km_array, int howmanyright ){
        if(km_array==1){
            howmanyright++;
        }
        return howmanyright;
    }
     public static int give_values(int a, int x){
        Random random = new Random();
        int[] local = new int [7];
        x=0;
        for (int i = 0; i< local.length;i++) {
            local[i] = random.nextInt(2);
            a = local[i];
            if (a == 1) {
                if (x < 3 && a==1) {
                    a = 1;
                    x++;
                } else if (x== 3 && a==1) {
                    a = 0;
                }
            }
            return a;
        }
     }
}
