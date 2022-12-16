package APCompSciQuizlet;

import java.util.*;
/*
 * ArrayList Cheat Sheet
 * 
 * ArrayList<dataType> ArrayListName = new ArrayList<dataType>(); (Constructs a new ArrayList with the specified datatype and the given name.)
 * 
 * ArrayListName.add(variable); (Adds a new variable to the ArrayList.)
 *      ArrayListName.add(variable, index); (Adds a new variable to the ArrayList at the specified index.)
 * 
 * ArrayListName.get(index); (Returns the variable at the specified index.)
 * 
 * ArrayListName.clear(); (Clears array of all variables.)
 * 
 * ArrayListName.size(); (Returns the number of variables in the ArrayList.)
 * 
 * Collections.shuffle(ArrayListName); (Scrambles location of variables in the ArrayList.)
 */

public class Quiz{
    Scanner sc = new Scanner(System.in);

    //TODO: declare variables needed
    private ArrayList<String> questions = new ArrayList<String>();
    private ArrayList<String> answers = new ArrayList<String>();
    private ArrayList<String> prompt = new ArrayList<String>();
    private String a1 = "";
    private String a2 = "";
    private String a3 = "";
    private String content = "";
    private int rand = 0;
    private int score = 0;

    //Imports content and creates class
    public Quiz(String content){
        this.content = content;
    }

    //TODO: Store the questions and answers from QA.txt into two seperate ArrayLists using loops.(A question should have the same index as its answer.)
    public void createArrays(){
        Boolean q = true;
        for (int x = 0; x <= content.length(); x++){
            String word = content.substring(0, x);
            if (word.contains(",") && q){
                content = content.substring(word.length(), content.length());
                word = word.substring(0, word.length()-1);
                questions.add(word);
                q = false;
                x = 0;
            }
            if (word.contains(",") && !q){
                content = content.substring(word.length(), content.length());
                word = word.substring(0, word.length()-1);
                answers.add(word);
                q = true;
                x = 0;
            }
        }
    }

    //TODO: Generate 3 wrong answers based using your answers ArrayList
    public void wrongAnswers(){
        a1 = answers.get((int) (Math.random() * answers.size()));
        a2 = answers.get((int) (Math.random() * answers.size()));
        a3 = answers.get((int) (Math.random() * answers.size()));
    }

    //TODO: Generate the questions prompt with the 4 answer choices.
    public void genPrompt(){
        rand = ((int) (Math.random() * answers.size()));
        prompt.clear();
        prompt.add(a1);
        prompt.add(a2);
        prompt.add(a3);
        prompt.add(answers.get(rand));
        //Scrambles an ArrayList and randomizes variable locations
            Collections.shuffle(prompt);
        System.out.println(questions.get(rand));
        for (int x = 0; x < prompt.size(); x++){
            System.out.print("(" + (x+1) + ")" + prompt.get(x) + " ");
        }
    }

    //TODO: Main runner method that has user choose one of the choices from the prompt and increases/decreases their points by 1.
    public void main(){
        System.out.println("Score: " + score);
        createArrays();
        wrongAnswers();
        genPrompt();
        String guess = sc.nextLine();
        if (answers.indexOf(prompt.get(Integer.parseInt(guess)-1)) == rand){
            System.out.println("Correct!");
            score += 1;
        }
        else{
            System.out.println("Incorrect!");
            if (score != 0){
                score -= 1;
            }
        }

    }

    //TODO: Get methods for your ques
    public ArrayList<String> getQuestions(){
        return questions;
    }
    public ArrayList<String> getAnswers(){
        return answers;
    }
    public int getScore(){
        return score;
    }

}
