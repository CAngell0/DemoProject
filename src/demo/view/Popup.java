package demo.view;

import javax.swing.JOptionPane;

public class Popup {
   /**
    * Displays the supplied message as a popup.
    * @param message Message to display.
    */
   public void displayMessage(String message){
      JOptionPane.showMessageDialog(null, message);
   }
}
