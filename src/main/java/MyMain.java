import java.util.Scanner;

public class MyMain {

    // Changes a capital letter to a lowercase letter
    public static char toLower(char ch) {
        if (ch >= 32 && ch <= '@' || ch >= 'a' && ch <= 'z' || ch >= 91 && ch <= 96){
            return ch; 
        }
        else {
            ch = (char)(ch + 32); 
        }
        return ch;
    }

    // Returns a copy of a String, where all letters 
    // are now lowercase
    public static String myToLowerCase(String str) {
        String answerLow = "";
        for (int i = 0; i < str.length(); i++){
                answerLow = answerLow + toLower(str.charAt(i));    
        }
        return answerLow;
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not an lowercase letter, 
    // it is returned unchanged. 
    public static char toUpper(char ch) {
        if (ch >= 32 && ch <= 96){
            return ch; 
        }
        else {
            ch = (char)(ch - 32);
        }
        return ch;
    }

    // Returns a copy of a String, where all letters 
    // are now uppercase
    public static String myToUpperCase(String str) {
        String answerUp = "";
        for (int i = 0; i < str.length(); i++){
                answerUp = answerUp + toUpper(str.charAt(i));    
        }
        return answerUp;
    }
    


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a String");
        String test = scan.nextLine();
        System.out.println(test);
        System.out.println("Would you like to make your string uppercase or lowercase?");
        String command = scan.next();
        if (command.equals("lowercase")){
            System.out.println("Here is your lowercase string: " + myToLowerCase(test));
        }
        if (command.equals("uppercase")){
            System.out.println("Here is your uppercase string: " + myToUpperCase(test));
            scan.close();
    }
}
}
