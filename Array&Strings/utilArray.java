import java.util.Arrays;
import java.util.List;  //For List<String>
public class utilArray {
    public static void main(String[] args) {
        String[] first = new String[]{"Lana", "Linda", "Laura", "Gerogio", "Diago"};
        String[] second = Arrays.copyOf(first, first.length);
        System.out.println(Arrays.equals(first, second));
        Arrays.fill(second, "ola");
        System.out.println(Arrays.toString(Arrays.copyOfRange(second, 3, second.length)));   
        System.out.println(Arrays.binarySearch(first, 0, first.length, "Linda"));
        List<String> l = Arrays.asList(first);
        System.out.println(l);
        System.out.println(first.hashCode());
    }
}
