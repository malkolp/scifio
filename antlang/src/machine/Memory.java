package machine;

import java.util.HashMap;

public class Memory{

    private static HashMap<String,Variable> VARIABLE_MEMORY;
    private static HashMap<String,Function> FUNCTION_MEMORY;
    private static HashMap<String,Class> CLASS_MEMORY;
    private String FILE_POINTER,CLASS_POINTER,FUNCTION_POINTER;
    private static Memory INSTANCE;

    public static void INIT(){
        if (INSTANCE == null) INSTANCE = new Memory();
    }

    public static Memory GET(){
        return INSTANCE;
    }

    private Memory(){
        VARIABLE_MEMORY = new HashMap<>();
        FUNCTION_MEMORY = new HashMap<>();
        CLASS_MEMORY = new HashMap<>();
        FILE_POINTER = "N/A";
        CLASS_POINTER = "N/A";
        FUNCTION_POINTER = "N/A";
    }

    public boolean ADD_VARIABLE(String name, int type, boolean fixed, String value){
        String id = name+"_"+FUNCTION_POINTER;
        if (!VARIABLE_MEMORY.containsKey(id)){
            VARIABLE_MEMORY.put(id,new Variable(name,type,fixed,value));
            return true;
        }
        return false;
    }

    public boolean ADD_FUNCTION(String name, String returnType){
        String id = name+"_"+CLASS_POINTER+"_"+FILE_POINTER;
        if (!FUNCTION_MEMORY.containsKey(id)){
            FUNCTION_MEMORY.put(id,new Function(name,returnType));
            return true;
        }
        return false;
    }

    public boolean ADD_CLASS(String name, String file){
        if (!CLASS_MEMORY.containsKey(name)){
            CLASS_MEMORY.put(name,new Class(name,file));
            return true;
        }
        return false;
    }

    public void VARIABLE_SET_TYPE(String id, int type){
        VARIABLE_MEMORY.get(id).setType(type);
    }

    public void VARIABLE_SET_VALUE(String id, String value){
        VARIABLE_MEMORY.get(id).setValue(value);
    }

    public void VARIABLE_SET_FIXED(String id, boolean fixed){
        VARIABLE_MEMORY.get(id).setFixed(fixed);
    }

    public void DELETE_VARIABLE(String id){
        VARIABLE_MEMORY.remove(id);
    }


    private class Variable{
        private String name;
        private int type;
        private boolean fixed;
        private String value;

        Variable(String name,int type,boolean fixed,String value){
            this.name = name;
            this.type = type;
            this.fixed = fixed;
            this.value = value;
        }

        void setType(int type){
            this.type = type;
        }

        void setFixed(boolean fixed){
            this.fixed = fixed;
        }

        void setValue(String value){
            this.value = value;
        }
    }

    private class Function{
        private String name;
        private String returnType;

        Function(String name, String returnType){
            this.name = name;
            this.returnType = returnType;
        }


    }

    private class Class{
        private String name;
        private String file;

        Class(String name, String file){
            this.name = name;
            this.file = file;
        }
    }

    public void setFilePointer(String file){
        FILE_POINTER = file;
    }

    public void setClassPointer(String classes){
        CLASS_POINTER = classes;
    }

    public void setFunctionPointer(String function){
        FUNCTION_POINTER = function;
    }

    public String getFilePointer(){
        return FILE_POINTER;
    }

    public String getClassPointer(){
        return CLASS_POINTER;
    }

    public String getFunctionPointer(){
        return FUNCTION_POINTER;
    }

}