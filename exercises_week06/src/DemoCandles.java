public class DemoCandles
{
    public static void main(String args[])
    {
        Candle aCandle = new Candle();
        ScentedCandle aScentedCandle = new ScentedCandle();

        aCandle.setColor("Purple");
        aCandle.setHeight(6);

        aScentedCandle.setColor("Orange");
        aScentedCandle.setScent("Gardinia");
        aScentedCandle.setHeight(6);

        System.out.println("The " + aCandle.getHeight() + " inch " + aCandle.getColor() +
                " candle costs $" + aCandle.getPrice());

        System.out.println("The " + aScentedCandle.getHeight() + " inch " + aScentedCandle.getScent() +
                " " + aScentedCandle.getColor() +
                " candle costs $" + aScentedCandle.getPrice());
    }
}
