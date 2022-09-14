import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

        sqrt(10);
    }
    public static UnaryOperator<Double> sqrt( int a) {
        UnaryOperator<Double> num = (n) -> n*n;
      System.out.println(Math.sqrt(a));
      return num ;
    }
}
