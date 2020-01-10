package Introduction;

public class StringMethods {
    public static void main(String[] args) {
    String str = "This is the test String";
    String str1 = "Hello";
    String str2 = "Hello";
    String str3  = "Welcome";
    String str4 = "";
    String str5 = "    Spaces all around      ";
    String str6 = "Silvia";

     System.out.println("Length of str is: " + str.length());
     System.out.println("Char at index2 is: "+ str.charAt(2));
     System.out.println("Concat str+string: "+ str.concat(" This is an appended string"));
     System.out.println("str contains 'is': "+ str.contains("is"));
     System.out.println("str contains 'Son': "+ str.contains("Son"));
     System.out.println("str starts with 'This':  "+ str.startsWith("This"));
     System.out.println("str starts with 'string': "+ str.startsWith("string"));
     System.out.println("str ends with 'ing': "+ str.endsWith("ing"));
     System.out.println("str ends with 'is': "+ str.endsWith("is"));
     System.out.println("str1 equals to str2: "+ str1.equals(str2));
     System.out.println("str1 equals to str3:" + str1.equals(str3));
     System.out.println("Index of 'h': " + str.indexOf('h')); // returns -1 if the char is not found in the string
     System.out.println("str1 is empty: " + str1.isEmpty());
     System.out.println("str4 is empty: " + str4.isEmpty());
     System.out.println("Removing spaces from string5: "+ str5.trim());
     System.out.println("Replacing 'l' by 'U'in: " + str6.replace('l', 'U'));
     System.out.println("Substring a word from str: " + str.substring(5));
     System.out.println("Substring a word from str using index: " + str.substring(5,10));

     char [] chararray = str.toCharArray(); //converts a string into character array.
     for (int i=0; i< chararray.length; i++){
         System.out.println(chararray[i]);
     }

     System.out.println("str to lowercase: " + str.toLowerCase());
     System.out.println("str to uppercase: " + str.toUpperCase());

    }
}
