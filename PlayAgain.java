
public class PlayAgain {
    static boolean wannaPlay(){

        LetterInput letterInput = new LetterInput();

        while(true) {
            System.out.println("Play again?(Y/N)");
            String letter = letterInput.input().toUpperCase();

            if (letter.equals("Y")) {
                return true;
            } else if (letter.equals("N")) {
                return false;
            } else {
                System.out.println("Invalid input. Please enter 'Y' or 'N' ");
            }
        }
    }
}
