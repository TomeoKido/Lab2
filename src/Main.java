import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int size = 0;
        System.out.println("Enter number of symbols (5-20):");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        if(size < 5 || size > 20 ) System.out.println("Incorrect number.");
        else {
            PassGenerator pasGen = new PassGenerator();
            String genPass = pasGen.getPass(size);
            System.out.format("Your password is: ").println(genPass);
        }
    }
}
