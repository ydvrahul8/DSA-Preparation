package array;

public class ReverseString {

    private static void reversString1(String data){
        String ans ="";
        for(int i=data.length()-1;i>=0;i--){
            ans = ans+data.charAt(i);
        }
        System.out.println(ans);
    }

    private static void reversString2(String data){
        StringBuilder string = new StringBuilder(data);
        System.out.println(string.reverse());
    }

    private static String reversString3(String data){
        if(data.length() == 0)
            return "";
        return reversString3(data.substring(1))+data.charAt(0);
    }

    public static void main(String[] args) {
        String data = "hello world";
        reversString1(data);
        reversString2(data);
        System.out.println(reversString3(data));
    }

}
