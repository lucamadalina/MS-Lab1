package classes;

/**
 * Created by madalina.luca on 10/17/2017.
 */
public class Main {

    public static void main(String[] args) {
        int seed = 2500;
        Lcg lcg = new Lcg(2, 3, 1);
        System.out.println ("Number generated with LCG: "+lcg.nextInt());
        System.out.println ("Number generated with LCG: "+lcg.nextInt());
        System.out.println ("Number generated with LCG: "+lcg.nextInt());
        System.out.println ("Number generated with LCG: "+lcg.nextInt());

        MiddleSquare generator = new MiddleSquare(seed);
        //object.setSeed(2500);
        float random1=generator.nextInt();
        float random2=generator.nextInt();
        System.out.println("Numbers generated with MiddleSqaure(seed="+seed+"): "+random1 + "\n" + random2);

        /*Output
         Number generated with LCG: 0.1
         Number generated with LCG: 0.2
         Number generated with LCG: 0.3
         Number generated with LCG: 0.7
         Numbers generated with MiddleSqaure(seed=2500): 0.25
         0.2671
          */
    }
}
