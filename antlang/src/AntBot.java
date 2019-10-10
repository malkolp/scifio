import machine.Processor;

public class AntBot {

    public static void main(String[] args) {
        String input = "fun main(var[] args){}";
        Processor.INIT();
        Processor.COMPILE(input);
    }

}
