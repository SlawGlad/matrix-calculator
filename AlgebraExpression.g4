grammar AlgebraExpression;

//PARSER RULES

input
    : setVariable NEWLINE input		#ToSetVariable
    | expression NEWLINE? EOF		#Calculate
    ;

setVariable
    : VARIABLE EQUAL expression	#SettingVariable
    ;

expression
    : expression PLUS multiplicationOrDivision	        #Plus
    | expression MINUS multiplicationOrDivision	        #Minus
    | multiplicationOrDivision                          #ToMultiplicationOrDivision
    ;

multiplicationOrDivision
    : multiplicationOrDivision MULTIPLICATION pow	             #Multiplication
    | multiplicationOrDivision DIVISION pow  		             #Division
    | multiplicationOrDivision MULTIPLICATION matrixdef          #MatrixScalar
    | multiplicationOrDivision MULTIPLICATION_MATRIX matrixdef   #MatrixMultiplication
    | multiplicationOrDivision PLUS matrixdef                    #MatrixPlus
    | multiplicationOrDivision MINUS matrixdef                   #MatrixMinus
    | MATRIX_TRANS multiplicationOrDivision                      #MatrixTransp
    | MATRIX_INVERT multiplicationOrDivision                     #MatrixInverse
    | pow                		                                 #ToPower
    | matrixdef                                                  #ToMatrix
    ;

matrixdef
: OPENBRACKET matrixrows CLOSEBRACKET   #Matrix
;
matrixrows : matrixrow (SEMICOLON matrixrow)*;
matrixrow : SPACES? expression ( COMMA expression)*;

pow
    : signAtom (POW pow)?	#Power
    ;

signAtom
    : MINUS signAtom	#ChangeSign
    | function			#ToFunction
    | atom             	#ToAtom
    ;

atom
    : NUMBER                               #Number
    | PI                     			   #ConstantPI
    | E                					   #ConstantE
    | VARIABLE                   		   #Variable
    | LEFT_PARENT expression RIGHT_PARENT  #Braces
    ;

function
   : COS LEFT_PARENT expression RIGHT_PARENT	#Cosinus
   | CTAN LEFT_PARENT expression RIGHT_PARENT	#Cotangens
   | TAN LEFT_PARENT expression RIGHT_PARENT	#Tangens
   | SIN LEFT_PARENT expression RIGHT_PARENT	#Sinus
   | ACOS LEFT_PARENT expression RIGHT_PARENT	#ArcusCosinus
   | ACTAN LEFT_PARENT expression RIGHT_PARENT  #ArcusCotangens
   | ATAN LEFT_PARENT expression RIGHT_PARENT	#ArcusTangens
   | ASIN LEFT_PARENT expression RIGHT_PARENT	#ArcusSinus
   | LOG LEFT_PARENT expression RIGHT_PARENT	#Logarithm
   | LN	LEFT_PARENT expression RIGHT_PARENT	    #NaturalLogarithm
   | SQRT LEFT_PARENT expression RIGHT_PARENT	#SquareRoot
   ;

//LEXER RULES

//Operators
EQUAL 			: '=';
PLUS  			: '+';
MINUS 			: '-';
MULTIPLICATION  : '*';
DIVISION   		: '/';
POW   			: '^';
LEFT_PARENT  	: '(';
RIGHT_PARENT  	: ')';

//Matrix operators
MULTIPLICATION_MATRIX: '&';
MATRIX_TRANS: 'tran';
MATRIX_INVERT: 'inv';

//Functions
COS   : 'cos';
CTAN  : 'ctan';
SIN   : 'sin';
TAN   : 'tan';
ACOS  : 'acos';
ACTAN : 'actan';
ASIN  : 'asin';
ATAN  : 'atan';
LN    : 'ln';
LOG   : 'log';
SQRT  : 'sqrt';

//Constants
PI     : 'pi';
E      : 'e';

//Special
NEWLINE  	 : '\n';
WHITESPACE   : [ \t\r]+ -> skip;
COMMA    	 : ',';

//Matrix
OPENBRACKET : '[';
SEMICOLON : ';';
SPACES : [ \t]+;
CLOSEBRACKET: ']';

//Numbers and Variables
VARIABLE : [a-zA-Z_][a-zA-Z_0-9]*;

NUMBER
   : ('0' .. '9') + ('.' ('0' .. '9') +)?
   ;