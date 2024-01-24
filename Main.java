import java.util.Scanner;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Random random = new Random();
        Scanner scanner= new Scanner(System.in);
        int wholeWay = 7;
        int[] myArray = new int [wholeWay];
        int at1 = scanner.nextInt()-1;
        int at2= scanner.nextInt()-1;
        int at3= scanner.nextInt()-1;

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

    }
    public static  int random(int a){
        Random random = new Random();
        a = random.nextInt(2);
        return a;

    }
}
