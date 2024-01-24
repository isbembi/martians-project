import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner= new Scanner(System.in);
        int[] myArray = new int [7];
        int[] km_inputs= new int[3];

        for (int i =0; i<km_inputs.length; i++){
            km_inputs[i]=scanner.nextInt()-1;
        }
        for (int i = 0; i<myArray.length; i++ ) {
            int count= 0;
            myArray[i]= random.nextInt(2);
            if(myArray[i]==1 && count<3){
                count ++;
            }
            else if(myArray[i]==1 && count>3){
                myArray[i]=0;
            }
        }
        int trues=0;
         while (trues ==3){
             for (int i= 5; i>0 ; i--){
                 for (int j=0; j< km_inputs.length  ; j++) {
                     int x = km_inputs[j];
                     if(x == myArray[x] && myArray[x]==1){
                         trues++;
                     }
                 }
                 if(trues==3){
                     System.out.println("Correctly entered spots: "+ trues);
                     System.out.println("Congratulations, You found all boxes!");
                     break;
                 }
                 else {
                     System.out.println("Correctly entered spots: "+ trues +" try ine more time!");
                 }
             }
             System.out.println("Boxes changed their locations (((");
             for (int i = 0; i<myArray.length; i++ ) {
                 int count= 0;
                 myArray[i]= random.nextInt(2);
                 if(myArray[i]==1 && count<3){
                     count ++;
                 }
                 else if(myArray[i]==1 && count>3){
                     myArray[i]=0;
                 }
             }
         }
    }
}
