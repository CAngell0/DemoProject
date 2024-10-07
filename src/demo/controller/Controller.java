package demo.controller;

import java.util.Scanner;
import java.util.ArrayList;

public class Controller {

   private Scanner keyboardInput;

   public Controller(){
      this.keyboardInput = new Scanner(System.in);
   }

   public void start(){
      practiceArrayLists();
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

   private void practiceForLoops() {
      for (int count = 0; count < 10; count++){
         System.out.println("Count is: " + count);
      }

      for (int count = 10; count >= 0; count--){
         System.out.println("Backwards count is: " + count);
      }

      for (int count = 10; count < Math.pow(10, 6); count = count * 10){
         System.out.println("Multiplied count is: " + count);
      }

      int inputNumber = -1;
      System.out.println("\nCount to ten!");
      for (int count = 1; count < 11; count++){
         while (inputNumber != count){
            inputNumber = keyboardInput.nextInt();
            keyboardInput.nextLine();
         }
         System.out.println("Correct!");
      }
   }

   private void practiceLoopsWithStrings() {
      String example = "Hello World!";
      for (int index = 0; index < example.length(); index++){
         System.out.println("Current letter at " + index + " is: " + example.substring(index, index + 1));
      }

      for (int index = example.length() - 1; index >= 0; index--){
         System.out.println("Backwards letter at " + index + " is: " + example.substring(index, index + 1));
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

   private void practiceArrayLists(){
      ArrayList<String> words = new ArrayList<String>();
      
      words.add("first in the list");
      System.out.println("Here is the item in the list: " + words.get(0));

      String input = "";
      while (!input.equalsIgnoreCase("quit")){
         System.out.println("Type items for the list or quit");
         input = keyboardInput.nextLine();
         words.add(input);
      }

      for (int count = 1; count <= 10; count++){
         words.add("Item" + count);
      }
      for (int index = 0; index < words.size(); index++){
         System.out.println("Index " + index + " = " + words.get(index));
      }
   }
}
