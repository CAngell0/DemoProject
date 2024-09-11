package demo.controller;

import java.util.Scanner;

public class Controller {

   private Scanner keyboardInput;

   public Controller(){
      this.keyboardInput = new Scanner(System.in);
   }

   public void start(){
      askQuestions();
      keyboardInput.close();
   }

   private void askQuestions(){
      String[] questions = {
         "Do I work?",
         "Am I asking a question?",
         "What is 20 * 20?"
      };
      String[] results = {"","",""};

      for (int i = 0; i < questions.length; i++){
         System.out.println(questions[i]);
         results[i] = keyboardInput.nextLine();
      }

      System.out.println("\nThis is what you answered:");
      for (int i = 0; i < results.length; i++){
         System.out.println(i + ". " + results[i]);
      }
   }
}
