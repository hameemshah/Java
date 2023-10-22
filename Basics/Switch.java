package Basics;
public class Switch {
    public static void main(String[] args) {
        System.out.println(getQuater('A'));
    }

    public static String getQuater(char letter) {
         switch (letter) {
            case 'A' : return "Able";
            case 'B' : return "Baker";
            case 'C' : return "Charlie";
            case 'D' : return "Dog";
            default : {
                String error = letter + " is invalid input.";
                return error;
                        }
        }
    }
}
