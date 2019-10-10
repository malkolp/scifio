package machine;

import machine.processor.Analyzer;
import machine.processor.Parser;
import machine.processor.pattern.Regpattern;

public class Processor {

    private static Processor INSTANCE;
    private static Parser PARSER;
    private static Analyzer ANALYZER;

    private Processor(){
        PARSER = new Parser();
        ANALYZER = new Analyzer();
        Regpattern.INIT();
        Memory.INIT();
    }

    public static void INIT(){
        if (INSTANCE == null) INSTANCE = new Processor();
    }

    public static void COMPILE(String input){
        input = ANALYZER.analyze(input);
        PARSER.syntax_parser(input);
    }

}


