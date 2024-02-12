import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner= new Scanner(System.in);
        shuffleArray();
        int correct = 0;
        while (correct <3) {
            for (int attempt = 0; attempt < 5; attempt++) {
                System.out.println("Enter 3 kilometers , where cargo could be buried :");
                int km1 = scanner.nextInt() - 1;
                int km2 = scanner.nextInt() - 1;
                int km3 = scanner.nextInt() - 1;
                if (myArray[km1] == 1) {
                    correct++;
                }
                if (myArray[km2] == 1) {
                    correct++;
                }
                if (myArray[km3] == 1) {
                    correct++;
                }
                System.out.println("Amount of correctly entered kilometers: " + correct);
                if (correct == 3) {
                    System.out.println("You found all boxes!");
                    break;
                } else {
                    System.out.println("Try again , Attempts left:" + (5 - (attempt + 1)));
                }
                correct=0;
            }
            if(correct<3) {
                System.out.println("Boxes have changed their locations !");
                shuffleArray();
            }
        }
    }
    private static Integer[] myArray ={1,1,1,0,0,0,0};

    private static void shuffleArray(){
        List<Integer> myList=Arrays.asList(myArray);
        Collections.shuffle(myList.subList(0,7), new Random());
        //for checking add printout)
    }
}
