import java.util.ArrayList;

public class second {
    public static void main(String[] args) {

        // Вывести все простые числа от 1 до 1000.

        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add(2);
        arr.add(3);
        arr.add(5);
        arr.add(7);
        arr.add(11);
        for(int i = 1; i <=1000; i++){
            if(i%2!=0 && i%3 !=0 && i%5 !=0 && i%7 !=0 && i%11 !=0 && i!=1){
                arr.add(i);
            }
        }

        System.out.println(arr);
    }
}