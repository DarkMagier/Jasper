// Generated from /Users/auth/IdeaProjects/Jasper/src/main/antlr/grammar/JasperParser.g4 by ANTLR 4.13.2
package gen.antlr.jasper;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class JasperParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Int=1, Int8=2, Int16=3, Int32=4, Int64=5, Int128=6, UInt=7, UInt8=8, UInt16=9, 
		UInt32=10, UInt64=11, UInt128=12, Float=13, Float32=14, Float64=15, Float128=16, 
		Char=17, Char8=18, Char16=19, Char32=20, Byte=21, Bytes=22, String=23, 
		Regex=24, Bool=25, True=26, False=27, Var=28, Const=29, Pointer=30, Unit=31, 
		Any=32, Function=33, Class=34, Enum=35, Interface=36, Abstract=37, Extends=38, 
		Implements=39, Constructor=40, Destructor=41, Super=42, This=43, Public=44, 
		Protected=45, Private=46, Static=47, New=48, If=49, Else=50, While=51, 
		Do=52, For=53, In=54, Switch=55, Default=56, Continue=57, Break=58, Return=59, 
		Try=60, Catch=61, Finally=62, Throw=63, Throws=64, Defer=65, Await=66, 
		Go=67, Yield=68, Lock=69, Atomic=70, And=71, Or=72, Not=73, Is=74, Package=75, 
		Import=76, Module=77, Export=78, Extern=79, Dict=80, Null=81, Assert=82, 
		Final=83, Underscore=84, DEC_LITERAL=85, HEX_LITERAL=86, OCT_LITERAL=87, 
		BIN_LITERAL=88, STRING_LITERAL=89, RAW_STRING_LITERAL=90, REGEX_LITERAL=91, 
		FORMAT_STRING_LITERAL=92, BYTE_STRING_LITERAL=93, UNICODE_STRING_LITERAL=94, 
		TRIPLE_STRING_LITERAL=95, RAW_TRIPLE_STRING_LITERAL=96, FORMAT_TRIPLE_STRING_LITERAL=97, 
		ELLIPSIS=98, ARROW=99, SAFE_DOT=100, NULL_COALESCE_ASSIGN=101, NULL_COALESCE=102, 
		POW_ASSIGN=103, POW=104, COLON_COLON=105, URSHIFT_ASSIGN=106, URSHIFT=107, 
		RSHIFT_ASSIGN=108, RSHIFT=109, LSHIFT_ASSIGN=110, LSHIFT=111, PLUS_PLUS=112, 
		MINUS_MINUS=113, EQUAL_EQUAL=114, NOT_EQUAL=115, LE=116, GE=117, AND_AND=118, 
		OR_OR=119, PLUS_ASSIGN=120, MINUS_ASSIGN=121, STAR_ASSIGN=122, SLASH_ASSIGN=123, 
		PERCENT_ASSIGN=124, AND_ASSIGN=125, OR_ASSIGN=126, CARET_ASSIGN=127, LPAREN=128, 
		RPAREN=129, LBRACK=130, RBRACK=131, LBRACE=132, RBRACE=133, SEMI=134, 
		COMMA=135, DOT=136, COLON=137, QUESTION=138, AT=139, FAT_ARROW=140, ASSIGN=141, 
		GT=142, LT=143, PLUS=144, MINUS=145, STAR=146, SLASH=147, PERCENT=148, 
		BANG=149, TILDE=150, AMP=151, PIPE=152, Dollar=153, FULLWIDTH_PIPE=154, 
		CARET=155, Identifier=156, WS=157, LINE_COMMENT=158, BLOCK_COMMENT=159;
	public static final int
		RULE_sourceFile = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_fromImportDeclaration = 3, RULE_importClause = 4, RULE_importItem = 5, 
		RULE_topLevelItem = 6, RULE_topLevelDecl = 7, RULE_topLevelVariableDeclaration = 8, 
		RULE_softKeyword = 9, RULE_softWhen = 10, RULE_softThen = 11, RULE_softLabel = 12, 
		RULE_softDecorate = 13, RULE_softFrom = 14, RULE_softAs = 15, RULE_softCast = 16, 
		RULE_softJson = 17, RULE_softGet = 18, RULE_softSet = 19, RULE_softOr = 20, 
		RULE_softAnd = 21, RULE_softNot = 22, RULE_qualifiedName = 23, RULE_literal = 24, 
		RULE_dictLiteral = 25, RULE_dictEntry = 26, RULE_jsonLiteral = 27, RULE_jsonEntry = 28, 
		RULE_jsonValue = 29, RULE_arrayInitializer = 30, RULE_primitiveType = 31, 
		RULE_typeExpr = 32, RULE_type = 33, RULE_typePrefix = 34, RULE_typeStarRun = 35, 
		RULE_typeAmpRun = 36, RULE_typeSoftModifier = 37, RULE_typeAtom = 38, 
		RULE_typeAtomBase = 39, RULE_typeQualifier = 40, RULE_typeSuffix = 41, 
		RULE_typePostfix = 42, RULE_typeArguments = 43, RULE_typeArgumentsOrDiamond = 44, 
		RULE_typeArgument = 45, RULE_typeParameters = 46, RULE_typeParameter = 47, 
		RULE_typeBound = 48, RULE_wildcard = 49, RULE_wildcardBounds = 50, RULE_modifier = 51, 
		RULE_annotation = 52, RULE_annotationArguments = 53, RULE_annotationArgumentList = 54, 
		RULE_annotationPositionalArgument = 55, RULE_annotationNamedArgument = 56, 
		RULE_annotationSpreadArgument = 57, RULE_annotationArgumentValue = 58, 
		RULE_elementValue = 59, RULE_defaultValue = 60, RULE_normalClassDeclaration = 61, 
		RULE_superclass = 62, RULE_superinterfaces = 63, RULE_classBody = 64, 
		RULE_classBodyDeclaration = 65, RULE_fieldDeclaration = 66, RULE_propertyDeclaration = 67, 
		RULE_propertyVarHeader = 68, RULE_propertyConstHeader = 69, RULE_propertyAccessor = 70, 
		RULE_propertyAccessorBlock = 71, RULE_accessorBlock = 72, RULE_accessorItem = 73, 
		RULE_getterOnlyBlock = 74, RULE_methodDeclaration = 75, RULE_methodHeader = 76, 
		RULE_methodDeclarator = 77, RULE_methodBody = 78, RULE_constructorDeclaration = 79, 
		RULE_constructorHeader = 80, RULE_constructorDeclarator = 81, RULE_constructorBody = 82, 
		RULE_explicitConstructorInvocation = 83, RULE_destructorDeclaration = 84, 
		RULE_enumDeclaration = 85, RULE_enumBody = 86, RULE_enumConstant = 87, 
		RULE_enumBodyDeclarations = 88, RULE_normalInterfaceDeclaration = 89, 
		RULE_extendsInterfaces = 90, RULE_interfaceBody = 91, RULE_interfaceMemberDeclaration = 92, 
		RULE_interfacePropertyDeclaration = 93, RULE_interfacePropertyHeader = 94, 
		RULE_constantDeclaration = 95, RULE_interfaceMethodDeclaration = 96, RULE_annotationTypeDeclaration = 97, 
		RULE_annotationTypeBody = 98, RULE_annotationTypeMemberDeclaration = 99, 
		RULE_typeOrPrimitive = 100, RULE_annotationTypeElementDeclaration = 101, 
		RULE_functionReturnType = 102, RULE_result = 103, RULE_formalParameters = 104, 
		RULE_formalParameter = 105, RULE_lastFormalParameter = 106, RULE_receiverParameter = 107, 
		RULE_throws_ = 108, RULE_exceptionType = 109, RULE_localVariableDeclarationStatement = 110, 
		RULE_localVariableDeclaration = 111, RULE_varDeclarator = 112, RULE_variableDeclarator = 113, 
		RULE_variableDeclaratorId = 114, RULE_variableInitializer = 115, RULE_maybeTypedBinding = 116, 
		RULE_typedBinding = 117, RULE_catchBinding = 118, RULE_pattern = 119, 
		RULE_patternOr = 120, RULE_patternAnd = 121, RULE_patternUnary = 122, 
		RULE_patternPrimary = 123, RULE_primaryPattern = 124, RULE_bindingOrNamePattern = 125, 
		RULE_bindingPattern = 126, RULE_bindingPatternNoType = 127, RULE_bindingAtom = 128, 
		RULE_bindingTuple = 129, RULE_bindingNoTypeAtom = 130, RULE_bindingNoTypeTuple = 131, 
		RULE_forInAssignPattern = 132, RULE_forInAssignTuple = 133, RULE_forInAssignAtom = 134, 
		RULE_exprList = 135, RULE_arguments = 136, RULE_primary = 137, RULE_primarySuffix = 138, 
		RULE_primaryAtom = 139, RULE_postfixExpression = 140, RULE_postfixBase = 141, 
		RULE_statementExpression = 142, RULE_methodReference = 143, RULE_classInstanceCreationExpression = 144, 
		RULE_classInstanceCreationExpressionAfterDot = 145, RULE_arrayCreationExpression = 146, 
		RULE_dimExprs = 147, RULE_dims = 148, RULE_dimExpr = 149, RULE_expression = 150, 
		RULE_lambdaExpression = 151, RULE_lambdaParameters = 152, RULE_lambdaBody = 153, 
		RULE_assignmentExpression = 154, RULE_conditionalExpression = 155, RULE_binaryExpression = 156, 
		RULE_unaryExpression = 157, RULE_unaryExpressionNotPlusMinus = 158, RULE_awaitExpression = 159, 
		RULE_goExpression = 160, RULE_castExpression = 161, RULE_castAsExpression = 162, 
		RULE_castType = 163, RULE_castTypeOr = 164, RULE_castTypeAnd = 165, RULE_castTypeAtom = 166, 
		RULE_assignment = 167, RULE_leftHandSide = 168, RULE_lhsPrimary = 169, 
		RULE_lhsSuffix = 170, RULE_assignmentOperator = 171, RULE_block = 172, 
		RULE_blockStatement = 173, RULE_statement = 174, RULE_deferStatement = 175, 
		RULE_loopThenElse = 176, RULE_loopStatement = 177, RULE_labeledStatement = 178, 
		RULE_expressionStatement = 179, RULE_goStatement = 180, RULE_yieldStatement = 181, 
		RULE_ifStatement = 182, RULE_elseClause = 183, RULE_assertStatement = 184, 
		RULE_switchStatement = 185, RULE_switchBlock = 186, RULE_switchCase = 187, 
		RULE_switchGuard = 188, RULE_whileStatement = 189, RULE_doStatement = 190, 
		RULE_forStatement = 191, RULE_forClassicInit = 192, RULE_forClassicUpdate = 193, 
		RULE_forClassicControl = 194, RULE_breakStatement = 195, RULE_continueStatement = 196, 
		RULE_returnStatement = 197, RULE_throwStatement = 198, RULE_lockStatement = 199, 
		RULE_tryStatement = 200, RULE_catchClause = 201, RULE_finallyClause = 202, 
		RULE_resource = 203, RULE_goTarget = 204, RULE_forControl = 205, RULE_forInControl = 206, 
		RULE_forInBinding = 207, RULE_forInDeclBinding = 208, RULE_catchType = 209;
	private static String[] makeRuleNames() {
		return new String[] {
			"sourceFile", "packageDeclaration", "importDeclaration", "fromImportDeclaration", 
			"importClause", "importItem", "topLevelItem", "topLevelDecl", "topLevelVariableDeclaration", 
			"softKeyword", "softWhen", "softThen", "softLabel", "softDecorate", "softFrom", 
			"softAs", "softCast", "softJson", "softGet", "softSet", "softOr", "softAnd", 
			"softNot", "qualifiedName", "literal", "dictLiteral", "dictEntry", "jsonLiteral", 
			"jsonEntry", "jsonValue", "arrayInitializer", "primitiveType", "typeExpr", 
			"type", "typePrefix", "typeStarRun", "typeAmpRun", "typeSoftModifier", 
			"typeAtom", "typeAtomBase", "typeQualifier", "typeSuffix", "typePostfix", 
			"typeArguments", "typeArgumentsOrDiamond", "typeArgument", "typeParameters", 
			"typeParameter", "typeBound", "wildcard", "wildcardBounds", "modifier", 
			"annotation", "annotationArguments", "annotationArgumentList", "annotationPositionalArgument", 
			"annotationNamedArgument", "annotationSpreadArgument", "annotationArgumentValue", 
			"elementValue", "defaultValue", "normalClassDeclaration", "superclass", 
			"superinterfaces", "classBody", "classBodyDeclaration", "fieldDeclaration", 
			"propertyDeclaration", "propertyVarHeader", "propertyConstHeader", "propertyAccessor", 
			"propertyAccessorBlock", "accessorBlock", "accessorItem", "getterOnlyBlock", 
			"methodDeclaration", "methodHeader", "methodDeclarator", "methodBody", 
			"constructorDeclaration", "constructorHeader", "constructorDeclarator", 
			"constructorBody", "explicitConstructorInvocation", "destructorDeclaration", 
			"enumDeclaration", "enumBody", "enumConstant", "enumBodyDeclarations", 
			"normalInterfaceDeclaration", "extendsInterfaces", "interfaceBody", "interfaceMemberDeclaration", 
			"interfacePropertyDeclaration", "interfacePropertyHeader", "constantDeclaration", 
			"interfaceMethodDeclaration", "annotationTypeDeclaration", "annotationTypeBody", 
			"annotationTypeMemberDeclaration", "typeOrPrimitive", "annotationTypeElementDeclaration", 
			"functionReturnType", "result", "formalParameters", "formalParameter", 
			"lastFormalParameter", "receiverParameter", "throws_", "exceptionType", 
			"localVariableDeclarationStatement", "localVariableDeclaration", "varDeclarator", 
			"variableDeclarator", "variableDeclaratorId", "variableInitializer", 
			"maybeTypedBinding", "typedBinding", "catchBinding", "pattern", "patternOr", 
			"patternAnd", "patternUnary", "patternPrimary", "primaryPattern", "bindingOrNamePattern", 
			"bindingPattern", "bindingPatternNoType", "bindingAtom", "bindingTuple", 
			"bindingNoTypeAtom", "bindingNoTypeTuple", "forInAssignPattern", "forInAssignTuple", 
			"forInAssignAtom", "exprList", "arguments", "primary", "primarySuffix", 
			"primaryAtom", "postfixExpression", "postfixBase", "statementExpression", 
			"methodReference", "classInstanceCreationExpression", "classInstanceCreationExpressionAfterDot", 
			"arrayCreationExpression", "dimExprs", "dims", "dimExpr", "expression", 
			"lambdaExpression", "lambdaParameters", "lambdaBody", "assignmentExpression", 
			"conditionalExpression", "binaryExpression", "unaryExpression", "unaryExpressionNotPlusMinus", 
			"awaitExpression", "goExpression", "castExpression", "castAsExpression", 
			"castType", "castTypeOr", "castTypeAnd", "castTypeAtom", "assignment", 
			"leftHandSide", "lhsPrimary", "lhsSuffix", "assignmentOperator", "block", 
			"blockStatement", "statement", "deferStatement", "loopThenElse", "loopStatement", 
			"labeledStatement", "expressionStatement", "goStatement", "yieldStatement", 
			"ifStatement", "elseClause", "assertStatement", "switchStatement", "switchBlock", 
			"switchCase", "switchGuard", "whileStatement", "doStatement", "forStatement", 
			"forClassicInit", "forClassicUpdate", "forClassicControl", "breakStatement", 
			"continueStatement", "returnStatement", "throwStatement", "lockStatement", 
			"tryStatement", "catchClause", "finallyClause", "resource", "goTarget", 
			"forControl", "forInControl", "forInBinding", "forInDeclBinding", "catchType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'int8'", "'int16'", "'int32'", "'int64'", "'int128'", 
			"'uint'", "'uint8'", "'uint16'", "'uint32'", "'uint64'", "'uint128'", 
			"'float'", "'float32'", "'float64'", "'float128'", "'char'", "'char8'", 
			"'char16'", "'char32'", "'byte'", "'bytes'", "'string'", "'regex'", "'bool'", 
			"'true'", "'false'", "'var'", "'const'", "'pointer'", "'unit'", "'any'", 
			"'function'", "'class'", "'enum'", "'interface'", "'abstract'", "'extends'", 
			"'implements'", "'constructor'", "'destructor'", "'super'", "'this'", 
			"'public'", "'protected'", "'private'", "'static'", "'new'", "'if'", 
			"'else'", "'while'", "'do'", "'for'", "'in'", "'switch'", "'default'", 
			"'continue'", "'break'", "'return'", "'try'", "'catch'", "'finally'", 
			"'throw'", "'throws'", "'defer'", "'await'", "'go'", "'yield'", "'lock'", 
			"'atomic'", "'and'", "'or'", "'not'", "'is'", "'package'", "'import'", 
			"'module'", "'export'", "'extern'", "'dict'", "'null'", "'assert'", "'final'", 
			"'_'", null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'...'", "'->'", "'?.'", "'??='", "'??'", "'**='", "'**'", 
			"'::'", "'>>>='", "'>>>'", "'>>='", "'>>'", "'<<='", "'<<'", "'++'", 
			"'--'", "'=='", "'!='", "'<='", "'>='", "'&&'", "'||'", "'+='", "'-='", 
			"'*='", "'/='", "'%='", "'&='", "'|='", "'^='", "'('", "')'", "'['", 
			"']'", "'{'", "'}'", "';'", "','", "'.'", "':'", "'?'", "'@'", "'=>'", 
			"'='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'~'", 
			"'&'", "'|'", "'$'", "'\\uFF5C'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Int", "Int8", "Int16", "Int32", "Int64", "Int128", "UInt", "UInt8", 
			"UInt16", "UInt32", "UInt64", "UInt128", "Float", "Float32", "Float64", 
			"Float128", "Char", "Char8", "Char16", "Char32", "Byte", "Bytes", "String", 
			"Regex", "Bool", "True", "False", "Var", "Const", "Pointer", "Unit", 
			"Any", "Function", "Class", "Enum", "Interface", "Abstract", "Extends", 
			"Implements", "Constructor", "Destructor", "Super", "This", "Public", 
			"Protected", "Private", "Static", "New", "If", "Else", "While", "Do", 
			"For", "In", "Switch", "Default", "Continue", "Break", "Return", "Try", 
			"Catch", "Finally", "Throw", "Throws", "Defer", "Await", "Go", "Yield", 
			"Lock", "Atomic", "And", "Or", "Not", "Is", "Package", "Import", "Module", 
			"Export", "Extern", "Dict", "Null", "Assert", "Final", "Underscore", 
			"DEC_LITERAL", "HEX_LITERAL", "OCT_LITERAL", "BIN_LITERAL", "STRING_LITERAL", 
			"RAW_STRING_LITERAL", "REGEX_LITERAL", "FORMAT_STRING_LITERAL", "BYTE_STRING_LITERAL", 
			"UNICODE_STRING_LITERAL", "TRIPLE_STRING_LITERAL", "RAW_TRIPLE_STRING_LITERAL", 
			"FORMAT_TRIPLE_STRING_LITERAL", "ELLIPSIS", "ARROW", "SAFE_DOT", "NULL_COALESCE_ASSIGN", 
			"NULL_COALESCE", "POW_ASSIGN", "POW", "COLON_COLON", "URSHIFT_ASSIGN", 
			"URSHIFT", "RSHIFT_ASSIGN", "RSHIFT", "LSHIFT_ASSIGN", "LSHIFT", "PLUS_PLUS", 
			"MINUS_MINUS", "EQUAL_EQUAL", "NOT_EQUAL", "LE", "GE", "AND_AND", "OR_OR", 
			"PLUS_ASSIGN", "MINUS_ASSIGN", "STAR_ASSIGN", "SLASH_ASSIGN", "PERCENT_ASSIGN", 
			"AND_ASSIGN", "OR_ASSIGN", "CARET_ASSIGN", "LPAREN", "RPAREN", "LBRACK", 
			"RBRACK", "LBRACE", "RBRACE", "SEMI", "COMMA", "DOT", "COLON", "QUESTION", 
			"AT", "FAT_ARROW", "ASSIGN", "GT", "LT", "PLUS", "MINUS", "STAR", "SLASH", 
			"PERCENT", "BANG", "TILDE", "AMP", "PIPE", "Dollar", "FULLWIDTH_PIPE", 
			"CARET", "Identifier", "WS", "LINE_COMMENT", "BLOCK_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "JasperParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JasperParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SourceFileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(JasperParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TopLevelItemContext> topLevelItem() {
			return getRuleContexts(TopLevelItemContext.class);
		}
		public TopLevelItemContext topLevelItem(int i) {
			return getRuleContext(TopLevelItemContext.class,i);
		}
		public SourceFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterSourceFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitSourceFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitSourceFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceFileContext sourceFile() throws RecognitionException {
		SourceFileContext _localctx = new SourceFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sourceFile);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(420);
				packageDeclaration();
				}
				break;
			}
			setState(426);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(423);
					importDeclaration();
					}
					} 
				}
				setState(428);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(432);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(429);
					topLevelItem();
					}
					} 
				}
				setState(434);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(435);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PackageDeclarationContext extends ParserRuleContext {
		public ModifierContext mods;
		public QualifiedNameContext name;
		public TerminalNode Package() { return getToken(JasperParser.Package, 0); }
		public TerminalNode SEMI() { return getToken(JasperParser.SEMI, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitPackageDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitPackageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 74779944552321L) != 0) || _la==AT) {
				{
				{
				setState(437);
				((PackageDeclarationContext)_localctx).mods = modifier();
				}
				}
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(443);
			match(Package);
			setState(444);
			((PackageDeclarationContext)_localctx).name = qualifiedName();
			setState(445);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportDeclarationContext extends ParserRuleContext {
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
	 
		public ImportDeclarationContext() { }
		public void copyFrom(ImportDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportSingleContext extends ImportDeclarationContext {
		public TerminalNode Import() { return getToken(JasperParser.Import, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JasperParser.SEMI, 0); }
		public ImportSingleContext(ImportDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterImportSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitImportSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitImportSingle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportFromContext extends ImportDeclarationContext {
		public FromImportDeclarationContext fromImportDeclaration() {
			return getRuleContext(FromImportDeclarationContext.class,0);
		}
		public ImportFromContext(ImportDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterImportFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitImportFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitImportFrom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportOnDemandContext extends ImportDeclarationContext {
		public TerminalNode Import() { return getToken(JasperParser.Import, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JasperParser.DOT, 0); }
		public TerminalNode STAR() { return getToken(JasperParser.STAR, 0); }
		public TerminalNode SEMI() { return getToken(JasperParser.SEMI, 0); }
		public ImportOnDemandContext(ImportDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterImportOnDemand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitImportOnDemand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitImportOnDemand(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportStaticOnDemandContext extends ImportDeclarationContext {
		public TerminalNode Import() { return getToken(JasperParser.Import, 0); }
		public TerminalNode Static() { return getToken(JasperParser.Static, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JasperParser.DOT, 0); }
		public TerminalNode STAR() { return getToken(JasperParser.STAR, 0); }
		public TerminalNode SEMI() { return getToken(JasperParser.SEMI, 0); }
		public ImportStaticOnDemandContext(ImportDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterImportStaticOnDemand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitImportStaticOnDemand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitImportStaticOnDemand(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportStaticSingleContext extends ImportDeclarationContext {
		public TerminalNode Import() { return getToken(JasperParser.Import, 0); }
		public TerminalNode Static() { return getToken(JasperParser.Static, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JasperParser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(JasperParser.Identifier, 0); }
		public TerminalNode SEMI() { return getToken(JasperParser.SEMI, 0); }
		public ImportStaticSingleContext(ImportDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterImportStaticSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitImportStaticSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitImportStaticSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		try {
			setState(472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new ImportSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				match(Import);
				setState(448);
				qualifiedName();
				setState(449);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new ImportOnDemandContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				match(Import);
				setState(452);
				qualifiedName();
				setState(453);
				match(DOT);
				setState(454);
				match(STAR);
				setState(455);
				match(SEMI);
				}
				break;
			case 3:
				_localctx = new ImportStaticSingleContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(457);
				match(Import);
				setState(458);
				match(Static);
				setState(459);
				qualifiedName();
				setState(460);
				match(DOT);
				setState(461);
				match(Identifier);
				setState(462);
				match(SEMI);
				}
				break;
			case 4:
				_localctx = new ImportStaticOnDemandContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(464);
				match(Import);
				setState(465);
				match(Static);
				setState(466);
				qualifiedName();
				setState(467);
				match(DOT);
				setState(468);
				match(STAR);
				setState(469);
				match(SEMI);
				}
				break;
			case 5:
				_localctx = new ImportFromContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(471);
				fromImportDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FromImportDeclarationContext extends ParserRuleContext {
		public FromImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromImportDeclaration; }
	 
		public FromImportDeclarationContext() { }
		public void copyFrom(FromImportDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FromImportTripleStringContext extends FromImportDeclarationContext {
		public Token ts;
		public ImportClauseContext clause;
		public SoftFromContext softFrom() {
			return getRuleContext(SoftFromContext.class,0);
		}
		public TerminalNode Import() { return getToken(JasperParser.Import, 0); }
		public TerminalNode SEMI() { return getToken(JasperParser.SEMI, 0); }
		public TerminalNode TRIPLE_STRING_LITERAL() { return getToken(JasperParser.TRIPLE_STRING_LITERAL, 0); }
		public ImportClauseContext importClause() {
			return getRuleContext(ImportClauseContext.class,0);
		}
		public FromImportTripleStringContext(FromImportDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterFromImportTripleString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitFromImportTripleString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitFromImportTripleString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FromImportQualifiedContext extends FromImportDeclarationContext {
		public QualifiedNameContext qn;
		public ImportClauseContext clause;
		public SoftFromContext softFrom() {
			return getRuleContext(SoftFromContext.class,0);
		}
		public TerminalNode Import() { return getToken(JasperParser.Import, 0); }
		public TerminalNode SEMI() { return getToken(JasperParser.SEMI, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ImportClauseContext importClause() {
			return getRuleContext(ImportClauseContext.class,0);
		}
		public FromImportQualifiedContext(FromImportDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterFromImportQualified(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitFromImportQualified(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitFromImportQualified(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FromImportStringContext extends FromImportDeclarationContext {
		public Token s;
		public ImportClauseContext clause;
		public SoftFromContext softFrom() {
			return getRuleContext(SoftFromContext.class,0);
		}
		public TerminalNode Import() { return getToken(JasperParser.Import, 0); }
		public TerminalNode SEMI() { return getToken(JasperParser.SEMI, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(JasperParser.STRING_LITERAL, 0); }
		public ImportClauseContext importClause() {
			return getRuleContext(ImportClauseContext.class,0);
		}
		public FromImportStringContext(FromImportDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterFromImportString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitFromImportString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitFromImportString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FromImportRawTripleStringContext extends FromImportDeclarationContext {
		public Token rts;
		public ImportClauseContext clause;
		public SoftFromContext softFrom() {
			return getRuleContext(SoftFromContext.class,0);
		}
		public TerminalNode Import() { return getToken(JasperParser.Import, 0); }
		public TerminalNode SEMI() { return getToken(JasperParser.SEMI, 0); }
		public TerminalNode RAW_TRIPLE_STRING_LITERAL() { return getToken(JasperParser.RAW_TRIPLE_STRING_LITERAL, 0); }
		public ImportClauseContext importClause() {
			return getRuleContext(ImportClauseContext.class,0);
		}
		public FromImportRawTripleStringContext(FromImportDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterFromImportRawTripleString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitFromImportRawTripleString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitFromImportRawTripleString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FromImportRawStringContext extends FromImportDeclarationContext {
		public Token rs;
		public ImportClauseContext clause;
		public SoftFromContext softFrom() {
			return getRuleContext(SoftFromContext.class,0);
		}
		public TerminalNode Import() { return getToken(JasperParser.Import, 0); }
		public TerminalNode SEMI() { return getToken(JasperParser.SEMI, 0); }
		public TerminalNode RAW_STRING_LITERAL() { return getToken(JasperParser.RAW_STRING_LITERAL, 0); }
		public ImportClauseContext importClause() {
			return getRuleContext(ImportClauseContext.class,0);
		}
		public FromImportRawStringContext(FromImportDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterFromImportRawString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitFromImportRawString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitFromImportRawString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromImportDeclarationContext fromImportDeclaration() throws RecognitionException {
		FromImportDeclarationContext _localctx = new FromImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fromImportDeclaration);
		try {
			setState(504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new FromImportQualifiedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				softFrom();
				setState(475);
				((FromImportQualifiedContext)_localctx).qn = qualifiedName();
				setState(476);
				match(Import);
				setState(477);
				((FromImportQualifiedContext)_localctx).clause = importClause();
				setState(478);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new FromImportStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
				softFrom();
				setState(481);
				((FromImportStringContext)_localctx).s = match(STRING_LITERAL);
				setState(482);
				match(Import);
				setState(483);
				((FromImportStringContext)_localctx).clause = importClause();
				setState(484);
				match(SEMI);
				}
				break;
			case 3:
				_localctx = new FromImportRawStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(486);
				softFrom();
				setState(487);
				((FromImportRawStringContext)_localctx).rs = match(RAW_STRING_LITERAL);
				setState(488);
				match(Import);
				setState(489);
				((FromImportRawStringContext)_localctx).clause = importClause();
				setState(490);
				match(SEMI);
				}
				break;
			case 4:
				_localctx = new FromImportTripleStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(492);
				softFrom();
				setState(493);
				((FromImportTripleStringContext)_localctx).ts = match(TRIPLE_STRING_LITERAL);
				setState(494);
				match(Import);
				setState(495);
				((FromImportTripleStringContext)_localctx).clause = importClause();
				setState(496);
				match(SEMI);
				}
				break;
			case 5:
				_localctx = new FromImportRawTripleStringContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(498);
				softFrom();
				setState(499);
				((FromImportRawTripleStringContext)_localctx).rts = match(RAW_TRIPLE_STRING_LITERAL);
				setState(500);
				match(Import);
				setState(501);
				((FromImportRawTripleStringContext)_localctx).clause = importClause();
				setState(502);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportClauseContext extends ParserRuleContext {
		public ImportClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importClause; }
	 
		public ImportClauseContext() { }
		public void copyFrom(ImportClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportClauseItemsContext extends ImportClauseContext {
		public ImportItemContext importItem;
		public List<ImportItemContext> items = new ArrayList<ImportItemContext>();
		public List<ImportItemContext> importItem() {
			return getRuleContexts(ImportItemContext.class);
		}
		public ImportItemContext importItem(int i) {
			return getRuleContext(ImportItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JasperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JasperParser.COMMA, i);
		}
		public ImportClauseItemsContext(ImportClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterImportClauseItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitImportClauseItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitImportClauseItems(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportClauseAllContext extends ImportClauseContext {
		public TerminalNode STAR() { return getToken(JasperParser.STAR, 0); }
		public ImportClauseAllContext(ImportClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterImportClauseAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitImportClauseAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitImportClauseAll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportClauseContext importClause() throws RecognitionException {
		ImportClauseContext _localctx = new ImportClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importClause);
		int _la;
		try {
			int _alt;
			setState(518);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				_localctx = new ImportClauseAllContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				match(STAR);
				}
				break;
			case Identifier:
				_localctx = new ImportClauseItemsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				((ImportClauseItemsContext)_localctx).importItem = importItem();
				((ImportClauseItemsContext)_localctx).items.add(((ImportClauseItemsContext)_localctx).importItem);
				setState(512);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(508);
						match(COMMA);
						setState(509);
						((ImportClauseItemsContext)_localctx).importItem = importItem();
						((ImportClauseItemsContext)_localctx).items.add(((ImportClauseItemsContext)_localctx).importItem);
						}
						} 
					}
					setState(514);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(515);
					match(COMMA);
					}
				}

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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportItemContext extends ParserRuleContext {
		public Token name;
		public Token alias;
		public List<TerminalNode> Identifier() { return getTokens(JasperParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JasperParser.Identifier, i);
		}
		public SoftAsContext softAs() {
			return getRuleContext(SoftAsContext.class,0);
		}
		public ImportItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterImportItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitImportItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitImportItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportItemContext importItem() throws RecognitionException {
		ImportItemContext _localctx = new ImportItemContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_importItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			((ImportItemContext)_localctx).name = match(Identifier);
			setState(524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(521);
				softAs();
				setState(522);
				((ImportItemContext)_localctx).alias = match(Identifier);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TopLevelItemContext extends ParserRuleContext {
		public TopLevelItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelItem; }
	 
		public TopLevelItemContext() { }
		public void copyFrom(TopLevelItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TopLevelStatementItemContext extends TopLevelItemContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TopLevelStatementItemContext(TopLevelItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTopLevelStatementItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTopLevelStatementItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTopLevelStatementItem(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TopLevelDeclarationItemContext extends TopLevelItemContext {
		public TopLevelDeclContext topLevelDecl() {
			return getRuleContext(TopLevelDeclContext.class,0);
		}
		public TopLevelDeclarationItemContext(TopLevelItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTopLevelDeclarationItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTopLevelDeclarationItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTopLevelDeclarationItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopLevelItemContext topLevelItem() throws RecognitionException {
		TopLevelItemContext _localctx = new TopLevelItemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_topLevelItem);
		try {
			setState(528);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new TopLevelDeclarationItemContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(526);
				topLevelDecl();
				}
				break;
			case 2:
				_localctx = new TopLevelStatementItemContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(527);
				statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TopLevelDeclContext extends ParserRuleContext {
		public TopLevelDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelDecl; }
	 
		public TopLevelDeclContext() { }
		public void copyFrom(TopLevelDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TopDeclarationInterfaceContext extends TopLevelDeclContext {
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public TopDeclarationInterfaceContext(TopLevelDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTopDeclarationInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTopDeclarationInterface(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTopDeclarationInterface(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TopDeclarationVariableContext extends TopLevelDeclContext {
		public TopLevelVariableDeclarationContext topLevelVariableDeclaration() {
			return getRuleContext(TopLevelVariableDeclarationContext.class,0);
		}
		public TopDeclarationVariableContext(TopLevelDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTopDeclarationVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTopDeclarationVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTopDeclarationVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TopDeclarationFunctionContext extends TopLevelDeclContext {
		public ModifierContext mods;
		public Token name;
		public TypedBindingContext typedBinding;
		public List<TypedBindingContext> params = new ArrayList<TypedBindingContext>();
		public FunctionReturnTypeContext ret;
		public Throws_Context thr;
		public MethodBodyContext body;
		public TerminalNode Function() { return getToken(JasperParser.Function, 0); }
		public TerminalNode LPAREN() { return getToken(JasperParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JasperParser.RPAREN, 0); }
		public TerminalNode Identifier() { return getToken(JasperParser.Identifier, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public List<TypedBindingContext> typedBinding() {
			return getRuleContexts(TypedBindingContext.class);
		}
		public TypedBindingContext typedBinding(int i) {
			return getRuleContext(TypedBindingContext.class,i);
		}
		public FunctionReturnTypeContext functionReturnType() {
			return getRuleContext(FunctionReturnTypeContext.class,0);
		}
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(JasperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JasperParser.COMMA, i);
		}
		public TopDeclarationFunctionContext(TopLevelDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTopDeclarationFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTopDeclarationFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTopDeclarationFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TopDeclarationClassContext extends TopLevelDeclContext {
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public TopDeclarationClassContext(TopLevelDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTopDeclarationClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTopDeclarationClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTopDeclarationClass(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TopDeclarationEmptyDeclarationContext extends TopLevelDeclContext {
		public TerminalNode SEMI() { return getToken(JasperParser.SEMI, 0); }
		public TopDeclarationEmptyDeclarationContext(TopLevelDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTopDeclarationEmptyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTopDeclarationEmptyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTopDeclarationEmptyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopLevelDeclContext topLevelDecl() throws RecognitionException {
		TopLevelDeclContext _localctx = new TopLevelDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_topLevelDecl);
		int _la;
		try {
			int _alt;
			setState(570);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new TopDeclarationClassContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(532);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(530);
					normalClassDeclaration();
					}
					break;
				case 2:
					{
					setState(531);
					enumDeclaration();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new TopDeclarationInterfaceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(536);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(534);
					normalInterfaceDeclaration();
					}
					break;
				case 2:
					{
					setState(535);
					annotationTypeDeclaration();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new TopDeclarationFunctionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 74779944552321L) != 0) || _la==AT) {
					{
					{
					setState(538);
					((TopDeclarationFunctionContext)_localctx).mods = modifier();
					}
					}
					setState(543);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(544);
				match(Function);
				setState(545);
				((TopDeclarationFunctionContext)_localctx).name = match(Identifier);
				setState(546);
				match(LPAREN);
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(547);
					((TopDeclarationFunctionContext)_localctx).typedBinding = typedBinding();
					((TopDeclarationFunctionContext)_localctx).params.add(((TopDeclarationFunctionContext)_localctx).typedBinding);
					setState(552);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(548);
							match(COMMA);
							setState(549);
							((TopDeclarationFunctionContext)_localctx).typedBinding = typedBinding();
							((TopDeclarationFunctionContext)_localctx).params.add(((TopDeclarationFunctionContext)_localctx).typedBinding);
							}
							} 
						}
						setState(554);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
					}
					setState(556);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(555);
						match(COMMA);
						}
					}

					}
				}

				setState(560);
				match(RPAREN);
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(561);
					((TopDeclarationFunctionContext)_localctx).ret = functionReturnType();
					}
				}

				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Throws) {
					{
					setState(564);
					((TopDeclarationFunctionContext)_localctx).thr = throws_();
					}
				}

				setState(567);
				((TopDeclarationFunctionContext)_localctx).body = methodBody();
				}
				break;
			case 4:
				_localctx = new TopDeclarationEmptyDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(568);
				match(SEMI);
				}
				break;
			case 5:
				_localctx = new TopDeclarationVariableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(569);
				topLevelVariableDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TopLevelVariableDeclarationContext extends ParserRuleContext {
		public ModifierContext mods;
		public Token kind;
		public VarDeclaratorContext varDeclarator;
		public List<VarDeclaratorContext> decls = new ArrayList<VarDeclaratorContext>();
		public TerminalNode SEMI() { return getToken(JasperParser.SEMI, 0); }
		public List<VarDeclaratorContext> varDeclarator() {
			return getRuleContexts(VarDeclaratorContext.class);
		}
		public VarDeclaratorContext varDeclarator(int i) {
			return getRuleContext(VarDeclaratorContext.class,i);
		}
		public TerminalNode Var() { return getToken(JasperParser.Var, 0); }
		public TerminalNode Const() { return getToken(JasperParser.Const, 0); }
		public TerminalNode Pointer() { return getToken(JasperParser.Pointer, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JasperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JasperParser.COMMA, i);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TopLevelVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevelVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTopLevelVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTopLevelVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTopLevelVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopLevelVariableDeclarationContext topLevelVariableDeclaration() throws RecognitionException {
		TopLevelVariableDeclarationContext _localctx = new TopLevelVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_topLevelVariableDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 74779944552321L) != 0) || _la==AT) {
				{
				{
				setState(572);
				((TopLevelVariableDeclarationContext)_localctx).mods = modifier();
				}
				}
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(578);
			((TopLevelVariableDeclarationContext)_localctx).kind = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1879048192L) != 0)) ) {
				((TopLevelVariableDeclarationContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(579);
			((TopLevelVariableDeclarationContext)_localctx).varDeclarator = varDeclarator();
			((TopLevelVariableDeclarationContext)_localctx).decls.add(((TopLevelVariableDeclarationContext)_localctx).varDeclarator);
			setState(584);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(580);
					match(COMMA);
					setState(581);
					((TopLevelVariableDeclarationContext)_localctx).varDeclarator = varDeclarator();
					((TopLevelVariableDeclarationContext)_localctx).decls.add(((TopLevelVariableDeclarationContext)_localctx).varDeclarator);
					}
					} 
				}
				setState(586);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(587);
				match(COMMA);
				}
			}

			setState(590);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SoftKeywordContext extends ParserRuleContext {
		public String kw;
		public TerminalNode Identifier() { return getToken(JasperParser.Identifier, 0); }
		public SoftKeywordContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SoftKeywordContext(ParserRuleContext parent, int invokingState, String kw) {
			super(parent, invokingState);
			this.kw = kw;
		}
		@Override public int getRuleIndex() { return RULE_softKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterSoftKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitSoftKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitSoftKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SoftKeywordContext softKeyword(String kw) throws RecognitionException {
		SoftKeywordContext _localctx = new SoftKeywordContext(_ctx, getState(), kw);
		enterRule(_localctx, 18, RULE_softKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			if (!( _input.LT(1).getText().equals(kw) )) throw new FailedPredicateException(this, " _input.LT(1).getText().equals(kw) ");
			setState(593);
			match(Identifier);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SoftWhenContext extends ParserRuleContext {
		public SoftKeywordContext softKeyword() {
			return getRuleContext(SoftKeywordContext.class,0);
		}
		public SoftWhenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_softWhen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterSoftWhen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitSoftWhen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitSoftWhen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SoftWhenContext softWhen() throws RecognitionException {
		SoftWhenContext _localctx = new SoftWhenContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_softWhen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			softKeyword("when");
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

	@SuppressWarnings("CheckReturnValue")
	public static class SoftThenContext extends ParserRuleContext {
		public SoftKeywordContext softKeyword() {
			return getRuleContext(SoftKeywordContext.class,0);
		}
		public SoftThenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_softThen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterSoftThen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitSoftThen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitSoftThen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SoftThenContext softThen() throws RecognitionException {
		SoftThenContext _localctx = new SoftThenContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_softThen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			softKeyword("then");
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

	@SuppressWarnings("CheckReturnValue")
	public static class SoftLabelContext extends ParserRuleContext {
		public SoftKeywordContext softKeyword() {
			return getRuleContext(SoftKeywordContext.class,0);
		}
		public SoftLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_softLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterSoftLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitSoftLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitSoftLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SoftLabelContext softLabel() throws RecognitionException {
		SoftLabelContext _localctx = new SoftLabelContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_softLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			softKeyword("label");
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

	@SuppressWarnings("CheckReturnValue")
	public static class SoftDecorateContext extends ParserRuleContext {
		public SoftKeywordContext softKeyword() {
			return getRuleContext(SoftKeywordContext.class,0);
		}
		public SoftDecorateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_softDecorate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterSoftDecorate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitSoftDecorate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitSoftDecorate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SoftDecorateContext softDecorate() throws RecognitionException {
		SoftDecorateContext _localctx = new SoftDecorateContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_softDecorate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			softKeyword("decorate");
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

	@SuppressWarnings("CheckReturnValue")
	public static class SoftFromContext extends ParserRuleContext {
		public SoftKeywordContext softKeyword() {
			return getRuleContext(SoftKeywordContext.class,0);
		}
		public SoftFromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_softFrom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterSoftFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitSoftFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitSoftFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SoftFromContext softFrom() throws RecognitionException {
		SoftFromContext _localctx = new SoftFromContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_softFrom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			softKeyword("from");
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

	@SuppressWarnings("CheckReturnValue")
	public static class SoftAsContext extends ParserRuleContext {
		public SoftKeywordContext softKeyword() {
			return getRuleContext(SoftKeywordContext.class,0);
		}
		public SoftAsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_softAs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterSoftAs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitSoftAs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitSoftAs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SoftAsContext softAs() throws RecognitionException {
		SoftAsContext _localctx = new SoftAsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_softAs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			softKeyword("as");
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

	@SuppressWarnings("CheckReturnValue")
	public static class SoftCastContext extends ParserRuleContext {
		public SoftKeywordContext softKeyword() {
			return getRuleContext(SoftKeywordContext.class,0);
		}
		public SoftCastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_softCast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterSoftCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitSoftCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitSoftCast(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SoftCastContext softCast() throws RecognitionException {
		SoftCastContext _localctx = new SoftCastContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_softCast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			softKeyword("cast");
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

	@SuppressWarnings("CheckReturnValue")
	public static class SoftJsonContext extends ParserRuleContext {
		public SoftKeywordContext softKeyword() {
			return getRuleContext(SoftKeywordContext.class,0);
		}
		public SoftJsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_softJson; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterSoftJson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitSoftJson(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitSoftJson(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SoftJsonContext softJson() throws RecognitionException {
		SoftJsonContext _localctx = new SoftJsonContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_softJson);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			softKeyword("json");
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

	@SuppressWarnings("CheckReturnValue")
	public static class SoftGetContext extends ParserRuleContext {
		public SoftKeywordContext softKeyword() {
			return getRuleContext(SoftKeywordContext.class,0);
		}
		public SoftGetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_softGet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterSoftGet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitSoftGet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitSoftGet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SoftGetContext softGet() throws RecognitionException {
		SoftGetContext _localctx = new SoftGetContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_softGet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			softKeyword("get");
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

	@SuppressWarnings("CheckReturnValue")
	public static class SoftSetContext extends ParserRuleContext {
		public SoftKeywordContext softKeyword() {
			return getRuleContext(SoftKeywordContext.class,0);
		}
		public SoftSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_softSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterSoftSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitSoftSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitSoftSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SoftSetContext softSet() throws RecognitionException {
		SoftSetContext _localctx = new SoftSetContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_softSet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			softKeyword("set");
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

	@SuppressWarnings("CheckReturnValue")
	public static class SoftOrContext extends ParserRuleContext {
		public SoftKeywordContext softKeyword() {
			return getRuleContext(SoftKeywordContext.class,0);
		}
		public SoftOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_softOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterSoftOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitSoftOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitSoftOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SoftOrContext softOr() throws RecognitionException {
		SoftOrContext _localctx = new SoftOrContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_softOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			softKeyword("or");
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

	@SuppressWarnings("CheckReturnValue")
	public static class SoftAndContext extends ParserRuleContext {
		public SoftKeywordContext softKeyword() {
			return getRuleContext(SoftKeywordContext.class,0);
		}
		public SoftAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_softAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterSoftAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitSoftAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitSoftAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SoftAndContext softAnd() throws RecognitionException {
		SoftAndContext _localctx = new SoftAndContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_softAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			softKeyword("and");
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

	@SuppressWarnings("CheckReturnValue")
	public static class SoftNotContext extends ParserRuleContext {
		public SoftKeywordContext softKeyword() {
			return getRuleContext(SoftKeywordContext.class,0);
		}
		public SoftNotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_softNot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterSoftNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitSoftNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitSoftNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SoftNotContext softNot() throws RecognitionException {
		SoftNotContext _localctx = new SoftNotContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_softNot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			softKeyword("not");
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

	@SuppressWarnings("CheckReturnValue")
	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JasperParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JasperParser.Identifier, i);
		}
		public List<TerminalNode> DOT() { return getTokens(JasperParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JasperParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			match(Identifier);
			setState(626);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(622);
					match(DOT);
					setState(623);
					match(Identifier);
					}
					} 
				}
				setState(628);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FormatStringLiteralContext extends LiteralContext {
		public TerminalNode FORMAT_STRING_LITERAL() { return getToken(JasperParser.FORMAT_STRING_LITERAL, 0); }
		public FormatStringLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterFormatStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitFormatStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitFormatStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ByteStringLiteralContext extends LiteralContext {
		public TerminalNode BYTE_STRING_LITERAL() { return getToken(JasperParser.BYTE_STRING_LITERAL, 0); }
		public ByteStringLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterByteStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitByteStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitByteStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FormatTripleStringLiteralContext extends LiteralContext {
		public TerminalNode FORMAT_TRIPLE_STRING_LITERAL() { return getToken(JasperParser.FORMAT_TRIPLE_STRING_LITERAL, 0); }
		public FormatTripleStringLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterFormatTripleStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitFormatTripleStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitFormatTripleStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RawTripleStringLiteralContext extends LiteralContext {
		public TerminalNode RAW_TRIPLE_STRING_LITERAL() { return getToken(JasperParser.RAW_TRIPLE_STRING_LITERAL, 0); }
		public RawTripleStringLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterRawTripleStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitRawTripleStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitRawTripleStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralJsonContext extends LiteralContext {
		public JsonLiteralContext jsonLiteral() {
			return getRuleContext(JsonLiteralContext.class,0);
		}
		public LiteralJsonContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterLiteralJson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitLiteralJson(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitLiteralJson(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RawStringLiteralContext extends LiteralContext {
		public TerminalNode RAW_STRING_LITERAL() { return getToken(JasperParser.RAW_STRING_LITERAL, 0); }
		public RawStringLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterRawStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitRawStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitRawStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HexadecimalLiteralContext extends LiteralContext {
		public TerminalNode HEX_LITERAL() { return getToken(JasperParser.HEX_LITERAL, 0); }
		public HexadecimalLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterHexadecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitHexadecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitHexadecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseLiteralContext extends LiteralContext {
		public TerminalNode False() { return getToken(JasperParser.False, 0); }
		public FalseLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterFalseLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitFalseLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitFalseLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryLiteralContext extends LiteralContext {
		public TerminalNode BIN_LITERAL() { return getToken(JasperParser.BIN_LITERAL, 0); }
		public BinaryLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterBinaryLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitBinaryLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitBinaryLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OctalLiteralContext extends LiteralContext {
		public TerminalNode OCT_LITERAL() { return getToken(JasperParser.OCT_LITERAL, 0); }
		public OctalLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterOctalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitOctalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitOctalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends LiteralContext {
		public TerminalNode STRING_LITERAL() { return getToken(JasperParser.STRING_LITERAL, 0); }
		public StringLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueLiteralContext extends LiteralContext {
		public TerminalNode True() { return getToken(JasperParser.True, 0); }
		public TrueLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTrueLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTrueLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTrueLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TripleStringLiteralContext extends LiteralContext {
		public TerminalNode TRIPLE_STRING_LITERAL() { return getToken(JasperParser.TRIPLE_STRING_LITERAL, 0); }
		public TripleStringLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTripleStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTripleStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTripleStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecimalLiteralContext extends LiteralContext {
		public TerminalNode DEC_LITERAL() { return getToken(JasperParser.DEC_LITERAL, 0); }
		public DecimalLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnicodeStringLiteralContext extends LiteralContext {
		public TerminalNode UNICODE_STRING_LITERAL() { return getToken(JasperParser.UNICODE_STRING_LITERAL, 0); }
		public UnicodeStringLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterUnicodeStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitUnicodeStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitUnicodeStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralDictContext extends LiteralContext {
		public DictLiteralContext dictLiteral() {
			return getRuleContext(DictLiteralContext.class,0);
		}
		public LiteralDictContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterLiteralDict(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitLiteralDict(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitLiteralDict(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RegexLiteralContext extends LiteralContext {
		public TerminalNode REGEX_LITERAL() { return getToken(JasperParser.REGEX_LITERAL, 0); }
		public RegexLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterRegexLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitRegexLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitRegexLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullLiteralContext extends LiteralContext {
		public TerminalNode Null() { return getToken(JasperParser.Null, 0); }
		public NullLiteralContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_literal);
		try {
			setState(647);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(629);
				match(DEC_LITERAL);
				}
				break;
			case 2:
				_localctx = new HexadecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(630);
				match(HEX_LITERAL);
				}
				break;
			case 3:
				_localctx = new OctalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(631);
				match(OCT_LITERAL);
				}
				break;
			case 4:
				_localctx = new BinaryLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(632);
				match(BIN_LITERAL);
				}
				break;
			case 5:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(633);
				match(STRING_LITERAL);
				}
				break;
			case 6:
				_localctx = new RawStringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(634);
				match(RAW_STRING_LITERAL);
				}
				break;
			case 7:
				_localctx = new RegexLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(635);
				match(REGEX_LITERAL);
				}
				break;
			case 8:
				_localctx = new FormatStringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(636);
				match(FORMAT_STRING_LITERAL);
				}
				break;
			case 9:
				_localctx = new ByteStringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(637);
				match(BYTE_STRING_LITERAL);
				}
				break;
			case 10:
				_localctx = new UnicodeStringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(638);
				match(UNICODE_STRING_LITERAL);
				}
				break;
			case 11:
				_localctx = new TripleStringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(639);
				match(TRIPLE_STRING_LITERAL);
				}
				break;
			case 12:
				_localctx = new RawTripleStringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(640);
				match(RAW_TRIPLE_STRING_LITERAL);
				}
				break;
			case 13:
				_localctx = new FormatTripleStringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(641);
				match(FORMAT_TRIPLE_STRING_LITERAL);
				}
				break;
			case 14:
				_localctx = new TrueLiteralContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(642);
				match(True);
				}
				break;
			case 15:
				_localctx = new FalseLiteralContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(643);
				match(False);
				}
				break;
			case 16:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(644);
				match(Null);
				}
				break;
			case 17:
				_localctx = new LiteralDictContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(645);
				dictLiteral();
				}
				break;
			case 18:
				_localctx = new LiteralJsonContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(646);
				jsonLiteral();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DictLiteralContext extends ParserRuleContext {
		public TerminalNode Dict() { return getToken(JasperParser.Dict, 0); }
		public TerminalNode LBRACE() { return getToken(JasperParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JasperParser.RBRACE, 0); }
		public List<DictEntryContext> dictEntry() {
			return getRuleContexts(DictEntryContext.class);
		}
		public DictEntryContext dictEntry(int i) {
			return getRuleContext(DictEntryContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JasperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JasperParser.COMMA, i);
		}
		public DictLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterDictLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitDictLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitDictLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictLiteralContext dictLiteral() throws RecognitionException {
		DictLiteralContext _localctx = new DictLiteralContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_dictLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			match(Dict);
			setState(650);
			match(LBRACE);
			setState(662);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(651);
				dictEntry();
				setState(656);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(652);
						match(COMMA);
						setState(653);
						dictEntry();
						}
						} 
					}
					setState(658);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(659);
					match(COMMA);
					}
				}

				}
				break;
			}
			setState(664);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DictEntryContext extends ParserRuleContext {
		public ExpressionContext key;
		public ExpressionContext value;
		public TerminalNode COLON() { return getToken(JasperParser.COLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DictEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterDictEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitDictEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitDictEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictEntryContext dictEntry() throws RecognitionException {
		DictEntryContext _localctx = new DictEntryContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_dictEntry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			((DictEntryContext)_localctx).key = expression();
			setState(667);
			match(COLON);
			setState(668);
			((DictEntryContext)_localctx).value = expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsonLiteralContext extends ParserRuleContext {
		public SoftJsonContext softJson() {
			return getRuleContext(SoftJsonContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(JasperParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JasperParser.RBRACE, 0); }
		public List<JsonEntryContext> jsonEntry() {
			return getRuleContexts(JsonEntryContext.class);
		}
		public JsonEntryContext jsonEntry(int i) {
			return getRuleContext(JsonEntryContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JasperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JasperParser.COMMA, i);
		}
		public JsonLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterJsonLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitJsonLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitJsonLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonLiteralContext jsonLiteral() throws RecognitionException {
		JsonLiteralContext _localctx = new JsonLiteralContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_jsonLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			softJson();
			setState(671);
			match(LBRACE);
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_LITERAL) {
				{
				setState(672);
				jsonEntry();
				setState(677);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(673);
						match(COMMA);
						setState(674);
						jsonEntry();
						}
						} 
					}
					setState(679);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(680);
					match(COMMA);
					}
				}

				}
			}

			setState(685);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsonEntryContext extends ParserRuleContext {
		public Token key;
		public JsonValueContext value;
		public TerminalNode COLON() { return getToken(JasperParser.COLON, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(JasperParser.STRING_LITERAL, 0); }
		public JsonValueContext jsonValue() {
			return getRuleContext(JsonValueContext.class,0);
		}
		public JsonEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterJsonEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitJsonEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitJsonEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonEntryContext jsonEntry() throws RecognitionException {
		JsonEntryContext _localctx = new JsonEntryContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_jsonEntry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			((JsonEntryContext)_localctx).key = match(STRING_LITERAL);
			setState(688);
			match(COLON);
			setState(689);
			((JsonEntryContext)_localctx).value = jsonValue();
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsonValueContext extends ParserRuleContext {
		public JsonValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonValue; }
	 
		public JsonValueContext() { }
		public void copyFrom(JsonValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JsonArrayContext extends JsonValueContext {
		public TerminalNode LBRACK() { return getToken(JasperParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(JasperParser.RBRACK, 0); }
		public List<JsonValueContext> jsonValue() {
			return getRuleContexts(JsonValueContext.class);
		}
		public JsonValueContext jsonValue(int i) {
			return getRuleContext(JsonValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JasperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JasperParser.COMMA, i);
		}
		public JsonArrayContext(JsonValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterJsonArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitJsonArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitJsonArray(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JsonTrueContext extends JsonValueContext {
		public TerminalNode True() { return getToken(JasperParser.True, 0); }
		public JsonTrueContext(JsonValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterJsonTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitJsonTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitJsonTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JsonNumberContext extends JsonValueContext {
		public TerminalNode DEC_LITERAL() { return getToken(JasperParser.DEC_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(JasperParser.HEX_LITERAL, 0); }
		public TerminalNode OCT_LITERAL() { return getToken(JasperParser.OCT_LITERAL, 0); }
		public TerminalNode BIN_LITERAL() { return getToken(JasperParser.BIN_LITERAL, 0); }
		public JsonNumberContext(JsonValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterJsonNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitJsonNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitJsonNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JsonObjectContext extends JsonValueContext {
		public JsonLiteralContext jsonLiteral() {
			return getRuleContext(JsonLiteralContext.class,0);
		}
		public JsonObjectContext(JsonValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterJsonObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitJsonObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitJsonObject(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JsonStringContext extends JsonValueContext {
		public TerminalNode STRING_LITERAL() { return getToken(JasperParser.STRING_LITERAL, 0); }
		public JsonStringContext(JsonValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterJsonString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitJsonString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitJsonString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JsonFalseContext extends JsonValueContext {
		public TerminalNode False() { return getToken(JasperParser.False, 0); }
		public JsonFalseContext(JsonValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterJsonFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitJsonFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitJsonFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JsonNullContext extends JsonValueContext {
		public TerminalNode Null() { return getToken(JasperParser.Null, 0); }
		public JsonNullContext(JsonValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterJsonNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitJsonNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitJsonNull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonValueContext jsonValue() throws RecognitionException {
		JsonValueContext _localctx = new JsonValueContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_jsonValue);
		int _la;
		try {
			int _alt;
			setState(712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new JsonStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(691);
				match(STRING_LITERAL);
				}
				break;
			case 2:
				_localctx = new JsonNumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(692);
				_la = _input.LA(1);
				if ( !(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & 15L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				_localctx = new JsonTrueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(693);
				match(True);
				}
				break;
			case 4:
				_localctx = new JsonFalseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(694);
				match(False);
				}
				break;
			case 5:
				_localctx = new JsonNullContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(695);
				match(Null);
				}
				break;
			case 6:
				_localctx = new JsonObjectContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(696);
				jsonLiteral();
				}
				break;
			case 7:
				_localctx = new JsonArrayContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(697);
				match(LBRACK);
				setState(709);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(698);
					jsonValue();
					setState(703);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(699);
							match(COMMA);
							setState(700);
							jsonValue();
							}
							} 
						}
						setState(705);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
					}
					setState(707);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(706);
						match(COMMA);
						}
					}

					}
					break;
				}
				setState(711);
				match(RBRACK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JasperParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JasperParser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JasperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JasperParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			match(LBRACE);
			setState(726);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(715);
				variableInitializer();
				setState(720);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(716);
						match(COMMA);
						setState(717);
						variableInitializer();
						}
						} 
					}
					setState(722);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(724);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(723);
					match(COMMA);
					}
					break;
				}
				}
				break;
			}
			setState(729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(728);
				match(COMMA);
				}
			}

			setState(731);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode Byte() { return getToken(JasperParser.Byte, 0); }
		public TerminalNode Int8() { return getToken(JasperParser.Int8, 0); }
		public TerminalNode Int16() { return getToken(JasperParser.Int16, 0); }
		public TerminalNode Int32() { return getToken(JasperParser.Int32, 0); }
		public TerminalNode Int() { return getToken(JasperParser.Int, 0); }
		public TerminalNode Int64() { return getToken(JasperParser.Int64, 0); }
		public TerminalNode Int128() { return getToken(JasperParser.Int128, 0); }
		public TerminalNode Char() { return getToken(JasperParser.Char, 0); }
		public TerminalNode Char8() { return getToken(JasperParser.Char8, 0); }
		public TerminalNode Char16() { return getToken(JasperParser.Char16, 0); }
		public TerminalNode Char32() { return getToken(JasperParser.Char32, 0); }
		public TerminalNode UInt() { return getToken(JasperParser.UInt, 0); }
		public TerminalNode UInt8() { return getToken(JasperParser.UInt8, 0); }
		public TerminalNode UInt16() { return getToken(JasperParser.UInt16, 0); }
		public TerminalNode UInt32() { return getToken(JasperParser.UInt32, 0); }
		public TerminalNode UInt64() { return getToken(JasperParser.UInt64, 0); }
		public TerminalNode UInt128() { return getToken(JasperParser.UInt128, 0); }
		public TerminalNode Float() { return getToken(JasperParser.Float, 0); }
		public TerminalNode Float32() { return getToken(JasperParser.Float32, 0); }
		public TerminalNode Float64() { return getToken(JasperParser.Float64, 0); }
		public TerminalNode Float128() { return getToken(JasperParser.Float128, 0); }
		public TerminalNode Bool() { return getToken(JasperParser.Bool, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(733);
				annotation();
				}
				}
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(739);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 37748734L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeExprContext extends ParserRuleContext {
		public TypeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeExpr; }
	 
		public TypeExprContext() { }
		public void copyFrom(TypeExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeExpressionContext extends TypeExprContext {
		public List<TypePostfixContext> typePostfix() {
			return getRuleContexts(TypePostfixContext.class);
		}
		public TypePostfixContext typePostfix(int i) {
			return getRuleContext(TypePostfixContext.class,i);
		}
		public List<TerminalNode> PIPE() { return getTokens(JasperParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(JasperParser.PIPE, i);
		}
		public List<TerminalNode> FULLWIDTH_PIPE() { return getTokens(JasperParser.FULLWIDTH_PIPE); }
		public TerminalNode FULLWIDTH_PIPE(int i) {
			return getToken(JasperParser.FULLWIDTH_PIPE, i);
		}
		public TypeExpressionContext(TypeExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTypeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeExprContext typeExpr() throws RecognitionException {
		TypeExprContext _localctx = new TypeExprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_typeExpr);
		int _la;
		try {
			_localctx = new TypeExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			typePostfix();
			setState(746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE || _la==FULLWIDTH_PIPE) {
				{
				{
				setState(742);
				_la = _input.LA(1);
				if ( !(_la==PIPE || _la==FULLWIDTH_PIPE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(743);
				typePostfix();
				}
				}
				setState(748);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			typeExpr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypePrefixContext extends ParserRuleContext {
		public TypePrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typePrefix; }
	 
		public TypePrefixContext() { }
		public void copyFrom(TypePrefixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypePrefixAsteriskContext extends TypePrefixContext {
		public TypeStarRunContext typeStarRun() {
			return getRuleContext(TypeStarRunContext.class,0);
		}
		public TypePrefixAsteriskContext(TypePrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTypePrefixAsterisk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTypePrefixAsterisk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTypePrefixAsterisk(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypePrefixAmpersandContext extends TypePrefixContext {
		public TypeAmpRunContext typeAmpRun() {
			return getRuleContext(TypeAmpRunContext.class,0);
		}
		public TypePrefixAmpersandContext(TypePrefixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTypePrefixAmpersand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTypePrefixAmpersand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTypePrefixAmpersand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypePrefixContext typePrefix() throws RecognitionException {
		TypePrefixContext _localctx = new TypePrefixContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_typePrefix);
		try {
			setState(753);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POW:
			case STAR:
				_localctx = new TypePrefixAsteriskContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(751);
				typeStarRun();
				}
				break;
			case AND_AND:
			case AMP:
				_localctx = new TypePrefixAmpersandContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(752);
				typeAmpRun();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeStarRunContext extends ParserRuleContext {
		public TypeStarRunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeStarRun; }
	 
		public TypeStarRunContext() { }
		public void copyFrom(TypeStarRunContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeAsteriskSequenceNodeContext extends TypeStarRunContext {
		public List<TerminalNode> STAR() { return getTokens(JasperParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(JasperParser.STAR, i);
		}
		public List<TerminalNode> POW() { return getTokens(JasperParser.POW); }
		public TerminalNode POW(int i) {
			return getToken(JasperParser.POW, i);
		}
		public TypeAsteriskSequenceNodeContext(TypeStarRunContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTypeAsteriskSequenceNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTypeAsteriskSequenceNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTypeAsteriskSequenceNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeStarRunContext typeStarRun() throws RecognitionException {
		TypeStarRunContext _localctx = new TypeStarRunContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_typeStarRun);
		int _la;
		try {
			_localctx = new TypeAsteriskSequenceNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(756); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(755);
				_la = _input.LA(1);
				if ( !(_la==POW || _la==STAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(758); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==POW || _la==STAR );
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeAmpRunContext extends ParserRuleContext {
		public TypeAmpRunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAmpRun; }
	 
		public TypeAmpRunContext() { }
		public void copyFrom(TypeAmpRunContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeAmpersandSequenceNodeContext extends TypeAmpRunContext {
		public List<TerminalNode> AMP() { return getTokens(JasperParser.AMP); }
		public TerminalNode AMP(int i) {
			return getToken(JasperParser.AMP, i);
		}
		public List<TerminalNode> AND_AND() { return getTokens(JasperParser.AND_AND); }
		public TerminalNode AND_AND(int i) {
			return getToken(JasperParser.AND_AND, i);
		}
		public TypeAmpersandSequenceNodeContext(TypeAmpRunContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTypeAmpersandSequenceNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTypeAmpersandSequenceNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTypeAmpersandSequenceNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAmpRunContext typeAmpRun() throws RecognitionException {
		TypeAmpRunContext _localctx = new TypeAmpRunContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_typeAmpRun);
		int _la;
		try {
			_localctx = new TypeAmpersandSequenceNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(761); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(760);
				_la = _input.LA(1);
				if ( !(_la==AND_AND || _la==AMP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(763); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==AND_AND || _la==AMP );
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeSoftModifierContext extends ParserRuleContext {
		public Token id;
		public TerminalNode Identifier() { return getToken(JasperParser.Identifier, 0); }
		public TypeSoftModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSoftModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTypeSoftModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTypeSoftModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTypeSoftModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSoftModifierContext typeSoftModifier() throws RecognitionException {
		TypeSoftModifierContext _localctx = new TypeSoftModifierContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_typeSoftModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			((TypeSoftModifierContext)_localctx).id = match(Identifier);
			setState(766);
			if (!( "raw".equals(((TypeSoftModifierContext)_localctx).id.getText()) || "shared".equals(((TypeSoftModifierContext)_localctx).id.getText()) )) throw new FailedPredicateException(this, " \"raw\".equals($id.getText()) || \"shared\".equals($id.getText()) ");
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeAtomContext extends ParserRuleContext {
		public TypeAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAtom; }
	 
		public TypeAtomContext() { }
		public void copyFrom(TypeAtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeAtomNodeContext extends TypeAtomContext {
		public TypeAtomBaseContext typeAtomBase() {
			return getRuleContext(TypeAtomBaseContext.class,0);
		}
		public TypePrefixContext typePrefix() {
			return getRuleContext(TypePrefixContext.class,0);
		}
		public List<TypeSoftModifierContext> typeSoftModifier() {
			return getRuleContexts(TypeSoftModifierContext.class);
		}
		public TypeSoftModifierContext typeSoftModifier(int i) {
			return getRuleContext(TypeSoftModifierContext.class,i);
		}
		public TypeAtomNodeContext(TypeAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTypeAtomNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTypeAtomNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTypeAtomNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAtomContext typeAtom() throws RecognitionException {
		TypeAtomContext _localctx = new TypeAtomContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_typeAtom);
		int _la;
		try {
			int _alt;
			_localctx = new TypeAtomNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & 145135534882817L) != 0)) {
				{
				setState(768);
				typePrefix();
				}
			}

			setState(774);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(771);
					typeSoftModifier();
					}
					} 
				}
				setState(776);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			setState(777);
			typeAtomBase();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeAtomBaseContext extends ParserRuleContext {
		public TypeAtomBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAtomBase; }
	 
		public TypeAtomBaseContext() { }
		public void copyFrom(TypeAtomBaseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeAtomNodePrimitiveContext extends TypeAtomBaseContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeAtomNodePrimitiveContext(TypeAtomBaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTypeAtomNodePrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTypeAtomNodePrimitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTypeAtomNodePrimitive(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeAtomNodeTupleContext extends TypeAtomBaseContext {
		public TerminalNode LPAREN() { return getToken(JasperParser.LPAREN, 0); }
		public List<TypeExprContext> typeExpr() {
			return getRuleContexts(TypeExprContext.class);
		}
		public TypeExprContext typeExpr(int i) {
			return getRuleContext(TypeExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(JasperParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JasperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JasperParser.COMMA, i);
		}
		public TypeAtomNodeTupleContext(TypeAtomBaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTypeAtomNodeTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTypeAtomNodeTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTypeAtomNodeTuple(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeAtomNodeGroupContext extends TypeAtomBaseContext {
		public TerminalNode LPAREN() { return getToken(JasperParser.LPAREN, 0); }
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JasperParser.RPAREN, 0); }
		public TypeAtomNodeGroupContext(TypeAtomBaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTypeAtomNodeGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTypeAtomNodeGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTypeAtomNodeGroup(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeAtomNodeBytesContext extends TypeAtomBaseContext {
		public TerminalNode Bytes() { return getToken(JasperParser.Bytes, 0); }
		public TypeAtomNodeBytesContext(TypeAtomBaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTypeAtomNodeBytes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTypeAtomNodeBytes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTypeAtomNodeBytes(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeAtomNodeIdentifierContext extends TypeAtomBaseContext {
		public TerminalNode Identifier() { return getToken(JasperParser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeAtomNodeIdentifierContext(TypeAtomBaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTypeAtomNodeIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTypeAtomNodeIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTypeAtomNodeIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeAtomNodeRegexContext extends TypeAtomBaseContext {
		public TerminalNode Regex() { return getToken(JasperParser.Regex, 0); }
		public TypeAtomNodeRegexContext(TypeAtomBaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTypeAtomNodeRegex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTypeAtomNodeRegex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTypeAtomNodeRegex(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeAtomNodeAnyContext extends TypeAtomBaseContext {
		public TerminalNode Any() { return getToken(JasperParser.Any, 0); }
		public TypeAtomNodeAnyContext(TypeAtomBaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTypeAtomNodeAny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTypeAtomNodeAny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTypeAtomNodeAny(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeAtomNodeStringContext extends TypeAtomBaseContext {
		public TerminalNode String() { return getToken(JasperParser.String, 0); }
		public TypeAtomNodeStringContext(TypeAtomBaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTypeAtomNodeString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTypeAtomNodeString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTypeAtomNodeString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeAtomNodeUnitContext extends TypeAtomBaseContext {
		public TerminalNode Unit() { return getToken(JasperParser.Unit, 0); }
		public TypeAtomNodeUnitContext(TypeAtomBaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTypeAtomNodeUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTypeAtomNodeUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTypeAtomNodeUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAtomBaseContext typeAtomBase() throws RecognitionException {
		TypeAtomBaseContext _localctx = new TypeAtomBaseContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_typeAtomBase);
		int _la;
		try {
			int _alt;
			setState(812);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				_localctx = new TypeAtomNodePrimitiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(779);
				primitiveType();
				}
				break;
			case 2:
				_localctx = new TypeAtomNodeStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(780);
				match(String);
				}
				break;
			case 3:
				_localctx = new TypeAtomNodeBytesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(781);
				match(Bytes);
				}
				break;
			case 4:
				_localctx = new TypeAtomNodeRegexContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(782);
				match(Regex);
				}
				break;
			case 5:
				_localctx = new TypeAtomNodeAnyContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(783);
				match(Any);
				}
				break;
			case 6:
				_localctx = new TypeAtomNodeUnitContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(784);
				match(Unit);
				}
				break;
			case 7:
				_localctx = new TypeAtomNodeTupleContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(785);
				match(LPAREN);
				setState(786);
				typeExpr();
				setState(789); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(787);
						match(COMMA);
						setState(788);
						typeExpr();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(791); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(794);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(793);
					match(COMMA);
					}
				}

				setState(796);
				match(RPAREN);
				}
				break;
			case 8:
				_localctx = new TypeAtomNodeGroupContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(798);
				match(LPAREN);
				setState(799);
				typeExpr();
				setState(800);
				match(RPAREN);
				}
				break;
			case 9:
				_localctx = new TypeAtomNodeIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(805);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(802);
					annotation();
					}
					}
					setState(807);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(808);
				match(Identifier);
				setState(810);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(809);
					typeArguments();
					}
					break;
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeQualifierContext extends ParserRuleContext {
		public TypeQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifier; }
	 
		public TypeQualifierContext() { }
		public void copyFrom(TypeQualifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeQualNullCoalesceTokenContext extends TypeQualifierContext {
		public TerminalNode NULL_COALESCE() { return getToken(JasperParser.NULL_COALESCE, 0); }
		public TypeQualNullCoalesceTokenContext(TypeQualifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTypeQualNullCoalesceToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTypeQualNullCoalesceToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTypeQualNullCoalesceToken(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeQualNonNullContext extends TypeQualifierContext {
		public TerminalNode BANG() { return getToken(JasperParser.BANG, 0); }
		public TypeQualNonNullContext(TypeQualifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTypeQualNonNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTypeQualNonNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTypeQualNonNull(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeQualNullableContext extends TypeQualifierContext {
		public TerminalNode QUESTION() { return getToken(JasperParser.QUESTION, 0); }
		public TypeQualNullableContext(TypeQualifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTypeQualNullable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTypeQualNullable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTypeQualNullable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeQualNullCoalesceSplitContext extends TypeQualifierContext {
		public List<TerminalNode> QUESTION() { return getTokens(JasperParser.QUESTION); }
		public TerminalNode QUESTION(int i) {
			return getToken(JasperParser.QUESTION, i);
		}
		public TypeQualNullCoalesceSplitContext(TypeQualifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTypeQualNullCoalesceSplit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTypeQualNullCoalesceSplit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTypeQualNullCoalesceSplit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeQualifierContext typeQualifier() throws RecognitionException {
		TypeQualifierContext _localctx = new TypeQualifierContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_typeQualifier);
		try {
			setState(819);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				_localctx = new TypeQualNullCoalesceTokenContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(814);
				match(NULL_COALESCE);
				}
				break;
			case 2:
				_localctx = new TypeQualNullCoalesceSplitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(815);
				match(QUESTION);
				setState(816);
				match(QUESTION);
				}
				break;
			case 3:
				_localctx = new TypeQualNullableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(817);
				match(QUESTION);
				}
				break;
			case 4:
				_localctx = new TypeQualNonNullContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(818);
				match(BANG);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeSuffixContext extends ParserRuleContext {
		public TypeSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSuffix; }
	 
		public TypeSuffixContext() { }
		public void copyFrom(TypeSuffixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeSuffixDotContext extends TypeSuffixContext {
		public TerminalNode DOT() { return getToken(JasperParser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(JasperParser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeSuffixDotContext(TypeSuffixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTypeSuffixDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTypeSuffixDot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTypeSuffixDot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeSuffixArrayContext extends TypeSuffixContext {
		public TerminalNode LBRACK() { return getToken(JasperParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(JasperParser.RBRACK, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeSuffixArrayContext(TypeSuffixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTypeSuffixArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTypeSuffixArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTypeSuffixArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSuffixContext typeSuffix() throws RecognitionException {
		TypeSuffixContext _localctx = new TypeSuffixContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_typeSuffix);
		int _la;
		try {
			setState(840);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new TypeSuffixDotContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(821);
				match(DOT);
				setState(825);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(822);
					annotation();
					}
					}
					setState(827);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(828);
				match(Identifier);
				setState(830);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(829);
					typeArguments();
					}
					break;
				}
				}
				break;
			case LBRACK:
			case AT:
				_localctx = new TypeSuffixArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(835);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(832);
					annotation();
					}
					}
					setState(837);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(838);
				match(LBRACK);
				setState(839);
				match(RBRACK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypePostfixContext extends ParserRuleContext {
		public TypeAtomContext typeAtom() {
			return getRuleContext(TypeAtomContext.class,0);
		}
		public List<TypeSuffixContext> typeSuffix() {
			return getRuleContexts(TypeSuffixContext.class);
		}
		public TypeSuffixContext typeSuffix(int i) {
			return getRuleContext(TypeSuffixContext.class,i);
		}
		public List<TypeQualifierContext> typeQualifier() {
			return getRuleContexts(TypeQualifierContext.class);
		}
		public TypeQualifierContext typeQualifier(int i) {
			return getRuleContext(TypeQualifierContext.class,i);
		}
		public TypePostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typePostfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTypePostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTypePostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTypePostfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypePostfixContext typePostfix() throws RecognitionException {
		TypePostfixContext _localctx = new TypePostfixContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_typePostfix);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			typeAtom();
			setState(846);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(843);
					typeSuffix();
					}
					} 
				}
				setState(848);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			setState(852);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(849);
					typeQualifier();
					}
					} 
				}
				setState(854);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeArgumentsContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JasperParser.LT, 0); }
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TerminalNode GT() { return getToken(JasperParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JasperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JasperParser.COMMA, i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTypeArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_typeArguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			match(LT);
			setState(856);
			typeArgument();
			setState(861);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(857);
					match(COMMA);
					setState(858);
					typeArgument();
					}
					} 
				}
				setState(863);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			setState(865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(864);
				match(COMMA);
				}
			}

			setState(867);
			match(GT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode LT() { return getToken(JasperParser.LT, 0); }
		public TerminalNode GT() { return getToken(JasperParser.GT, 0); }
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTypeArgumentsOrDiamond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTypeArgumentsOrDiamond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_typeArgumentsOrDiamond);
		try {
			setState(872);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(869);
				typeArguments();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(870);
				match(LT);
				setState(871);
				match(GT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
	 
		public TypeArgumentContext() { }
		public void copyFrom(TypeArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeArgumentWildcardContext extends TypeArgumentContext {
		public WildcardContext wildcard() {
			return getRuleContext(WildcardContext.class,0);
		}
		public TypeArgumentWildcardContext(TypeArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTypeArgumentWildcard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTypeArgumentWildcard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTypeArgumentWildcard(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeArgumentTypeContext extends TypeArgumentContext {
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public TypeArgumentTypeContext(TypeArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTypeArgumentType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTypeArgumentType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTypeArgumentType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_typeArgument);
		try {
			setState(876);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
			case Int8:
			case Int16:
			case Int32:
			case Int64:
			case Int128:
			case UInt:
			case UInt8:
			case UInt16:
			case UInt32:
			case UInt64:
			case UInt128:
			case Float:
			case Float32:
			case Float64:
			case Float128:
			case Char:
			case Char8:
			case Char16:
			case Char32:
			case Byte:
			case Bytes:
			case String:
			case Regex:
			case Bool:
			case Unit:
			case Any:
			case POW:
			case AND_AND:
			case LPAREN:
			case AT:
			case STAR:
			case AMP:
			case Identifier:
				_localctx = new TypeArgumentTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(874);
				typeExpr();
				}
				break;
			case QUESTION:
				_localctx = new TypeArgumentWildcardContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(875);
				wildcard();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParametersContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(JasperParser.LT, 0); }
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TerminalNode GT() { return getToken(JasperParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JasperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JasperParser.COMMA, i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTypeParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTypeParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_typeParameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			match(LT);
			setState(879);
			typeParameter();
			setState(884);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(880);
					match(COMMA);
					setState(881);
					typeParameter();
					}
					} 
				}
				setState(886);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			setState(888);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(887);
				match(COMMA);
				}
			}

			setState(890);
			match(GT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParameterContext extends ParserRuleContext {
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
	 
		public TypeParameterContext() { }
		public void copyFrom(TypeParameterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeParamContext extends TypeParameterContext {
		public TerminalNode Identifier() { return getToken(JasperParser.Identifier, 0); }
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParamContext(TypeParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTypeParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTypeParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTypeParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_typeParameter);
		int _la;
		try {
			_localctx = new TypeParamContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(895);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 74779944552321L) != 0) || _la==AT) {
				{
				{
				setState(892);
				modifier();
				}
				}
				setState(897);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(898);
			match(Identifier);
			setState(900);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends || _la==Super) {
				{
				setState(899);
				typeBound();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeBoundContext extends ParserRuleContext {
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
	 
		public TypeBoundContext() { }
		public void copyFrom(TypeBoundContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeBoundAlternativeContext extends TypeBoundContext {
		public List<TypeExprContext> typeExpr() {
			return getRuleContexts(TypeExprContext.class);
		}
		public TypeExprContext typeExpr(int i) {
			return getRuleContext(TypeExprContext.class,i);
		}
		public TerminalNode Extends() { return getToken(JasperParser.Extends, 0); }
		public TerminalNode Super() { return getToken(JasperParser.Super, 0); }
		public List<TerminalNode> AMP() { return getTokens(JasperParser.AMP); }
		public TerminalNode AMP(int i) {
			return getToken(JasperParser.AMP, i);
		}
		public TypeBoundAlternativeContext(TypeBoundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTypeBoundAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTypeBoundAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTypeBoundAlternative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_typeBound);
		int _la;
		try {
			_localctx = new TypeBoundAlternativeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			_la = _input.LA(1);
			if ( !(_la==Extends || _la==Super) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(903);
			typeExpr();
			setState(908);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AMP) {
				{
				{
				setState(904);
				match(AMP);
				setState(905);
				typeExpr();
				}
				}
				setState(910);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WildcardContext extends ParserRuleContext {
		public WildcardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard; }
	 
		public WildcardContext() { }
		public void copyFrom(WildcardContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeWildcardContext extends WildcardContext {
		public TerminalNode QUESTION() { return getToken(JasperParser.QUESTION, 0); }
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public TerminalNode Extends() { return getToken(JasperParser.Extends, 0); }
		public TerminalNode Super() { return getToken(JasperParser.Super, 0); }
		public TypeWildcardContext(WildcardContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTypeWildcard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTypeWildcard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTypeWildcard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WildcardContext wildcard() throws RecognitionException {
		WildcardContext _localctx = new WildcardContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_wildcard);
		int _la;
		try {
			_localctx = new TypeWildcardContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(911);
			match(QUESTION);
			setState(914);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends || _la==Super) {
				{
				setState(912);
				_la = _input.LA(1);
				if ( !(_la==Extends || _la==Super) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(913);
				typeExpr();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class WildcardBoundsContext extends ParserRuleContext {
		public TerminalNode Extends() { return getToken(JasperParser.Extends, 0); }
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public TerminalNode Super() { return getToken(JasperParser.Super, 0); }
		public TypePostfixContext typePostfix() {
			return getRuleContext(TypePostfixContext.class,0);
		}
		public WildcardBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcardBounds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterWildcardBounds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitWildcardBounds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitWildcardBounds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WildcardBoundsContext wildcardBounds() throws RecognitionException {
		WildcardBoundsContext _localctx = new WildcardBoundsContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_wildcardBounds);
		try {
			setState(920);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Extends:
				enterOuterAlt(_localctx, 1);
				{
				setState(916);
				match(Extends);
				setState(917);
				typeExpr();
				}
				break;
			case Super:
				enterOuterAlt(_localctx, 2);
				{
				setState(918);
				match(Super);
				setState(919);
				typePostfix();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode Public() { return getToken(JasperParser.Public, 0); }
		public TerminalNode Protected() { return getToken(JasperParser.Protected, 0); }
		public TerminalNode Private() { return getToken(JasperParser.Private, 0); }
		public TerminalNode Abstract() { return getToken(JasperParser.Abstract, 0); }
		public TerminalNode Static() { return getToken(JasperParser.Static, 0); }
		public TerminalNode Final() { return getToken(JasperParser.Final, 0); }
		public TerminalNode Default() { return getToken(JasperParser.Default, 0); }
		public TerminalNode Extern() { return getToken(JasperParser.Extern, 0); }
		public TerminalNode Defer() { return getToken(JasperParser.Defer, 0); }
		public TerminalNode Lock() { return getToken(JasperParser.Lock, 0); }
		public TerminalNode Atomic() { return getToken(JasperParser.Atomic, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_modifier);
		try {
			setState(934);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(922);
				annotation();
				}
				break;
			case Public:
				enterOuterAlt(_localctx, 2);
				{
				setState(923);
				match(Public);
				}
				break;
			case Protected:
				enterOuterAlt(_localctx, 3);
				{
				setState(924);
				match(Protected);
				}
				break;
			case Private:
				enterOuterAlt(_localctx, 4);
				{
				setState(925);
				match(Private);
				}
				break;
			case Abstract:
				enterOuterAlt(_localctx, 5);
				{
				setState(926);
				match(Abstract);
				}
				break;
			case Static:
				enterOuterAlt(_localctx, 6);
				{
				setState(927);
				match(Static);
				}
				break;
			case Final:
				enterOuterAlt(_localctx, 7);
				{
				setState(928);
				match(Final);
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 8);
				{
				setState(929);
				match(Default);
				}
				break;
			case Extern:
				enterOuterAlt(_localctx, 9);
				{
				setState(930);
				match(Extern);
				}
				break;
			case Defer:
				enterOuterAlt(_localctx, 10);
				{
				setState(931);
				match(Defer);
				}
				break;
			case Lock:
				enterOuterAlt(_localctx, 11);
				{
				setState(932);
				match(Lock);
				}
				break;
			case Atomic:
				enterOuterAlt(_localctx, 12);
				{
				setState(933);
				match(Atomic);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationContext extends ParserRuleContext {
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
	 
		public AnnotationContext() { }
		public void copyFrom(AnnotationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationUseNodeContext extends AnnotationContext {
		public TerminalNode AT() { return getToken(JasperParser.AT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public AnnotationArgumentsContext annotationArguments() {
			return getRuleContext(AnnotationArgumentsContext.class,0);
		}
		public AnnotationUseNodeContext(AnnotationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterAnnotationUseNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitAnnotationUseNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitAnnotationUseNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_annotation);
		try {
			_localctx = new AnnotationUseNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			match(AT);
			setState(937);
			qualifiedName();
			setState(939);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(938);
				annotationArguments();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationArgumentsContext extends ParserRuleContext {
		public AnnotationArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationArguments; }
	 
		public AnnotationArgumentsContext() { }
		public void copyFrom(AnnotationArgumentsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationArgumentsNodeContext extends AnnotationArgumentsContext {
		public TerminalNode LPAREN() { return getToken(JasperParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JasperParser.RPAREN, 0); }
		public AnnotationArgumentListContext annotationArgumentList() {
			return getRuleContext(AnnotationArgumentListContext.class,0);
		}
		public AnnotationArgumentsNodeContext(AnnotationArgumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterAnnotationArgumentsNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitAnnotationArgumentsNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitAnnotationArgumentsNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationArgumentsContext annotationArguments() throws RecognitionException {
		AnnotationArgumentsContext _localctx = new AnnotationArgumentsContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_annotationArguments);
		try {
			_localctx = new AnnotationArgumentsNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(941);
			match(LPAREN);
			setState(943);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(942);
				annotationArgumentList();
				}
				break;
			}
			setState(945);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationArgumentListContext extends ParserRuleContext {
		public AnnotationArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationArgumentList; }
	 
		public AnnotationArgumentListContext() { }
		public void copyFrom(AnnotationArgumentListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationArgumentsNamedNodeContext extends AnnotationArgumentListContext {
		public List<AnnotationNamedArgumentContext> annotationNamedArgument() {
			return getRuleContexts(AnnotationNamedArgumentContext.class);
		}
		public AnnotationNamedArgumentContext annotationNamedArgument(int i) {
			return getRuleContext(AnnotationNamedArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JasperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JasperParser.COMMA, i);
		}
		public AnnotationArgumentsNamedNodeContext(AnnotationArgumentListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterAnnotationArgumentsNamedNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitAnnotationArgumentsNamedNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitAnnotationArgumentsNamedNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationArgumentsMixedNodeContext extends AnnotationArgumentListContext {
		public List<AnnotationPositionalArgumentContext> annotationPositionalArgument() {
			return getRuleContexts(AnnotationPositionalArgumentContext.class);
		}
		public AnnotationPositionalArgumentContext annotationPositionalArgument(int i) {
			return getRuleContext(AnnotationPositionalArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JasperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JasperParser.COMMA, i);
		}
		public List<AnnotationNamedArgumentContext> annotationNamedArgument() {
			return getRuleContexts(AnnotationNamedArgumentContext.class);
		}
		public AnnotationNamedArgumentContext annotationNamedArgument(int i) {
			return getRuleContext(AnnotationNamedArgumentContext.class,i);
		}
		public AnnotationArgumentsMixedNodeContext(AnnotationArgumentListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterAnnotationArgumentsMixedNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitAnnotationArgumentsMixedNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitAnnotationArgumentsMixedNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationArgumentListContext annotationArgumentList() throws RecognitionException {
		AnnotationArgumentListContext _localctx = new AnnotationArgumentListContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_annotationArgumentList);
		int _la;
		try {
			int _alt;
			setState(980);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				_localctx = new AnnotationArgumentsMixedNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(947);
				annotationPositionalArgument();
				setState(952);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(948);
						match(COMMA);
						setState(949);
						annotationPositionalArgument();
						}
						} 
					}
					setState(954);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				}
				setState(964);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(955);
					match(COMMA);
					setState(956);
					annotationNamedArgument();
					setState(961);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(957);
							match(COMMA);
							setState(958);
							annotationNamedArgument();
							}
							} 
						}
						setState(963);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
					}
					}
					break;
				}
				setState(967);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(966);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				_localctx = new AnnotationArgumentsNamedNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(969);
				annotationNamedArgument();
				setState(974);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(970);
						match(COMMA);
						setState(971);
						annotationNamedArgument();
						}
						} 
					}
					setState(976);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				}
				setState(978);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(977);
					match(COMMA);
					}
				}

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

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationPositionalArgumentContext extends ParserRuleContext {
		public AnnotationPositionalArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationPositionalArgument; }
	 
		public AnnotationPositionalArgumentContext() { }
		public void copyFrom(AnnotationPositionalArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationArgumentSpreadPositionalNodeContext extends AnnotationPositionalArgumentContext {
		public AnnotationSpreadArgumentContext annotationSpreadArgument() {
			return getRuleContext(AnnotationSpreadArgumentContext.class,0);
		}
		public AnnotationArgumentSpreadPositionalNodeContext(AnnotationPositionalArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterAnnotationArgumentSpreadPositionalNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitAnnotationArgumentSpreadPositionalNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitAnnotationArgumentSpreadPositionalNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationArgumentPositionalNodeContext extends AnnotationPositionalArgumentContext {
		public AnnotationArgumentValueContext annotationArgumentValue() {
			return getRuleContext(AnnotationArgumentValueContext.class,0);
		}
		public AnnotationArgumentPositionalNodeContext(AnnotationPositionalArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterAnnotationArgumentPositionalNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitAnnotationArgumentPositionalNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitAnnotationArgumentPositionalNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationPositionalArgumentContext annotationPositionalArgument() throws RecognitionException {
		AnnotationPositionalArgumentContext _localctx = new AnnotationPositionalArgumentContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_annotationPositionalArgument);
		try {
			setState(984);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				_localctx = new AnnotationArgumentSpreadPositionalNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(982);
				annotationSpreadArgument();
				}
				break;
			case 2:
				_localctx = new AnnotationArgumentPositionalNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(983);
				annotationArgumentValue();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationNamedArgumentContext extends ParserRuleContext {
		public AnnotationNamedArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationNamedArgument; }
	 
		public AnnotationNamedArgumentContext() { }
		public void copyFrom(AnnotationNamedArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationArgumentNamedNodeContext extends AnnotationNamedArgumentContext {
		public TerminalNode Identifier() { return getToken(JasperParser.Identifier, 0); }
		public TerminalNode COLON() { return getToken(JasperParser.COLON, 0); }
		public AnnotationArgumentValueContext annotationArgumentValue() {
			return getRuleContext(AnnotationArgumentValueContext.class,0);
		}
		public AnnotationArgumentNamedNodeContext(AnnotationNamedArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterAnnotationArgumentNamedNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitAnnotationArgumentNamedNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitAnnotationArgumentNamedNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationNamedArgumentContext annotationNamedArgument() throws RecognitionException {
		AnnotationNamedArgumentContext _localctx = new AnnotationNamedArgumentContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_annotationNamedArgument);
		try {
			_localctx = new AnnotationArgumentNamedNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
			match(Identifier);
			setState(987);
			match(COLON);
			setState(988);
			annotationArgumentValue();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationSpreadArgumentContext extends ParserRuleContext {
		public AnnotationSpreadArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationSpreadArgument; }
	 
		public AnnotationSpreadArgumentContext() { }
		public void copyFrom(AnnotationSpreadArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationArgumentSpreadNodeContext extends AnnotationSpreadArgumentContext {
		public TerminalNode ELLIPSIS() { return getToken(JasperParser.ELLIPSIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationArgumentSpreadNodeContext(AnnotationSpreadArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterAnnotationArgumentSpreadNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitAnnotationArgumentSpreadNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitAnnotationArgumentSpreadNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationSpreadArgumentContext annotationSpreadArgument() throws RecognitionException {
		AnnotationSpreadArgumentContext _localctx = new AnnotationSpreadArgumentContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_annotationSpreadArgument);
		try {
			_localctx = new AnnotationArgumentSpreadNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			match(ELLIPSIS);
			setState(991);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationArgumentValueContext extends ParserRuleContext {
		public AnnotationArgumentValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationArgumentValue; }
	 
		public AnnotationArgumentValueContext() { }
		public void copyFrom(AnnotationArgumentValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationArgumentValueAtNodeContext extends AnnotationArgumentValueContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public AnnotationArgumentValueAtNodeContext(AnnotationArgumentValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterAnnotationArgumentValueAtNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitAnnotationArgumentValueAtNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitAnnotationArgumentValueAtNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationArgumentValueExpressionNodeContext extends AnnotationArgumentValueContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationArgumentValueExpressionNodeContext(AnnotationArgumentValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterAnnotationArgumentValueExpressionNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitAnnotationArgumentValueExpressionNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitAnnotationArgumentValueExpressionNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationArgumentValueContext annotationArgumentValue() throws RecognitionException {
		AnnotationArgumentValueContext _localctx = new AnnotationArgumentValueContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_annotationArgumentValue);
		try {
			setState(995);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				_localctx = new AnnotationArgumentValueAtNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(993);
				annotation();
				}
				break;
			case 2:
				_localctx = new AnnotationArgumentValueExpressionNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(994);
				expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElementValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(JasperParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JasperParser.RBRACE, 0); }
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JasperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JasperParser.COMMA, i);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitElementValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_elementValue);
		int _la;
		try {
			int _alt;
			setState(1017);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(997);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(998);
				annotation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(999);
				match(LBRACE);
				setState(1011);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(1000);
					elementValue();
					setState(1005);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1001);
							match(COMMA);
							setState(1002);
							elementValue();
							}
							} 
						}
						setState(1007);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
					}
					setState(1009);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
					case 1:
						{
						setState(1008);
						match(COMMA);
						}
						break;
					}
					}
					break;
				}
				setState(1014);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1013);
					match(COMMA);
					}
				}

				setState(1016);
				match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultValueContext extends ParserRuleContext {
		public TerminalNode Default() { return getToken(JasperParser.Default, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitDefaultValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitDefaultValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
			match(Default);
			setState(1020);
			elementValue();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NormalClassDeclarationContext extends ParserRuleContext {
		public ModifierContext mods;
		public Token name;
		public TypeParametersContext tparams;
		public SuperclassContext sc;
		public SuperinterfacesContext sis;
		public ClassBodyContext body;
		public TerminalNode Class() { return getToken(JasperParser.Class, 0); }
		public TerminalNode Identifier() { return getToken(JasperParser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public SuperclassContext superclass() {
			return getRuleContext(SuperclassContext.class,0);
		}
		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class,0);
		}
		public NormalClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterNormalClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitNormalClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitNormalClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalClassDeclarationContext normalClassDeclaration() throws RecognitionException {
		NormalClassDeclarationContext _localctx = new NormalClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_normalClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1025);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 74779944552321L) != 0) || _la==AT) {
				{
				{
				setState(1022);
				((NormalClassDeclarationContext)_localctx).mods = modifier();
				}
				}
				setState(1027);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1028);
			match(Class);
			setState(1029);
			((NormalClassDeclarationContext)_localctx).name = match(Identifier);
			setState(1031);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1030);
				((NormalClassDeclarationContext)_localctx).tparams = typeParameters();
				}
			}

			setState(1034);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(1033);
				((NormalClassDeclarationContext)_localctx).sc = superclass();
				}
			}

			setState(1037);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Implements) {
				{
				setState(1036);
				((NormalClassDeclarationContext)_localctx).sis = superinterfaces();
				}
			}

			setState(1039);
			((NormalClassDeclarationContext)_localctx).body = classBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SuperclassContext extends ParserRuleContext {
		public TerminalNode Extends() { return getToken(JasperParser.Extends, 0); }
		public TypePostfixContext typePostfix() {
			return getRuleContext(TypePostfixContext.class,0);
		}
		public SuperclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterSuperclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitSuperclass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitSuperclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperclassContext superclass() throws RecognitionException {
		SuperclassContext _localctx = new SuperclassContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_superclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1041);
			match(Extends);
			setState(1042);
			typePostfix();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SuperinterfacesContext extends ParserRuleContext {
		public TerminalNode Implements() { return getToken(JasperParser.Implements, 0); }
		public List<TypePostfixContext> typePostfix() {
			return getRuleContexts(TypePostfixContext.class);
		}
		public TypePostfixContext typePostfix(int i) {
			return getRuleContext(TypePostfixContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JasperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JasperParser.COMMA, i);
		}
		public SuperinterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superinterfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterSuperinterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitSuperinterfaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitSuperinterfaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperinterfacesContext superinterfaces() throws RecognitionException {
		SuperinterfacesContext _localctx = new SuperinterfacesContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_superinterfaces);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1044);
			match(Implements);
			setState(1045);
			typePostfix();
			setState(1050);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1046);
					match(COMMA);
					setState(1047);
					typePostfix();
					}
					} 
				}
				setState(1052);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			}
			setState(1054);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1053);
				match(COMMA);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JasperParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JasperParser.RBRACE, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			match(LBRACE);
			setState(1060);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72325050040057854L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & -9214364287843942351L) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & 4330017L) != 0)) {
				{
				{
				setState(1057);
				classBodyDeclaration();
				}
				}
				setState(1062);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1063);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
	 
		public ClassBodyDeclarationContext() { }
		public void copyFrom(ClassBodyDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberAnnotationTypeContext extends ClassBodyDeclarationContext {
		public AnnotationTypeDeclarationContext decl;
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public MemberAnnotationTypeContext(ClassBodyDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterMemberAnnotationType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitMemberAnnotationType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitMemberAnnotationType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberConstructorContext extends ClassBodyDeclarationContext {
		public ConstructorDeclarationContext decl;
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public MemberConstructorContext(ClassBodyDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterMemberConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitMemberConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitMemberConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberEnumContext extends ClassBodyDeclarationContext {
		public EnumDeclarationContext decl;
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public MemberEnumContext(ClassBodyDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterMemberEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitMemberEnum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitMemberEnum(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberFieldContext extends ClassBodyDeclarationContext {
		public FieldDeclarationContext decl;
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public MemberFieldContext(ClassBodyDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterMemberField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitMemberField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitMemberField(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberMethodContext extends ClassBodyDeclarationContext {
		public MethodDeclarationContext decl;
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public MemberMethodContext(ClassBodyDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterMemberMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitMemberMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitMemberMethod(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberClassContext extends ClassBodyDeclarationContext {
		public NormalClassDeclarationContext decl;
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}
		public MemberClassContext(ClassBodyDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterMemberClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitMemberClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitMemberClass(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberEmptyContext extends ClassBodyDeclarationContext {
		public TerminalNode SEMI() { return getToken(JasperParser.SEMI, 0); }
		public MemberEmptyContext(ClassBodyDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterMemberEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitMemberEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitMemberEmpty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberDestructorContext extends ClassBodyDeclarationContext {
		public DestructorDeclarationContext decl;
		public DestructorDeclarationContext destructorDeclaration() {
			return getRuleContext(DestructorDeclarationContext.class,0);
		}
		public MemberDestructorContext(ClassBodyDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterMemberDestructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitMemberDestructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitMemberDestructor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberPropertyContext extends ClassBodyDeclarationContext {
		public PropertyDeclarationContext decl;
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public MemberPropertyContext(ClassBodyDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterMemberProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitMemberProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitMemberProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberInterfaceContext extends ClassBodyDeclarationContext {
		public NormalInterfaceDeclarationContext decl;
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public MemberInterfaceContext(ClassBodyDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterMemberInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitMemberInterface(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitMemberInterface(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_classBodyDeclaration);
		try {
			setState(1075);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				_localctx = new MemberFieldContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1065);
				((MemberFieldContext)_localctx).decl = fieldDeclaration();
				}
				break;
			case 2:
				_localctx = new MemberPropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1066);
				((MemberPropertyContext)_localctx).decl = propertyDeclaration();
				}
				break;
			case 3:
				_localctx = new MemberConstructorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1067);
				((MemberConstructorContext)_localctx).decl = constructorDeclaration();
				}
				break;
			case 4:
				_localctx = new MemberDestructorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1068);
				((MemberDestructorContext)_localctx).decl = destructorDeclaration();
				}
				break;
			case 5:
				_localctx = new MemberMethodContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1069);
				((MemberMethodContext)_localctx).decl = methodDeclaration();
				}
				break;
			case 6:
				_localctx = new MemberClassContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1070);
				((MemberClassContext)_localctx).decl = normalClassDeclaration();
				}
				break;
			case 7:
				_localctx = new MemberEnumContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1071);
				((MemberEnumContext)_localctx).decl = enumDeclaration();
				}
				break;
			case 8:
				_localctx = new MemberInterfaceContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1072);
				((MemberInterfaceContext)_localctx).decl = normalInterfaceDeclaration();
				}
				break;
			case 9:
				_localctx = new MemberAnnotationTypeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1073);
				((MemberAnnotationTypeContext)_localctx).decl = annotationTypeDeclaration();
				}
				break;
			case 10:
				_localctx = new MemberEmptyContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1074);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FieldDeclarationContext extends ParserRuleContext {
		public ModifierContext mods;
		public Token kind;
		public VarDeclaratorContext varDeclarator;
		public List<VarDeclaratorContext> decls = new ArrayList<VarDeclaratorContext>();
		public TerminalNode SEMI() { return getToken(JasperParser.SEMI, 0); }
		public List<VarDeclaratorContext> varDeclarator() {
			return getRuleContexts(VarDeclaratorContext.class);
		}
		public VarDeclaratorContext varDeclarator(int i) {
			return getRuleContext(VarDeclaratorContext.class,i);
		}
		public TerminalNode Var() { return getToken(JasperParser.Var, 0); }
		public TerminalNode Const() { return getToken(JasperParser.Const, 0); }
		public TerminalNode Pointer() { return getToken(JasperParser.Pointer, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JasperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JasperParser.COMMA, i);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_fieldDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1080);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 74779944552321L) != 0) || _la==AT) {
				{
				{
				setState(1077);
				((FieldDeclarationContext)_localctx).mods = modifier();
				}
				}
				setState(1082);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1083);
			((FieldDeclarationContext)_localctx).kind = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1879048192L) != 0)) ) {
				((FieldDeclarationContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1084);
			((FieldDeclarationContext)_localctx).varDeclarator = varDeclarator();
			((FieldDeclarationContext)_localctx).decls.add(((FieldDeclarationContext)_localctx).varDeclarator);
			setState(1089);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1085);
					match(COMMA);
					setState(1086);
					((FieldDeclarationContext)_localctx).varDeclarator = varDeclarator();
					((FieldDeclarationContext)_localctx).decls.add(((FieldDeclarationContext)_localctx).varDeclarator);
					}
					} 
				}
				setState(1091);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			}
			setState(1093);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1092);
				match(COMMA);
				}
			}

			setState(1095);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyDeclarationContext extends ParserRuleContext {
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
	 
		public PropertyDeclarationContext() { }
		public void copyFrom(PropertyDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyConstContext extends PropertyDeclarationContext {
		public ModifierContext mods;
		public PropertyConstHeaderContext header;
		public GetterOnlyBlockContext body;
		public TerminalNode SEMI() { return getToken(JasperParser.SEMI, 0); }
		public PropertyConstHeaderContext propertyConstHeader() {
			return getRuleContext(PropertyConstHeaderContext.class,0);
		}
		public GetterOnlyBlockContext getterOnlyBlock() {
			return getRuleContext(GetterOnlyBlockContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public PropertyConstContext(PropertyDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterPropertyConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitPropertyConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitPropertyConst(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyVariableLikeContext extends PropertyDeclarationContext {
		public ModifierContext mods;
		public PropertyVarHeaderContext header;
		public AccessorBlockContext body;
		public TerminalNode SEMI() { return getToken(JasperParser.SEMI, 0); }
		public PropertyVarHeaderContext propertyVarHeader() {
			return getRuleContext(PropertyVarHeaderContext.class,0);
		}
		public AccessorBlockContext accessorBlock() {
			return getRuleContext(AccessorBlockContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public PropertyVariableLikeContext(PropertyDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterPropertyVariableLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitPropertyVariableLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitPropertyVariableLike(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_propertyDeclaration);
		int _la;
		try {
			setState(1117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				_localctx = new PropertyVariableLikeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 74779944552321L) != 0) || _la==AT) {
					{
					{
					setState(1097);
					((PropertyVariableLikeContext)_localctx).mods = modifier();
					}
					}
					setState(1102);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1103);
				((PropertyVariableLikeContext)_localctx).header = propertyVarHeader();
				setState(1104);
				((PropertyVariableLikeContext)_localctx).body = accessorBlock();
				setState(1105);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new PropertyConstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 74779944552321L) != 0) || _la==AT) {
					{
					{
					setState(1107);
					((PropertyConstContext)_localctx).mods = modifier();
					}
					}
					setState(1112);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1113);
				((PropertyConstContext)_localctx).header = propertyConstHeader();
				setState(1114);
				((PropertyConstContext)_localctx).body = getterOnlyBlock();
				setState(1115);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyVarHeaderContext extends ParserRuleContext {
		public Token kind;
		public MaybeTypedBindingContext binding;
		public MaybeTypedBindingContext maybeTypedBinding() {
			return getRuleContext(MaybeTypedBindingContext.class,0);
		}
		public TerminalNode Var() { return getToken(JasperParser.Var, 0); }
		public TerminalNode Pointer() { return getToken(JasperParser.Pointer, 0); }
		public PropertyVarHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyVarHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterPropertyVarHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitPropertyVarHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitPropertyVarHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyVarHeaderContext propertyVarHeader() throws RecognitionException {
		PropertyVarHeaderContext _localctx = new PropertyVarHeaderContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_propertyVarHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1119);
			((PropertyVarHeaderContext)_localctx).kind = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==Var || _la==Pointer) ) {
				((PropertyVarHeaderContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1120);
			((PropertyVarHeaderContext)_localctx).binding = maybeTypedBinding();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyConstHeaderContext extends ParserRuleContext {
		public MaybeTypedBindingContext binding;
		public TerminalNode Const() { return getToken(JasperParser.Const, 0); }
		public MaybeTypedBindingContext maybeTypedBinding() {
			return getRuleContext(MaybeTypedBindingContext.class,0);
		}
		public PropertyConstHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyConstHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterPropertyConstHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitPropertyConstHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitPropertyConstHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyConstHeaderContext propertyConstHeader() throws RecognitionException {
		PropertyConstHeaderContext _localctx = new PropertyConstHeaderContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_propertyConstHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1122);
			match(Const);
			setState(1123);
			((PropertyConstHeaderContext)_localctx).binding = maybeTypedBinding();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyAccessorContext extends ParserRuleContext {
		public SoftGetContext softGet() {
			return getRuleContext(SoftGetContext.class,0);
		}
		public SoftSetContext softSet() {
			return getRuleContext(SoftSetContext.class,0);
		}
		public PropertyAccessorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAccessor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterPropertyAccessor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitPropertyAccessor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitPropertyAccessor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyAccessorContext propertyAccessor() throws RecognitionException {
		PropertyAccessorContext _localctx = new PropertyAccessorContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_propertyAccessor);
		try {
			setState(1127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1125);
				softGet();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1126);
				softSet();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyAccessorBlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JasperParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JasperParser.RBRACE, 0); }
		public TerminalNode ASSIGN() { return getToken(JasperParser.ASSIGN, 0); }
		public List<PropertyAccessorContext> propertyAccessor() {
			return getRuleContexts(PropertyAccessorContext.class);
		}
		public PropertyAccessorContext propertyAccessor(int i) {
			return getRuleContext(PropertyAccessorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JasperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JasperParser.COMMA, i);
		}
		public PropertyAccessorBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyAccessorBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterPropertyAccessorBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitPropertyAccessorBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitPropertyAccessorBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyAccessorBlockContext propertyAccessorBlock() throws RecognitionException {
		PropertyAccessorBlockContext _localctx = new PropertyAccessorBlockContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_propertyAccessorBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1129);
				match(ASSIGN);
				}
			}

			setState(1132);
			match(LBRACE);
			setState(1143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(1133);
				propertyAccessor();
				setState(1140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1135);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
						case 1:
							{
							setState(1134);
							match(COMMA);
							}
							break;
						}
						setState(1137);
						propertyAccessor();
						}
						} 
					}
					setState(1142);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				}
				}
				break;
			}
			setState(1145);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AccessorBlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JasperParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JasperParser.RBRACE, 0); }
		public List<AccessorItemContext> accessorItem() {
			return getRuleContexts(AccessorItemContext.class);
		}
		public AccessorItemContext accessorItem(int i) {
			return getRuleContext(AccessorItemContext.class,i);
		}
		public AccessorBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessorBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterAccessorBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitAccessorBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitAccessorBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessorBlockContext accessorBlock() throws RecognitionException {
		AccessorBlockContext _localctx = new AccessorBlockContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_accessorBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1147);
			match(LBRACE);
			setState(1149); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1148);
					accessorItem();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1151); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1153);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AccessorItemContext extends ParserRuleContext {
		public AccessorItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessorItem; }
	 
		public AccessorItemContext() { }
		public void copyFrom(AccessorItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccessorSetContext extends AccessorItemContext {
		public SoftSetContext softSet() {
			return getRuleContext(SoftSetContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JasperParser.SEMI, 0); }
		public AccessorSetContext(AccessorItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterAccessorSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitAccessorSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitAccessorSet(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccessorGetContext extends AccessorItemContext {
		public SoftGetContext softGet() {
			return getRuleContext(SoftGetContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JasperParser.SEMI, 0); }
		public AccessorGetContext(AccessorItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterAccessorGet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitAccessorGet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitAccessorGet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessorItemContext accessorItem() throws RecognitionException {
		AccessorItemContext _localctx = new AccessorItemContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_accessorItem);
		try {
			setState(1163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				_localctx = new AccessorGetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1155);
				softGet();
				setState(1157);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(1156);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new AccessorSetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1159);
				softSet();
				setState(1161);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(1160);
					match(SEMI);
					}
					break;
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class GetterOnlyBlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JasperParser.LBRACE, 0); }
		public SoftGetContext softGet() {
			return getRuleContext(SoftGetContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(JasperParser.RBRACE, 0); }
		public TerminalNode SEMI() { return getToken(JasperParser.SEMI, 0); }
		public GetterOnlyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getterOnlyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterGetterOnlyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitGetterOnlyBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitGetterOnlyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetterOnlyBlockContext getterOnlyBlock() throws RecognitionException {
		GetterOnlyBlockContext _localctx = new GetterOnlyBlockContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_getterOnlyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1165);
			match(LBRACE);
			setState(1166);
			softGet();
			setState(1168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1167);
				match(SEMI);
				}
			}

			setState(1170);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
	 
		public MethodDeclarationContext() { }
		public void copyFrom(MethodDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationFunctionStyleContext extends MethodDeclarationContext {
		public ModifierContext mods;
		public Token name;
		public TypedBindingContext typedBinding;
		public List<TypedBindingContext> params = new ArrayList<TypedBindingContext>();
		public FunctionReturnTypeContext ret;
		public Throws_Context thr;
		public MethodBodyContext body;
		public TerminalNode Function() { return getToken(JasperParser.Function, 0); }
		public TerminalNode LPAREN() { return getToken(JasperParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JasperParser.RPAREN, 0); }
		public TerminalNode Identifier() { return getToken(JasperParser.Identifier, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public List<TypedBindingContext> typedBinding() {
			return getRuleContexts(TypedBindingContext.class);
		}
		public TypedBindingContext typedBinding(int i) {
			return getRuleContext(TypedBindingContext.class,i);
		}
		public FunctionReturnTypeContext functionReturnType() {
			return getRuleContext(FunctionReturnTypeContext.class,0);
		}
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(JasperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JasperParser.COMMA, i);
		}
		public MethodDeclarationFunctionStyleContext(MethodDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterMethodDeclarationFunctionStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitMethodDeclarationFunctionStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitMethodDeclarationFunctionStyle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationJavaStyleContext extends MethodDeclarationContext {
		public ModifierContext mods;
		public MethodHeaderContext header;
		public MethodBodyContext body;
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public MethodDeclarationJavaStyleContext(MethodDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterMethodDeclarationJavaStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitMethodDeclarationJavaStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitMethodDeclarationJavaStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_methodDeclaration);
		int _la;
		try {
			int _alt;
			setState(1211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				_localctx = new MethodDeclarationJavaStyleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1172);
						((MethodDeclarationJavaStyleContext)_localctx).mods = modifier();
						}
						} 
					}
					setState(1177);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
				}
				setState(1178);
				((MethodDeclarationJavaStyleContext)_localctx).header = methodHeader();
				setState(1179);
				((MethodDeclarationJavaStyleContext)_localctx).body = methodBody();
				}
				break;
			case 2:
				_localctx = new MethodDeclarationFunctionStyleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 74779944552321L) != 0) || _la==AT) {
					{
					{
					setState(1181);
					((MethodDeclarationFunctionStyleContext)_localctx).mods = modifier();
					}
					}
					setState(1186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1187);
				match(Function);
				setState(1188);
				((MethodDeclarationFunctionStyleContext)_localctx).name = match(Identifier);
				setState(1189);
				match(LPAREN);
				setState(1201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1190);
					((MethodDeclarationFunctionStyleContext)_localctx).typedBinding = typedBinding();
					((MethodDeclarationFunctionStyleContext)_localctx).params.add(((MethodDeclarationFunctionStyleContext)_localctx).typedBinding);
					setState(1195);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1191);
							match(COMMA);
							setState(1192);
							((MethodDeclarationFunctionStyleContext)_localctx).typedBinding = typedBinding();
							((MethodDeclarationFunctionStyleContext)_localctx).params.add(((MethodDeclarationFunctionStyleContext)_localctx).typedBinding);
							}
							} 
						}
						setState(1197);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
					}
					setState(1199);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(1198);
						match(COMMA);
						}
					}

					}
				}

				setState(1203);
				match(RPAREN);
				setState(1205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1204);
					((MethodDeclarationFunctionStyleContext)_localctx).ret = functionReturnType();
					}
				}

				setState(1208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Throws) {
					{
					setState(1207);
					((MethodDeclarationFunctionStyleContext)_localctx).thr = throws_();
					}
				}

				setState(1210);
				((MethodDeclarationFunctionStyleContext)_localctx).body = methodBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodHeaderContext extends ParserRuleContext {
		public MethodHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodHeader; }
	 
		public MethodHeaderContext() { }
		public void copyFrom(MethodHeaderContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodHeaderSimpleContext extends MethodHeaderContext {
		public ResultContext res;
		public MethodDeclaratorContext decl;
		public Throws_Context thr;
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public MethodDeclaratorContext methodDeclarator() {
			return getRuleContext(MethodDeclaratorContext.class,0);
		}
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}
		public MethodHeaderSimpleContext(MethodHeaderContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterMethodHeaderSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitMethodHeaderSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitMethodHeaderSimple(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodHeaderGenericContext extends MethodHeaderContext {
		public TypeParametersContext tparams;
		public AnnotationContext annotation;
		public List<AnnotationContext> annos = new ArrayList<AnnotationContext>();
		public ResultContext res;
		public MethodDeclaratorContext decl;
		public Throws_Context thr;
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public MethodDeclaratorContext methodDeclarator() {
			return getRuleContext(MethodDeclaratorContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}
		public MethodHeaderGenericContext(MethodHeaderContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterMethodHeaderGeneric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitMethodHeaderGeneric(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitMethodHeaderGeneric(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodHeaderContext methodHeader() throws RecognitionException {
		MethodHeaderContext _localctx = new MethodHeaderContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_methodHeader);
		int _la;
		try {
			int _alt;
			setState(1230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
			case Int8:
			case Int16:
			case Int32:
			case Int64:
			case Int128:
			case UInt:
			case UInt8:
			case UInt16:
			case UInt32:
			case UInt64:
			case UInt128:
			case Float:
			case Float32:
			case Float64:
			case Float128:
			case Char:
			case Char8:
			case Char16:
			case Char32:
			case Byte:
			case Bytes:
			case String:
			case Regex:
			case Bool:
			case Unit:
			case Any:
			case POW:
			case AND_AND:
			case LPAREN:
			case AT:
			case STAR:
			case AMP:
			case Identifier:
				_localctx = new MethodHeaderSimpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1213);
				((MethodHeaderSimpleContext)_localctx).res = result();
				setState(1214);
				((MethodHeaderSimpleContext)_localctx).decl = methodDeclarator();
				setState(1216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Throws) {
					{
					setState(1215);
					((MethodHeaderSimpleContext)_localctx).thr = throws_();
					}
				}

				}
				break;
			case LT:
				_localctx = new MethodHeaderGenericContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1218);
				((MethodHeaderGenericContext)_localctx).tparams = typeParameters();
				setState(1222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1219);
						((MethodHeaderGenericContext)_localctx).annotation = annotation();
						((MethodHeaderGenericContext)_localctx).annos.add(((MethodHeaderGenericContext)_localctx).annotation);
						}
						} 
					}
					setState(1224);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				}
				setState(1225);
				((MethodHeaderGenericContext)_localctx).res = result();
				setState(1226);
				((MethodHeaderGenericContext)_localctx).decl = methodDeclarator();
				setState(1228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Throws) {
					{
					setState(1227);
					((MethodHeaderGenericContext)_localctx).thr = throws_();
					}
				}

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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclaratorContext extends ParserRuleContext {
		public Token name;
		public TerminalNode LPAREN() { return getToken(JasperParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JasperParser.RPAREN, 0); }
		public TerminalNode Identifier() { return getToken(JasperParser.Identifier, 0); }
		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(JasperParser.COMMA, 0); }
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JasperParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JasperParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JasperParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JasperParser.RBRACK, i);
		}
		public MethodDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterMethodDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitMethodDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitMethodDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclaratorContext methodDeclarator() throws RecognitionException {
		MethodDeclaratorContext _localctx = new MethodDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_methodDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1232);
			((MethodDeclaratorContext)_localctx).name = match(Identifier);
			setState(1233);
			match(LPAREN);
			setState(1240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(1234);
				receiverParameter();
				}
				break;
			case 2:
				{
				setState(1235);
				formalParameters();
				setState(1236);
				match(COMMA);
				setState(1237);
				lastFormalParameter();
				}
				break;
			case 3:
				{
				setState(1239);
				lastFormalParameter();
				}
				break;
			}
			setState(1242);
			match(RPAREN);
			setState(1247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(1243);
				match(LBRACK);
				setState(1244);
				match(RBRACK);
				}
				}
				setState(1249);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodBodyContext extends ParserRuleContext {
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
	 
		public MethodBodyContext() { }
		public void copyFrom(MethodBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodBodyBlockContext extends MethodBodyContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyBlockContext(MethodBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterMethodBodyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitMethodBodyBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitMethodBodyBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodBodyEmptyContext extends MethodBodyContext {
		public TerminalNode SEMI() { return getToken(JasperParser.SEMI, 0); }
		public MethodBodyEmptyContext(MethodBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterMethodBodyEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitMethodBodyEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitMethodBodyEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_methodBody);
		try {
			setState(1252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				_localctx = new MethodBodyBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1250);
				block();
				}
				break;
			case SEMI:
				_localctx = new MethodBodyEmptyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1251);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public ModifierContext mods;
		public ConstructorHeaderContext header;
		public ConstructorBodyContext body;
		public ConstructorHeaderContext constructorHeader() {
			return getRuleContext(ConstructorHeaderContext.class,0);
		}
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 74779944552321L) != 0) || _la==AT) {
				{
				{
				setState(1254);
				((ConstructorDeclarationContext)_localctx).mods = modifier();
				}
				}
				setState(1259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1260);
			((ConstructorDeclarationContext)_localctx).header = constructorHeader();
			setState(1261);
			((ConstructorDeclarationContext)_localctx).body = constructorBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorHeaderContext extends ParserRuleContext {
		public TypedBindingContext typedBinding;
		public List<TypedBindingContext> params = new ArrayList<TypedBindingContext>();
		public Throws_Context thr;
		public TerminalNode Constructor() { return getToken(JasperParser.Constructor, 0); }
		public TerminalNode LPAREN() { return getToken(JasperParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JasperParser.RPAREN, 0); }
		public List<TypedBindingContext> typedBinding() {
			return getRuleContexts(TypedBindingContext.class);
		}
		public TypedBindingContext typedBinding(int i) {
			return getRuleContext(TypedBindingContext.class,i);
		}
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(JasperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JasperParser.COMMA, i);
		}
		public ConstructorHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterConstructorHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitConstructorHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitConstructorHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorHeaderContext constructorHeader() throws RecognitionException {
		ConstructorHeaderContext _localctx = new ConstructorHeaderContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_constructorHeader);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1263);
			match(Constructor);
			setState(1264);
			match(LPAREN);
			setState(1276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1265);
				((ConstructorHeaderContext)_localctx).typedBinding = typedBinding();
				((ConstructorHeaderContext)_localctx).params.add(((ConstructorHeaderContext)_localctx).typedBinding);
				setState(1270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1266);
						match(COMMA);
						setState(1267);
						((ConstructorHeaderContext)_localctx).typedBinding = typedBinding();
						((ConstructorHeaderContext)_localctx).params.add(((ConstructorHeaderContext)_localctx).typedBinding);
						}
						} 
					}
					setState(1272);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
				}
				setState(1274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1273);
					match(COMMA);
					}
				}

				}
			}

			setState(1278);
			match(RPAREN);
			setState(1280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Throws) {
				{
				setState(1279);
				((ConstructorHeaderContext)_localctx).thr = throws_();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclaratorContext extends ParserRuleContext {
		public TypeParametersContext tparams;
		public Token name;
		public TerminalNode LPAREN() { return getToken(JasperParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JasperParser.RPAREN, 0); }
		public TerminalNode Identifier() { return getToken(JasperParser.Identifier, 0); }
		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(JasperParser.COMMA, 0); }
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ConstructorDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterConstructorDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitConstructorDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitConstructorDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclaratorContext constructorDeclarator() throws RecognitionException {
		ConstructorDeclaratorContext _localctx = new ConstructorDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_constructorDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1282);
				((ConstructorDeclaratorContext)_localctx).tparams = typeParameters();
				}
			}

			setState(1285);
			((ConstructorDeclaratorContext)_localctx).name = match(Identifier);
			setState(1286);
			match(LPAREN);
			setState(1293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				{
				setState(1287);
				receiverParameter();
				}
				break;
			case 2:
				{
				setState(1288);
				formalParameters();
				setState(1289);
				match(COMMA);
				setState(1290);
				lastFormalParameter();
				}
				break;
			case 3:
				{
				setState(1292);
				lastFormalParameter();
				}
				break;
			}
			setState(1295);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JasperParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JasperParser.RBRACE, 0); }
		public ExplicitConstructorInvocationContext explicitConstructorInvocation() {
			return getRuleContext(ExplicitConstructorInvocationContext.class,0);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitConstructorBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitConstructorBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_constructorBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1297);
			match(LBRACE);
			setState(1299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				{
				setState(1298);
				explicitConstructorInvocation();
				}
				break;
			}
			setState(1304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1301);
					blockStatement();
					}
					} 
				}
				setState(1306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			}
			setState(1307);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExplicitConstructorInvocationContext extends ParserRuleContext {
		public TerminalNode This() { return getToken(JasperParser.This, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JasperParser.SEMI, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Super() { return getToken(JasperParser.Super, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JasperParser.DOT, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExplicitConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitConstructorInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterExplicitConstructorInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitExplicitConstructorInvocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitExplicitConstructorInvocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitConstructorInvocationContext explicitConstructorInvocation() throws RecognitionException {
		ExplicitConstructorInvocationContext _localctx = new ExplicitConstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_explicitConstructorInvocation);
		int _la;
		try {
			setState(1341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1309);
					typeArguments();
					}
				}

				setState(1312);
				match(This);
				setState(1313);
				arguments();
				setState(1314);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1316);
					typeArguments();
					}
				}

				setState(1319);
				match(Super);
				setState(1320);
				arguments();
				setState(1321);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1323);
				qualifiedName();
				setState(1324);
				match(DOT);
				setState(1326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1325);
					typeArguments();
					}
				}

				setState(1328);
				match(Super);
				setState(1329);
				arguments();
				setState(1330);
				match(SEMI);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1332);
				primary();
				setState(1333);
				match(DOT);
				setState(1335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1334);
					typeArguments();
					}
				}

				setState(1337);
				match(Super);
				setState(1338);
				arguments();
				setState(1339);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DestructorDeclarationContext extends ParserRuleContext {
		public TerminalNode Destructor() { return getToken(JasperParser.Destructor, 0); }
		public TerminalNode LPAREN() { return getToken(JasperParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JasperParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public DestructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterDestructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitDestructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitDestructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DestructorDeclarationContext destructorDeclaration() throws RecognitionException {
		DestructorDeclarationContext _localctx = new DestructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_destructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 74779944552321L) != 0) || _la==AT) {
				{
				{
				setState(1343);
				modifier();
				}
				}
				setState(1348);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1349);
			match(Destructor);
			setState(1350);
			match(LPAREN);
			setState(1351);
			match(RPAREN);
			setState(1352);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumDeclarationContext extends ParserRuleContext {
		public ModifierContext mods;
		public Token name;
		public SuperinterfacesContext sis;
		public EnumBodyContext body;
		public TerminalNode Enum() { return getToken(JasperParser.Enum, 0); }
		public TerminalNode Identifier() { return getToken(JasperParser.Identifier, 0); }
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 74779944552321L) != 0) || _la==AT) {
				{
				{
				setState(1354);
				((EnumDeclarationContext)_localctx).mods = modifier();
				}
				}
				setState(1359);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1360);
			match(Enum);
			setState(1361);
			((EnumDeclarationContext)_localctx).name = match(Identifier);
			setState(1363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Implements) {
				{
				setState(1362);
				((EnumDeclarationContext)_localctx).sis = superinterfaces();
				}
			}

			setState(1365);
			((EnumDeclarationContext)_localctx).body = enumBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JasperParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JasperParser.RBRACE, 0); }
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JasperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JasperParser.COMMA, i);
		}
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterEnumBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitEnumBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitEnumBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_enumBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1367);
			match(LBRACE);
			setState(1379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 74779944552321L) != 0) || _la==AT || _la==Identifier) {
				{
				setState(1368);
				enumConstant();
				setState(1373);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1369);
						match(COMMA);
						setState(1370);
						enumConstant();
						}
						} 
					}
					setState(1375);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
				}
				setState(1377);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
				case 1:
					{
					setState(1376);
					match(COMMA);
					}
					break;
				}
				}
			}

			setState(1382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1381);
				match(COMMA);
				}
			}

			setState(1385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1384);
				enumBodyDeclarations();
				}
			}

			setState(1387);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JasperParser.Identifier, 0); }
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitEnumConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitEnumConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 74779944552321L) != 0) || _la==AT) {
				{
				{
				setState(1389);
				modifier();
				}
				}
				setState(1394);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1395);
			match(Identifier);
			setState(1397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1396);
				arguments();
				}
			}

			setState(1400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(1399);
				classBody();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(JasperParser.SEMI, 0); }
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitEnumBodyDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitEnumBodyDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1402);
			match(SEMI);
			setState(1406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72325050040057854L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & -9214364287843942351L) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & 4330017L) != 0)) {
				{
				{
				setState(1403);
				classBodyDeclaration();
				}
				}
				setState(1408);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NormalInterfaceDeclarationContext extends ParserRuleContext {
		public ModifierContext mods;
		public Token name;
		public TypeParametersContext tparams;
		public ExtendsInterfacesContext exts;
		public InterfaceBodyContext body;
		public TerminalNode Interface() { return getToken(JasperParser.Interface, 0); }
		public TerminalNode Identifier() { return getToken(JasperParser.Identifier, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ExtendsInterfacesContext extendsInterfaces() {
			return getRuleContext(ExtendsInterfacesContext.class,0);
		}
		public NormalInterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalInterfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterNormalInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitNormalInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitNormalInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalInterfaceDeclarationContext normalInterfaceDeclaration() throws RecognitionException {
		NormalInterfaceDeclarationContext _localctx = new NormalInterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_normalInterfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 74779944552321L) != 0) || _la==AT) {
				{
				{
				setState(1409);
				((NormalInterfaceDeclarationContext)_localctx).mods = modifier();
				}
				}
				setState(1414);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1415);
			match(Interface);
			setState(1416);
			((NormalInterfaceDeclarationContext)_localctx).name = match(Identifier);
			setState(1418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1417);
				((NormalInterfaceDeclarationContext)_localctx).tparams = typeParameters();
				}
			}

			setState(1421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extends) {
				{
				setState(1420);
				((NormalInterfaceDeclarationContext)_localctx).exts = extendsInterfaces();
				}
			}

			setState(1423);
			((NormalInterfaceDeclarationContext)_localctx).body = interfaceBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExtendsInterfacesContext extends ParserRuleContext {
		public TerminalNode Extends() { return getToken(JasperParser.Extends, 0); }
		public List<TypePostfixContext> typePostfix() {
			return getRuleContexts(TypePostfixContext.class);
		}
		public TypePostfixContext typePostfix(int i) {
			return getRuleContext(TypePostfixContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JasperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JasperParser.COMMA, i);
		}
		public ExtendsInterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsInterfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterExtendsInterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitExtendsInterfaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitExtendsInterfaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendsInterfacesContext extendsInterfaces() throws RecognitionException {
		ExtendsInterfacesContext _localctx = new ExtendsInterfacesContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_extendsInterfaces);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1425);
			match(Extends);
			setState(1426);
			typePostfix();
			setState(1431);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1427);
					match(COMMA);
					setState(1428);
					typePostfix();
					}
					} 
				}
				setState(1433);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
			}
			setState(1435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1434);
				match(COMMA);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JasperParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JasperParser.RBRACE, 0); }
		public List<InterfaceMemberDeclarationContext> interfaceMemberDeclaration() {
			return getRuleContexts(InterfaceMemberDeclarationContext.class);
		}
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration(int i) {
			return getRuleContext(InterfaceMemberDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitInterfaceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1437);
			match(LBRACE);
			setState(1441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72321751505174526L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & -9214364287843942351L) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & 4330017L) != 0)) {
				{
				{
				setState(1438);
				interfaceMemberDeclaration();
				}
				}
				setState(1443);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1444);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
	 
		public InterfaceMemberDeclarationContext() { }
		public void copyFrom(InterfaceMemberDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceMemberAbstractMethodContext extends InterfaceMemberDeclarationContext {
		public InterfaceMethodDeclarationContext decl;
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceMemberAbstractMethodContext(InterfaceMemberDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterInterfaceMemberAbstractMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitInterfaceMemberAbstractMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitInterfaceMemberAbstractMethod(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceMemberConstContext extends InterfaceMemberDeclarationContext {
		public ConstantDeclarationContext decl;
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public InterfaceMemberConstContext(InterfaceMemberDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterInterfaceMemberConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitInterfaceMemberConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitInterfaceMemberConst(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceMemberPropertyContext extends InterfaceMemberDeclarationContext {
		public InterfacePropertyDeclarationContext decl;
		public InterfacePropertyDeclarationContext interfacePropertyDeclaration() {
			return getRuleContext(InterfacePropertyDeclarationContext.class,0);
		}
		public InterfaceMemberPropertyContext(InterfaceMemberDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterInterfaceMemberProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitInterfaceMemberProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitInterfaceMemberProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceMemberMethodContext extends InterfaceMemberDeclarationContext {
		public MethodDeclarationContext decl;
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public InterfaceMemberMethodContext(InterfaceMemberDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterInterfaceMemberMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitInterfaceMemberMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitInterfaceMemberMethod(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceMemberClassContext extends InterfaceMemberDeclarationContext {
		public NormalClassDeclarationContext decl;
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}
		public InterfaceMemberClassContext(InterfaceMemberDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterInterfaceMemberClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitInterfaceMemberClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitInterfaceMemberClass(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceMemberEmptyContext extends InterfaceMemberDeclarationContext {
		public TerminalNode SEMI() { return getToken(JasperParser.SEMI, 0); }
		public InterfaceMemberEmptyContext(InterfaceMemberDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterInterfaceMemberEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitInterfaceMemberEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitInterfaceMemberEmpty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceMemberInterfaceContext extends InterfaceMemberDeclarationContext {
		public NormalInterfaceDeclarationContext decl;
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public InterfaceMemberInterfaceContext(InterfaceMemberDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterInterfaceMemberInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitInterfaceMemberInterface(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitInterfaceMemberInterface(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceMemberAnnotationTypeContext extends InterfaceMemberDeclarationContext {
		public AnnotationTypeDeclarationContext decl;
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public InterfaceMemberAnnotationTypeContext(InterfaceMemberDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterInterfaceMemberAnnotationType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitInterfaceMemberAnnotationType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitInterfaceMemberAnnotationType(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceMemberEnumContext extends InterfaceMemberDeclarationContext {
		public EnumDeclarationContext decl;
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceMemberEnumContext(InterfaceMemberDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterInterfaceMemberEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitInterfaceMemberEnum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitInterfaceMemberEnum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_interfaceMemberDeclaration);
		try {
			setState(1455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				_localctx = new InterfaceMemberConstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1446);
				((InterfaceMemberConstContext)_localctx).decl = constantDeclaration();
				}
				break;
			case 2:
				_localctx = new InterfaceMemberPropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1447);
				((InterfaceMemberPropertyContext)_localctx).decl = interfacePropertyDeclaration();
				}
				break;
			case 3:
				_localctx = new InterfaceMemberMethodContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1448);
				((InterfaceMemberMethodContext)_localctx).decl = methodDeclaration();
				}
				break;
			case 4:
				_localctx = new InterfaceMemberAbstractMethodContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1449);
				((InterfaceMemberAbstractMethodContext)_localctx).decl = interfaceMethodDeclaration();
				}
				break;
			case 5:
				_localctx = new InterfaceMemberClassContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1450);
				((InterfaceMemberClassContext)_localctx).decl = normalClassDeclaration();
				}
				break;
			case 6:
				_localctx = new InterfaceMemberEnumContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1451);
				((InterfaceMemberEnumContext)_localctx).decl = enumDeclaration();
				}
				break;
			case 7:
				_localctx = new InterfaceMemberInterfaceContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1452);
				((InterfaceMemberInterfaceContext)_localctx).decl = normalInterfaceDeclaration();
				}
				break;
			case 8:
				_localctx = new InterfaceMemberAnnotationTypeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1453);
				((InterfaceMemberAnnotationTypeContext)_localctx).decl = annotationTypeDeclaration();
				}
				break;
			case 9:
				_localctx = new InterfaceMemberEmptyContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1454);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfacePropertyDeclarationContext extends ParserRuleContext {
		public InterfacePropertyHeaderContext header;
		public PropertyAccessorBlockContext body;
		public TerminalNode SEMI() { return getToken(JasperParser.SEMI, 0); }
		public InterfacePropertyHeaderContext interfacePropertyHeader() {
			return getRuleContext(InterfacePropertyHeaderContext.class,0);
		}
		public PropertyAccessorBlockContext propertyAccessorBlock() {
			return getRuleContext(PropertyAccessorBlockContext.class,0);
		}
		public InterfacePropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfacePropertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterInterfacePropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitInterfacePropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitInterfacePropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfacePropertyDeclarationContext interfacePropertyDeclaration() throws RecognitionException {
		InterfacePropertyDeclarationContext _localctx = new InterfacePropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_interfacePropertyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1457);
			((InterfacePropertyDeclarationContext)_localctx).header = interfacePropertyHeader();
			setState(1458);
			((InterfacePropertyDeclarationContext)_localctx).body = propertyAccessorBlock();
			setState(1459);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfacePropertyHeaderContext extends ParserRuleContext {
		public Token kind;
		public MaybeTypedBindingContext binding;
		public MaybeTypedBindingContext maybeTypedBinding() {
			return getRuleContext(MaybeTypedBindingContext.class,0);
		}
		public TerminalNode Var() { return getToken(JasperParser.Var, 0); }
		public TerminalNode Const() { return getToken(JasperParser.Const, 0); }
		public TerminalNode Pointer() { return getToken(JasperParser.Pointer, 0); }
		public InterfacePropertyHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfacePropertyHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterInterfacePropertyHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitInterfacePropertyHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitInterfacePropertyHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfacePropertyHeaderContext interfacePropertyHeader() throws RecognitionException {
		InterfacePropertyHeaderContext _localctx = new InterfacePropertyHeaderContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_interfacePropertyHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1461);
			((InterfacePropertyHeaderContext)_localctx).kind = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1879048192L) != 0)) ) {
				((InterfacePropertyHeaderContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1462);
			((InterfacePropertyHeaderContext)_localctx).binding = maybeTypedBinding();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantDeclarationContext extends ParserRuleContext {
		public ModifierContext mods;
		public VarDeclaratorContext varDeclarator;
		public List<VarDeclaratorContext> decls = new ArrayList<VarDeclaratorContext>();
		public TerminalNode Const() { return getToken(JasperParser.Const, 0); }
		public TerminalNode SEMI() { return getToken(JasperParser.SEMI, 0); }
		public List<VarDeclaratorContext> varDeclarator() {
			return getRuleContexts(VarDeclaratorContext.class);
		}
		public VarDeclaratorContext varDeclarator(int i) {
			return getRuleContext(VarDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JasperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JasperParser.COMMA, i);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterConstantDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitConstantDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitConstantDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclarationContext constantDeclaration() throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_constantDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 74779944552321L) != 0) || _la==AT) {
				{
				{
				setState(1464);
				((ConstantDeclarationContext)_localctx).mods = modifier();
				}
				}
				setState(1469);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1470);
			match(Const);
			setState(1471);
			((ConstantDeclarationContext)_localctx).varDeclarator = varDeclarator();
			((ConstantDeclarationContext)_localctx).decls.add(((ConstantDeclarationContext)_localctx).varDeclarator);
			setState(1476);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1472);
					match(COMMA);
					setState(1473);
					((ConstantDeclarationContext)_localctx).varDeclarator = varDeclarator();
					((ConstantDeclarationContext)_localctx).decls.add(((ConstantDeclarationContext)_localctx).varDeclarator);
					}
					} 
				}
				setState(1478);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			}
			setState(1480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1479);
				match(COMMA);
				}
			}

			setState(1482);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public ModifierContext mods;
		public MethodHeaderContext header;
		public MethodBodyContext body;
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitInterfaceMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitInterfaceMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_interfaceMethodDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1487);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1484);
					((InterfaceMethodDeclarationContext)_localctx).mods = modifier();
					}
					} 
				}
				setState(1489);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			}
			setState(1490);
			((InterfaceMethodDeclarationContext)_localctx).header = methodHeader();
			setState(1491);
			((InterfaceMethodDeclarationContext)_localctx).body = methodBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public ModifierContext mods;
		public Token name;
		public AnnotationTypeBodyContext body;
		public TerminalNode AT() { return getToken(JasperParser.AT, 0); }
		public TerminalNode Interface() { return getToken(JasperParser.Interface, 0); }
		public TerminalNode Identifier() { return getToken(JasperParser.Identifier, 0); }
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitAnnotationTypeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitAnnotationTypeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_annotationTypeDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1496);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1493);
					((AnnotationTypeDeclarationContext)_localctx).mods = modifier();
					}
					} 
				}
				setState(1498);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			}
			setState(1499);
			match(AT);
			setState(1500);
			match(Interface);
			setState(1501);
			((AnnotationTypeDeclarationContext)_localctx).name = match(Identifier);
			setState(1502);
			((AnnotationTypeDeclarationContext)_localctx).body = annotationTypeBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JasperParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JasperParser.RBRACE, 0); }
		public List<AnnotationTypeMemberDeclarationContext> annotationTypeMemberDeclaration() {
			return getRuleContexts(AnnotationTypeMemberDeclarationContext.class);
		}
		public AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration(int i) {
			return getRuleContext(AnnotationTypeMemberDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitAnnotationTypeBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitAnnotationTypeBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1504);
			match(LBRACE);
			setState(1508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 72321741573062654L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & -9214364287843942351L) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & 4329505L) != 0)) {
				{
				{
				setState(1505);
				annotationTypeMemberDeclaration();
				}
				}
				setState(1510);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1511);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationTypeMemberDeclarationContext extends ParserRuleContext {
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,0);
		}
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JasperParser.SEMI, 0); }
		public AnnotationTypeMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterAnnotationTypeMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitAnnotationTypeMemberDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitAnnotationTypeMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration() throws RecognitionException {
		AnnotationTypeMemberDeclarationContext _localctx = new AnnotationTypeMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_annotationTypeMemberDeclaration);
		try {
			setState(1524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1513);
				annotationTypeElementDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1514);
				constantDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1517);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1515);
					normalClassDeclaration();
					}
					break;
				case 2:
					{
					setState(1516);
					enumDeclaration();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1521);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1519);
					normalInterfaceDeclaration();
					}
					break;
				case 2:
					{
					setState(1520);
					annotationTypeDeclaration();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1523);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeOrPrimitiveContext extends ParserRuleContext {
		public TypeOrPrimitiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeOrPrimitive; }
	 
		public TypeOrPrimitiveContext() { }
		public void copyFrom(TypeOrPrimitiveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeOrPrimitivePrimitiveContext extends TypeOrPrimitiveContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeOrPrimitivePrimitiveContext(TypeOrPrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTypeOrPrimitivePrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTypeOrPrimitivePrimitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTypeOrPrimitivePrimitive(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeOrPrimitiveTypeContext extends TypeOrPrimitiveContext {
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public TypeOrPrimitiveTypeContext(TypeOrPrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTypeOrPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTypeOrPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTypeOrPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeOrPrimitiveContext typeOrPrimitive() throws RecognitionException {
		TypeOrPrimitiveContext _localctx = new TypeOrPrimitiveContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_typeOrPrimitive);
		try {
			setState(1528);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				_localctx = new TypeOrPrimitivePrimitiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1526);
				primitiveType();
				}
				break;
			case 2:
				_localctx = new TypeOrPrimitiveTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1527);
				typeExpr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public ModifierContext mods;
		public TypeOrPrimitiveContext ty;
		public Token name;
		public TerminalNode LPAREN() { return getToken(JasperParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JasperParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(JasperParser.SEMI, 0); }
		public TypeOrPrimitiveContext typeOrPrimitive() {
			return getRuleContext(TypeOrPrimitiveContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JasperParser.Identifier, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(JasperParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JasperParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JasperParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JasperParser.RBRACK, i);
		}
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitAnnotationTypeElementDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitAnnotationTypeElementDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_annotationTypeElementDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1533);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1530);
					((AnnotationTypeElementDeclarationContext)_localctx).mods = modifier();
					}
					} 
				}
				setState(1535);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,168,_ctx);
			}
			setState(1536);
			((AnnotationTypeElementDeclarationContext)_localctx).ty = typeOrPrimitive();
			setState(1537);
			((AnnotationTypeElementDeclarationContext)_localctx).name = match(Identifier);
			setState(1538);
			match(LPAREN);
			setState(1539);
			match(RPAREN);
			setState(1544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(1540);
				match(LBRACK);
				setState(1541);
				match(RBRACK);
				}
				}
				setState(1546);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Default) {
				{
				setState(1547);
				defaultValue();
				}
			}

			setState(1550);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionReturnTypeContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(JasperParser.COLON, 0); }
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public FunctionReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionReturnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterFunctionReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitFunctionReturnType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitFunctionReturnType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionReturnTypeContext functionReturnType() throws RecognitionException {
		FunctionReturnTypeContext _localctx = new FunctionReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_functionReturnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1552);
			match(COLON);
			setState(1553);
			typeExpr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ResultContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public TerminalNode Unit() { return getToken(JasperParser.Unit, 0); }
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitResult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitResult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_result);
		try {
			setState(1560);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1557);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
				case 1:
					{
					setState(1555);
					primitiveType();
					}
					break;
				case 2:
					{
					setState(1556);
					typeExpr();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1559);
				match(Unit);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FormalParametersContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JasperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JasperParser.COMMA, i);
		}
		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitFormalParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_formalParameters);
		try {
			int _alt;
			setState(1584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1562);
				formalParameter();
				setState(1567);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1563);
						match(COMMA);
						setState(1564);
						formalParameter();
						}
						} 
					}
					setState(1569);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
				}
				setState(1571);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1570);
					match(COMMA);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1573);
				receiverParameter();
				setState(1578);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1574);
						match(COMMA);
						setState(1575);
						formalParameter();
						}
						} 
					}
					setState(1580);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
				}
				setState(1582);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1581);
					match(COMMA);
					}
					break;
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class FormalParameterContext extends ParserRuleContext {
		public TypedBindingContext typedBinding() {
			return getRuleContext(TypedBindingContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitFormalParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 74779944552321L) != 0) || _la==AT) {
				{
				{
				setState(1586);
				modifier();
				}
				}
				setState(1591);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1592);
			typedBinding();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LastFormalParameterContext extends ParserRuleContext {
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
	 
		public LastFormalParameterContext() { }
		public void copyFrom(LastFormalParameterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LastFormalVarargsContext extends LastFormalParameterContext {
		public ModifierContext mods;
		public TypeOrPrimitiveContext typeRef;
		public AnnotationContext annotation;
		public List<AnnotationContext> annos = new ArrayList<AnnotationContext>();
		public VariableDeclaratorIdContext varId;
		public TerminalNode ELLIPSIS() { return getToken(JasperParser.ELLIPSIS, 0); }
		public TypeOrPrimitiveContext typeOrPrimitive() {
			return getRuleContext(TypeOrPrimitiveContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public LastFormalVarargsContext(LastFormalParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterLastFormalVarargs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitLastFormalVarargs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitLastFormalVarargs(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LastFormalParamContext extends LastFormalParameterContext {
		public FormalParameterContext p;
		public FormalParameterContext formalParameter() {
			return getRuleContext(FormalParameterContext.class,0);
		}
		public LastFormalParamContext(LastFormalParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterLastFormalParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitLastFormalParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitLastFormalParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_lastFormalParameter);
		int _la;
		try {
			int _alt;
			setState(1611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				_localctx = new LastFormalVarargsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1597);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1594);
						((LastFormalVarargsContext)_localctx).mods = modifier();
						}
						} 
					}
					setState(1599);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
				}
				setState(1600);
				((LastFormalVarargsContext)_localctx).typeRef = typeOrPrimitive();
				setState(1604);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1601);
					((LastFormalVarargsContext)_localctx).annotation = annotation();
					((LastFormalVarargsContext)_localctx).annos.add(((LastFormalVarargsContext)_localctx).annotation);
					}
					}
					setState(1606);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1607);
				match(ELLIPSIS);
				setState(1608);
				((LastFormalVarargsContext)_localctx).varId = variableDeclaratorId();
				}
				break;
			case 2:
				_localctx = new LastFormalParamContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1610);
				((LastFormalParamContext)_localctx).p = formalParameter();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReceiverParameterContext extends ParserRuleContext {
		public AnnotationContext annotation;
		public List<AnnotationContext> annos = new ArrayList<AnnotationContext>();
		public TypeOrPrimitiveContext typeRef;
		public Token qualifier;
		public TerminalNode This() { return getToken(JasperParser.This, 0); }
		public TypeOrPrimitiveContext typeOrPrimitive() {
			return getRuleContext(TypeOrPrimitiveContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JasperParser.DOT, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(JasperParser.Identifier, 0); }
		public ReceiverParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterReceiverParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitReceiverParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitReceiverParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReceiverParameterContext receiverParameter() throws RecognitionException {
		ReceiverParameterContext _localctx = new ReceiverParameterContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_receiverParameter);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1616);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1613);
					((ReceiverParameterContext)_localctx).annotation = annotation();
					((ReceiverParameterContext)_localctx).annos.add(((ReceiverParameterContext)_localctx).annotation);
					}
					} 
				}
				setState(1618);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
			}
			setState(1619);
			((ReceiverParameterContext)_localctx).typeRef = typeOrPrimitive();
			setState(1622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1620);
				((ReceiverParameterContext)_localctx).qualifier = match(Identifier);
				setState(1621);
				match(DOT);
				}
			}

			setState(1624);
			match(This);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Throws_Context extends ParserRuleContext {
		public TerminalNode Throws() { return getToken(JasperParser.Throws, 0); }
		public List<ExceptionTypeContext> exceptionType() {
			return getRuleContexts(ExceptionTypeContext.class);
		}
		public ExceptionTypeContext exceptionType(int i) {
			return getRuleContext(ExceptionTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JasperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JasperParser.COMMA, i);
		}
		public Throws_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throws_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterThrows_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitThrows_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitThrows_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Throws_Context throws_() throws RecognitionException {
		Throws_Context _localctx = new Throws_Context(_ctx, getState());
		enterRule(_localctx, 216, RULE_throws_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1626);
			match(Throws);
			{
			setState(1627);
			exceptionType();
			setState(1632);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1628);
					match(COMMA);
					setState(1629);
					exceptionType();
					}
					} 
				}
				setState(1634);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			}
			setState(1636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1635);
				match(COMMA);
				}
			}

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

	@SuppressWarnings("CheckReturnValue")
	public static class ExceptionTypeContext extends ParserRuleContext {
		public TypePostfixContext typePostfix() {
			return getRuleContext(TypePostfixContext.class,0);
		}
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public ExceptionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterExceptionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitExceptionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitExceptionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptionTypeContext exceptionType() throws RecognitionException {
		ExceptionTypeContext _localctx = new ExceptionTypeContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_exceptionType);
		try {
			setState(1640);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1638);
				typePostfix();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1639);
				typeExpr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JasperParser.SEMI, 0); }
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitLocalVariableDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitLocalVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1642);
			localVariableDeclaration();
			setState(1643);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public ModifierContext mods;
		public Token kind;
		public VarDeclaratorContext varDeclarator;
		public List<VarDeclaratorContext> decls = new ArrayList<VarDeclaratorContext>();
		public List<VarDeclaratorContext> varDeclarator() {
			return getRuleContexts(VarDeclaratorContext.class);
		}
		public VarDeclaratorContext varDeclarator(int i) {
			return getRuleContext(VarDeclaratorContext.class,i);
		}
		public TerminalNode Var() { return getToken(JasperParser.Var, 0); }
		public TerminalNode Const() { return getToken(JasperParser.Const, 0); }
		public TerminalNode Pointer() { return getToken(JasperParser.Pointer, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JasperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JasperParser.COMMA, i);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitLocalVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_localVariableDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 74779944552321L) != 0) || _la==AT) {
				{
				{
				setState(1645);
				((LocalVariableDeclarationContext)_localctx).mods = modifier();
				}
				}
				setState(1650);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1651);
			((LocalVariableDeclarationContext)_localctx).kind = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1879048192L) != 0)) ) {
				((LocalVariableDeclarationContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1652);
			((LocalVariableDeclarationContext)_localctx).varDeclarator = varDeclarator();
			((LocalVariableDeclarationContext)_localctx).decls.add(((LocalVariableDeclarationContext)_localctx).varDeclarator);
			setState(1657);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1653);
					match(COMMA);
					setState(1654);
					((LocalVariableDeclarationContext)_localctx).varDeclarator = varDeclarator();
					((LocalVariableDeclarationContext)_localctx).decls.add(((LocalVariableDeclarationContext)_localctx).varDeclarator);
					}
					} 
				}
				setState(1659);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
			}
			setState(1661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1660);
				match(COMMA);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclaratorContext extends ParserRuleContext {
		public MaybeTypedBindingContext maybeTypedBinding() {
			return getRuleContext(MaybeTypedBindingContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JasperParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterVarDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitVarDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitVarDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclaratorContext varDeclarator() throws RecognitionException {
		VarDeclaratorContext _localctx = new VarDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_varDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1663);
			maybeTypedBinding();
			setState(1666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1664);
				match(ASSIGN);
				setState(1665);
				expression();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(JasperParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1668);
			variableDeclaratorId();
			setState(1671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1669);
				match(ASSIGN);
				setState(1670);
				variableInitializer();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JasperParser.Identifier, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(JasperParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JasperParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JasperParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JasperParser.RBRACK, i);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1673);
			match(Identifier);
			setState(1678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(1674);
				match(LBRACK);
				setState(1675);
				match(RBRACK);
				}
				}
				setState(1680);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableInitializerContext extends ParserRuleContext {
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
	 
		public VariableInitializerContext() { }
		public void copyFrom(VariableInitializerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableInitializerArrayContext extends VariableInitializerContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public VariableInitializerArrayContext(VariableInitializerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterVariableInitializerArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitVariableInitializerArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitVariableInitializerArray(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableInitializerExpressionContext extends VariableInitializerContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerExpressionContext(VariableInitializerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterVariableInitializerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitVariableInitializerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitVariableInitializerExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_variableInitializer);
		try {
			setState(1683);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				_localctx = new VariableInitializerExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1681);
				expression();
				}
				break;
			case 2:
				_localctx = new VariableInitializerArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1682);
				arrayInitializer();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MaybeTypedBindingContext extends ParserRuleContext {
		public Token name;
		public TypeExprContext typeRef;
		public TerminalNode Identifier() { return getToken(JasperParser.Identifier, 0); }
		public TerminalNode COLON() { return getToken(JasperParser.COLON, 0); }
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public MaybeTypedBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maybeTypedBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterMaybeTypedBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitMaybeTypedBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitMaybeTypedBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaybeTypedBindingContext maybeTypedBinding() throws RecognitionException {
		MaybeTypedBindingContext _localctx = new MaybeTypedBindingContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_maybeTypedBinding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1685);
			((MaybeTypedBindingContext)_localctx).name = match(Identifier);
			setState(1688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1686);
				match(COLON);
				setState(1687);
				((MaybeTypedBindingContext)_localctx).typeRef = typeExpr();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypedBindingContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JasperParser.Identifier, 0); }
		public TerminalNode COLON() { return getToken(JasperParser.COLON, 0); }
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public TypedBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTypedBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTypedBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTypedBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedBindingContext typedBinding() throws RecognitionException {
		TypedBindingContext _localctx = new TypedBindingContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_typedBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1690);
			match(Identifier);
			setState(1691);
			match(COLON);
			setState(1692);
			typeExpr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CatchBindingContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JasperParser.Identifier, 0); }
		public TerminalNode COLON() { return getToken(JasperParser.COLON, 0); }
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public CatchBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterCatchBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitCatchBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitCatchBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchBindingContext catchBinding() throws RecognitionException {
		CatchBindingContext _localctx = new CatchBindingContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_catchBinding);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1694);
			match(Identifier);
			setState(1697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1695);
				match(COLON);
				setState(1696);
				catchType();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class PatternContext extends ParserRuleContext {
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
	 
		public PatternContext() { }
		public void copyFrom(PatternContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PatternRootContext extends PatternContext {
		public PatternOrContext patternOr() {
			return getRuleContext(PatternOrContext.class,0);
		}
		public PatternRootContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterPatternRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitPatternRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitPatternRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_pattern);
		try {
			_localctx = new PatternRootContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1699);
			patternOr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PatternOrContext extends ParserRuleContext {
		public PatternOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternOr; }
	 
		public PatternOrContext() { }
		public void copyFrom(PatternOrContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PatternOrChainContext extends PatternOrContext {
		public List<PatternAndContext> patternAnd() {
			return getRuleContexts(PatternAndContext.class);
		}
		public PatternAndContext patternAnd(int i) {
			return getRuleContext(PatternAndContext.class,i);
		}
		public List<SoftOrContext> softOr() {
			return getRuleContexts(SoftOrContext.class);
		}
		public SoftOrContext softOr(int i) {
			return getRuleContext(SoftOrContext.class,i);
		}
		public PatternOrChainContext(PatternOrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterPatternOrChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitPatternOrChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitPatternOrChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternOrContext patternOr() throws RecognitionException {
		PatternOrContext _localctx = new PatternOrContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_patternOr);
		try {
			int _alt;
			_localctx = new PatternOrChainContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1701);
			patternAnd();
			setState(1707);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1702);
					softOr();
					setState(1703);
					patternAnd();
					}
					} 
				}
				setState(1709);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PatternAndContext extends ParserRuleContext {
		public PatternAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternAnd; }
	 
		public PatternAndContext() { }
		public void copyFrom(PatternAndContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PatternAndChainContext extends PatternAndContext {
		public List<PatternUnaryContext> patternUnary() {
			return getRuleContexts(PatternUnaryContext.class);
		}
		public PatternUnaryContext patternUnary(int i) {
			return getRuleContext(PatternUnaryContext.class,i);
		}
		public List<SoftAndContext> softAnd() {
			return getRuleContexts(SoftAndContext.class);
		}
		public SoftAndContext softAnd(int i) {
			return getRuleContext(SoftAndContext.class,i);
		}
		public PatternAndChainContext(PatternAndContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterPatternAndChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitPatternAndChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitPatternAndChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternAndContext patternAnd() throws RecognitionException {
		PatternAndContext _localctx = new PatternAndContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_patternAnd);
		try {
			int _alt;
			_localctx = new PatternAndChainContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1710);
			patternUnary();
			setState(1716);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1711);
					softAnd();
					setState(1712);
					patternUnary();
					}
					} 
				}
				setState(1718);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PatternUnaryContext extends ParserRuleContext {
		public PatternUnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternUnary; }
	 
		public PatternUnaryContext() { }
		public void copyFrom(PatternUnaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PatternUnaryNotContext extends PatternUnaryContext {
		public SoftNotContext softNot() {
			return getRuleContext(SoftNotContext.class,0);
		}
		public PatternUnaryContext patternUnary() {
			return getRuleContext(PatternUnaryContext.class,0);
		}
		public PatternUnaryNotContext(PatternUnaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterPatternUnaryNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitPatternUnaryNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitPatternUnaryNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PatternUnaryBaseContext extends PatternUnaryContext {
		public PatternPrimaryContext patternPrimary() {
			return getRuleContext(PatternPrimaryContext.class,0);
		}
		public PatternUnaryBaseContext(PatternUnaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterPatternUnaryBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitPatternUnaryBase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitPatternUnaryBase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternUnaryContext patternUnary() throws RecognitionException {
		PatternUnaryContext _localctx = new PatternUnaryContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_patternUnary);
		try {
			setState(1723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				_localctx = new PatternUnaryNotContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1719);
				softNot();
				setState(1720);
				patternUnary();
				}
				break;
			case 2:
				_localctx = new PatternUnaryBaseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1722);
				patternPrimary();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PatternPrimaryContext extends ParserRuleContext {
		public PatternPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternPrimary; }
	 
		public PatternPrimaryContext() { }
		public void copyFrom(PatternPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PatternPrimaryAtomContext extends PatternPrimaryContext {
		public PrimaryPatternContext primaryPattern() {
			return getRuleContext(PrimaryPatternContext.class,0);
		}
		public PatternPrimaryAtomContext(PatternPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterPatternPrimaryAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitPatternPrimaryAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitPatternPrimaryAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PatternPrimaryParenContext extends PatternPrimaryContext {
		public TerminalNode LPAREN() { return getToken(JasperParser.LPAREN, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JasperParser.RPAREN, 0); }
		public PatternPrimaryParenContext(PatternPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterPatternPrimaryParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitPatternPrimaryParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitPatternPrimaryParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternPrimaryContext patternPrimary() throws RecognitionException {
		PatternPrimaryContext _localctx = new PatternPrimaryContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_patternPrimary);
		try {
			setState(1730);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				_localctx = new PatternPrimaryAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1725);
				primaryPattern();
				}
				break;
			case 2:
				_localctx = new PatternPrimaryParenContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1726);
				match(LPAREN);
				setState(1727);
				pattern();
				setState(1728);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryPatternContext extends ParserRuleContext {
		public TerminalNode Underscore() { return getToken(JasperParser.Underscore, 0); }
		public BindingOrNamePatternContext bindingOrNamePattern() {
			return getRuleContext(BindingOrNamePatternContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrimaryPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterPrimaryPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitPrimaryPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitPrimaryPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryPatternContext primaryPattern() throws RecognitionException {
		PrimaryPatternContext _localctx = new PrimaryPatternContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_primaryPattern);
		try {
			setState(1735);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1732);
				match(Underscore);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1733);
				bindingOrNamePattern();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1734);
				expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BindingOrNamePatternContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JasperParser.Identifier, 0); }
		public BindingOrNamePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindingOrNamePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterBindingOrNamePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitBindingOrNamePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitBindingOrNamePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindingOrNamePatternContext bindingOrNamePattern() throws RecognitionException {
		BindingOrNamePatternContext _localctx = new BindingOrNamePatternContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_bindingOrNamePattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1737);
			match(Identifier);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BindingPatternContext extends ParserRuleContext {
		public BindingAtomContext bindingAtom() {
			return getRuleContext(BindingAtomContext.class,0);
		}
		public BindingTupleContext bindingTuple() {
			return getRuleContext(BindingTupleContext.class,0);
		}
		public BindingPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindingPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterBindingPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitBindingPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitBindingPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindingPatternContext bindingPattern() throws RecognitionException {
		BindingPatternContext _localctx = new BindingPatternContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_bindingPattern);
		try {
			setState(1741);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Underscore:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1739);
				bindingAtom();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1740);
				bindingTuple();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BindingPatternNoTypeContext extends ParserRuleContext {
		public BindingNoTypeAtomContext bindingNoTypeAtom() {
			return getRuleContext(BindingNoTypeAtomContext.class,0);
		}
		public BindingNoTypeTupleContext bindingNoTypeTuple() {
			return getRuleContext(BindingNoTypeTupleContext.class,0);
		}
		public BindingPatternNoTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindingPatternNoType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterBindingPatternNoType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitBindingPatternNoType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitBindingPatternNoType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindingPatternNoTypeContext bindingPatternNoType() throws RecognitionException {
		BindingPatternNoTypeContext _localctx = new BindingPatternNoTypeContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_bindingPatternNoType);
		try {
			setState(1745);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Underscore:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1743);
				bindingNoTypeAtom();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1744);
				bindingNoTypeTuple();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BindingAtomContext extends ParserRuleContext {
		public TerminalNode Underscore() { return getToken(JasperParser.Underscore, 0); }
		public MaybeTypedBindingContext maybeTypedBinding() {
			return getRuleContext(MaybeTypedBindingContext.class,0);
		}
		public BindingAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindingAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterBindingAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitBindingAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitBindingAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindingAtomContext bindingAtom() throws RecognitionException {
		BindingAtomContext _localctx = new BindingAtomContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_bindingAtom);
		try {
			setState(1749);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Underscore:
				enterOuterAlt(_localctx, 1);
				{
				setState(1747);
				match(Underscore);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1748);
				maybeTypedBinding();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BindingTupleContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JasperParser.LPAREN, 0); }
		public List<BindingPatternContext> bindingPattern() {
			return getRuleContexts(BindingPatternContext.class);
		}
		public BindingPatternContext bindingPattern(int i) {
			return getRuleContext(BindingPatternContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(JasperParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JasperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JasperParser.COMMA, i);
		}
		public BindingTupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindingTuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterBindingTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitBindingTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitBindingTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindingTupleContext bindingTuple() throws RecognitionException {
		BindingTupleContext _localctx = new BindingTupleContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_bindingTuple);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1751);
			match(LPAREN);
			setState(1752);
			bindingPattern();
			setState(1755); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1753);
					match(COMMA);
					setState(1754);
					bindingPattern();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1757); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1760);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1759);
				match(COMMA);
				}
			}

			setState(1762);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BindingNoTypeAtomContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JasperParser.Identifier, 0); }
		public TerminalNode Underscore() { return getToken(JasperParser.Underscore, 0); }
		public BindingNoTypeAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindingNoTypeAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterBindingNoTypeAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitBindingNoTypeAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitBindingNoTypeAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindingNoTypeAtomContext bindingNoTypeAtom() throws RecognitionException {
		BindingNoTypeAtomContext _localctx = new BindingNoTypeAtomContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_bindingNoTypeAtom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1764);
			_la = _input.LA(1);
			if ( !(_la==Underscore || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BindingNoTypeTupleContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JasperParser.LPAREN, 0); }
		public List<BindingPatternNoTypeContext> bindingPatternNoType() {
			return getRuleContexts(BindingPatternNoTypeContext.class);
		}
		public BindingPatternNoTypeContext bindingPatternNoType(int i) {
			return getRuleContext(BindingPatternNoTypeContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(JasperParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JasperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JasperParser.COMMA, i);
		}
		public BindingNoTypeTupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindingNoTypeTuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterBindingNoTypeTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitBindingNoTypeTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitBindingNoTypeTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BindingNoTypeTupleContext bindingNoTypeTuple() throws RecognitionException {
		BindingNoTypeTupleContext _localctx = new BindingNoTypeTupleContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_bindingNoTypeTuple);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1766);
			match(LPAREN);
			setState(1767);
			bindingPatternNoType();
			setState(1770); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1768);
					match(COMMA);
					setState(1769);
					bindingPatternNoType();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1772); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1774);
				match(COMMA);
				}
			}

			setState(1777);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForInAssignPatternContext extends ParserRuleContext {
		public BindingPatternNoTypeContext bindingPatternNoType() {
			return getRuleContext(BindingPatternNoTypeContext.class,0);
		}
		public ForInAssignPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInAssignPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterForInAssignPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitForInAssignPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitForInAssignPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInAssignPatternContext forInAssignPattern() throws RecognitionException {
		ForInAssignPatternContext _localctx = new ForInAssignPatternContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_forInAssignPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1779);
			bindingPatternNoType();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForInAssignTupleContext extends ParserRuleContext {
		public BindingNoTypeTupleContext bindingNoTypeTuple() {
			return getRuleContext(BindingNoTypeTupleContext.class,0);
		}
		public ForInAssignTupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInAssignTuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterForInAssignTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitForInAssignTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitForInAssignTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInAssignTupleContext forInAssignTuple() throws RecognitionException {
		ForInAssignTupleContext _localctx = new ForInAssignTupleContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_forInAssignTuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1781);
			bindingNoTypeTuple();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForInAssignAtomContext extends ParserRuleContext {
		public BindingNoTypeAtomContext bindingNoTypeAtom() {
			return getRuleContext(BindingNoTypeAtomContext.class,0);
		}
		public ForInAssignAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInAssignAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterForInAssignAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitForInAssignAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitForInAssignAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInAssignAtomContext forInAssignAtom() throws RecognitionException {
		ForInAssignAtomContext _localctx = new ForInAssignAtomContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_forInAssignAtom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1783);
			bindingNoTypeAtom();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JasperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JasperParser.COMMA, i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_exprList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1785);
			expression();
			setState(1790);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1786);
					match(COMMA);
					setState(1787);
					expression();
					}
					} 
				}
				setState(1792);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
			}
			setState(1794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1793);
				match(COMMA);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(JasperParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JasperParser.RPAREN, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_arguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1796);
			match(LPAREN);
			setState(1798);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(1797);
				exprList();
				}
				break;
			}
			setState(1800);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	 
		public PrimaryContext() { }
		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryMethodReferenceContext extends PrimaryContext {
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public PrimaryMethodReferenceContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterPrimaryMethodReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitPrimaryMethodReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitPrimaryMethodReference(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryChainContext extends PrimaryContext {
		public PrimaryAtomContext primaryAtom() {
			return getRuleContext(PrimaryAtomContext.class,0);
		}
		public List<PrimarySuffixContext> primarySuffix() {
			return getRuleContexts(PrimarySuffixContext.class);
		}
		public PrimarySuffixContext primarySuffix(int i) {
			return getRuleContext(PrimarySuffixContext.class,i);
		}
		public PrimaryChainContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterPrimaryChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitPrimaryChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitPrimaryChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_primary);
		try {
			int _alt;
			setState(1810);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				_localctx = new PrimaryMethodReferenceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1802);
				methodReference();
				}
				break;
			case 2:
				_localctx = new PrimaryChainContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1803);
				primaryAtom();
				setState(1807);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1804);
						primarySuffix();
						}
						} 
					}
					setState(1809);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimarySuffixContext extends ParserRuleContext {
		public PrimarySuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primarySuffix; }
	 
		public PrimarySuffixContext() { }
		public void copyFrom(PrimarySuffixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimarySuffixCallContext extends PrimarySuffixContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public PrimarySuffixCallContext(PrimarySuffixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterPrimarySuffixCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitPrimarySuffixCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitPrimarySuffixCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimarySuffixNewAfterDotContext extends PrimarySuffixContext {
		public ClassInstanceCreationExpressionAfterDotContext classInstanceCreationExpressionAfterDot() {
			return getRuleContext(ClassInstanceCreationExpressionAfterDotContext.class,0);
		}
		public PrimarySuffixNewAfterDotContext(PrimarySuffixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterPrimarySuffixNewAfterDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitPrimarySuffixNewAfterDot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitPrimarySuffixNewAfterDot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimarySuffixDotContext extends PrimarySuffixContext {
		public TerminalNode DOT() { return getToken(JasperParser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(JasperParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public PrimarySuffixDotContext(PrimarySuffixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterPrimarySuffixDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitPrimarySuffixDot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitPrimarySuffixDot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimarySuffixIndexContext extends PrimarySuffixContext {
		public TerminalNode LBRACK() { return getToken(JasperParser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(JasperParser.RBRACK, 0); }
		public PrimarySuffixIndexContext(PrimarySuffixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterPrimarySuffixIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitPrimarySuffixIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitPrimarySuffixIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimarySuffixContext primarySuffix() throws RecognitionException {
		PrimarySuffixContext _localctx = new PrimarySuffixContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_primarySuffix);
		int _la;
		try {
			setState(1826);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				_localctx = new PrimarySuffixCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1812);
				arguments();
				}
				break;
			case 2:
				_localctx = new PrimarySuffixDotContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1813);
				match(DOT);
				setState(1815);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1814);
					typeArguments();
					}
				}

				setState(1817);
				match(Identifier);
				setState(1819);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
				case 1:
					{
					setState(1818);
					arguments();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new PrimarySuffixIndexContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1821);
				match(LBRACK);
				setState(1822);
				expression();
				setState(1823);
				match(RBRACK);
				}
				break;
			case 4:
				_localctx = new PrimarySuffixNewAfterDotContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1825);
				classInstanceCreationExpressionAfterDot();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryAtomContext extends ParserRuleContext {
		public PrimaryAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryAtom; }
	 
		public PrimaryAtomContext() { }
		public void copyFrom(PrimaryAtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryAtomTypeSuperContext extends PrimaryAtomContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JasperParser.DOT, 0); }
		public TerminalNode Super() { return getToken(JasperParser.Super, 0); }
		public PrimaryAtomTypeSuperContext(PrimaryAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterPrimaryAtomTypeSuper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitPrimaryAtomTypeSuper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitPrimaryAtomTypeSuper(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryAtomNameContext extends PrimaryAtomContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public PrimaryAtomNameContext(PrimaryAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterPrimaryAtomName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitPrimaryAtomName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitPrimaryAtomName(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryAtomSuperContext extends PrimaryAtomContext {
		public TerminalNode Super() { return getToken(JasperParser.Super, 0); }
		public PrimaryAtomSuperContext(PrimaryAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterPrimaryAtomSuper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitPrimaryAtomSuper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitPrimaryAtomSuper(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryAtomTypeThisContext extends PrimaryAtomContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JasperParser.DOT, 0); }
		public TerminalNode This() { return getToken(JasperParser.This, 0); }
		public PrimaryAtomTypeThisContext(PrimaryAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterPrimaryAtomTypeThis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitPrimaryAtomTypeThis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitPrimaryAtomTypeThis(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryAtomThisContext extends PrimaryAtomContext {
		public TerminalNode This() { return getToken(JasperParser.This, 0); }
		public PrimaryAtomThisContext(PrimaryAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterPrimaryAtomThis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitPrimaryAtomThis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitPrimaryAtomThis(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryAtomNewContext extends PrimaryAtomContext {
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public PrimaryAtomNewContext(PrimaryAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterPrimaryAtomNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitPrimaryAtomNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitPrimaryAtomNew(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryAtomArrayCreationContext extends PrimaryAtomContext {
		public ArrayCreationExpressionContext arrayCreationExpression() {
			return getRuleContext(ArrayCreationExpressionContext.class,0);
		}
		public PrimaryAtomArrayCreationContext(PrimaryAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterPrimaryAtomArrayCreation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitPrimaryAtomArrayCreation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitPrimaryAtomArrayCreation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryAtomClassLiteralContext extends PrimaryAtomContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JasperParser.DOT, 0); }
		public TerminalNode Class() { return getToken(JasperParser.Class, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(JasperParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JasperParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JasperParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JasperParser.RBRACK, i);
		}
		public PrimaryAtomClassLiteralContext(PrimaryAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterPrimaryAtomClassLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitPrimaryAtomClassLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitPrimaryAtomClassLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryAtomUnitClassLiteralContext extends PrimaryAtomContext {
		public TerminalNode Unit() { return getToken(JasperParser.Unit, 0); }
		public TerminalNode DOT() { return getToken(JasperParser.DOT, 0); }
		public TerminalNode Class() { return getToken(JasperParser.Class, 0); }
		public PrimaryAtomUnitClassLiteralContext(PrimaryAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterPrimaryAtomUnitClassLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitPrimaryAtomUnitClassLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitPrimaryAtomUnitClassLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryAtomParenContext extends PrimaryAtomContext {
		public TerminalNode LPAREN() { return getToken(JasperParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JasperParser.RPAREN, 0); }
		public PrimaryAtomParenContext(PrimaryAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterPrimaryAtomParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitPrimaryAtomParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitPrimaryAtomParen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryAtomLiteralContext extends PrimaryAtomContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PrimaryAtomLiteralContext(PrimaryAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterPrimaryAtomLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitPrimaryAtomLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitPrimaryAtomLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryAtomPrimaryClassLiteralContext extends PrimaryAtomContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JasperParser.DOT, 0); }
		public TerminalNode Class() { return getToken(JasperParser.Class, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(JasperParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JasperParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JasperParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JasperParser.RBRACK, i);
		}
		public PrimaryAtomPrimaryClassLiteralContext(PrimaryAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterPrimaryAtomPrimaryClassLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitPrimaryAtomPrimaryClassLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitPrimaryAtomPrimaryClassLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryAtomContext primaryAtom() throws RecognitionException {
		PrimaryAtomContext _localctx = new PrimaryAtomContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_primaryAtom);
		int _la;
		try {
			setState(1871);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				_localctx = new PrimaryAtomLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1828);
				literal();
				}
				break;
			case 2:
				_localctx = new PrimaryAtomClassLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1829);
				qualifiedName();
				setState(1834);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1830);
					match(LBRACK);
					setState(1831);
					match(RBRACK);
					}
					}
					setState(1836);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1837);
				match(DOT);
				setState(1838);
				match(Class);
				}
				break;
			case 3:
				_localctx = new PrimaryAtomPrimaryClassLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1840);
				primitiveType();
				setState(1845);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1841);
					match(LBRACK);
					setState(1842);
					match(RBRACK);
					}
					}
					setState(1847);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1848);
				match(DOT);
				setState(1849);
				match(Class);
				}
				break;
			case 4:
				_localctx = new PrimaryAtomUnitClassLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1851);
				match(Unit);
				setState(1852);
				match(DOT);
				setState(1853);
				match(Class);
				}
				break;
			case 5:
				_localctx = new PrimaryAtomThisContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1854);
				match(This);
				}
				break;
			case 6:
				_localctx = new PrimaryAtomTypeThisContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1855);
				qualifiedName();
				setState(1856);
				match(DOT);
				setState(1857);
				match(This);
				}
				break;
			case 7:
				_localctx = new PrimaryAtomParenContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1859);
				match(LPAREN);
				setState(1860);
				expression();
				setState(1861);
				match(RPAREN);
				}
				break;
			case 8:
				_localctx = new PrimaryAtomNewContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1863);
				classInstanceCreationExpression();
				}
				break;
			case 9:
				_localctx = new PrimaryAtomArrayCreationContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1864);
				arrayCreationExpression();
				}
				break;
			case 10:
				_localctx = new PrimaryAtomNameContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1865);
				qualifiedName();
				}
				break;
			case 11:
				_localctx = new PrimaryAtomSuperContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(1866);
				match(Super);
				}
				break;
			case 12:
				_localctx = new PrimaryAtomTypeSuperContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(1867);
				qualifiedName();
				setState(1868);
				match(DOT);
				setState(1869);
				match(Super);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PostfixExpressionContext extends ParserRuleContext {
		public PostfixBaseContext postfixBase() {
			return getRuleContext(PostfixBaseContext.class,0);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1873);
			postfixBase();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PostfixBaseContext extends ParserRuleContext {
		public PostfixBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixBase; }
	 
		public PostfixBaseContext() { }
		public void copyFrom(PostfixBaseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostfixBasePrimaryContext extends PostfixBaseContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public PostfixBasePrimaryContext(PostfixBaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterPostfixBasePrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitPostfixBasePrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitPostfixBasePrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixBaseContext postfixBase() throws RecognitionException {
		PostfixBaseContext _localctx = new PostfixBaseContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_postfixBase);
		try {
			_localctx = new PostfixBasePrimaryContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1875);
			primary();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementExpressionContext extends ParserRuleContext {
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
	 
		public StatementExpressionContext() { }
		public void copyFrom(StatementExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementExpressionGoContext extends StatementExpressionContext {
		public GoExpressionContext goExpression() {
			return getRuleContext(GoExpressionContext.class,0);
		}
		public StatementExpressionGoContext(StatementExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterStatementExpressionGo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitStatementExpressionGo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitStatementExpressionGo(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementExpressionPostIncrementContext extends StatementExpressionContext {
		public LeftHandSideContext leftHandSide() {
			return getRuleContext(LeftHandSideContext.class,0);
		}
		public TerminalNode PLUS_PLUS() { return getToken(JasperParser.PLUS_PLUS, 0); }
		public StatementExpressionPostIncrementContext(StatementExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterStatementExpressionPostIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitStatementExpressionPostIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitStatementExpressionPostIncrement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementExpressionAnyContext extends StatementExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionAnyContext(StatementExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterStatementExpressionAny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitStatementExpressionAny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitStatementExpressionAny(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_statementExpression);
		try {
			setState(1882);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				_localctx = new StatementExpressionPostIncrementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1877);
				leftHandSide();
				setState(1878);
				match(PLUS_PLUS);
				}
				break;
			case 2:
				_localctx = new StatementExpressionGoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1880);
				goExpression();
				}
				break;
			case 3:
				_localctx = new StatementExpressionAnyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1881);
				expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodReferenceContext extends ParserRuleContext {
		public MethodReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference; }
	 
		public MethodReferenceContext() { }
		public void copyFrom(MethodReferenceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorReferenceArrayContext extends MethodReferenceContext {
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public TerminalNode COLON_COLON() { return getToken(JasperParser.COLON_COLON, 0); }
		public TerminalNode New() { return getToken(JasperParser.New, 0); }
		public ConstructorReferenceArrayContext(MethodReferenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterConstructorReferenceArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitConstructorReferenceArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitConstructorReferenceArray(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodReferencePrimaryChainContext extends MethodReferenceContext {
		public PrimaryAtomContext primaryAtom() {
			return getRuleContext(PrimaryAtomContext.class,0);
		}
		public TerminalNode COLON_COLON() { return getToken(JasperParser.COLON_COLON, 0); }
		public List<TerminalNode> Identifier() { return getTokens(JasperParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JasperParser.Identifier, i);
		}
		public List<ArgumentsContext> arguments() {
			return getRuleContexts(ArgumentsContext.class);
		}
		public ArgumentsContext arguments(int i) {
			return getRuleContext(ArgumentsContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JasperParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JasperParser.DOT, i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(JasperParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JasperParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JasperParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JasperParser.RBRACK, i);
		}
		public List<ClassInstanceCreationExpressionAfterDotContext> classInstanceCreationExpressionAfterDot() {
			return getRuleContexts(ClassInstanceCreationExpressionAfterDotContext.class);
		}
		public ClassInstanceCreationExpressionAfterDotContext classInstanceCreationExpressionAfterDot(int i) {
			return getRuleContext(ClassInstanceCreationExpressionAfterDotContext.class,i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public MethodReferencePrimaryChainContext(MethodReferenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterMethodReferencePrimaryChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitMethodReferencePrimaryChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitMethodReferencePrimaryChain(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorReferenceClassContext extends MethodReferenceContext {
		public TypePostfixContext typePostfix() {
			return getRuleContext(TypePostfixContext.class,0);
		}
		public TerminalNode COLON_COLON() { return getToken(JasperParser.COLON_COLON, 0); }
		public TerminalNode New() { return getToken(JasperParser.New, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public ConstructorReferenceClassContext(MethodReferenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterConstructorReferenceClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitConstructorReferenceClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitConstructorReferenceClass(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodReferenceTypeSuperContext extends MethodReferenceContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(JasperParser.DOT, 0); }
		public TerminalNode Super() { return getToken(JasperParser.Super, 0); }
		public TerminalNode COLON_COLON() { return getToken(JasperParser.COLON_COLON, 0); }
		public TerminalNode Identifier() { return getToken(JasperParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public MethodReferenceTypeSuperContext(MethodReferenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterMethodReferenceTypeSuper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitMethodReferenceTypeSuper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitMethodReferenceTypeSuper(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodReferenceSuperContext extends MethodReferenceContext {
		public TerminalNode Super() { return getToken(JasperParser.Super, 0); }
		public TerminalNode COLON_COLON() { return getToken(JasperParser.COLON_COLON, 0); }
		public TerminalNode Identifier() { return getToken(JasperParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public MethodReferenceSuperContext(MethodReferenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterMethodReferenceSuper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitMethodReferenceSuper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitMethodReferenceSuper(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodReferenceExpressionNameContext extends MethodReferenceContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode COLON_COLON() { return getToken(JasperParser.COLON_COLON, 0); }
		public TerminalNode Identifier() { return getToken(JasperParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public MethodReferenceExpressionNameContext(MethodReferenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterMethodReferenceExpressionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitMethodReferenceExpressionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitMethodReferenceExpressionName(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodReferenceTypeContext extends MethodReferenceContext {
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public TerminalNode COLON_COLON() { return getToken(JasperParser.COLON_COLON, 0); }
		public TerminalNode Identifier() { return getToken(JasperParser.Identifier, 0); }
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public MethodReferenceTypeContext(MethodReferenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterMethodReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitMethodReferenceType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitMethodReferenceType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodReferenceContext methodReference() throws RecognitionException {
		MethodReferenceContext _localctx = new MethodReferenceContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_methodReference);
		int _la;
		try {
			setState(1950);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				_localctx = new MethodReferenceExpressionNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1884);
				qualifiedName();
				setState(1885);
				match(COLON_COLON);
				setState(1887);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1886);
					typeArguments();
					}
				}

				setState(1889);
				match(Identifier);
				}
				break;
			case 2:
				_localctx = new MethodReferenceTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1891);
				typeExpr();
				setState(1892);
				match(COLON_COLON);
				setState(1894);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1893);
					typeArguments();
					}
				}

				setState(1896);
				match(Identifier);
				}
				break;
			case 3:
				_localctx = new MethodReferencePrimaryChainContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1898);
				primaryAtom();
				setState(1915);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 261L) != 0)) {
					{
					setState(1913);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
					case 1:
						{
						setState(1899);
						arguments();
						}
						break;
					case 2:
						{
						setState(1900);
						match(DOT);
						setState(1902);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==LT) {
							{
							setState(1901);
							typeArguments();
							}
						}

						setState(1904);
						match(Identifier);
						setState(1906);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
						case 1:
							{
							setState(1905);
							arguments();
							}
							break;
						}
						}
						break;
					case 3:
						{
						setState(1908);
						match(LBRACK);
						setState(1909);
						expression();
						setState(1910);
						match(RBRACK);
						}
						break;
					case 4:
						{
						setState(1912);
						classInstanceCreationExpressionAfterDot();
						}
						break;
					}
					}
					setState(1917);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1918);
				match(COLON_COLON);
				setState(1920);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1919);
					typeArguments();
					}
				}

				setState(1922);
				match(Identifier);
				}
				break;
			case 4:
				_localctx = new MethodReferenceSuperContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1924);
				match(Super);
				setState(1925);
				match(COLON_COLON);
				setState(1927);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1926);
					typeArguments();
					}
				}

				setState(1929);
				match(Identifier);
				}
				break;
			case 5:
				_localctx = new MethodReferenceTypeSuperContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1930);
				qualifiedName();
				setState(1931);
				match(DOT);
				setState(1932);
				match(Super);
				setState(1933);
				match(COLON_COLON);
				setState(1935);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1934);
					typeArguments();
					}
				}

				setState(1937);
				match(Identifier);
				}
				break;
			case 6:
				_localctx = new ConstructorReferenceClassContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1939);
				typePostfix();
				setState(1940);
				match(COLON_COLON);
				setState(1942);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1941);
					typeArguments();
					}
				}

				setState(1944);
				match(New);
				}
				break;
			case 7:
				_localctx = new ConstructorReferenceArrayContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1946);
				typeExpr();
				setState(1947);
				match(COLON_COLON);
				setState(1948);
				match(New);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassInstanceCreationExpressionContext extends ParserRuleContext {
		public ClassInstanceCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression; }
	 
		public ClassInstanceCreationExpressionContext() { }
		public void copyFrom(ClassInstanceCreationExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewUnqualifiedContext extends ClassInstanceCreationExpressionContext {
		public TerminalNode New() { return getToken(JasperParser.New, 0); }
		public List<TerminalNode> Identifier() { return getTokens(JasperParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JasperParser.Identifier, i);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(JasperParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JasperParser.DOT, i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public NewUnqualifiedContext(ClassInstanceCreationExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterNewUnqualified(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitNewUnqualified(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitNewUnqualified(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInstanceCreationExpressionContext classInstanceCreationExpression() throws RecognitionException {
		ClassInstanceCreationExpressionContext _localctx = new ClassInstanceCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_classInstanceCreationExpression);
		int _la;
		try {
			_localctx = new NewUnqualifiedContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1952);
			match(New);
			setState(1954);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1953);
				typeArguments();
				}
			}

			setState(1959);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1956);
				annotation();
				}
				}
				setState(1961);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1962);
			match(Identifier);
			setState(1973);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1963);
				match(DOT);
				setState(1967);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1964);
					annotation();
					}
					}
					setState(1969);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1970);
				match(Identifier);
				}
				}
				setState(1975);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1977);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1976);
				typeArgumentsOrDiamond();
				}
			}

			setState(1979);
			arguments();
			setState(1981);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				{
				setState(1980);
				classBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassInstanceCreationExpressionAfterDotContext extends ParserRuleContext {
		public ClassInstanceCreationExpressionAfterDotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpressionAfterDot; }
	 
		public ClassInstanceCreationExpressionAfterDotContext() { }
		public void copyFrom(ClassInstanceCreationExpressionAfterDotContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewAfterDotContext extends ClassInstanceCreationExpressionAfterDotContext {
		public List<TerminalNode> DOT() { return getTokens(JasperParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(JasperParser.DOT, i);
		}
		public TerminalNode New() { return getToken(JasperParser.New, 0); }
		public List<TerminalNode> Identifier() { return getTokens(JasperParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JasperParser.Identifier, i);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public NewAfterDotContext(ClassInstanceCreationExpressionAfterDotContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterNewAfterDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitNewAfterDot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitNewAfterDot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInstanceCreationExpressionAfterDotContext classInstanceCreationExpressionAfterDot() throws RecognitionException {
		ClassInstanceCreationExpressionAfterDotContext _localctx = new ClassInstanceCreationExpressionAfterDotContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_classInstanceCreationExpressionAfterDot);
		int _la;
		try {
			_localctx = new NewAfterDotContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(1983);
			match(DOT);
			setState(1984);
			match(New);
			setState(1986);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1985);
				typeArguments();
				}
			}

			setState(1991);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1988);
				annotation();
				}
				}
				setState(1993);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1994);
			match(Identifier);
			setState(2005);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1995);
				match(DOT);
				setState(1999);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1996);
					annotation();
					}
					}
					setState(2001);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2002);
				match(Identifier);
				}
				}
				setState(2007);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2009);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2008);
				typeArgumentsOrDiamond();
				}
			}

			setState(2011);
			arguments();
			setState(2013);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				{
				setState(2012);
				classBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayCreationExpressionContext extends ParserRuleContext {
		public ArrayCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreationExpression; }
	 
		public ArrayCreationExpressionContext() { }
		public void copyFrom(ArrayCreationExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayNewRefDimExprsContext extends ArrayCreationExpressionContext {
		public TerminalNode New() { return getToken(JasperParser.New, 0); }
		public TypePostfixContext typePostfix() {
			return getRuleContext(TypePostfixContext.class,0);
		}
		public DimExprsContext dimExprs() {
			return getRuleContext(DimExprsContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ArrayNewRefDimExprsContext(ArrayCreationExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterArrayNewRefDimExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitArrayNewRefDimExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitArrayNewRefDimExprs(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayInitRefContext extends ArrayCreationExpressionContext {
		public TerminalNode New() { return getToken(JasperParser.New, 0); }
		public TypePostfixContext typePostfix() {
			return getRuleContext(TypePostfixContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ArrayInitRefContext(ArrayCreationExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterArrayInitRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitArrayInitRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitArrayInitRef(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayInitPrimitiveContext extends ArrayCreationExpressionContext {
		public TerminalNode New() { return getToken(JasperParser.New, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ArrayInitPrimitiveContext(ArrayCreationExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterArrayInitPrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitArrayInitPrimitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitArrayInitPrimitive(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayNewPrimitiveDimExprsContext extends ArrayCreationExpressionContext {
		public TerminalNode New() { return getToken(JasperParser.New, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public DimExprsContext dimExprs() {
			return getRuleContext(DimExprsContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public ArrayNewPrimitiveDimExprsContext(ArrayCreationExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterArrayNewPrimitiveDimExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitArrayNewPrimitiveDimExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitArrayNewPrimitiveDimExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreationExpressionContext arrayCreationExpression() throws RecognitionException {
		ArrayCreationExpressionContext _localctx = new ArrayCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_arrayCreationExpression);
		try {
			setState(2037);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				_localctx = new ArrayNewPrimitiveDimExprsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2015);
				match(New);
				setState(2016);
				primitiveType();
				setState(2017);
				dimExprs();
				setState(2019);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
				case 1:
					{
					setState(2018);
					dims();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new ArrayNewRefDimExprsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2021);
				match(New);
				setState(2022);
				typePostfix();
				setState(2023);
				dimExprs();
				setState(2025);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
				case 1:
					{
					setState(2024);
					dims();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new ArrayInitPrimitiveContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2027);
				match(New);
				setState(2028);
				primitiveType();
				setState(2029);
				dims();
				setState(2030);
				arrayInitializer();
				}
				break;
			case 4:
				_localctx = new ArrayInitRefContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2032);
				match(New);
				setState(2033);
				typePostfix();
				setState(2034);
				dims();
				setState(2035);
				arrayInitializer();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DimExprsContext extends ParserRuleContext {
		public List<DimExprContext> dimExpr() {
			return getRuleContexts(DimExprContext.class);
		}
		public DimExprContext dimExpr(int i) {
			return getRuleContext(DimExprContext.class,i);
		}
		public DimExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterDimExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitDimExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitDimExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimExprsContext dimExprs() throws RecognitionException {
		DimExprsContext _localctx = new DimExprsContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_dimExprs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2039);
			dimExpr();
			setState(2043);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2040);
					dimExpr();
					}
					} 
				}
				setState(2045);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DimsContext extends ParserRuleContext {
		public List<TerminalNode> LBRACK() { return getTokens(JasperParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(JasperParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(JasperParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(JasperParser.RBRACK, i);
		}
		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterDims(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitDims(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitDims(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimsContext dims() throws RecognitionException {
		DimsContext _localctx = new DimsContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_dims);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2048); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2046);
					match(LBRACK);
					setState(2047);
					match(RBRACK);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2050); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class DimExprContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(JasperParser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(JasperParser.RBRACK, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public DimExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterDimExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitDimExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitDimExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimExprContext dimExpr() throws RecognitionException {
		DimExprContext _localctx = new DimExprContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_dimExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2055);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2052);
				annotation();
				}
				}
				setState(2057);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2058);
			match(LBRACK);
			setState(2059);
			expression();
			setState(2060);
			match(RBRACK);
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

	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAssignmentContext extends ExpressionContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExprAssignmentContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterExprAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitExprAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitExprAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprLambdaContext extends ExpressionContext {
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public ExprLambdaContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterExprLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitExprLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitExprLambda(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_expression);
		try {
			setState(2064);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
			case 1:
				_localctx = new ExprLambdaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2062);
				lambdaExpression();
				}
				break;
			case 2:
				_localctx = new ExprAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2063);
				assignmentExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(JasperParser.ARROW, 0); }
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitLambdaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitLambdaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2066);
			lambdaParameters();
			setState(2067);
			match(ARROW);
			setState(2068);
			lambdaBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaParametersContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(JasperParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(JasperParser.Identifier, i);
		}
		public TerminalNode LPAREN() { return getToken(JasperParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(JasperParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JasperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JasperParser.COMMA, i);
		}
		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitLambdaParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitLambdaParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_lambdaParameters);
		int _la;
		try {
			int _alt;
			setState(2096);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2070);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2071);
				match(LPAREN);
				setState(2083);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2072);
					match(Identifier);
					setState(2077);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(2073);
							match(COMMA);
							setState(2074);
							match(Identifier);
							}
							} 
						}
						setState(2079);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
					}
					setState(2081);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(2080);
						match(COMMA);
						}
					}

					}
				}

				setState(2085);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2086);
				match(LPAREN);
				setState(2093);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
				case 1:
					{
					setState(2087);
					receiverParameter();
					}
					break;
				case 2:
					{
					setState(2088);
					formalParameters();
					setState(2089);
					match(COMMA);
					setState(2090);
					lastFormalParameter();
					}
					break;
				case 3:
					{
					setState(2092);
					lastFormalParameter();
					}
					break;
				}
				setState(2095);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterLambdaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitLambdaBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitLambdaBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_lambdaBody);
		try {
			setState(2100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2098);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2099);
				block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
	 
		public AssignmentExpressionContext() { }
		public void copyFrom(AssignmentExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignExprConditionalContext extends AssignmentExpressionContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AssignExprConditionalContext(AssignmentExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterAssignExprConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitAssignExprConditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitAssignExprConditional(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignExprAssignmentContext extends AssignmentExpressionContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignExprAssignmentContext(AssignmentExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterAssignExprAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitAssignExprAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitAssignExprAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_assignmentExpression);
		try {
			setState(2104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				_localctx = new AssignExprConditionalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2102);
				conditionalExpression();
				}
				break;
			case 2:
				_localctx = new AssignExprAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2103);
				assignment();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
	 
		public ConditionalExpressionContext() { }
		public void copyFrom(ConditionalExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondBinaryContext extends ConditionalExpressionContext {
		public BinaryExpressionContext binaryExpression() {
			return getRuleContext(BinaryExpressionContext.class,0);
		}
		public CondBinaryContext(ConditionalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterCondBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitCondBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitCondBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondTernaryContext extends ConditionalExpressionContext {
		public BinaryExpressionContext binaryExpression() {
			return getRuleContext(BinaryExpressionContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(JasperParser.QUESTION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JasperParser.COLON, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public CondTernaryContext(ConditionalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterCondTernary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitCondTernary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitCondTernary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_conditionalExpression);
		try {
			setState(2113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				_localctx = new CondBinaryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2106);
				binaryExpression(0);
				}
				break;
			case 2:
				_localctx = new CondTernaryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2107);
				binaryExpression(0);
				setState(2108);
				match(QUESTION);
				setState(2109);
				expression();
				setState(2110);
				match(COLON);
				setState(2111);
				conditionalExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BinaryExpressionContext extends ParserRuleContext {
		public BinaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpression; }
	 
		public BinaryExpressionContext() { }
		public void copyFrom(BinaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryBitAndContext extends BinaryExpressionContext {
		public Token op;
		public BinaryExpressionContext binaryExpression() {
			return getRuleContext(BinaryExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode AMP() { return getToken(JasperParser.AMP, 0); }
		public BinaryBitAndContext(BinaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterBinaryBitAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitBinaryBitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitBinaryBitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryMultiplicationContext extends BinaryExpressionContext {
		public Token op;
		public BinaryExpressionContext binaryExpression() {
			return getRuleContext(BinaryExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode STAR() { return getToken(JasperParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(JasperParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(JasperParser.PERCENT, 0); }
		public BinaryMultiplicationContext(BinaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterBinaryMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitBinaryMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitBinaryMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryShiftContext extends BinaryExpressionContext {
		public Token op;
		public BinaryExpressionContext binaryExpression() {
			return getRuleContext(BinaryExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode LSHIFT() { return getToken(JasperParser.LSHIFT, 0); }
		public TerminalNode RSHIFT() { return getToken(JasperParser.RSHIFT, 0); }
		public TerminalNode URSHIFT() { return getToken(JasperParser.URSHIFT, 0); }
		public BinaryShiftContext(BinaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterBinaryShift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitBinaryShift(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitBinaryShift(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryAndContext extends BinaryExpressionContext {
		public Token op;
		public BinaryExpressionContext binaryExpression() {
			return getRuleContext(BinaryExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode And() { return getToken(JasperParser.And, 0); }
		public TerminalNode AND_AND() { return getToken(JasperParser.AND_AND, 0); }
		public BinaryAndContext(BinaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterBinaryAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitBinaryAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitBinaryAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryRelationalContext extends BinaryExpressionContext {
		public Token op;
		public BinaryExpressionContext binaryExpression() {
			return getRuleContext(BinaryExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode LT() { return getToken(JasperParser.LT, 0); }
		public TerminalNode GT() { return getToken(JasperParser.GT, 0); }
		public TerminalNode LE() { return getToken(JasperParser.LE, 0); }
		public TerminalNode GE() { return getToken(JasperParser.GE, 0); }
		public BinaryRelationalContext(BinaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterBinaryRelational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitBinaryRelational(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitBinaryRelational(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryOrContext extends BinaryExpressionContext {
		public Token op;
		public BinaryExpressionContext binaryExpression() {
			return getRuleContext(BinaryExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode Or() { return getToken(JasperParser.Or, 0); }
		public TerminalNode OR_OR() { return getToken(JasperParser.OR_OR, 0); }
		public BinaryOrContext(BinaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterBinaryOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitBinaryOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitBinaryOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryEqualityContext extends BinaryExpressionContext {
		public Token op;
		public BinaryExpressionContext binaryExpression() {
			return getRuleContext(BinaryExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode EQUAL_EQUAL() { return getToken(JasperParser.EQUAL_EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(JasperParser.NOT_EQUAL, 0); }
		public BinaryEqualityContext(BinaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterBinaryEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitBinaryEquality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitBinaryEquality(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryBitOrContext extends BinaryExpressionContext {
		public Token op;
		public BinaryExpressionContext binaryExpression() {
			return getRuleContext(BinaryExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode PIPE() { return getToken(JasperParser.PIPE, 0); }
		public TerminalNode FULLWIDTH_PIPE() { return getToken(JasperParser.FULLWIDTH_PIPE, 0); }
		public BinaryBitOrContext(BinaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterBinaryBitOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitBinaryBitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitBinaryBitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryBitExclusiveOrContext extends BinaryExpressionContext {
		public Token op;
		public BinaryExpressionContext binaryExpression() {
			return getRuleContext(BinaryExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode CARET() { return getToken(JasperParser.CARET, 0); }
		public BinaryBitExclusiveOrContext(BinaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterBinaryBitExclusiveOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitBinaryBitExclusiveOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitBinaryBitExclusiveOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryAdditionContext extends BinaryExpressionContext {
		public Token op;
		public BinaryExpressionContext binaryExpression() {
			return getRuleContext(BinaryExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(JasperParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(JasperParser.MINUS, 0); }
		public BinaryAdditionContext(BinaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterBinaryAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitBinaryAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitBinaryAddition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryUnaryContext extends BinaryExpressionContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public BinaryUnaryContext(BinaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterBinaryUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitBinaryUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitBinaryUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExpressionContext binaryExpression() throws RecognitionException {
		return binaryExpression(0);
	}

	private BinaryExpressionContext binaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BinaryExpressionContext _localctx = new BinaryExpressionContext(_ctx, _parentState);
		BinaryExpressionContext _prevctx = _localctx;
		int _startState = 312;
		enterRecursionRule(_localctx, 312, RULE_binaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new BinaryUnaryContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2116);
			unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2148);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryMultiplicationContext(new BinaryExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_binaryExpression);
						setState(2118);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(2119);
						((BinaryMultiplicationContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & 7L) != 0)) ) {
							((BinaryMultiplicationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2120);
						unaryExpression();
						}
						break;
					case 2:
						{
						_localctx = new BinaryAdditionContext(new BinaryExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_binaryExpression);
						setState(2121);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(2122);
						((BinaryAdditionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((BinaryAdditionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2123);
						unaryExpression();
						}
						break;
					case 3:
						{
						_localctx = new BinaryShiftContext(new BinaryExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_binaryExpression);
						setState(2124);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2125);
						((BinaryShiftContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & 21L) != 0)) ) {
							((BinaryShiftContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2126);
						unaryExpression();
						}
						break;
					case 4:
						{
						_localctx = new BinaryRelationalContext(new BinaryExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_binaryExpression);
						setState(2127);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(2128);
						((BinaryRelationalContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & 201326595L) != 0)) ) {
							((BinaryRelationalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2129);
						unaryExpression();
						}
						break;
					case 5:
						{
						_localctx = new BinaryEqualityContext(new BinaryExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_binaryExpression);
						setState(2130);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2131);
						((BinaryEqualityContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL_EQUAL || _la==NOT_EQUAL) ) {
							((BinaryEqualityContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2132);
						unaryExpression();
						}
						break;
					case 6:
						{
						_localctx = new BinaryBitAndContext(new BinaryExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_binaryExpression);
						setState(2133);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2134);
						((BinaryBitAndContext)_localctx).op = match(AMP);
						setState(2135);
						unaryExpression();
						}
						break;
					case 7:
						{
						_localctx = new BinaryBitExclusiveOrContext(new BinaryExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_binaryExpression);
						setState(2136);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2137);
						((BinaryBitExclusiveOrContext)_localctx).op = match(CARET);
						setState(2138);
						unaryExpression();
						}
						break;
					case 8:
						{
						_localctx = new BinaryBitOrContext(new BinaryExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_binaryExpression);
						setState(2139);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2140);
						((BinaryBitOrContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PIPE || _la==FULLWIDTH_PIPE) ) {
							((BinaryBitOrContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2141);
						unaryExpression();
						}
						break;
					case 9:
						{
						_localctx = new BinaryAndContext(new BinaryExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_binaryExpression);
						setState(2142);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2143);
						((BinaryAndContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==And || _la==AND_AND) ) {
							((BinaryAndContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2144);
						unaryExpression();
						}
						break;
					case 10:
						{
						_localctx = new BinaryOrContext(new BinaryExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_binaryExpression);
						setState(2145);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2146);
						((BinaryOrContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Or || _la==OR_OR) ) {
							((BinaryOrContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2147);
						unaryExpression();
						}
						break;
					}
					} 
				}
				setState(2152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
	 
		public UnaryExpressionContext() { }
		public void copyFrom(UnaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryPlusContext extends UnaryExpressionContext {
		public TerminalNode PLUS() { return getToken(JasperParser.PLUS, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryPlusContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterUnaryPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitUnaryPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitUnaryPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryMinusContext extends UnaryExpressionContext {
		public TerminalNode MINUS() { return getToken(JasperParser.MINUS, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryMinusContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterUnaryMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitUnaryMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitUnaryMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryOtherContext extends UnaryExpressionContext {
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public UnaryOtherContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterUnaryOther(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitUnaryOther(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitUnaryOther(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_unaryExpression);
		try {
			setState(2158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
			case 1:
				_localctx = new UnaryPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2153);
				match(PLUS);
				setState(2154);
				unaryExpression();
				}
				break;
			case 2:
				_localctx = new UnaryMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2155);
				match(MINUS);
				setState(2156);
				unaryExpression();
				}
				break;
			case 3:
				_localctx = new UnaryOtherContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2157);
				unaryExpressionNotPlusMinus();
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionNotPlusMinusContext extends ParserRuleContext {
		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNotPlusMinus; }
	 
		public UnaryExpressionNotPlusMinusContext() { }
		public void copyFrom(UnaryExpressionNotPlusMinusContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryLogicalNotContext extends UnaryExpressionNotPlusMinusContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode Not() { return getToken(JasperParser.Not, 0); }
		public TerminalNode BANG() { return getToken(JasperParser.BANG, 0); }
		public UnaryLogicalNotContext(UnaryExpressionNotPlusMinusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterUnaryLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitUnaryLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitUnaryLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryBitNotContext extends UnaryExpressionNotPlusMinusContext {
		public TerminalNode TILDE() { return getToken(JasperParser.TILDE, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryBitNotContext(UnaryExpressionNotPlusMinusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterUnaryBitNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitUnaryBitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitUnaryBitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryGoContext extends UnaryExpressionNotPlusMinusContext {
		public GoExpressionContext goExpression() {
			return getRuleContext(GoExpressionContext.class,0);
		}
		public UnaryGoContext(UnaryExpressionNotPlusMinusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterUnaryGo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitUnaryGo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitUnaryGo(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryCastAsContext extends UnaryExpressionNotPlusMinusContext {
		public CastAsExpressionContext castAsExpression() {
			return getRuleContext(CastAsExpressionContext.class,0);
		}
		public UnaryCastAsContext(UnaryExpressionNotPlusMinusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterUnaryCastAs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitUnaryCastAs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitUnaryCastAs(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryPostfixContext extends UnaryExpressionNotPlusMinusContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryPostfixContext(UnaryExpressionNotPlusMinusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterUnaryPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitUnaryPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitUnaryPostfix(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryCastContext extends UnaryExpressionNotPlusMinusContext {
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryCastContext(UnaryExpressionNotPlusMinusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterUnaryCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitUnaryCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitUnaryCast(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryAwaitContext extends UnaryExpressionNotPlusMinusContext {
		public AwaitExpressionContext awaitExpression() {
			return getRuleContext(AwaitExpressionContext.class,0);
		}
		public UnaryAwaitContext(UnaryExpressionNotPlusMinusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterUnaryAwait(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitUnaryAwait(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitUnaryAwait(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_unaryExpressionNotPlusMinus);
		int _la;
		try {
			setState(2169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				_localctx = new UnaryCastAsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2160);
				castAsExpression();
				}
				break;
			case 2:
				_localctx = new UnaryPostfixContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2161);
				postfixExpression();
				}
				break;
			case 3:
				_localctx = new UnaryBitNotContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2162);
				match(TILDE);
				setState(2163);
				unaryExpression();
				}
				break;
			case 4:
				_localctx = new UnaryLogicalNotContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2164);
				_la = _input.LA(1);
				if ( !(_la==Not || _la==BANG) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2165);
				unaryExpression();
				}
				break;
			case 5:
				_localctx = new UnaryAwaitContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2166);
				awaitExpression();
				}
				break;
			case 6:
				_localctx = new UnaryGoContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2167);
				goExpression();
				}
				break;
			case 7:
				_localctx = new UnaryCastContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(2168);
				castExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AwaitExpressionContext extends ParserRuleContext {
		public TerminalNode Await() { return getToken(JasperParser.Await, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public AwaitExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_awaitExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterAwaitExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitAwaitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitAwaitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AwaitExpressionContext awaitExpression() throws RecognitionException {
		AwaitExpressionContext _localctx = new AwaitExpressionContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_awaitExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2171);
			match(Await);
			setState(2172);
			unaryExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class GoExpressionContext extends ParserRuleContext {
		public TerminalNode Go() { return getToken(JasperParser.Go, 0); }
		public GoTargetContext goTarget() {
			return getRuleContext(GoTargetContext.class,0);
		}
		public GoExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterGoExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitGoExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitGoExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoExpressionContext goExpression() throws RecognitionException {
		GoExpressionContext _localctx = new GoExpressionContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_goExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2174);
			match(Go);
			setState(2175);
			goTarget();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CastExpressionContext extends ParserRuleContext {
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
	 
		public CastExpressionContext() { }
		public void copyFrom(CastExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CastTypeExprContext extends CastExpressionContext {
		public TerminalNode LPAREN() { return getToken(JasperParser.LPAREN, 0); }
		public List<TypeExprContext> typeExpr() {
			return getRuleContexts(TypeExprContext.class);
		}
		public TypeExprContext typeExpr(int i) {
			return getRuleContext(TypeExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(JasperParser.RPAREN, 0); }
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public List<TerminalNode> AMP() { return getTokens(JasperParser.AMP); }
		public TerminalNode AMP(int i) {
			return getToken(JasperParser.AMP, i);
		}
		public CastTypeExprContext(CastExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterCastTypeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitCastTypeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitCastTypeExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CastPrimitiveContext extends CastExpressionContext {
		public TerminalNode LPAREN() { return getToken(JasperParser.LPAREN, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JasperParser.RPAREN, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public CastPrimitiveContext(CastExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterCastPrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitCastPrimitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitCastPrimitive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_castExpression);
		int _la;
		try {
			setState(2196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				_localctx = new CastPrimitiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2177);
				match(LPAREN);
				setState(2178);
				primitiveType();
				setState(2179);
				match(RPAREN);
				setState(2180);
				unaryExpression();
				}
				break;
			case 2:
				_localctx = new CastTypeExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2182);
				match(LPAREN);
				setState(2183);
				typeExpr();
				setState(2188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AMP) {
					{
					{
					setState(2184);
					match(AMP);
					setState(2185);
					typeExpr();
					}
					}
					setState(2190);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2191);
				match(RPAREN);
				setState(2194);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
				case 1:
					{
					setState(2192);
					unaryExpressionNotPlusMinus();
					}
					break;
				case 2:
					{
					setState(2193);
					lambdaExpression();
					}
					break;
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class CastAsExpressionContext extends ParserRuleContext {
		public CastAsExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castAsExpression; }
	 
		public CastAsExpressionContext() { }
		public void copyFrom(CastAsExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CastAsContext extends CastAsExpressionContext {
		public UnaryExpressionContext expr;
		public CastTypeContext ty;
		public SoftCastContext softCast() {
			return getRuleContext(SoftCastContext.class,0);
		}
		public SoftAsContext softAs() {
			return getRuleContext(SoftAsContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public CastTypeContext castType() {
			return getRuleContext(CastTypeContext.class,0);
		}
		public CastAsContext(CastAsExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterCastAs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitCastAs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitCastAs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastAsExpressionContext castAsExpression() throws RecognitionException {
		CastAsExpressionContext _localctx = new CastAsExpressionContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_castAsExpression);
		try {
			_localctx = new CastAsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(2198);
			softCast();
			setState(2199);
			((CastAsContext)_localctx).expr = unaryExpression();
			setState(2200);
			softAs();
			setState(2201);
			((CastAsContext)_localctx).ty = castType();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CastTypeContext extends ParserRuleContext {
		public CastTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castType; }
	 
		public CastTypeContext() { }
		public void copyFrom(CastTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CastTypeExprNodeContext extends CastTypeContext {
		public CastTypeOrContext castTypeOr() {
			return getRuleContext(CastTypeOrContext.class,0);
		}
		public CastTypeExprNodeContext(CastTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterCastTypeExprNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitCastTypeExprNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitCastTypeExprNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastTypeContext castType() throws RecognitionException {
		CastTypeContext _localctx = new CastTypeContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_castType);
		try {
			_localctx = new CastTypeExprNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(2203);
			castTypeOr();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CastTypeOrContext extends ParserRuleContext {
		public CastTypeOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castTypeOr; }
	 
		public CastTypeOrContext() { }
		public void copyFrom(CastTypeOrContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CastTypeExprOrNodeContext extends CastTypeOrContext {
		public List<CastTypeAndContext> castTypeAnd() {
			return getRuleContexts(CastTypeAndContext.class);
		}
		public CastTypeAndContext castTypeAnd(int i) {
			return getRuleContext(CastTypeAndContext.class,i);
		}
		public List<TerminalNode> PIPE() { return getTokens(JasperParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(JasperParser.PIPE, i);
		}
		public List<TerminalNode> FULLWIDTH_PIPE() { return getTokens(JasperParser.FULLWIDTH_PIPE); }
		public TerminalNode FULLWIDTH_PIPE(int i) {
			return getToken(JasperParser.FULLWIDTH_PIPE, i);
		}
		public CastTypeExprOrNodeContext(CastTypeOrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterCastTypeExprOrNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitCastTypeExprOrNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitCastTypeExprOrNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastTypeOrContext castTypeOr() throws RecognitionException {
		CastTypeOrContext _localctx = new CastTypeOrContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_castTypeOr);
		int _la;
		try {
			int _alt;
			_localctx = new CastTypeExprOrNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(2205);
			castTypeAnd();
			setState(2210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,265,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2206);
					_la = _input.LA(1);
					if ( !(_la==PIPE || _la==FULLWIDTH_PIPE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2207);
					castTypeAnd();
					}
					} 
				}
				setState(2212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,265,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CastTypeAndContext extends ParserRuleContext {
		public CastTypeAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castTypeAnd; }
	 
		public CastTypeAndContext() { }
		public void copyFrom(CastTypeAndContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CastTypeExprAndNodeContext extends CastTypeAndContext {
		public List<CastTypeAtomContext> castTypeAtom() {
			return getRuleContexts(CastTypeAtomContext.class);
		}
		public CastTypeAtomContext castTypeAtom(int i) {
			return getRuleContext(CastTypeAtomContext.class,i);
		}
		public List<TerminalNode> AMP() { return getTokens(JasperParser.AMP); }
		public TerminalNode AMP(int i) {
			return getToken(JasperParser.AMP, i);
		}
		public List<TerminalNode> AND_AND() { return getTokens(JasperParser.AND_AND); }
		public TerminalNode AND_AND(int i) {
			return getToken(JasperParser.AND_AND, i);
		}
		public CastTypeExprAndNodeContext(CastTypeAndContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterCastTypeExprAndNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitCastTypeExprAndNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitCastTypeExprAndNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastTypeAndContext castTypeAnd() throws RecognitionException {
		CastTypeAndContext _localctx = new CastTypeAndContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_castTypeAnd);
		int _la;
		try {
			int _alt;
			_localctx = new CastTypeExprAndNodeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(2213);
			castTypeAtom();
			setState(2218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,266,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2214);
					_la = _input.LA(1);
					if ( !(_la==AND_AND || _la==AMP) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2215);
					castTypeAtom();
					}
					} 
				}
				setState(2220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,266,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CastTypeAtomContext extends ParserRuleContext {
		public CastTypeAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castTypeAtom; }
	 
		public CastTypeAtomContext() { }
		public void copyFrom(CastTypeAtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CastTypeExprGroupContext extends CastTypeAtomContext {
		public TerminalNode LPAREN() { return getToken(JasperParser.LPAREN, 0); }
		public CastTypeContext castType() {
			return getRuleContext(CastTypeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JasperParser.RPAREN, 0); }
		public CastTypeExprGroupContext(CastTypeAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterCastTypeExprGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitCastTypeExprGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitCastTypeExprGroup(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CastTypeExprBaseContext extends CastTypeAtomContext {
		public TypePostfixContext typePostfix() {
			return getRuleContext(TypePostfixContext.class,0);
		}
		public CastTypeExprBaseContext(CastTypeAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterCastTypeExprBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitCastTypeExprBase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitCastTypeExprBase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastTypeAtomContext castTypeAtom() throws RecognitionException {
		CastTypeAtomContext _localctx = new CastTypeAtomContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_castTypeAtom);
		try {
			setState(2226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				_localctx = new CastTypeExprGroupContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2221);
				match(LPAREN);
				setState(2222);
				castType();
				setState(2223);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new CastTypeExprBaseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2225);
				typePostfix();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public LeftHandSideContext leftHandSide() {
			return getRuleContext(LeftHandSideContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2228);
			leftHandSide();
			setState(2229);
			assignmentOperator();
			setState(2230);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LeftHandSideContext extends ParserRuleContext {
		public LeftHandSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftHandSide; }
	 
		public LeftHandSideContext() { }
		public void copyFrom(LeftHandSideContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LeftHandSidePrimaryContext extends LeftHandSideContext {
		public LhsPrimaryContext lhsPrimary() {
			return getRuleContext(LhsPrimaryContext.class,0);
		}
		public LeftHandSidePrimaryContext(LeftHandSideContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterLeftHandSidePrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitLeftHandSidePrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitLeftHandSidePrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LeftHandSideExpressionNameContext extends LeftHandSideContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public LeftHandSideExpressionNameContext(LeftHandSideContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterLeftHandSideExpressionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitLeftHandSideExpressionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitLeftHandSideExpressionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftHandSideContext leftHandSide() throws RecognitionException {
		LeftHandSideContext _localctx = new LeftHandSideContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_leftHandSide);
		try {
			setState(2234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				_localctx = new LeftHandSideExpressionNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2232);
				qualifiedName();
				}
				break;
			case 2:
				_localctx = new LeftHandSidePrimaryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2233);
				lhsPrimary();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LhsPrimaryContext extends ParserRuleContext {
		public PrimaryAtomContext primaryAtom() {
			return getRuleContext(PrimaryAtomContext.class,0);
		}
		public List<LhsSuffixContext> lhsSuffix() {
			return getRuleContexts(LhsSuffixContext.class);
		}
		public LhsSuffixContext lhsSuffix(int i) {
			return getRuleContext(LhsSuffixContext.class,i);
		}
		public LhsPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lhsPrimary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterLhsPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitLhsPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitLhsPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LhsPrimaryContext lhsPrimary() throws RecognitionException {
		LhsPrimaryContext _localctx = new LhsPrimaryContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_lhsPrimary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2236);
			primaryAtom();
			setState(2238); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2237);
				lhsSuffix();
				}
				}
				setState(2240); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LBRACK || _la==DOT );
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

	@SuppressWarnings("CheckReturnValue")
	public static class LhsSuffixContext extends ParserRuleContext {
		public LhsSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lhsSuffix; }
	 
		public LhsSuffixContext() { }
		public void copyFrom(LhsSuffixContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LeftHandSideIndexContext extends LhsSuffixContext {
		public TerminalNode LBRACK() { return getToken(JasperParser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(JasperParser.RBRACK, 0); }
		public LeftHandSideIndexContext(LhsSuffixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterLeftHandSideIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitLeftHandSideIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitLeftHandSideIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LeftHandSideFieldContext extends LhsSuffixContext {
		public TerminalNode DOT() { return getToken(JasperParser.DOT, 0); }
		public TerminalNode Identifier() { return getToken(JasperParser.Identifier, 0); }
		public LeftHandSideFieldContext(LhsSuffixContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterLeftHandSideField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitLeftHandSideField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitLeftHandSideField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LhsSuffixContext lhsSuffix() throws RecognitionException {
		LhsSuffixContext _localctx = new LhsSuffixContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_lhsSuffix);
		try {
			setState(2248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				_localctx = new LeftHandSideFieldContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2242);
				match(DOT);
				setState(2243);
				match(Identifier);
				}
				break;
			case LBRACK:
				_localctx = new LeftHandSideIndexContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2244);
				match(LBRACK);
				setState(2245);
				expression();
				setState(2246);
				match(RBRACK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(JasperParser.ASSIGN, 0); }
		public TerminalNode STAR_ASSIGN() { return getToken(JasperParser.STAR_ASSIGN, 0); }
		public TerminalNode SLASH_ASSIGN() { return getToken(JasperParser.SLASH_ASSIGN, 0); }
		public TerminalNode PERCENT_ASSIGN() { return getToken(JasperParser.PERCENT_ASSIGN, 0); }
		public TerminalNode PLUS_ASSIGN() { return getToken(JasperParser.PLUS_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(JasperParser.MINUS_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(JasperParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(JasperParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(JasperParser.URSHIFT_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(JasperParser.AND_ASSIGN, 0); }
		public TerminalNode CARET_ASSIGN() { return getToken(JasperParser.CARET_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(JasperParser.OR_ASSIGN, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2250);
			_la = _input.LA(1);
			if ( !(((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & 34363916309L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JasperParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JasperParser.RBRACE, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2252);
			match(LBRACE);
			setState(2256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,271,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2253);
					blockStatement();
					}
					} 
				}
				setState(2258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,271,_ctx);
			}
			setState(2259);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockStatementContext extends ParserRuleContext {
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
	 
		public BlockStatementContext() { }
		public void copyFrom(BlockStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockStatementStatementContext extends BlockStatementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementStatementContext(BlockStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterBlockStatementStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitBlockStatementStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitBlockStatementStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockStatementLocalVariableContext extends BlockStatementContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public BlockStatementLocalVariableContext(BlockStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterBlockStatementLocalVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitBlockStatementLocalVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitBlockStatementLocalVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockStatementClassDeclarationContext extends BlockStatementContext {
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public BlockStatementClassDeclarationContext(BlockStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterBlockStatementClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitBlockStatementClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitBlockStatementClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_blockStatement);
		try {
			setState(2267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				_localctx = new BlockStatementLocalVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2261);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				_localctx = new BlockStatementClassDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2264);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
				case 1:
					{
					setState(2262);
					normalClassDeclaration();
					}
					break;
				case 2:
					{
					setState(2263);
					enumDeclaration();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new BlockStatementStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2266);
				statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementLockContext extends StatementContext {
		public LockStatementContext lockStatement() {
			return getRuleContext(LockStatementContext.class,0);
		}
		public StatementLockContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterStatementLock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitStatementLock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitStatementLock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementExpressionStatementContext extends StatementContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public StatementExpressionStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterStatementExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitStatementExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitStatementExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementWhileContext extends StatementContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public StatementWhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterStatementWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitStatementWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitStatementWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementAssertContext extends StatementContext {
		public AssertStatementContext assertStatement() {
			return getRuleContext(AssertStatementContext.class,0);
		}
		public StatementAssertContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterStatementAssert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitStatementAssert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitStatementAssert(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementDoContext extends StatementContext {
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public StatementDoContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterStatementDo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitStatementDo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitStatementDo(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementTryContext extends StatementContext {
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public StatementTryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterStatementTry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitStatementTry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitStatementTry(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementGoContext extends StatementContext {
		public GoStatementContext goStatement() {
			return getRuleContext(GoStatementContext.class,0);
		}
		public StatementGoContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterStatementGo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitStatementGo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitStatementGo(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementContinueContext extends StatementContext {
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public StatementContinueContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterStatementContinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitStatementContinue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitStatementContinue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementThrowContext extends StatementContext {
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public StatementThrowContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterStatementThrow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitStatementThrow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitStatementThrow(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementIfContext extends StatementContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public StatementIfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterStatementIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitStatementIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitStatementIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementForContext extends StatementContext {
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public StatementForContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterStatementFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitStatementFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitStatementFor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementBreakContext extends StatementContext {
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public StatementBreakContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterStatementBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitStatementBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitStatementBreak(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementReturnContext extends StatementContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public StatementReturnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterStatementReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitStatementReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitStatementReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementEmptyContext extends StatementContext {
		public TerminalNode SEMI() { return getToken(JasperParser.SEMI, 0); }
		public StatementEmptyContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterStatementEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitStatementEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitStatementEmpty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementLabeledContext extends StatementContext {
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public StatementLabeledContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterStatementLabeled(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitStatementLabeled(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitStatementLabeled(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementSwitchContext extends StatementContext {
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public StatementSwitchContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterStatementSwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitStatementSwitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitStatementSwitch(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementDeferContext extends StatementContext {
		public DeferStatementContext deferStatement() {
			return getRuleContext(DeferStatementContext.class,0);
		}
		public StatementDeferContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterStatementDefer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitStatementDefer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitStatementDefer(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementYieldContext extends StatementContext {
		public YieldStatementContext yieldStatement() {
			return getRuleContext(YieldStatementContext.class,0);
		}
		public StatementYieldContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterStatementYield(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitStatementYield(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitStatementYield(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementBlockContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementBlockContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterStatementBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitStatementBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitStatementBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_statement);
		try {
			setState(2288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				_localctx = new StatementBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2269);
				block();
				}
				break;
			case 2:
				_localctx = new StatementEmptyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2270);
				match(SEMI);
				}
				break;
			case 3:
				_localctx = new StatementExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2271);
				expressionStatement();
				}
				break;
			case 4:
				_localctx = new StatementGoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2272);
				goStatement();
				}
				break;
			case 5:
				_localctx = new StatementYieldContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2273);
				yieldStatement();
				}
				break;
			case 6:
				_localctx = new StatementAssertContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2274);
				assertStatement();
				}
				break;
			case 7:
				_localctx = new StatementSwitchContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(2275);
				switchStatement();
				}
				break;
			case 8:
				_localctx = new StatementDoContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(2276);
				doStatement();
				}
				break;
			case 9:
				_localctx = new StatementBreakContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(2277);
				breakStatement();
				}
				break;
			case 10:
				_localctx = new StatementContinueContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(2278);
				continueStatement();
				}
				break;
			case 11:
				_localctx = new StatementReturnContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(2279);
				returnStatement();
				}
				break;
			case 12:
				_localctx = new StatementLockContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(2280);
				lockStatement();
				}
				break;
			case 13:
				_localctx = new StatementThrowContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(2281);
				throwStatement();
				}
				break;
			case 14:
				_localctx = new StatementTryContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(2282);
				tryStatement();
				}
				break;
			case 15:
				_localctx = new StatementLabeledContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(2283);
				labeledStatement();
				}
				break;
			case 16:
				_localctx = new StatementIfContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(2284);
				ifStatement();
				}
				break;
			case 17:
				_localctx = new StatementWhileContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(2285);
				whileStatement();
				}
				break;
			case 18:
				_localctx = new StatementForContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(2286);
				forStatement();
				}
				break;
			case 19:
				_localctx = new StatementDeferContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(2287);
				deferStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeferStatementContext extends ParserRuleContext {
		public TerminalNode Defer() { return getToken(JasperParser.Defer, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DeferStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deferStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterDeferStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitDeferStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitDeferStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeferStatementContext deferStatement() throws RecognitionException {
		DeferStatementContext _localctx = new DeferStatementContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_deferStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2290);
			match(Defer);
			setState(2291);
			statement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoopThenElseContext extends ParserRuleContext {
		public SoftThenContext softThen() {
			return getRuleContext(SoftThenContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode Else() { return getToken(JasperParser.Else, 0); }
		public LoopThenElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopThenElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterLoopThenElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitLoopThenElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitLoopThenElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopThenElseContext loopThenElse() throws RecognitionException {
		LoopThenElseContext _localctx = new LoopThenElseContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_loopThenElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2293);
			softThen();
			setState(2294);
			block();
			setState(2297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				{
				setState(2295);
				match(Else);
				setState(2296);
				block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoopStatementContext extends ParserRuleContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_loopStatement);
		try {
			setState(2302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(2299);
				whileStatement();
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 2);
				{
				setState(2300);
				doStatement();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 3);
				{
				setState(2301);
				forStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LabeledStatementContext extends ParserRuleContext {
		public Token label;
		public SoftLabelContext softLabel() {
			return getRuleContext(SoftLabelContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JasperParser.COLON, 0); }
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JasperParser.Identifier, 0); }
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitLabeledStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitLabeledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_labeledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2304);
			softLabel();
			setState(2305);
			((LabeledStatementContext)_localctx).label = match(Identifier);
			setState(2306);
			match(COLON);
			setState(2307);
			loopStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JasperParser.SEMI, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2309);
			statementExpression();
			setState(2310);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class GoStatementContext extends ParserRuleContext {
		public GoExpressionContext goExpression() {
			return getRuleContext(GoExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JasperParser.SEMI, 0); }
		public GoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterGoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitGoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitGoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoStatementContext goStatement() throws RecognitionException {
		GoStatementContext _localctx = new GoStatementContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_goStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2312);
			goExpression();
			setState(2313);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class YieldStatementContext extends ParserRuleContext {
		public TerminalNode Yield() { return getToken(JasperParser.Yield, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JasperParser.SEMI, 0); }
		public TerminalNode STAR() { return getToken(JasperParser.STAR, 0); }
		public YieldStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yieldStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterYieldStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitYieldStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitYieldStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YieldStatementContext yieldStatement() throws RecognitionException {
		YieldStatementContext _localctx = new YieldStatementContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_yieldStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2315);
			match(Yield);
			setState(2317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
			case 1:
				{
				setState(2316);
				match(STAR);
				}
				break;
			}
			setState(2319);
			expression();
			setState(2320);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(JasperParser.If, 0); }
		public TerminalNode LPAREN() { return getToken(JasperParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JasperParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseClauseContext elseClause() {
			return getRuleContext(ElseClauseContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2322);
			match(If);
			setState(2323);
			match(LPAREN);
			setState(2324);
			expression();
			setState(2325);
			match(RPAREN);
			setState(2326);
			block();
			setState(2328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				{
				setState(2327);
				elseClause();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseClauseContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(JasperParser.Else, 0); }
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterElseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitElseClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitElseClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseClauseContext elseClause() throws RecognitionException {
		ElseClauseContext _localctx = new ElseClauseContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_elseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2330);
			match(Else);
			setState(2333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				{
				setState(2331);
				ifStatement();
				}
				break;
			case LBRACE:
				{
				setState(2332);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssertStatementContext extends ParserRuleContext {
		public AssertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertStatement; }
	 
		public AssertStatementContext() { }
		public void copyFrom(AssertStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssertSimpleContext extends AssertStatementContext {
		public TerminalNode Assert() { return getToken(JasperParser.Assert, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JasperParser.SEMI, 0); }
		public AssertSimpleContext(AssertStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterAssertSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitAssertSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitAssertSimple(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssertWithMessageContext extends AssertStatementContext {
		public TerminalNode Assert() { return getToken(JasperParser.Assert, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(JasperParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(JasperParser.SEMI, 0); }
		public AssertWithMessageContext(AssertStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterAssertWithMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitAssertWithMessage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitAssertWithMessage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssertStatementContext assertStatement() throws RecognitionException {
		AssertStatementContext _localctx = new AssertStatementContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_assertStatement);
		try {
			setState(2345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
			case 1:
				_localctx = new AssertSimpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2335);
				match(Assert);
				setState(2336);
				expression();
				setState(2337);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new AssertWithMessageContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2339);
				match(Assert);
				setState(2340);
				expression();
				setState(2341);
				match(COLON);
				setState(2342);
				expression();
				setState(2343);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode Switch() { return getToken(JasperParser.Switch, 0); }
		public TerminalNode LPAREN() { return getToken(JasperParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JasperParser.RPAREN, 0); }
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2347);
			match(Switch);
			setState(2348);
			match(LPAREN);
			setState(2349);
			expression();
			setState(2350);
			match(RPAREN);
			setState(2351);
			switchBlock();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchBlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(JasperParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(JasperParser.RBRACE, 0); }
		public List<SwitchCaseContext> switchCase() {
			return getRuleContexts(SwitchCaseContext.class);
		}
		public SwitchCaseContext switchCase(int i) {
			return getRuleContext(SwitchCaseContext.class,i);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitSwitchBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitSwitchBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_switchBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2353);
			match(LBRACE);
			setState(2357);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,281,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2354);
					switchCase();
					}
					} 
				}
				setState(2359);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,281,_ctx);
			}
			setState(2360);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchCaseContext extends ParserRuleContext {
		public SwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCase; }
	 
		public SwitchCaseContext() { }
		public void copyFrom(SwitchCaseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SwitchCaseDefaultContext extends SwitchCaseContext {
		public TerminalNode Default() { return getToken(JasperParser.Default, 0); }
		public TerminalNode FAT_ARROW() { return getToken(JasperParser.FAT_ARROW, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SwitchCaseDefaultContext(SwitchCaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterSwitchCaseDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitSwitchCaseDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitSwitchCaseDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SwitchCaseWhenContext extends SwitchCaseContext {
		public SoftWhenContext softWhen() {
			return getRuleContext(SoftWhenContext.class,0);
		}
		public TerminalNode FAT_ARROW() { return getToken(JasperParser.FAT_ARROW, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public SwitchGuardContext switchGuard() {
			return getRuleContext(SwitchGuardContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(JasperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JasperParser.COMMA, i);
		}
		public SwitchCaseWhenContext(SwitchCaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterSwitchCaseWhen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitSwitchCaseWhen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitSwitchCaseWhen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchCaseContext switchCase() throws RecognitionException {
		SwitchCaseContext _localctx = new SwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_switchCase);
		int _la;
		try {
			int _alt;
			setState(2383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				_localctx = new SwitchCaseWhenContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2362);
				softWhen();
				{
				setState(2363);
				pattern();
				setState(2368);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,282,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2364);
						match(COMMA);
						setState(2365);
						pattern();
						}
						} 
					}
					setState(2370);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,282,_ctx);
				}
				setState(2372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2371);
					match(COMMA);
					}
				}

				}
				setState(2375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==If) {
					{
					setState(2374);
					switchGuard();
					}
				}

				setState(2377);
				match(FAT_ARROW);
				setState(2378);
				block();
				}
				break;
			case 2:
				_localctx = new SwitchCaseDefaultContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2380);
				match(Default);
				setState(2381);
				match(FAT_ARROW);
				setState(2382);
				block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchGuardContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(JasperParser.If, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SwitchGuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchGuard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterSwitchGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitSwitchGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitSwitchGuard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchGuardContext switchGuard() throws RecognitionException {
		SwitchGuardContext _localctx = new SwitchGuardContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_switchGuard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2385);
			match(If);
			setState(2386);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(JasperParser.While, 0); }
		public TerminalNode LPAREN() { return getToken(JasperParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JasperParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LoopThenElseContext loopThenElse() {
			return getRuleContext(LoopThenElseContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2388);
			match(While);
			setState(2389);
			match(LPAREN);
			setState(2390);
			expression();
			setState(2391);
			match(RPAREN);
			setState(2392);
			block();
			setState(2394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
			case 1:
				{
				setState(2393);
				loopThenElse();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DoStatementContext extends ParserRuleContext {
		public TerminalNode Do() { return getToken(JasperParser.Do, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode While() { return getToken(JasperParser.While, 0); }
		public TerminalNode LPAREN() { return getToken(JasperParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JasperParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(JasperParser.SEMI, 0); }
		public LoopThenElseContext loopThenElse() {
			return getRuleContext(LoopThenElseContext.class,0);
		}
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitDoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitDoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2396);
			match(Do);
			setState(2397);
			block();
			setState(2398);
			match(While);
			setState(2399);
			match(LPAREN);
			setState(2400);
			expression();
			setState(2401);
			match(RPAREN);
			setState(2402);
			match(SEMI);
			setState(2404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				{
				setState(2403);
				loopThenElse();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(JasperParser.For, 0); }
		public TerminalNode LPAREN() { return getToken(JasperParser.LPAREN, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JasperParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LoopThenElseContext loopThenElse() {
			return getRuleContext(LoopThenElseContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2406);
			match(For);
			setState(2407);
			match(LPAREN);
			setState(2408);
			forControl();
			setState(2409);
			match(RPAREN);
			setState(2410);
			block();
			setState(2412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
			case 1:
				{
				setState(2411);
				loopThenElse();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForClassicInitContext extends ParserRuleContext {
		public ForClassicInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClassicInit; }
	 
		public ForClassicInitContext() { }
		public void copyFrom(ForClassicInitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForClassicInitDeclContext extends ForClassicInitContext {
		public Token kind;
		public VarDeclaratorContext varDeclarator;
		public List<VarDeclaratorContext> decls = new ArrayList<VarDeclaratorContext>();
		public List<VarDeclaratorContext> varDeclarator() {
			return getRuleContexts(VarDeclaratorContext.class);
		}
		public VarDeclaratorContext varDeclarator(int i) {
			return getRuleContext(VarDeclaratorContext.class,i);
		}
		public TerminalNode Var() { return getToken(JasperParser.Var, 0); }
		public TerminalNode Const() { return getToken(JasperParser.Const, 0); }
		public TerminalNode Pointer() { return getToken(JasperParser.Pointer, 0); }
		public List<TerminalNode> COMMA() { return getTokens(JasperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JasperParser.COMMA, i);
		}
		public ForClassicInitDeclContext(ForClassicInitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterForClassicInitDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitForClassicInitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitForClassicInitDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForClassicInitExprsContext extends ForClassicInitContext {
		public StatementExpressionContext statementExpression;
		public List<StatementExpressionContext> exprs = new ArrayList<StatementExpressionContext>();
		public List<StatementExpressionContext> statementExpression() {
			return getRuleContexts(StatementExpressionContext.class);
		}
		public StatementExpressionContext statementExpression(int i) {
			return getRuleContext(StatementExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JasperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JasperParser.COMMA, i);
		}
		public ForClassicInitExprsContext(ForClassicInitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterForClassicInitExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitForClassicInitExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitForClassicInitExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClassicInitContext forClassicInit() throws RecognitionException {
		ForClassicInitContext _localctx = new ForClassicInitContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_forClassicInit);
		int _la;
		try {
			int _alt;
			setState(2437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				_localctx = new ForClassicInitDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2414);
				((ForClassicInitDeclContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1879048192L) != 0)) ) {
					((ForClassicInitDeclContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2415);
				((ForClassicInitDeclContext)_localctx).varDeclarator = varDeclarator();
				((ForClassicInitDeclContext)_localctx).decls.add(((ForClassicInitDeclContext)_localctx).varDeclarator);
				setState(2420);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2416);
						match(COMMA);
						setState(2417);
						((ForClassicInitDeclContext)_localctx).varDeclarator = varDeclarator();
						((ForClassicInitDeclContext)_localctx).decls.add(((ForClassicInitDeclContext)_localctx).varDeclarator);
						}
						} 
					}
					setState(2422);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
				}
				setState(2424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2423);
					match(COMMA);
					}
				}

				}
				break;
			case 2:
				_localctx = new ForClassicInitExprsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2426);
				((ForClassicInitExprsContext)_localctx).statementExpression = statementExpression();
				((ForClassicInitExprsContext)_localctx).exprs.add(((ForClassicInitExprsContext)_localctx).statementExpression);
				setState(2431);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,291,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2427);
						match(COMMA);
						setState(2428);
						((ForClassicInitExprsContext)_localctx).statementExpression = statementExpression();
						((ForClassicInitExprsContext)_localctx).exprs.add(((ForClassicInitExprsContext)_localctx).statementExpression);
						}
						} 
					}
					setState(2433);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,291,_ctx);
				}
				setState(2435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2434);
					match(COMMA);
					}
				}

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

	@SuppressWarnings("CheckReturnValue")
	public static class ForClassicUpdateContext extends ParserRuleContext {
		public ForClassicUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClassicUpdate; }
	 
		public ForClassicUpdateContext() { }
		public void copyFrom(ForClassicUpdateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForClassicUpdateExprsContext extends ForClassicUpdateContext {
		public StatementExpressionContext statementExpression;
		public List<StatementExpressionContext> exprs = new ArrayList<StatementExpressionContext>();
		public List<StatementExpressionContext> statementExpression() {
			return getRuleContexts(StatementExpressionContext.class);
		}
		public StatementExpressionContext statementExpression(int i) {
			return getRuleContext(StatementExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JasperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JasperParser.COMMA, i);
		}
		public ForClassicUpdateExprsContext(ForClassicUpdateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterForClassicUpdateExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitForClassicUpdateExprs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitForClassicUpdateExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClassicUpdateContext forClassicUpdate() throws RecognitionException {
		ForClassicUpdateContext _localctx = new ForClassicUpdateContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_forClassicUpdate);
		int _la;
		try {
			int _alt;
			_localctx = new ForClassicUpdateExprsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(2439);
			((ForClassicUpdateExprsContext)_localctx).statementExpression = statementExpression();
			((ForClassicUpdateExprsContext)_localctx).exprs.add(((ForClassicUpdateExprsContext)_localctx).statementExpression);
			setState(2444);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,294,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2440);
					match(COMMA);
					setState(2441);
					((ForClassicUpdateExprsContext)_localctx).statementExpression = statementExpression();
					((ForClassicUpdateExprsContext)_localctx).exprs.add(((ForClassicUpdateExprsContext)_localctx).statementExpression);
					}
					} 
				}
				setState(2446);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,294,_ctx);
			}
			setState(2448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2447);
				match(COMMA);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForClassicControlContext extends ParserRuleContext {
		public ForClassicInitContext init;
		public ExpressionContext cond;
		public ForClassicUpdateContext update;
		public List<TerminalNode> SEMI() { return getTokens(JasperParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JasperParser.SEMI, i);
		}
		public ForClassicInitContext forClassicInit() {
			return getRuleContext(ForClassicInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForClassicUpdateContext forClassicUpdate() {
			return getRuleContext(ForClassicUpdateContext.class,0);
		}
		public ForClassicControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClassicControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterForClassicControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitForClassicControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitForClassicControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClassicControlContext forClassicControl() throws RecognitionException {
		ForClassicControlContext _localctx = new ForClassicControlContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_forClassicControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			case 1:
				{
				setState(2450);
				((ForClassicControlContext)_localctx).init = forClassicInit();
				}
				break;
			}
			setState(2453);
			match(SEMI);
			setState(2455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
			case 1:
				{
				setState(2454);
				((ForClassicControlContext)_localctx).cond = expression();
				}
				break;
			}
			setState(2457);
			match(SEMI);
			setState(2459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
			case 1:
				{
				setState(2458);
				((ForClassicControlContext)_localctx).update = forClassicUpdate();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(JasperParser.Break, 0); }
		public TerminalNode SEMI() { return getToken(JasperParser.SEMI, 0); }
		public TerminalNode Identifier() { return getToken(JasperParser.Identifier, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2461);
			match(Break);
			setState(2463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(2462);
				match(Identifier);
				}
			}

			setState(2465);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Continue() { return getToken(JasperParser.Continue, 0); }
		public TerminalNode SEMI() { return getToken(JasperParser.SEMI, 0); }
		public TerminalNode Identifier() { return getToken(JasperParser.Identifier, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2467);
			match(Continue);
			setState(2469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(2468);
				match(Identifier);
				}
			}

			setState(2471);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(JasperParser.Return, 0); }
		public TerminalNode SEMI() { return getToken(JasperParser.SEMI, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2473);
			match(Return);
			setState(2475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
			case 1:
				{
				setState(2474);
				exprList();
				}
				break;
			}
			setState(2477);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(JasperParser.Throw, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(JasperParser.SEMI, 0); }
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2479);
			match(Throw);
			setState(2480);
			expression();
			setState(2481);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LockStatementContext extends ParserRuleContext {
		public TerminalNode Lock() { return getToken(JasperParser.Lock, 0); }
		public TerminalNode LPAREN() { return getToken(JasperParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JasperParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterLockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitLockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitLockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LockStatementContext lockStatement() throws RecognitionException {
		LockStatementContext _localctx = new LockStatementContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_lockStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2483);
			match(Lock);
			setState(2484);
			match(LPAREN);
			setState(2485);
			expression();
			setState(2486);
			match(RPAREN);
			setState(2487);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TryStatementContext extends ParserRuleContext {
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
	 
		public TryStatementContext() { }
		public void copyFrom(TryStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TryWithResourcesContext extends TryStatementContext {
		public TerminalNode Try() { return getToken(JasperParser.Try, 0); }
		public TerminalNode LPAREN() { return getToken(JasperParser.LPAREN, 0); }
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(JasperParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(JasperParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(JasperParser.SEMI, i);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public FinallyClauseContext finallyClause() {
			return getRuleContext(FinallyClauseContext.class,0);
		}
		public TryWithResourcesContext(TryStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTryWithResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTryWithResources(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTryWithResources(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TryFinallyContext extends TryStatementContext {
		public TerminalNode Try() { return getToken(JasperParser.Try, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyClauseContext finallyClause() {
			return getRuleContext(FinallyClauseContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public TryFinallyContext(TryStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTryFinally(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTryFinally(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTryFinally(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TryCatchesContext extends TryStatementContext {
		public TerminalNode Try() { return getToken(JasperParser.Try, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public TryCatchesContext(TryStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterTryCatches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitTryCatches(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitTryCatches(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_tryStatement);
		int _la;
		try {
			int _alt;
			setState(2530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
			case 1:
				_localctx = new TryCatchesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2489);
				match(Try);
				setState(2490);
				block();
				setState(2492); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2491);
						catchClause();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2494); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,302,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				_localctx = new TryFinallyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2496);
				match(Try);
				setState(2497);
				block();
				setState(2501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Catch) {
					{
					{
					setState(2498);
					catchClause();
					}
					}
					setState(2503);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2504);
				finallyClause();
				}
				break;
			case 3:
				_localctx = new TryWithResourcesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2506);
				match(Try);
				setState(2507);
				match(LPAREN);
				setState(2508);
				resource();
				setState(2513);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,304,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2509);
						match(SEMI);
						setState(2510);
						resource();
						}
						} 
					}
					setState(2515);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,304,_ctx);
				}
				setState(2517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(2516);
					match(SEMI);
					}
				}

				setState(2519);
				match(RPAREN);
				setState(2520);
				block();
				setState(2524);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2521);
						catchClause();
						}
						} 
					}
					setState(2526);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
				}
				setState(2528);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
				case 1:
					{
					setState(2527);
					finallyClause();
					}
					break;
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode Catch() { return getToken(JasperParser.Catch, 0); }
		public TerminalNode LPAREN() { return getToken(JasperParser.LPAREN, 0); }
		public CatchBindingContext catchBinding() {
			return getRuleContext(CatchBindingContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JasperParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitCatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitCatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2532);
			match(Catch);
			setState(2533);
			match(LPAREN);
			setState(2537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 74779944552321L) != 0) || _la==AT) {
				{
				{
				setState(2534);
				modifier();
				}
				}
				setState(2539);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2540);
			catchBinding();
			setState(2541);
			match(RPAREN);
			setState(2542);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FinallyClauseContext extends ParserRuleContext {
		public TerminalNode Finally() { return getToken(JasperParser.Finally, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterFinallyClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitFinallyClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitFinallyClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyClauseContext finallyClause() throws RecognitionException {
		FinallyClauseContext _localctx = new FinallyClauseContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_finallyClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2544);
			match(Finally);
			setState(2545);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ResourceContext extends ParserRuleContext {
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
	 
		public ResourceContext() { }
		public void copyFrom(ResourceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ResourceTypedVarIdContext extends ResourceContext {
		public ModifierContext mods;
		public TypeOrPrimitiveContext typeRef;
		public VariableDeclaratorIdContext id;
		public ExpressionContext init;
		public TerminalNode ASSIGN() { return getToken(JasperParser.ASSIGN, 0); }
		public TypeOrPrimitiveContext typeOrPrimitive() {
			return getRuleContext(TypeOrPrimitiveContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ResourceTypedVarIdContext(ResourceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterResourceTypedVarId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitResourceTypedVarId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitResourceTypedVarId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ResourceVarLikeContext extends ResourceContext {
		public ModifierContext mods;
		public Token kind;
		public MaybeTypedBindingContext binding;
		public ExpressionContext init;
		public TerminalNode ASSIGN() { return getToken(JasperParser.ASSIGN, 0); }
		public MaybeTypedBindingContext maybeTypedBinding() {
			return getRuleContext(MaybeTypedBindingContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Var() { return getToken(JasperParser.Var, 0); }
		public TerminalNode Const() { return getToken(JasperParser.Const, 0); }
		public TerminalNode Pointer() { return getToken(JasperParser.Pointer, 0); }
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ResourceVarLikeContext(ResourceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterResourceVarLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitResourceVarLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitResourceVarLike(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ResourceTypedBindingContext extends ResourceContext {
		public ModifierContext mods;
		public TypedBindingContext binding;
		public ExpressionContext init;
		public TerminalNode ASSIGN() { return getToken(JasperParser.ASSIGN, 0); }
		public TypedBindingContext typedBinding() {
			return getRuleContext(TypedBindingContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ResourceTypedBindingContext(ResourceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterResourceTypedBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitResourceTypedBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitResourceTypedBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_resource);
		int _la;
		try {
			int _alt;
			setState(2579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
			case 1:
				_localctx = new ResourceTypedVarIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2550);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,310,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2547);
						((ResourceTypedVarIdContext)_localctx).mods = modifier();
						}
						} 
					}
					setState(2552);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,310,_ctx);
				}
				setState(2553);
				((ResourceTypedVarIdContext)_localctx).typeRef = typeOrPrimitive();
				setState(2554);
				((ResourceTypedVarIdContext)_localctx).id = variableDeclaratorId();
				setState(2555);
				match(ASSIGN);
				setState(2556);
				((ResourceTypedVarIdContext)_localctx).init = expression();
				}
				break;
			case 2:
				_localctx = new ResourceTypedBindingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 74779944552321L) != 0) || _la==AT) {
					{
					{
					setState(2558);
					((ResourceTypedBindingContext)_localctx).mods = modifier();
					}
					}
					setState(2563);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2564);
				((ResourceTypedBindingContext)_localctx).binding = typedBinding();
				setState(2565);
				match(ASSIGN);
				setState(2566);
				((ResourceTypedBindingContext)_localctx).init = expression();
				}
				break;
			case 3:
				_localctx = new ResourceVarLikeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 74779944552321L) != 0) || _la==AT) {
					{
					{
					setState(2568);
					((ResourceVarLikeContext)_localctx).mods = modifier();
					}
					}
					setState(2573);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2574);
				((ResourceVarLikeContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1879048192L) != 0)) ) {
					((ResourceVarLikeContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2575);
				((ResourceVarLikeContext)_localctx).binding = maybeTypedBinding();
				setState(2576);
				match(ASSIGN);
				setState(2577);
				((ResourceVarLikeContext)_localctx).init = expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class GoTargetContext extends ParserRuleContext {
		public GoTargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goTarget; }
	 
		public GoTargetContext() { }
		public void copyFrom(GoTargetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GoTargetLambdaContext extends GoTargetContext {
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public GoTargetLambdaContext(GoTargetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterGoTargetLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitGoTargetLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitGoTargetLambda(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GoTargetParenContext extends GoTargetContext {
		public TerminalNode LPAREN() { return getToken(JasperParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(JasperParser.RPAREN, 0); }
		public GoTargetParenContext(GoTargetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterGoTargetParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitGoTargetParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitGoTargetParen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GoTargetPrimaryContext extends GoTargetContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public GoTargetPrimaryContext(GoTargetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterGoTargetPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitGoTargetPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitGoTargetPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GoTargetBlockContext extends GoTargetContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public GoTargetBlockContext(GoTargetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterGoTargetBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitGoTargetBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitGoTargetBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoTargetContext goTarget() throws RecognitionException {
		GoTargetContext _localctx = new GoTargetContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_goTarget);
		try {
			setState(2588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
			case 1:
				_localctx = new GoTargetPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2581);
				primary();
				}
				break;
			case 2:
				_localctx = new GoTargetLambdaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2582);
				lambdaExpression();
				}
				break;
			case 3:
				_localctx = new GoTargetBlockContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2583);
				block();
				}
				break;
			case 4:
				_localctx = new GoTargetParenContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2584);
				match(LPAREN);
				setState(2585);
				expression();
				setState(2586);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForControlContext extends ParserRuleContext {
		public ForInControlContext forInControl() {
			return getRuleContext(ForInControlContext.class,0);
		}
		public ForClassicControlContext forClassicControl() {
			return getRuleContext(ForClassicControlContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_forControl);
		try {
			setState(2592);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2590);
				forInControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2591);
				forClassicControl();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForInControlContext extends ParserRuleContext {
		public ForInBindingContext forInBinding() {
			return getRuleContext(ForInBindingContext.class,0);
		}
		public TerminalNode In() { return getToken(JasperParser.In, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForInControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterForInControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitForInControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitForInControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInControlContext forInControl() throws RecognitionException {
		ForInControlContext _localctx = new ForInControlContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_forInControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2594);
			forInBinding();
			setState(2595);
			match(In);
			setState(2596);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForInBindingContext extends ParserRuleContext {
		public ForInDeclBindingContext forInDeclBinding() {
			return getRuleContext(ForInDeclBindingContext.class,0);
		}
		public List<BindingPatternNoTypeContext> bindingPatternNoType() {
			return getRuleContexts(BindingPatternNoTypeContext.class);
		}
		public BindingPatternNoTypeContext bindingPatternNoType(int i) {
			return getRuleContext(BindingPatternNoTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JasperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JasperParser.COMMA, i);
		}
		public ForInBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterForInBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitForInBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitForInBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInBindingContext forInBinding() throws RecognitionException {
		ForInBindingContext _localctx = new ForInBindingContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_forInBinding);
		int _la;
		try {
			int _alt;
			setState(2610);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
			case Const:
			case Pointer:
			case Abstract:
			case Public:
			case Protected:
			case Private:
			case Static:
			case Default:
			case Defer:
			case Lock:
			case Atomic:
			case Extern:
			case Final:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2598);
				forInDeclBinding();
				}
				break;
			case Underscore:
			case LPAREN:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2599);
				bindingPatternNoType();
				setState(2604);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,316,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2600);
						match(COMMA);
						setState(2601);
						bindingPatternNoType();
						}
						} 
					}
					setState(2606);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,316,_ctx);
				}
				setState(2608);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2607);
					match(COMMA);
					}
				}

				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForInDeclBindingContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(JasperParser.Var, 0); }
		public TerminalNode Const() { return getToken(JasperParser.Const, 0); }
		public TerminalNode Pointer() { return getToken(JasperParser.Pointer, 0); }
		public List<BindingPatternContext> bindingPattern() {
			return getRuleContexts(BindingPatternContext.class);
		}
		public BindingPatternContext bindingPattern(int i) {
			return getRuleContext(BindingPatternContext.class,i);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(JasperParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(JasperParser.COMMA, i);
		}
		public ForInDeclBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInDeclBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterForInDeclBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitForInDeclBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitForInDeclBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInDeclBindingContext forInDeclBinding() throws RecognitionException {
		ForInDeclBindingContext _localctx = new ForInDeclBindingContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_forInDeclBinding);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 74779944552321L) != 0) || _la==AT) {
				{
				{
				setState(2612);
				modifier();
				}
				}
				setState(2617);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2618);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1879048192L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			{
			setState(2619);
			bindingPattern();
			setState(2624);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,320,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2620);
					match(COMMA);
					setState(2621);
					bindingPattern();
					}
					} 
				}
				setState(2626);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,320,_ctx);
			}
			setState(2628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2627);
				match(COMMA);
				}
			}

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

	@SuppressWarnings("CheckReturnValue")
	public static class CatchTypeContext extends ParserRuleContext {
		public List<TypePostfixContext> typePostfix() {
			return getRuleContexts(TypePostfixContext.class);
		}
		public TypePostfixContext typePostfix(int i) {
			return getRuleContext(TypePostfixContext.class,i);
		}
		public List<TerminalNode> PIPE() { return getTokens(JasperParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(JasperParser.PIPE, i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JasperParserListener ) ((JasperParserListener)listener).exitCatchType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JasperParserVisitor ) return ((JasperParserVisitor<? extends T>)visitor).visitCatchType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2630);
			typePostfix();
			setState(2635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(2631);
				match(PIPE);
				setState(2632);
				typePostfix();
				}
				}
				setState(2637);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return softKeyword_sempred((SoftKeywordContext)_localctx, predIndex);
		case 37:
			return typeSoftModifier_sempred((TypeSoftModifierContext)_localctx, predIndex);
		case 156:
			return binaryExpression_sempred((BinaryExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean softKeyword_sempred(SoftKeywordContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return  _input.LT(1).getText().equals(kw) ;
		}
		return true;
	}
	private boolean typeSoftModifier_sempred(TypeSoftModifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return  "raw".equals(((TypeSoftModifierContext)_localctx).id.getText()) || "shared".equals(((TypeSoftModifierContext)_localctx).id.getText()) ;
		}
		return true;
	}
	private boolean binaryExpression_sempred(BinaryExpressionContext _localctx, int predIndex) {
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
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final String _serializedATNSegment0 =
		"\u0004\u0001\u009f\u0a4f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007"+
		"r\u0002s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007"+
		"w\u0002x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007"+
		"|\u0002}\u0007}\u0002~\u0007~\u0002\u007f\u0007\u007f\u0002\u0080\u0007"+
		"\u0080\u0002\u0081\u0007\u0081\u0002\u0082\u0007\u0082\u0002\u0083\u0007"+
		"\u0083\u0002\u0084\u0007\u0084\u0002\u0085\u0007\u0085\u0002\u0086\u0007"+
		"\u0086\u0002\u0087\u0007\u0087\u0002\u0088\u0007\u0088\u0002\u0089\u0007"+
		"\u0089\u0002\u008a\u0007\u008a\u0002\u008b\u0007\u008b\u0002\u008c\u0007"+
		"\u008c\u0002\u008d\u0007\u008d\u0002\u008e\u0007\u008e\u0002\u008f\u0007"+
		"\u008f\u0002\u0090\u0007\u0090\u0002\u0091\u0007\u0091\u0002\u0092\u0007"+
		"\u0092\u0002\u0093\u0007\u0093\u0002\u0094\u0007\u0094\u0002\u0095\u0007"+
		"\u0095\u0002\u0096\u0007\u0096\u0002\u0097\u0007\u0097\u0002\u0098\u0007"+
		"\u0098\u0002\u0099\u0007\u0099\u0002\u009a\u0007\u009a\u0002\u009b\u0007"+
		"\u009b\u0002\u009c\u0007\u009c\u0002\u009d\u0007\u009d\u0002\u009e\u0007"+
		"\u009e\u0002\u009f\u0007\u009f\u0002\u00a0\u0007\u00a0\u0002\u00a1\u0007"+
		"\u00a1\u0002\u00a2\u0007\u00a2\u0002\u00a3\u0007\u00a3\u0002\u00a4\u0007"+
		"\u00a4\u0002\u00a5\u0007\u00a5\u0002\u00a6\u0007\u00a6\u0002\u00a7\u0007"+
		"\u00a7\u0002\u00a8\u0007\u00a8\u0002\u00a9\u0007\u00a9\u0002\u00aa\u0007"+
		"\u00aa\u0002\u00ab\u0007\u00ab\u0002\u00ac\u0007\u00ac\u0002\u00ad\u0007"+
		"\u00ad\u0002\u00ae\u0007\u00ae\u0002\u00af\u0007\u00af\u0002\u00b0\u0007"+
		"\u00b0\u0002\u00b1\u0007\u00b1\u0002\u00b2\u0007\u00b2\u0002\u00b3\u0007"+
		"\u00b3\u0002\u00b4\u0007\u00b4\u0002\u00b5\u0007\u00b5\u0002\u00b6\u0007"+
		"\u00b6\u0002\u00b7\u0007\u00b7\u0002\u00b8\u0007\u00b8\u0002\u00b9\u0007"+
		"\u00b9\u0002\u00ba\u0007\u00ba\u0002\u00bb\u0007\u00bb\u0002\u00bc\u0007"+
		"\u00bc\u0002\u00bd\u0007\u00bd\u0002\u00be\u0007\u00be\u0002\u00bf\u0007"+
		"\u00bf\u0002\u00c0\u0007\u00c0\u0002\u00c1\u0007\u00c1\u0002\u00c2\u0007"+
		"\u00c2\u0002\u00c3\u0007\u00c3\u0002\u00c4\u0007\u00c4\u0002\u00c5\u0007"+
		"\u00c5\u0002\u00c6\u0007\u00c6\u0002\u00c7\u0007\u00c7\u0002\u00c8\u0007"+
		"\u00c8\u0002\u00c9\u0007\u00c9\u0002\u00ca\u0007\u00ca\u0002\u00cb\u0007"+
		"\u00cb\u0002\u00cc\u0007\u00cc\u0002\u00cd\u0007\u00cd\u0002\u00ce\u0007"+
		"\u00ce\u0002\u00cf\u0007\u00cf\u0002\u00d0\u0007\u00d0\u0002\u00d1\u0007"+
		"\u00d1\u0001\u0000\u0003\u0000\u01a6\b\u0000\u0001\u0000\u0005\u0000\u01a9"+
		"\b\u0000\n\u0000\f\u0000\u01ac\t\u0000\u0001\u0000\u0005\u0000\u01af\b"+
		"\u0000\n\u0000\f\u0000\u01b2\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0005\u0001\u01b7\b\u0001\n\u0001\f\u0001\u01ba\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u01d9\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u01f9\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004\u01ff\b\u0004\n\u0004\f\u0004\u0202\t\u0004\u0001\u0004\u0003\u0004"+
		"\u0205\b\u0004\u0003\u0004\u0207\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u020d\b\u0005\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u0211\b\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u0215\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u0219\b\u0007\u0001\u0007\u0005\u0007"+
		"\u021c\b\u0007\n\u0007\f\u0007\u021f\t\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0227\b\u0007\n"+
		"\u0007\f\u0007\u022a\t\u0007\u0001\u0007\u0003\u0007\u022d\b\u0007\u0003"+
		"\u0007\u022f\b\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0233\b\u0007"+
		"\u0001\u0007\u0003\u0007\u0236\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u023b\b\u0007\u0001\b\u0005\b\u023e\b\b\n\b\f\b\u0241\t\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0247\b\b\n\b\f\b\u024a\t\b\u0001"+
		"\b\u0003\b\u024d\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0005\u0017\u0271\b\u0017\n\u0017\f\u0017\u0274"+
		"\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u0288\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0005\u0019\u028f\b\u0019\n\u0019\f\u0019\u0292\t\u0019"+
		"\u0001\u0019\u0003\u0019\u0295\b\u0019\u0003\u0019\u0297\b\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u02a4"+
		"\b\u001b\n\u001b\f\u001b\u02a7\t\u001b\u0001\u001b\u0003\u001b\u02aa\b"+
		"\u001b\u0003\u001b\u02ac\b\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0005\u001d\u02be\b\u001d\n\u001d\f\u001d\u02c1\t\u001d\u0001\u001d"+
		"\u0003\u001d\u02c4\b\u001d\u0003\u001d\u02c6\b\u001d\u0001\u001d\u0003"+
		"\u001d\u02c9\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005"+
		"\u001e\u02cf\b\u001e\n\u001e\f\u001e\u02d2\t\u001e\u0001\u001e\u0003\u001e"+
		"\u02d5\b\u001e\u0003\u001e\u02d7\b\u001e\u0001\u001e\u0003\u001e\u02da"+
		"\b\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0005\u001f\u02df\b\u001f"+
		"\n\u001f\f\u001f\u02e2\t\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001"+
		" \u0005 \u02e9\b \n \f \u02ec\t \u0001!\u0001!\u0001\"\u0001\"\u0003\""+
		"\u02f2\b\"\u0001#\u0004#\u02f5\b#\u000b#\f#\u02f6\u0001$\u0004$\u02fa"+
		"\b$\u000b$\f$\u02fb\u0001%\u0001%\u0001%\u0001&\u0003&\u0302\b&\u0001"+
		"&\u0005&\u0305\b&\n&\f&\u0308\t&\u0001&\u0001&\u0001\'\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0004\'\u0316"+
		"\b\'\u000b\'\f\'\u0317\u0001\'\u0003\'\u031b\b\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u0324\b\'\n\'\f\'\u0327\t\'"+
		"\u0001\'\u0001\'\u0003\'\u032b\b\'\u0003\'\u032d\b\'\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0003(\u0334\b(\u0001)\u0001)\u0005)\u0338\b)\n)\f)\u033b"+
		"\t)\u0001)\u0001)\u0003)\u033f\b)\u0001)\u0005)\u0342\b)\n)\f)\u0345\t"+
		")\u0001)\u0001)\u0003)\u0349\b)\u0001*\u0001*\u0005*\u034d\b*\n*\f*\u0350"+
		"\t*\u0001*\u0005*\u0353\b*\n*\f*\u0356\t*\u0001+\u0001+\u0001+\u0001+"+
		"\u0005+\u035c\b+\n+\f+\u035f\t+\u0001+\u0003+\u0362\b+\u0001+\u0001+\u0001"+
		",\u0001,\u0001,\u0003,\u0369\b,\u0001-\u0001-\u0003-\u036d\b-\u0001.\u0001"+
		".\u0001.\u0001.\u0005.\u0373\b.\n.\f.\u0376\t.\u0001.\u0003.\u0379\b."+
		"\u0001.\u0001.\u0001/\u0005/\u037e\b/\n/\f/\u0381\t/\u0001/\u0001/\u0003"+
		"/\u0385\b/\u00010\u00010\u00010\u00010\u00050\u038b\b0\n0\f0\u038e\t0"+
		"\u00011\u00011\u00011\u00031\u0393\b1\u00012\u00012\u00012\u00012\u0003"+
		"2\u0399\b2\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00033\u03a7\b3\u00014\u00014\u00014\u00034\u03ac"+
		"\b4\u00015\u00015\u00035\u03b0\b5\u00015\u00015\u00016\u00016\u00016\u0005"+
		"6\u03b7\b6\n6\f6\u03ba\t6\u00016\u00016\u00016\u00016\u00056\u03c0\b6"+
		"\n6\f6\u03c3\t6\u00036\u03c5\b6\u00016\u00036\u03c8\b6\u00016\u00016\u0001"+
		"6\u00056\u03cd\b6\n6\f6\u03d0\t6\u00016\u00036\u03d3\b6\u00036\u03d5\b"+
		"6\u00017\u00017\u00037\u03d9\b7\u00018\u00018\u00018\u00018\u00019\u0001"+
		"9\u00019\u0001:\u0001:\u0003:\u03e4\b:\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0005;\u03ec\b;\n;\f;\u03ef\t;\u0001;\u0003;\u03f2\b;\u0003;"+
		"\u03f4\b;\u0001;\u0003;\u03f7\b;\u0001;\u0003;\u03fa\b;\u0001<\u0001<"+
		"\u0001<\u0001=\u0005=\u0400\b=\n=\f=\u0403\t=\u0001=\u0001=\u0001=\u0003"+
		"=\u0408\b=\u0001=\u0003=\u040b\b=\u0001=\u0003=\u040e\b=\u0001=\u0001"+
		"=\u0001>\u0001>\u0001>\u0001?\u0001?\u0001?\u0001?\u0005?\u0419\b?\n?"+
		"\f?\u041c\t?\u0001?\u0003?\u041f\b?\u0001@\u0001@\u0005@\u0423\b@\n@\f"+
		"@\u0426\t@\u0001@\u0001@\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0003A\u0434\bA\u0001B\u0005B\u0437\bB\nB\fB\u043a"+
		"\tB\u0001B\u0001B\u0001B\u0001B\u0005B\u0440\bB\nB\fB\u0443\tB\u0001B"+
		"\u0003B\u0446\bB\u0001B\u0001B\u0001C\u0005C\u044b\bC\nC\fC\u044e\tC\u0001"+
		"C\u0001C\u0001C\u0001C\u0001C\u0005C\u0455\bC\nC\fC\u0458\tC\u0001C\u0001"+
		"C\u0001C\u0001C\u0003C\u045e\bC\u0001D\u0001D\u0001D\u0001E\u0001E\u0001"+
		"E\u0001F\u0001F\u0003F\u0468\bF\u0001G\u0003G\u046b\bG\u0001G\u0001G\u0001"+
		"G\u0003G\u0470\bG\u0001G\u0005G\u0473\bG\nG\fG\u0476\tG\u0003G\u0478\b"+
		"G\u0001G\u0001G\u0001H\u0001H\u0004H\u047e\bH\u000bH\fH\u047f\u0001H\u0001"+
		"H\u0001I\u0001I\u0003I\u0486\bI\u0001I\u0001I\u0003I\u048a\bI\u0003I\u048c"+
		"\bI\u0001J\u0001J\u0001J\u0003J\u0491\bJ\u0001J\u0001J\u0001K\u0005K\u0496"+
		"\bK\nK\fK\u0499\tK\u0001K\u0001K\u0001K\u0001K\u0005K\u049f\bK\nK\fK\u04a2"+
		"\tK\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0005K\u04aa\bK\nK\fK\u04ad"+
		"\tK\u0001K\u0003K\u04b0\bK\u0003K\u04b2\bK\u0001K\u0001K\u0003K\u04b6"+
		"\bK\u0001K\u0003K\u04b9\bK\u0001K\u0003K\u04bc\bK\u0001L\u0001L\u0001"+
		"L\u0003L\u04c1\bL\u0001L\u0001L\u0005L\u04c5\bL\nL\fL\u04c8\tL\u0001L"+
		"\u0001L\u0001L\u0003L\u04cd\bL\u0003L\u04cf\bL\u0001M\u0001M\u0001M\u0001"+
		"M\u0001M\u0001M\u0001M\u0001M\u0003M\u04d9\bM\u0001M\u0001M\u0001M\u0005"+
		"M\u04de\bM\nM\fM\u04e1\tM\u0001N\u0001N\u0003N\u04e5\bN\u0001O\u0005O"+
		"\u04e8\bO\nO\fO\u04eb\tO\u0001O\u0001O\u0001O\u0001P\u0001P\u0001P\u0001"+
		"P\u0001P\u0005P\u04f5\bP\nP\fP\u04f8\tP\u0001P\u0003P\u04fb\bP\u0003P"+
		"\u04fd\bP\u0001P\u0001P\u0003P\u0501\bP\u0001Q\u0003Q\u0504\bQ\u0001Q"+
		"\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0003Q\u050e\bQ\u0001"+
		"Q\u0001Q\u0001R\u0001R\u0003R\u0514\bR\u0001R\u0005R\u0517\bR\nR\fR\u051a"+
		"\tR\u0001R\u0001R\u0001S\u0003S\u051f\bS\u0001S\u0001S\u0001S\u0001S\u0001"+
		"S\u0003S\u0526\bS\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0003"+
		"S\u052f\bS\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0003S\u0538"+
		"\bS\u0001S\u0001S\u0001S\u0001S\u0003S\u053e\bS\u0001T\u0005T\u0541\b"+
		"T\nT\fT\u0544\tT\u0001T\u0001T\u0001T\u0001T\u0001T\u0001U\u0005U\u054c"+
		"\bU\nU\fU\u054f\tU\u0001U\u0001U\u0001U\u0003U\u0554\bU\u0001U\u0001U"+
		"\u0001V\u0001V\u0001V\u0001V\u0005V\u055c\bV\nV\fV\u055f\tV\u0001V\u0003"+
		"V\u0562\bV\u0003V\u0564\bV\u0001V\u0003V\u0567\bV\u0001V\u0003V\u056a"+
		"\bV\u0001V\u0001V\u0001W\u0005W\u056f\bW\nW\fW\u0572\tW\u0001W\u0001W"+
		"\u0003W\u0576\bW\u0001W\u0003W\u0579\bW\u0001X\u0001X\u0005X\u057d\bX"+
		"\nX\fX\u0580\tX\u0001Y\u0005Y\u0583\bY\nY\fY\u0586\tY\u0001Y\u0001Y\u0001"+
		"Y\u0003Y\u058b\bY\u0001Y\u0003Y\u058e\bY\u0001Y\u0001Y\u0001Z\u0001Z\u0001"+
		"Z\u0001Z\u0005Z\u0596\bZ\nZ\fZ\u0599\tZ\u0001Z\u0003Z\u059c\bZ\u0001["+
		"\u0001[\u0005[\u05a0\b[\n[\f[\u05a3\t[\u0001[\u0001[\u0001\\\u0001\\\u0001"+
		"\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0003\\\u05b0\b\\\u0001"+
		"]\u0001]\u0001]\u0001]\u0001^\u0001^\u0001^\u0001_\u0005_\u05ba\b_\n_"+
		"\f_\u05bd\t_\u0001_\u0001_\u0001_\u0001_\u0005_\u05c3\b_\n_\f_\u05c6\t"+
		"_\u0001_\u0003_\u05c9\b_\u0001_\u0001_\u0001`\u0005`\u05ce\b`\n`\f`\u05d1"+
		"\t`\u0001`\u0001`\u0001`\u0001a\u0005a\u05d7\ba\na\fa\u05da\ta\u0001a"+
		"\u0001a\u0001a\u0001a\u0001a\u0001b\u0001b\u0005b\u05e3\bb\nb\fb\u05e6"+
		"\tb\u0001b\u0001b\u0001c\u0001c\u0001c\u0001c\u0003c\u05ee\bc\u0001c\u0001"+
		"c\u0003c\u05f2\bc\u0001c\u0003c\u05f5\bc\u0001d\u0001d\u0003d\u05f9\b"+
		"d\u0001e\u0005e\u05fc\be\ne\fe\u05ff\te\u0001e\u0001e\u0001e\u0001e\u0001"+
		"e\u0001e\u0005e\u0607\be\ne\fe\u060a\te\u0001e\u0003e\u060d\be\u0001e"+
		"\u0001e\u0001f\u0001f\u0001f\u0001g\u0001g\u0003g\u0616\bg\u0001g\u0003"+
		"g\u0619\bg\u0001h\u0001h\u0001h\u0005h\u061e\bh\nh\fh\u0621\th\u0001h"+
		"\u0003h\u0624\bh\u0001h\u0001h\u0001h\u0005h\u0629\bh\nh\fh\u062c\th\u0001"+
		"h\u0003h\u062f\bh\u0003h\u0631\bh\u0001i\u0005i\u0634\bi\ni\fi\u0637\t"+
		"i\u0001i\u0001i\u0001j\u0005j\u063c\bj\nj\fj\u063f\tj\u0001j\u0001j\u0005"+
		"j\u0643\bj\nj\fj\u0646\tj\u0001j\u0001j\u0001j\u0001j\u0003j\u064c\bj"+
		"\u0001k\u0005k\u064f\bk\nk\fk\u0652\tk\u0001k\u0001k\u0001k\u0003k\u0657"+
		"\bk\u0001k\u0001k\u0001l\u0001l\u0001l\u0001l\u0005l\u065f\bl\nl\fl\u0662"+
		"\tl\u0001l\u0003l\u0665\bl\u0001m\u0001m\u0003m\u0669\bm\u0001n\u0001"+
		"n\u0001n\u0001o\u0005o\u066f\bo\no\fo\u0672\to\u0001o\u0001o\u0001o\u0001"+
		"o\u0005o\u0678\bo\no\fo\u067b\to\u0001o\u0003o\u067e\bo\u0001p\u0001p"+
		"\u0001p\u0003p\u0683\bp\u0001q\u0001q\u0001q\u0003q\u0688\bq\u0001r\u0001"+
		"r\u0001r\u0005r\u068d\br\nr\fr\u0690\tr\u0001s\u0001s\u0003s\u0694\bs"+
		"\u0001t\u0001t\u0001t\u0003t\u0699\bt\u0001u\u0001u\u0001u\u0001u\u0001"+
		"v\u0001v\u0001v\u0003v\u06a2\bv\u0001w\u0001w\u0001x\u0001x\u0001x\u0001"+
		"x\u0005x\u06aa\bx\nx\fx\u06ad\tx\u0001y\u0001y\u0001y\u0001y\u0005y\u06b3"+
		"\by\ny\fy\u06b6\ty\u0001z\u0001z\u0001z\u0001z\u0003z\u06bc\bz\u0001{"+
		"\u0001{\u0001{\u0001{\u0001{\u0003{\u06c3\b{\u0001|\u0001|\u0001|\u0003"+
		"|\u06c8\b|\u0001}\u0001}\u0001~\u0001~\u0003~\u06ce\b~\u0001\u007f\u0001"+
		"\u007f\u0003\u007f\u06d2\b\u007f\u0001\u0080\u0001\u0080\u0003\u0080\u06d6"+
		"\b\u0080\u0001\u0081\u0001\u0081\u0001\u0081\u0001\u0081\u0004\u0081\u06dc"+
		"\b\u0081\u000b\u0081\f\u0081\u06dd\u0001\u0081\u0003\u0081\u06e1\b\u0081"+
		"\u0001\u0081\u0001\u0081\u0001\u0082\u0001\u0082\u0001\u0083\u0001\u0083"+
		"\u0001\u0083\u0001\u0083\u0004\u0083\u06eb\b\u0083\u000b\u0083\f\u0083"+
		"\u06ec\u0001\u0083\u0003\u0083\u06f0\b\u0083\u0001\u0083\u0001\u0083\u0001"+
		"\u0084\u0001\u0084\u0001\u0085\u0001\u0085\u0001\u0086\u0001\u0086\u0001"+
		"\u0087\u0001\u0087\u0001\u0087\u0005\u0087\u06fd\b\u0087\n\u0087\f\u0087"+
		"\u0700\t\u0087\u0001\u0087\u0003\u0087\u0703\b\u0087\u0001\u0088\u0001"+
		"\u0088\u0003\u0088\u0707\b\u0088\u0001\u0088\u0001\u0088\u0001\u0089\u0001"+
		"\u0089\u0001\u0089\u0005\u0089\u070e\b\u0089\n\u0089\f\u0089\u0711\t\u0089"+
		"\u0003\u0089\u0713\b\u0089\u0001\u008a\u0001\u008a\u0001\u008a\u0003\u008a"+
		"\u0718\b\u008a\u0001\u008a\u0001\u008a\u0003\u008a\u071c\b\u008a\u0001"+
		"\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0003\u008a\u0723"+
		"\b\u008a\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0005\u008b\u0729"+
		"\b\u008b\n\u008b\f\u008b\u072c\t\u008b\u0001\u008b\u0001\u008b\u0001\u008b"+
		"\u0001\u008b\u0001\u008b\u0001\u008b\u0005\u008b\u0734\b\u008b\n\u008b"+
		"\f\u008b\u0737\t\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b"+
		"\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b"+
		"\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b"+
		"\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b"+
		"\u0001\u008b\u0003\u008b\u0750\b\u008b\u0001\u008c\u0001\u008c\u0001\u008d"+
		"\u0001\u008d\u0001\u008e\u0001\u008e\u0001\u008e\u0001\u008e\u0001\u008e"+
		"\u0003\u008e\u075b\b\u008e\u0001\u008f\u0001\u008f\u0001\u008f\u0003\u008f"+
		"\u0760\b\u008f\u0001\u008f\u0001\u008f\u0001\u008f\u0001\u008f\u0001\u008f"+
		"\u0003\u008f\u0767\b\u008f\u0001\u008f\u0001\u008f\u0001\u008f\u0001\u008f"+
		"\u0001\u008f\u0001\u008f\u0003\u008f\u076f\b\u008f\u0001\u008f\u0001\u008f"+
		"\u0003\u008f\u0773\b\u008f\u0001\u008f\u0001\u008f\u0001\u008f\u0001\u008f"+
		"\u0001\u008f\u0005\u008f\u077a\b\u008f\n\u008f\f\u008f\u077d\t\u008f\u0001"+
		"\u008f\u0001\u008f\u0003\u008f\u0781\b\u008f\u0001\u008f\u0001\u008f\u0001"+
		"\u008f\u0001\u008f\u0001\u008f\u0003\u008f\u0788\b\u008f\u0001\u008f\u0001"+
		"\u008f\u0001\u008f\u0001\u008f\u0001\u008f\u0001\u008f\u0003\u008f\u0790"+
		"\b\u008f\u0001\u008f\u0001\u008f\u0001\u008f\u0001\u008f\u0001\u008f\u0003"+
		"\u008f\u0797\b\u008f\u0001\u008f\u0001\u008f\u0001\u008f\u0001\u008f\u0001"+
		"\u008f\u0001\u008f\u0003\u008f\u079f\b\u008f\u0001\u0090\u0001\u0090\u0003"+
		"\u0090\u07a3\b\u0090\u0001\u0090\u0005\u0090\u07a6\b\u0090\n\u0090\f\u0090"+
		"\u07a9\t\u0090\u0001\u0090\u0001\u0090\u0001\u0090\u0005\u0090\u07ae\b"+
		"\u0090\n\u0090\f\u0090\u07b1\t\u0090\u0001\u0090\u0005\u0090\u07b4\b\u0090"+
		"\n\u0090\f\u0090\u07b7\t\u0090\u0001\u0090\u0003\u0090\u07ba\b\u0090\u0001"+
		"\u0090\u0001\u0090\u0003\u0090\u07be\b\u0090\u0001\u0091\u0001\u0091\u0001"+
		"\u0091\u0003\u0091\u07c3\b\u0091\u0001\u0091\u0005\u0091\u07c6\b\u0091"+
		"\n\u0091\f\u0091\u07c9\t\u0091\u0001\u0091\u0001\u0091\u0001\u0091\u0005"+
		"\u0091\u07ce\b\u0091\n\u0091\f\u0091\u07d1\t\u0091\u0001\u0091\u0005\u0091"+
		"\u07d4\b\u0091\n\u0091\f\u0091\u07d7\t\u0091\u0001\u0091\u0003\u0091\u07da"+
		"\b\u0091\u0001\u0091\u0001\u0091\u0003\u0091\u07de\b\u0091\u0001\u0092"+
		"\u0001\u0092\u0001\u0092\u0001\u0092\u0003\u0092\u07e4\b\u0092\u0001\u0092"+
		"\u0001\u0092\u0001\u0092\u0001\u0092\u0003\u0092\u07ea\b\u0092\u0001\u0092"+
		"\u0001\u0092\u0001\u0092\u0001\u0092\u0001\u0092\u0001\u0092\u0001\u0092"+
		"\u0001\u0092\u0001\u0092\u0001\u0092\u0003\u0092\u07f6\b\u0092\u0001\u0093"+
		"\u0001\u0093\u0005\u0093\u07fa\b\u0093\n\u0093\f\u0093\u07fd\t\u0093\u0001"+
		"\u0094\u0001\u0094\u0004\u0094\u0801\b\u0094\u000b\u0094\f\u0094\u0802"+
		"\u0001\u0095\u0005\u0095\u0806\b\u0095\n\u0095\f\u0095\u0809\t\u0095\u0001"+
		"\u0095\u0001\u0095\u0001\u0095\u0001\u0095\u0001\u0096\u0001\u0096\u0003"+
		"\u0096\u0811\b\u0096\u0001\u0097\u0001\u0097\u0001\u0097\u0001\u0097\u0001"+
		"\u0098\u0001\u0098\u0001\u0098\u0001\u0098\u0001\u0098\u0005\u0098\u081c"+
		"\b\u0098\n\u0098\f\u0098\u081f\t\u0098\u0001\u0098\u0003\u0098\u0822\b"+
		"\u0098\u0003\u0098\u0824\b\u0098\u0001\u0098\u0001\u0098\u0001\u0098\u0001"+
		"\u0098\u0001\u0098\u0001\u0098\u0001\u0098\u0001\u0098\u0003\u0098\u082e"+
		"\b\u0098\u0001\u0098\u0003\u0098\u0831\b\u0098\u0001\u0099\u0001\u0099"+
		"\u0003\u0099\u0835\b\u0099\u0001\u009a\u0001\u009a\u0003\u009a\u0839\b"+
		"\u009a\u0001\u009b\u0001\u009b\u0001\u009b\u0001\u009b\u0001\u009b\u0001"+
		"\u009b\u0001\u009b\u0003\u009b\u0842\b\u009b\u0001\u009c\u0001\u009c\u0001"+
		"\u009c\u0001\u009c\u0001\u009c\u0001\u009c\u0001\u009c\u0001\u009c\u0001"+
		"\u009c\u0001\u009c\u0001\u009c\u0001\u009c\u0001\u009c\u0001\u009c\u0001"+
		"\u009c\u0001\u009c\u0001\u009c\u0001\u009c\u0001\u009c\u0001\u009c\u0001"+
		"\u009c\u0001\u009c\u0001\u009c\u0001\u009c\u0001\u009c\u0001\u009c\u0001"+
		"\u009c\u0001\u009c\u0001\u009c\u0001\u009c\u0001\u009c\u0001\u009c\u0001"+
		"\u009c\u0005\u009c\u0865\b\u009c\n\u009c\f\u009c\u0868\t\u009c\u0001\u009d"+
		"\u0001\u009d\u0001\u009d\u0001\u009d\u0001\u009d\u0003\u009d\u086f\b\u009d"+
		"\u0001\u009e\u0001\u009e\u0001\u009e\u0001\u009e\u0001\u009e\u0001\u009e"+
		"\u0001\u009e\u0001\u009e\u0001\u009e\u0003\u009e\u087a\b\u009e\u0001\u009f"+
		"\u0001\u009f\u0001\u009f\u0001\u00a0\u0001\u00a0\u0001\u00a0\u0001\u00a1"+
		"\u0001\u00a1\u0001\u00a1\u0001\u00a1\u0001\u00a1\u0001\u00a1\u0001\u00a1"+
		"\u0001\u00a1\u0001\u00a1\u0005\u00a1\u088b\b\u00a1\n\u00a1\f\u00a1\u088e"+
		"\t\u00a1\u0001\u00a1\u0001\u00a1\u0001\u00a1\u0003\u00a1\u0893\b\u00a1"+
		"\u0003\u00a1\u0895\b\u00a1\u0001\u00a2\u0001\u00a2\u0001\u00a2\u0001\u00a2"+
		"\u0001\u00a2\u0001\u00a3\u0001\u00a3\u0001\u00a4\u0001\u00a4\u0001\u00a4"+
		"\u0005\u00a4\u08a1\b\u00a4\n\u00a4\f\u00a4\u08a4\t\u00a4\u0001\u00a5\u0001"+
		"\u00a5\u0001\u00a5\u0005\u00a5\u08a9\b\u00a5\n\u00a5\f\u00a5\u08ac\t\u00a5"+
		"\u0001\u00a6\u0001\u00a6\u0001\u00a6\u0001\u00a6\u0001\u00a6\u0003\u00a6"+
		"\u08b3\b\u00a6\u0001\u00a7\u0001\u00a7\u0001\u00a7\u0001\u00a7\u0001\u00a8"+
		"\u0001\u00a8\u0003\u00a8\u08bb\b\u00a8\u0001\u00a9\u0001\u00a9\u0004\u00a9"+
		"\u08bf\b\u00a9\u000b\u00a9\f\u00a9\u08c0\u0001\u00aa\u0001\u00aa\u0001"+
		"\u00aa\u0001\u00aa\u0001\u00aa\u0001\u00aa\u0003\u00aa\u08c9\b\u00aa\u0001"+
		"\u00ab\u0001\u00ab\u0001\u00ac\u0001\u00ac\u0005\u00ac\u08cf\b\u00ac\n"+
		"\u00ac\f\u00ac\u08d2\t\u00ac\u0001\u00ac\u0001\u00ac\u0001\u00ad\u0001"+
		"\u00ad\u0001\u00ad\u0003\u00ad\u08d9\b\u00ad\u0001\u00ad\u0003\u00ad\u08dc"+
		"\b\u00ad\u0001\u00ae\u0001\u00ae\u0001\u00ae\u0001\u00ae\u0001\u00ae\u0001"+
		"\u00ae\u0001\u00ae\u0001\u00ae\u0001\u00ae\u0001\u00ae\u0001\u00ae\u0001"+
		"\u00ae\u0001\u00ae\u0001\u00ae\u0001\u00ae\u0001\u00ae\u0001\u00ae\u0001"+
		"\u00ae\u0001\u00ae\u0003\u00ae\u08f1\b\u00ae\u0001\u00af\u0001\u00af\u0001"+
		"\u00af\u0001\u00b0\u0001\u00b0\u0001\u00b0\u0001\u00b0\u0003\u00b0\u08fa"+
		"\b\u00b0\u0001\u00b1\u0001\u00b1\u0001\u00b1\u0003\u00b1\u08ff\b\u00b1"+
		"\u0001\u00b2\u0001\u00b2\u0001\u00b2\u0001\u00b2\u0001\u00b2\u0001\u00b3"+
		"\u0001\u00b3\u0001\u00b3\u0001\u00b4\u0001\u00b4\u0001\u00b4\u0001\u00b5"+
		"\u0001\u00b5\u0003\u00b5\u090e\b\u00b5\u0001\u00b5\u0001\u00b5\u0001\u00b5"+
		"\u0001\u00b6\u0001\u00b6\u0001\u00b6\u0001\u00b6\u0001\u00b6\u0001\u00b6"+
		"\u0003\u00b6\u0919\b\u00b6\u0001\u00b7\u0001\u00b7\u0001\u00b7\u0003\u00b7"+
		"\u091e\b\u00b7\u0001\u00b8\u0001\u00b8\u0001\u00b8\u0001\u00b8\u0001\u00b8"+
		"\u0001\u00b8\u0001\u00b8\u0001\u00b8\u0001\u00b8\u0001\u00b8\u0003\u00b8"+
		"\u092a\b\u00b8\u0001\u00b9\u0001\u00b9\u0001\u00b9\u0001\u00b9\u0001\u00b9"+
		"\u0001\u00b9\u0001\u00ba\u0001\u00ba\u0005\u00ba\u0934\b\u00ba\n\u00ba"+
		"\f\u00ba\u0937\t\u00ba\u0001\u00ba\u0001\u00ba\u0001\u00bb\u0001\u00bb"+
		"\u0001\u00bb\u0001\u00bb\u0005\u00bb\u093f\b\u00bb\n\u00bb\f\u00bb\u0942"+
		"\t\u00bb\u0001\u00bb\u0003\u00bb\u0945\b\u00bb\u0001\u00bb\u0003\u00bb"+
		"\u0948\b\u00bb\u0001\u00bb\u0001\u00bb\u0001\u00bb\u0001\u00bb\u0001\u00bb"+
		"\u0001\u00bb\u0003\u00bb\u0950\b\u00bb\u0001\u00bc\u0001\u00bc\u0001\u00bc"+
		"\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0001\u00bd"+
		"\u0003\u00bd\u095b\b\u00bd\u0001\u00be\u0001\u00be\u0001\u00be\u0001\u00be"+
		"\u0001\u00be\u0001\u00be\u0001\u00be\u0001\u00be\u0003\u00be\u0965\b\u00be"+
		"\u0001\u00bf\u0001\u00bf\u0001\u00bf\u0001\u00bf\u0001\u00bf\u0001\u00bf"+
		"\u0003\u00bf\u096d\b\u00bf\u0001\u00c0\u0001\u00c0\u0001\u00c0\u0001\u00c0"+
		"\u0005\u00c0\u0973\b\u00c0\n\u00c0\f\u00c0\u0976\t\u00c0\u0001\u00c0\u0003"+
		"\u00c0\u0979\b\u00c0\u0001\u00c0\u0001\u00c0\u0001\u00c0\u0005\u00c0\u097e"+
		"\b\u00c0\n\u00c0\f\u00c0\u0981\t\u00c0\u0001\u00c0\u0003\u00c0\u0984\b"+
		"\u00c0\u0003\u00c0\u0986\b\u00c0\u0001\u00c1\u0001\u00c1\u0001\u00c1\u0005"+
		"\u00c1\u098b\b\u00c1\n\u00c1\f\u00c1\u098e\t\u00c1\u0001\u00c1\u0003\u00c1"+
		"\u0991\b\u00c1\u0001\u00c2\u0003\u00c2\u0994\b\u00c2\u0001\u00c2\u0001"+
		"\u00c2\u0003\u00c2\u0998\b\u00c2\u0001\u00c2\u0001\u00c2\u0003\u00c2\u099c"+
		"\b\u00c2\u0001\u00c3\u0001\u00c3\u0003\u00c3\u09a0\b\u00c3\u0001\u00c3"+
		"\u0001\u00c3\u0001\u00c4\u0001\u00c4\u0003\u00c4\u09a6\b\u00c4\u0001\u00c4"+
		"\u0001\u00c4\u0001\u00c5\u0001\u00c5\u0003\u00c5\u09ac\b\u00c5\u0001\u00c5"+
		"\u0001\u00c5\u0001\u00c6\u0001\u00c6\u0001\u00c6\u0001\u00c6\u0001\u00c7"+
		"\u0001\u00c7\u0001\u00c7\u0001\u00c7\u0001\u00c7\u0001\u00c7\u0001\u00c8"+
		"\u0001\u00c8\u0001\u00c8\u0004\u00c8\u09bd\b\u00c8\u000b\u00c8\f\u00c8"+
		"\u09be\u0001\u00c8\u0001\u00c8\u0001\u00c8\u0005\u00c8\u09c4\b\u00c8\n"+
		"\u00c8\f\u00c8\u09c7\t\u00c8\u0001\u00c8\u0001\u00c8\u0001\u00c8\u0001"+
		"\u00c8\u0001\u00c8\u0001\u00c8\u0001\u00c8\u0005\u00c8\u09d0\b\u00c8\n"+
		"\u00c8\f\u00c8\u09d3\t\u00c8\u0001\u00c8\u0003\u00c8\u09d6\b\u00c8\u0001"+
		"\u00c8\u0001\u00c8\u0001\u00c8\u0005\u00c8\u09db\b\u00c8\n\u00c8\f\u00c8"+
		"\u09de\t\u00c8\u0001\u00c8\u0003\u00c8\u09e1\b\u00c8\u0003\u00c8\u09e3"+
		"\b\u00c8\u0001\u00c9\u0001\u00c9\u0001\u00c9\u0005\u00c9\u09e8\b\u00c9"+
		"\n\u00c9\f\u00c9\u09eb\t\u00c9\u0001\u00c9\u0001\u00c9\u0001\u00c9\u0001"+
		"\u00c9\u0001\u00ca\u0001\u00ca\u0001\u00ca\u0001\u00cb\u0005\u00cb\u09f5"+
		"\b\u00cb\n\u00cb\f\u00cb\u09f8\t\u00cb\u0001\u00cb\u0001\u00cb\u0001\u00cb"+
		"\u0001\u00cb\u0001\u00cb\u0001\u00cb\u0005\u00cb\u0a00\b\u00cb\n\u00cb"+
		"\f\u00cb\u0a03\t\u00cb\u0001\u00cb\u0001\u00cb\u0001\u00cb\u0001\u00cb"+
		"\u0001\u00cb\u0005\u00cb\u0a0a\b\u00cb\n\u00cb\f\u00cb\u0a0d\t\u00cb\u0001"+
		"\u00cb\u0001\u00cb\u0001\u00cb\u0001\u00cb\u0001\u00cb\u0003\u00cb\u0a14"+
		"\b\u00cb\u0001\u00cc\u0001\u00cc\u0001\u00cc\u0001\u00cc\u0001\u00cc\u0001"+
		"\u00cc\u0001\u00cc\u0003\u00cc\u0a1d\b\u00cc\u0001\u00cd\u0001\u00cd\u0003"+
		"\u00cd\u0a21\b\u00cd\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001"+
		"\u00cf\u0001\u00cf\u0001\u00cf\u0001\u00cf\u0005\u00cf\u0a2b\b\u00cf\n"+
		"\u00cf\f\u00cf\u0a2e\t\u00cf\u0001\u00cf\u0003\u00cf\u0a31\b\u00cf\u0003"+
		"\u00cf\u0a33\b\u00cf\u0001\u00d0\u0005\u00d0\u0a36\b\u00d0\n\u00d0\f\u00d0"+
		"\u0a39\t\u00d0\u0001\u00d0\u0001\u00d0\u0001\u00d0\u0001\u00d0\u0005\u00d0"+
		"\u0a3f\b\u00d0\n\u00d0\f\u00d0\u0a42\t\u00d0\u0001\u00d0\u0003\u00d0\u0a45"+
		"\b\u00d0\u0001\u00d1\u0001\u00d1\u0001\u00d1\u0005\u00d1\u0a4a\b\u00d1"+
		"\n\u00d1\f\u00d1\u0a4d\t\u00d1\u0001\u00d1\u0000\u0001\u0138\u00d2\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4"+
		"\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc"+
		"\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114"+
		"\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c"+
		"\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144"+
		"\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c"+
		"\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174"+
		"\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c"+
		"\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u0000"+
		"\u0012\u0001\u0000\u001c\u001e\u0001\u0000UX\u0002\u0000\u0001\u0015\u0019"+
		"\u0019\u0002\u0000\u0098\u0098\u009a\u009a\u0002\u0000hh\u0092\u0092\u0002"+
		"\u0000vv\u0097\u0097\u0002\u0000&&**\u0002\u0000\u001c\u001c\u001e\u001e"+
		"\u0002\u0000TT\u009c\u009c\u0001\u0000\u0092\u0094\u0001\u0000\u0090\u0091"+
		"\u0003\u0000kkmmoo\u0002\u0000tu\u008e\u008f\u0001\u0000rs\u0002\u0000"+
		"GGvv\u0002\u0000HHww\u0002\u0000II\u0095\u0095\u0005\u0000jjllnnx\u007f"+
		"\u008d\u008d\u0b48\u0000\u01a5\u0001\u0000\u0000\u0000\u0002\u01b8\u0001"+
		"\u0000\u0000\u0000\u0004\u01d8\u0001\u0000\u0000\u0000\u0006\u01f8\u0001"+
		"\u0000\u0000\u0000\b\u0206\u0001\u0000\u0000\u0000\n\u0208\u0001\u0000"+
		"\u0000\u0000\f\u0210\u0001\u0000\u0000\u0000\u000e\u023a\u0001\u0000\u0000"+
		"\u0000\u0010\u023f\u0001\u0000\u0000\u0000\u0012\u0250\u0001\u0000\u0000"+
		"\u0000\u0014\u0253\u0001\u0000\u0000\u0000\u0016\u0255\u0001\u0000\u0000"+
		"\u0000\u0018\u0257\u0001\u0000\u0000\u0000\u001a\u0259\u0001\u0000\u0000"+
		"\u0000\u001c\u025b\u0001\u0000\u0000\u0000\u001e\u025d\u0001\u0000\u0000"+
		"\u0000 \u025f\u0001\u0000\u0000\u0000\"\u0261\u0001\u0000\u0000\u0000"+
		"$\u0263\u0001\u0000\u0000\u0000&\u0265\u0001\u0000\u0000\u0000(\u0267"+
		"\u0001\u0000\u0000\u0000*\u0269\u0001\u0000\u0000\u0000,\u026b\u0001\u0000"+
		"\u0000\u0000.\u026d\u0001\u0000\u0000\u00000\u0287\u0001\u0000\u0000\u0000"+
		"2\u0289\u0001\u0000\u0000\u00004\u029a\u0001\u0000\u0000\u00006\u029e"+
		"\u0001\u0000\u0000\u00008\u02af\u0001\u0000\u0000\u0000:\u02c8\u0001\u0000"+
		"\u0000\u0000<\u02ca\u0001\u0000\u0000\u0000>\u02e0\u0001\u0000\u0000\u0000"+
		"@\u02e5\u0001\u0000\u0000\u0000B\u02ed\u0001\u0000\u0000\u0000D\u02f1"+
		"\u0001\u0000\u0000\u0000F\u02f4\u0001\u0000\u0000\u0000H\u02f9\u0001\u0000"+
		"\u0000\u0000J\u02fd\u0001\u0000\u0000\u0000L\u0301\u0001\u0000\u0000\u0000"+
		"N\u032c\u0001\u0000\u0000\u0000P\u0333\u0001\u0000\u0000\u0000R\u0348"+
		"\u0001\u0000\u0000\u0000T\u034a\u0001\u0000\u0000\u0000V\u0357\u0001\u0000"+
		"\u0000\u0000X\u0368\u0001\u0000\u0000\u0000Z\u036c\u0001\u0000\u0000\u0000"+
		"\\\u036e\u0001\u0000\u0000\u0000^\u037f\u0001\u0000\u0000\u0000`\u0386"+
		"\u0001\u0000\u0000\u0000b\u038f\u0001\u0000\u0000\u0000d\u0398\u0001\u0000"+
		"\u0000\u0000f\u03a6\u0001\u0000\u0000\u0000h\u03a8\u0001\u0000\u0000\u0000"+
		"j\u03ad\u0001\u0000\u0000\u0000l\u03d4\u0001\u0000\u0000\u0000n\u03d8"+
		"\u0001\u0000\u0000\u0000p\u03da\u0001\u0000\u0000\u0000r\u03de\u0001\u0000"+
		"\u0000\u0000t\u03e3\u0001\u0000\u0000\u0000v\u03f9\u0001\u0000\u0000\u0000"+
		"x\u03fb\u0001\u0000\u0000\u0000z\u0401\u0001\u0000\u0000\u0000|\u0411"+
		"\u0001\u0000\u0000\u0000~\u0414\u0001\u0000\u0000\u0000\u0080\u0420\u0001"+
		"\u0000\u0000\u0000\u0082\u0433\u0001\u0000\u0000\u0000\u0084\u0438\u0001"+
		"\u0000\u0000\u0000\u0086\u045d\u0001\u0000\u0000\u0000\u0088\u045f\u0001"+
		"\u0000\u0000\u0000\u008a\u0462\u0001\u0000\u0000\u0000\u008c\u0467\u0001"+
		"\u0000\u0000\u0000\u008e\u046a\u0001\u0000\u0000\u0000\u0090\u047b\u0001"+
		"\u0000\u0000\u0000\u0092\u048b\u0001\u0000\u0000\u0000\u0094\u048d\u0001"+
		"\u0000\u0000\u0000\u0096\u04bb\u0001\u0000\u0000\u0000\u0098\u04ce\u0001"+
		"\u0000\u0000\u0000\u009a\u04d0\u0001\u0000\u0000\u0000\u009c\u04e4\u0001"+
		"\u0000\u0000\u0000\u009e\u04e9\u0001\u0000\u0000\u0000\u00a0\u04ef\u0001"+
		"\u0000\u0000\u0000\u00a2\u0503\u0001\u0000\u0000\u0000\u00a4\u0511\u0001"+
		"\u0000\u0000\u0000\u00a6\u053d\u0001\u0000\u0000\u0000\u00a8\u0542\u0001"+
		"\u0000\u0000\u0000\u00aa\u054d\u0001\u0000\u0000\u0000\u00ac\u0557\u0001"+
		"\u0000\u0000\u0000\u00ae\u0570\u0001\u0000\u0000\u0000\u00b0\u057a\u0001"+
		"\u0000\u0000\u0000\u00b2\u0584\u0001\u0000\u0000\u0000\u00b4\u0591\u0001"+
		"\u0000\u0000\u0000\u00b6\u059d\u0001\u0000\u0000\u0000\u00b8\u05af\u0001"+
		"\u0000\u0000\u0000\u00ba\u05b1\u0001\u0000\u0000\u0000\u00bc\u05b5\u0001"+
		"\u0000\u0000\u0000\u00be\u05bb\u0001\u0000\u0000\u0000\u00c0\u05cf\u0001"+
		"\u0000\u0000\u0000\u00c2\u05d8\u0001\u0000\u0000\u0000\u00c4\u05e0\u0001"+
		"\u0000\u0000\u0000\u00c6\u05f4\u0001\u0000\u0000\u0000\u00c8\u05f8\u0001"+
		"\u0000\u0000\u0000\u00ca\u05fd\u0001\u0000\u0000\u0000\u00cc\u0610\u0001"+
		"\u0000\u0000\u0000\u00ce\u0618\u0001\u0000\u0000\u0000\u00d0\u0630\u0001"+
		"\u0000\u0000\u0000\u00d2\u0635\u0001\u0000\u0000\u0000\u00d4\u064b\u0001"+
		"\u0000\u0000\u0000\u00d6\u0650\u0001\u0000\u0000\u0000\u00d8\u065a\u0001"+
		"\u0000\u0000\u0000\u00da\u0668\u0001\u0000\u0000\u0000\u00dc\u066a\u0001"+
		"\u0000\u0000\u0000\u00de\u0670\u0001\u0000\u0000\u0000\u00e0\u067f\u0001"+
		"\u0000\u0000\u0000\u00e2\u0684\u0001\u0000\u0000\u0000\u00e4\u0689\u0001"+
		"\u0000\u0000\u0000\u00e6\u0693\u0001\u0000\u0000\u0000\u00e8\u0695\u0001"+
		"\u0000\u0000\u0000\u00ea\u069a\u0001\u0000\u0000\u0000\u00ec\u069e\u0001"+
		"\u0000\u0000\u0000\u00ee\u06a3\u0001\u0000\u0000\u0000\u00f0\u06a5\u0001"+
		"\u0000\u0000\u0000\u00f2\u06ae\u0001\u0000\u0000\u0000\u00f4\u06bb\u0001"+
		"\u0000\u0000\u0000\u00f6\u06c2\u0001\u0000\u0000\u0000\u00f8\u06c7\u0001"+
		"\u0000\u0000\u0000\u00fa\u06c9\u0001\u0000\u0000\u0000\u00fc\u06cd\u0001"+
		"\u0000\u0000\u0000\u00fe\u06d1\u0001\u0000\u0000\u0000\u0100\u06d5\u0001"+
		"\u0000\u0000\u0000\u0102\u06d7\u0001\u0000\u0000\u0000\u0104\u06e4\u0001"+
		"\u0000\u0000\u0000\u0106\u06e6\u0001\u0000\u0000\u0000\u0108\u06f3\u0001"+
		"\u0000\u0000\u0000\u010a\u06f5\u0001\u0000\u0000\u0000\u010c\u06f7\u0001"+
		"\u0000\u0000\u0000\u010e\u06f9\u0001\u0000\u0000\u0000\u0110\u0704\u0001"+
		"\u0000\u0000\u0000\u0112\u0712\u0001\u0000\u0000\u0000\u0114\u0722\u0001"+
		"\u0000\u0000\u0000\u0116\u074f\u0001\u0000\u0000\u0000\u0118\u0751\u0001"+
		"\u0000\u0000\u0000\u011a\u0753\u0001\u0000\u0000\u0000\u011c\u075a\u0001"+
		"\u0000\u0000\u0000\u011e\u079e\u0001\u0000\u0000\u0000\u0120\u07a0\u0001"+
		"\u0000\u0000\u0000\u0122\u07bf\u0001\u0000\u0000\u0000\u0124\u07f5\u0001"+
		"\u0000\u0000\u0000\u0126\u07f7\u0001\u0000\u0000\u0000\u0128\u0800\u0001"+
		"\u0000\u0000\u0000\u012a\u0807\u0001\u0000\u0000\u0000\u012c\u0810\u0001"+
		"\u0000\u0000\u0000\u012e\u0812\u0001\u0000\u0000\u0000\u0130\u0830\u0001"+
		"\u0000\u0000\u0000\u0132\u0834\u0001\u0000\u0000\u0000\u0134\u0838\u0001"+
		"\u0000\u0000\u0000\u0136\u0841\u0001\u0000\u0000\u0000\u0138\u0843\u0001"+
		"\u0000\u0000\u0000\u013a\u086e\u0001\u0000\u0000\u0000\u013c\u0879\u0001"+
		"\u0000\u0000\u0000\u013e\u087b\u0001\u0000\u0000\u0000\u0140\u087e\u0001"+
		"\u0000\u0000\u0000\u0142\u0894\u0001\u0000\u0000\u0000\u0144\u0896\u0001"+
		"\u0000\u0000\u0000\u0146\u089b\u0001\u0000\u0000\u0000\u0148\u089d\u0001"+
		"\u0000\u0000\u0000\u014a\u08a5\u0001\u0000\u0000\u0000\u014c\u08b2\u0001"+
		"\u0000\u0000\u0000\u014e\u08b4\u0001\u0000\u0000\u0000\u0150\u08ba\u0001"+
		"\u0000\u0000\u0000\u0152\u08bc\u0001\u0000\u0000\u0000\u0154\u08c8\u0001"+
		"\u0000\u0000\u0000\u0156\u08ca\u0001\u0000\u0000\u0000\u0158\u08cc\u0001"+
		"\u0000\u0000\u0000\u015a\u08db\u0001\u0000\u0000\u0000\u015c\u08f0\u0001"+
		"\u0000\u0000\u0000\u015e\u08f2\u0001\u0000\u0000\u0000\u0160\u08f5\u0001"+
		"\u0000\u0000\u0000\u0162\u08fe\u0001\u0000\u0000\u0000\u0164\u0900\u0001"+
		"\u0000\u0000\u0000\u0166\u0905\u0001\u0000\u0000\u0000\u0168\u0908\u0001"+
		"\u0000\u0000\u0000\u016a\u090b\u0001\u0000\u0000\u0000\u016c\u0912\u0001"+
		"\u0000\u0000\u0000\u016e\u091a\u0001\u0000\u0000\u0000\u0170\u0929\u0001"+
		"\u0000\u0000\u0000\u0172\u092b\u0001\u0000\u0000\u0000\u0174\u0931\u0001"+
		"\u0000\u0000\u0000\u0176\u094f\u0001\u0000\u0000\u0000\u0178\u0951\u0001"+
		"\u0000\u0000\u0000\u017a\u0954\u0001\u0000\u0000\u0000\u017c\u095c\u0001"+
		"\u0000\u0000\u0000\u017e\u0966\u0001\u0000\u0000\u0000\u0180\u0985\u0001"+
		"\u0000\u0000\u0000\u0182\u0987\u0001\u0000\u0000\u0000\u0184\u0993\u0001"+
		"\u0000\u0000\u0000\u0186\u099d\u0001\u0000\u0000\u0000\u0188\u09a3\u0001"+
		"\u0000\u0000\u0000\u018a\u09a9\u0001\u0000\u0000\u0000\u018c\u09af\u0001"+
		"\u0000\u0000\u0000\u018e\u09b3\u0001\u0000\u0000\u0000\u0190\u09e2\u0001"+
		"\u0000\u0000\u0000\u0192\u09e4\u0001\u0000\u0000\u0000\u0194\u09f0\u0001"+
		"\u0000\u0000\u0000\u0196\u0a13\u0001\u0000\u0000\u0000\u0198\u0a1c\u0001"+
		"\u0000\u0000\u0000\u019a\u0a20\u0001\u0000\u0000\u0000\u019c\u0a22\u0001"+
		"\u0000\u0000\u0000\u019e\u0a32\u0001\u0000\u0000\u0000\u01a0\u0a37\u0001"+
		"\u0000\u0000\u0000\u01a2\u0a46\u0001\u0000\u0000\u0000\u01a4\u01a6\u0003"+
		"\u0002\u0001\u0000\u01a5\u01a4\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001"+
		"\u0000\u0000\u0000\u01a6\u01aa\u0001\u0000\u0000\u0000\u01a7\u01a9\u0003"+
		"\u0004\u0002\u0000\u01a8\u01a7\u0001\u0000\u0000\u0000\u01a9\u01ac\u0001"+
		"\u0000\u0000\u0000\u01aa\u01a8\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001"+
		"\u0000\u0000\u0000\u01ab\u01b0\u0001\u0000\u0000\u0000\u01ac\u01aa\u0001"+
		"\u0000\u0000\u0000\u01ad\u01af\u0003\f\u0006\u0000\u01ae\u01ad\u0001\u0000"+
		"\u0000\u0000\u01af\u01b2\u0001\u0000\u0000\u0000\u01b0\u01ae\u0001\u0000"+
		"\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000\u0000\u01b1\u01b3\u0001\u0000"+
		"\u0000\u0000\u01b2\u01b0\u0001\u0000\u0000\u0000\u01b3\u01b4\u0005\u0000"+
		"\u0000\u0001\u01b4\u0001\u0001\u0000\u0000\u0000\u01b5\u01b7\u0003f3\u0000"+
		"\u01b6\u01b5\u0001\u0000\u0000\u0000\u01b7\u01ba\u0001\u0000\u0000\u0000"+
		"\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000"+
		"\u01b9\u01bb\u0001\u0000\u0000\u0000\u01ba\u01b8\u0001\u0000\u0000\u0000"+
		"\u01bb\u01bc\u0005K\u0000\u0000\u01bc\u01bd\u0003.\u0017\u0000\u01bd\u01be"+
		"\u0005\u0086\u0000\u0000\u01be\u0003\u0001\u0000\u0000\u0000\u01bf\u01c0"+
		"\u0005L\u0000\u0000\u01c0\u01c1\u0003.\u0017\u0000\u01c1\u01c2\u0005\u0086"+
		"\u0000\u0000\u01c2\u01d9\u0001\u0000\u0000\u0000\u01c3\u01c4\u0005L\u0000"+
		"\u0000\u01c4\u01c5\u0003.\u0017\u0000\u01c5\u01c6\u0005\u0088\u0000\u0000"+
		"\u01c6\u01c7\u0005\u0092\u0000\u0000\u01c7\u01c8\u0005\u0086\u0000\u0000"+
		"\u01c8\u01d9\u0001\u0000\u0000\u0000\u01c9\u01ca\u0005L\u0000\u0000\u01ca"+
		"\u01cb\u0005/\u0000\u0000\u01cb\u01cc\u0003.\u0017\u0000\u01cc\u01cd\u0005"+
		"\u0088\u0000\u0000\u01cd\u01ce\u0005\u009c\u0000\u0000\u01ce\u01cf\u0005"+
		"\u0086\u0000\u0000\u01cf\u01d9\u0001\u0000\u0000\u0000\u01d0\u01d1\u0005"+
		"L\u0000\u0000\u01d1\u01d2\u0005/\u0000\u0000\u01d2\u01d3\u0003.\u0017"+
		"\u0000\u01d3\u01d4\u0005\u0088\u0000\u0000\u01d4\u01d5\u0005\u0092\u0000"+
		"\u0000\u01d5\u01d6\u0005\u0086\u0000\u0000\u01d6\u01d9\u0001\u0000\u0000"+
		"\u0000\u01d7\u01d9\u0003\u0006\u0003\u0000\u01d8\u01bf\u0001\u0000\u0000"+
		"\u0000\u01d8\u01c3\u0001\u0000\u0000\u0000\u01d8\u01c9\u0001\u0000\u0000"+
		"\u0000\u01d8\u01d0\u0001\u0000\u0000\u0000\u01d8\u01d7\u0001\u0000\u0000"+
		"\u0000\u01d9\u0005\u0001\u0000\u0000\u0000\u01da\u01db\u0003\u001c\u000e"+
		"\u0000\u01db\u01dc\u0003.\u0017\u0000\u01dc\u01dd\u0005L\u0000\u0000\u01dd"+
		"\u01de\u0003\b\u0004\u0000\u01de\u01df\u0005\u0086\u0000\u0000\u01df\u01f9"+
		"\u0001\u0000\u0000\u0000\u01e0\u01e1\u0003\u001c\u000e\u0000\u01e1\u01e2"+
		"\u0005Y\u0000\u0000\u01e2\u01e3\u0005L\u0000\u0000\u01e3\u01e4\u0003\b"+
		"\u0004\u0000\u01e4\u01e5\u0005\u0086\u0000\u0000\u01e5\u01f9\u0001\u0000"+
		"\u0000\u0000\u01e6\u01e7\u0003\u001c\u000e\u0000\u01e7\u01e8\u0005Z\u0000"+
		"\u0000\u01e8\u01e9\u0005L\u0000\u0000\u01e9\u01ea\u0003\b\u0004\u0000"+
		"\u01ea\u01eb\u0005\u0086\u0000\u0000\u01eb\u01f9\u0001\u0000\u0000\u0000"+
		"\u01ec\u01ed\u0003\u001c\u000e\u0000\u01ed\u01ee\u0005_\u0000\u0000\u01ee"+
		"\u01ef\u0005L\u0000\u0000\u01ef\u01f0\u0003\b\u0004\u0000\u01f0\u01f1"+
		"\u0005\u0086\u0000\u0000\u01f1\u01f9\u0001\u0000\u0000\u0000\u01f2\u01f3"+
		"\u0003\u001c\u000e\u0000\u01f3\u01f4\u0005`\u0000\u0000\u01f4\u01f5\u0005"+
		"L\u0000\u0000\u01f5\u01f6\u0003\b\u0004\u0000\u01f6\u01f7\u0005\u0086"+
		"\u0000\u0000\u01f7\u01f9\u0001\u0000\u0000\u0000\u01f8\u01da\u0001\u0000"+
		"\u0000\u0000\u01f8\u01e0\u0001\u0000\u0000\u0000\u01f8\u01e6\u0001\u0000"+
		"\u0000\u0000\u01f8\u01ec\u0001\u0000\u0000\u0000\u01f8\u01f2\u0001\u0000"+
		"\u0000\u0000\u01f9\u0007\u0001\u0000\u0000\u0000\u01fa\u0207\u0005\u0092"+
		"\u0000\u0000\u01fb\u0200\u0003\n\u0005\u0000\u01fc\u01fd\u0005\u0087\u0000"+
		"\u0000\u01fd\u01ff\u0003\n\u0005\u0000\u01fe\u01fc\u0001\u0000\u0000\u0000"+
		"\u01ff\u0202\u0001\u0000\u0000\u0000\u0200\u01fe\u0001\u0000\u0000\u0000"+
		"\u0200\u0201\u0001\u0000\u0000\u0000\u0201\u0204\u0001\u0000\u0000\u0000"+
		"\u0202\u0200\u0001\u0000\u0000\u0000\u0203\u0205\u0005\u0087\u0000\u0000"+
		"\u0204\u0203\u0001\u0000\u0000\u0000\u0204\u0205\u0001\u0000\u0000\u0000"+
		"\u0205\u0207\u0001\u0000\u0000\u0000\u0206\u01fa\u0001\u0000\u0000\u0000"+
		"\u0206\u01fb\u0001\u0000\u0000\u0000\u0207\t\u0001\u0000\u0000\u0000\u0208"+
		"\u020c\u0005\u009c\u0000\u0000\u0209\u020a\u0003\u001e\u000f\u0000\u020a"+
		"\u020b\u0005\u009c\u0000\u0000\u020b\u020d\u0001\u0000\u0000\u0000\u020c"+
		"\u0209\u0001\u0000\u0000\u0000\u020c\u020d\u0001\u0000\u0000\u0000\u020d"+
		"\u000b\u0001\u0000\u0000\u0000\u020e\u0211\u0003\u000e\u0007\u0000\u020f"+
		"\u0211\u0003\u015c\u00ae\u0000\u0210\u020e\u0001\u0000\u0000\u0000\u0210"+
		"\u020f\u0001\u0000\u0000\u0000\u0211\r\u0001\u0000\u0000\u0000\u0212\u0215"+
		"\u0003z=\u0000\u0213\u0215\u0003\u00aaU\u0000\u0214\u0212\u0001\u0000"+
		"\u0000\u0000\u0214\u0213\u0001\u0000\u0000\u0000\u0215\u023b\u0001\u0000"+
		"\u0000\u0000\u0216\u0219\u0003\u00b2Y\u0000\u0217\u0219\u0003\u00c2a\u0000"+
		"\u0218\u0216\u0001\u0000\u0000\u0000\u0218\u0217\u0001\u0000\u0000\u0000"+
		"\u0219\u023b\u0001\u0000\u0000\u0000\u021a\u021c\u0003f3\u0000\u021b\u021a"+
		"\u0001\u0000\u0000\u0000\u021c\u021f\u0001\u0000\u0000\u0000\u021d\u021b"+
		"\u0001\u0000\u0000\u0000\u021d\u021e\u0001\u0000\u0000\u0000\u021e\u0220"+
		"\u0001\u0000\u0000\u0000\u021f\u021d\u0001\u0000\u0000\u0000\u0220\u0221"+
		"\u0005!\u0000\u0000\u0221\u0222\u0005\u009c\u0000\u0000\u0222\u022e\u0005"+
		"\u0080\u0000\u0000\u0223\u0228\u0003\u00eau\u0000\u0224\u0225\u0005\u0087"+
		"\u0000\u0000\u0225\u0227\u0003\u00eau\u0000\u0226\u0224\u0001\u0000\u0000"+
		"\u0000\u0227\u022a\u0001\u0000\u0000\u0000\u0228\u0226\u0001\u0000\u0000"+
		"\u0000\u0228\u0229\u0001\u0000\u0000\u0000\u0229\u022c\u0001\u0000\u0000"+
		"\u0000\u022a\u0228\u0001\u0000\u0000\u0000\u022b\u022d\u0005\u0087\u0000"+
		"\u0000\u022c\u022b\u0001\u0000\u0000\u0000\u022c\u022d\u0001\u0000\u0000"+
		"\u0000\u022d\u022f\u0001\u0000\u0000\u0000\u022e\u0223\u0001\u0000\u0000"+
		"\u0000\u022e\u022f\u0001\u0000\u0000\u0000\u022f\u0230\u0001\u0000\u0000"+
		"\u0000\u0230\u0232\u0005\u0081\u0000\u0000\u0231\u0233\u0003\u00ccf\u0000"+
		"\u0232\u0231\u0001\u0000\u0000\u0000\u0232\u0233\u0001\u0000\u0000\u0000"+
		"\u0233\u0235\u0001\u0000\u0000\u0000\u0234\u0236\u0003\u00d8l\u0000\u0235"+
		"\u0234\u0001\u0000\u0000\u0000\u0235\u0236\u0001\u0000\u0000\u0000\u0236"+
		"\u0237\u0001\u0000\u0000\u0000\u0237\u023b\u0003\u009cN\u0000\u0238\u023b"+
		"\u0005\u0086\u0000\u0000\u0239\u023b\u0003\u0010\b\u0000\u023a\u0214\u0001"+
		"\u0000\u0000\u0000\u023a\u0218\u0001\u0000\u0000\u0000\u023a\u021d\u0001"+
		"\u0000\u0000\u0000\u023a\u0238\u0001\u0000\u0000\u0000\u023a\u0239\u0001"+
		"\u0000\u0000\u0000\u023b\u000f\u0001\u0000\u0000\u0000\u023c\u023e\u0003"+
		"f3\u0000\u023d\u023c\u0001\u0000\u0000\u0000\u023e\u0241\u0001\u0000\u0000"+
		"\u0000\u023f\u023d\u0001\u0000\u0000\u0000\u023f\u0240\u0001\u0000\u0000"+
		"\u0000\u0240\u0242\u0001\u0000\u0000\u0000\u0241\u023f\u0001\u0000\u0000"+
		"\u0000\u0242\u0243\u0007\u0000\u0000\u0000\u0243\u0248\u0003\u00e0p\u0000"+
		"\u0244\u0245\u0005\u0087\u0000\u0000\u0245\u0247\u0003\u00e0p\u0000\u0246"+
		"\u0244\u0001\u0000\u0000\u0000\u0247\u024a\u0001\u0000\u0000\u0000\u0248"+
		"\u0246\u0001\u0000\u0000\u0000\u0248\u0249\u0001\u0000\u0000\u0000\u0249"+
		"\u024c\u0001\u0000\u0000\u0000\u024a\u0248\u0001\u0000\u0000\u0000\u024b"+
		"\u024d\u0005\u0087\u0000\u0000\u024c\u024b\u0001\u0000\u0000\u0000\u024c"+
		"\u024d\u0001\u0000\u0000\u0000\u024d\u024e\u0001\u0000\u0000\u0000\u024e"+
		"\u024f\u0005\u0086\u0000\u0000\u024f\u0011\u0001\u0000\u0000\u0000\u0250"+
		"\u0251\u0004\t\u0000\u0000\u0251\u0252\u0005\u009c\u0000\u0000\u0252\u0013"+
		"\u0001\u0000\u0000\u0000\u0253\u0254\u0003\u0012\t\u0000\u0254\u0015\u0001"+
		"\u0000\u0000\u0000\u0255\u0256\u0003\u0012\t\u0000\u0256\u0017\u0001\u0000"+
		"\u0000\u0000\u0257\u0258\u0003\u0012\t\u0000\u0258\u0019\u0001\u0000\u0000"+
		"\u0000\u0259\u025a\u0003\u0012\t\u0000\u025a\u001b\u0001\u0000\u0000\u0000"+
		"\u025b\u025c\u0003\u0012\t\u0000\u025c\u001d\u0001\u0000\u0000\u0000\u025d"+
		"\u025e\u0003\u0012\t\u0000\u025e\u001f\u0001\u0000\u0000\u0000\u025f\u0260"+
		"\u0003\u0012\t\u0000\u0260!\u0001\u0000\u0000\u0000\u0261\u0262\u0003"+
		"\u0012\t\u0000\u0262#\u0001\u0000\u0000\u0000\u0263\u0264\u0003\u0012"+
		"\t\u0000\u0264%\u0001\u0000\u0000\u0000\u0265\u0266\u0003\u0012\t\u0000"+
		"\u0266\'\u0001\u0000\u0000\u0000\u0267\u0268\u0003\u0012\t\u0000\u0268"+
		")\u0001\u0000\u0000\u0000\u0269\u026a\u0003\u0012\t\u0000\u026a+\u0001"+
		"\u0000\u0000\u0000\u026b\u026c\u0003\u0012\t\u0000\u026c-\u0001\u0000"+
		"\u0000\u0000\u026d\u0272\u0005\u009c\u0000\u0000\u026e\u026f\u0005\u0088"+
		"\u0000\u0000\u026f\u0271\u0005\u009c\u0000\u0000\u0270\u026e\u0001\u0000"+
		"\u0000\u0000\u0271\u0274\u0001\u0000\u0000\u0000\u0272\u0270\u0001\u0000"+
		"\u0000\u0000\u0272\u0273\u0001\u0000\u0000\u0000\u0273/\u0001\u0000\u0000"+
		"\u0000\u0274\u0272\u0001\u0000\u0000\u0000\u0275\u0288\u0005U\u0000\u0000"+
		"\u0276\u0288\u0005V\u0000\u0000\u0277\u0288\u0005W\u0000\u0000\u0278\u0288"+
		"\u0005X\u0000\u0000\u0279\u0288\u0005Y\u0000\u0000\u027a\u0288\u0005Z"+
		"\u0000\u0000\u027b\u0288\u0005[\u0000\u0000\u027c\u0288\u0005\\\u0000"+
		"\u0000\u027d\u0288\u0005]\u0000\u0000\u027e\u0288\u0005^\u0000\u0000\u027f"+
		"\u0288\u0005_\u0000\u0000\u0280\u0288\u0005`\u0000\u0000\u0281\u0288\u0005"+
		"a\u0000\u0000\u0282\u0288\u0005\u001a\u0000\u0000\u0283\u0288\u0005\u001b"+
		"\u0000\u0000\u0284\u0288\u0005Q\u0000\u0000\u0285\u0288\u00032\u0019\u0000"+
		"\u0286\u0288\u00036\u001b\u0000\u0287\u0275\u0001\u0000\u0000\u0000\u0287"+
		"\u0276\u0001\u0000\u0000\u0000\u0287\u0277\u0001\u0000\u0000\u0000\u0287"+
		"\u0278\u0001\u0000\u0000\u0000\u0287\u0279\u0001\u0000\u0000\u0000\u0287"+
		"\u027a\u0001\u0000\u0000\u0000\u0287\u027b\u0001\u0000\u0000\u0000\u0287"+
		"\u027c\u0001\u0000\u0000\u0000\u0287\u027d\u0001\u0000\u0000\u0000\u0287"+
		"\u027e\u0001\u0000\u0000\u0000\u0287\u027f\u0001\u0000\u0000\u0000\u0287"+
		"\u0280\u0001\u0000\u0000\u0000\u0287\u0281\u0001\u0000\u0000\u0000\u0287"+
		"\u0282\u0001\u0000\u0000\u0000\u0287\u0283\u0001\u0000\u0000\u0000\u0287"+
		"\u0284\u0001\u0000\u0000\u0000\u0287\u0285\u0001\u0000\u0000\u0000\u0287"+
		"\u0286\u0001\u0000\u0000\u0000\u02881\u0001\u0000\u0000\u0000\u0289\u028a"+
		"\u0005P\u0000\u0000\u028a\u0296\u0005\u0084\u0000\u0000\u028b\u0290\u0003"+
		"4\u001a\u0000\u028c\u028d\u0005\u0087\u0000\u0000\u028d\u028f\u00034\u001a"+
		"\u0000\u028e\u028c\u0001\u0000\u0000\u0000\u028f\u0292\u0001\u0000\u0000"+
		"\u0000\u0290\u028e\u0001\u0000\u0000\u0000\u0290\u0291\u0001\u0000\u0000"+
		"\u0000\u0291\u0294\u0001\u0000\u0000\u0000\u0292\u0290\u0001\u0000\u0000"+
		"\u0000\u0293\u0295\u0005\u0087\u0000\u0000\u0294\u0293\u0001\u0000\u0000"+
		"\u0000\u0294\u0295\u0001\u0000\u0000\u0000\u0295\u0297\u0001\u0000\u0000"+
		"\u0000\u0296\u028b\u0001\u0000\u0000\u0000\u0296\u0297\u0001\u0000\u0000"+
		"\u0000\u0297\u0298\u0001\u0000\u0000\u0000\u0298\u0299\u0005\u0085\u0000"+
		"\u0000\u02993\u0001\u0000\u0000\u0000\u029a\u029b\u0003\u012c\u0096\u0000"+
		"\u029b\u029c\u0005\u0089\u0000\u0000\u029c\u029d\u0003\u012c\u0096\u0000"+
		"\u029d5\u0001\u0000\u0000\u0000\u029e\u029f\u0003\"\u0011\u0000\u029f"+
		"\u02ab\u0005\u0084\u0000\u0000\u02a0\u02a5\u00038\u001c\u0000\u02a1\u02a2"+
		"\u0005\u0087\u0000\u0000\u02a2\u02a4\u00038\u001c\u0000\u02a3\u02a1\u0001"+
		"\u0000\u0000\u0000\u02a4\u02a7\u0001\u0000\u0000\u0000\u02a5\u02a3\u0001"+
		"\u0000\u0000\u0000\u02a5\u02a6\u0001\u0000\u0000\u0000\u02a6\u02a9\u0001"+
		"\u0000\u0000\u0000\u02a7\u02a5\u0001\u0000\u0000\u0000\u02a8\u02aa\u0005"+
		"\u0087\u0000\u0000\u02a9\u02a8\u0001\u0000\u0000\u0000\u02a9\u02aa\u0001"+
		"\u0000\u0000\u0000\u02aa\u02ac\u0001\u0000\u0000\u0000\u02ab\u02a0\u0001"+
		"\u0000\u0000\u0000\u02ab\u02ac\u0001\u0000\u0000\u0000\u02ac\u02ad\u0001"+
		"\u0000\u0000\u0000\u02ad\u02ae\u0005\u0085\u0000\u0000\u02ae7\u0001\u0000"+
		"\u0000\u0000\u02af\u02b0\u0005Y\u0000\u0000\u02b0\u02b1\u0005\u0089\u0000"+
		"\u0000\u02b1\u02b2\u0003:\u001d\u0000\u02b29\u0001\u0000\u0000\u0000\u02b3"+
		"\u02c9\u0005Y\u0000\u0000\u02b4\u02c9\u0007\u0001\u0000\u0000\u02b5\u02c9"+
		"\u0005\u001a\u0000\u0000\u02b6\u02c9\u0005\u001b\u0000\u0000\u02b7\u02c9"+
		"\u0005Q\u0000\u0000\u02b8\u02c9\u00036\u001b\u0000\u02b9\u02c5\u0005\u0082"+
		"\u0000\u0000\u02ba\u02bf\u0003:\u001d\u0000\u02bb\u02bc\u0005\u0087\u0000"+
		"\u0000\u02bc\u02be\u0003:\u001d\u0000\u02bd\u02bb\u0001\u0000\u0000\u0000"+
		"\u02be\u02c1\u0001\u0000\u0000\u0000\u02bf\u02bd\u0001\u0000\u0000\u0000"+
		"\u02bf\u02c0\u0001\u0000\u0000\u0000\u02c0\u02c3\u0001\u0000\u0000\u0000"+
		"\u02c1\u02bf\u0001\u0000\u0000\u0000\u02c2\u02c4\u0005\u0087\u0000\u0000"+
		"\u02c3\u02c2\u0001\u0000\u0000\u0000\u02c3\u02c4\u0001\u0000\u0000\u0000"+
		"\u02c4\u02c6\u0001\u0000\u0000\u0000\u02c5\u02ba\u0001\u0000\u0000\u0000"+
		"\u02c5\u02c6\u0001\u0000\u0000\u0000\u02c6\u02c7\u0001\u0000\u0000\u0000"+
		"\u02c7\u02c9\u0005\u0083\u0000\u0000\u02c8\u02b3\u0001\u0000\u0000\u0000"+
		"\u02c8\u02b4\u0001\u0000\u0000\u0000\u02c8\u02b5\u0001\u0000\u0000\u0000"+
		"\u02c8\u02b6\u0001\u0000\u0000\u0000\u02c8\u02b7\u0001\u0000\u0000\u0000"+
		"\u02c8\u02b8\u0001\u0000\u0000\u0000\u02c8\u02b9\u0001\u0000\u0000\u0000"+
		"\u02c9;\u0001\u0000\u0000\u0000\u02ca\u02d6\u0005\u0084\u0000\u0000\u02cb"+
		"\u02d0\u0003\u00e6s\u0000\u02cc\u02cd\u0005\u0087\u0000\u0000\u02cd\u02cf"+
		"\u0003\u00e6s\u0000\u02ce\u02cc\u0001\u0000\u0000\u0000\u02cf\u02d2\u0001"+
		"\u0000\u0000\u0000\u02d0\u02ce\u0001\u0000\u0000\u0000\u02d0\u02d1\u0001"+
		"\u0000\u0000\u0000\u02d1\u02d4\u0001\u0000\u0000\u0000\u02d2\u02d0\u0001"+
		"\u0000\u0000\u0000\u02d3\u02d5\u0005\u0087\u0000\u0000\u02d4\u02d3\u0001"+
		"\u0000\u0000\u0000\u02d4\u02d5\u0001\u0000\u0000\u0000\u02d5\u02d7\u0001"+
		"\u0000\u0000\u0000\u02d6\u02cb\u0001\u0000\u0000\u0000\u02d6\u02d7\u0001"+
		"\u0000\u0000\u0000\u02d7\u02d9\u0001\u0000\u0000\u0000\u02d8\u02da\u0005"+
		"\u0087\u0000\u0000\u02d9\u02d8\u0001\u0000\u0000\u0000\u02d9\u02da\u0001"+
		"\u0000\u0000\u0000\u02da\u02db\u0001\u0000\u0000\u0000\u02db\u02dc\u0005"+
		"\u0085\u0000\u0000\u02dc=\u0001\u0000\u0000\u0000\u02dd\u02df\u0003h4"+
		"\u0000\u02de\u02dd\u0001\u0000\u0000\u0000\u02df\u02e2\u0001\u0000\u0000"+
		"\u0000\u02e0\u02de\u0001\u0000\u0000\u0000\u02e0\u02e1\u0001\u0000\u0000"+
		"\u0000\u02e1\u02e3\u0001\u0000\u0000\u0000\u02e2\u02e0\u0001\u0000\u0000"+
		"\u0000\u02e3\u02e4\u0007\u0002\u0000\u0000\u02e4?\u0001\u0000\u0000\u0000"+
		"\u02e5\u02ea\u0003T*\u0000\u02e6\u02e7\u0007\u0003\u0000\u0000\u02e7\u02e9"+
		"\u0003T*\u0000\u02e8\u02e6\u0001\u0000\u0000\u0000\u02e9\u02ec\u0001\u0000"+
		"\u0000\u0000\u02ea\u02e8\u0001\u0000\u0000\u0000\u02ea\u02eb\u0001\u0000"+
		"\u0000\u0000\u02ebA\u0001\u0000\u0000\u0000\u02ec\u02ea\u0001\u0000\u0000"+
		"\u0000\u02ed\u02ee\u0003@ \u0000\u02eeC\u0001\u0000\u0000\u0000\u02ef"+
		"\u02f2\u0003F#\u0000\u02f0\u02f2\u0003H$\u0000\u02f1\u02ef\u0001\u0000"+
		"\u0000\u0000\u02f1\u02f0\u0001\u0000\u0000\u0000\u02f2E\u0001\u0000\u0000"+
		"\u0000\u02f3\u02f5\u0007\u0004\u0000\u0000\u02f4\u02f3\u0001\u0000\u0000"+
		"\u0000\u02f5\u02f6\u0001\u0000\u0000\u0000\u02f6\u02f4\u0001\u0000\u0000"+
		"\u0000\u02f6\u02f7\u0001\u0000\u0000\u0000\u02f7G\u0001\u0000\u0000\u0000"+
		"\u02f8\u02fa\u0007\u0005\u0000\u0000\u02f9\u02f8\u0001\u0000\u0000\u0000"+
		"\u02fa\u02fb\u0001\u0000\u0000\u0000\u02fb\u02f9\u0001\u0000\u0000\u0000"+
		"\u02fb\u02fc\u0001\u0000\u0000\u0000\u02fcI\u0001\u0000\u0000\u0000\u02fd"+
		"\u02fe\u0005\u009c\u0000\u0000\u02fe\u02ff\u0004%\u0001\u0001\u02ffK\u0001"+
		"\u0000\u0000\u0000\u0300\u0302\u0003D\"\u0000\u0301\u0300\u0001\u0000"+
		"\u0000\u0000\u0301\u0302\u0001\u0000\u0000\u0000\u0302\u0306\u0001\u0000"+
		"\u0000\u0000\u0303\u0305\u0003J%\u0000\u0304\u0303\u0001\u0000\u0000\u0000"+
		"\u0305\u0308\u0001\u0000\u0000\u0000\u0306\u0304\u0001\u0000\u0000\u0000"+
		"\u0306\u0307\u0001\u0000\u0000\u0000\u0307\u0309\u0001\u0000\u0000\u0000"+
		"\u0308\u0306\u0001\u0000\u0000\u0000\u0309\u030a\u0003N\'\u0000\u030a"+
		"M\u0001\u0000\u0000\u0000\u030b\u032d\u0003>\u001f\u0000\u030c\u032d\u0005"+
		"\u0017\u0000\u0000\u030d\u032d\u0005\u0016\u0000\u0000\u030e\u032d\u0005"+
		"\u0018\u0000\u0000\u030f\u032d\u0005 \u0000\u0000\u0310\u032d\u0005\u001f"+
		"\u0000\u0000\u0311\u0312\u0005\u0080\u0000\u0000\u0312\u0315\u0003@ \u0000"+
		"\u0313\u0314\u0005\u0087\u0000\u0000\u0314\u0316\u0003@ \u0000\u0315\u0313"+
		"\u0001\u0000\u0000\u0000\u0316\u0317\u0001\u0000\u0000\u0000\u0317\u0315"+
		"\u0001\u0000\u0000\u0000\u0317\u0318\u0001\u0000\u0000\u0000\u0318\u031a"+
		"\u0001\u0000\u0000\u0000\u0319\u031b\u0005\u0087\u0000\u0000\u031a\u0319"+
		"\u0001\u0000\u0000\u0000\u031a\u031b\u0001\u0000\u0000\u0000\u031b\u031c"+
		"\u0001\u0000\u0000\u0000\u031c\u031d\u0005\u0081\u0000\u0000\u031d\u032d"+
		"\u0001\u0000\u0000\u0000\u031e\u031f\u0005\u0080\u0000\u0000\u031f\u0320"+
		"\u0003@ \u0000\u0320\u0321\u0005\u0081\u0000\u0000\u0321\u032d\u0001\u0000"+
		"\u0000\u0000\u0322\u0324\u0003h4\u0000\u0323\u0322\u0001\u0000\u0000\u0000"+
		"\u0324\u0327\u0001\u0000\u0000\u0000\u0325\u0323\u0001\u0000\u0000\u0000"+
		"\u0325\u0326\u0001\u0000\u0000\u0000\u0326\u0328\u0001\u0000\u0000\u0000"+
		"\u0327\u0325\u0001\u0000\u0000\u0000\u0328\u032a\u0005\u009c\u0000\u0000"+
		"\u0329\u032b\u0003V+\u0000\u032a\u0329\u0001\u0000\u0000\u0000\u032a\u032b"+
		"\u0001\u0000\u0000\u0000\u032b\u032d\u0001\u0000\u0000\u0000\u032c\u030b"+
		"\u0001\u0000\u0000\u0000\u032c\u030c\u0001\u0000\u0000\u0000\u032c\u030d"+
		"\u0001\u0000\u0000\u0000\u032c\u030e\u0001\u0000\u0000\u0000\u032c\u030f"+
		"\u0001\u0000\u0000\u0000\u032c\u0310\u0001\u0000\u0000\u0000\u032c\u0311"+
		"\u0001\u0000\u0000\u0000\u032c\u031e\u0001\u0000\u0000\u0000\u032c\u0325"+
		"\u0001\u0000\u0000\u0000\u032dO\u0001\u0000\u0000\u0000\u032e\u0334\u0005"+
		"f\u0000\u0000\u032f\u0330\u0005\u008a\u0000\u0000\u0330\u0334\u0005\u008a"+
		"\u0000\u0000\u0331\u0334\u0005\u008a\u0000\u0000\u0332\u0334\u0005\u0095"+
		"\u0000\u0000\u0333\u032e\u0001\u0000\u0000\u0000\u0333\u032f\u0001\u0000"+
		"\u0000\u0000\u0333\u0331\u0001\u0000\u0000\u0000\u0333\u0332\u0001\u0000"+
		"\u0000\u0000\u0334Q\u0001\u0000\u0000\u0000\u0335\u0339\u0005\u0088\u0000"+
		"\u0000\u0336\u0338\u0003h4\u0000\u0337\u0336\u0001\u0000\u0000\u0000\u0338"+
		"\u033b\u0001\u0000\u0000\u0000\u0339\u0337\u0001\u0000\u0000\u0000\u0339"+
		"\u033a\u0001\u0000\u0000\u0000\u033a\u033c\u0001\u0000\u0000\u0000\u033b"+
		"\u0339\u0001\u0000\u0000\u0000\u033c\u033e\u0005\u009c\u0000\u0000\u033d"+
		"\u033f\u0003V+\u0000\u033e\u033d\u0001\u0000\u0000\u0000\u033e\u033f\u0001"+
		"\u0000\u0000\u0000\u033f\u0349\u0001\u0000\u0000\u0000\u0340\u0342\u0003"+
		"h4\u0000\u0341\u0340\u0001\u0000\u0000\u0000\u0342\u0345\u0001\u0000\u0000"+
		"\u0000\u0343\u0341\u0001\u0000\u0000\u0000\u0343\u0344\u0001\u0000\u0000"+
		"\u0000\u0344\u0346\u0001\u0000\u0000\u0000\u0345\u0343\u0001\u0000\u0000"+
		"\u0000\u0346\u0347\u0005\u0082\u0000\u0000\u0347\u0349\u0005\u0083\u0000"+
		"\u0000\u0348\u0335\u0001\u0000\u0000\u0000\u0348\u0343\u0001\u0000\u0000"+
		"\u0000\u0349S\u0001\u0000\u0000\u0000\u034a\u034e\u0003L&\u0000\u034b"+
		"\u034d\u0003R)\u0000\u034c\u034b\u0001\u0000\u0000\u0000\u034d\u0350\u0001"+
		"\u0000\u0000\u0000\u034e\u034c\u0001\u0000\u0000\u0000\u034e\u034f\u0001"+
		"\u0000\u0000\u0000\u034f\u0354\u0001\u0000\u0000\u0000\u0350\u034e\u0001"+
		"\u0000\u0000\u0000\u0351\u0353\u0003P(\u0000\u0352\u0351\u0001\u0000\u0000"+
		"\u0000\u0353\u0356\u0001\u0000\u0000\u0000\u0354\u0352\u0001\u0000\u0000"+
		"\u0000\u0354\u0355\u0001\u0000\u0000\u0000\u0355U\u0001\u0000\u0000\u0000"+
		"\u0356\u0354\u0001\u0000\u0000\u0000\u0357\u0358\u0005\u008f\u0000\u0000"+
		"\u0358\u035d\u0003Z-\u0000\u0359\u035a\u0005\u0087\u0000\u0000\u035a\u035c"+
		"\u0003Z-\u0000\u035b\u0359\u0001\u0000\u0000\u0000\u035c\u035f\u0001\u0000"+
		"\u0000\u0000\u035d\u035b\u0001\u0000\u0000\u0000\u035d\u035e\u0001\u0000"+
		"\u0000\u0000\u035e\u0361\u0001\u0000\u0000\u0000\u035f\u035d\u0001\u0000"+
		"\u0000\u0000\u0360\u0362\u0005\u0087\u0000\u0000\u0361\u0360\u0001\u0000"+
		"\u0000\u0000\u0361\u0362\u0001\u0000\u0000\u0000\u0362\u0363\u0001\u0000"+
		"\u0000\u0000\u0363\u0364\u0005\u008e\u0000\u0000\u0364W\u0001\u0000\u0000"+
		"\u0000\u0365\u0369\u0003V+\u0000\u0366\u0367\u0005\u008f\u0000\u0000\u0367"+
		"\u0369\u0005\u008e\u0000\u0000\u0368\u0365\u0001\u0000\u0000\u0000\u0368"+
		"\u0366\u0001\u0000\u0000\u0000\u0369Y\u0001\u0000\u0000\u0000\u036a\u036d"+
		"\u0003@ \u0000\u036b\u036d\u0003b1\u0000\u036c\u036a\u0001\u0000\u0000"+
		"\u0000\u036c\u036b\u0001\u0000\u0000\u0000\u036d[\u0001\u0000\u0000\u0000"+
		"\u036e\u036f\u0005\u008f\u0000\u0000\u036f\u0374\u0003^/\u0000\u0370\u0371"+
		"\u0005\u0087\u0000\u0000\u0371\u0373\u0003^/\u0000\u0372\u0370\u0001\u0000"+
		"\u0000\u0000\u0373\u0376\u0001\u0000\u0000\u0000\u0374\u0372\u0001\u0000"+
		"\u0000\u0000\u0374\u0375\u0001\u0000\u0000\u0000\u0375\u0378\u0001\u0000"+
		"\u0000\u0000\u0376\u0374\u0001\u0000\u0000\u0000\u0377\u0379\u0005\u0087"+
		"\u0000\u0000\u0378\u0377\u0001\u0000\u0000\u0000\u0378\u0379\u0001\u0000"+
		"\u0000\u0000\u0379\u037a\u0001\u0000\u0000\u0000\u037a\u037b\u0005\u008e"+
		"\u0000\u0000\u037b]\u0001\u0000\u0000\u0000\u037c\u037e\u0003f3\u0000"+
		"\u037d\u037c\u0001\u0000\u0000\u0000\u037e\u0381\u0001\u0000\u0000\u0000"+
		"\u037f\u037d\u0001\u0000\u0000\u0000\u037f\u0380\u0001\u0000\u0000\u0000"+
		"\u0380\u0382\u0001\u0000\u0000\u0000\u0381\u037f\u0001\u0000\u0000\u0000"+
		"\u0382\u0384\u0005\u009c\u0000\u0000\u0383\u0385\u0003`0\u0000\u0384\u0383"+
		"\u0001\u0000\u0000\u0000\u0384\u0385\u0001\u0000\u0000\u0000\u0385_\u0001"+
		"\u0000\u0000\u0000\u0386\u0387\u0007\u0006\u0000\u0000\u0387\u038c\u0003"+
		"@ \u0000\u0388\u0389\u0005\u0097\u0000\u0000\u0389\u038b\u0003@ \u0000"+
		"\u038a\u0388\u0001\u0000\u0000\u0000\u038b\u038e\u0001\u0000\u0000\u0000"+
		"\u038c\u038a\u0001\u0000\u0000\u0000\u038c\u038d\u0001\u0000\u0000\u0000"+
		"\u038da\u0001\u0000\u0000\u0000\u038e\u038c\u0001\u0000\u0000\u0000\u038f"+
		"\u0392\u0005\u008a\u0000\u0000\u0390\u0391\u0007\u0006\u0000\u0000\u0391"+
		"\u0393\u0003@ \u0000\u0392\u0390\u0001\u0000\u0000\u0000\u0392\u0393\u0001"+
		"\u0000\u0000\u0000\u0393c\u0001\u0000\u0000\u0000\u0394\u0395\u0005&\u0000"+
		"\u0000\u0395\u0399\u0003@ \u0000\u0396\u0397\u0005*\u0000\u0000\u0397"+
		"\u0399\u0003T*\u0000\u0398\u0394\u0001\u0000\u0000\u0000\u0398\u0396\u0001"+
		"\u0000\u0000\u0000\u0399e\u0001\u0000\u0000\u0000\u039a\u03a7\u0003h4"+
		"\u0000\u039b\u03a7\u0005,\u0000\u0000\u039c\u03a7\u0005-\u0000\u0000\u039d"+
		"\u03a7\u0005.\u0000\u0000\u039e\u03a7\u0005%\u0000\u0000\u039f\u03a7\u0005"+
		"/\u0000\u0000\u03a0\u03a7\u0005S\u0000\u0000\u03a1\u03a7\u00058\u0000"+
		"\u0000\u03a2\u03a7\u0005O\u0000\u0000\u03a3\u03a7\u0005A\u0000\u0000\u03a4"+
		"\u03a7\u0005E\u0000\u0000\u03a5\u03a7\u0005F\u0000\u0000\u03a6\u039a\u0001"+
		"\u0000\u0000\u0000\u03a6\u039b\u0001\u0000\u0000\u0000\u03a6\u039c\u0001"+
		"\u0000\u0000\u0000\u03a6\u039d\u0001\u0000\u0000\u0000\u03a6\u039e\u0001"+
		"\u0000\u0000\u0000\u03a6\u039f\u0001\u0000\u0000\u0000\u03a6\u03a0\u0001"+
		"\u0000\u0000\u0000\u03a6\u03a1\u0001\u0000\u0000\u0000\u03a6\u03a2\u0001"+
		"\u0000\u0000\u0000\u03a6\u03a3\u0001\u0000\u0000\u0000\u03a6\u03a4\u0001"+
		"\u0000\u0000\u0000\u03a6\u03a5\u0001\u0000\u0000\u0000\u03a7g\u0001\u0000"+
		"\u0000\u0000\u03a8\u03a9\u0005\u008b\u0000\u0000\u03a9\u03ab\u0003.\u0017"+
		"\u0000\u03aa\u03ac\u0003j5\u0000\u03ab\u03aa\u0001\u0000\u0000\u0000\u03ab"+
		"\u03ac\u0001\u0000\u0000\u0000\u03aci\u0001\u0000\u0000\u0000\u03ad\u03af"+
		"\u0005\u0080\u0000\u0000\u03ae\u03b0\u0003l6\u0000\u03af\u03ae\u0001\u0000"+
		"\u0000\u0000\u03af\u03b0\u0001\u0000\u0000\u0000\u03b0\u03b1\u0001\u0000"+
		"\u0000\u0000\u03b1\u03b2\u0005\u0081\u0000\u0000\u03b2k\u0001\u0000\u0000"+
		"\u0000\u03b3\u03b8\u0003n7\u0000\u03b4\u03b5\u0005\u0087\u0000\u0000\u03b5"+
		"\u03b7\u0003n7\u0000\u03b6\u03b4\u0001\u0000\u0000\u0000\u03b7\u03ba\u0001"+
		"\u0000\u0000\u0000\u03b8\u03b6\u0001\u0000\u0000\u0000\u03b8\u03b9\u0001"+
		"\u0000\u0000\u0000\u03b9\u03c4\u0001\u0000\u0000\u0000\u03ba\u03b8\u0001"+
		"\u0000\u0000\u0000\u03bb\u03bc\u0005\u0087\u0000\u0000\u03bc\u03c1\u0003"+
		"p8\u0000\u03bd\u03be\u0005\u0087\u0000\u0000\u03be\u03c0\u0003p8\u0000"+
		"\u03bf\u03bd\u0001\u0000\u0000\u0000\u03c0\u03c3\u0001\u0000\u0000\u0000"+
		"\u03c1\u03bf\u0001\u0000\u0000\u0000\u03c1\u03c2\u0001\u0000\u0000\u0000"+
		"\u03c2\u03c5\u0001\u0000\u0000\u0000\u03c3\u03c1\u0001\u0000\u0000\u0000"+
		"\u03c4\u03bb\u0001\u0000\u0000\u0000\u03c4\u03c5\u0001\u0000\u0000\u0000"+
		"\u03c5\u03c7\u0001\u0000\u0000\u0000\u03c6\u03c8\u0005\u0087\u0000\u0000"+
		"\u03c7\u03c6\u0001\u0000\u0000\u0000\u03c7\u03c8\u0001\u0000\u0000\u0000"+
		"\u03c8\u03d5\u0001\u0000\u0000\u0000\u03c9\u03ce\u0003p8\u0000\u03ca\u03cb"+
		"\u0005\u0087\u0000\u0000\u03cb\u03cd\u0003p8\u0000\u03cc\u03ca\u0001\u0000"+
		"\u0000\u0000\u03cd\u03d0\u0001\u0000\u0000\u0000\u03ce\u03cc\u0001\u0000"+
		"\u0000\u0000\u03ce\u03cf\u0001\u0000\u0000\u0000\u03cf\u03d2\u0001\u0000"+
		"\u0000\u0000\u03d0\u03ce\u0001\u0000\u0000\u0000\u03d1\u03d3\u0005\u0087"+
		"\u0000\u0000\u03d2\u03d1\u0001\u0000\u0000\u0000\u03d2\u03d3\u0001\u0000"+
		"\u0000\u0000\u03d3\u03d5\u0001\u0000\u0000\u0000\u03d4\u03b3\u0001\u0000"+
		"\u0000\u0000\u03d4\u03c9\u0001\u0000\u0000\u0000\u03d5m\u0001\u0000\u0000"+
		"\u0000\u03d6\u03d9\u0003r9\u0000\u03d7\u03d9\u0003t:\u0000\u03d8\u03d6"+
		"\u0001\u0000\u0000\u0000\u03d8\u03d7\u0001\u0000\u0000\u0000\u03d9o\u0001"+
		"\u0000\u0000\u0000\u03da\u03db\u0005\u009c\u0000\u0000\u03db\u03dc\u0005"+
		"\u0089\u0000\u0000\u03dc\u03dd\u0003t:\u0000\u03ddq\u0001\u0000\u0000"+
		"\u0000\u03de\u03df\u0005b\u0000\u0000\u03df\u03e0\u0003\u012c\u0096\u0000"+
		"\u03e0s\u0001\u0000\u0000\u0000\u03e1\u03e4\u0003h4\u0000\u03e2\u03e4"+
		"\u0003\u012c\u0096\u0000\u03e3\u03e1\u0001\u0000\u0000\u0000\u03e3\u03e2"+
		"\u0001\u0000\u0000\u0000\u03e4u\u0001\u0000\u0000\u0000\u03e5\u03fa\u0003"+
		"\u012c\u0096\u0000\u03e6\u03fa\u0003h4\u0000\u03e7\u03f3\u0005\u0084\u0000"+
		"\u0000\u03e8\u03ed\u0003v;\u0000\u03e9\u03ea\u0005\u0087\u0000\u0000\u03ea"+
		"\u03ec\u0003v;\u0000\u03eb\u03e9\u0001\u0000\u0000\u0000\u03ec\u03ef\u0001"+
		"\u0000\u0000\u0000\u03ed\u03eb\u0001\u0000\u0000\u0000\u03ed\u03ee\u0001"+
		"\u0000\u0000\u0000\u03ee\u03f1\u0001\u0000\u0000\u0000\u03ef\u03ed\u0001"+
		"\u0000\u0000\u0000\u03f0\u03f2\u0005\u0087\u0000\u0000\u03f1\u03f0\u0001"+
		"\u0000\u0000\u0000\u03f1\u03f2\u0001\u0000\u0000\u0000\u03f2\u03f4\u0001"+
		"\u0000\u0000\u0000\u03f3\u03e8\u0001\u0000\u0000\u0000\u03f3\u03f4\u0001"+
		"\u0000\u0000\u0000\u03f4\u03f6\u0001\u0000\u0000\u0000\u03f5\u03f7\u0005"+
		"\u0087\u0000\u0000\u03f6\u03f5\u0001\u0000\u0000\u0000\u03f6\u03f7\u0001"+
		"\u0000\u0000\u0000\u03f7\u03f8\u0001\u0000\u0000\u0000\u03f8\u03fa\u0005"+
		"\u0085\u0000\u0000\u03f9\u03e5\u0001\u0000\u0000\u0000\u03f9\u03e6\u0001"+
		"\u0000\u0000\u0000\u03f9\u03e7\u0001\u0000\u0000\u0000\u03faw\u0001\u0000"+
		"\u0000\u0000\u03fb\u03fc\u00058\u0000\u0000\u03fc\u03fd\u0003v;\u0000"+
		"\u03fdy\u0001\u0000\u0000\u0000\u03fe\u0400\u0003f3\u0000\u03ff\u03fe"+
		"\u0001\u0000\u0000\u0000\u0400\u0403\u0001\u0000\u0000\u0000\u0401\u03ff"+
		"\u0001\u0000\u0000\u0000\u0401\u0402\u0001\u0000\u0000\u0000\u0402\u0404"+
		"\u0001\u0000\u0000\u0000\u0403\u0401\u0001\u0000\u0000\u0000\u0404\u0405"+
		"\u0005\"\u0000\u0000\u0405\u0407\u0005\u009c\u0000\u0000\u0406\u0408\u0003"+
		"\\.\u0000\u0407\u0406\u0001\u0000\u0000\u0000\u0407\u0408\u0001\u0000"+
		"\u0000\u0000\u0408\u040a\u0001\u0000\u0000\u0000\u0409\u040b\u0003|>\u0000"+
		"\u040a\u0409\u0001\u0000\u0000\u0000\u040a\u040b\u0001\u0000\u0000\u0000"+
		"\u040b\u040d\u0001\u0000\u0000\u0000\u040c\u040e\u0003~?\u0000\u040d\u040c"+
		"\u0001\u0000\u0000\u0000\u040d\u040e\u0001\u0000\u0000\u0000\u040e\u040f"+
		"\u0001\u0000\u0000\u0000\u040f\u0410\u0003\u0080@\u0000\u0410{\u0001\u0000"+
		"\u0000\u0000\u0411\u0412\u0005&\u0000\u0000\u0412\u0413\u0003T*\u0000"+
		"\u0413}\u0001\u0000\u0000\u0000\u0414\u0415\u0005\'\u0000\u0000\u0415"+
		"\u041a\u0003T*\u0000\u0416\u0417\u0005\u0087\u0000\u0000\u0417\u0419\u0003"+
		"T*\u0000\u0418\u0416\u0001\u0000\u0000\u0000\u0419\u041c\u0001\u0000\u0000"+
		"\u0000\u041a\u0418\u0001\u0000\u0000\u0000\u041a\u041b\u0001\u0000\u0000"+
		"\u0000\u041b\u041e\u0001\u0000\u0000\u0000\u041c\u041a\u0001\u0000\u0000"+
		"\u0000\u041d\u041f\u0005\u0087\u0000\u0000\u041e\u041d\u0001\u0000\u0000"+
		"\u0000\u041e\u041f\u0001\u0000\u0000\u0000\u041f\u007f\u0001\u0000\u0000"+
		"\u0000\u0420\u0424\u0005\u0084\u0000\u0000\u0421\u0423\u0003\u0082A\u0000"+
		"\u0422\u0421\u0001\u0000\u0000\u0000\u0423\u0426\u0001\u0000\u0000\u0000"+
		"\u0424\u0422\u0001\u0000\u0000\u0000\u0424\u0425\u0001\u0000\u0000\u0000"+
		"\u0425\u0427\u0001\u0000\u0000\u0000\u0426\u0424\u0001\u0000\u0000\u0000"+
		"\u0427\u0428\u0005\u0085\u0000\u0000\u0428\u0081\u0001\u0000\u0000\u0000"+
		"\u0429\u0434\u0003\u0084B\u0000\u042a\u0434\u0003\u0086C\u0000\u042b\u0434"+
		"\u0003\u009eO\u0000\u042c\u0434\u0003\u00a8T\u0000\u042d\u0434\u0003\u0096"+
		"K\u0000\u042e\u0434\u0003z=\u0000\u042f\u0434\u0003\u00aaU\u0000\u0430"+
		"\u0434\u0003\u00b2Y\u0000\u0431\u0434\u0003\u00c2a\u0000\u0432\u0434\u0005"+
		"\u0086\u0000\u0000\u0433\u0429\u0001\u0000\u0000\u0000\u0433\u042a\u0001"+
		"\u0000\u0000\u0000\u0433\u042b\u0001\u0000\u0000\u0000\u0433\u042c\u0001"+
		"\u0000\u0000\u0000\u0433\u042d\u0001\u0000\u0000\u0000\u0433\u042e\u0001"+
		"\u0000\u0000\u0000\u0433\u042f\u0001\u0000\u0000\u0000\u0433\u0430\u0001"+
		"\u0000\u0000\u0000\u0433\u0431\u0001\u0000\u0000\u0000\u0433\u0432\u0001"+
		"\u0000\u0000\u0000\u0434\u0083\u0001\u0000\u0000\u0000\u0435\u0437\u0003"+
		"f3\u0000\u0436\u0435\u0001\u0000\u0000\u0000\u0437\u043a\u0001\u0000\u0000"+
		"\u0000\u0438\u0436\u0001\u0000\u0000\u0000\u0438\u0439\u0001\u0000\u0000"+
		"\u0000\u0439\u043b\u0001\u0000\u0000\u0000\u043a\u0438\u0001\u0000\u0000"+
		"\u0000\u043b\u043c\u0007\u0000\u0000\u0000\u043c\u0441\u0003\u00e0p\u0000"+
		"\u043d\u043e\u0005\u0087\u0000\u0000\u043e\u0440\u0003\u00e0p\u0000\u043f"+
		"\u043d\u0001\u0000\u0000\u0000\u0440\u0443\u0001\u0000\u0000\u0000\u0441"+
		"\u043f\u0001\u0000\u0000\u0000\u0441\u0442\u0001\u0000\u0000\u0000\u0442"+
		"\u0445\u0001\u0000\u0000\u0000\u0443\u0441\u0001\u0000\u0000\u0000\u0444"+
		"\u0446\u0005\u0087\u0000\u0000\u0445\u0444\u0001\u0000\u0000\u0000\u0445"+
		"\u0446\u0001\u0000\u0000\u0000\u0446\u0447\u0001\u0000\u0000\u0000\u0447"+
		"\u0448\u0005\u0086\u0000\u0000\u0448\u0085\u0001\u0000\u0000\u0000\u0449"+
		"\u044b\u0003f3\u0000\u044a\u0449\u0001\u0000\u0000\u0000\u044b\u044e\u0001"+
		"\u0000\u0000\u0000\u044c\u044a\u0001\u0000\u0000\u0000\u044c\u044d\u0001"+
		"\u0000\u0000\u0000\u044d\u044f\u0001\u0000\u0000\u0000\u044e\u044c\u0001"+
		"\u0000\u0000\u0000\u044f\u0450\u0003\u0088D\u0000\u0450\u0451\u0003\u0090"+
		"H\u0000\u0451\u0452\u0005\u0086\u0000\u0000\u0452\u045e\u0001\u0000\u0000"+
		"\u0000\u0453\u0455\u0003f3\u0000\u0454\u0453\u0001\u0000\u0000\u0000\u0455"+
		"\u0458\u0001\u0000\u0000\u0000\u0456\u0454\u0001\u0000\u0000\u0000\u0456"+
		"\u0457\u0001\u0000\u0000\u0000\u0457\u0459\u0001\u0000\u0000\u0000\u0458"+
		"\u0456\u0001\u0000\u0000\u0000\u0459\u045a\u0003\u008aE\u0000\u045a\u045b"+
		"\u0003\u0094J\u0000\u045b\u045c\u0005\u0086\u0000\u0000\u045c\u045e\u0001"+
		"\u0000\u0000\u0000\u045d\u044c\u0001\u0000\u0000\u0000\u045d\u0456\u0001"+
		"\u0000\u0000\u0000\u045e\u0087\u0001\u0000\u0000\u0000\u045f\u0460\u0007"+
		"\u0007\u0000\u0000\u0460\u0461\u0003\u00e8t\u0000\u0461\u0089\u0001\u0000"+
		"\u0000\u0000\u0462\u0463\u0005\u001d\u0000\u0000\u0463\u0464\u0003\u00e8"+
		"t\u0000\u0464\u008b\u0001\u0000\u0000\u0000\u0465\u0468\u0003$\u0012\u0000"+
		"\u0466\u0468\u0003&\u0013\u0000\u0467\u0465\u0001\u0000\u0000\u0000\u0467"+
		"\u0466\u0001\u0000\u0000\u0000\u0468\u008d\u0001\u0000\u0000\u0000\u0469"+
		"\u046b\u0005\u008d\u0000\u0000\u046a\u0469\u0001\u0000\u0000\u0000\u046a"+
		"\u046b\u0001\u0000\u0000\u0000\u046b\u046c\u0001\u0000\u0000\u0000\u046c"+
		"\u0477\u0005\u0084\u0000\u0000\u046d\u0474\u0003\u008cF\u0000\u046e\u0470"+
		"\u0005\u0087\u0000\u0000\u046f\u046e\u0001\u0000\u0000\u0000\u046f\u0470"+
		"\u0001\u0000\u0000\u0000\u0470\u0471\u0001\u0000\u0000\u0000\u0471\u0473"+
		"\u0003\u008cF\u0000\u0472\u046f\u0001\u0000\u0000\u0000\u0473\u0476\u0001"+
		"\u0000\u0000\u0000\u0474\u0472\u0001\u0000\u0000\u0000\u0474\u0475\u0001"+
		"\u0000\u0000\u0000\u0475\u0478\u0001\u0000\u0000\u0000\u0476\u0474\u0001"+
		"\u0000\u0000\u0000\u0477\u046d\u0001\u0000\u0000\u0000\u0477\u0478\u0001"+
		"\u0000\u0000\u0000\u0478\u0479\u0001\u0000\u0000\u0000\u0479\u047a\u0005"+
		"\u0085\u0000\u0000\u047a\u008f\u0001\u0000\u0000\u0000\u047b\u047d\u0005"+
		"\u0084\u0000\u0000\u047c\u047e\u0003\u0092I\u0000\u047d\u047c\u0001\u0000"+
		"\u0000\u0000\u047e\u047f\u0001\u0000\u0000\u0000\u047f\u047d\u0001\u0000"+
		"\u0000\u0000\u047f\u0480\u0001\u0000\u0000\u0000\u0480\u0481\u0001\u0000"+
		"\u0000\u0000\u0481\u0482\u0005\u0085\u0000\u0000\u0482\u0091\u0001\u0000"+
		"\u0000\u0000\u0483\u0485\u0003$\u0012\u0000\u0484\u0486\u0005\u0086\u0000"+
		"\u0000\u0485\u0484\u0001\u0000\u0000\u0000\u0485\u0486\u0001\u0000\u0000"+
		"\u0000\u0486\u048c\u0001\u0000\u0000\u0000\u0487\u0489\u0003&\u0013\u0000"+
		"\u0488\u048a\u0005\u0086\u0000\u0000\u0489\u0488\u0001\u0000\u0000\u0000"+
		"\u0489\u048a\u0001\u0000\u0000\u0000\u048a\u048c\u0001\u0000\u0000\u0000"+
		"\u048b\u0483\u0001\u0000\u0000\u0000\u048b\u0487\u0001\u0000\u0000\u0000"+
		"\u048c\u0093\u0001\u0000\u0000\u0000\u048d\u048e\u0005\u0084\u0000\u0000"+
		"\u048e\u0490\u0003$\u0012\u0000\u048f\u0491\u0005\u0086\u0000\u0000\u0490"+
		"\u048f\u0001\u0000\u0000\u0000\u0490\u0491\u0001\u0000\u0000\u0000\u0491"+
		"\u0492\u0001\u0000\u0000\u0000\u0492\u0493\u0005\u0085\u0000\u0000\u0493"+
		"\u0095\u0001\u0000\u0000\u0000\u0494\u0496\u0003f3\u0000\u0495\u0494\u0001"+
		"\u0000\u0000\u0000\u0496\u0499\u0001\u0000\u0000\u0000\u0497\u0495\u0001"+
		"\u0000\u0000\u0000\u0497\u0498\u0001\u0000\u0000\u0000\u0498\u049a\u0001"+
		"\u0000\u0000\u0000\u0499\u0497\u0001\u0000\u0000\u0000\u049a\u049b\u0003"+
		"\u0098L\u0000\u049b\u049c\u0003\u009cN\u0000\u049c\u04bc\u0001\u0000\u0000"+
		"\u0000\u049d\u049f\u0003f3\u0000\u049e\u049d\u0001\u0000\u0000\u0000\u049f"+
		"\u04a2\u0001\u0000\u0000\u0000\u04a0\u049e\u0001\u0000\u0000\u0000\u04a0"+
		"\u04a1\u0001\u0000\u0000\u0000\u04a1\u04a3\u0001\u0000\u0000\u0000\u04a2"+
		"\u04a0\u0001\u0000\u0000\u0000\u04a3\u04a4\u0005!\u0000\u0000\u04a4\u04a5"+
		"\u0005\u009c\u0000\u0000\u04a5\u04b1\u0005\u0080\u0000\u0000\u04a6\u04ab"+
		"\u0003\u00eau\u0000\u04a7\u04a8\u0005\u0087\u0000\u0000\u04a8\u04aa\u0003"+
		"\u00eau\u0000\u04a9\u04a7\u0001\u0000\u0000\u0000\u04aa\u04ad\u0001\u0000"+
		"\u0000\u0000\u04ab\u04a9\u0001\u0000\u0000\u0000\u04ab\u04ac\u0001\u0000"+
		"\u0000\u0000\u04ac\u04af\u0001\u0000\u0000\u0000\u04ad\u04ab\u0001\u0000"+
		"\u0000\u0000\u04ae\u04b0\u0005\u0087\u0000\u0000\u04af\u04ae\u0001\u0000"+
		"\u0000\u0000\u04af\u04b0\u0001\u0000\u0000\u0000\u04b0\u04b2\u0001\u0000"+
		"\u0000\u0000\u04b1\u04a6\u0001\u0000\u0000\u0000\u04b1\u04b2\u0001\u0000"+
		"\u0000\u0000\u04b2\u04b3\u0001\u0000\u0000\u0000\u04b3\u04b5\u0005\u0081"+
		"\u0000\u0000\u04b4\u04b6\u0003\u00ccf\u0000\u04b5\u04b4\u0001\u0000\u0000"+
		"\u0000\u04b5\u04b6\u0001\u0000\u0000\u0000\u04b6\u04b8\u0001\u0000\u0000"+
		"\u0000\u04b7\u04b9\u0003\u00d8l\u0000\u04b8\u04b7\u0001\u0000\u0000\u0000"+
		"\u04b8\u04b9\u0001\u0000\u0000\u0000\u04b9\u04ba\u0001\u0000\u0000\u0000"+
		"\u04ba\u04bc\u0003\u009cN\u0000\u04bb\u0497\u0001\u0000\u0000\u0000\u04bb"+
		"\u04a0\u0001\u0000\u0000\u0000\u04bc\u0097\u0001\u0000\u0000\u0000\u04bd"+
		"\u04be\u0003\u00ceg\u0000\u04be\u04c0\u0003\u009aM\u0000\u04bf\u04c1\u0003"+
		"\u00d8l\u0000\u04c0\u04bf\u0001\u0000\u0000\u0000\u04c0\u04c1\u0001\u0000"+
		"\u0000\u0000\u04c1\u04cf\u0001\u0000\u0000\u0000\u04c2\u04c6\u0003\\."+
		"\u0000\u04c3\u04c5\u0003h4\u0000\u04c4\u04c3\u0001\u0000\u0000\u0000\u04c5"+
		"\u04c8\u0001\u0000\u0000\u0000\u04c6\u04c4\u0001\u0000\u0000\u0000\u04c6"+
		"\u04c7\u0001\u0000\u0000\u0000\u04c7\u04c9\u0001\u0000\u0000\u0000\u04c8"+
		"\u04c6\u0001\u0000\u0000\u0000\u04c9\u04ca\u0003\u00ceg\u0000\u04ca\u04cc"+
		"\u0003\u009aM\u0000\u04cb\u04cd\u0003\u00d8l\u0000\u04cc\u04cb\u0001\u0000"+
		"\u0000\u0000\u04cc\u04cd\u0001\u0000\u0000\u0000\u04cd\u04cf\u0001\u0000"+
		"\u0000\u0000\u04ce\u04bd\u0001\u0000\u0000\u0000\u04ce\u04c2\u0001\u0000"+
		"\u0000\u0000\u04cf\u0099\u0001\u0000\u0000\u0000\u04d0\u04d1\u0005\u009c"+
		"\u0000\u0000\u04d1\u04d8\u0005\u0080\u0000\u0000\u04d2\u04d9\u0003\u00d6"+
		"k\u0000\u04d3\u04d4\u0003\u00d0h\u0000\u04d4\u04d5\u0005\u0087\u0000\u0000"+
		"\u04d5\u04d6\u0003\u00d4j\u0000\u04d6\u04d9\u0001\u0000\u0000\u0000\u04d7"+
		"\u04d9\u0003\u00d4j\u0000\u04d8\u04d2\u0001\u0000\u0000\u0000\u04d8\u04d3"+
		"\u0001\u0000\u0000\u0000\u04d8\u04d7\u0001\u0000\u0000\u0000\u04d8\u04d9"+
		"\u0001\u0000\u0000\u0000\u04d9\u04da\u0001\u0000\u0000\u0000\u04da\u04df"+
		"\u0005\u0081\u0000\u0000\u04db\u04dc\u0005\u0082\u0000\u0000\u04dc\u04de"+
		"\u0005\u0083\u0000\u0000\u04dd\u04db\u0001\u0000\u0000\u0000\u04de\u04e1"+
		"\u0001\u0000\u0000\u0000\u04df\u04dd\u0001\u0000\u0000\u0000\u04df\u04e0"+
		"\u0001\u0000\u0000\u0000\u04e0\u009b\u0001\u0000\u0000\u0000\u04e1\u04df"+
		"\u0001\u0000\u0000\u0000\u04e2\u04e5\u0003\u0158\u00ac\u0000\u04e3\u04e5"+
		"\u0005\u0086\u0000\u0000\u04e4\u04e2\u0001\u0000\u0000\u0000\u04e4\u04e3"+
		"\u0001\u0000\u0000\u0000\u04e5\u009d\u0001\u0000\u0000\u0000\u04e6\u04e8"+
		"\u0003f3\u0000\u04e7\u04e6\u0001\u0000\u0000\u0000\u04e8\u04eb\u0001\u0000"+
		"\u0000\u0000\u04e9\u04e7\u0001\u0000\u0000\u0000\u04e9\u04ea\u0001\u0000"+
		"\u0000\u0000\u04ea\u04ec\u0001\u0000\u0000\u0000\u04eb\u04e9\u0001\u0000"+
		"\u0000\u0000\u04ec\u04ed\u0003\u00a0P\u0000\u04ed\u04ee\u0003\u00a4R\u0000"+
		"\u04ee\u009f\u0001\u0000\u0000\u0000\u04ef\u04f0\u0005(\u0000\u0000\u04f0"+
		"\u04fc\u0005\u0080\u0000\u0000\u04f1\u04f6\u0003\u00eau\u0000\u04f2\u04f3"+
		"\u0005\u0087\u0000\u0000\u04f3\u04f5\u0003\u00eau\u0000\u04f4\u04f2\u0001"+
		"\u0000\u0000\u0000\u04f5\u04f8\u0001\u0000\u0000\u0000\u04f6\u04f4\u0001"+
		"\u0000\u0000\u0000\u04f6\u04f7\u0001\u0000\u0000\u0000\u04f7\u04fa\u0001"+
		"\u0000\u0000\u0000\u04f8\u04f6\u0001\u0000\u0000\u0000\u04f9\u04fb\u0005"+
		"\u0087\u0000\u0000\u04fa\u04f9\u0001\u0000\u0000\u0000\u04fa\u04fb\u0001"+
		"\u0000\u0000\u0000\u04fb\u04fd\u0001\u0000\u0000\u0000\u04fc\u04f1\u0001"+
		"\u0000\u0000\u0000\u04fc\u04fd\u0001\u0000\u0000\u0000\u04fd\u04fe\u0001"+
		"\u0000\u0000\u0000\u04fe\u0500\u0005\u0081\u0000\u0000\u04ff\u0501\u0003"+
		"\u00d8l\u0000\u0500\u04ff\u0001\u0000\u0000\u0000\u0500\u0501\u0001\u0000"+
		"\u0000\u0000\u0501\u00a1\u0001\u0000\u0000\u0000\u0502\u0504\u0003\\."+
		"\u0000\u0503\u0502\u0001\u0000\u0000\u0000\u0503\u0504\u0001\u0000\u0000"+
		"\u0000\u0504\u0505\u0001\u0000\u0000\u0000\u0505\u0506\u0005\u009c\u0000"+
		"\u0000\u0506\u050d\u0005\u0080\u0000\u0000\u0507\u050e\u0003\u00d6k\u0000"+
		"\u0508\u0509\u0003\u00d0h\u0000\u0509\u050a\u0005\u0087\u0000\u0000\u050a"+
		"\u050b\u0003\u00d4j\u0000\u050b\u050e\u0001\u0000\u0000\u0000\u050c\u050e"+
		"\u0003\u00d4j\u0000\u050d\u0507\u0001\u0000\u0000\u0000\u050d\u0508\u0001"+
		"\u0000\u0000\u0000\u050d\u050c\u0001\u0000\u0000\u0000\u050d\u050e\u0001"+
		"\u0000\u0000\u0000\u050e\u050f\u0001\u0000\u0000\u0000\u050f\u0510\u0005"+
		"\u0081\u0000\u0000\u0510\u00a3\u0001\u0000\u0000\u0000\u0511\u0513\u0005"+
		"\u0084\u0000\u0000\u0512\u0514\u0003\u00a6S\u0000\u0513\u0512\u0001\u0000"+
		"\u0000\u0000\u0513\u0514\u0001\u0000\u0000\u0000\u0514\u0518\u0001\u0000"+
		"\u0000\u0000\u0515\u0517\u0003\u015a\u00ad\u0000\u0516\u0515\u0001\u0000"+
		"\u0000\u0000\u0517\u051a\u0001\u0000\u0000\u0000\u0518\u0516\u0001\u0000"+
		"\u0000\u0000\u0518\u0519\u0001\u0000\u0000\u0000\u0519\u051b\u0001\u0000"+
		"\u0000\u0000\u051a\u0518\u0001\u0000\u0000\u0000\u051b\u051c\u0005\u0085"+
		"\u0000\u0000\u051c\u00a5\u0001\u0000\u0000\u0000\u051d\u051f\u0003V+\u0000"+
		"\u051e\u051d\u0001\u0000\u0000\u0000\u051e\u051f\u0001\u0000\u0000\u0000"+
		"\u051f\u0520\u0001\u0000\u0000\u0000\u0520\u0521\u0005+\u0000\u0000\u0521"+
		"\u0522\u0003\u0110\u0088\u0000\u0522\u0523\u0005\u0086\u0000\u0000\u0523"+
		"\u053e\u0001\u0000\u0000\u0000\u0524\u0526\u0003V+\u0000\u0525\u0524\u0001"+
		"\u0000\u0000\u0000\u0525\u0526\u0001\u0000\u0000\u0000\u0526\u0527\u0001"+
		"\u0000\u0000\u0000\u0527\u0528\u0005*\u0000\u0000\u0528\u0529\u0003\u0110"+
		"\u0088\u0000\u0529\u052a\u0005\u0086\u0000\u0000\u052a\u053e\u0001\u0000"+
		"\u0000\u0000\u052b\u052c\u0003.\u0017\u0000\u052c\u052e\u0005\u0088\u0000"+
		"\u0000\u052d\u052f\u0003V+\u0000\u052e\u052d\u0001\u0000\u0000\u0000\u052e"+
		"\u052f\u0001\u0000\u0000\u0000\u052f\u0530\u0001\u0000\u0000\u0000\u0530"+
		"\u0531\u0005*\u0000\u0000\u0531\u0532\u0003\u0110\u0088\u0000\u0532\u0533"+
		"\u0005\u0086\u0000\u0000\u0533\u053e\u0001\u0000\u0000\u0000\u0534\u0535"+
		"\u0003\u0112\u0089\u0000\u0535\u0537\u0005\u0088\u0000\u0000\u0536\u0538"+
		"\u0003V+\u0000\u0537\u0536\u0001\u0000\u0000\u0000\u0537\u0538\u0001\u0000"+
		"\u0000\u0000\u0538\u0539\u0001\u0000\u0000\u0000\u0539\u053a\u0005*\u0000"+
		"\u0000\u053a\u053b\u0003\u0110\u0088\u0000\u053b\u053c\u0005\u0086\u0000"+
		"\u0000\u053c\u053e\u0001\u0000\u0000\u0000\u053d\u051e\u0001\u0000\u0000"+
		"\u0000\u053d\u0525\u0001\u0000\u0000\u0000\u053d\u052b\u0001\u0000\u0000"+
		"\u0000\u053d\u0534\u0001\u0000\u0000\u0000\u053e\u00a7\u0001\u0000\u0000"+
		"\u0000\u053f\u0541\u0003f3\u0000\u0540\u053f\u0001\u0000\u0000\u0000\u0541"+
		"\u0544\u0001\u0000\u0000\u0000\u0542\u0540\u0001\u0000\u0000\u0000\u0542"+
		"\u0543\u0001\u0000\u0000\u0000\u0543\u0545\u0001\u0000\u0000\u0000\u0544"+
		"\u0542\u0001\u0000\u0000\u0000\u0545\u0546\u0005)\u0000\u0000\u0546\u0547"+
		"\u0005\u0080\u0000\u0000\u0547\u0548\u0005\u0081\u0000\u0000\u0548\u0549"+
		"\u0003\u0158\u00ac\u0000\u0549\u00a9\u0001\u0000\u0000\u0000\u054a\u054c"+
		"\u0003f3\u0000\u054b\u054a\u0001\u0000\u0000\u0000\u054c\u054f\u0001\u0000"+
		"\u0000\u0000\u054d\u054b\u0001\u0000\u0000\u0000\u054d\u054e\u0001\u0000"+
		"\u0000\u0000\u054e\u0550\u0001\u0000\u0000\u0000\u054f\u054d\u0001\u0000"+
		"\u0000\u0000\u0550\u0551\u0005#\u0000\u0000\u0551\u0553\u0005\u009c\u0000"+
		"\u0000\u0552\u0554\u0003~?\u0000\u0553\u0552\u0001\u0000\u0000\u0000\u0553"+
		"\u0554\u0001\u0000\u0000\u0000\u0554\u0555\u0001\u0000\u0000\u0000\u0555"+
		"\u0556\u0003\u00acV\u0000\u0556\u00ab\u0001\u0000\u0000\u0000\u0557\u0563"+
		"\u0005\u0084\u0000\u0000\u0558\u055d\u0003\u00aeW\u0000\u0559\u055a\u0005"+
		"\u0087\u0000\u0000\u055a\u055c\u0003\u00aeW\u0000\u055b\u0559\u0001\u0000"+
		"\u0000\u0000\u055c\u055f\u0001\u0000\u0000\u0000\u055d\u055b\u0001\u0000"+
		"\u0000\u0000\u055d\u055e\u0001\u0000\u0000\u0000\u055e\u0561\u0001\u0000"+
		"\u0000\u0000\u055f\u055d\u0001\u0000\u0000\u0000\u0560\u0562\u0005\u0087"+
		"\u0000\u0000\u0561\u0560\u0001\u0000\u0000\u0000\u0561\u0562\u0001\u0000"+
		"\u0000\u0000\u0562\u0564\u0001\u0000\u0000\u0000\u0563\u0558\u0001\u0000"+
		"\u0000\u0000\u0563\u0564\u0001\u0000\u0000\u0000\u0564\u0566\u0001\u0000"+
		"\u0000\u0000\u0565\u0567\u0005\u0087\u0000\u0000\u0566\u0565\u0001\u0000"+
		"\u0000\u0000\u0566\u0567\u0001\u0000\u0000\u0000\u0567\u0569\u0001\u0000"+
		"\u0000\u0000\u0568\u056a\u0003\u00b0X\u0000\u0569\u0568\u0001\u0000\u0000"+
		"\u0000\u0569\u056a\u0001\u0000\u0000\u0000\u056a\u056b\u0001\u0000\u0000"+
		"\u0000\u056b\u056c\u0005\u0085\u0000\u0000\u056c\u00ad\u0001\u0000\u0000"+
		"\u0000\u056d\u056f\u0003f3\u0000\u056e\u056d\u0001\u0000\u0000\u0000\u056f"+
		"\u0572\u0001\u0000\u0000\u0000\u0570\u056e\u0001\u0000\u0000\u0000\u0570"+
		"\u0571\u0001\u0000\u0000\u0000\u0571\u0573\u0001\u0000\u0000\u0000\u0572"+
		"\u0570\u0001\u0000\u0000\u0000\u0573\u0575\u0005\u009c\u0000\u0000\u0574"+
		"\u0576\u0003\u0110\u0088\u0000\u0575\u0574\u0001\u0000\u0000\u0000\u0575"+
		"\u0576\u0001\u0000\u0000\u0000\u0576\u0578\u0001\u0000\u0000\u0000\u0577"+
		"\u0579\u0003\u0080@\u0000\u0578\u0577\u0001\u0000\u0000\u0000\u0578\u0579"+
		"\u0001\u0000\u0000\u0000\u0579\u00af\u0001\u0000\u0000\u0000\u057a\u057e"+
		"\u0005\u0086\u0000\u0000\u057b\u057d\u0003\u0082A\u0000\u057c\u057b\u0001"+
		"\u0000\u0000\u0000\u057d\u0580\u0001\u0000\u0000\u0000\u057e\u057c\u0001"+
		"\u0000\u0000\u0000\u057e\u057f\u0001\u0000\u0000\u0000\u057f\u00b1\u0001"+
		"\u0000\u0000\u0000\u0580\u057e\u0001\u0000\u0000\u0000\u0581\u0583\u0003"+
		"f3\u0000\u0582\u0581\u0001\u0000\u0000\u0000\u0583\u0586\u0001\u0000\u0000"+
		"\u0000\u0584\u0582\u0001\u0000\u0000\u0000\u0584\u0585\u0001\u0000\u0000"+
		"\u0000\u0585\u0587\u0001\u0000\u0000\u0000\u0586\u0584\u0001\u0000\u0000"+
		"\u0000\u0587\u0588\u0005$\u0000\u0000\u0588\u058a\u0005\u009c\u0000\u0000"+
		"\u0589\u058b\u0003\\.\u0000\u058a\u0589\u0001\u0000\u0000\u0000\u058a"+
		"\u058b\u0001\u0000\u0000\u0000\u058b\u058d\u0001\u0000\u0000\u0000\u058c"+
		"\u058e\u0003\u00b4Z\u0000\u058d\u058c\u0001\u0000\u0000\u0000\u058d\u058e"+
		"\u0001\u0000\u0000\u0000\u058e\u058f\u0001\u0000\u0000\u0000\u058f\u0590"+
		"\u0003\u00b6[\u0000\u0590\u00b3\u0001\u0000\u0000\u0000\u0591\u0592\u0005"+
		"&\u0000\u0000\u0592\u0597\u0003T*\u0000\u0593\u0594\u0005\u0087\u0000"+
		"\u0000\u0594\u0596\u0003T*\u0000\u0595\u0593\u0001\u0000\u0000\u0000\u0596"+
		"\u0599\u0001\u0000\u0000\u0000\u0597\u0595\u0001\u0000\u0000\u0000\u0597"+
		"\u0598\u0001\u0000\u0000\u0000\u0598\u059b\u0001\u0000\u0000\u0000\u0599"+
		"\u0597\u0001\u0000\u0000\u0000\u059a\u059c\u0005\u0087\u0000\u0000\u059b"+
		"\u059a\u0001\u0000\u0000\u0000\u059b\u059c\u0001\u0000\u0000\u0000\u059c"+
		"\u00b5\u0001\u0000\u0000\u0000\u059d\u05a1\u0005\u0084\u0000\u0000\u059e"+
		"\u05a0\u0003\u00b8\\\u0000\u059f\u059e\u0001\u0000\u0000\u0000\u05a0\u05a3"+
		"\u0001\u0000\u0000\u0000\u05a1\u059f\u0001\u0000\u0000\u0000\u05a1\u05a2"+
		"\u0001\u0000\u0000\u0000\u05a2\u05a4\u0001\u0000\u0000\u0000\u05a3\u05a1"+
		"\u0001\u0000\u0000\u0000\u05a4\u05a5\u0005\u0085\u0000\u0000\u05a5\u00b7"+
		"\u0001\u0000\u0000\u0000\u05a6\u05b0\u0003\u00be_\u0000\u05a7\u05b0\u0003"+
		"\u00ba]\u0000\u05a8\u05b0\u0003\u0096K\u0000\u05a9\u05b0\u0003\u00c0`"+
		"\u0000\u05aa\u05b0\u0003z=\u0000\u05ab\u05b0\u0003\u00aaU\u0000\u05ac"+
		"\u05b0\u0003\u00b2Y\u0000\u05ad\u05b0\u0003\u00c2a\u0000\u05ae\u05b0\u0005"+
		"\u0086\u0000\u0000\u05af\u05a6\u0001\u0000\u0000\u0000\u05af\u05a7\u0001"+
		"\u0000\u0000\u0000\u05af\u05a8\u0001\u0000\u0000\u0000\u05af\u05a9\u0001"+
		"\u0000\u0000\u0000\u05af\u05aa\u0001\u0000\u0000\u0000\u05af\u05ab\u0001"+
		"\u0000\u0000\u0000\u05af\u05ac\u0001\u0000\u0000\u0000\u05af\u05ad\u0001"+
		"\u0000\u0000\u0000\u05af\u05ae\u0001\u0000\u0000\u0000\u05b0\u00b9\u0001"+
		"\u0000\u0000\u0000\u05b1\u05b2\u0003\u00bc^\u0000\u05b2\u05b3\u0003\u008e"+
		"G\u0000\u05b3\u05b4\u0005\u0086\u0000\u0000\u05b4\u00bb\u0001\u0000\u0000"+
		"\u0000\u05b5\u05b6\u0007\u0000\u0000\u0000\u05b6\u05b7\u0003\u00e8t\u0000"+
		"\u05b7\u00bd\u0001\u0000\u0000\u0000\u05b8\u05ba\u0003f3\u0000\u05b9\u05b8"+
		"\u0001\u0000\u0000\u0000\u05ba\u05bd\u0001\u0000\u0000\u0000\u05bb\u05b9"+
		"\u0001\u0000\u0000\u0000\u05bb\u05bc\u0001\u0000\u0000\u0000\u05bc\u05be"+
		"\u0001\u0000\u0000\u0000\u05bd\u05bb\u0001\u0000\u0000\u0000\u05be\u05bf"+
		"\u0005\u001d\u0000\u0000\u05bf\u05c4\u0003\u00e0p\u0000\u05c0\u05c1\u0005"+
		"\u0087\u0000\u0000\u05c1\u05c3\u0003\u00e0p\u0000\u05c2\u05c0\u0001\u0000"+
		"\u0000\u0000\u05c3\u05c6\u0001\u0000\u0000\u0000\u05c4\u05c2\u0001\u0000"+
		"\u0000\u0000\u05c4\u05c5\u0001\u0000\u0000\u0000\u05c5\u05c8\u0001\u0000"+
		"\u0000\u0000\u05c6\u05c4\u0001\u0000\u0000\u0000\u05c7\u05c9\u0005\u0087"+
		"\u0000\u0000\u05c8\u05c7\u0001\u0000\u0000\u0000\u05c8\u05c9\u0001\u0000"+
		"\u0000\u0000\u05c9\u05ca\u0001\u0000\u0000\u0000\u05ca\u05cb\u0005\u0086"+
		"\u0000\u0000\u05cb\u00bf\u0001\u0000\u0000\u0000\u05cc\u05ce\u0003f3\u0000"+
		"\u05cd\u05cc\u0001\u0000\u0000\u0000\u05ce\u05d1\u0001\u0000\u0000\u0000"+
		"\u05cf\u05cd\u0001\u0000\u0000\u0000\u05cf\u05d0\u0001\u0000\u0000\u0000"+
		"\u05d0\u05d2\u0001\u0000\u0000\u0000\u05d1\u05cf\u0001\u0000\u0000\u0000"+
		"\u05d2\u05d3\u0003\u0098L\u0000\u05d3\u05d4\u0003\u009cN\u0000\u05d4\u00c1"+
		"\u0001\u0000\u0000\u0000\u05d5\u05d7\u0003f3\u0000\u05d6\u05d5\u0001\u0000"+
		"\u0000\u0000\u05d7\u05da\u0001\u0000\u0000\u0000\u05d8\u05d6\u0001\u0000"+
		"\u0000\u0000\u05d8\u05d9\u0001\u0000\u0000\u0000\u05d9\u05db\u0001\u0000"+
		"\u0000\u0000\u05da\u05d8\u0001\u0000\u0000\u0000\u05db\u05dc\u0005\u008b"+
		"\u0000\u0000\u05dc\u05dd\u0005$\u0000\u0000\u05dd\u05de\u0005\u009c\u0000"+
		"\u0000\u05de\u05df\u0003\u00c4b\u0000\u05df\u00c3\u0001\u0000\u0000\u0000"+
		"\u05e0\u05e4\u0005\u0084\u0000\u0000\u05e1\u05e3\u0003\u00c6c\u0000\u05e2"+
		"\u05e1\u0001\u0000\u0000\u0000\u05e3\u05e6\u0001\u0000\u0000\u0000\u05e4"+
		"\u05e2\u0001\u0000\u0000\u0000\u05e4\u05e5\u0001\u0000\u0000\u0000\u05e5"+
		"\u05e7\u0001\u0000\u0000\u0000\u05e6\u05e4\u0001\u0000\u0000\u0000\u05e7"+
		"\u05e8\u0005\u0085\u0000\u0000\u05e8\u00c5\u0001\u0000\u0000\u0000\u05e9"+
		"\u05f5\u0003\u00cae\u0000\u05ea\u05f5\u0003\u00be_\u0000\u05eb\u05ee\u0003"+
		"z=\u0000\u05ec\u05ee\u0003\u00aaU\u0000\u05ed\u05eb\u0001\u0000\u0000"+
		"\u0000\u05ed\u05ec\u0001\u0000\u0000\u0000\u05ee\u05f5\u0001\u0000\u0000"+
		"\u0000\u05ef\u05f2\u0003\u00b2Y\u0000\u05f0\u05f2\u0003\u00c2a\u0000\u05f1"+
		"\u05ef\u0001\u0000\u0000\u0000\u05f1\u05f0\u0001\u0000\u0000\u0000\u05f2"+
		"\u05f5\u0001\u0000\u0000\u0000\u05f3\u05f5\u0005\u0086\u0000\u0000\u05f4"+
		"\u05e9\u0001\u0000\u0000\u0000\u05f4\u05ea\u0001\u0000\u0000\u0000\u05f4"+
		"\u05ed\u0001\u0000\u0000\u0000\u05f4\u05f1\u0001\u0000\u0000\u0000\u05f4"+
		"\u05f3\u0001\u0000\u0000\u0000\u05f5\u00c7\u0001\u0000\u0000\u0000\u05f6"+
		"\u05f9\u0003>\u001f\u0000\u05f7\u05f9\u0003@ \u0000\u05f8\u05f6\u0001"+
		"\u0000\u0000\u0000\u05f8\u05f7\u0001\u0000\u0000\u0000\u05f9\u00c9\u0001"+
		"\u0000\u0000\u0000\u05fa\u05fc\u0003f3\u0000\u05fb\u05fa\u0001\u0000\u0000"+
		"\u0000\u05fc\u05ff\u0001\u0000\u0000\u0000\u05fd\u05fb\u0001\u0000\u0000"+
		"\u0000\u05fd\u05fe\u0001\u0000\u0000\u0000\u05fe\u0600\u0001\u0000\u0000"+
		"\u0000\u05ff\u05fd\u0001\u0000\u0000\u0000\u0600\u0601\u0003\u00c8d\u0000"+
		"\u0601\u0602\u0005\u009c\u0000\u0000\u0602\u0603\u0005\u0080\u0000\u0000"+
		"\u0603\u0608\u0005\u0081\u0000\u0000\u0604\u0605\u0005\u0082\u0000\u0000"+
		"\u0605\u0607\u0005\u0083\u0000\u0000\u0606\u0604\u0001\u0000\u0000\u0000"+
		"\u0607\u060a\u0001\u0000\u0000\u0000\u0608\u0606\u0001\u0000\u0000\u0000"+
		"\u0608\u0609\u0001\u0000\u0000\u0000\u0609\u060c\u0001\u0000\u0000\u0000"+
		"\u060a\u0608\u0001\u0000\u0000\u0000\u060b\u060d\u0003x<\u0000\u060c\u060b"+
		"\u0001\u0000\u0000\u0000\u060c\u060d\u0001\u0000\u0000\u0000\u060d\u060e"+
		"\u0001\u0000\u0000\u0000\u060e\u060f\u0005\u0086\u0000\u0000\u060f\u00cb"+
		"\u0001\u0000\u0000\u0000\u0610\u0611\u0005\u0089\u0000\u0000\u0611\u0612"+
		"\u0003@ \u0000\u0612\u00cd\u0001\u0000\u0000\u0000\u0613\u0616\u0003>"+
		"\u001f\u0000\u0614\u0616\u0003@ \u0000\u0615\u0613\u0001\u0000\u0000\u0000"+
		"\u0615\u0614\u0001\u0000\u0000\u0000\u0616\u0619\u0001\u0000\u0000\u0000"+
		"\u0617\u0619\u0005\u001f\u0000\u0000\u0618\u0615\u0001\u0000\u0000\u0000"+
		"\u0618\u0617\u0001\u0000\u0000\u0000\u0619\u00cf\u0001\u0000\u0000\u0000"+
		"\u061a\u061f\u0003\u00d2i\u0000\u061b\u061c\u0005\u0087\u0000\u0000\u061c"+
		"\u061e\u0003\u00d2i\u0000\u061d\u061b\u0001\u0000\u0000\u0000\u061e\u0621"+
		"\u0001\u0000\u0000\u0000\u061f\u061d\u0001\u0000\u0000\u0000\u061f\u0620"+
		"\u0001\u0000\u0000\u0000\u0620\u0623\u0001\u0000\u0000\u0000\u0621\u061f"+
		"\u0001\u0000\u0000\u0000\u0622\u0624\u0005\u0087\u0000\u0000\u0623\u0622"+
		"\u0001\u0000\u0000\u0000\u0623\u0624\u0001\u0000\u0000\u0000\u0624\u0631"+
		"\u0001\u0000\u0000\u0000\u0625\u062a\u0003\u00d6k\u0000\u0626\u0627\u0005"+
		"\u0087\u0000\u0000\u0627\u0629\u0003\u00d2i\u0000\u0628\u0626\u0001\u0000"+
		"\u0000\u0000\u0629\u062c\u0001\u0000\u0000\u0000\u062a\u0628\u0001\u0000"+
		"\u0000\u0000\u062a\u062b\u0001\u0000\u0000\u0000\u062b\u062e\u0001\u0000"+
		"\u0000\u0000\u062c\u062a\u0001\u0000\u0000\u0000\u062d\u062f\u0005\u0087"+
		"\u0000\u0000\u062e\u062d\u0001\u0000\u0000\u0000\u062e\u062f\u0001\u0000"+
		"\u0000\u0000\u062f\u0631\u0001\u0000\u0000\u0000\u0630\u061a\u0001\u0000"+
		"\u0000\u0000\u0630\u0625\u0001\u0000\u0000\u0000\u0631\u00d1\u0001\u0000"+
		"\u0000\u0000\u0632\u0634\u0003f3\u0000\u0633\u0632\u0001\u0000\u0000\u0000"+
		"\u0634\u0637\u0001\u0000\u0000\u0000\u0635\u0633\u0001\u0000\u0000\u0000"+
		"\u0635\u0636\u0001\u0000\u0000\u0000\u0636\u0638\u0001\u0000\u0000\u0000"+
		"\u0637\u0635\u0001\u0000\u0000\u0000\u0638\u0639\u0003\u00eau\u0000\u0639"+
		"\u00d3\u0001\u0000\u0000\u0000\u063a\u063c\u0003f3\u0000\u063b\u063a\u0001"+
		"\u0000\u0000\u0000\u063c\u063f\u0001\u0000\u0000\u0000\u063d\u063b\u0001"+
		"\u0000\u0000\u0000\u063d\u063e\u0001\u0000\u0000\u0000\u063e\u0640\u0001"+
		"\u0000\u0000\u0000\u063f\u063d\u0001\u0000\u0000\u0000\u0640\u0644\u0003"+
		"\u00c8d\u0000\u0641\u0643\u0003h4\u0000\u0642\u0641\u0001\u0000\u0000"+
		"\u0000\u0643\u0646\u0001\u0000\u0000\u0000\u0644\u0642\u0001\u0000\u0000"+
		"\u0000\u0644\u0645\u0001\u0000\u0000\u0000\u0645\u0647\u0001\u0000\u0000"+
		"\u0000\u0646\u0644\u0001\u0000\u0000\u0000\u0647\u0648\u0005b\u0000\u0000"+
		"\u0648\u0649\u0003\u00e4r\u0000\u0649\u064c\u0001\u0000\u0000\u0000\u064a"+
		"\u064c\u0003\u00d2i\u0000\u064b\u063d\u0001\u0000\u0000\u0000\u064b\u064a"+
		"\u0001\u0000\u0000\u0000\u064c\u00d5\u0001\u0000\u0000\u0000\u064d\u064f"+
		"\u0003h4\u0000\u064e\u064d\u0001\u0000\u0000\u0000\u064f\u0652\u0001\u0000"+
		"\u0000\u0000\u0650\u064e\u0001\u0000\u0000\u0000\u0650\u0651\u0001\u0000"+
		"\u0000\u0000\u0651\u0653\u0001\u0000\u0000\u0000\u0652\u0650\u0001\u0000"+
		"\u0000\u0000\u0653\u0656\u0003\u00c8d\u0000\u0654\u0655\u0005\u009c\u0000"+
		"\u0000\u0655\u0657\u0005\u0088\u0000\u0000\u0656\u0654\u0001\u0000\u0000"+
		"\u0000\u0656\u0657\u0001\u0000\u0000\u0000\u0657\u0658\u0001\u0000\u0000"+
		"\u0000\u0658\u0659\u0005+\u0000\u0000\u0659\u00d7\u0001\u0000\u0000\u0000"+
		"\u065a\u065b\u0005@\u0000\u0000\u065b\u0660\u0003\u00dam\u0000\u065c\u065d"+
		"\u0005\u0087\u0000\u0000\u065d\u065f\u0003\u00dam\u0000\u065e\u065c\u0001"+
		"\u0000\u0000\u0000\u065f\u0662\u0001\u0000\u0000\u0000\u0660\u065e\u0001"+
		"\u0000\u0000\u0000\u0660\u0661\u0001\u0000\u0000\u0000\u0661\u0664\u0001"+
		"\u0000\u0000\u0000\u0662\u0660\u0001\u0000\u0000\u0000\u0663\u0665\u0005"+
		"\u0087\u0000\u0000\u0664\u0663\u0001\u0000\u0000\u0000\u0664\u0665\u0001"+
		"\u0000\u0000\u0000\u0665\u00d9\u0001\u0000\u0000\u0000\u0666\u0669\u0003"+
		"T*\u0000\u0667\u0669\u0003@ \u0000\u0668\u0666\u0001\u0000\u0000\u0000"+
		"\u0668\u0667\u0001\u0000\u0000\u0000\u0669\u00db\u0001\u0000\u0000\u0000"+
		"\u066a\u066b\u0003\u00deo\u0000\u066b\u066c\u0005\u0086\u0000\u0000\u066c"+
		"\u00dd\u0001\u0000\u0000\u0000\u066d\u066f\u0003f3\u0000\u066e\u066d\u0001"+
		"\u0000\u0000\u0000\u066f\u0672\u0001\u0000\u0000\u0000\u0670\u066e\u0001"+
		"\u0000\u0000\u0000\u0670\u0671\u0001\u0000\u0000\u0000\u0671\u0673\u0001"+
		"\u0000\u0000\u0000\u0672\u0670\u0001\u0000\u0000\u0000\u0673\u0674\u0007"+
		"\u0000\u0000\u0000\u0674\u0679\u0003\u00e0p\u0000\u0675\u0676\u0005\u0087"+
		"\u0000\u0000\u0676\u0678\u0003\u00e0p\u0000\u0677\u0675\u0001\u0000\u0000"+
		"\u0000\u0678\u067b\u0001\u0000\u0000\u0000\u0679\u0677\u0001\u0000\u0000"+
		"\u0000\u0679\u067a\u0001\u0000\u0000\u0000\u067a\u067d\u0001\u0000\u0000"+
		"\u0000\u067b\u0679\u0001\u0000\u0000\u0000\u067c\u067e\u0005\u0087\u0000"+
		"\u0000\u067d\u067c\u0001\u0000\u0000\u0000\u067d\u067e\u0001\u0000\u0000"+
		"\u0000\u067e\u00df\u0001\u0000\u0000\u0000\u067f\u0682\u0003\u00e8t\u0000"+
		"\u0680\u0681\u0005\u008d\u0000\u0000\u0681\u0683\u0003\u012c\u0096\u0000"+
		"\u0682\u0680\u0001\u0000\u0000\u0000\u0682\u0683\u0001\u0000\u0000\u0000"+
		"\u0683\u00e1\u0001\u0000\u0000\u0000\u0684\u0687\u0003\u00e4r\u0000\u0685"+
		"\u0686\u0005\u008d\u0000\u0000\u0686\u0688\u0003\u00e6s\u0000\u0687\u0685"+
		"\u0001\u0000\u0000\u0000\u0687\u0688\u0001\u0000\u0000\u0000\u0688\u00e3"+
		"\u0001\u0000\u0000\u0000\u0689\u068e\u0005\u009c\u0000\u0000\u068a\u068b"+
		"\u0005\u0082\u0000\u0000\u068b\u068d\u0005\u0083\u0000\u0000\u068c\u068a"+
		"\u0001\u0000\u0000\u0000\u068d\u0690\u0001\u0000\u0000\u0000\u068e\u068c"+
		"\u0001\u0000\u0000\u0000\u068e\u068f\u0001\u0000\u0000\u0000\u068f\u00e5"+
		"\u0001\u0000\u0000\u0000\u0690\u068e\u0001\u0000\u0000\u0000\u0691\u0694"+
		"\u0003\u012c\u0096\u0000\u0692\u0694\u0003<\u001e\u0000\u0693\u0691\u0001"+
		"\u0000\u0000\u0000\u0693\u0692\u0001\u0000\u0000\u0000\u0694\u00e7\u0001"+
		"\u0000\u0000\u0000\u0695\u0698\u0005\u009c\u0000\u0000\u0696\u0697\u0005"+
		"\u0089\u0000\u0000\u0697\u0699\u0003@ \u0000\u0698\u0696\u0001\u0000\u0000"+
		"\u0000\u0698\u0699\u0001\u0000\u0000\u0000\u0699\u00e9\u0001\u0000\u0000"+
		"\u0000\u069a\u069b\u0005\u009c\u0000\u0000\u069b\u069c\u0005\u0089\u0000"+
		"\u0000\u069c\u069d\u0003@ \u0000\u069d\u00eb\u0001\u0000\u0000\u0000\u069e"+
		"\u06a1\u0005\u009c\u0000\u0000\u069f\u06a0\u0005\u0089\u0000\u0000\u06a0"+
		"\u06a2\u0003\u01a2\u00d1\u0000\u06a1\u069f\u0001\u0000\u0000\u0000\u06a1"+
		"\u06a2\u0001\u0000\u0000\u0000\u06a2\u00ed\u0001\u0000\u0000\u0000\u06a3"+
		"\u06a4\u0003\u00f0x\u0000\u06a4\u00ef\u0001\u0000\u0000\u0000\u06a5\u06ab"+
		"\u0003\u00f2y\u0000\u06a6\u06a7\u0003(\u0014\u0000\u06a7\u06a8\u0003\u00f2"+
		"y\u0000\u06a8\u06aa\u0001\u0000\u0000\u0000\u06a9\u06a6\u0001\u0000\u0000"+
		"\u0000\u06aa\u06ad\u0001\u0000\u0000\u0000\u06ab\u06a9\u0001\u0000\u0000"+
		"\u0000\u06ab\u06ac\u0001\u0000\u0000\u0000\u06ac\u00f1\u0001\u0000\u0000"+
		"\u0000\u06ad\u06ab\u0001\u0000\u0000\u0000\u06ae\u06b4\u0003\u00f4z\u0000"+
		"\u06af\u06b0\u0003*\u0015\u0000\u06b0\u06b1\u0003\u00f4z\u0000\u06b1\u06b3"+
		"\u0001\u0000\u0000\u0000\u06b2\u06af\u0001\u0000\u0000\u0000\u06b3\u06b6"+
		"\u0001\u0000\u0000\u0000\u06b4\u06b2\u0001\u0000\u0000\u0000\u06b4\u06b5"+
		"\u0001\u0000\u0000\u0000\u06b5\u00f3\u0001\u0000\u0000\u0000\u06b6\u06b4"+
		"\u0001\u0000\u0000\u0000\u06b7\u06b8\u0003,\u0016\u0000\u06b8\u06b9\u0003"+
		"\u00f4z\u0000\u06b9\u06bc\u0001\u0000\u0000\u0000\u06ba\u06bc\u0003\u00f6"+
		"{\u0000\u06bb\u06b7\u0001\u0000\u0000\u0000\u06bb\u06ba\u0001\u0000\u0000"+
		"\u0000\u06bc\u00f5\u0001\u0000\u0000\u0000\u06bd\u06c3\u0003\u00f8|\u0000"+
		"\u06be\u06bf\u0005\u0080\u0000\u0000\u06bf\u06c0\u0003\u00eew\u0000\u06c0"+
		"\u06c1\u0005\u0081\u0000\u0000\u06c1\u06c3\u0001\u0000\u0000\u0000\u06c2"+
		"\u06bd\u0001\u0000\u0000\u0000\u06c2\u06be\u0001\u0000\u0000\u0000\u06c3"+
		"\u00f7\u0001\u0000\u0000\u0000\u06c4\u06c8\u0005T\u0000\u0000\u06c5\u06c8"+
		"\u0003\u00fa}\u0000\u06c6\u06c8\u0003\u012c\u0096\u0000\u06c7\u06c4\u0001"+
		"\u0000\u0000\u0000\u06c7\u06c5\u0001\u0000\u0000\u0000\u06c7\u06c6\u0001"+
		"\u0000\u0000\u0000\u06c8\u00f9\u0001\u0000\u0000\u0000\u06c9\u06ca\u0005"+
		"\u009c\u0000\u0000\u06ca\u00fb\u0001\u0000\u0000\u0000\u06cb\u06ce\u0003"+
		"\u0100\u0080\u0000\u06cc\u06ce\u0003\u0102\u0081\u0000\u06cd\u06cb\u0001"+
		"\u0000\u0000\u0000\u06cd\u06cc\u0001\u0000\u0000\u0000\u06ce\u00fd\u0001"+
		"\u0000\u0000\u0000\u06cf\u06d2\u0003\u0104\u0082\u0000\u06d0\u06d2\u0003"+
		"\u0106\u0083\u0000\u06d1\u06cf\u0001\u0000\u0000\u0000\u06d1\u06d0\u0001"+
		"\u0000\u0000\u0000\u06d2\u00ff\u0001\u0000\u0000\u0000\u06d3\u06d6\u0005"+
		"T\u0000\u0000\u06d4\u06d6\u0003\u00e8t\u0000\u06d5\u06d3\u0001\u0000\u0000"+
		"\u0000\u06d5\u06d4\u0001\u0000\u0000\u0000\u06d6\u0101\u0001\u0000\u0000"+
		"\u0000\u06d7\u06d8\u0005\u0080\u0000\u0000\u06d8\u06db\u0003\u00fc~\u0000"+
		"\u06d9\u06da\u0005\u0087\u0000\u0000\u06da\u06dc\u0003\u00fc~\u0000\u06db"+
		"\u06d9\u0001\u0000\u0000\u0000\u06dc\u06dd\u0001\u0000\u0000\u0000\u06dd"+
		"\u06db\u0001\u0000\u0000\u0000\u06dd\u06de\u0001\u0000\u0000\u0000\u06de"+
		"\u06e0\u0001\u0000\u0000\u0000\u06df\u06e1\u0005\u0087\u0000\u0000\u06e0"+
		"\u06df\u0001\u0000\u0000\u0000\u06e0\u06e1\u0001\u0000\u0000\u0000\u06e1"+
		"\u06e2\u0001\u0000\u0000\u0000\u06e2\u06e3\u0005\u0081\u0000\u0000\u06e3"+
		"\u0103\u0001\u0000\u0000\u0000\u06e4\u06e5\u0007\b\u0000\u0000\u06e5\u0105"+
		"\u0001\u0000\u0000\u0000\u06e6\u06e7\u0005\u0080\u0000\u0000\u06e7\u06ea"+
		"\u0003\u00fe\u007f\u0000\u06e8\u06e9\u0005\u0087\u0000\u0000\u06e9\u06eb"+
		"\u0003\u00fe\u007f\u0000\u06ea\u06e8\u0001\u0000\u0000\u0000\u06eb\u06ec"+
		"\u0001\u0000\u0000\u0000\u06ec\u06ea\u0001\u0000\u0000\u0000\u06ec\u06ed"+
		"\u0001\u0000\u0000\u0000\u06ed\u06ef\u0001\u0000\u0000\u0000\u06ee\u06f0"+
		"\u0005\u0087\u0000\u0000\u06ef\u06ee\u0001\u0000\u0000\u0000\u06ef\u06f0"+
		"\u0001\u0000\u0000\u0000\u06f0\u06f1\u0001\u0000\u0000\u0000\u06f1\u06f2"+
		"\u0005\u0081\u0000\u0000\u06f2\u0107\u0001\u0000\u0000\u0000\u06f3\u06f4"+
		"\u0003\u00fe\u007f\u0000\u06f4\u0109\u0001\u0000\u0000\u0000\u06f5\u06f6"+
		"\u0003\u0106\u0083\u0000\u06f6\u010b\u0001\u0000\u0000\u0000\u06f7\u06f8"+
		"\u0003\u0104\u0082\u0000\u06f8\u010d\u0001\u0000\u0000\u0000\u06f9\u06fe"+
		"\u0003\u012c\u0096\u0000\u06fa\u06fb\u0005\u0087\u0000\u0000\u06fb\u06fd"+
		"\u0003\u012c\u0096\u0000\u06fc\u06fa\u0001\u0000\u0000\u0000\u06fd\u0700"+
		"\u0001\u0000\u0000\u0000\u06fe\u06fc\u0001\u0000\u0000\u0000\u06fe\u06ff"+
		"\u0001\u0000\u0000\u0000\u06ff\u0702\u0001\u0000\u0000\u0000\u0700\u06fe"+
		"\u0001\u0000\u0000\u0000\u0701\u0703\u0005\u0087\u0000\u0000\u0702\u0701"+
		"\u0001\u0000\u0000\u0000\u0702\u0703\u0001\u0000\u0000\u0000\u0703\u010f"+
		"\u0001\u0000\u0000\u0000\u0704\u0706\u0005\u0080\u0000\u0000\u0705\u0707"+
		"\u0003\u010e\u0087\u0000\u0706\u0705\u0001\u0000\u0000\u0000\u0706\u0707"+
		"\u0001\u0000\u0000\u0000\u0707\u0708\u0001\u0000\u0000\u0000\u0708\u0709"+
		"\u0005\u0081\u0000\u0000\u0709\u0111\u0001\u0000\u0000\u0000\u070a\u0713"+
		"\u0003\u011e\u008f\u0000\u070b\u070f\u0003\u0116\u008b\u0000\u070c\u070e"+
		"\u0003\u0114\u008a\u0000\u070d\u070c\u0001\u0000\u0000\u0000\u070e\u0711"+
		"\u0001\u0000\u0000\u0000\u070f\u070d\u0001\u0000\u0000\u0000\u070f\u0710"+
		"\u0001\u0000\u0000\u0000\u0710\u0713\u0001\u0000\u0000\u0000\u0711\u070f"+
		"\u0001\u0000\u0000\u0000\u0712\u070a\u0001\u0000\u0000\u0000\u0712\u070b"+
		"\u0001\u0000\u0000\u0000\u0713\u0113\u0001\u0000\u0000\u0000\u0714\u0723"+
		"\u0003\u0110\u0088\u0000\u0715\u0717\u0005\u0088\u0000\u0000\u0716\u0718"+
		"\u0003V+\u0000\u0717\u0716\u0001\u0000\u0000\u0000\u0717\u0718\u0001\u0000"+
		"\u0000\u0000\u0718\u0719\u0001\u0000\u0000\u0000\u0719\u071b\u0005\u009c"+
		"\u0000\u0000\u071a\u071c\u0003\u0110\u0088\u0000\u071b\u071a\u0001\u0000"+
		"\u0000\u0000\u071b\u071c\u0001\u0000\u0000\u0000\u071c\u0723\u0001\u0000"+
		"\u0000\u0000\u071d\u071e\u0005\u0082\u0000\u0000\u071e\u071f\u0003\u012c"+
		"\u0096\u0000\u071f\u0720\u0005\u0083\u0000\u0000\u0720\u0723\u0001\u0000"+
		"\u0000\u0000\u0721\u0723\u0003\u0122\u0091\u0000\u0722\u0714\u0001\u0000"+
		"\u0000\u0000\u0722\u0715\u0001\u0000\u0000\u0000\u0722\u071d\u0001\u0000"+
		"\u0000\u0000\u0722\u0721\u0001\u0000\u0000\u0000\u0723\u0115\u0001\u0000"+
		"\u0000\u0000\u0724\u0750\u00030\u0018\u0000\u0725\u072a\u0003.\u0017\u0000"+
		"\u0726\u0727\u0005\u0082\u0000\u0000\u0727\u0729\u0005\u0083\u0000\u0000"+
		"\u0728\u0726\u0001\u0000\u0000\u0000\u0729\u072c\u0001\u0000\u0000\u0000"+
		"\u072a\u0728\u0001\u0000\u0000\u0000\u072a\u072b\u0001\u0000\u0000\u0000"+
		"\u072b\u072d\u0001\u0000\u0000\u0000\u072c\u072a\u0001\u0000\u0000\u0000"+
		"\u072d\u072e\u0005\u0088\u0000\u0000\u072e\u072f\u0005\"\u0000\u0000\u072f"+
		"\u0750\u0001\u0000\u0000\u0000\u0730\u0735\u0003>\u001f\u0000\u0731\u0732"+
		"\u0005\u0082\u0000\u0000\u0732\u0734\u0005\u0083\u0000\u0000\u0733\u0731"+
		"\u0001\u0000\u0000\u0000\u0734\u0737\u0001\u0000\u0000\u0000\u0735\u0733"+
		"\u0001\u0000\u0000\u0000\u0735\u0736\u0001\u0000\u0000\u0000\u0736\u0738"+
		"\u0001\u0000\u0000\u0000\u0737\u0735\u0001\u0000\u0000\u0000\u0738\u0739"+
		"\u0005\u0088\u0000\u0000\u0739\u073a\u0005\"\u0000\u0000\u073a\u0750\u0001"+
		"\u0000\u0000\u0000\u073b\u073c\u0005\u001f\u0000\u0000\u073c\u073d\u0005"+
		"\u0088\u0000\u0000\u073d\u0750\u0005\"\u0000\u0000\u073e\u0750\u0005+"+
		"\u0000\u0000\u073f\u0740\u0003.\u0017\u0000\u0740\u0741\u0005\u0088\u0000"+
		"\u0000\u0741\u0742\u0005+\u0000\u0000\u0742\u0750\u0001\u0000\u0000\u0000"+
		"\u0743\u0744\u0005\u0080\u0000\u0000\u0744\u0745\u0003\u012c\u0096\u0000"+
		"\u0745\u0746\u0005\u0081\u0000\u0000\u0746\u0750\u0001\u0000\u0000\u0000"+
		"\u0747\u0750\u0003\u0120\u0090\u0000\u0748\u0750\u0003\u0124\u0092\u0000"+
		"\u0749\u0750\u0003.\u0017\u0000\u074a\u0750\u0005*\u0000\u0000\u074b\u074c"+
		"\u0003.\u0017\u0000\u074c\u074d\u0005\u0088\u0000\u0000\u074d\u074e\u0005"+
		"*\u0000\u0000\u074e\u0750\u0001\u0000\u0000\u0000\u074f\u0724\u0001\u0000"+
		"\u0000\u0000\u074f\u0725\u0001\u0000\u0000\u0000\u074f\u0730\u0001\u0000"+
		"\u0000\u0000\u074f\u073b\u0001\u0000\u0000\u0000\u074f\u073e\u0001\u0000"+
		"\u0000\u0000\u074f\u073f\u0001\u0000\u0000\u0000\u074f\u0743\u0001\u0000"+
		"\u0000\u0000\u074f\u0747\u0001\u0000\u0000\u0000\u074f\u0748\u0001\u0000"+
		"\u0000\u0000\u074f\u0749\u0001\u0000\u0000\u0000\u074f\u074a\u0001\u0000"+
		"\u0000\u0000\u074f\u074b\u0001\u0000\u0000\u0000\u0750\u0117\u0001\u0000"+
		"\u0000\u0000\u0751\u0752\u0003\u011a\u008d\u0000\u0752\u0119\u0001\u0000"+
		"\u0000\u0000\u0753\u0754\u0003\u0112\u0089\u0000\u0754\u011b\u0001\u0000"+
		"\u0000\u0000\u0755\u0756\u0003\u0150\u00a8\u0000\u0756\u0757\u0005p\u0000"+
		"\u0000\u0757\u075b\u0001\u0000\u0000\u0000\u0758\u075b\u0003\u0140\u00a0"+
		"\u0000\u0759\u075b\u0003\u012c\u0096\u0000\u075a\u0755\u0001\u0000\u0000"+
		"\u0000\u075a\u0758\u0001\u0000\u0000\u0000\u075a\u0759\u0001\u0000\u0000"+
		"\u0000\u075b\u011d\u0001\u0000\u0000\u0000\u075c\u075d\u0003.\u0017\u0000"+
		"\u075d\u075f\u0005i\u0000\u0000\u075e\u0760\u0003V+\u0000\u075f\u075e"+
		"\u0001\u0000\u0000\u0000\u075f\u0760\u0001\u0000\u0000\u0000\u0760\u0761"+
		"\u0001\u0000\u0000\u0000\u0761\u0762\u0005\u009c\u0000\u0000\u0762\u079f"+
		"\u0001\u0000\u0000\u0000\u0763\u0764\u0003@ \u0000\u0764\u0766\u0005i"+
		"\u0000\u0000\u0765\u0767\u0003V+\u0000\u0766\u0765\u0001\u0000\u0000\u0000"+
		"\u0766\u0767\u0001\u0000\u0000\u0000\u0767\u0768\u0001\u0000\u0000\u0000"+
		"\u0768\u0769\u0005\u009c\u0000\u0000\u0769\u079f\u0001\u0000\u0000\u0000"+
		"\u076a\u077b\u0003\u0116\u008b\u0000\u076b\u077a\u0003\u0110\u0088\u0000"+
		"\u076c\u076e\u0005\u0088\u0000\u0000\u076d\u076f\u0003V+\u0000\u076e\u076d"+
		"\u0001\u0000\u0000\u0000\u076e\u076f\u0001\u0000\u0000\u0000\u076f\u0770"+
		"\u0001\u0000\u0000\u0000\u0770\u0772\u0005\u009c\u0000\u0000\u0771\u0773"+
		"\u0003\u0110\u0088\u0000\u0772\u0771\u0001\u0000\u0000\u0000\u0772\u0773"+
		"\u0001\u0000\u0000\u0000\u0773\u077a\u0001\u0000\u0000\u0000\u0774\u0775"+
		"\u0005\u0082\u0000\u0000\u0775\u0776\u0003\u012c\u0096\u0000\u0776\u0777"+
		"\u0005\u0083\u0000\u0000\u0777\u077a\u0001\u0000\u0000\u0000\u0778\u077a"+
		"\u0003\u0122\u0091\u0000\u0779\u076b\u0001\u0000\u0000\u0000\u0779\u076c"+
		"\u0001\u0000\u0000\u0000\u0779\u0774\u0001\u0000\u0000\u0000\u0779\u0778"+
		"\u0001\u0000\u0000\u0000\u077a\u077d\u0001\u0000\u0000\u0000\u077b\u0779"+
		"\u0001\u0000\u0000\u0000\u077b\u077c\u0001\u0000\u0000\u0000\u077c\u077e"+
		"\u0001\u0000\u0000\u0000\u077d\u077b\u0001\u0000\u0000\u0000\u077e\u0780"+
		"\u0005i\u0000\u0000\u077f\u0781\u0003V+\u0000\u0780\u077f\u0001\u0000"+
		"\u0000\u0000\u0780\u0781\u0001\u0000\u0000\u0000\u0781\u0782\u0001\u0000"+
		"\u0000\u0000\u0782\u0783\u0005\u009c\u0000\u0000\u0783\u079f\u0001\u0000"+
		"\u0000\u0000\u0784\u0785\u0005*\u0000\u0000\u0785\u0787\u0005i\u0000\u0000"+
		"\u0786\u0788\u0003V+\u0000\u0787\u0786\u0001\u0000\u0000\u0000\u0787\u0788"+
		"\u0001\u0000\u0000\u0000\u0788\u0789\u0001\u0000\u0000\u0000\u0789\u079f"+
		"\u0005\u009c\u0000\u0000\u078a\u078b\u0003.\u0017\u0000\u078b\u078c\u0005"+
		"\u0088\u0000\u0000\u078c\u078d\u0005*\u0000\u0000\u078d\u078f\u0005i\u0000"+
		"\u0000\u078e\u0790\u0003V+\u0000\u078f\u078e\u0001\u0000\u0000\u0000\u078f"+
		"\u0790\u0001\u0000\u0000\u0000\u0790\u0791\u0001\u0000\u0000\u0000\u0791"+
		"\u0792\u0005\u009c\u0000\u0000\u0792\u079f\u0001\u0000\u0000\u0000\u0793"+
		"\u0794\u0003T*\u0000\u0794\u0796\u0005i\u0000\u0000\u0795\u0797\u0003"+
		"V+\u0000\u0796\u0795\u0001\u0000\u0000\u0000\u0796\u0797\u0001\u0000\u0000"+
		"\u0000\u0797\u0798\u0001\u0000\u0000\u0000\u0798\u0799\u00050\u0000\u0000"+
		"\u0799\u079f\u0001\u0000\u0000\u0000\u079a\u079b\u0003@ \u0000\u079b\u079c"+
		"\u0005i\u0000\u0000\u079c\u079d\u00050\u0000\u0000\u079d\u079f\u0001\u0000"+
		"\u0000\u0000\u079e\u075c\u0001\u0000\u0000\u0000\u079e\u0763\u0001\u0000"+
		"\u0000\u0000\u079e\u076a\u0001\u0000\u0000\u0000\u079e\u0784\u0001\u0000"+
		"\u0000\u0000\u079e\u078a\u0001\u0000\u0000\u0000\u079e\u0793\u0001\u0000"+
		"\u0000\u0000\u079e\u079a\u0001\u0000\u0000\u0000\u079f\u011f\u0001\u0000"+
		"\u0000\u0000\u07a0\u07a2\u00050\u0000\u0000\u07a1\u07a3\u0003V+\u0000"+
		"\u07a2\u07a1\u0001\u0000\u0000\u0000\u07a2\u07a3\u0001\u0000\u0000\u0000"+
		"\u07a3\u07a7\u0001\u0000\u0000\u0000\u07a4\u07a6\u0003h4\u0000\u07a5\u07a4"+
		"\u0001\u0000\u0000\u0000\u07a6\u07a9\u0001\u0000\u0000\u0000\u07a7\u07a5"+
		"\u0001\u0000\u0000\u0000\u07a7\u07a8\u0001\u0000\u0000\u0000\u07a8\u07aa"+
		"\u0001\u0000\u0000\u0000\u07a9\u07a7\u0001\u0000\u0000\u0000\u07aa\u07b5"+
		"\u0005\u009c\u0000\u0000\u07ab\u07af\u0005\u0088\u0000\u0000\u07ac\u07ae"+
		"\u0003h4\u0000\u07ad\u07ac\u0001\u0000\u0000\u0000\u07ae\u07b1\u0001\u0000"+
		"\u0000\u0000\u07af\u07ad\u0001\u0000\u0000\u0000\u07af\u07b0\u0001\u0000"+
		"\u0000\u0000\u07b0\u07b2\u0001\u0000\u0000\u0000\u07b1\u07af\u0001\u0000"+
		"\u0000\u0000\u07b2\u07b4\u0005\u009c\u0000\u0000\u07b3\u07ab\u0001\u0000"+
		"\u0000\u0000\u07b4\u07b7\u0001\u0000\u0000\u0000\u07b5\u07b3\u0001\u0000"+
		"\u0000\u0000\u07b5\u07b6\u0001\u0000\u0000\u0000\u07b6\u07b9\u0001\u0000"+
		"\u0000\u0000\u07b7\u07b5\u0001\u0000\u0000\u0000\u07b8\u07ba\u0003X,\u0000"+
		"\u07b9\u07b8\u0001\u0000\u0000\u0000\u07b9\u07ba\u0001\u0000\u0000\u0000"+
		"\u07ba\u07bb\u0001\u0000\u0000\u0000\u07bb\u07bd\u0003\u0110\u0088\u0000"+
		"\u07bc\u07be\u0003\u0080@\u0000\u07bd\u07bc\u0001\u0000\u0000\u0000\u07bd"+
		"\u07be\u0001\u0000\u0000\u0000\u07be\u0121\u0001\u0000\u0000\u0000\u07bf"+
		"\u07c0\u0005\u0088\u0000\u0000\u07c0\u07c2\u00050\u0000\u0000\u07c1\u07c3"+
		"\u0003V+\u0000\u07c2\u07c1\u0001\u0000\u0000\u0000\u07c2\u07c3\u0001\u0000"+
		"\u0000\u0000\u07c3\u07c7\u0001\u0000\u0000\u0000\u07c4\u07c6\u0003h4\u0000"+
		"\u07c5\u07c4\u0001\u0000\u0000\u0000\u07c6\u07c9\u0001\u0000\u0000\u0000"+
		"\u07c7\u07c5\u0001\u0000\u0000\u0000\u07c7\u07c8\u0001\u0000\u0000\u0000"+
		"\u07c8\u07ca\u0001\u0000\u0000\u0000\u07c9\u07c7\u0001\u0000\u0000\u0000"+
		"\u07ca\u07d5\u0005\u009c\u0000\u0000\u07cb\u07cf\u0005\u0088\u0000\u0000"+
		"\u07cc\u07ce\u0003h4\u0000\u07cd\u07cc\u0001\u0000\u0000\u0000\u07ce\u07d1"+
		"\u0001\u0000\u0000\u0000\u07cf\u07cd\u0001\u0000\u0000\u0000\u07cf\u07d0"+
		"\u0001\u0000\u0000\u0000\u07d0\u07d2\u0001\u0000\u0000\u0000\u07d1\u07cf"+
		"\u0001\u0000\u0000\u0000\u07d2\u07d4\u0005\u009c\u0000\u0000\u07d3\u07cb"+
		"\u0001\u0000\u0000\u0000\u07d4\u07d7\u0001\u0000\u0000\u0000\u07d5\u07d3"+
		"\u0001\u0000\u0000\u0000\u07d5\u07d6\u0001\u0000\u0000\u0000\u07d6\u07d9"+
		"\u0001\u0000\u0000\u0000\u07d7\u07d5\u0001\u0000\u0000\u0000\u07d8\u07da"+
		"\u0003X,\u0000\u07d9\u07d8\u0001\u0000\u0000\u0000\u07d9\u07da\u0001\u0000"+
		"\u0000\u0000\u07da\u07db\u0001\u0000\u0000\u0000\u07db\u07dd\u0003\u0110"+
		"\u0088\u0000\u07dc\u07de\u0003\u0080@\u0000\u07dd\u07dc\u0001\u0000\u0000"+
		"\u0000\u07dd\u07de\u0001\u0000\u0000\u0000\u07de\u0123\u0001\u0000\u0000"+
		"\u0000\u07df\u07e0\u00050\u0000\u0000\u07e0\u07e1\u0003>\u001f\u0000\u07e1"+
		"\u07e3\u0003\u0126\u0093\u0000\u07e2\u07e4\u0003\u0128\u0094\u0000\u07e3"+
		"\u07e2\u0001\u0000\u0000\u0000\u07e3\u07e4\u0001\u0000\u0000\u0000\u07e4"+
		"\u07f6\u0001\u0000\u0000\u0000\u07e5\u07e6\u00050\u0000\u0000\u07e6\u07e7"+
		"\u0003T*\u0000\u07e7\u07e9\u0003\u0126\u0093\u0000\u07e8\u07ea\u0003\u0128"+
		"\u0094\u0000\u07e9\u07e8\u0001\u0000\u0000\u0000\u07e9\u07ea\u0001\u0000"+
		"\u0000\u0000\u07ea\u07f6\u0001\u0000\u0000\u0000\u07eb\u07ec\u00050\u0000"+
		"\u0000\u07ec\u07ed\u0003>\u001f\u0000\u07ed\u07ee\u0003\u0128\u0094\u0000"+
		"\u07ee\u07ef\u0003<\u001e\u0000\u07ef\u07f6\u0001\u0000\u0000\u0000\u07f0"+
		"\u07f1\u00050\u0000\u0000\u07f1\u07f2\u0003T*\u0000\u07f2\u07f3\u0003"+
		"\u0128\u0094\u0000\u07f3\u07f4\u0003<\u001e\u0000\u07f4\u07f6\u0001\u0000"+
		"\u0000\u0000\u07f5\u07df\u0001\u0000\u0000\u0000\u07f5\u07e5\u0001\u0000"+
		"\u0000\u0000\u07f5\u07eb\u0001\u0000\u0000\u0000\u07f5\u07f0\u0001\u0000"+
		"\u0000\u0000\u07f6\u0125\u0001\u0000\u0000\u0000\u07f7\u07fb\u0003\u012a"+
		"\u0095\u0000\u07f8\u07fa\u0003\u012a\u0095\u0000\u07f9\u07f8\u0001\u0000"+
		"\u0000\u0000\u07fa\u07fd\u0001\u0000\u0000\u0000\u07fb\u07f9\u0001\u0000"+
		"\u0000\u0000\u07fb\u07fc\u0001\u0000\u0000\u0000\u07fc\u0127\u0001\u0000"+
		"\u0000\u0000\u07fd\u07fb\u0001\u0000\u0000\u0000\u07fe\u07ff\u0005\u0082"+
		"\u0000\u0000\u07ff\u0801\u0005\u0083\u0000\u0000\u0800\u07fe\u0001\u0000"+
		"\u0000\u0000\u0801\u0802\u0001\u0000\u0000\u0000\u0802\u0800\u0001\u0000"+
		"\u0000\u0000\u0802\u0803\u0001\u0000\u0000\u0000\u0803\u0129\u0001\u0000"+
		"\u0000\u0000\u0804\u0806\u0003h4\u0000\u0805\u0804\u0001\u0000\u0000\u0000"+
		"\u0806\u0809\u0001\u0000\u0000\u0000\u0807\u0805\u0001\u0000\u0000\u0000"+
		"\u0807\u0808\u0001\u0000\u0000\u0000\u0808\u080a\u0001\u0000\u0000\u0000"+
		"\u0809\u0807\u0001\u0000\u0000\u0000\u080a\u080b\u0005\u0082\u0000\u0000"+
		"\u080b\u080c\u0003\u012c\u0096\u0000\u080c\u080d\u0005\u0083\u0000\u0000"+
		"\u080d\u012b\u0001\u0000\u0000\u0000\u080e\u0811\u0003\u012e\u0097\u0000"+
		"\u080f\u0811\u0003\u0134\u009a\u0000\u0810\u080e\u0001\u0000\u0000\u0000"+
		"\u0810\u080f\u0001\u0000\u0000\u0000\u0811\u012d\u0001\u0000\u0000\u0000"+
		"\u0812\u0813\u0003\u0130\u0098\u0000\u0813\u0814\u0005c\u0000\u0000\u0814"+
		"\u0815\u0003\u0132\u0099\u0000\u0815\u012f\u0001\u0000\u0000\u0000\u0816"+
		"\u0831\u0005\u009c\u0000\u0000\u0817\u0823\u0005\u0080\u0000\u0000\u0818"+
		"\u081d\u0005\u009c\u0000\u0000\u0819\u081a\u0005\u0087\u0000\u0000\u081a"+
		"\u081c\u0005\u009c\u0000\u0000\u081b\u0819\u0001\u0000\u0000\u0000\u081c"+
		"\u081f\u0001\u0000\u0000\u0000\u081d\u081b\u0001\u0000\u0000\u0000\u081d"+
		"\u081e\u0001\u0000\u0000\u0000\u081e\u0821\u0001\u0000\u0000\u0000\u081f"+
		"\u081d\u0001\u0000\u0000\u0000\u0820\u0822\u0005\u0087\u0000\u0000\u0821"+
		"\u0820\u0001\u0000\u0000\u0000\u0821\u0822\u0001\u0000\u0000\u0000\u0822"+
		"\u0824\u0001\u0000\u0000\u0000\u0823\u0818\u0001\u0000\u0000\u0000\u0823"+
		"\u0824\u0001\u0000\u0000\u0000\u0824\u0825\u0001\u0000\u0000\u0000\u0825"+
		"\u0831\u0005\u0081\u0000\u0000\u0826\u082d\u0005\u0080\u0000\u0000\u0827"+
		"\u082e\u0003\u00d6k\u0000\u0828\u0829\u0003\u00d0h\u0000\u0829\u082a\u0005"+
		"\u0087\u0000\u0000\u082a\u082b\u0003\u00d4j\u0000\u082b\u082e\u0001\u0000"+
		"\u0000\u0000\u082c\u082e\u0003\u00d4j\u0000\u082d\u0827\u0001\u0000\u0000"+
		"\u0000\u082d\u0828\u0001\u0000\u0000\u0000\u082d\u082c\u0001\u0000\u0000"+
		"\u0000\u082d\u082e\u0001\u0000\u0000\u0000\u082e\u082f\u0001\u0000\u0000"+
		"\u0000\u082f\u0831\u0005\u0081\u0000\u0000\u0830\u0816\u0001\u0000\u0000"+
		"\u0000\u0830\u0817\u0001\u0000\u0000\u0000\u0830\u0826\u0001\u0000\u0000"+
		"\u0000\u0831\u0131\u0001\u0000\u0000\u0000\u0832\u0835\u0003\u012c\u0096"+
		"\u0000\u0833\u0835\u0003\u0158\u00ac\u0000\u0834\u0832\u0001\u0000\u0000"+
		"\u0000\u0834\u0833\u0001\u0000\u0000\u0000\u0835\u0133\u0001\u0000\u0000"+
		"\u0000\u0836\u0839\u0003\u0136\u009b\u0000\u0837\u0839\u0003\u014e\u00a7"+
		"\u0000\u0838\u0836\u0001\u0000\u0000\u0000\u0838\u0837\u0001\u0000\u0000"+
		"\u0000\u0839\u0135\u0001\u0000\u0000\u0000\u083a\u0842\u0003\u0138\u009c"+
		"\u0000\u083b\u083c\u0003\u0138\u009c\u0000\u083c\u083d\u0005\u008a\u0000"+
		"\u0000\u083d\u083e\u0003\u012c\u0096\u0000\u083e\u083f\u0005\u0089\u0000"+
		"\u0000\u083f\u0840\u0003\u0136\u009b\u0000\u0840\u0842\u0001\u0000\u0000"+
		"\u0000\u0841\u083a\u0001\u0000\u0000\u0000\u0841\u083b\u0001\u0000\u0000"+
		"\u0000\u0842\u0137\u0001\u0000\u0000\u0000\u0843\u0844\u0006\u009c\uffff"+
		"\uffff\u0000\u0844\u0845\u0003\u013a\u009d\u0000\u0845\u0866\u0001\u0000"+
		"\u0000\u0000\u0846\u0847\n\n\u0000\u0000\u0847\u0848\u0007\t\u0000\u0000"+
		"\u0848\u0865\u0003\u013a\u009d\u0000\u0849\u084a\n\t\u0000\u0000\u084a"+
		"\u084b\u0007\n\u0000\u0000\u084b\u0865\u0003\u013a\u009d\u0000\u084c\u084d"+
		"\n\b\u0000\u0000\u084d\u084e\u0007\u000b\u0000\u0000\u084e\u0865\u0003"+
		"\u013a\u009d\u0000\u084f\u0850\n\u0007\u0000\u0000\u0850\u0851\u0007\f"+
		"\u0000\u0000\u0851\u0865\u0003\u013a\u009d\u0000\u0852\u0853\n\u0006\u0000"+
		"\u0000\u0853\u0854\u0007\r\u0000\u0000\u0854\u0865\u0003\u013a\u009d\u0000"+
		"\u0855\u0856\n\u0005\u0000\u0000\u0856\u0857\u0005\u0097\u0000\u0000\u0857"+
		"\u0865\u0003\u013a\u009d\u0000\u0858\u0859\n\u0004\u0000\u0000\u0859\u085a"+
		"\u0005\u009b\u0000\u0000\u085a\u0865\u0003\u013a\u009d\u0000\u085b\u085c"+
		"\n\u0003\u0000\u0000\u085c\u085d\u0007\u0003\u0000\u0000\u085d\u0865\u0003"+
		"\u013a\u009d\u0000\u085e\u085f\n\u0002\u0000\u0000\u085f\u0860\u0007\u000e"+
		"\u0000\u0000\u0860\u0865\u0003\u013a\u009d\u0000\u0861\u0862\n\u0001\u0000"+
		"\u0000\u0862\u0863\u0007\u000f\u0000\u0000\u0863\u0865\u0003\u013a\u009d"+
		"\u0000\u0864\u0846\u0001\u0000\u0000\u0000\u0864\u0849\u0001\u0000\u0000"+
		"\u0000\u0864\u084c\u0001\u0000\u0000\u0000\u0864\u084f\u0001\u0000\u0000"+
		"\u0000\u0864\u0852\u0001\u0000\u0000\u0000\u0864\u0855\u0001\u0000\u0000"+
		"\u0000\u0864\u0858\u0001\u0000\u0000\u0000\u0864\u085b\u0001\u0000\u0000"+
		"\u0000\u0864\u085e\u0001\u0000\u0000\u0000\u0864\u0861\u0001\u0000\u0000"+
		"\u0000\u0865\u0868\u0001\u0000\u0000\u0000\u0866\u0864\u0001\u0000\u0000"+
		"\u0000\u0866\u0867\u0001\u0000\u0000\u0000\u0867\u0139\u0001\u0000\u0000"+
		"\u0000\u0868\u0866\u0001\u0000\u0000\u0000\u0869\u086a\u0005\u0090\u0000"+
		"\u0000\u086a\u086f\u0003\u013a\u009d\u0000\u086b\u086c\u0005\u0091\u0000"+
		"\u0000\u086c\u086f\u0003\u013a\u009d\u0000\u086d\u086f\u0003\u013c\u009e"+
		"\u0000\u086e\u0869\u0001\u0000\u0000\u0000\u086e\u086b\u0001\u0000\u0000"+
		"\u0000\u086e\u086d\u0001\u0000\u0000\u0000\u086f\u013b\u0001\u0000\u0000"+
		"\u0000\u0870\u087a\u0003\u0144\u00a2\u0000\u0871\u087a\u0003\u0118\u008c"+
		"\u0000\u0872\u0873\u0005\u0096\u0000\u0000\u0873\u087a\u0003\u013a\u009d"+
		"\u0000\u0874\u0875\u0007\u0010\u0000\u0000\u0875\u087a\u0003\u013a\u009d"+
		"\u0000\u0876\u087a\u0003\u013e\u009f\u0000\u0877\u087a\u0003\u0140\u00a0"+
		"\u0000\u0878\u087a\u0003\u0142\u00a1\u0000\u0879\u0870\u0001\u0000\u0000"+
		"\u0000\u0879\u0871\u0001\u0000\u0000\u0000\u0879\u0872\u0001\u0000\u0000"+
		"\u0000\u0879\u0874\u0001\u0000\u0000\u0000\u0879\u0876\u0001\u0000\u0000"+
		"\u0000\u0879\u0877\u0001\u0000\u0000\u0000\u0879\u0878\u0001\u0000\u0000"+
		"\u0000\u087a\u013d\u0001\u0000\u0000\u0000\u087b\u087c\u0005B\u0000\u0000"+
		"\u087c\u087d\u0003\u013a\u009d\u0000\u087d\u013f\u0001\u0000\u0000\u0000"+
		"\u087e\u087f\u0005C\u0000\u0000\u087f\u0880\u0003\u0198\u00cc\u0000\u0880"+
		"\u0141\u0001\u0000\u0000\u0000\u0881\u0882\u0005\u0080\u0000\u0000\u0882"+
		"\u0883\u0003>\u001f\u0000\u0883\u0884\u0005\u0081\u0000\u0000\u0884\u0885"+
		"\u0003\u013a\u009d\u0000\u0885\u0895\u0001\u0000\u0000\u0000\u0886\u0887"+
		"\u0005\u0080\u0000\u0000\u0887\u088c\u0003@ \u0000\u0888\u0889\u0005\u0097"+
		"\u0000\u0000\u0889\u088b\u0003@ \u0000\u088a\u0888\u0001\u0000\u0000\u0000"+
		"\u088b\u088e\u0001\u0000\u0000\u0000\u088c\u088a\u0001\u0000\u0000\u0000"+
		"\u088c\u088d\u0001\u0000\u0000\u0000\u088d\u088f\u0001\u0000\u0000\u0000"+
		"\u088e\u088c\u0001\u0000\u0000\u0000\u088f\u0892\u0005\u0081\u0000\u0000"+
		"\u0890\u0893\u0003\u013c\u009e\u0000\u0891\u0893\u0003\u012e\u0097\u0000"+
		"\u0892\u0890\u0001\u0000\u0000\u0000\u0892\u0891\u0001\u0000\u0000\u0000"+
		"\u0893\u0895\u0001\u0000\u0000\u0000\u0894\u0881\u0001\u0000\u0000\u0000"+
		"\u0894\u0886\u0001\u0000\u0000\u0000\u0895\u0143\u0001\u0000\u0000\u0000"+
		"\u0896\u0897\u0003 \u0010\u0000\u0897\u0898\u0003\u013a\u009d\u0000\u0898"+
		"\u0899\u0003\u001e\u000f\u0000\u0899\u089a\u0003\u0146\u00a3\u0000\u089a"+
		"\u0145\u0001\u0000\u0000\u0000\u089b\u089c\u0003\u0148\u00a4\u0000\u089c"+
		"\u0147\u0001\u0000\u0000\u0000\u089d\u08a2\u0003\u014a\u00a5\u0000\u089e"+
		"\u089f\u0007\u0003\u0000\u0000\u089f\u08a1\u0003\u014a\u00a5\u0000\u08a0"+
		"\u089e\u0001\u0000\u0000\u0000\u08a1\u08a4\u0001\u0000\u0000\u0000\u08a2"+
		"\u08a0\u0001\u0000\u0000\u0000\u08a2\u08a3\u0001\u0000\u0000\u0000\u08a3"+
		"\u0149\u0001\u0000\u0000\u0000\u08a4\u08a2\u0001\u0000\u0000\u0000\u08a5"+
		"\u08aa\u0003\u014c\u00a6\u0000\u08a6\u08a7\u0007\u0005\u0000\u0000\u08a7"+
		"\u08a9\u0003\u014c\u00a6\u0000\u08a8\u08a6\u0001\u0000\u0000\u0000\u08a9"+
		"\u08ac\u0001\u0000\u0000\u0000\u08aa\u08a8\u0001\u0000\u0000\u0000\u08aa"+
		"\u08ab\u0001\u0000\u0000\u0000\u08ab\u014b\u0001\u0000\u0000\u0000\u08ac"+
		"\u08aa\u0001\u0000\u0000\u0000\u08ad\u08ae\u0005\u0080\u0000\u0000\u08ae"+
		"\u08af\u0003\u0146\u00a3\u0000\u08af\u08b0\u0005\u0081\u0000\u0000\u08b0"+
		"\u08b3\u0001\u0000\u0000\u0000\u08b1\u08b3\u0003T*\u0000\u08b2\u08ad\u0001"+
		"\u0000\u0000\u0000\u08b2\u08b1\u0001\u0000\u0000\u0000\u08b3\u014d\u0001"+
		"\u0000\u0000\u0000\u08b4\u08b5\u0003\u0150\u00a8\u0000\u08b5\u08b6\u0003"+
		"\u0156\u00ab\u0000\u08b6\u08b7\u0003\u012c\u0096\u0000\u08b7\u014f\u0001"+
		"\u0000\u0000\u0000\u08b8\u08bb\u0003.\u0017\u0000\u08b9\u08bb\u0003\u0152"+
		"\u00a9\u0000\u08ba\u08b8\u0001\u0000\u0000\u0000\u08ba\u08b9\u0001\u0000"+
		"\u0000\u0000\u08bb\u0151\u0001\u0000\u0000\u0000\u08bc\u08be\u0003\u0116"+
		"\u008b\u0000\u08bd\u08bf\u0003\u0154\u00aa\u0000\u08be\u08bd\u0001\u0000"+
		"\u0000\u0000\u08bf\u08c0\u0001\u0000\u0000\u0000\u08c0\u08be\u0001\u0000"+
		"\u0000\u0000\u08c0\u08c1\u0001\u0000\u0000\u0000\u08c1\u0153\u0001\u0000"+
		"\u0000\u0000\u08c2\u08c3\u0005\u0088\u0000\u0000\u08c3\u08c9\u0005\u009c"+
		"\u0000\u0000\u08c4\u08c5\u0005\u0082\u0000\u0000\u08c5\u08c6\u0003\u012c"+
		"\u0096\u0000\u08c6\u08c7\u0005\u0083\u0000\u0000\u08c7\u08c9\u0001\u0000"+
		"\u0000\u0000\u08c8\u08c2\u0001\u0000\u0000\u0000\u08c8\u08c4\u0001\u0000"+
		"\u0000\u0000\u08c9\u0155\u0001\u0000\u0000\u0000\u08ca\u08cb\u0007\u0011"+
		"\u0000\u0000\u08cb\u0157\u0001\u0000\u0000\u0000\u08cc\u08d0\u0005\u0084"+
		"\u0000\u0000\u08cd\u08cf\u0003\u015a\u00ad\u0000\u08ce\u08cd\u0001\u0000"+
		"\u0000\u0000\u08cf\u08d2\u0001\u0000\u0000\u0000\u08d0\u08ce\u0001\u0000"+
		"\u0000\u0000\u08d0\u08d1\u0001\u0000\u0000\u0000\u08d1\u08d3\u0001\u0000"+
		"\u0000\u0000\u08d2\u08d0\u0001\u0000\u0000\u0000\u08d3\u08d4\u0005\u0085"+
		"\u0000\u0000\u08d4\u0159\u0001\u0000\u0000\u0000\u08d5\u08dc\u0003\u00dc"+
		"n\u0000\u08d6\u08d9\u0003z=\u0000\u08d7\u08d9\u0003\u00aaU\u0000\u08d8"+
		"\u08d6\u0001\u0000\u0000\u0000\u08d8\u08d7\u0001\u0000\u0000\u0000\u08d9"+
		"\u08dc\u0001\u0000\u0000\u0000\u08da\u08dc\u0003\u015c\u00ae\u0000\u08db"+
		"\u08d5\u0001\u0000\u0000\u0000\u08db\u08d8\u0001\u0000\u0000\u0000\u08db"+
		"\u08da\u0001\u0000\u0000\u0000\u08dc\u015b\u0001\u0000\u0000\u0000\u08dd"+
		"\u08f1\u0003\u0158\u00ac\u0000\u08de\u08f1\u0005\u0086\u0000\u0000\u08df"+
		"\u08f1\u0003\u0166\u00b3\u0000\u08e0\u08f1\u0003\u0168\u00b4\u0000\u08e1"+
		"\u08f1\u0003\u016a\u00b5\u0000\u08e2\u08f1\u0003\u0170\u00b8\u0000\u08e3"+
		"\u08f1\u0003\u0172\u00b9\u0000\u08e4\u08f1\u0003\u017c\u00be\u0000\u08e5"+
		"\u08f1\u0003\u0186\u00c3\u0000\u08e6\u08f1\u0003\u0188\u00c4\u0000\u08e7"+
		"\u08f1\u0003\u018a\u00c5\u0000\u08e8\u08f1\u0003\u018e\u00c7\u0000\u08e9"+
		"\u08f1\u0003\u018c\u00c6\u0000\u08ea\u08f1\u0003\u0190\u00c8\u0000\u08eb"+
		"\u08f1\u0003\u0164\u00b2\u0000\u08ec\u08f1\u0003\u016c\u00b6\u0000\u08ed"+
		"\u08f1\u0003\u017a\u00bd\u0000\u08ee\u08f1\u0003\u017e\u00bf\u0000\u08ef"+
		"\u08f1\u0003\u015e\u00af\u0000\u08f0\u08dd\u0001\u0000\u0000\u0000\u08f0"+
		"\u08de\u0001\u0000\u0000\u0000\u08f0\u08df\u0001\u0000\u0000\u0000\u08f0"+
		"\u08e0\u0001\u0000\u0000\u0000\u08f0\u08e1\u0001\u0000\u0000\u0000\u08f0"+
		"\u08e2\u0001\u0000\u0000\u0000\u08f0\u08e3\u0001\u0000\u0000\u0000\u08f0"+
		"\u08e4\u0001\u0000\u0000\u0000\u08f0\u08e5\u0001\u0000\u0000\u0000\u08f0"+
		"\u08e6\u0001\u0000\u0000\u0000\u08f0\u08e7\u0001\u0000\u0000\u0000\u08f0"+
		"\u08e8\u0001\u0000\u0000\u0000\u08f0\u08e9\u0001\u0000\u0000\u0000\u08f0"+
		"\u08ea\u0001\u0000\u0000\u0000\u08f0\u08eb\u0001\u0000\u0000\u0000\u08f0"+
		"\u08ec\u0001\u0000\u0000\u0000\u08f0\u08ed\u0001\u0000\u0000\u0000\u08f0"+
		"\u08ee\u0001\u0000\u0000\u0000\u08f0\u08ef\u0001\u0000\u0000\u0000\u08f1"+
		"\u015d\u0001\u0000\u0000\u0000\u08f2\u08f3\u0005A\u0000\u0000\u08f3\u08f4"+
		"\u0003\u015c\u00ae\u0000\u08f4\u015f\u0001\u0000\u0000\u0000\u08f5\u08f6"+
		"\u0003\u0016\u000b\u0000\u08f6\u08f9\u0003\u0158\u00ac\u0000\u08f7\u08f8"+
		"\u00052\u0000\u0000\u08f8\u08fa\u0003\u0158\u00ac\u0000\u08f9\u08f7\u0001"+
		"\u0000\u0000\u0000\u08f9\u08fa\u0001\u0000\u0000\u0000\u08fa\u0161\u0001"+
		"\u0000\u0000\u0000\u08fb\u08ff\u0003\u017a\u00bd\u0000\u08fc\u08ff\u0003"+
		"\u017c\u00be\u0000\u08fd\u08ff\u0003\u017e\u00bf\u0000\u08fe\u08fb\u0001"+
		"\u0000\u0000\u0000\u08fe\u08fc\u0001\u0000\u0000\u0000\u08fe\u08fd\u0001"+
		"\u0000\u0000\u0000\u08ff\u0163\u0001\u0000\u0000\u0000\u0900\u0901\u0003"+
		"\u0018\f\u0000\u0901\u0902\u0005\u009c\u0000\u0000\u0902\u0903\u0005\u0089"+
		"\u0000\u0000\u0903\u0904\u0003\u0162\u00b1\u0000\u0904\u0165\u0001\u0000"+
		"\u0000\u0000\u0905\u0906\u0003\u011c\u008e\u0000\u0906\u0907\u0005\u0086"+
		"\u0000\u0000\u0907\u0167\u0001\u0000\u0000\u0000\u0908\u0909\u0003\u0140"+
		"\u00a0\u0000\u0909\u090a\u0005\u0086\u0000\u0000\u090a\u0169\u0001\u0000"+
		"\u0000\u0000\u090b\u090d\u0005D\u0000\u0000\u090c\u090e\u0005\u0092\u0000"+
		"\u0000\u090d\u090c\u0001\u0000\u0000\u0000\u090d\u090e\u0001\u0000\u0000"+
		"\u0000\u090e\u090f\u0001\u0000\u0000\u0000\u090f\u0910\u0003\u012c\u0096"+
		"\u0000\u0910\u0911\u0005\u0086\u0000\u0000\u0911\u016b\u0001\u0000\u0000"+
		"\u0000\u0912\u0913\u00051\u0000\u0000\u0913\u0914\u0005\u0080\u0000\u0000"+
		"\u0914\u0915\u0003\u012c\u0096\u0000\u0915\u0916\u0005\u0081\u0000\u0000"+
		"\u0916\u0918\u0003\u0158\u00ac\u0000\u0917\u0919\u0003\u016e\u00b7\u0000"+
		"\u0918\u0917\u0001\u0000\u0000\u0000\u0918\u0919\u0001\u0000\u0000\u0000"+
		"\u0919\u016d\u0001\u0000\u0000\u0000\u091a\u091d\u00052\u0000\u0000\u091b"+
		"\u091e\u0003\u016c\u00b6\u0000\u091c\u091e\u0003\u0158\u00ac\u0000\u091d"+
		"\u091b\u0001\u0000\u0000\u0000\u091d\u091c\u0001\u0000\u0000\u0000\u091e"+
		"\u016f\u0001\u0000\u0000\u0000\u091f\u0920\u0005R\u0000\u0000\u0920\u0921"+
		"\u0003\u012c\u0096\u0000\u0921\u0922\u0005\u0086\u0000\u0000\u0922\u092a"+
		"\u0001\u0000\u0000\u0000\u0923\u0924\u0005R\u0000\u0000\u0924\u0925\u0003"+
		"\u012c\u0096\u0000\u0925\u0926\u0005\u0089\u0000\u0000\u0926\u0927\u0003"+
		"\u012c\u0096\u0000\u0927\u0928\u0005\u0086\u0000\u0000\u0928\u092a\u0001"+
		"\u0000\u0000\u0000\u0929\u091f\u0001\u0000\u0000\u0000\u0929\u0923\u0001"+
		"\u0000\u0000\u0000\u092a\u0171\u0001\u0000\u0000\u0000\u092b\u092c\u0005"+
		"7\u0000\u0000\u092c\u092d\u0005\u0080\u0000\u0000\u092d\u092e\u0003\u012c"+
		"\u0096\u0000\u092e\u092f\u0005\u0081\u0000\u0000\u092f\u0930\u0003\u0174"+
		"\u00ba\u0000\u0930\u0173\u0001\u0000\u0000\u0000\u0931\u0935\u0005\u0084"+
		"\u0000\u0000\u0932\u0934\u0003\u0176\u00bb\u0000\u0933\u0932\u0001\u0000"+
		"\u0000\u0000\u0934\u0937\u0001\u0000\u0000\u0000\u0935\u0933\u0001\u0000"+
		"\u0000\u0000\u0935\u0936\u0001\u0000\u0000\u0000\u0936\u0938\u0001\u0000"+
		"\u0000\u0000\u0937\u0935\u0001\u0000\u0000\u0000\u0938\u0939\u0005\u0085"+
		"\u0000\u0000\u0939\u0175\u0001\u0000\u0000\u0000\u093a\u093b\u0003\u0014"+
		"\n\u0000\u093b\u0940\u0003\u00eew\u0000\u093c\u093d\u0005\u0087\u0000"+
		"\u0000\u093d\u093f\u0003\u00eew\u0000\u093e\u093c\u0001\u0000\u0000\u0000"+
		"\u093f\u0942\u0001\u0000\u0000\u0000\u0940\u093e\u0001\u0000\u0000\u0000"+
		"\u0940\u0941\u0001\u0000\u0000\u0000\u0941\u0944\u0001\u0000\u0000\u0000"+
		"\u0942\u0940\u0001\u0000\u0000\u0000\u0943\u0945\u0005\u0087\u0000\u0000"+
		"\u0944\u0943\u0001\u0000\u0000\u0000\u0944\u0945\u0001\u0000\u0000\u0000"+
		"\u0945\u0947\u0001\u0000\u0000\u0000\u0946\u0948\u0003\u0178\u00bc\u0000"+
		"\u0947\u0946\u0001\u0000\u0000\u0000\u0947\u0948\u0001\u0000\u0000\u0000"+
		"\u0948\u0949\u0001\u0000\u0000\u0000\u0949\u094a\u0005\u008c\u0000\u0000"+
		"\u094a\u094b\u0003\u0158\u00ac\u0000\u094b\u0950\u0001\u0000\u0000\u0000"+
		"\u094c\u094d\u00058\u0000\u0000\u094d\u094e\u0005\u008c\u0000\u0000\u094e"+
		"\u0950\u0003\u0158\u00ac\u0000\u094f\u093a\u0001\u0000\u0000\u0000\u094f"+
		"\u094c\u0001\u0000\u0000\u0000\u0950\u0177\u0001\u0000\u0000\u0000\u0951"+
		"\u0952\u00051\u0000\u0000\u0952\u0953\u0003\u012c\u0096\u0000\u0953\u0179"+
		"\u0001\u0000\u0000\u0000\u0954\u0955\u00053\u0000\u0000\u0955\u0956\u0005"+
		"\u0080\u0000\u0000\u0956\u0957\u0003\u012c\u0096\u0000\u0957\u0958\u0005"+
		"\u0081\u0000\u0000\u0958\u095a\u0003\u0158\u00ac\u0000\u0959\u095b\u0003"+
		"\u0160\u00b0\u0000\u095a\u0959\u0001\u0000\u0000\u0000\u095a\u095b\u0001"+
		"\u0000\u0000\u0000\u095b\u017b\u0001\u0000\u0000\u0000\u095c\u095d\u0005"+
		"4\u0000\u0000\u095d\u095e\u0003\u0158\u00ac\u0000\u095e\u095f\u00053\u0000"+
		"\u0000\u095f\u0960\u0005\u0080\u0000\u0000\u0960\u0961\u0003\u012c\u0096"+
		"\u0000\u0961\u0962\u0005\u0081\u0000\u0000\u0962\u0964\u0005\u0086\u0000"+
		"\u0000\u0963\u0965\u0003\u0160\u00b0\u0000\u0964\u0963\u0001\u0000\u0000"+
		"\u0000\u0964\u0965\u0001\u0000\u0000\u0000\u0965\u017d\u0001\u0000\u0000"+
		"\u0000\u0966\u0967\u00055\u0000\u0000\u0967\u0968\u0005\u0080\u0000\u0000"+
		"\u0968\u0969\u0003\u019a\u00cd\u0000\u0969\u096a\u0005\u0081\u0000\u0000"+
		"\u096a\u096c\u0003\u0158\u00ac\u0000\u096b\u096d\u0003\u0160\u00b0\u0000"+
		"\u096c\u096b\u0001\u0000\u0000\u0000\u096c\u096d\u0001\u0000\u0000\u0000"+
		"\u096d\u017f\u0001\u0000\u0000\u0000\u096e\u096f\u0007\u0000\u0000\u0000"+
		"\u096f\u0974\u0003\u00e0p\u0000\u0970\u0971\u0005\u0087\u0000\u0000\u0971"+
		"\u0973\u0003\u00e0p\u0000\u0972\u0970\u0001\u0000\u0000\u0000\u0973\u0976"+
		"\u0001\u0000\u0000\u0000\u0974\u0972\u0001\u0000\u0000\u0000\u0974\u0975"+
		"\u0001\u0000";
	private static final String _serializedATNSegment1 =
		"\u0000\u0000\u0975\u0978\u0001\u0000\u0000\u0000\u0976\u0974\u0001\u0000"+
		"\u0000\u0000\u0977\u0979\u0005\u0087\u0000\u0000\u0978\u0977\u0001\u0000"+
		"\u0000\u0000\u0978\u0979\u0001\u0000\u0000\u0000\u0979\u0986\u0001\u0000"+
		"\u0000\u0000\u097a\u097f\u0003\u011c\u008e\u0000\u097b\u097c\u0005\u0087"+
		"\u0000\u0000\u097c\u097e\u0003\u011c\u008e\u0000\u097d\u097b\u0001\u0000"+
		"\u0000\u0000\u097e\u0981\u0001\u0000\u0000\u0000\u097f\u097d\u0001\u0000"+
		"\u0000\u0000\u097f\u0980\u0001\u0000\u0000\u0000\u0980\u0983\u0001\u0000"+
		"\u0000\u0000\u0981\u097f\u0001\u0000\u0000\u0000\u0982\u0984\u0005\u0087"+
		"\u0000\u0000\u0983\u0982\u0001\u0000\u0000\u0000\u0983\u0984\u0001\u0000"+
		"\u0000\u0000\u0984\u0986\u0001\u0000\u0000\u0000\u0985\u096e\u0001\u0000"+
		"\u0000\u0000\u0985\u097a\u0001\u0000\u0000\u0000\u0986\u0181\u0001\u0000"+
		"\u0000\u0000\u0987\u098c\u0003\u011c\u008e\u0000\u0988\u0989\u0005\u0087"+
		"\u0000\u0000\u0989\u098b\u0003\u011c\u008e\u0000\u098a\u0988\u0001\u0000"+
		"\u0000\u0000\u098b\u098e\u0001\u0000\u0000\u0000\u098c\u098a\u0001\u0000"+
		"\u0000\u0000\u098c\u098d\u0001\u0000\u0000\u0000\u098d\u0990\u0001\u0000"+
		"\u0000\u0000\u098e\u098c\u0001\u0000\u0000\u0000\u098f\u0991\u0005\u0087"+
		"\u0000\u0000\u0990\u098f\u0001\u0000\u0000\u0000\u0990\u0991\u0001\u0000"+
		"\u0000\u0000\u0991\u0183\u0001\u0000\u0000\u0000\u0992\u0994\u0003\u0180"+
		"\u00c0\u0000\u0993\u0992\u0001\u0000\u0000\u0000\u0993\u0994\u0001\u0000"+
		"\u0000\u0000\u0994\u0995\u0001\u0000\u0000\u0000\u0995\u0997\u0005\u0086"+
		"\u0000\u0000\u0996\u0998\u0003\u012c\u0096\u0000\u0997\u0996\u0001\u0000"+
		"\u0000\u0000\u0997\u0998\u0001\u0000\u0000\u0000\u0998\u0999\u0001\u0000"+
		"\u0000\u0000\u0999\u099b\u0005\u0086\u0000\u0000\u099a\u099c\u0003\u0182"+
		"\u00c1\u0000\u099b\u099a\u0001\u0000\u0000\u0000\u099b\u099c\u0001\u0000"+
		"\u0000\u0000\u099c\u0185\u0001\u0000\u0000\u0000\u099d\u099f\u0005:\u0000"+
		"\u0000\u099e\u09a0\u0005\u009c\u0000\u0000\u099f\u099e\u0001\u0000\u0000"+
		"\u0000\u099f\u09a0\u0001\u0000\u0000\u0000\u09a0\u09a1\u0001\u0000\u0000"+
		"\u0000\u09a1\u09a2\u0005\u0086\u0000\u0000\u09a2\u0187\u0001\u0000\u0000"+
		"\u0000\u09a3\u09a5\u00059\u0000\u0000\u09a4\u09a6\u0005\u009c\u0000\u0000"+
		"\u09a5\u09a4\u0001\u0000\u0000\u0000\u09a5\u09a6\u0001\u0000\u0000\u0000"+
		"\u09a6\u09a7\u0001\u0000\u0000\u0000\u09a7\u09a8\u0005\u0086\u0000\u0000"+
		"\u09a8\u0189\u0001\u0000\u0000\u0000\u09a9\u09ab\u0005;\u0000\u0000\u09aa"+
		"\u09ac\u0003\u010e\u0087\u0000\u09ab\u09aa\u0001\u0000\u0000\u0000\u09ab"+
		"\u09ac\u0001\u0000\u0000\u0000\u09ac\u09ad\u0001\u0000\u0000\u0000\u09ad"+
		"\u09ae\u0005\u0086\u0000\u0000\u09ae\u018b\u0001\u0000\u0000\u0000\u09af"+
		"\u09b0\u0005?\u0000\u0000\u09b0\u09b1\u0003\u012c\u0096\u0000\u09b1\u09b2"+
		"\u0005\u0086\u0000\u0000\u09b2\u018d\u0001\u0000\u0000\u0000\u09b3\u09b4"+
		"\u0005E\u0000\u0000\u09b4\u09b5\u0005\u0080\u0000\u0000\u09b5\u09b6\u0003"+
		"\u012c\u0096\u0000\u09b6\u09b7\u0005\u0081\u0000\u0000\u09b7\u09b8\u0003"+
		"\u0158\u00ac\u0000\u09b8\u018f\u0001\u0000\u0000\u0000\u09b9\u09ba\u0005"+
		"<\u0000\u0000\u09ba\u09bc\u0003\u0158\u00ac\u0000\u09bb\u09bd\u0003\u0192"+
		"\u00c9\u0000\u09bc\u09bb\u0001\u0000\u0000\u0000\u09bd\u09be\u0001\u0000"+
		"\u0000\u0000\u09be\u09bc\u0001\u0000\u0000\u0000\u09be\u09bf\u0001\u0000"+
		"\u0000\u0000\u09bf\u09e3\u0001\u0000\u0000\u0000\u09c0\u09c1\u0005<\u0000"+
		"\u0000\u09c1\u09c5\u0003\u0158\u00ac\u0000\u09c2\u09c4\u0003\u0192\u00c9"+
		"\u0000\u09c3\u09c2\u0001\u0000\u0000\u0000\u09c4\u09c7\u0001\u0000\u0000"+
		"\u0000\u09c5\u09c3\u0001\u0000\u0000\u0000\u09c5\u09c6\u0001\u0000\u0000"+
		"\u0000\u09c6\u09c8\u0001\u0000\u0000\u0000\u09c7\u09c5\u0001\u0000\u0000"+
		"\u0000\u09c8\u09c9\u0003\u0194\u00ca\u0000\u09c9\u09e3\u0001\u0000\u0000"+
		"\u0000\u09ca\u09cb\u0005<\u0000\u0000\u09cb\u09cc\u0005\u0080\u0000\u0000"+
		"\u09cc\u09d1\u0003\u0196\u00cb\u0000\u09cd\u09ce\u0005\u0086\u0000\u0000"+
		"\u09ce\u09d0\u0003\u0196\u00cb\u0000\u09cf\u09cd\u0001\u0000\u0000\u0000"+
		"\u09d0\u09d3\u0001\u0000\u0000\u0000\u09d1\u09cf\u0001\u0000\u0000\u0000"+
		"\u09d1\u09d2\u0001\u0000\u0000\u0000\u09d2\u09d5\u0001\u0000\u0000\u0000"+
		"\u09d3\u09d1\u0001\u0000\u0000\u0000\u09d4\u09d6\u0005\u0086\u0000\u0000"+
		"\u09d5\u09d4\u0001\u0000\u0000\u0000\u09d5\u09d6\u0001\u0000\u0000\u0000"+
		"\u09d6\u09d7\u0001\u0000\u0000\u0000\u09d7\u09d8\u0005\u0081\u0000\u0000"+
		"\u09d8\u09dc\u0003\u0158\u00ac\u0000\u09d9\u09db\u0003\u0192\u00c9\u0000"+
		"\u09da\u09d9\u0001\u0000\u0000\u0000\u09db\u09de\u0001\u0000\u0000\u0000"+
		"\u09dc\u09da\u0001\u0000\u0000\u0000\u09dc\u09dd\u0001\u0000\u0000\u0000"+
		"\u09dd\u09e0\u0001\u0000\u0000\u0000\u09de\u09dc\u0001\u0000\u0000\u0000"+
		"\u09df\u09e1\u0003\u0194\u00ca\u0000\u09e0\u09df\u0001\u0000\u0000\u0000"+
		"\u09e0\u09e1\u0001\u0000\u0000\u0000\u09e1\u09e3\u0001\u0000\u0000\u0000"+
		"\u09e2\u09b9\u0001\u0000\u0000\u0000\u09e2\u09c0\u0001\u0000\u0000\u0000"+
		"\u09e2\u09ca\u0001\u0000\u0000\u0000\u09e3\u0191\u0001\u0000\u0000\u0000"+
		"\u09e4\u09e5\u0005=\u0000\u0000\u09e5\u09e9\u0005\u0080\u0000\u0000\u09e6"+
		"\u09e8\u0003f3\u0000\u09e7\u09e6\u0001\u0000\u0000\u0000\u09e8\u09eb\u0001"+
		"\u0000\u0000\u0000\u09e9\u09e7\u0001\u0000\u0000\u0000\u09e9\u09ea\u0001"+
		"\u0000\u0000\u0000\u09ea\u09ec\u0001\u0000\u0000\u0000\u09eb\u09e9\u0001"+
		"\u0000\u0000\u0000\u09ec\u09ed\u0003\u00ecv\u0000\u09ed\u09ee\u0005\u0081"+
		"\u0000\u0000\u09ee\u09ef\u0003\u0158\u00ac\u0000\u09ef\u0193\u0001\u0000"+
		"\u0000\u0000\u09f0\u09f1\u0005>\u0000\u0000\u09f1\u09f2\u0003\u0158\u00ac"+
		"\u0000\u09f2\u0195\u0001\u0000\u0000\u0000\u09f3\u09f5\u0003f3\u0000\u09f4"+
		"\u09f3\u0001\u0000\u0000\u0000\u09f5\u09f8\u0001\u0000\u0000\u0000\u09f6"+
		"\u09f4\u0001\u0000\u0000\u0000\u09f6\u09f7\u0001\u0000\u0000\u0000\u09f7"+
		"\u09f9\u0001\u0000\u0000\u0000\u09f8\u09f6\u0001\u0000\u0000\u0000\u09f9"+
		"\u09fa\u0003\u00c8d\u0000\u09fa\u09fb\u0003\u00e4r\u0000\u09fb\u09fc\u0005"+
		"\u008d\u0000\u0000\u09fc\u09fd\u0003\u012c\u0096\u0000\u09fd\u0a14\u0001"+
		"\u0000\u0000\u0000\u09fe\u0a00\u0003f3\u0000\u09ff\u09fe\u0001\u0000\u0000"+
		"\u0000\u0a00\u0a03\u0001\u0000\u0000\u0000\u0a01\u09ff\u0001\u0000\u0000"+
		"\u0000\u0a01\u0a02\u0001\u0000\u0000\u0000\u0a02\u0a04\u0001\u0000\u0000"+
		"\u0000\u0a03\u0a01\u0001\u0000\u0000\u0000\u0a04\u0a05\u0003\u00eau\u0000"+
		"\u0a05\u0a06\u0005\u008d\u0000\u0000\u0a06\u0a07\u0003\u012c\u0096\u0000"+
		"\u0a07\u0a14\u0001\u0000\u0000\u0000\u0a08\u0a0a\u0003f3\u0000\u0a09\u0a08"+
		"\u0001\u0000\u0000\u0000\u0a0a\u0a0d\u0001\u0000\u0000\u0000\u0a0b\u0a09"+
		"\u0001\u0000\u0000\u0000\u0a0b\u0a0c\u0001\u0000\u0000\u0000\u0a0c\u0a0e"+
		"\u0001\u0000\u0000\u0000\u0a0d\u0a0b\u0001\u0000\u0000\u0000\u0a0e\u0a0f"+
		"\u0007\u0000\u0000\u0000\u0a0f\u0a10\u0003\u00e8t\u0000\u0a10\u0a11\u0005"+
		"\u008d\u0000\u0000\u0a11\u0a12\u0003\u012c\u0096\u0000\u0a12\u0a14\u0001"+
		"\u0000\u0000\u0000\u0a13\u09f6\u0001\u0000\u0000\u0000\u0a13\u0a01\u0001"+
		"\u0000\u0000\u0000\u0a13\u0a0b\u0001\u0000\u0000\u0000\u0a14\u0197\u0001"+
		"\u0000\u0000\u0000\u0a15\u0a1d\u0003\u0112\u0089\u0000\u0a16\u0a1d\u0003"+
		"\u012e\u0097\u0000\u0a17\u0a1d\u0003\u0158\u00ac\u0000\u0a18\u0a19\u0005"+
		"\u0080\u0000\u0000\u0a19\u0a1a\u0003\u012c\u0096\u0000\u0a1a\u0a1b\u0005"+
		"\u0081\u0000\u0000\u0a1b\u0a1d\u0001\u0000\u0000\u0000\u0a1c\u0a15\u0001"+
		"\u0000\u0000\u0000\u0a1c\u0a16\u0001\u0000\u0000\u0000\u0a1c\u0a17\u0001"+
		"\u0000\u0000\u0000\u0a1c\u0a18\u0001\u0000\u0000\u0000\u0a1d\u0199\u0001"+
		"\u0000\u0000\u0000\u0a1e\u0a21\u0003\u019c\u00ce\u0000\u0a1f\u0a21\u0003"+
		"\u0184\u00c2\u0000\u0a20\u0a1e\u0001\u0000\u0000\u0000\u0a20\u0a1f\u0001"+
		"\u0000\u0000\u0000\u0a21\u019b\u0001\u0000\u0000\u0000\u0a22\u0a23\u0003"+
		"\u019e\u00cf\u0000\u0a23\u0a24\u00056\u0000\u0000\u0a24\u0a25\u0003\u012c"+
		"\u0096\u0000\u0a25\u019d\u0001\u0000\u0000\u0000\u0a26\u0a33\u0003\u01a0"+
		"\u00d0\u0000\u0a27\u0a2c\u0003\u00fe\u007f\u0000\u0a28\u0a29\u0005\u0087"+
		"\u0000\u0000\u0a29\u0a2b\u0003\u00fe\u007f\u0000\u0a2a\u0a28\u0001\u0000"+
		"\u0000\u0000\u0a2b\u0a2e\u0001\u0000\u0000\u0000\u0a2c\u0a2a\u0001\u0000"+
		"\u0000\u0000\u0a2c\u0a2d\u0001\u0000\u0000\u0000\u0a2d\u0a30\u0001\u0000"+
		"\u0000\u0000\u0a2e\u0a2c\u0001\u0000\u0000\u0000\u0a2f\u0a31\u0005\u0087"+
		"\u0000\u0000\u0a30\u0a2f\u0001\u0000\u0000\u0000\u0a30\u0a31\u0001\u0000"+
		"\u0000\u0000\u0a31\u0a33\u0001\u0000\u0000\u0000\u0a32\u0a26\u0001\u0000"+
		"\u0000\u0000\u0a32\u0a27\u0001\u0000\u0000\u0000\u0a33\u019f\u0001\u0000"+
		"\u0000\u0000\u0a34\u0a36\u0003f3\u0000\u0a35\u0a34\u0001\u0000\u0000\u0000"+
		"\u0a36\u0a39\u0001\u0000\u0000\u0000\u0a37\u0a35\u0001\u0000\u0000\u0000"+
		"\u0a37\u0a38\u0001\u0000\u0000\u0000\u0a38\u0a3a\u0001\u0000\u0000\u0000"+
		"\u0a39\u0a37\u0001\u0000\u0000\u0000\u0a3a\u0a3b\u0007\u0000\u0000\u0000"+
		"\u0a3b\u0a40\u0003\u00fc~\u0000\u0a3c\u0a3d\u0005\u0087\u0000\u0000\u0a3d"+
		"\u0a3f\u0003\u00fc~\u0000\u0a3e\u0a3c\u0001\u0000\u0000\u0000\u0a3f\u0a42"+
		"\u0001\u0000\u0000\u0000\u0a40\u0a3e\u0001\u0000\u0000\u0000\u0a40\u0a41"+
		"\u0001\u0000\u0000\u0000\u0a41\u0a44\u0001\u0000\u0000\u0000\u0a42\u0a40"+
		"\u0001\u0000\u0000\u0000\u0a43\u0a45\u0005\u0087\u0000\u0000\u0a44\u0a43"+
		"\u0001\u0000\u0000\u0000\u0a44\u0a45\u0001\u0000\u0000\u0000\u0a45\u01a1"+
		"\u0001\u0000\u0000\u0000\u0a46\u0a4b\u0003T*\u0000\u0a47\u0a48\u0005\u0098"+
		"\u0000\u0000\u0a48\u0a4a\u0003T*\u0000\u0a49\u0a47\u0001\u0000\u0000\u0000"+
		"\u0a4a\u0a4d\u0001\u0000\u0000\u0000\u0a4b\u0a49\u0001\u0000\u0000\u0000"+
		"\u0a4b\u0a4c\u0001\u0000\u0000\u0000\u0a4c\u01a3\u0001\u0000\u0000\u0000"+
		"\u0a4d\u0a4b\u0001\u0000\u0000\u0000\u0143\u01a5\u01aa\u01b0\u01b8\u01d8"+
		"\u01f8\u0200\u0204\u0206\u020c\u0210\u0214\u0218\u021d\u0228\u022c\u022e"+
		"\u0232\u0235\u023a\u023f\u0248\u024c\u0272\u0287\u0290\u0294\u0296\u02a5"+
		"\u02a9\u02ab\u02bf\u02c3\u02c5\u02c8\u02d0\u02d4\u02d6\u02d9\u02e0\u02ea"+
		"\u02f1\u02f6\u02fb\u0301\u0306\u0317\u031a\u0325\u032a\u032c\u0333\u0339"+
		"\u033e\u0343\u0348\u034e\u0354\u035d\u0361\u0368\u036c\u0374\u0378\u037f"+
		"\u0384\u038c\u0392\u0398\u03a6\u03ab\u03af\u03b8\u03c1\u03c4\u03c7\u03ce"+
		"\u03d2\u03d4\u03d8\u03e3\u03ed\u03f1\u03f3\u03f6\u03f9\u0401\u0407\u040a"+
		"\u040d\u041a\u041e\u0424\u0433\u0438\u0441\u0445\u044c\u0456\u045d\u0467"+
		"\u046a\u046f\u0474\u0477\u047f\u0485\u0489\u048b\u0490\u0497\u04a0\u04ab"+
		"\u04af\u04b1\u04b5\u04b8\u04bb\u04c0\u04c6\u04cc\u04ce\u04d8\u04df\u04e4"+
		"\u04e9\u04f6\u04fa\u04fc\u0500\u0503\u050d\u0513\u0518\u051e\u0525\u052e"+
		"\u0537\u053d\u0542\u054d\u0553\u055d\u0561\u0563\u0566\u0569\u0570\u0575"+
		"\u0578\u057e\u0584\u058a\u058d\u0597\u059b\u05a1\u05af\u05bb\u05c4\u05c8"+
		"\u05cf\u05d8\u05e4\u05ed\u05f1\u05f4\u05f8\u05fd\u0608\u060c\u0615\u0618"+
		"\u061f\u0623\u062a\u062e\u0630\u0635\u063d\u0644\u064b\u0650\u0656\u0660"+
		"\u0664\u0668\u0670\u0679\u067d\u0682\u0687\u068e\u0693\u0698\u06a1\u06ab"+
		"\u06b4\u06bb\u06c2\u06c7\u06cd\u06d1\u06d5\u06dd\u06e0\u06ec\u06ef\u06fe"+
		"\u0702\u0706\u070f\u0712\u0717\u071b\u0722\u072a\u0735\u074f\u075a\u075f"+
		"\u0766\u076e\u0772\u0779\u077b\u0780\u0787\u078f\u0796\u079e\u07a2\u07a7"+
		"\u07af\u07b5\u07b9\u07bd\u07c2\u07c7\u07cf\u07d5\u07d9\u07dd\u07e3\u07e9"+
		"\u07f5\u07fb\u0802\u0807\u0810\u081d\u0821\u0823\u082d\u0830\u0834\u0838"+
		"\u0841\u0864\u0866\u086e\u0879\u088c\u0892\u0894\u08a2\u08aa\u08b2\u08ba"+
		"\u08c0\u08c8\u08d0\u08d8\u08db\u08f0\u08f9\u08fe\u090d\u0918\u091d\u0929"+
		"\u0935\u0940\u0944\u0947\u094f\u095a\u0964\u096c\u0974\u0978\u097f\u0983"+
		"\u0985\u098c\u0990\u0993\u0997\u099b\u099f\u09a5\u09ab\u09be\u09c5\u09d1"+
		"\u09d5\u09dc\u09e0\u09e2\u09e9\u09f6\u0a01\u0a0b\u0a13\u0a1c\u0a20\u0a2c"+
		"\u0a30\u0a32\u0a37\u0a40\u0a44\u0a4b";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}