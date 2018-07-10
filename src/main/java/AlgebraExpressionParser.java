// Generated from C:/Users/S�awek/IdeaProjects/ProjektKompilatory\AlgebraExpression.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AlgebraExpressionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQUAL=1, PLUS=2, MINUS=3, MULTIPLICATION=4, DIVISION=5, POW=6, LEFT_PARENT=7, 
		RIGHT_PARENT=8, MULTIPLICATION_MATRIX=9, MATRIX_TRANS=10, MATRIX_INVERT=11, 
		COS=12, CTAN=13, SIN=14, TAN=15, ACOS=16, ACTAN=17, ASIN=18, ATAN=19, 
		LN=20, LOG=21, SQRT=22, PI=23, E=24, NEWLINE=25, WHITESPACE=26, COMMA=27, 
		OPENBRACKET=28, SEMICOLON=29, SPACES=30, CLOSEBRACKET=31, VARIABLE=32, 
		NUMBER=33;
	public static final int
		RULE_input = 0, RULE_setVariable = 1, RULE_expression = 2, RULE_multiplicationOrDivision = 3, 
		RULE_matrixdef = 4, RULE_matrixrows = 5, RULE_matrixrow = 6, RULE_pow = 7, 
		RULE_signAtom = 8, RULE_atom = 9, RULE_function = 10;
	public static final String[] ruleNames = {
		"input", "setVariable", "expression", "multiplicationOrDivision", "matrixdef", 
		"matrixrows", "matrixrow", "pow", "signAtom", "atom", "function"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'+'", "'-'", "'*'", "'/'", "'^'", "'('", "')'", "'&'", "'tran'", 
		"'inv'", "'cos'", "'ctan'", "'sin'", "'tan'", "'acos'", "'actan'", "'asin'", 
		"'atan'", "'ln'", "'log'", "'sqrt'", "'pi'", "'e'", "'\n'", null, "','", 
		"'['", "';'", null, "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "EQUAL", "PLUS", "MINUS", "MULTIPLICATION", "DIVISION", "POW", "LEFT_PARENT", 
		"RIGHT_PARENT", "MULTIPLICATION_MATRIX", "MATRIX_TRANS", "MATRIX_INVERT", 
		"COS", "CTAN", "SIN", "TAN", "ACOS", "ACTAN", "ASIN", "ATAN", "LN", "LOG", 
		"SQRT", "PI", "E", "NEWLINE", "WHITESPACE", "COMMA", "OPENBRACKET", "SEMICOLON", 
		"SPACES", "CLOSEBRACKET", "VARIABLE", "NUMBER"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AlgebraExpression.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AlgebraExpressionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InputContext extends ParserRuleContext {
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	 
		public InputContext() { }
		public void copyFrom(InputContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToSetVariableContext extends InputContext {
		public SetVariableContext setVariable() {
			return getRuleContext(SetVariableContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(AlgebraExpressionParser.NEWLINE, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public ToSetVariableContext(InputContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).enterToSetVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).exitToSetVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraExpressionVisitor ) return ((AlgebraExpressionVisitor<? extends T>)visitor).visitToSetVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CalculateContext extends InputContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(AlgebraExpressionParser.EOF, 0); }
		public TerminalNode NEWLINE() { return getToken(AlgebraExpressionParser.NEWLINE, 0); }
		public CalculateContext(InputContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).enterCalculate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).exitCalculate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraExpressionVisitor ) return ((AlgebraExpressionVisitor<? extends T>)visitor).visitCalculate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_input);
		int _la;
		try {
			setState(32);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new ToSetVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				setVariable();
				setState(23);
				match(NEWLINE);
				setState(24);
				input();
				}
				break;
			case 2:
				_localctx = new CalculateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				expression(0);
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(27);
					match(NEWLINE);
					}
				}

				setState(30);
				match(EOF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetVariableContext extends ParserRuleContext {
		public SetVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setVariable; }
	 
		public SetVariableContext() { }
		public void copyFrom(SetVariableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SettingVariableContext extends SetVariableContext {
		public TerminalNode VARIABLE() { return getToken(AlgebraExpressionParser.VARIABLE, 0); }
		public TerminalNode EQUAL() { return getToken(AlgebraExpressionParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SettingVariableContext(SetVariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).enterSettingVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).exitSettingVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraExpressionVisitor ) return ((AlgebraExpressionVisitor<? extends T>)visitor).visitSettingVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetVariableContext setVariable() throws RecognitionException {
		SetVariableContext _localctx = new SetVariableContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_setVariable);
		try {
			_localctx = new SettingVariableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(VARIABLE);
			setState(35);
			match(EQUAL);
			setState(36);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToMultiplicationOrDivisionContext extends ExpressionContext {
		public MultiplicationOrDivisionContext multiplicationOrDivision() {
			return getRuleContext(MultiplicationOrDivisionContext.class,0);
		}
		public ToMultiplicationOrDivisionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).enterToMultiplicationOrDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).exitToMultiplicationOrDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraExpressionVisitor ) return ((AlgebraExpressionVisitor<? extends T>)visitor).visitToMultiplicationOrDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(AlgebraExpressionParser.PLUS, 0); }
		public MultiplicationOrDivisionContext multiplicationOrDivision() {
			return getRuleContext(MultiplicationOrDivisionContext.class,0);
		}
		public PlusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).exitPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraExpressionVisitor ) return ((AlgebraExpressionVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(AlgebraExpressionParser.MINUS, 0); }
		public MultiplicationOrDivisionContext multiplicationOrDivision() {
			return getRuleContext(MultiplicationOrDivisionContext.class,0);
		}
		public MinusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).exitMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraExpressionVisitor ) return ((AlgebraExpressionVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToMultiplicationOrDivisionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(39);
			multiplicationOrDivision(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(49);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(47);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new PlusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(41);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(42);
						match(PLUS);
						setState(43);
						multiplicationOrDivision(0);
						}
						break;
					case 2:
						{
						_localctx = new MinusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(44);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(45);
						match(MINUS);
						setState(46);
						multiplicationOrDivision(0);
						}
						break;
					}
					} 
				}
				setState(51);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicationOrDivisionContext extends ParserRuleContext {
		public MultiplicationOrDivisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicationOrDivision; }
	 
		public MultiplicationOrDivisionContext() { }
		public void copyFrom(MultiplicationOrDivisionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MatrixTranspContext extends MultiplicationOrDivisionContext {
		public TerminalNode MATRIX_TRANS() { return getToken(AlgebraExpressionParser.MATRIX_TRANS, 0); }
		public MultiplicationOrDivisionContext multiplicationOrDivision() {
			return getRuleContext(MultiplicationOrDivisionContext.class,0);
		}
		public MatrixTranspContext(MultiplicationOrDivisionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).enterMatrixTransp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).exitMatrixTransp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraExpressionVisitor ) return ((AlgebraExpressionVisitor<? extends T>)visitor).visitMatrixTransp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationContext extends MultiplicationOrDivisionContext {
		public MultiplicationOrDivisionContext multiplicationOrDivision() {
			return getRuleContext(MultiplicationOrDivisionContext.class,0);
		}
		public TerminalNode MULTIPLICATION() { return getToken(AlgebraExpressionParser.MULTIPLICATION, 0); }
		public PowContext pow() {
			return getRuleContext(PowContext.class,0);
		}
		public MultiplicationContext(MultiplicationOrDivisionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).exitMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraExpressionVisitor ) return ((AlgebraExpressionVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToMatrixContext extends MultiplicationOrDivisionContext {
		public MatrixdefContext matrixdef() {
			return getRuleContext(MatrixdefContext.class,0);
		}
		public ToMatrixContext(MultiplicationOrDivisionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).enterToMatrix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).exitToMatrix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraExpressionVisitor ) return ((AlgebraExpressionVisitor<? extends T>)visitor).visitToMatrix(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MatrixMinusContext extends MultiplicationOrDivisionContext {
		public MultiplicationOrDivisionContext multiplicationOrDivision() {
			return getRuleContext(MultiplicationOrDivisionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(AlgebraExpressionParser.MINUS, 0); }
		public MatrixdefContext matrixdef() {
			return getRuleContext(MatrixdefContext.class,0);
		}
		public MatrixMinusContext(MultiplicationOrDivisionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).enterMatrixMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).exitMatrixMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraExpressionVisitor ) return ((AlgebraExpressionVisitor<? extends T>)visitor).visitMatrixMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MatrixInverseContext extends MultiplicationOrDivisionContext {
		public TerminalNode MATRIX_INVERT() { return getToken(AlgebraExpressionParser.MATRIX_INVERT, 0); }
		public MultiplicationOrDivisionContext multiplicationOrDivision() {
			return getRuleContext(MultiplicationOrDivisionContext.class,0);
		}
		public MatrixInverseContext(MultiplicationOrDivisionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).enterMatrixInverse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).exitMatrixInverse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraExpressionVisitor ) return ((AlgebraExpressionVisitor<? extends T>)visitor).visitMatrixInverse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MatrixMultiplicationContext extends MultiplicationOrDivisionContext {
		public MultiplicationOrDivisionContext multiplicationOrDivision() {
			return getRuleContext(MultiplicationOrDivisionContext.class,0);
		}
		public TerminalNode MULTIPLICATION_MATRIX() { return getToken(AlgebraExpressionParser.MULTIPLICATION_MATRIX, 0); }
		public MatrixdefContext matrixdef() {
			return getRuleContext(MatrixdefContext.class,0);
		}
		public MatrixMultiplicationContext(MultiplicationOrDivisionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).enterMatrixMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).exitMatrixMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraExpressionVisitor ) return ((AlgebraExpressionVisitor<? extends T>)visitor).visitMatrixMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToPowerContext extends MultiplicationOrDivisionContext {
		public PowContext pow() {
			return getRuleContext(PowContext.class,0);
		}
		public ToPowerContext(MultiplicationOrDivisionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).enterToPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).exitToPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraExpressionVisitor ) return ((AlgebraExpressionVisitor<? extends T>)visitor).visitToPower(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisionContext extends MultiplicationOrDivisionContext {
		public MultiplicationOrDivisionContext multiplicationOrDivision() {
			return getRuleContext(MultiplicationOrDivisionContext.class,0);
		}
		public TerminalNode DIVISION() { return getToken(AlgebraExpressionParser.DIVISION, 0); }
		public PowContext pow() {
			return getRuleContext(PowContext.class,0);
		}
		public DivisionContext(MultiplicationOrDivisionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).exitDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraExpressionVisitor ) return ((AlgebraExpressionVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MatrixPlusContext extends MultiplicationOrDivisionContext {
		public MultiplicationOrDivisionContext multiplicationOrDivision() {
			return getRuleContext(MultiplicationOrDivisionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(AlgebraExpressionParser.PLUS, 0); }
		public MatrixdefContext matrixdef() {
			return getRuleContext(MatrixdefContext.class,0);
		}
		public MatrixPlusContext(MultiplicationOrDivisionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).enterMatrixPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).exitMatrixPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraExpressionVisitor ) return ((AlgebraExpressionVisitor<? extends T>)visitor).visitMatrixPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MatrixScalarContext extends MultiplicationOrDivisionContext {
		public MultiplicationOrDivisionContext multiplicationOrDivision() {
			return getRuleContext(MultiplicationOrDivisionContext.class,0);
		}
		public TerminalNode MULTIPLICATION() { return getToken(AlgebraExpressionParser.MULTIPLICATION, 0); }
		public MatrixdefContext matrixdef() {
			return getRuleContext(MatrixdefContext.class,0);
		}
		public MatrixScalarContext(MultiplicationOrDivisionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).enterMatrixScalar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).exitMatrixScalar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraExpressionVisitor ) return ((AlgebraExpressionVisitor<? extends T>)visitor).visitMatrixScalar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicationOrDivisionContext multiplicationOrDivision() throws RecognitionException {
		return multiplicationOrDivision(0);
	}

	private MultiplicationOrDivisionContext multiplicationOrDivision(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicationOrDivisionContext _localctx = new MultiplicationOrDivisionContext(_ctx, _parentState);
		MultiplicationOrDivisionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_multiplicationOrDivision, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MATRIX_TRANS:
				{
				_localctx = new MatrixTranspContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(53);
				match(MATRIX_TRANS);
				setState(54);
				multiplicationOrDivision(4);
				}
				break;
			case MATRIX_INVERT:
				{
				_localctx = new MatrixInverseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55);
				match(MATRIX_INVERT);
				setState(56);
				multiplicationOrDivision(3);
				}
				break;
			case MINUS:
			case LEFT_PARENT:
			case COS:
			case CTAN:
			case SIN:
			case TAN:
			case ACOS:
			case ACTAN:
			case ASIN:
			case ATAN:
			case LN:
			case LOG:
			case SQRT:
			case PI:
			case E:
			case VARIABLE:
			case NUMBER:
				{
				_localctx = new ToPowerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(57);
				pow();
				}
				break;
			case OPENBRACKET:
				{
				_localctx = new ToMatrixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(58);
				matrixdef();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(79);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(new MultiplicationOrDivisionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicationOrDivision);
						setState(61);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(62);
						match(MULTIPLICATION);
						setState(63);
						pow();
						}
						break;
					case 2:
						{
						_localctx = new DivisionContext(new MultiplicationOrDivisionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicationOrDivision);
						setState(64);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(65);
						match(DIVISION);
						setState(66);
						pow();
						}
						break;
					case 3:
						{
						_localctx = new MatrixScalarContext(new MultiplicationOrDivisionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicationOrDivision);
						setState(67);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(68);
						match(MULTIPLICATION);
						setState(69);
						matrixdef();
						}
						break;
					case 4:
						{
						_localctx = new MatrixMultiplicationContext(new MultiplicationOrDivisionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicationOrDivision);
						setState(70);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(71);
						match(MULTIPLICATION_MATRIX);
						setState(72);
						matrixdef();
						}
						break;
					case 5:
						{
						_localctx = new MatrixPlusContext(new MultiplicationOrDivisionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicationOrDivision);
						setState(73);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(74);
						match(PLUS);
						setState(75);
						matrixdef();
						}
						break;
					case 6:
						{
						_localctx = new MatrixMinusContext(new MultiplicationOrDivisionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicationOrDivision);
						setState(76);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(77);
						match(MINUS);
						setState(78);
						matrixdef();
						}
						break;
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MatrixdefContext extends ParserRuleContext {
		public MatrixdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrixdef; }
	 
		public MatrixdefContext() { }
		public void copyFrom(MatrixdefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MatrixContext extends MatrixdefContext {
		public TerminalNode OPENBRACKET() { return getToken(AlgebraExpressionParser.OPENBRACKET, 0); }
		public MatrixrowsContext matrixrows() {
			return getRuleContext(MatrixrowsContext.class,0);
		}
		public TerminalNode CLOSEBRACKET() { return getToken(AlgebraExpressionParser.CLOSEBRACKET, 0); }
		public MatrixContext(MatrixdefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).enterMatrix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).exitMatrix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraExpressionVisitor ) return ((AlgebraExpressionVisitor<? extends T>)visitor).visitMatrix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatrixdefContext matrixdef() throws RecognitionException {
		MatrixdefContext _localctx = new MatrixdefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_matrixdef);
		try {
			_localctx = new MatrixContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(OPENBRACKET);
			setState(85);
			matrixrows();
			setState(86);
			match(CLOSEBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatrixrowsContext extends ParserRuleContext {
		public List<MatrixrowContext> matrixrow() {
			return getRuleContexts(MatrixrowContext.class);
		}
		public MatrixrowContext matrixrow(int i) {
			return getRuleContext(MatrixrowContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(AlgebraExpressionParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(AlgebraExpressionParser.SEMICOLON, i);
		}
		public MatrixrowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrixrows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).enterMatrixrows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).exitMatrixrows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraExpressionVisitor ) return ((AlgebraExpressionVisitor<? extends T>)visitor).visitMatrixrows(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatrixrowsContext matrixrows() throws RecognitionException {
		MatrixrowsContext _localctx = new MatrixrowsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_matrixrows);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			matrixrow();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(89);
				match(SEMICOLON);
				setState(90);
				matrixrow();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatrixrowContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SPACES() { return getToken(AlgebraExpressionParser.SPACES, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AlgebraExpressionParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AlgebraExpressionParser.COMMA, i);
		}
		public MatrixrowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrixrow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).enterMatrixrow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).exitMatrixrow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraExpressionVisitor ) return ((AlgebraExpressionVisitor<? extends T>)visitor).visitMatrixrow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatrixrowContext matrixrow() throws RecognitionException {
		MatrixrowContext _localctx = new MatrixrowContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_matrixrow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACES) {
				{
				setState(96);
				match(SPACES);
				}
			}

			setState(99);
			expression(0);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(100);
				match(COMMA);
				setState(101);
				expression(0);
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PowContext extends ParserRuleContext {
		public PowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pow; }
	 
		public PowContext() { }
		public void copyFrom(PowContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PowerContext extends PowContext {
		public SignAtomContext signAtom() {
			return getRuleContext(SignAtomContext.class,0);
		}
		public TerminalNode POW() { return getToken(AlgebraExpressionParser.POW, 0); }
		public PowContext pow() {
			return getRuleContext(PowContext.class,0);
		}
		public PowerContext(PowContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).exitPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraExpressionVisitor ) return ((AlgebraExpressionVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowContext pow() throws RecognitionException {
		PowContext _localctx = new PowContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pow);
		try {
			_localctx = new PowerContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			signAtom();
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(108);
				match(POW);
				setState(109);
				pow();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignAtomContext extends ParserRuleContext {
		public SignAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signAtom; }
	 
		public SignAtomContext() { }
		public void copyFrom(SignAtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ChangeSignContext extends SignAtomContext {
		public TerminalNode MINUS() { return getToken(AlgebraExpressionParser.MINUS, 0); }
		public SignAtomContext signAtom() {
			return getRuleContext(SignAtomContext.class,0);
		}
		public ChangeSignContext(SignAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).enterChangeSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).exitChangeSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraExpressionVisitor ) return ((AlgebraExpressionVisitor<? extends T>)visitor).visitChangeSign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToFunctionContext extends SignAtomContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ToFunctionContext(SignAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).enterToFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).exitToFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraExpressionVisitor ) return ((AlgebraExpressionVisitor<? extends T>)visitor).visitToFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToAtomContext extends SignAtomContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ToAtomContext(SignAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).enterToAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).exitToAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraExpressionVisitor ) return ((AlgebraExpressionVisitor<? extends T>)visitor).visitToAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignAtomContext signAtom() throws RecognitionException {
		SignAtomContext _localctx = new SignAtomContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_signAtom);
		try {
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				_localctx = new ChangeSignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(MINUS);
				setState(113);
				signAtom();
				}
				break;
			case COS:
			case CTAN:
			case SIN:
			case TAN:
			case ACOS:
			case ACTAN:
			case ASIN:
			case ATAN:
			case LN:
			case LOG:
			case SQRT:
				_localctx = new ToFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				function();
				}
				break;
			case LEFT_PARENT:
			case PI:
			case E:
			case VARIABLE:
			case NUMBER:
				_localctx = new ToAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstantPIContext extends AtomContext {
		public TerminalNode PI() { return getToken(AlgebraExpressionParser.PI, 0); }
		public ConstantPIContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).enterConstantPI(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).exitConstantPI(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraExpressionVisitor ) return ((AlgebraExpressionVisitor<? extends T>)visitor).visitConstantPI(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends AtomContext {
		public TerminalNode VARIABLE() { return getToken(AlgebraExpressionParser.VARIABLE, 0); }
		public VariableContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraExpressionVisitor ) return ((AlgebraExpressionVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracesContext extends AtomContext {
		public TerminalNode LEFT_PARENT() { return getToken(AlgebraExpressionParser.LEFT_PARENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARENT() { return getToken(AlgebraExpressionParser.RIGHT_PARENT, 0); }
		public BracesContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).enterBraces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).exitBraces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraExpressionVisitor ) return ((AlgebraExpressionVisitor<? extends T>)visitor).visitBraces(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberContext extends AtomContext {
		public TerminalNode NUMBER() { return getToken(AlgebraExpressionParser.NUMBER, 0); }
		public NumberContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraExpressionVisitor ) return ((AlgebraExpressionVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantEContext extends AtomContext {
		public TerminalNode E() { return getToken(AlgebraExpressionParser.E, 0); }
		public ConstantEContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).enterConstantE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).exitConstantE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraExpressionVisitor ) return ((AlgebraExpressionVisitor<? extends T>)visitor).visitConstantE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_atom);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new NumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(NUMBER);
				}
				break;
			case PI:
				_localctx = new ConstantPIContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(PI);
				}
				break;
			case E:
				_localctx = new ConstantEContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				match(E);
				}
				break;
			case VARIABLE:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				match(VARIABLE);
				}
				break;
			case LEFT_PARENT:
				_localctx = new BracesContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(122);
				match(LEFT_PARENT);
				setState(123);
				expression(0);
				setState(124);
				match(RIGHT_PARENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	 
		public FunctionContext() { }
		public void copyFrom(FunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArcusCosinusContext extends FunctionContext {
		public TerminalNode ACOS() { return getToken(AlgebraExpressionParser.ACOS, 0); }
		public TerminalNode LEFT_PARENT() { return getToken(AlgebraExpressionParser.LEFT_PARENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARENT() { return getToken(AlgebraExpressionParser.RIGHT_PARENT, 0); }
		public ArcusCosinusContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).enterArcusCosinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).exitArcusCosinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraExpressionVisitor ) return ((AlgebraExpressionVisitor<? extends T>)visitor).visitArcusCosinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArcusTangensContext extends FunctionContext {
		public TerminalNode ATAN() { return getToken(AlgebraExpressionParser.ATAN, 0); }
		public TerminalNode LEFT_PARENT() { return getToken(AlgebraExpressionParser.LEFT_PARENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARENT() { return getToken(AlgebraExpressionParser.RIGHT_PARENT, 0); }
		public ArcusTangensContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).enterArcusTangens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).exitArcusTangens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraExpressionVisitor ) return ((AlgebraExpressionVisitor<? extends T>)visitor).visitArcusTangens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NaturalLogarithmContext extends FunctionContext {
		public TerminalNode LN() { return getToken(AlgebraExpressionParser.LN, 0); }
		public TerminalNode LEFT_PARENT() { return getToken(AlgebraExpressionParser.LEFT_PARENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARENT() { return getToken(AlgebraExpressionParser.RIGHT_PARENT, 0); }
		public NaturalLogarithmContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).enterNaturalLogarithm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).exitNaturalLogarithm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraExpressionVisitor ) return ((AlgebraExpressionVisitor<? extends T>)visitor).visitNaturalLogarithm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SinusContext extends FunctionContext {
		public TerminalNode SIN() { return getToken(AlgebraExpressionParser.SIN, 0); }
		public TerminalNode LEFT_PARENT() { return getToken(AlgebraExpressionParser.LEFT_PARENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARENT() { return getToken(AlgebraExpressionParser.RIGHT_PARENT, 0); }
		public SinusContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).enterSinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).exitSinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraExpressionVisitor ) return ((AlgebraExpressionVisitor<? extends T>)visitor).visitSinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogarithmContext extends FunctionContext {
		public TerminalNode LOG() { return getToken(AlgebraExpressionParser.LOG, 0); }
		public TerminalNode LEFT_PARENT() { return getToken(AlgebraExpressionParser.LEFT_PARENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARENT() { return getToken(AlgebraExpressionParser.RIGHT_PARENT, 0); }
		public LogarithmContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).enterLogarithm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).exitLogarithm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraExpressionVisitor ) return ((AlgebraExpressionVisitor<? extends T>)visitor).visitLogarithm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SquareRootContext extends FunctionContext {
		public TerminalNode SQRT() { return getToken(AlgebraExpressionParser.SQRT, 0); }
		public TerminalNode LEFT_PARENT() { return getToken(AlgebraExpressionParser.LEFT_PARENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARENT() { return getToken(AlgebraExpressionParser.RIGHT_PARENT, 0); }
		public SquareRootContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).enterSquareRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).exitSquareRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraExpressionVisitor ) return ((AlgebraExpressionVisitor<? extends T>)visitor).visitSquareRoot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CotangensContext extends FunctionContext {
		public TerminalNode CTAN() { return getToken(AlgebraExpressionParser.CTAN, 0); }
		public TerminalNode LEFT_PARENT() { return getToken(AlgebraExpressionParser.LEFT_PARENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARENT() { return getToken(AlgebraExpressionParser.RIGHT_PARENT, 0); }
		public CotangensContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).enterCotangens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).exitCotangens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraExpressionVisitor ) return ((AlgebraExpressionVisitor<? extends T>)visitor).visitCotangens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArcusCotangensContext extends FunctionContext {
		public TerminalNode ACTAN() { return getToken(AlgebraExpressionParser.ACTAN, 0); }
		public TerminalNode LEFT_PARENT() { return getToken(AlgebraExpressionParser.LEFT_PARENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARENT() { return getToken(AlgebraExpressionParser.RIGHT_PARENT, 0); }
		public ArcusCotangensContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).enterArcusCotangens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).exitArcusCotangens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraExpressionVisitor ) return ((AlgebraExpressionVisitor<? extends T>)visitor).visitArcusCotangens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArcusSinusContext extends FunctionContext {
		public TerminalNode ASIN() { return getToken(AlgebraExpressionParser.ASIN, 0); }
		public TerminalNode LEFT_PARENT() { return getToken(AlgebraExpressionParser.LEFT_PARENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARENT() { return getToken(AlgebraExpressionParser.RIGHT_PARENT, 0); }
		public ArcusSinusContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).enterArcusSinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).exitArcusSinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraExpressionVisitor ) return ((AlgebraExpressionVisitor<? extends T>)visitor).visitArcusSinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CosinusContext extends FunctionContext {
		public TerminalNode COS() { return getToken(AlgebraExpressionParser.COS, 0); }
		public TerminalNode LEFT_PARENT() { return getToken(AlgebraExpressionParser.LEFT_PARENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARENT() { return getToken(AlgebraExpressionParser.RIGHT_PARENT, 0); }
		public CosinusContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).enterCosinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).exitCosinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraExpressionVisitor ) return ((AlgebraExpressionVisitor<? extends T>)visitor).visitCosinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TangensContext extends FunctionContext {
		public TerminalNode TAN() { return getToken(AlgebraExpressionParser.TAN, 0); }
		public TerminalNode LEFT_PARENT() { return getToken(AlgebraExpressionParser.LEFT_PARENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PARENT() { return getToken(AlgebraExpressionParser.RIGHT_PARENT, 0); }
		public TangensContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).enterTangens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgebraExpressionListener ) ((AlgebraExpressionListener)listener).exitTangens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgebraExpressionVisitor ) return ((AlgebraExpressionVisitor<? extends T>)visitor).visitTangens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COS:
				_localctx = new CosinusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(COS);
				setState(129);
				match(LEFT_PARENT);
				setState(130);
				expression(0);
				setState(131);
				match(RIGHT_PARENT);
				}
				break;
			case CTAN:
				_localctx = new CotangensContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(CTAN);
				setState(134);
				match(LEFT_PARENT);
				setState(135);
				expression(0);
				setState(136);
				match(RIGHT_PARENT);
				}
				break;
			case TAN:
				_localctx = new TangensContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				match(TAN);
				setState(139);
				match(LEFT_PARENT);
				setState(140);
				expression(0);
				setState(141);
				match(RIGHT_PARENT);
				}
				break;
			case SIN:
				_localctx = new SinusContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
				match(SIN);
				setState(144);
				match(LEFT_PARENT);
				setState(145);
				expression(0);
				setState(146);
				match(RIGHT_PARENT);
				}
				break;
			case ACOS:
				_localctx = new ArcusCosinusContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(148);
				match(ACOS);
				setState(149);
				match(LEFT_PARENT);
				setState(150);
				expression(0);
				setState(151);
				match(RIGHT_PARENT);
				}
				break;
			case ACTAN:
				_localctx = new ArcusCotangensContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(153);
				match(ACTAN);
				setState(154);
				match(LEFT_PARENT);
				setState(155);
				expression(0);
				setState(156);
				match(RIGHT_PARENT);
				}
				break;
			case ATAN:
				_localctx = new ArcusTangensContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(158);
				match(ATAN);
				setState(159);
				match(LEFT_PARENT);
				setState(160);
				expression(0);
				setState(161);
				match(RIGHT_PARENT);
				}
				break;
			case ASIN:
				_localctx = new ArcusSinusContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(163);
				match(ASIN);
				setState(164);
				match(LEFT_PARENT);
				setState(165);
				expression(0);
				setState(166);
				match(RIGHT_PARENT);
				}
				break;
			case LOG:
				_localctx = new LogarithmContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(168);
				match(LOG);
				setState(169);
				match(LEFT_PARENT);
				setState(170);
				expression(0);
				setState(171);
				match(RIGHT_PARENT);
				}
				break;
			case LN:
				_localctx = new NaturalLogarithmContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(173);
				match(LN);
				setState(174);
				match(LEFT_PARENT);
				setState(175);
				expression(0);
				setState(176);
				match(RIGHT_PARENT);
				}
				break;
			case SQRT:
				_localctx = new SquareRootContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(178);
				match(SQRT);
				setState(179);
				match(LEFT_PARENT);
				setState(180);
				expression(0);
				setState(181);
				match(RIGHT_PARENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 3:
			return multiplicationOrDivision_sempred((MultiplicationOrDivisionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean multiplicationOrDivision_sempred(MultiplicationOrDivisionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00bc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\5\2\37\n\2\3\2\3\2\5\2#\n\2\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\62\n\4\f\4\16\4\65"+
		"\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5>\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5R\n\5\f\5\16\5U\13\5\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7^\n\7\f\7\16\7a\13\7\3\b\5\bd\n\b\3\b\3"+
		"\b\3\b\7\bi\n\b\f\b\16\bl\13\b\3\t\3\t\3\t\5\tq\n\t\3\n\3\n\3\n\3\n\5"+
		"\nw\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0081\n\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u00ba\n\f\3\f\2\4\6\b\r\2\4\6\b\n\f\16\20\22\24\26\2\2\2\u00d1"+
		"\2\"\3\2\2\2\4$\3\2\2\2\6(\3\2\2\2\b=\3\2\2\2\nV\3\2\2\2\fZ\3\2\2\2\16"+
		"c\3\2\2\2\20m\3\2\2\2\22v\3\2\2\2\24\u0080\3\2\2\2\26\u00b9\3\2\2\2\30"+
		"\31\5\4\3\2\31\32\7\33\2\2\32\33\5\2\2\2\33#\3\2\2\2\34\36\5\6\4\2\35"+
		"\37\7\33\2\2\36\35\3\2\2\2\36\37\3\2\2\2\37 \3\2\2\2 !\7\2\2\3!#\3\2\2"+
		"\2\"\30\3\2\2\2\"\34\3\2\2\2#\3\3\2\2\2$%\7\"\2\2%&\7\3\2\2&\'\5\6\4\2"+
		"\'\5\3\2\2\2()\b\4\1\2)*\5\b\5\2*\63\3\2\2\2+,\f\5\2\2,-\7\4\2\2-\62\5"+
		"\b\5\2./\f\4\2\2/\60\7\5\2\2\60\62\5\b\5\2\61+\3\2\2\2\61.\3\2\2\2\62"+
		"\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\7\3\2\2\2\65\63\3\2\2\2\66"+
		"\67\b\5\1\2\678\7\f\2\28>\5\b\5\69:\7\r\2\2:>\5\b\5\5;>\5\20\t\2<>\5\n"+
		"\6\2=\66\3\2\2\2=9\3\2\2\2=;\3\2\2\2=<\3\2\2\2>S\3\2\2\2?@\f\f\2\2@A\7"+
		"\6\2\2AR\5\20\t\2BC\f\13\2\2CD\7\7\2\2DR\5\20\t\2EF\f\n\2\2FG\7\6\2\2"+
		"GR\5\n\6\2HI\f\t\2\2IJ\7\13\2\2JR\5\n\6\2KL\f\b\2\2LM\7\4\2\2MR\5\n\6"+
		"\2NO\f\7\2\2OP\7\5\2\2PR\5\n\6\2Q?\3\2\2\2QB\3\2\2\2QE\3\2\2\2QH\3\2\2"+
		"\2QK\3\2\2\2QN\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\t\3\2\2\2US\3\2"+
		"\2\2VW\7\36\2\2WX\5\f\7\2XY\7!\2\2Y\13\3\2\2\2Z_\5\16\b\2[\\\7\37\2\2"+
		"\\^\5\16\b\2][\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\r\3\2\2\2a_\3\2"+
		"\2\2bd\7 \2\2cb\3\2\2\2cd\3\2\2\2de\3\2\2\2ej\5\6\4\2fg\7\35\2\2gi\5\6"+
		"\4\2hf\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\17\3\2\2\2lj\3\2\2\2mp\5"+
		"\22\n\2no\7\b\2\2oq\5\20\t\2pn\3\2\2\2pq\3\2\2\2q\21\3\2\2\2rs\7\5\2\2"+
		"sw\5\22\n\2tw\5\26\f\2uw\5\24\13\2vr\3\2\2\2vt\3\2\2\2vu\3\2\2\2w\23\3"+
		"\2\2\2x\u0081\7#\2\2y\u0081\7\31\2\2z\u0081\7\32\2\2{\u0081\7\"\2\2|}"+
		"\7\t\2\2}~\5\6\4\2~\177\7\n\2\2\177\u0081\3\2\2\2\u0080x\3\2\2\2\u0080"+
		"y\3\2\2\2\u0080z\3\2\2\2\u0080{\3\2\2\2\u0080|\3\2\2\2\u0081\25\3\2\2"+
		"\2\u0082\u0083\7\16\2\2\u0083\u0084\7\t\2\2\u0084\u0085\5\6\4\2\u0085"+
		"\u0086\7\n\2\2\u0086\u00ba\3\2\2\2\u0087\u0088\7\17\2\2\u0088\u0089\7"+
		"\t\2\2\u0089\u008a\5\6\4\2\u008a\u008b\7\n\2\2\u008b\u00ba\3\2\2\2\u008c"+
		"\u008d\7\21\2\2\u008d\u008e\7\t\2\2\u008e\u008f\5\6\4\2\u008f\u0090\7"+
		"\n\2\2\u0090\u00ba\3\2\2\2\u0091\u0092\7\20\2\2\u0092\u0093\7\t\2\2\u0093"+
		"\u0094\5\6\4\2\u0094\u0095\7\n\2\2\u0095\u00ba\3\2\2\2\u0096\u0097\7\22"+
		"\2\2\u0097\u0098\7\t\2\2\u0098\u0099\5\6\4\2\u0099\u009a\7\n\2\2\u009a"+
		"\u00ba\3\2\2\2\u009b\u009c\7\23\2\2\u009c\u009d\7\t\2\2\u009d\u009e\5"+
		"\6\4\2\u009e\u009f\7\n\2\2\u009f\u00ba\3\2\2\2\u00a0\u00a1\7\25\2\2\u00a1"+
		"\u00a2\7\t\2\2\u00a2\u00a3\5\6\4\2\u00a3\u00a4\7\n\2\2\u00a4\u00ba\3\2"+
		"\2\2\u00a5\u00a6\7\24\2\2\u00a6\u00a7\7\t\2\2\u00a7\u00a8\5\6\4\2\u00a8"+
		"\u00a9\7\n\2\2\u00a9\u00ba\3\2\2\2\u00aa\u00ab\7\27\2\2\u00ab\u00ac\7"+
		"\t\2\2\u00ac\u00ad\5\6\4\2\u00ad\u00ae\7\n\2\2\u00ae\u00ba\3\2\2\2\u00af"+
		"\u00b0\7\26\2\2\u00b0\u00b1\7\t\2\2\u00b1\u00b2\5\6\4\2\u00b2\u00b3\7"+
		"\n\2\2\u00b3\u00ba\3\2\2\2\u00b4\u00b5\7\30\2\2\u00b5\u00b6\7\t\2\2\u00b6"+
		"\u00b7\5\6\4\2\u00b7\u00b8\7\n\2\2\u00b8\u00ba\3\2\2\2\u00b9\u0082\3\2"+
		"\2\2\u00b9\u0087\3\2\2\2\u00b9\u008c\3\2\2\2\u00b9\u0091\3\2\2\2\u00b9"+
		"\u0096\3\2\2\2\u00b9\u009b\3\2\2\2\u00b9\u00a0\3\2\2\2\u00b9\u00a5\3\2"+
		"\2\2\u00b9\u00aa\3\2\2\2\u00b9\u00af\3\2\2\2\u00b9\u00b4\3\2\2\2\u00ba"+
		"\27\3\2\2\2\20\36\"\61\63=QS_cjpv\u0080\u00b9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}