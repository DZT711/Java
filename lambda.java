import java.util.ArrayList;
import java.util.function.Consumer;

public class lambda {
    public static void main(String[] args) {


        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4); 
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(8);
        a.add(9);
        a.add(10);
        //cach 1
        a.forEach((n) -> {//bieu thuc lambda
            System.out.println(n);
        });
        //cach 2
        Consumer<Integer> method=(n)->{ 
            System.out.println(n);
        };
        a.forEach(method);
    }
}

//Truyền Lambda vào phương thức
// StringFunction là một interface có một phương thức duy nhất (run()).

// Lambda (s) -> s + "!" và (s) -> s + "?" được truyền vào phương thức printFormatted().
interface StringFunction {
    String run(String str);
}
class lambdaExpressionInMethod {
    public static void main(String[] args) {
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";

        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}