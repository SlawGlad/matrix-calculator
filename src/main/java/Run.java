import org.antlr.v4.runtime.*;

public class Run {
    public static void main(String[] args) throws Exception {

        CharStream input = CharStreams.fromStream(System.in);

        AlgebraExpressionLexer lexer = new AlgebraExpressionLexer(input);
        CommonTokenStream tokens = new CommonTokenStream((TokenSource) lexer);
        AlgebraExpressionParser parser = new AlgebraExpressionParser((TokenStream) tokens);
        AlgebraExpressionParser.InputContext tree = parser.input();

        AlgebraExpressionBaseVisitorImpl algebraicVisitor = new AlgebraExpressionBaseVisitorImpl();
        Double result = algebraicVisitor.visit(tree);
        if(result != null) System.out.println("Result: " + result);
    }
}