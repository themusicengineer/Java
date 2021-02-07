public class MadLibs {
  /*
  This program generates a mad libbed story.
  Author: Jonathan
  Date: 01/28/2021
  */
  	public static void main(String[] args){
      String name1 = "Naruto";
      String name2 = "Sasuke";
      String adjective1 = "hopeful";
      String adjective2 = "great";
      String adjective3 = "joyful";
      String verb1 = "dance";
      String noun1 = "ninja";
      String noun2 = "kunai";
      String noun3 = "music";
      String noun4 = "ninja";
      String noun5 = "yogurt";
      String noun6 = "samurai";
      int number = 2030;
      String place1 = "Hidden Leaf Village";
      
      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

      System.out.println(story);
    }       
}