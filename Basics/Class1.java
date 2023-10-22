package Basics;
class Class1 {
    public static void main(String[] args) {
        for (String string : args) {
            System.out.println(string);
        }
    }
}

class Class2 {
    public static void main(String[] args) {
        //take a string array
        String[] name = {"Arjun", "Naga", "Shrmit"};
        Class1.main(name);
    }
}
