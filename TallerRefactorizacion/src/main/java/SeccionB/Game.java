/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SeccionB;

/**
 *
 * @author jorge
 */
class Game {
    private Player player1;
    private Player player2;
    private int roundsPlayed;
    private int draws;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.roundsPlayed = 0;
        this.draws = 0;
    }

    public void play() {
        while (!isGameWon()) {
            Selection p1Choice = player1.getSelection();
            Selection p2Choice = player2.getSelection();

            String winner = determineWinner(p1Choice, p2Choice);
            if (winner == null) {
                System.out.println("It's a draw!");
                draws++;
            } else {
                System.out.println(winner + " wins!");
                updateScore(winner);
            }

            roundsPlayed++;
            printScore();
        }
    }

    

    private void updateScore(String winner) {
        if (winner.equals("player1")) {
            player1.incrementWins();
        } else {
            player2.incrementWins();
        }
    }

    private boolean isGameWon() {
        boolean juegoTerminado=player1.getWins() == 3 || player2.getWins() == 3;
        return juegoTerminado;
    }

    private void printScore() {
        System.out.println("Rounds Played: " + roundsPlayed);
        System.out.println("Draws: " + draws);
        System.out.println(player1 + " Wins: " + player1.getWins());
        System.out.println(player2 + " Wins: " + player2.getWins());
    }

    public int getRoundsPlayed() {
        return roundsPlayed;
    }

    public int getDraws() {
        return draws;
    }
}
