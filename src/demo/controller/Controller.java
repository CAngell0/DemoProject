package demo.controller;

import java.util.Scanner;

public class Controller {

   private Scanner keyboardInput;

   public Controller(){
      this.keyboardInput = new Scanner(System.in);
   }

   public void start(){
      // askQuestions();
      practiceStringMethods();
      keyboardInput.close();
   }

   private void practiceStringMethods(){
      String myName = "Carson Angell";
      System.out.println("Length of my name is: " + myName.length());
      
      //Got just my first name
      String part = myName.substring(0, 6);
      System.out.println(part);
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
