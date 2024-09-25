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
        g.simulateOneDay(12);
        System.out.println(g.getCurrentFood());
        Feeder i = new Feeder(100);
        i.simulateOneDay(5);
        System.out.println(i);
        Feeder j = new Feeder(2400);
        System.out.println(j.simulateManyDays(10, 4)); 
        Feeder k = new Feeder(0);
        System.out.println(k.simulateManyDays(5, 10));

    }
}
    