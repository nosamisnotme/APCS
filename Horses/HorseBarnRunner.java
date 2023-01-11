/*
 * Activity 3.7.3
 */
import java.util.ArrayList;
public class HorseBarnRunner
{
  public static void main(String[] args){
    Double avgWeight = 0.0;
    RandomPermutation randPerm = new RandomPermutation();
    HorseBarn barn = new HorseBarn();
    ArrayList<Horse> horseBarn = barn.getSpaces();
    System.out.println(horseBarn);
    int count = 0;
    for (Horse x : horseBarn){
      avgWeight += x.getWeight();
      count += 1;
    }
    avgWeight /= count;
    System.out.println(avgWeight);
    System.out.println(randPerm.next(horseBarn));
    System.out.println(randPerm.randPartner(horseBarn));
  }
} 