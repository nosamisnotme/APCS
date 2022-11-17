package Hangman;
import java.util.Scanner;
import java.io.File;
public class Board{

private String phrase = loadPhrase();
private String blankPhrase = blankPhrase();
private String guessL = "";
private String guessesF = "";
private String outBP = "";

private String loadPhrase()
  {
    String tempPhrase = "";
    
    int numOfLines = 0;
    tempPhrase = "how are you";
    
    try 
    {
      
      Scanner sc = new Scanner(new File("Hangman/phrases.txt"));
      while (sc.hasNextLine())
      {
        tempPhrase = sc.nextLine().trim();
        numOfLines++;
      }
    } catch(Exception e) { System.out.println("Error reading or parsing phrases.txt"); }
    
		int randomInt = (int) ((Math.random() * numOfLines) + 1);
    
    try 
    {
      int count = 0;
      Scanner sc = new Scanner(new File("Hangman/phrases.txt"));
      while (sc.hasNextLine())
      {
        count++;
        String temp = sc.nextLine().trim();
        if (count == randomInt)
        {
          tempPhrase = temp;
        }
      }
    } catch (Exception e) { System.out.println("Error reading or parsing phrases.txt"); }
    return tempPhrase;
  }
public String blankPhrase(){
  String blankPhrase = "";
  String p = phrase;
  while (p.length() > 0){
    String letter = p.substring(0,1);
    if (letter.equals(" ")){
      blankPhrase = blankPhrase.concat(letter);
    }
    else{
      blankPhrase = blankPhrase.concat("_");
    }
    p = p.substring(1);
  }
  return blankPhrase;
}
public String guess(String l){
  guessL = guessL.concat(l);
  String bP = "";
  String p = phrase + " ";
  l = l.toLowerCase();
  while (p.length() > 0){
    String letter = p.substring(0,1);
    if (letter.equals(" ")){
      bP = bP.concat(letter);
    }
    else if (guessL.contains(letter)==true){
      bP = bP.concat(letter);
    }
    else if (!guessL.contains(letter)&&!guessesF.contains(l)){
      guessesF = guessesF.concat(l + " ");
      bP = bP.concat("_");
    }
    else{
      bP = bP.concat("_");
    }
    p = p.substring(1);
     
  }
  if (bP.equals(phrase)){
    bP += "\nYou win!";
  }
  outBP = bP;
  return bP;
}
public String getPhrase(){
  return phrase;
}
public String getBlankPhrase(){
  return blankPhrase;
}
public String getBP(){
  return outBP;
}
public String getGuessesF(){
  return guessesF;
}
}
