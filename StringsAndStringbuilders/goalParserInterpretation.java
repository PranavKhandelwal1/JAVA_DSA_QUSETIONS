package StringsAndStringbuilders;

public class goalParserInterpretation {
    public static String interpret(String command) {

        return command.replace("()", "o")
                        .replace("(", "")   
                            .replace(")","");
    }
    public static void main(String[] args) {
        String command = "(al)G(al)()()G";
        System.out.println(interpret(command));
    }
}
