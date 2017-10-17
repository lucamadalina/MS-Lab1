package classes;

import java.util.ArrayList;
import java.util.List;

public class Lcg {

    int a;
    int b ;
    static int m ;
    int x;
    List<Double> list = new ArrayList<>();

    public int countNumber(int number){
        int i = 0;
        while(number != 0){
            number =  number/10;
            i++;
        }
        return i;
    }

    public Lcg(int a, int b, int m) {
        this.a = a;
        this.b = b;
        this.m = m;
    }

    double generateNumber() {
        x = (a * x + b) % m;
        return x/Math.pow(10, countNumber(x));
    }

    double nextInt(){
        double x = generateNumber();
        while(add(x) == true || x == 0.0) {
            setM(++m);
            x = generateNumber();
        }
        return x;
    }

    private boolean add(double x) {
        boolean status = false;
        for(int i=0; i<list.size(); i++){
            if (x == list.get(i)){
                status = true;
            }
        }
        if (!status){
            list.add(x);
            return status;
        } else {
            return status;
        }
    }

    public void setM(int m) {
        this.m = m;
    }
}
