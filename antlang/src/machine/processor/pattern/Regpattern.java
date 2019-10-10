package machine.processor.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regpattern {
    public static Pattern FUN_PATTERN;
    public static Pattern BEGIN_PATTERN;
    public static Pattern VAR_PATTERN;
    public static Pattern SINGLE_LINE_COMMENT_PATTERN;
    public static Pattern MULTI_LINE_COMMENT_PATTERN;
    public static Pattern MULTI_SPACE_LINE_PATTERN;
    public static Pattern MULTI_SPACE_LINE_PATTERN_2;
    public static Pattern SINGLE_SPACE_PATTERN;
    public static Pattern EMPTY_PATTERN;

    public static void INIT(){
        FUN_PATTERN = Pattern.compile("fun\\s+([\\w]+)\\s*\\((\\s*var\\[]\\s+[\\w]+)\\)\\s*\\{\\s*}");
        BEGIN_PATTERN = Pattern.compile("fun\\s+(main)\\s*\\((\\s*var\\[]\\s+[\\w]+)\\)\\s*\\{\\s*}");
        VAR_PATTERN = Pattern.compile("var\\s+([\\w_$]+[\\d_$]*)");
        SINGLE_LINE_COMMENT_PATTERN = Pattern.compile("//[^\\n]*");
        MULTI_LINE_COMMENT_PATTERN = Pattern.compile("/\\*[\\w\\W]*\\*/");
        MULTI_SPACE_LINE_PATTERN = Pattern.compile("\\s[\\s]+");
        MULTI_SPACE_LINE_PATTERN_2 = Pattern.compile("\\n");
        SINGLE_SPACE_PATTERN = Pattern.compile("\\s");
        EMPTY_PATTERN = Pattern.compile("");
    }

    public static Matcher MATCH(Pattern expresion,String token){
        Matcher matcher = expresion.matcher(token);
        return matcher;
    }

}
