package classes;

/**
 * Created by madalina.luca on 10/17/2017.
 */

import interfaces.IGenerator;

import java.util.ArrayList;
import java.util.List;

public class MiddleSquare implements IGenerator {
    private int seed;
    private static List<Integer> list = new ArrayList<>();

    public void setSeed(int seed) {
        this.seed = seed;
    }
    //or
    MiddleSquare(int seed){
        this.seed = seed;
    }
    public int countNumber(int seed){
        int i=0;
        while(seed!=0){
            seed=seed/10;
            i++;
        }
        return i;
    }

    //daca contine 0
    public int setValue(int n) {
        int dif = countNumber(seed) - countNumber(n);
        int count = countNumber(n);
        if (count < countNumber(seed)) {
            while (dif != 0) {
                n = (int) (n + Math.pow(10, countNumber(n)));
                dif--;
            }
        }
        return n;
    }

    private boolean duplicate(int n){
        int i;
        boolean status = false;
        for(i=0; i<list.size(); i++){
            if(n == list.get(i)){
                status = true;
            }
            else {
                status = false;
                break;
            }
        }
        if(!status){
            list.add(n);
            return status;
        }
        else
            return status;
    }

    @Override
    public float  nextInt(){
        float result;
        int p;
        int x;
        int count = countNumber(seed);
        result=seed*seed;
        p= (int) ((result/(Math.pow(10,count/2)))%(Math.pow(10,count)));
        if(p == 0) {
            p=1;
        }
        x = setValue(p);
        if (duplicate(x) == false) {
            return (float) (x / Math.pow(10, count));
        }
        else {
            return (float)((x+171)/Math.pow(10, count));
        }
    }
}

