public class Str {
    public static void main(String[] args) {
        String s1 = "A book on Java";
        String s2 = new String("I like it");
        char arr[] = {'H', 'a', 'm', 'e', 'e', 'm'};
        String s3 = new String(arr);

        //disply
        System.out.println(s1 + " " + s2 + " " + s3);

        //find the length of first string
        System.out.println("Length of s1 = " + s1.length());

        //concat two strings
        System.out.println("S1 and S2 joined = " + s1.concat(s2));

        //test if s1 starts with A
        boolean x = s1.startsWith("A");
        if(x) System.out.println("Starts with A");
        else System.out.println("S1 does not start with A");

        String p = s2.substring(0, 7);
        System.out.println("Upper s1 = " + s1.toUpperCase());
        String[] s = s1.split(" ");
        for (String string : s) {
            System.out.println(string);
        }
        String S = "Hello";
        String T = "Hello";
        System.out.println(S == T);
    }
}
