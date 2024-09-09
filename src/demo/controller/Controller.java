package demo.controller;

import java.util.Scanner;

public class Controller {

   private Scanner keyboardInput;

   public Controller(){
      this.keyboardInput = new Scanner(System.in);
   }

   public void start(){
      System.out.println("Do I work?");
      String input = keyboardInput.nextLine();
      System.out.println("You said this: " + input);

      keyboardInput.close();
   }
}
