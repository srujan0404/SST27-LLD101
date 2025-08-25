public class Demo07 {
    public static void main(String[] args) {
        BasicPrinter basicPrinter = new BasicPrinter();
        basicPrinter.print("Hello from basic printer");
        
        EveryInOne everyInOne = new EveryInOne();
        everyInOne.print("Hello from all-in-one");
        everyInOne.scan("/tmp/out");
        everyInOne.fax("123-456-7890");
    }
}
