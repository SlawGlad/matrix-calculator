// Generated from C:/Users/S³awek/IdeaProjects/ProjektKompilatory\AlgebraExpression.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AlgebraExpressionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AlgebraExpressionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code ToSetVariable}
	 * labeled alternative in {@link AlgebraExpressionParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToSetVariable(AlgebraExpressionParser.ToSetVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Calculate}
	 * labeled alternative in {@link AlgebraExpressionParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalculate(AlgebraExpressionParser.CalculateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SettingVariable}
	 * labeled alternative in {@link AlgebraExpressionParser#setVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSettingVariable(AlgebraExpressionParser.SettingVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToMultiplicationOrDivision}
	 * labeled alternative in {@link AlgebraExpressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToMultiplicationOrDivision(AlgebraExpressionParser.ToMultiplicationOrDivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link AlgebraExpressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(AlgebraExpressionParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link AlgebraExpressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(AlgebraExpressionParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MatrixTransp}
	 * labeled alternative in {@link AlgebraExpressionParser#multiplicationOrDivision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrixTransp(AlgebraExpressionParser.MatrixTranspContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link AlgebraExpressionParser#multiplicationOrDivision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(AlgebraExpressionParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToMatrix}
	 * labeled alternative in {@link AlgebraExpressionParser#multiplicationOrDivision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToMatrix(AlgebraExpressionParser.ToMatrixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MatrixMinus}
	 * labeled alternative in {@link AlgebraExpressionParser#multiplicationOrDivision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrixMinus(AlgebraExpressionParser.MatrixMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MatrixInverse}
	 * labeled alternative in {@link AlgebraExpressionParser#multiplicationOrDivision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrixInverse(AlgebraExpressionParser.MatrixInverseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MatrixMultiplication}
	 * labeled alternative in {@link AlgebraExpressionParser#multiplicationOrDivision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrixMultiplication(AlgebraExpressionParser.MatrixMultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToPower}
	 * labeled alternative in {@link AlgebraExpressionParser#multiplicationOrDivision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToPower(AlgebraExpressionParser.ToPowerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link AlgebraExpressionParser#multiplicationOrDivision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(AlgebraExpressionParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MatrixPlus}
	 * labeled alternative in {@link AlgebraExpressionParser#multiplicationOrDivision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrixPlus(AlgebraExpressionParser.MatrixPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MatrixScalar}
	 * labeled alternative in {@link AlgebraExpressionParser#multiplicationOrDivision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrixScalar(AlgebraExpressionParser.MatrixScalarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Matrix}
	 * labeled alternative in {@link AlgebraExpressionParser#matrixdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrix(AlgebraExpressionParser.MatrixContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgebraExpressionParser#matrixrows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrixrows(AlgebraExpressionParser.MatrixrowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgebraExpressionParser#matrixrow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrixrow(AlgebraExpressionParser.MatrixrowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Power}
	 * labeled alternative in {@link AlgebraExpressionParser#pow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(AlgebraExpressionParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChangeSign}
	 * labeled alternative in {@link AlgebraExpressionParser#signAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChangeSign(AlgebraExpressionParser.ChangeSignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToFunction}
	 * labeled alternative in {@link AlgebraExpressionParser#signAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToFunction(AlgebraExpressionParser.ToFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToAtom}
	 * labeled alternative in {@link AlgebraExpressionParser#signAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToAtom(AlgebraExpressionParser.ToAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link AlgebraExpressionParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(AlgebraExpressionParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstantPI}
	 * labeled alternative in {@link AlgebraExpressionParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantPI(AlgebraExpressionParser.ConstantPIContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstantE}
	 * labeled alternative in {@link AlgebraExpressionParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantE(AlgebraExpressionParser.ConstantEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link AlgebraExpressionParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(AlgebraExpressionParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Braces}
	 * labeled alternative in {@link AlgebraExpressionParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBraces(AlgebraExpressionParser.BracesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Cosinus}
	 * labeled alternative in {@link AlgebraExpressionParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCosinus(AlgebraExpressionParser.CosinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Cotangens}
	 * labeled alternative in {@link AlgebraExpressionParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCotangens(AlgebraExpressionParser.CotangensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Tangens}
	 * labeled alternative in {@link AlgebraExpressionParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTangens(AlgebraExpressionParser.TangensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sinus}
	 * labeled alternative in {@link AlgebraExpressionParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinus(AlgebraExpressionParser.SinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArcusCosinus}
	 * labeled alternative in {@link AlgebraExpressionParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArcusCosinus(AlgebraExpressionParser.ArcusCosinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArcusCotangens}
	 * labeled alternative in {@link AlgebraExpressionParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArcusCotangens(AlgebraExpressionParser.ArcusCotangensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArcusTangens}
	 * labeled alternative in {@link AlgebraExpressionParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArcusTangens(AlgebraExpressionParser.ArcusTangensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArcusSinus}
	 * labeled alternative in {@link AlgebraExpressionParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArcusSinus(AlgebraExpressionParser.ArcusSinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Logarithm}
	 * labeled alternative in {@link AlgebraExpressionParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogarithm(AlgebraExpressionParser.LogarithmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NaturalLogarithm}
	 * labeled alternative in {@link AlgebraExpressionParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaturalLogarithm(AlgebraExpressionParser.NaturalLogarithmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SquareRoot}
	 * labeled alternative in {@link AlgebraExpressionParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSquareRoot(AlgebraExpressionParser.SquareRootContext ctx);
}