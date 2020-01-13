import java.util.*;

public class ArraysDemo {

    public static void main (String[] args) {

        int [] myIntArray1 = {100, 90}; // Other way to declare an array.... in this way, if I try to call an index which was not declared, the compiler will show an error exception
        /*int [] myIntArray1; // declare variable
        myIntArray1 = new int[10]; // create the object as 10 index array

         */

        myIntArray1[0] = 100;
        myIntArray1[1] = 90;
        System.out.println("Index 0: "+myIntArray1[0]);
        System.out.println("Index 1st: "+myIntArray1[1]);
        //System.out.println("Index 2nd: "+myIntArray1[2]); // in this way, if I try to call an index which was not declared, the compiler will show an error exception


        String [] myStringArray1 = {"bmw", "audi", "honda"};
        System.out.println("String Array - Index 0: "+ myStringArray1[0]);
        System.out.println("String Array - Index 1st: "+ myStringArray1[1]);
        System.out.println("String Array - Index 2nd: "+ myStringArray1[2]);

        int len1 = myIntArray1.length;
        System.out.println("Int Array length: "+ len1);

        int len2 = myStringArray1.length;
        System.out.println("String Array length: "+ len2);

        for (int i= 0; i<len1; i++){
            System.out.println(myIntArray1[i]);
        }

        Arrays.sort(myIntArray1);

        for (int i= 0; i<len1; i++){
            System.out.println(myIntArray1[i]);
        }

        /* ***** Arrays multi dimensionales ***** */

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int x = myNumbers[1][2];
        System.out.println(x); // Outputs 7

        /* ****  Arrays Methods ***** */


    }
}
