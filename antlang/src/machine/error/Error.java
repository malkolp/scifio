package machine.error;

public class Error {
    private String ERROR_CAUSE;
    private String ERROR_DETAIL;

    public Error(String ERROR_CAUSE,String ERROR_DETAIL){
        this.ERROR_CAUSE = ERROR_CAUSE;
        this.ERROR_DETAIL = ERROR_DETAIL;
    }

    public String getERROR_CAUSE(){
        return ERROR_CAUSE;
    }

    public String getERROR_DETAIL(){
        return ERROR_DETAIL;
    }

    public void printError(){
        System.out.println(this.ERROR_CAUSE);
        System.out.println(this.ERROR_DETAIL);
    }
}
