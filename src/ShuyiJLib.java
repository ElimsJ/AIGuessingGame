import java.util.Scanner;

public class ShuyiJLib {
    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Input A Number For Ai To guess");
        int userInput = input.nextInt();
        int range = 100;
        int max = 0;
        int min = 0;
        double randomInt = Math.random()*range;
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
                range = range/max;
                randomInt = Math.random()*range;
                computerGuess = (int)randomInt;
                System.out.println("AI guessed the number " + " "+ computerGuess);
            }
            if(userHint.equals("higher"))
            {
                min = computerGuess;
                range = min*2;
                randomInt = Math.random()*range;
                computerGuess = (int)randomInt;
                System.out.println("AI guessed the number " + " "+ computerGuess);
            }
            userHint = computerInput.nextLine();
        }
    }
}
