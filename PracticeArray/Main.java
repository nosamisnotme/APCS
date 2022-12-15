package PracticeArray;

public class Main {
    public static void main(String[] args){
        //1
        String[] array1 = {"H", "e", "l", "l", "o", "1"};
        String[] array2 = {"H", "e", "l", "l", "o", "2"};
        String[] array3 = {"H", "e", "l", "l", "o", "3"};

        //2
        int x = 0;
        while (x < array1.length){
            System.out.println(array1[x]);
            x++;
        }

        //3
        for (int y = 0; y < array2.length; y++){
            System.out.println(array2[y]);
        }

        //4
        for (String z : array3){
            System.out.println(z);
        }

    }
}
