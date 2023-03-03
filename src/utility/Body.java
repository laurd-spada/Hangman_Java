package utility;

import services.StartGameImp;

public class Body {
    public void startHangman(){
        // A welcome introduction to the game for players
        System.out.println("Welcome to the hangman game === JAVA EDITION ===");
        System.out.println(" === prod. by Lawrd Sparda === \n");
        System.out.println("You are provided with a Secret-character and expected to guess the characters to fill that position");
        System.out.println("Make a guess");
        StartGameImp startGameImp = new StartGameImp();
        startGameImp.gameIntro();
    }
}
