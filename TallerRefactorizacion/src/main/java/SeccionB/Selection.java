/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SeccionB;

/**
 *
 * @author erick
 */
public abstract class Selection {
    
    public abstract String getChoice();
    
    public  String determineWinner(Selection s1, Selection s2){
      String winner="";
      final boolean isRock1 = s1.getChoice().equals("rock");
      final boolean isPaper1 = s1.getChoice().equals("paper");
      final boolean isScissor1 = s1.getChoice().equals("scissors");
      final boolean isRock2 = s2.getChoice().equals("rock");
      final boolean isPaper2 = s2.getChoice().equals("paper");
      final boolean isScissor2 = s2.getChoice().equals("scissors");
      if ((isRock1 && isScissor2) || (isPaper1 && isRock2) || (isScissor1 && isPaper2)){
          winner="Player 1";}
      else if ((isRock2 && isScissor1) || (isPaper2 && isRock1) || (isScissor2 && isPaper1)){
          winner="Player 2";}
      else {
          winner=null;}
      return winner;
    }};