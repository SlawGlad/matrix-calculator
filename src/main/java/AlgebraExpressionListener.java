// Generated from C:/Users/S³awek/IdeaProjects/ProjektKompilatory\AlgebraExpression.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AlgebraExpressionParser}.
 */
public interface AlgebraExpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code ToSetVariable}
	 * labeled alternative in {@link AlgebraExpressionParser#input}.
	 * @param ctx the parse tree
	 */
	void enterToSetVariable(AlgebraExpressionParser.ToSetVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToSetVariable}
	 * labeled alternative in {@link AlgebraExpressionParser#input}.
	 * @param ctx the parse tree
	 */
	void exitToSetVariable(AlgebraExpressionParser.ToSetVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Calculate}
	 * labeled alternative in {@link AlgebraExpressionParser#input}.
	 * @param ctx the parse tree
	 */
	void enterCalculate(AlgebraExpressionParser.CalculateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Calculate}
	 * labeled alternative in {@link AlgebraExpressionParser#input}.
	 * @param ctx the parse tree
	 */
	void exitCalculate(AlgebraExpressionParser.CalculateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SettingVariable}
	 * labeled alternative in {@link AlgebraExpressionParser#setVariable}.
	 * @param ctx the parse tree
	 */
	void enterSettingVariable(AlgebraExpressionParser.SettingVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SettingVariable}
	 * labeled alternative in {@link AlgebraExpressionParser#setVariable}.
	 * @param ctx the parse tree
	 */
	void exitSettingVariable(AlgebraExpressionParser.SettingVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToMultiplicationOrDivision}
	 * labeled alternative in {@link AlgebraExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterToMultiplicationOrDivision(AlgebraExpressionParser.ToMultiplicationOrDivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToMultiplicationOrDivision}
	 * labeled alternative in {@link AlgebraExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitToMultiplicationOrDivision(AlgebraExpressionParser.ToMultiplicationOrDivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link AlgebraExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlus(AlgebraExpressionParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link AlgebraExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlus(AlgebraExpressionParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link AlgebraExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMinus(AlgebraExpressionParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link AlgebraExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMinus(AlgebraExpressionParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatrixTransp}
	 * labeled alternative in {@link AlgebraExpressionParser#multiplicationOrDivision}.
	 * @param ctx the parse tree
	 */
	void enterMatrixTransp(AlgebraExpressionParser.MatrixTranspContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatrixTransp}
	 * labeled alternative in {@link AlgebraExpressionParser#multiplicationOrDivision}.
	 * @param ctx the parse tree
	 */
	void exitMatrixTransp(AlgebraExpressionParser.MatrixTranspContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link AlgebraExpressionParser#multiplicationOrDivision}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(AlgebraExpressionParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link AlgebraExpressionParser#multiplicationOrDivision}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(AlgebraExpressionParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToMatrix}
	 * labeled alternative in {@link AlgebraExpressionParser#multiplicationOrDivision}.
	 * @param ctx the parse tree
	 */
	void enterToMatrix(AlgebraExpressionParser.ToMatrixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToMatrix}
	 * labeled alternative in {@link AlgebraExpressionParser#multiplicationOrDivision}.
	 * @param ctx the parse tree
	 */
	void exitToMatrix(AlgebraExpressionParser.ToMatrixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatrixMinus}
	 * labeled alternative in {@link AlgebraExpressionParser#multiplicationOrDivision}.
	 * @param ctx the parse tree
	 */
	void enterMatrixMinus(AlgebraExpressionParser.MatrixMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatrixMinus}
	 * labeled alternative in {@link AlgebraExpressionParser#multiplicationOrDivision}.
	 * @param ctx the parse tree
	 */
	void exitMatrixMinus(AlgebraExpressionParser.MatrixMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatrixInverse}
	 * labeled alternative in {@link AlgebraExpressionParser#multiplicationOrDivision}.
	 * @param ctx the parse tree
	 */
	void enterMatrixInverse(AlgebraExpressionParser.MatrixInverseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatrixInverse}
	 * labeled alternative in {@link AlgebraExpressionParser#multiplicationOrDivision}.
	 * @param ctx the parse tree
	 */
	void exitMatrixInverse(AlgebraExpressionParser.MatrixInverseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatrixMultiplication}
	 * labeled alternative in {@link AlgebraExpressionParser#multiplicationOrDivision}.
	 * @param ctx the parse tree
	 */
	void enterMatrixMultiplication(AlgebraExpressionParser.MatrixMultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatrixMultiplication}
	 * labeled alternative in {@link AlgebraExpressionParser#multiplicationOrDivision}.
	 * @param ctx the parse tree
	 */
	void exitMatrixMultiplication(AlgebraExpressionParser.MatrixMultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToPower}
	 * labeled alternative in {@link AlgebraExpressionParser#multiplicationOrDivision}.
	 * @param ctx the parse tree
	 */
	void enterToPower(AlgebraExpressionParser.ToPowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToPower}
	 * labeled alternative in {@link AlgebraExpressionParser#multiplicationOrDivision}.
	 * @param ctx the parse tree
	 */
	void exitToPower(AlgebraExpressionParser.ToPowerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Division}
	 * labeled alternative in {@link AlgebraExpressionParser#multiplicationOrDivision}.
	 * @param ctx the parse tree
	 */
	void enterDivision(AlgebraExpressionParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link AlgebraExpressionParser#multiplicationOrDivision}.
	 * @param ctx the parse tree
	 */
	void exitDivision(AlgebraExpressionParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatrixPlus}
	 * labeled alternative in {@link AlgebraExpressionParser#multiplicationOrDivision}.
	 * @param ctx the parse tree
	 */
	void enterMatrixPlus(AlgebraExpressionParser.MatrixPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatrixPlus}
	 * labeled alternative in {@link AlgebraExpressionParser#multiplicationOrDivision}.
	 * @param ctx the parse tree
	 */
	void exitMatrixPlus(AlgebraExpressionParser.MatrixPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatrixScalar}
	 * labeled alternative in {@link AlgebraExpressionParser#multiplicationOrDivision}.
	 * @param ctx the parse tree
	 */
	void enterMatrixScalar(AlgebraExpressionParser.MatrixScalarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatrixScalar}
	 * labeled alternative in {@link AlgebraExpressionParser#multiplicationOrDivision}.
	 * @param ctx the parse tree
	 */
	void exitMatrixScalar(AlgebraExpressionParser.MatrixScalarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Matrix}
	 * labeled alternative in {@link AlgebraExpressionParser#matrixdef}.
	 * @param ctx the parse tree
	 */
	void enterMatrix(AlgebraExpressionParser.MatrixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Matrix}
	 * labeled alternative in {@link AlgebraExpressionParser#matrixdef}.
	 * @param ctx the parse tree
	 */
	void exitMatrix(AlgebraExpressionParser.MatrixContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgebraExpressionParser#matrixrows}.
	 * @param ctx the parse tree
	 */
	void enterMatrixrows(AlgebraExpressionParser.MatrixrowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgebraExpressionParser#matrixrows}.
	 * @param ctx the parse tree
	 */
	void exitMatrixrows(AlgebraExpressionParser.MatrixrowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgebraExpressionParser#matrixrow}.
	 * @param ctx the parse tree
	 */
	void enterMatrixrow(AlgebraExpressionParser.MatrixrowContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgebraExpressionParser#matrixrow}.
	 * @param ctx the parse tree
	 */
	void exitMatrixrow(AlgebraExpressionParser.MatrixrowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Power}
	 * labeled alternative in {@link AlgebraExpressionParser#pow}.
	 * @param ctx the parse tree
	 */
	void enterPower(AlgebraExpressionParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Power}
	 * labeled alternative in {@link AlgebraExpressionParser#pow}.
	 * @param ctx the parse tree
	 */
	void exitPower(AlgebraExpressionParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ChangeSign}
	 * labeled alternative in {@link AlgebraExpressionParser#signAtom}.
	 * @param ctx the parse tree
	 */
	void enterChangeSign(AlgebraExpressionParser.ChangeSignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChangeSign}
	 * labeled alternative in {@link AlgebraExpressionParser#signAtom}.
	 * @param ctx the parse tree
	 */
	void exitChangeSign(AlgebraExpressionParser.ChangeSignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToFunction}
	 * labeled alternative in {@link AlgebraExpressionParser#signAtom}.
	 * @param ctx the parse tree
	 */
	void enterToFunction(AlgebraExpressionParser.ToFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToFunction}
	 * labeled alternative in {@link AlgebraExpressionParser#signAtom}.
	 * @param ctx the parse tree
	 */
	void exitToFunction(AlgebraExpressionParser.ToFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToAtom}
	 * labeled alternative in {@link AlgebraExpressionParser#signAtom}.
	 * @param ctx the parse tree
	 */
	void enterToAtom(AlgebraExpressionParser.ToAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToAtom}
	 * labeled alternative in {@link AlgebraExpressionParser#signAtom}.
	 * @param ctx the parse tree
	 */
	void exitToAtom(AlgebraExpressionParser.ToAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link AlgebraExpressionParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumber(AlgebraExpressionParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link AlgebraExpressionParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumber(AlgebraExpressionParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstantPI}
	 * labeled alternative in {@link AlgebraExpressionParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterConstantPI(AlgebraExpressionParser.ConstantPIContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstantPI}
	 * labeled alternative in {@link AlgebraExpressionParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitConstantPI(AlgebraExpressionParser.ConstantPIContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstantE}
	 * labeled alternative in {@link AlgebraExpressionParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterConstantE(AlgebraExpressionParser.ConstantEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstantE}
	 * labeled alternative in {@link AlgebraExpressionParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitConstantE(AlgebraExpressionParser.ConstantEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link AlgebraExpressionParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterVariable(AlgebraExpressionParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link AlgebraExpressionParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitVariable(AlgebraExpressionParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Braces}
	 * labeled alternative in {@link AlgebraExpressionParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBraces(AlgebraExpressionParser.BracesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Braces}
	 * labeled alternative in {@link AlgebraExpressionParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBraces(AlgebraExpressionParser.BracesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Cosinus}
	 * labeled alternative in {@link AlgebraExpressionParser#function}.
	 * @param ctx the parse tree
	 */
	void enterCosinus(AlgebraExpressionParser.CosinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Cosinus}
	 * labeled alternative in {@link AlgebraExpressionParser#function}.
	 * @param ctx the parse tree
	 */
	void exitCosinus(AlgebraExpressionParser.CosinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Cotangens}
	 * labeled alternative in {@link AlgebraExpressionParser#function}.
	 * @param ctx the parse tree
	 */
	void enterCotangens(AlgebraExpressionParser.CotangensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Cotangens}
	 * labeled alternative in {@link AlgebraExpressionParser#function}.
	 * @param ctx the parse tree
	 */
	void exitCotangens(AlgebraExpressionParser.CotangensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Tangens}
	 * labeled alternative in {@link AlgebraExpressionParser#function}.
	 * @param ctx the parse tree
	 */
	void enterTangens(AlgebraExpressionParser.TangensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Tangens}
	 * labeled alternative in {@link AlgebraExpressionParser#function}.
	 * @param ctx the parse tree
	 */
	void exitTangens(AlgebraExpressionParser.TangensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sinus}
	 * labeled alternative in {@link AlgebraExpressionParser#function}.
	 * @param ctx the parse tree
	 */
	void enterSinus(AlgebraExpressionParser.SinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sinus}
	 * labeled alternative in {@link AlgebraExpressionParser#function}.
	 * @param ctx the parse tree
	 */
	void exitSinus(AlgebraExpressionParser.SinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArcusCosinus}
	 * labeled alternative in {@link AlgebraExpressionParser#function}.
	 * @param ctx the parse tree
	 */
	void enterArcusCosinus(AlgebraExpressionParser.ArcusCosinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArcusCosinus}
	 * labeled alternative in {@link AlgebraExpressionParser#function}.
	 * @param ctx the parse tree
	 */
	void exitArcusCosinus(AlgebraExpressionParser.ArcusCosinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArcusCotangens}
	 * labeled alternative in {@link AlgebraExpressionParser#function}.
	 * @param ctx the parse tree
	 */
	void enterArcusCotangens(AlgebraExpressionParser.ArcusCotangensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArcusCotangens}
	 * labeled alternative in {@link AlgebraExpressionParser#function}.
	 * @param ctx the parse tree
	 */
	void exitArcusCotangens(AlgebraExpressionParser.ArcusCotangensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArcusTangens}
	 * labeled alternative in {@link AlgebraExpressionParser#function}.
	 * @param ctx the parse tree
	 */
	void enterArcusTangens(AlgebraExpressionParser.ArcusTangensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArcusTangens}
	 * labeled alternative in {@link AlgebraExpressionParser#function}.
	 * @param ctx the parse tree
	 */
	void exitArcusTangens(AlgebraExpressionParser.ArcusTangensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArcusSinus}
	 * labeled alternative in {@link AlgebraExpressionParser#function}.
	 * @param ctx the parse tree
	 */
	void enterArcusSinus(AlgebraExpressionParser.ArcusSinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArcusSinus}
	 * labeled alternative in {@link AlgebraExpressionParser#function}.
	 * @param ctx the parse tree
	 */
	void exitArcusSinus(AlgebraExpressionParser.ArcusSinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Logarithm}
	 * labeled alternative in {@link AlgebraExpressionParser#function}.
	 * @param ctx the parse tree
	 */
	void enterLogarithm(AlgebraExpressionParser.LogarithmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Logarithm}
	 * labeled alternative in {@link AlgebraExpressionParser#function}.
	 * @param ctx the parse tree
	 */
	void exitLogarithm(AlgebraExpressionParser.LogarithmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NaturalLogarithm}
	 * labeled alternative in {@link AlgebraExpressionParser#function}.
	 * @param ctx the parse tree
	 */
	void enterNaturalLogarithm(AlgebraExpressionParser.NaturalLogarithmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NaturalLogarithm}
	 * labeled alternative in {@link AlgebraExpressionParser#function}.
	 * @param ctx the parse tree
	 */
	void exitNaturalLogarithm(AlgebraExpressionParser.NaturalLogarithmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SquareRoot}
	 * labeled alternative in {@link AlgebraExpressionParser#function}.
	 * @param ctx the parse tree
	 */
	void enterSquareRoot(AlgebraExpressionParser.SquareRootContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SquareRoot}
	 * labeled alternative in {@link AlgebraExpressionParser#function}.
	 * @param ctx the parse tree
	 */
	void exitSquareRoot(AlgebraExpressionParser.SquareRootContext ctx);
}