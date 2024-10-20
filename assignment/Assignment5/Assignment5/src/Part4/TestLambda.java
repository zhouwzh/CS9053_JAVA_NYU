package Part4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestLambda{
    //public TestLambda(){
    static double sum = 0;
    public static void main(String[] args){
        BF<Double,Double,Double> aFunc = (p1,p2)->(p1+p2);
        ArrayList<Double> arr = new ArrayList<>();
        arr.add(50.0);
        arr.add(24.0);
        arr.add(12.0);
        arr.add(8.0);

        arr.forEach(value->{
            sum = aFunc.apply(value,sum);
        });
        System.out.println(sum);
    }
    

    public interface BF<T,U,R>{
        R apply(T t,U u);
    }

}
