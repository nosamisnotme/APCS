import java.util.ArrayList;

/**********************************************************************
 * Sample solution for Activity 3.6.4
 **********************************************************************/
/**
 * Generate random permutations of integers
 */
public class RandomPermutation
{
  /**
   * Genereates one permutation of random integers. The number of
   * integers to generate is designated by length and the
   * randomized list of integers is returned.
   *
   * Initial conditions: length cannot be negative
   */
   public ArrayList<Horse> next(ArrayList<Horse> barn)
   {
      ArrayList<Horse> rBarn = new ArrayList<Horse>();
      int[] r = new int[barn.size()];
      int[] p = new int[barn.size()];
      
      for (int i = 0; i < barn.size(); i++)
        p[i] = i + 1;
        
      for (int n = barn.size(); n > 0; n--)
      {
        int pos = (int) (Math.random() * n);
        r[n-1] = p[pos];
        p[pos] = p[n-1];
      }
      for (int x : r){
        rBarn.add(barn.get(x-1));
      }
      // debug: System.out.println(java.util.Arrays.toString(r));
      return rBarn;
   }
   public String randPartner(ArrayList<Horse> barn){
    ArrayList<Horse> rBarn = next(barn);
    String temp = "";
    int i = 1;
    for (Horse x : rBarn){
      
      temp += x;
      if ((i % 2) == 1){
        if (x.equals(rBarn.get(rBarn.size()-1))){
          temp += " has no partner!";
        }
        else {
          temp += " and ";
        }
      }
      else {
        temp += "\n";
      }
      i++;
    }
    return temp;
   }

}
