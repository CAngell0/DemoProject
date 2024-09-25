package demo.controller;

import java.util.Scanner;

public class Controller {

   private Scanner keyboardInput;

   public Controller(){
      this.keyboardInput = new Scanner(System.in);
   }

   public void start(){
      practiceWhileLoops();
      keyboardInput.close();
   }

   private void practiceWhileLoops() {

      int count = 10;
      while (count > 0){
         System.out.println("The count is: " + count);
         count -= 2;
      }

      String input = "";
      while (!input.trim().equalsIgnoreCase("stop")) 
      {
         System.out.println("Keep going");
         input = keyboardInput.nextLine();
      }

      boolean isFinished = false;
      String[] namePair = {"",""};
      System.out.println("");
      while (!isFinished){
         if (!namePair[0].equalsIgnoreCase("carson"))
         {
            System.out.println("What is your first name?");
            namePair[0] = keyboardInput.nextLine();
         } else if (!namePair[1].equalsIgnoreCase("angell"))
         {
               System.out.println("What is your last name?");
               namePair[1] = keyboardInput.nextLine();
         } else 
         {
            System.out.println("Your name is Carson Angell!");
            isFinished = true;
         }
      }
   }

   private void practiceNestedIfs() {
      System.out.println("Did you give the mouse a brownie?");
      String response = keyboardInput.next();

      if (response.equalsIgnoreCase("yes")){
         System.err.println("Did you also give the mouse ice cream?");
         response = keyboardInput.next();

         if (response.toLowerCase().equals("yes")){
            System.out.println("You gave him both");
         } else {
            System.out.println("You only gave him one");
         }
      }

      System.out.println("Do you like programming?");
      response = keyboardInput.next();

      if (response.equalsIgnoreCase("yes")){
         System.out.println("Do you like Java?");
         response = keyboardInput.next();
         if (response.equalsIgnoreCase("yes")){
            System.out.println("That's great!");
         } else {
            System.out.println("That sucks!");
         }
      }
   }

   private void practiceCompoundLogicalOperations(){
      String inputOne = "";
      String inputTwo = "";

      System.out.println("What is your favorite color?");
      inputOne = keyboardInput.next();
      System.out.println("What is the opposite of that color?");
      inputTwo = keyboardInput.next();

      if (inputOne.equals("blue") && inputTwo.equals("blue")){
         System.out.println("Color Theory!");
      }

      System.out.println("Did you give the mouse a cookie?");
      inputOne = keyboardInput.next();
      System.out.println("Did you give the mouse some milk?");
      inputTwo = keyboardInput.next();

      if (inputOne.equals("yes") && inputTwo.equals("yes")){
         System.out.println("Continuing...");
      } else {
         System.out.println("Finished");
      }

      System.out.println("Do you like programming?");
      inputOne = keyboardInput.next();
      System.out.println("Do you like Java?");
      inputTwo = keyboardInput.next();
      
      if (inputOne.equals("yes") && inputTwo.equals("no")){
         System.out.println("That's great!");
      } else {
         System.out.println("That sucks!");
      }
   }

   private void pacticeSubstr(){
      String myName = "Carson Angell";
      System.out.println("Length of my name is: " + myName.length());
      
      //Got just my first name
      String firstName = myName.substring(0, 6);
      System.out.println(firstName);

      int spaceLocation = myName.indexOf(" ");
      String lastName = myName.substring(spaceLocation).trim();
      System.out.println(lastName);
   }

   private void practiceEquals(){
      String firstName = "Carson";
      String lastName = "Casron";

      boolean isTheSame = firstName.equals(lastName);

      System.out.println("Is firstName the same as lastName?");
      System.out.println("firstName: \"" + firstName + "\" lastName: \"" + lastName + "\" - " + isTheSame);
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
