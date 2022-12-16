package APCompSciQuizletPractice;

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


    //TODO: declare variables needed as you work through project(Make ArrayLists for answers and questions)
    String content = "";

    //Imports content and creates class
    public Quiz(String content){
        this.content = content;
    }

    //TODO: Store the questions and answers from QA.txt into two seperate ArrayLists using loops.(A question should have the same index as its answer.)
    public void createArrays(){
        
    }

    //TODO: Generate 3 random wrong answers based using your answers ArrayList(Use ArrayList.get(index);)
    public void wrongAnswers(){
       
    }

    //TODO: Generate the questions prompt with the 4 answer choices.(Use ArrayList.get(); and Collections.shuffle(ArrayList);)
    public void genPrompt(){
        
    }

    //TODO: Main runner method that has user choose one of the choices from the prompt and increases/decreases their points by 1.
    public void main(){
        
    }

    //TODO: Get methods for your questions, answers and score.
    
}
