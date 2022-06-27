package recursion;

public class PrintStringInReverse {

    public static void reverse(String s){
        if((s.length()-1)==0) {
            System.out.print(s.charAt(0));
            return;
        }
        System.out.print(s.charAt(s.length()-1));
        reverse(s.substring(0,s.length()-1));
    }

    public static void main(String[] args) {
reverse("rahul");
    }
}
