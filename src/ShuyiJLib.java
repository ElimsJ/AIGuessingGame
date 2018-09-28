import java.util.Scanner;

public class ShuyiJLib {
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Input A Number For Ai To guess");
        int userInput = input.nextInt();
        int max = 100;
        int min = 0;
        int range = max - min;
        double randomInt = range /2;
        int computerGuess = (int)randomInt;
        System.out.println("AI guessed" + " " +computerGuess);
        Scanner computerInput = new Scanner(System.in);
        System.out.println("Give the AI a Hint");
        String userHint = computerInput.nextLine();
        while(computerGuess != userInput) {
            if(userHint.equals("correct"))
            {
                System.out.println("AI guessed the number " + " "+ computerGuess);
                System.out.println("computerWon");
            }
            if(userHint.equals("lower"))
            {
                max = computerGuess;
                range = max-min;
                range = range/2;
                randomInt = computerGuess-range;
                computerGuess = (int)randomInt;
                System.out.println("AI guessed the number " + " "+ computerGuess);
            }
            if(userHint.equals("higher"))
            {
                min = computerGuess;
                range = max - min;
                range = range/2;
                randomInt = computerGuess+range;
                computerGuess = (int)randomInt;
                System.out.println("AI guessed the number " + " "+ computerGuess);
            }
            userHint = computerInput.nextLine();
        }
    }
}
