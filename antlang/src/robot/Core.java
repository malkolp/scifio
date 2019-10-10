package robot;

public class Core {

    private static Core instance;
    private String input;

    private Core(){}

    public static void init(){
        if (instance == null) instance = new Core();
    }

    public static Core get(){
        if (instance == null) init();
        return instance;
    }

    //-------------------------------------------------------------------------------------------

    public void start(String input){
        this.input = input;
    }

}
