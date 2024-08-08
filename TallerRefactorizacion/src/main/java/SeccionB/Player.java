/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SeccionB;

/**
 *
 * @author erick
 */
import java.util.Random;

public class Player {
    int wins;      
    int winTotal;
    private Selection selection;

    public String makeChoice() {
        selection = getRandomSelection();
        return selection.getChoice();
    }

    private Selection getRandomSelection() {
        Random random = new Random();
        int c = random.nextInt(3);
        switch (c) {
            case 0:
                return new Rock();
            case 1:
                return new Paper();
            case 2:
                return new Scissors();
            default:
                throw new IllegalStateException("Unexpected value: " + c);
        }
    }

    public int setWins(){
        winTotal = ++wins;
        return winTotal;
    }

    public int getWins(){
        return wins;
    }
}