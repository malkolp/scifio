package machine.processor;

import machine.error.Error;

import java.util.regex.Matcher;

public class Parser {

    private Matcher MATCHER;
    private String CODE;
    private String OUT;
    private boolean IS_ERROR;
    private Error ERROR;


    public void syntax_parser(String input){
        CODE = input;
        _ROOT();
    }

    private void _FUN(){

    }

    private void _VARDECLR(){

    }

    private void _ARGDECLR(){

    }

    private void _ROOT(){
    }

    private void _BEGIN(){
    }

    private void _END(){
    }

    private void _STBLOCK(){

    }

    private void _CLSBLOCK(){

    }

    private void _STMT(){

    }

    private void _USE(){

    }

}
