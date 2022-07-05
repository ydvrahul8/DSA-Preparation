package exercise;

import java.util.ArrayList;

public class BasketBall {

    public static int calPoints(String[] ops){
        int result = 0;
        ArrayList<Integer> data = new ArrayList<>();
        for(int i=0;i< ops.length;i++){
            if(ops[i].equals("+"))
                data.add(data.get(data.size()-1) + data.get(data.size()-2) );
            else if(ops[i].equals("C")){
                data.remove(data.size()-1);
            } else if(ops[i].equals("D")){
                data.add(data.get(data.size()-1)*2);
            }else{
                data.add(Integer.parseInt(ops[i]));
            }
        }

        for(int i=0;i<data.size();i++){
            result = result+ data.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        String s[] = {"5","2","C","D","+"};
        System.out.println(calPoints(s));
    }
}
