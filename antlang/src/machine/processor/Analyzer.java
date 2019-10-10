package machine.processor;

public class Analyzer {

    private static final String SINGLE_LINE_COMMENT_PATTERN = "//[^\\n]*";
    private static final String MULTI_LINE_COMMENT_PATTERN = "/\\*[\\w\\W]*\\*/";
    private static final String MULTI_SPACE_LINE_PATTERN = "\\s[\\s]+";
    private static final String MULTI_SPACE_LINE_PATTERN_2 = "\\n";
    private static final String SINGLE_SPACE_PATTERN = " ";
    private static final String EMPTY_PATTERN = "";

    public String analyze(String input){
        input = input.replaceAll(MULTI_LINE_COMMENT_PATTERN,EMPTY_PATTERN);
        input = input.replaceAll(SINGLE_LINE_COMMENT_PATTERN,EMPTY_PATTERN);
        input = input.replaceAll(MULTI_SPACE_LINE_PATTERN,SINGLE_SPACE_PATTERN);
        input = input.replaceAll(MULTI_SPACE_LINE_PATTERN_2,SINGLE_SPACE_PATTERN);
        return input;
    }


}
