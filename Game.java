package PACKAGE_NAME;

// First commit branch game logic

public class Game {
    private Printer printer = new Printer();

    private String word; // The word to find
    private int lettersRemaining;

    private String[] letters;
    private ArrayList<String> enteredLetters;
    private ArrayList<String> foundLetters;
    private ArrayList<String> wrongLetters;
    private int lives;

    Game(String word_) {
        word = word_;
        lettersRemaining = word.length(); // Initialized as the total length of the word
        letters = new String[lettersRemaining]; // Will contain the letters of the word, each letter will be one element
        enteredLetters = new ArrayList<String>();
        foundLetters = new ArrayList<String>();
        wrongLetters = new ArrayList<String>();
        lives = 6;
    }
}

