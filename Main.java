public class Main
{ 
    public static void main (String[] args)
    { 
        Feeder f = new Feeder ();
        System.out.println(f);
        //System.out.println(f.currentFood);
        System.out.println(f.getCurrentFood());
        Feeder g = new Feeder(500);
        System.out.println(g.getCurrentFood());
        System.out.println(Math.random() < 0.05);
        if(Math.random() < 0.05) currentFood = 0;

    }
}
    