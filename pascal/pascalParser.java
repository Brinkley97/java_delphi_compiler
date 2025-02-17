// Generated from pascal.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class pascalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, ARRAY=2, BEGIN=3, BOOLEAN=4, CASE=5, CHAR=6, CHR=7, CONST=8, DIV=9, 
		DO=10, DOWNTO=11, ELSE=12, END=13, FILE=14, FOR=15, FUNCTION=16, GOTO=17, 
		IF=18, IN=19, INTEGER=20, LABEL=21, MOD=22, NIL=23, NOT=24, OF=25, OR=26, 
		PACKED=27, PROCEDURE=28, PROGRAM=29, REAL=30, RECORD=31, REPEAT=32, SET=33, 
		THEN=34, TO=35, TYPE=36, UNTIL=37, VAR=38, WHILE=39, WITH=40, PLUS=41, 
		MINUS=42, STAR=43, SLASH=44, ASSIGN=45, COMMA=46, SEMI=47, COLON=48, EQUAL=49, 
		NOT_EQUAL=50, LT=51, LE=52, GE=53, GT=54, LPAREN=55, RPAREN=56, LBRACK=57, 
		LBRACK2=58, RBRACK=59, RBRACK2=60, POINTER=61, AT=62, DOT=63, DOTDOT=64, 
		LCURLY=65, RCURLY=66, UNIT=67, INTERFACE=68, USES=69, STRING=70, IMPLEMENTATION=71, 
		TRUE=72, FALSE=73, WS=74, COMMENT_1=75, COMMENT_2=76, IDENT=77, STRING_LITERAL=78, 
		NUM_INT=79, NUM_REAL=80, CLASS=81;
	public static final int
		RULE_program = 0, RULE_programHeading = 1, RULE_identifier = 2, RULE_block = 3, 
		RULE_classDefinition = 4, RULE_stat = 5, RULE_expr = 6, RULE_func = 7, 
		RULE_classInstantiation = 8, RULE_usesUnitsPart = 9, RULE_labelDeclarationPart = 10, 
		RULE_label = 11, RULE_constantDefinitionPart = 12, RULE_constantDefinition = 13, 
		RULE_constantChr = 14, RULE_constant = 15, RULE_unsignedNumber = 16, RULE_unsignedInteger = 17, 
		RULE_unsignedReal = 18, RULE_sign = 19, RULE_bool_ = 20, RULE_string = 21, 
		RULE_typeDefinitionPart = 22, RULE_typeDefinition = 23, RULE_functionType = 24, 
		RULE_procedureType = 25, RULE_type_ = 26, RULE_simpleType = 27, RULE_scalarType = 28, 
		RULE_subrangeType = 29, RULE_typeIdentifier = 30, RULE_structuredType = 31, 
		RULE_unpackedStructuredType = 32, RULE_stringtype = 33, RULE_arrayType = 34, 
		RULE_typeList = 35, RULE_indexType = 36, RULE_componentType = 37, RULE_recordType = 38, 
		RULE_fieldList = 39, RULE_fixedPart = 40, RULE_recordSection = 41, RULE_variantPart = 42, 
		RULE_tag = 43, RULE_variant = 44, RULE_setType = 45, RULE_baseType = 46, 
		RULE_fileType = 47, RULE_pointerType = 48, RULE_variableDeclarationPart = 49, 
		RULE_variableDeclaration = 50, RULE_procedureAndFunctionDeclarationPart = 51, 
		RULE_procedureOrFunctionDeclaration = 52, RULE_procedureDeclaration = 53, 
		RULE_formalParameterList = 54, RULE_formalParameterSection = 55, RULE_parameterGroup = 56, 
		RULE_identifierList = 57, RULE_constList = 58, RULE_functionDeclaration = 59, 
		RULE_resultType = 60, RULE_statement = 61, RULE_unlabelledStatement = 62, 
		RULE_simpleStatement = 63, RULE_assignmentStatement = 64, RULE_variable = 65, 
		RULE_expression = 66, RULE_relationaloperator = 67, RULE_simpleExpression = 68, 
		RULE_additiveoperator = 69, RULE_term = 70, RULE_multiplicativeoperator = 71, 
		RULE_signedFactor = 72, RULE_factor = 73, RULE_unsignedConstant = 74, 
		RULE_functionDesignator = 75, RULE_parameterList = 76, RULE_set_ = 77, 
		RULE_elementList = 78, RULE_element = 79, RULE_procedureStatement = 80, 
		RULE_actualParameter = 81, RULE_parameterwidth = 82, RULE_gotoStatement = 83, 
		RULE_emptyStatement_ = 84, RULE_empty_ = 85, RULE_structuredStatement = 86, 
		RULE_compoundStatement = 87, RULE_statements = 88, RULE_conditionalStatement = 89, 
		RULE_ifStatement = 90, RULE_caseStatement = 91, RULE_caseListElement = 92, 
		RULE_repetetiveStatement = 93, RULE_whileStatement = 94, RULE_repeatStatement = 95, 
		RULE_forStatement = 96, RULE_forList = 97, RULE_initialValue = 98, RULE_finalValue = 99, 
		RULE_withStatement = 100, RULE_recordVariableList = 101;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "programHeading", "identifier", "block", "classDefinition", 
			"stat", "expr", "func", "classInstantiation", "usesUnitsPart", "labelDeclarationPart", 
			"label", "constantDefinitionPart", "constantDefinition", "constantChr", 
			"constant", "unsignedNumber", "unsignedInteger", "unsignedReal", "sign", 
			"bool_", "string", "typeDefinitionPart", "typeDefinition", "functionType", 
			"procedureType", "type_", "simpleType", "scalarType", "subrangeType", 
			"typeIdentifier", "structuredType", "unpackedStructuredType", "stringtype", 
			"arrayType", "typeList", "indexType", "componentType", "recordType", 
			"fieldList", "fixedPart", "recordSection", "variantPart", "tag", "variant", 
			"setType", "baseType", "fileType", "pointerType", "variableDeclarationPart", 
			"variableDeclaration", "procedureAndFunctionDeclarationPart", "procedureOrFunctionDeclaration", 
			"procedureDeclaration", "formalParameterList", "formalParameterSection", 
			"parameterGroup", "identifierList", "constList", "functionDeclaration", 
			"resultType", "statement", "unlabelledStatement", "simpleStatement", 
			"assignmentStatement", "variable", "expression", "relationaloperator", 
			"simpleExpression", "additiveoperator", "term", "multiplicativeoperator", 
			"signedFactor", "factor", "unsignedConstant", "functionDesignator", "parameterList", 
			"set_", "elementList", "element", "procedureStatement", "actualParameter", 
			"parameterwidth", "gotoStatement", "emptyStatement_", "empty_", "structuredStatement", 
			"compoundStatement", "statements", "conditionalStatement", "ifStatement", 
			"caseStatement", "caseListElement", "repetetiveStatement", "whileStatement", 
			"repeatStatement", "forStatement", "forList", "initialValue", "finalValue", 
			"withStatement", "recordVariableList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'AND'", "'ARRAY'", "'BEGIN'", "'BOOLEAN'", "'CASE'", "'CHAR'", 
			"'CHR'", "'CONST'", "'DIV'", "'DO'", "'DOWNTO'", "'ELSE'", "'END'", "'FILE'", 
			"'FOR'", "'FUNCTION'", "'GOTO'", "'IF'", "'IN'", "'INTEGER'", "'LABEL'", 
			"'MOD'", "'NIL'", "'NOT'", "'OF'", "'OR'", "'PACKED'", "'PROCEDURE'", 
			"'PROGRAM'", "'REAL'", "'RECORD'", "'REPEAT'", "'SET'", "'THEN'", "'TO'", 
			"'TYPE'", "'UNTIL'", "'VAR'", "'WHILE'", "'WITH'", "'+'", "'-'", "'*'", 
			"'/'", "':='", "','", "';'", "':'", "'='", "'<>'", "'<'", "'<='", "'>='", 
			"'>'", "'('", "')'", "'['", "'(.'", "']'", "'.)'", "'^'", "'@'", "'.'", 
			"'..'", "'{'", "'}'", "'UNIT'", "'INTERFACE'", "'USES'", "'STRING'", 
			"'IMPLEMENTATION'", "'TRUE'", "'FALSE'", null, null, null, null, null, 
			null, null, "'CLASS'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "ARRAY", "BEGIN", "BOOLEAN", "CASE", "CHAR", "CHR", "CONST", 
			"DIV", "DO", "DOWNTO", "ELSE", "END", "FILE", "FOR", "FUNCTION", "GOTO", 
			"IF", "IN", "INTEGER", "LABEL", "MOD", "NIL", "NOT", "OF", "OR", "PACKED", 
			"PROCEDURE", "PROGRAM", "REAL", "RECORD", "REPEAT", "SET", "THEN", "TO", 
			"TYPE", "UNTIL", "VAR", "WHILE", "WITH", "PLUS", "MINUS", "STAR", "SLASH", 
			"ASSIGN", "COMMA", "SEMI", "COLON", "EQUAL", "NOT_EQUAL", "LT", "LE", 
			"GE", "GT", "LPAREN", "RPAREN", "LBRACK", "LBRACK2", "RBRACK", "RBRACK2", 
			"POINTER", "AT", "DOT", "DOTDOT", "LCURLY", "RCURLY", "UNIT", "INTERFACE", 
			"USES", "STRING", "IMPLEMENTATION", "TRUE", "FALSE", "WS", "COMMENT_1", 
			"COMMENT_2", "IDENT", "STRING_LITERAL", "NUM_INT", "NUM_REAL", "CLASS"
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
	public String getGrammarFileName() { return "pascal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public pascalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ProgramHeadingContext programHeading() {
			return getRuleContext(ProgramHeadingContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode DOT() { return getToken(pascalParser.DOT, 0); }
		public TerminalNode EOF() { return getToken(pascalParser.EOF, 0); }
		public TerminalNode INTERFACE() { return getToken(pascalParser.INTERFACE, 0); }
		public List<ClassDefinitionContext> classDefinition() {
			return getRuleContexts(ClassDefinitionContext.class);
		}
		public ClassDefinitionContext classDefinition(int i) {
			return getRuleContext(ClassDefinitionContext.class,i);
		}
		public List<ClassInstantiationContext> classInstantiation() {
			return getRuleContexts(ClassInstantiationContext.class);
		}
		public ClassInstantiationContext classInstantiation(int i) {
			return getRuleContext(ClassInstantiationContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROGRAM:
			case UNIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				programHeading();
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTERFACE) {
					{
					setState(205);
					match(INTERFACE);
					}
				}

				setState(208);
				block();
				setState(209);
				match(DOT);
				setState(210);
				match(EOF);
				}
				break;
			case EOF:
			case PROCEDURE:
			case IDENT:
			case NUM_INT:
			case CLASS:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & 11821949021847553L) != 0)) {
					{
					setState(215);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(212);
						classDefinition();
						}
						break;
					case 2:
						{
						setState(213);
						classInstantiation();
						}
						break;
					case 3:
						{
						setState(214);
						stat();
						}
						break;
					}
					}
					setState(219);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(220);
				match(EOF);
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
	public static class ProgramHeadingContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(pascalParser.PROGRAM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(pascalParser.SEMI, 0); }
		public TerminalNode LPAREN() { return getToken(pascalParser.LPAREN, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(pascalParser.RPAREN, 0); }
		public TerminalNode UNIT() { return getToken(pascalParser.UNIT, 0); }
		public ProgramHeadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programHeading; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterProgramHeading(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitProgramHeading(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitProgramHeading(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramHeadingContext programHeading() throws RecognitionException {
		ProgramHeadingContext _localctx = new ProgramHeadingContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programHeading);
		int _la;
		try {
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROGRAM:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(PROGRAM);
				setState(224);
				identifier();
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(225);
					match(LPAREN);
					setState(226);
					identifierList();
					setState(227);
					match(RPAREN);
					}
				}

				setState(231);
				match(SEMI);
				}
				break;
			case UNIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				match(UNIT);
				setState(234);
				identifier();
				setState(235);
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
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(pascalParser.IDENT, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(IDENT);
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
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public List<LabelDeclarationPartContext> labelDeclarationPart() {
			return getRuleContexts(LabelDeclarationPartContext.class);
		}
		public LabelDeclarationPartContext labelDeclarationPart(int i) {
			return getRuleContext(LabelDeclarationPartContext.class,i);
		}
		public List<ConstantDefinitionPartContext> constantDefinitionPart() {
			return getRuleContexts(ConstantDefinitionPartContext.class);
		}
		public ConstantDefinitionPartContext constantDefinitionPart(int i) {
			return getRuleContext(ConstantDefinitionPartContext.class,i);
		}
		public List<TypeDefinitionPartContext> typeDefinitionPart() {
			return getRuleContexts(TypeDefinitionPartContext.class);
		}
		public TypeDefinitionPartContext typeDefinitionPart(int i) {
			return getRuleContext(TypeDefinitionPartContext.class,i);
		}
		public List<VariableDeclarationPartContext> variableDeclarationPart() {
			return getRuleContexts(VariableDeclarationPartContext.class);
		}
		public VariableDeclarationPartContext variableDeclarationPart(int i) {
			return getRuleContext(VariableDeclarationPartContext.class,i);
		}
		public List<ProcedureAndFunctionDeclarationPartContext> procedureAndFunctionDeclarationPart() {
			return getRuleContexts(ProcedureAndFunctionDeclarationPartContext.class);
		}
		public ProcedureAndFunctionDeclarationPartContext procedureAndFunctionDeclarationPart(int i) {
			return getRuleContext(ProcedureAndFunctionDeclarationPartContext.class,i);
		}
		public List<UsesUnitsPartContext> usesUnitsPart() {
			return getRuleContexts(UsesUnitsPartContext.class);
		}
		public UsesUnitsPartContext usesUnitsPart(int i) {
			return getRuleContext(UsesUnitsPartContext.class,i);
		}
		public List<TerminalNode> IMPLEMENTATION() { return getTokens(pascalParser.IMPLEMENTATION); }
		public TerminalNode IMPLEMENTATION(int i) {
			return getToken(pascalParser.IMPLEMENTATION, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & -6917529026297847551L) != 0)) {
				{
				setState(248);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LABEL:
					{
					setState(241);
					labelDeclarationPart();
					}
					break;
				case CONST:
					{
					setState(242);
					constantDefinitionPart();
					}
					break;
				case TYPE:
					{
					setState(243);
					typeDefinitionPart();
					}
					break;
				case VAR:
					{
					setState(244);
					variableDeclarationPart();
					}
					break;
				case FUNCTION:
				case PROCEDURE:
					{
					setState(245);
					procedureAndFunctionDeclarationPart();
					}
					break;
				case USES:
					{
					setState(246);
					usesUnitsPart();
					}
					break;
				case IMPLEMENTATION:
					{
					setState(247);
					match(IMPLEMENTATION);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(253);
			compoundStatement();
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
	public static class ClassDefinitionContext extends ParserRuleContext {
		public ProcedureTypeContext procedureType() {
			return getRuleContext(ProcedureTypeContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOT() { return getToken(pascalParser.DOT, 0); }
		public List<TerminalNode> SEMI() { return getTokens(pascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(pascalParser.SEMI, i);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ClassDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterClassDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitClassDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitClassDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefinitionContext classDefinition() throws RecognitionException {
		ClassDefinitionContext _localctx = new ClassDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			procedureType();
			setState(256);
			identifier();
			setState(257);
			match(DOT);
			setState(258);
			identifier();
			setState(259);
			match(SEMI);
			setState(260);
			compoundStatement();
			setState(261);
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
	public static class StatContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(pascalParser.IDENT, 0); }
		public TerminalNode EQUAL() { return getToken(pascalParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stat);
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				match(IDENT);
				setState(264);
				match(EQUAL);
				setState(265);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				expr();
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
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(pascalParser.IDENT, 0); }
		public TerminalNode NUM_INT() { return getToken(pascalParser.NUM_INT, 0); }
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public ClassInstantiationContext classInstantiation() {
			return getRuleContext(ClassInstantiationContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr);
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				match(IDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				match(NUM_INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				func();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(272);
				classInstantiation();
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
	public static class FuncContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(pascalParser.IDENT, 0); }
		public TerminalNode LPAREN() { return getToken(pascalParser.LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(pascalParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(pascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pascalParser.COMMA, i);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(IDENT);
			setState(276);
			match(LPAREN);
			setState(277);
			expr();
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(278);
				match(COMMA);
				setState(279);
				expr();
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(285);
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
	public static class ClassInstantiationContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(pascalParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(pascalParser.RPAREN, 0); }
		public TerminalNode CLASS() { return getToken(pascalParser.CLASS, 0); }
		public TerminalNode ASSIGN() { return getToken(pascalParser.ASSIGN, 0); }
		public TerminalNode DOT() { return getToken(pascalParser.DOT, 0); }
		public ClassInstantiationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstantiation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterClassInstantiation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitClassInstantiation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitClassInstantiation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassInstantiationContext classInstantiation() throws RecognitionException {
		ClassInstantiationContext _localctx = new ClassInstantiationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classInstantiation);
		try {
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				identifier();
				setState(288);
				match(LPAREN);
				setState(289);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(CLASS);
				setState(292);
				identifier();
				setState(293);
				match(LPAREN);
				setState(294);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				identifier();
				setState(297);
				match(ASSIGN);
				setState(298);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(300);
				identifier();
				setState(301);
				match(ASSIGN);
				setState(302);
				identifier();
				setState(303);
				match(DOT);
				setState(304);
				identifier();
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
	public static class UsesUnitsPartContext extends ParserRuleContext {
		public TerminalNode USES() { return getToken(pascalParser.USES, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(pascalParser.SEMI, 0); }
		public UsesUnitsPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usesUnitsPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterUsesUnitsPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitUsesUnitsPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitUsesUnitsPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsesUnitsPartContext usesUnitsPart() throws RecognitionException {
		UsesUnitsPartContext _localctx = new UsesUnitsPartContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_usesUnitsPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(USES);
			setState(309);
			identifierList();
			setState(310);
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
	public static class LabelDeclarationPartContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(pascalParser.LABEL, 0); }
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(pascalParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(pascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pascalParser.COMMA, i);
		}
		public LabelDeclarationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelDeclarationPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterLabelDeclarationPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitLabelDeclarationPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitLabelDeclarationPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelDeclarationPartContext labelDeclarationPart() throws RecognitionException {
		LabelDeclarationPartContext _localctx = new LabelDeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_labelDeclarationPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(LABEL);
			setState(313);
			label();
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(314);
				match(COMMA);
				setState(315);
				label();
				}
				}
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(321);
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
	public static class LabelContext extends ParserRuleContext {
		public UnsignedIntegerContext unsignedInteger() {
			return getRuleContext(UnsignedIntegerContext.class,0);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			unsignedInteger();
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
	public static class ConstantDefinitionPartContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(pascalParser.CONST, 0); }
		public List<ConstantDefinitionContext> constantDefinition() {
			return getRuleContexts(ConstantDefinitionContext.class);
		}
		public ConstantDefinitionContext constantDefinition(int i) {
			return getRuleContext(ConstantDefinitionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(pascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(pascalParser.SEMI, i);
		}
		public ConstantDefinitionPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDefinitionPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterConstantDefinitionPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitConstantDefinitionPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitConstantDefinitionPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDefinitionPartContext constantDefinitionPart() throws RecognitionException {
		ConstantDefinitionPartContext _localctx = new ConstantDefinitionPartContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_constantDefinitionPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(CONST);
			setState(329); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(326);
				constantDefinition();
				setState(327);
				match(SEMI);
				}
				}
				setState(331); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
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
	public static class ConstantDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(pascalParser.EQUAL, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterConstantDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitConstantDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitConstantDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDefinitionContext constantDefinition() throws RecognitionException {
		ConstantDefinitionContext _localctx = new ConstantDefinitionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_constantDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			identifier();
			setState(334);
			match(EQUAL);
			setState(335);
			constant();
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
	public static class ConstantChrContext extends ParserRuleContext {
		public TerminalNode CHR() { return getToken(pascalParser.CHR, 0); }
		public TerminalNode LPAREN() { return getToken(pascalParser.LPAREN, 0); }
		public UnsignedIntegerContext unsignedInteger() {
			return getRuleContext(UnsignedIntegerContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(pascalParser.RPAREN, 0); }
		public ConstantChrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantChr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterConstantChr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitConstantChr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitConstantChr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantChrContext constantChr() throws RecognitionException {
		ConstantChrContext _localctx = new ConstantChrContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_constantChr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(CHR);
			setState(338);
			match(LPAREN);
			setState(339);
			unsignedInteger();
			setState(340);
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
	public static class ConstantContext extends ParserRuleContext {
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ConstantChrContext constantChr() {
			return getRuleContext(ConstantChrContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_constant);
		try {
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				unsignedNumber();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				sign();
				setState(344);
				unsignedNumber();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(346);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(347);
				sign();
				setState(348);
				identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(350);
				string();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(351);
				constantChr();
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
	public static class UnsignedNumberContext extends ParserRuleContext {
		public UnsignedIntegerContext unsignedInteger() {
			return getRuleContext(UnsignedIntegerContext.class,0);
		}
		public UnsignedRealContext unsignedReal() {
			return getRuleContext(UnsignedRealContext.class,0);
		}
		public UnsignedNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterUnsignedNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitUnsignedNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitUnsignedNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedNumberContext unsignedNumber() throws RecognitionException {
		UnsignedNumberContext _localctx = new UnsignedNumberContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_unsignedNumber);
		try {
			setState(356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				unsignedInteger();
				}
				break;
			case NUM_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				unsignedReal();
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
	public static class UnsignedIntegerContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(pascalParser.NUM_INT, 0); }
		public UnsignedIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedInteger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterUnsignedInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitUnsignedInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitUnsignedInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedIntegerContext unsignedInteger() throws RecognitionException {
		UnsignedIntegerContext _localctx = new UnsignedIntegerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_unsignedInteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(NUM_INT);
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
	public static class UnsignedRealContext extends ParserRuleContext {
		public TerminalNode NUM_REAL() { return getToken(pascalParser.NUM_REAL, 0); }
		public UnsignedRealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedReal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterUnsignedReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitUnsignedReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitUnsignedReal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedRealContext unsignedReal() throws RecognitionException {
		UnsignedRealContext _localctx = new UnsignedRealContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_unsignedReal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(NUM_REAL);
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
	public static class SignContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(pascalParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(pascalParser.MINUS, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
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
	public static class Bool_Context extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(pascalParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(pascalParser.FALSE, 0); }
		public Bool_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterBool_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitBool_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitBool_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_Context bool_() throws RecognitionException {
		Bool_Context _localctx = new Bool_Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_bool_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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
	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(pascalParser.STRING_LITERAL, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(STRING_LITERAL);
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
	public static class TypeDefinitionPartContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(pascalParser.TYPE, 0); }
		public List<TypeDefinitionContext> typeDefinition() {
			return getRuleContexts(TypeDefinitionContext.class);
		}
		public TypeDefinitionContext typeDefinition(int i) {
			return getRuleContext(TypeDefinitionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(pascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(pascalParser.SEMI, i);
		}
		public TypeDefinitionPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinitionPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterTypeDefinitionPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitTypeDefinitionPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitTypeDefinitionPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDefinitionPartContext typeDefinitionPart() throws RecognitionException {
		TypeDefinitionPartContext _localctx = new TypeDefinitionPartContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeDefinitionPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(TYPE);
			setState(372); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(369);
				typeDefinition();
				setState(370);
				match(SEMI);
				}
				}
				setState(374); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
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
	public static class TypeDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(pascalParser.EQUAL, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public ProcedureTypeContext procedureType() {
			return getRuleContext(ProcedureTypeContext.class,0);
		}
		public TypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterTypeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitTypeDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitTypeDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDefinitionContext typeDefinition() throws RecognitionException {
		TypeDefinitionContext _localctx = new TypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typeDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			identifier();
			setState(377);
			match(EQUAL);
			setState(381);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
			case BOOLEAN:
			case CHAR:
			case CHR:
			case FILE:
			case INTEGER:
			case PACKED:
			case REAL:
			case RECORD:
			case SET:
			case PLUS:
			case MINUS:
			case LPAREN:
			case POINTER:
			case STRING:
			case IDENT:
			case STRING_LITERAL:
			case NUM_INT:
			case NUM_REAL:
				{
				setState(378);
				type_();
				}
				break;
			case FUNCTION:
				{
				setState(379);
				functionType();
				}
				break;
			case PROCEDURE:
				{
				setState(380);
				procedureType();
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
	public static class FunctionTypeContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(pascalParser.FUNCTION, 0); }
		public TerminalNode COLON() { return getToken(pascalParser.COLON, 0); }
		public ResultTypeContext resultType() {
			return getRuleContext(ResultTypeContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitFunctionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitFunctionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_functionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(FUNCTION);
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(384);
				formalParameterList();
				}
			}

			setState(387);
			match(COLON);
			setState(388);
			resultType();
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
	public static class ProcedureTypeContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(pascalParser.PROCEDURE, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ProcedureTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterProcedureType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitProcedureType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitProcedureType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureTypeContext procedureType() throws RecognitionException {
		ProcedureTypeContext _localctx = new ProcedureTypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_procedureType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(PROCEDURE);
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(391);
				formalParameterList();
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
	public static class Type_Context extends ParserRuleContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public StructuredTypeContext structuredType() {
			return getRuleContext(StructuredTypeContext.class,0);
		}
		public PointerTypeContext pointerType() {
			return getRuleContext(PointerTypeContext.class,0);
		}
		public Type_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterType_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitType_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitType_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_Context type_() throws RecognitionException {
		Type_Context _localctx = new Type_Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_type_);
		try {
			setState(397);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHAR:
			case CHR:
			case INTEGER:
			case REAL:
			case PLUS:
			case MINUS:
			case LPAREN:
			case STRING:
			case IDENT:
			case STRING_LITERAL:
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				simpleType();
				}
				break;
			case ARRAY:
			case FILE:
			case PACKED:
			case RECORD:
			case SET:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				structuredType();
				}
				break;
			case POINTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(396);
				pointerType();
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
	public static class SimpleTypeContext extends ParserRuleContext {
		public ScalarTypeContext scalarType() {
			return getRuleContext(ScalarTypeContext.class,0);
		}
		public SubrangeTypeContext subrangeType() {
			return getRuleContext(SubrangeTypeContext.class,0);
		}
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public StringtypeContext stringtype() {
			return getRuleContext(StringtypeContext.class,0);
		}
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterSimpleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitSimpleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitSimpleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_simpleType);
		try {
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				scalarType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				subrangeType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(401);
				typeIdentifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(402);
				stringtype();
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
	public static class ScalarTypeContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(pascalParser.LPAREN, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(pascalParser.RPAREN, 0); }
		public ScalarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalarType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterScalarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitScalarType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitScalarType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScalarTypeContext scalarType() throws RecognitionException {
		ScalarTypeContext _localctx = new ScalarTypeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_scalarType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(LPAREN);
			setState(406);
			identifierList();
			setState(407);
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
	public static class SubrangeTypeContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode DOTDOT() { return getToken(pascalParser.DOTDOT, 0); }
		public SubrangeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subrangeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterSubrangeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitSubrangeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitSubrangeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubrangeTypeContext subrangeType() throws RecognitionException {
		SubrangeTypeContext _localctx = new SubrangeTypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_subrangeType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			constant();
			setState(410);
			match(DOTDOT);
			setState(411);
			constant();
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
	public static class TypeIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CHAR() { return getToken(pascalParser.CHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(pascalParser.BOOLEAN, 0); }
		public TerminalNode INTEGER() { return getToken(pascalParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(pascalParser.REAL, 0); }
		public TerminalNode STRING() { return getToken(pascalParser.STRING, 0); }
		public TypeIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterTypeIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitTypeIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitTypeIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIdentifierContext typeIdentifier() throws RecognitionException {
		TypeIdentifierContext _localctx = new TypeIdentifierContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_typeIdentifier);
		int _la;
		try {
			setState(415);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				identifier();
				}
				break;
			case BOOLEAN:
			case CHAR:
			case INTEGER:
			case REAL:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1074790480L) != 0) || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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
	public static class StructuredTypeContext extends ParserRuleContext {
		public TerminalNode PACKED() { return getToken(pascalParser.PACKED, 0); }
		public UnpackedStructuredTypeContext unpackedStructuredType() {
			return getRuleContext(UnpackedStructuredTypeContext.class,0);
		}
		public StructuredTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structuredType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterStructuredType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitStructuredType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitStructuredType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructuredTypeContext structuredType() throws RecognitionException {
		StructuredTypeContext _localctx = new StructuredTypeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_structuredType);
		try {
			setState(420);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PACKED:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				match(PACKED);
				setState(418);
				unpackedStructuredType();
				}
				break;
			case ARRAY:
			case FILE:
			case RECORD:
			case SET:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				unpackedStructuredType();
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
	public static class UnpackedStructuredTypeContext extends ParserRuleContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public RecordTypeContext recordType() {
			return getRuleContext(RecordTypeContext.class,0);
		}
		public SetTypeContext setType() {
			return getRuleContext(SetTypeContext.class,0);
		}
		public FileTypeContext fileType() {
			return getRuleContext(FileTypeContext.class,0);
		}
		public UnpackedStructuredTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpackedStructuredType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterUnpackedStructuredType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitUnpackedStructuredType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitUnpackedStructuredType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnpackedStructuredTypeContext unpackedStructuredType() throws RecognitionException {
		UnpackedStructuredTypeContext _localctx = new UnpackedStructuredTypeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_unpackedStructuredType);
		try {
			setState(426);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				arrayType();
				}
				break;
			case RECORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				recordType();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 3);
				{
				setState(424);
				setType();
				}
				break;
			case FILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(425);
				fileType();
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
	public static class StringtypeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(pascalParser.STRING, 0); }
		public TerminalNode LBRACK() { return getToken(pascalParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(pascalParser.RBRACK, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public StringtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterStringtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitStringtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitStringtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringtypeContext stringtype() throws RecognitionException {
		StringtypeContext _localctx = new StringtypeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_stringtype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(STRING);
			setState(429);
			match(LBRACK);
			setState(432);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(430);
				identifier();
				}
				break;
			case NUM_INT:
			case NUM_REAL:
				{
				setState(431);
				unsignedNumber();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(434);
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
	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(pascalParser.ARRAY, 0); }
		public TerminalNode LBRACK() { return getToken(pascalParser.LBRACK, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(pascalParser.RBRACK, 0); }
		public TerminalNode OF() { return getToken(pascalParser.OF, 0); }
		public ComponentTypeContext componentType() {
			return getRuleContext(ComponentTypeContext.class,0);
		}
		public TerminalNode LBRACK2() { return getToken(pascalParser.LBRACK2, 0); }
		public TerminalNode RBRACK2() { return getToken(pascalParser.RBRACK2, 0); }
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_arrayType);
		try {
			setState(450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				match(ARRAY);
				setState(437);
				match(LBRACK);
				setState(438);
				typeList();
				setState(439);
				match(RBRACK);
				setState(440);
				match(OF);
				setState(441);
				componentType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(443);
				match(ARRAY);
				setState(444);
				match(LBRACK2);
				setState(445);
				typeList();
				setState(446);
				match(RBRACK2);
				setState(447);
				match(OF);
				setState(448);
				componentType();
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
	public static class TypeListContext extends ParserRuleContext {
		public List<IndexTypeContext> indexType() {
			return getRuleContexts(IndexTypeContext.class);
		}
		public IndexTypeContext indexType(int i) {
			return getRuleContext(IndexTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pascalParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			indexType();
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(453);
				match(COMMA);
				setState(454);
				indexType();
				}
				}
				setState(459);
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
	public static class IndexTypeContext extends ParserRuleContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public IndexTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterIndexType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitIndexType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitIndexType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexTypeContext indexType() throws RecognitionException {
		IndexTypeContext _localctx = new IndexTypeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_indexType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			simpleType();
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
	public static class ComponentTypeContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ComponentTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterComponentType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitComponentType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitComponentType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentTypeContext componentType() throws RecognitionException {
		ComponentTypeContext _localctx = new ComponentTypeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_componentType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462);
			type_();
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
	public static class RecordTypeContext extends ParserRuleContext {
		public TerminalNode RECORD() { return getToken(pascalParser.RECORD, 0); }
		public TerminalNode END() { return getToken(pascalParser.END, 0); }
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public RecordTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterRecordType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitRecordType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitRecordType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordTypeContext recordType() throws RecognitionException {
		RecordTypeContext _localctx = new RecordTypeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_recordType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(RECORD);
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASE || _la==IDENT) {
				{
				setState(465);
				fieldList();
				}
			}

			setState(468);
			match(END);
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
	public static class FieldListContext extends ParserRuleContext {
		public FixedPartContext fixedPart() {
			return getRuleContext(FixedPartContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(pascalParser.SEMI, 0); }
		public VariantPartContext variantPart() {
			return getRuleContext(VariantPartContext.class,0);
		}
		public FieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterFieldList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitFieldList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitFieldList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldListContext fieldList() throws RecognitionException {
		FieldListContext _localctx = new FieldListContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_fieldList);
		int _la;
		try {
			setState(476);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				fixedPart();
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(471);
					match(SEMI);
					setState(472);
					variantPart();
					}
				}

				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(475);
				variantPart();
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
	public static class FixedPartContext extends ParserRuleContext {
		public List<RecordSectionContext> recordSection() {
			return getRuleContexts(RecordSectionContext.class);
		}
		public RecordSectionContext recordSection(int i) {
			return getRuleContext(RecordSectionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(pascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(pascalParser.SEMI, i);
		}
		public FixedPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixedPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterFixedPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitFixedPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitFixedPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FixedPartContext fixedPart() throws RecognitionException {
		FixedPartContext _localctx = new FixedPartContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_fixedPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			recordSection();
			setState(483);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(479);
					match(SEMI);
					setState(480);
					recordSection();
					}
					} 
				}
				setState(485);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
	public static class RecordSectionContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pascalParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public RecordSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterRecordSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitRecordSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitRecordSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordSectionContext recordSection() throws RecognitionException {
		RecordSectionContext _localctx = new RecordSectionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_recordSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			identifierList();
			setState(487);
			match(COLON);
			setState(488);
			type_();
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
	public static class VariantPartContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(pascalParser.CASE, 0); }
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public TerminalNode OF() { return getToken(pascalParser.OF, 0); }
		public List<VariantContext> variant() {
			return getRuleContexts(VariantContext.class);
		}
		public VariantContext variant(int i) {
			return getRuleContext(VariantContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(pascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(pascalParser.SEMI, i);
		}
		public VariantPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variantPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterVariantPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitVariantPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitVariantPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariantPartContext variantPart() throws RecognitionException {
		VariantPartContext _localctx = new VariantPartContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_variantPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(CASE);
			setState(491);
			tag();
			setState(492);
			match(OF);
			setState(493);
			variant();
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(494);
				match(SEMI);
				setState(495);
				variant();
				}
				}
				setState(500);
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
	public static class TagContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pascalParser.COLON, 0); }
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_tag);
		try {
			setState(506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(501);
				identifier();
				setState(502);
				match(COLON);
				setState(503);
				typeIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
				typeIdentifier();
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
	public static class VariantContext extends ParserRuleContext {
		public ConstListContext constList() {
			return getRuleContext(ConstListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pascalParser.COLON, 0); }
		public TerminalNode LPAREN() { return getToken(pascalParser.LPAREN, 0); }
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(pascalParser.RPAREN, 0); }
		public VariantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterVariant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitVariant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitVariant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariantContext variant() throws RecognitionException {
		VariantContext _localctx = new VariantContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_variant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			constList();
			setState(509);
			match(COLON);
			setState(510);
			match(LPAREN);
			setState(511);
			fieldList();
			setState(512);
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
	public static class SetTypeContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(pascalParser.SET, 0); }
		public TerminalNode OF() { return getToken(pascalParser.OF, 0); }
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public SetTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterSetType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitSetType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitSetType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetTypeContext setType() throws RecognitionException {
		SetTypeContext _localctx = new SetTypeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_setType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(SET);
			setState(515);
			match(OF);
			setState(516);
			baseType();
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
	public static class BaseTypeContext extends ParserRuleContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public BaseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterBaseType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitBaseType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitBaseType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseTypeContext baseType() throws RecognitionException {
		BaseTypeContext _localctx = new BaseTypeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_baseType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			simpleType();
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
	public static class FileTypeContext extends ParserRuleContext {
		public TerminalNode FILE() { return getToken(pascalParser.FILE, 0); }
		public TerminalNode OF() { return getToken(pascalParser.OF, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public FileTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterFileType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitFileType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitFileType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileTypeContext fileType() throws RecognitionException {
		FileTypeContext _localctx = new FileTypeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_fileType);
		try {
			setState(524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(520);
				match(FILE);
				setState(521);
				match(OF);
				setState(522);
				type_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(523);
				match(FILE);
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
	public static class PointerTypeContext extends ParserRuleContext {
		public TerminalNode POINTER() { return getToken(pascalParser.POINTER, 0); }
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public PointerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterPointerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitPointerType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitPointerType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerTypeContext pointerType() throws RecognitionException {
		PointerTypeContext _localctx = new PointerTypeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_pointerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(POINTER);
			setState(527);
			typeIdentifier();
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
	public static class VariableDeclarationPartContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(pascalParser.VAR, 0); }
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(pascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(pascalParser.SEMI, i);
		}
		public VariableDeclarationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterVariableDeclarationPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitVariableDeclarationPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitVariableDeclarationPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationPartContext variableDeclarationPart() throws RecognitionException {
		VariableDeclarationPartContext _localctx = new VariableDeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_variableDeclarationPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(VAR);
			setState(530);
			variableDeclaration();
			setState(535);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(531);
					match(SEMI);
					setState(532);
					variableDeclaration();
					}
					} 
				}
				setState(537);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(538);
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
	public static class VariableDeclarationContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pascalParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			identifierList();
			setState(541);
			match(COLON);
			setState(542);
			type_();
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
	public static class ProcedureAndFunctionDeclarationPartContext extends ParserRuleContext {
		public ProcedureOrFunctionDeclarationContext procedureOrFunctionDeclaration() {
			return getRuleContext(ProcedureOrFunctionDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(pascalParser.SEMI, 0); }
		public ProcedureAndFunctionDeclarationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureAndFunctionDeclarationPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterProcedureAndFunctionDeclarationPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitProcedureAndFunctionDeclarationPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitProcedureAndFunctionDeclarationPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureAndFunctionDeclarationPartContext procedureAndFunctionDeclarationPart() throws RecognitionException {
		ProcedureAndFunctionDeclarationPartContext _localctx = new ProcedureAndFunctionDeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_procedureAndFunctionDeclarationPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			procedureOrFunctionDeclaration();
			setState(545);
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
	public static class ProcedureOrFunctionDeclarationContext extends ParserRuleContext {
		public ProcedureDeclarationContext procedureDeclaration() {
			return getRuleContext(ProcedureDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ProcedureOrFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureOrFunctionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterProcedureOrFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitProcedureOrFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitProcedureOrFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureOrFunctionDeclarationContext procedureOrFunctionDeclaration() throws RecognitionException {
		ProcedureOrFunctionDeclarationContext _localctx = new ProcedureOrFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_procedureOrFunctionDeclaration);
		try {
			setState(549);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(547);
				procedureDeclaration();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(548);
				functionDeclaration();
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
	public static class ProcedureDeclarationContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(pascalParser.PROCEDURE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(pascalParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ProcedureDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterProcedureDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitProcedureDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitProcedureDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureDeclarationContext procedureDeclaration() throws RecognitionException {
		ProcedureDeclarationContext _localctx = new ProcedureDeclarationContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_procedureDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(PROCEDURE);
			setState(552);
			identifier();
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(553);
				formalParameterList();
				}
			}

			setState(556);
			match(SEMI);
			setState(557);
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
	public static class FormalParameterListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(pascalParser.LPAREN, 0); }
		public List<FormalParameterSectionContext> formalParameterSection() {
			return getRuleContexts(FormalParameterSectionContext.class);
		}
		public FormalParameterSectionContext formalParameterSection(int i) {
			return getRuleContext(FormalParameterSectionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(pascalParser.RPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(pascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(pascalParser.SEMI, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitFormalParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			match(LPAREN);
			setState(560);
			formalParameterSection();
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(561);
				match(SEMI);
				setState(562);
				formalParameterSection();
				}
				}
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(568);
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
	public static class FormalParameterSectionContext extends ParserRuleContext {
		public ParameterGroupContext parameterGroup() {
			return getRuleContext(ParameterGroupContext.class,0);
		}
		public TerminalNode VAR() { return getToken(pascalParser.VAR, 0); }
		public TerminalNode FUNCTION() { return getToken(pascalParser.FUNCTION, 0); }
		public TerminalNode PROCEDURE() { return getToken(pascalParser.PROCEDURE, 0); }
		public FormalParameterSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterFormalParameterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitFormalParameterSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitFormalParameterSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterSectionContext formalParameterSection() throws RecognitionException {
		FormalParameterSectionContext _localctx = new FormalParameterSectionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_formalParameterSection);
		try {
			setState(577);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				parameterGroup();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(571);
				match(VAR);
				setState(572);
				parameterGroup();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(573);
				match(FUNCTION);
				setState(574);
				parameterGroup();
				}
				break;
			case PROCEDURE:
				enterOuterAlt(_localctx, 4);
				{
				setState(575);
				match(PROCEDURE);
				setState(576);
				parameterGroup();
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
	public static class ParameterGroupContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pascalParser.COLON, 0); }
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public ParameterGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterParameterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitParameterGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitParameterGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterGroupContext parameterGroup() throws RecognitionException {
		ParameterGroupContext _localctx = new ParameterGroupContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_parameterGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			identifierList();
			setState(580);
			match(COLON);
			setState(581);
			typeIdentifier();
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
	public static class IdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pascalParser.COMMA, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			identifier();
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(584);
				match(COMMA);
				setState(585);
				identifier();
				}
				}
				setState(590);
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
	public static class ConstListContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pascalParser.COMMA, i);
		}
		public ConstListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterConstList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitConstList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitConstList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstListContext constList() throws RecognitionException {
		ConstListContext _localctx = new ConstListContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_constList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			constant();
			setState(596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(592);
				match(COMMA);
				setState(593);
				constant();
				}
				}
				setState(598);
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
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(pascalParser.FUNCTION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pascalParser.COLON, 0); }
		public ResultTypeContext resultType() {
			return getRuleContext(ResultTypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(pascalParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			match(FUNCTION);
			setState(600);
			identifier();
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(601);
				formalParameterList();
				}
			}

			setState(604);
			match(COLON);
			setState(605);
			resultType();
			setState(606);
			match(SEMI);
			setState(607);
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
	public static class ResultTypeContext extends ParserRuleContext {
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public ResultTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resultType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterResultType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitResultType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitResultType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultTypeContext resultType() throws RecognitionException {
		ResultTypeContext _localctx = new ResultTypeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_resultType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			typeIdentifier();
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
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pascalParser.COLON, 0); }
		public UnlabelledStatementContext unlabelledStatement() {
			return getRuleContext(UnlabelledStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_statement);
		try {
			setState(616);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(611);
				label();
				setState(612);
				match(COLON);
				setState(613);
				unlabelledStatement();
				}
				break;
			case BEGIN:
			case CASE:
			case ELSE:
			case END:
			case FOR:
			case GOTO:
			case IF:
			case REPEAT:
			case UNTIL:
			case WHILE:
			case WITH:
			case SEMI:
			case AT:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(615);
				unlabelledStatement();
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
	public static class UnlabelledStatementContext extends ParserRuleContext {
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public StructuredStatementContext structuredStatement() {
			return getRuleContext(StructuredStatementContext.class,0);
		}
		public UnlabelledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unlabelledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterUnlabelledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitUnlabelledStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitUnlabelledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnlabelledStatementContext unlabelledStatement() throws RecognitionException {
		UnlabelledStatementContext _localctx = new UnlabelledStatementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_unlabelledStatement);
		try {
			setState(620);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
			case END:
			case GOTO:
			case UNTIL:
			case SEMI:
			case AT:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(618);
				simpleStatement();
				}
				break;
			case BEGIN:
			case CASE:
			case FOR:
			case IF:
			case REPEAT:
			case WHILE:
			case WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(619);
				structuredStatement();
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
	public static class SimpleStatementContext extends ParserRuleContext {
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public ProcedureStatementContext procedureStatement() {
			return getRuleContext(ProcedureStatementContext.class,0);
		}
		public GotoStatementContext gotoStatement() {
			return getRuleContext(GotoStatementContext.class,0);
		}
		public EmptyStatement_Context emptyStatement_() {
			return getRuleContext(EmptyStatement_Context.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterSimpleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitSimpleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitSimpleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_simpleStatement);
		try {
			setState(626);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(622);
				assignmentStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(623);
				procedureStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(624);
				gotoStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(625);
				emptyStatement_();
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
	public static class AssignmentStatementContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(pascalParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			variable();
			setState(629);
			match(ASSIGN);
			setState(630);
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
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(pascalParser.AT, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(pascalParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(pascalParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(pascalParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(pascalParser.RBRACK, i);
		}
		public List<TerminalNode> LBRACK2() { return getTokens(pascalParser.LBRACK2); }
		public TerminalNode LBRACK2(int i) {
			return getToken(pascalParser.LBRACK2, i);
		}
		public List<TerminalNode> RBRACK2() { return getTokens(pascalParser.RBRACK2); }
		public TerminalNode RBRACK2(int i) {
			return getToken(pascalParser.RBRACK2, i);
		}
		public List<TerminalNode> DOT() { return getTokens(pascalParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(pascalParser.DOT, i);
		}
		public List<TerminalNode> POINTER() { return getTokens(pascalParser.POINTER); }
		public TerminalNode POINTER(int i) {
			return getToken(pascalParser.POINTER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pascalParser.COMMA, i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				{
				setState(632);
				match(AT);
				setState(633);
				identifier();
				}
				break;
			case IDENT:
				{
				setState(634);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -6485183463413514240L) != 0)) {
				{
				setState(662);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(637);
					match(LBRACK);
					setState(638);
					expression();
					setState(643);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(639);
						match(COMMA);
						setState(640);
						expression();
						}
						}
						setState(645);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(646);
					match(RBRACK);
					}
					break;
				case LBRACK2:
					{
					setState(648);
					match(LBRACK2);
					setState(649);
					expression();
					setState(654);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(650);
						match(COMMA);
						setState(651);
						expression();
						}
						}
						setState(656);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(657);
					match(RBRACK2);
					}
					break;
				case DOT:
					{
					setState(659);
					match(DOT);
					setState(660);
					identifier();
					}
					break;
				case POINTER:
					{
					setState(661);
					match(POINTER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(666);
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
	public static class ExpressionContext extends ParserRuleContext {
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public RelationaloperatorContext relationaloperator() {
			return getRuleContext(RelationaloperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			simpleExpression();
			setState(671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35465847066066944L) != 0)) {
				{
				setState(668);
				relationaloperator();
				setState(669);
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
	public static class RelationaloperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(pascalParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(pascalParser.NOT_EQUAL, 0); }
		public TerminalNode LT() { return getToken(pascalParser.LT, 0); }
		public TerminalNode LE() { return getToken(pascalParser.LE, 0); }
		public TerminalNode GE() { return getToken(pascalParser.GE, 0); }
		public TerminalNode GT() { return getToken(pascalParser.GT, 0); }
		public TerminalNode IN() { return getToken(pascalParser.IN, 0); }
		public RelationaloperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationaloperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterRelationaloperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitRelationaloperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitRelationaloperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationaloperatorContext relationaloperator() throws RecognitionException {
		RelationaloperatorContext _localctx = new RelationaloperatorContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_relationaloperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 35465847066066944L) != 0)) ) {
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
	public static class SimpleExpressionContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public AdditiveoperatorContext additiveoperator() {
			return getRuleContext(AdditiveoperatorContext.class,0);
		}
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterSimpleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitSimpleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitSimpleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_simpleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			term();
			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6597136875520L) != 0)) {
				{
				setState(676);
				additiveoperator();
				setState(677);
				simpleExpression();
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
	public static class AdditiveoperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(pascalParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(pascalParser.MINUS, 0); }
		public TerminalNode OR() { return getToken(pascalParser.OR, 0); }
		public AdditiveoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterAdditiveoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitAdditiveoperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitAdditiveoperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveoperatorContext additiveoperator() throws RecognitionException {
		AdditiveoperatorContext _localctx = new AdditiveoperatorContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_additiveoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 6597136875520L) != 0)) ) {
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
	public static class TermContext extends ParserRuleContext {
		public SignedFactorContext signedFactor() {
			return getRuleContext(SignedFactorContext.class,0);
		}
		public MultiplicativeoperatorContext multiplicativeoperator() {
			return getRuleContext(MultiplicativeoperatorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			signedFactor();
			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 26388283261442L) != 0)) {
				{
				setState(684);
				multiplicativeoperator();
				setState(685);
				term();
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
	public static class MultiplicativeoperatorContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(pascalParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(pascalParser.SLASH, 0); }
		public TerminalNode DIV() { return getToken(pascalParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(pascalParser.MOD, 0); }
		public TerminalNode AND() { return getToken(pascalParser.AND, 0); }
		public MultiplicativeoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterMultiplicativeoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitMultiplicativeoperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitMultiplicativeoperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeoperatorContext multiplicativeoperator() throws RecognitionException {
		MultiplicativeoperatorContext _localctx = new MultiplicativeoperatorContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_multiplicativeoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 26388283261442L) != 0)) ) {
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
	public static class SignedFactorContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(pascalParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(pascalParser.MINUS, 0); }
		public SignedFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterSignedFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitSignedFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitSignedFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignedFactorContext signedFactor() throws RecognitionException {
		SignedFactorContext _localctx = new SignedFactorContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_signedFactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(691);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(694);
			factor();
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
	public static class FactorContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(pascalParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(pascalParser.RPAREN, 0); }
		public FunctionDesignatorContext functionDesignator() {
			return getRuleContext(FunctionDesignatorContext.class,0);
		}
		public UnsignedConstantContext unsignedConstant() {
			return getRuleContext(UnsignedConstantContext.class,0);
		}
		public Set_Context set_() {
			return getRuleContext(Set_Context.class,0);
		}
		public TerminalNode NOT() { return getToken(pascalParser.NOT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Bool_Context bool_() {
			return getRuleContext(Bool_Context.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_factor);
		try {
			setState(707);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(696);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(697);
				match(LPAREN);
				setState(698);
				expression();
				setState(699);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(701);
				functionDesignator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(702);
				unsignedConstant();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(703);
				set_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(704);
				match(NOT);
				setState(705);
				factor();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(706);
				bool_();
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
	public static class UnsignedConstantContext extends ParserRuleContext {
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public ConstantChrContext constantChr() {
			return getRuleContext(ConstantChrContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode NIL() { return getToken(pascalParser.NIL, 0); }
		public UnsignedConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterUnsignedConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitUnsignedConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitUnsignedConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsignedConstantContext unsignedConstant() throws RecognitionException {
		UnsignedConstantContext _localctx = new UnsignedConstantContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_unsignedConstant);
		try {
			setState(713);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(709);
				unsignedNumber();
				}
				break;
			case CHR:
				enterOuterAlt(_localctx, 2);
				{
				setState(710);
				constantChr();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(711);
				string();
				}
				break;
			case NIL:
				enterOuterAlt(_localctx, 4);
				{
				setState(712);
				match(NIL);
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
	public static class FunctionDesignatorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(pascalParser.LPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(pascalParser.RPAREN, 0); }
		public FunctionDesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDesignator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterFunctionDesignator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitFunctionDesignator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitFunctionDesignator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDesignatorContext functionDesignator() throws RecognitionException {
		FunctionDesignatorContext _localctx = new FunctionDesignatorContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_functionDesignator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			identifier();
			setState(716);
			match(LPAREN);
			setState(717);
			parameterList();
			setState(718);
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
	public static class ParameterListContext extends ParserRuleContext {
		public List<ActualParameterContext> actualParameter() {
			return getRuleContexts(ActualParameterContext.class);
		}
		public ActualParameterContext actualParameter(int i) {
			return getRuleContext(ActualParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pascalParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			actualParameter();
			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(721);
				match(COMMA);
				setState(722);
				actualParameter();
				}
				}
				setState(727);
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
	public static class Set_Context extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(pascalParser.LBRACK, 0); }
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(pascalParser.RBRACK, 0); }
		public TerminalNode LBRACK2() { return getToken(pascalParser.LBRACK2, 0); }
		public TerminalNode RBRACK2() { return getToken(pascalParser.RBRACK2, 0); }
		public Set_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterSet_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitSet_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitSet_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_Context set_() throws RecognitionException {
		Set_Context _localctx = new Set_Context(_ctx, getState());
		enterRule(_localctx, 154, RULE_set_);
		try {
			setState(736);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(728);
				match(LBRACK);
				setState(729);
				elementList();
				setState(730);
				match(RBRACK);
				}
				break;
			case LBRACK2:
				enterOuterAlt(_localctx, 2);
				{
				setState(732);
				match(LBRACK2);
				setState(733);
				elementList();
				setState(734);
				match(RBRACK2);
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
	public static class ElementListContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pascalParser.COMMA, i);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitElementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitElementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_elementList);
		int _la;
		try {
			setState(747);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHR:
			case NIL:
			case NOT:
			case PLUS:
			case MINUS:
			case LPAREN:
			case LBRACK:
			case LBRACK2:
			case AT:
			case TRUE:
			case FALSE:
			case IDENT:
			case STRING_LITERAL:
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(738);
				element();
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(739);
					match(COMMA);
					setState(740);
					element();
					}
					}
					setState(745);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RBRACK:
			case RBRACK2:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class ElementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOTDOT() { return getToken(pascalParser.DOTDOT, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			expression();
			setState(752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOTDOT) {
				{
				setState(750);
				match(DOTDOT);
				setState(751);
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
	public static class ProcedureStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(pascalParser.LPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(pascalParser.RPAREN, 0); }
		public ProcedureStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterProcedureStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitProcedureStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitProcedureStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureStatementContext procedureStatement() throws RecognitionException {
		ProcedureStatementContext _localctx = new ProcedureStatementContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_procedureStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			identifier();
			setState(759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(755);
				match(LPAREN);
				setState(756);
				parameterList();
				setState(757);
				match(RPAREN);
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
	public static class ActualParameterContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ParameterwidthContext> parameterwidth() {
			return getRuleContexts(ParameterwidthContext.class);
		}
		public ParameterwidthContext parameterwidth(int i) {
			return getRuleContext(ParameterwidthContext.class,i);
		}
		public ActualParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterActualParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitActualParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitActualParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualParameterContext actualParameter() throws RecognitionException {
		ActualParameterContext _localctx = new ActualParameterContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_actualParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			expression();
			setState(765);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(762);
				parameterwidth();
				}
				}
				setState(767);
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
	public static class ParameterwidthContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(pascalParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParameterwidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterwidth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterParameterwidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitParameterwidth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitParameterwidth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterwidthContext parameterwidth() throws RecognitionException {
		ParameterwidthContext _localctx = new ParameterwidthContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_parameterwidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			match(COLON);
			setState(769);
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
	public static class GotoStatementContext extends ParserRuleContext {
		public TerminalNode GOTO() { return getToken(pascalParser.GOTO, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public GotoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterGotoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitGotoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitGotoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GotoStatementContext gotoStatement() throws RecognitionException {
		GotoStatementContext _localctx = new GotoStatementContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_gotoStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			match(GOTO);
			setState(772);
			label();
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
	public static class EmptyStatement_Context extends ParserRuleContext {
		public EmptyStatement_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterEmptyStatement_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitEmptyStatement_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitEmptyStatement_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatement_Context emptyStatement_() throws RecognitionException {
		EmptyStatement_Context _localctx = new EmptyStatement_Context(_ctx, getState());
		enterRule(_localctx, 168, RULE_emptyStatement_);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
	public static class Empty_Context extends ParserRuleContext {
		public Empty_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterEmpty_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitEmpty_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitEmpty_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Empty_Context empty_() throws RecognitionException {
		Empty_Context _localctx = new Empty_Context(_ctx, getState());
		enterRule(_localctx, 170, RULE_empty_);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
	public static class StructuredStatementContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ConditionalStatementContext conditionalStatement() {
			return getRuleContext(ConditionalStatementContext.class,0);
		}
		public RepetetiveStatementContext repetetiveStatement() {
			return getRuleContext(RepetetiveStatementContext.class,0);
		}
		public WithStatementContext withStatement() {
			return getRuleContext(WithStatementContext.class,0);
		}
		public StructuredStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structuredStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterStructuredStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitStructuredStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitStructuredStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructuredStatementContext structuredStatement() throws RecognitionException {
		StructuredStatementContext _localctx = new StructuredStatementContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_structuredStatement);
		try {
			setState(782);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(778);
				compoundStatement();
				}
				break;
			case CASE:
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(779);
				conditionalStatement();
				}
				break;
			case FOR:
			case REPEAT:
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(780);
				repetetiveStatement();
				}
				break;
			case WITH:
				enterOuterAlt(_localctx, 4);
				{
				setState(781);
				withStatement();
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
	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(pascalParser.BEGIN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(pascalParser.END, 0); }
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_compoundStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			match(BEGIN);
			setState(785);
			statements();
			setState(786);
			match(END);
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
	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(pascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(pascalParser.SEMI, i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(788);
			statement();
			setState(793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(789);
				match(SEMI);
				setState(790);
				statement();
				}
				}
				setState(795);
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
	public static class ConditionalStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public CaseStatementContext caseStatement() {
			return getRuleContext(CaseStatementContext.class,0);
		}
		public ConditionalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterConditionalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitConditionalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitConditionalStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalStatementContext conditionalStatement() throws RecognitionException {
		ConditionalStatementContext _localctx = new ConditionalStatementContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_conditionalStatement);
		try {
			setState(798);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(796);
				ifStatement();
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(797);
				caseStatement();
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
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(pascalParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(pascalParser.THEN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(pascalParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			match(IF);
			setState(801);
			expression();
			setState(802);
			match(THEN);
			setState(803);
			statement();
			setState(806);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(804);
				match(ELSE);
				setState(805);
				statement();
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
	public static class CaseStatementContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(pascalParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OF() { return getToken(pascalParser.OF, 0); }
		public List<CaseListElementContext> caseListElement() {
			return getRuleContexts(CaseListElementContext.class);
		}
		public CaseListElementContext caseListElement(int i) {
			return getRuleContext(CaseListElementContext.class,i);
		}
		public TerminalNode END() { return getToken(pascalParser.END, 0); }
		public List<TerminalNode> SEMI() { return getTokens(pascalParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(pascalParser.SEMI, i);
		}
		public TerminalNode ELSE() { return getToken(pascalParser.ELSE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public CaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterCaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitCaseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitCaseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseStatementContext caseStatement() throws RecognitionException {
		CaseStatementContext _localctx = new CaseStatementContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_caseStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			match(CASE);
			setState(809);
			expression();
			setState(810);
			match(OF);
			setState(811);
			caseListElement();
			setState(816);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(812);
					match(SEMI);
					setState(813);
					caseListElement();
					}
					} 
				}
				setState(818);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			setState(822);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(819);
				match(SEMI);
				setState(820);
				match(ELSE);
				setState(821);
				statements();
				}
			}

			setState(824);
			match(END);
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
	public static class CaseListElementContext extends ParserRuleContext {
		public ConstListContext constList() {
			return getRuleContext(ConstListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pascalParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public CaseListElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseListElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterCaseListElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitCaseListElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitCaseListElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseListElementContext caseListElement() throws RecognitionException {
		CaseListElementContext _localctx = new CaseListElementContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_caseListElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			constList();
			setState(827);
			match(COLON);
			setState(828);
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
	public static class RepetetiveStatementContext extends ParserRuleContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public RepeatStatementContext repeatStatement() {
			return getRuleContext(RepeatStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public RepetetiveStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetetiveStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterRepetetiveStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitRepetetiveStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitRepetetiveStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepetetiveStatementContext repetetiveStatement() throws RecognitionException {
		RepetetiveStatementContext _localctx = new RepetetiveStatementContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_repetetiveStatement);
		try {
			setState(833);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(830);
				whileStatement();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(831);
				repeatStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(832);
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
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(pascalParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(pascalParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			match(WHILE);
			setState(836);
			expression();
			setState(837);
			match(DO);
			setState(838);
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
	public static class RepeatStatementContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(pascalParser.REPEAT, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(pascalParser.UNTIL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RepeatStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterRepeatStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitRepeatStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitRepeatStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatStatementContext repeatStatement() throws RecognitionException {
		RepeatStatementContext _localctx = new RepeatStatementContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_repeatStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(840);
			match(REPEAT);
			setState(841);
			statements();
			setState(842);
			match(UNTIL);
			setState(843);
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
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(pascalParser.FOR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(pascalParser.ASSIGN, 0); }
		public ForListContext forList() {
			return getRuleContext(ForListContext.class,0);
		}
		public TerminalNode DO() { return getToken(pascalParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			match(FOR);
			setState(846);
			identifier();
			setState(847);
			match(ASSIGN);
			setState(848);
			forList();
			setState(849);
			match(DO);
			setState(850);
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
	public static class ForListContext extends ParserRuleContext {
		public InitialValueContext initialValue() {
			return getRuleContext(InitialValueContext.class,0);
		}
		public FinalValueContext finalValue() {
			return getRuleContext(FinalValueContext.class,0);
		}
		public TerminalNode TO() { return getToken(pascalParser.TO, 0); }
		public TerminalNode DOWNTO() { return getToken(pascalParser.DOWNTO, 0); }
		public ForListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterForList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitForList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitForList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForListContext forList() throws RecognitionException {
		ForListContext _localctx = new ForListContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_forList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			initialValue();
			setState(853);
			_la = _input.LA(1);
			if ( !(_la==DOWNTO || _la==TO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(854);
			finalValue();
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
	public static class InitialValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitialValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterInitialValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitInitialValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitInitialValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitialValueContext initialValue() throws RecognitionException {
		InitialValueContext _localctx = new InitialValueContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_initialValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
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
	public static class FinalValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FinalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterFinalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitFinalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitFinalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinalValueContext finalValue() throws RecognitionException {
		FinalValueContext _localctx = new FinalValueContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_finalValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
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
	public static class WithStatementContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(pascalParser.WITH, 0); }
		public RecordVariableListContext recordVariableList() {
			return getRuleContext(RecordVariableListContext.class,0);
		}
		public TerminalNode DO() { return getToken(pascalParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WithStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterWithStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitWithStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitWithStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithStatementContext withStatement() throws RecognitionException {
		WithStatementContext _localctx = new WithStatementContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_withStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			match(WITH);
			setState(861);
			recordVariableList();
			setState(862);
			match(DO);
			setState(863);
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
	public static class RecordVariableListContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pascalParser.COMMA, i);
		}
		public RecordVariableListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordVariableList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).enterRecordVariableList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pascalListener ) ((pascalListener)listener).exitRecordVariableList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pascalVisitor ) return ((pascalVisitor<? extends T>)visitor).visitRecordVariableList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordVariableListContext recordVariableList() throws RecognitionException {
		RecordVariableListContext _localctx = new RecordVariableListContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_recordVariableList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(865);
			variable();
			setState(870);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(866);
				match(COMMA);
				setState(867);
				variable();
				}
				}
				setState(872);
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

	public static final String _serializedATN =
		"\u0004\u0001Q\u036a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007Y\u0002"+
		"Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007^\u0002"+
		"_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007c\u0002"+
		"d\u0007d\u0002e\u0007e\u0001\u0000\u0001\u0000\u0003\u0000\u00cf\b\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000\u00d8\b\u0000\n\u0000\f\u0000\u00db\t\u0000\u0001"+
		"\u0000\u0003\u0000\u00de\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00e6\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00ee"+
		"\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u00f9\b\u0003\n"+
		"\u0003\f\u0003\u00fc\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u010c"+
		"\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0112"+
		"\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u0119\b\u0007\n\u0007\f\u0007\u011c\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u0133\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u013d\b\n\n\n\f\n\u0140\t\n\u0001\n\u0001\n"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0004\f\u014a"+
		"\b\f\u000b\f\f\f\u014b\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u0161\b\u000f\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u0165\b\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0004\u0016\u0175\b\u0016\u000b"+
		"\u0016\f\u0016\u0176\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u017e\b\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u0182"+
		"\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u0189\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u018e"+
		"\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0194"+
		"\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0003\u001e\u01a0"+
		"\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01a5\b\u001f"+
		"\u0001 \u0001 \u0001 \u0001 \u0003 \u01ab\b \u0001!\u0001!\u0001!\u0001"+
		"!\u0003!\u01b1\b!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0003\"\u01c3\b\"\u0001#\u0001#\u0001#\u0005#\u01c8\b#\n#\f#\u01cb"+
		"\t#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0003&\u01d3\b&\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001\'\u0003\'\u01da\b\'\u0001\'\u0003\'\u01dd\b\'"+
		"\u0001(\u0001(\u0001(\u0005(\u01e2\b(\n(\f(\u01e5\t(\u0001)\u0001)\u0001"+
		")\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0005*\u01f1\b*\n*"+
		"\f*\u01f4\t*\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u01fb\b+\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001"+
		".\u0001.\u0001/\u0001/\u0001/\u0001/\u0003/\u020d\b/\u00010\u00010\u0001"+
		"0\u00011\u00011\u00011\u00011\u00051\u0216\b1\n1\f1\u0219\t1\u00011\u0001"+
		"1\u00012\u00012\u00012\u00012\u00013\u00013\u00013\u00014\u00014\u0003"+
		"4\u0226\b4\u00015\u00015\u00015\u00035\u022b\b5\u00015\u00015\u00015\u0001"+
		"6\u00016\u00016\u00016\u00056\u0234\b6\n6\f6\u0237\t6\u00016\u00016\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00037\u0242\b7\u00018\u0001"+
		"8\u00018\u00018\u00019\u00019\u00019\u00059\u024b\b9\n9\f9\u024e\t9\u0001"+
		":\u0001:\u0001:\u0005:\u0253\b:\n:\f:\u0256\t:\u0001;\u0001;\u0001;\u0003"+
		";\u025b\b;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001<\u0001<\u0001=\u0001"+
		"=\u0001=\u0001=\u0001=\u0003=\u0269\b=\u0001>\u0001>\u0003>\u026d\b>\u0001"+
		"?\u0001?\u0001?\u0001?\u0003?\u0273\b?\u0001@\u0001@\u0001@\u0001@\u0001"+
		"A\u0001A\u0001A\u0003A\u027c\bA\u0001A\u0001A\u0001A\u0001A\u0005A\u0282"+
		"\bA\nA\fA\u0285\tA\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0005A\u028d"+
		"\bA\nA\fA\u0290\tA\u0001A\u0001A\u0001A\u0001A\u0001A\u0005A\u0297\bA"+
		"\nA\fA\u029a\tA\u0001B\u0001B\u0001B\u0001B\u0003B\u02a0\bB\u0001C\u0001"+
		"C\u0001D\u0001D\u0001D\u0001D\u0003D\u02a8\bD\u0001E\u0001E\u0001F\u0001"+
		"F\u0001F\u0001F\u0003F\u02b0\bF\u0001G\u0001G\u0001H\u0003H\u02b5\bH\u0001"+
		"H\u0001H\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001"+
		"I\u0001I\u0001I\u0003I\u02c4\bI\u0001J\u0001J\u0001J\u0001J\u0003J\u02ca"+
		"\bJ\u0001K\u0001K\u0001K\u0001K\u0001K\u0001L\u0001L\u0001L\u0005L\u02d4"+
		"\bL\nL\fL\u02d7\tL\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0001"+
		"M\u0003M\u02e1\bM\u0001N\u0001N\u0001N\u0005N\u02e6\bN\nN\fN\u02e9\tN"+
		"\u0001N\u0003N\u02ec\bN\u0001O\u0001O\u0001O\u0003O\u02f1\bO\u0001P\u0001"+
		"P\u0001P\u0001P\u0001P\u0003P\u02f8\bP\u0001Q\u0001Q\u0005Q\u02fc\bQ\n"+
		"Q\fQ\u02ff\tQ\u0001R\u0001R\u0001R\u0001S\u0001S\u0001S\u0001T\u0001T"+
		"\u0001U\u0001U\u0001V\u0001V\u0001V\u0001V\u0003V\u030f\bV\u0001W\u0001"+
		"W\u0001W\u0001W\u0001X\u0001X\u0001X\u0005X\u0318\bX\nX\fX\u031b\tX\u0001"+
		"Y\u0001Y\u0003Y\u031f\bY\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0003"+
		"Z\u0327\bZ\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0005[\u032f\b[\n"+
		"[\f[\u0332\t[\u0001[\u0001[\u0001[\u0003[\u0337\b[\u0001[\u0001[\u0001"+
		"\\\u0001\\\u0001\\\u0001\\\u0001]\u0001]\u0001]\u0003]\u0342\b]\u0001"+
		"^\u0001^\u0001^\u0001^\u0001^\u0001_\u0001_\u0001_\u0001_\u0001_\u0001"+
		"`\u0001`\u0001`\u0001`\u0001`\u0001`\u0001`\u0001a\u0001a\u0001a\u0001"+
		"a\u0001b\u0001b\u0001c\u0001c\u0001d\u0001d\u0001d\u0001d\u0001d\u0001"+
		"e\u0001e\u0001e\u0005e\u0365\be\ne\fe\u0368\te\u0001e\u0000\u0000f\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u0000"+
		"\u0007\u0001\u0000)*\u0001\u0000HI\u0005\u0000\u0004\u0004\u0006\u0006"+
		"\u0014\u0014\u001e\u001eFF\u0002\u0000\u0013\u001316\u0002\u0000\u001a"+
		"\u001a)*\u0004\u0000\u0001\u0001\t\t\u0016\u0016+,\u0002\u0000\u000b\u000b"+
		"##\u036f\u0000\u00dd\u0001\u0000\u0000\u0000\u0002\u00ed\u0001\u0000\u0000"+
		"\u0000\u0004\u00ef\u0001\u0000\u0000\u0000\u0006\u00fa\u0001\u0000\u0000"+
		"\u0000\b\u00ff\u0001\u0000\u0000\u0000\n\u010b\u0001\u0000\u0000\u0000"+
		"\f\u0111\u0001\u0000\u0000\u0000\u000e\u0113\u0001\u0000\u0000\u0000\u0010"+
		"\u0132\u0001\u0000\u0000\u0000\u0012\u0134\u0001\u0000\u0000\u0000\u0014"+
		"\u0138\u0001\u0000\u0000\u0000\u0016\u0143\u0001\u0000\u0000\u0000\u0018"+
		"\u0145\u0001\u0000\u0000\u0000\u001a\u014d\u0001\u0000\u0000\u0000\u001c"+
		"\u0151\u0001\u0000\u0000\u0000\u001e\u0160\u0001\u0000\u0000\u0000 \u0164"+
		"\u0001\u0000\u0000\u0000\"\u0166\u0001\u0000\u0000\u0000$\u0168\u0001"+
		"\u0000\u0000\u0000&\u016a\u0001\u0000\u0000\u0000(\u016c\u0001\u0000\u0000"+
		"\u0000*\u016e\u0001\u0000\u0000\u0000,\u0170\u0001\u0000\u0000\u0000."+
		"\u0178\u0001\u0000\u0000\u00000\u017f\u0001\u0000\u0000\u00002\u0186\u0001"+
		"\u0000\u0000\u00004\u018d\u0001\u0000\u0000\u00006\u0193\u0001\u0000\u0000"+
		"\u00008\u0195\u0001\u0000\u0000\u0000:\u0199\u0001\u0000\u0000\u0000<"+
		"\u019f\u0001\u0000\u0000\u0000>\u01a4\u0001\u0000\u0000\u0000@\u01aa\u0001"+
		"\u0000\u0000\u0000B\u01ac\u0001\u0000\u0000\u0000D\u01c2\u0001\u0000\u0000"+
		"\u0000F\u01c4\u0001\u0000\u0000\u0000H\u01cc\u0001\u0000\u0000\u0000J"+
		"\u01ce\u0001\u0000\u0000\u0000L\u01d0\u0001\u0000\u0000\u0000N\u01dc\u0001"+
		"\u0000\u0000\u0000P\u01de\u0001\u0000\u0000\u0000R\u01e6\u0001\u0000\u0000"+
		"\u0000T\u01ea\u0001\u0000\u0000\u0000V\u01fa\u0001\u0000\u0000\u0000X"+
		"\u01fc\u0001\u0000\u0000\u0000Z\u0202\u0001\u0000\u0000\u0000\\\u0206"+
		"\u0001\u0000\u0000\u0000^\u020c\u0001\u0000\u0000\u0000`\u020e\u0001\u0000"+
		"\u0000\u0000b\u0211\u0001\u0000\u0000\u0000d\u021c\u0001\u0000\u0000\u0000"+
		"f\u0220\u0001\u0000\u0000\u0000h\u0225\u0001\u0000\u0000\u0000j\u0227"+
		"\u0001\u0000\u0000\u0000l\u022f\u0001\u0000\u0000\u0000n\u0241\u0001\u0000"+
		"\u0000\u0000p\u0243\u0001\u0000\u0000\u0000r\u0247\u0001\u0000\u0000\u0000"+
		"t\u024f\u0001\u0000\u0000\u0000v\u0257\u0001\u0000\u0000\u0000x\u0261"+
		"\u0001\u0000\u0000\u0000z\u0268\u0001\u0000\u0000\u0000|\u026c\u0001\u0000"+
		"\u0000\u0000~\u0272\u0001\u0000\u0000\u0000\u0080\u0274\u0001\u0000\u0000"+
		"\u0000\u0082\u027b\u0001\u0000\u0000\u0000\u0084\u029b\u0001\u0000\u0000"+
		"\u0000\u0086\u02a1\u0001\u0000\u0000\u0000\u0088\u02a3\u0001\u0000\u0000"+
		"\u0000\u008a\u02a9\u0001\u0000\u0000\u0000\u008c\u02ab\u0001\u0000\u0000"+
		"\u0000\u008e\u02b1\u0001\u0000\u0000\u0000\u0090\u02b4\u0001\u0000\u0000"+
		"\u0000\u0092\u02c3\u0001\u0000\u0000\u0000\u0094\u02c9\u0001\u0000\u0000"+
		"\u0000\u0096\u02cb\u0001\u0000\u0000\u0000\u0098\u02d0\u0001\u0000\u0000"+
		"\u0000\u009a\u02e0\u0001\u0000\u0000\u0000\u009c\u02eb\u0001\u0000\u0000"+
		"\u0000\u009e\u02ed\u0001\u0000\u0000\u0000\u00a0\u02f2\u0001\u0000\u0000"+
		"\u0000\u00a2\u02f9\u0001\u0000\u0000\u0000\u00a4\u0300\u0001\u0000\u0000"+
		"\u0000\u00a6\u0303\u0001\u0000\u0000\u0000\u00a8\u0306\u0001\u0000\u0000"+
		"\u0000\u00aa\u0308\u0001\u0000\u0000\u0000\u00ac\u030e\u0001\u0000\u0000"+
		"\u0000\u00ae\u0310\u0001\u0000\u0000\u0000\u00b0\u0314\u0001\u0000\u0000"+
		"\u0000\u00b2\u031e\u0001\u0000\u0000\u0000\u00b4\u0320\u0001\u0000\u0000"+
		"\u0000\u00b6\u0328\u0001\u0000\u0000\u0000\u00b8\u033a\u0001\u0000\u0000"+
		"\u0000\u00ba\u0341\u0001\u0000\u0000\u0000\u00bc\u0343\u0001\u0000\u0000"+
		"\u0000\u00be\u0348\u0001\u0000\u0000\u0000\u00c0\u034d\u0001\u0000\u0000"+
		"\u0000\u00c2\u0354\u0001\u0000\u0000\u0000\u00c4\u0358\u0001\u0000\u0000"+
		"\u0000\u00c6\u035a\u0001\u0000\u0000\u0000\u00c8\u035c\u0001\u0000\u0000"+
		"\u0000\u00ca\u0361\u0001\u0000\u0000\u0000\u00cc\u00ce\u0003\u0002\u0001"+
		"\u0000\u00cd\u00cf\u0005D\u0000\u0000\u00ce\u00cd\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d0\u00d1\u0003\u0006\u0003\u0000\u00d1\u00d2\u0005?\u0000\u0000\u00d2"+
		"\u00d3\u0005\u0000\u0000\u0001\u00d3\u00de\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d8\u0003\b\u0004\u0000\u00d5\u00d8\u0003\u0010\b\u0000\u00d6\u00d8"+
		"\u0003\n\u0005\u0000\u00d7\u00d4\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d8\u00db\u0001"+
		"\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da\u0001"+
		"\u0000\u0000\u0000\u00da\u00dc\u0001\u0000\u0000\u0000\u00db\u00d9\u0001"+
		"\u0000\u0000\u0000\u00dc\u00de\u0005\u0000\u0000\u0001\u00dd\u00cc\u0001"+
		"\u0000\u0000\u0000\u00dd\u00d9\u0001\u0000\u0000\u0000\u00de\u0001\u0001"+
		"\u0000\u0000\u0000\u00df\u00e0\u0005\u001d\u0000\u0000\u00e0\u00e5\u0003"+
		"\u0004\u0002\u0000\u00e1\u00e2\u00057\u0000\u0000\u00e2\u00e3\u0003r9"+
		"\u0000\u00e3\u00e4\u00058\u0000\u0000\u00e4\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e1\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005/\u0000\u0000\u00e8"+
		"\u00ee\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005C\u0000\u0000\u00ea\u00eb"+
		"\u0003\u0004\u0002\u0000\u00eb\u00ec\u0005/\u0000\u0000\u00ec\u00ee\u0001"+
		"\u0000\u0000\u0000\u00ed\u00df\u0001\u0000\u0000\u0000\u00ed\u00e9\u0001"+
		"\u0000\u0000\u0000\u00ee\u0003\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005"+
		"M\u0000\u0000\u00f0\u0005\u0001\u0000\u0000\u0000\u00f1\u00f9\u0003\u0014"+
		"\n\u0000\u00f2\u00f9\u0003\u0018\f\u0000\u00f3\u00f9\u0003,\u0016\u0000"+
		"\u00f4\u00f9\u0003b1\u0000\u00f5\u00f9\u0003f3\u0000\u00f6\u00f9\u0003"+
		"\u0012\t\u0000\u00f7\u00f9\u0005G\u0000\u0000\u00f8\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f2\u0001\u0000\u0000\u0000\u00f8\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f4\u0001\u0000\u0000\u0000\u00f8\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fc\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000"+
		"\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fd\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fd\u00fe\u0003\u00ae"+
		"W\u0000\u00fe\u0007\u0001\u0000\u0000\u0000\u00ff\u0100\u00032\u0019\u0000"+
		"\u0100\u0101\u0003\u0004\u0002\u0000\u0101\u0102\u0005?\u0000\u0000\u0102"+
		"\u0103\u0003\u0004\u0002\u0000\u0103\u0104\u0005/\u0000\u0000\u0104\u0105"+
		"\u0003\u00aeW\u0000\u0105\u0106\u0005/\u0000\u0000\u0106\t\u0001\u0000"+
		"\u0000\u0000\u0107\u0108\u0005M\u0000\u0000\u0108\u0109\u00051\u0000\u0000"+
		"\u0109\u010c\u0003\f\u0006\u0000\u010a\u010c\u0003\f\u0006\u0000\u010b"+
		"\u0107\u0001\u0000\u0000\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010c"+
		"\u000b\u0001\u0000\u0000\u0000\u010d\u0112\u0005M\u0000\u0000\u010e\u0112"+
		"\u0005O\u0000\u0000\u010f\u0112\u0003\u000e\u0007\u0000\u0110\u0112\u0003"+
		"\u0010\b\u0000\u0111\u010d\u0001\u0000\u0000\u0000\u0111\u010e\u0001\u0000"+
		"\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0111\u0110\u0001\u0000"+
		"\u0000\u0000\u0112\r\u0001\u0000\u0000\u0000\u0113\u0114\u0005M\u0000"+
		"\u0000\u0114\u0115\u00057\u0000\u0000\u0115\u011a\u0003\f\u0006\u0000"+
		"\u0116\u0117\u0005.\u0000\u0000\u0117\u0119\u0003\f\u0006\u0000\u0118"+
		"\u0116\u0001\u0000\u0000\u0000\u0119\u011c\u0001\u0000\u0000\u0000\u011a"+
		"\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b"+
		"\u011d\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011d"+
		"\u011e\u00058\u0000\u0000\u011e\u000f\u0001\u0000\u0000\u0000\u011f\u0120"+
		"\u0003\u0004\u0002\u0000\u0120\u0121\u00057\u0000\u0000\u0121\u0122\u0005"+
		"8\u0000\u0000\u0122\u0133\u0001\u0000\u0000\u0000\u0123\u0124\u0005Q\u0000"+
		"\u0000\u0124\u0125\u0003\u0004\u0002\u0000\u0125\u0126\u00057\u0000\u0000"+
		"\u0126\u0127\u00058\u0000\u0000\u0127\u0133\u0001\u0000\u0000\u0000\u0128"+
		"\u0129\u0003\u0004\u0002\u0000\u0129\u012a\u0005-\u0000\u0000\u012a\u012b"+
		"\u0003\u0004\u0002\u0000\u012b\u0133\u0001\u0000\u0000\u0000\u012c\u012d"+
		"\u0003\u0004\u0002\u0000\u012d\u012e\u0005-\u0000\u0000\u012e\u012f\u0003"+
		"\u0004\u0002\u0000\u012f\u0130\u0005?\u0000\u0000\u0130\u0131\u0003\u0004"+
		"\u0002\u0000\u0131\u0133\u0001\u0000\u0000\u0000\u0132\u011f\u0001\u0000"+
		"\u0000\u0000\u0132\u0123\u0001\u0000\u0000\u0000\u0132\u0128\u0001\u0000"+
		"\u0000\u0000\u0132\u012c\u0001\u0000\u0000\u0000\u0133\u0011\u0001\u0000"+
		"\u0000\u0000\u0134\u0135\u0005E\u0000\u0000\u0135\u0136\u0003r9\u0000"+
		"\u0136\u0137\u0005/\u0000\u0000\u0137\u0013\u0001\u0000\u0000\u0000\u0138"+
		"\u0139\u0005\u0015\u0000\u0000\u0139\u013e\u0003\u0016\u000b\u0000\u013a"+
		"\u013b\u0005.\u0000\u0000\u013b\u013d\u0003\u0016\u000b\u0000\u013c\u013a"+
		"\u0001\u0000\u0000\u0000\u013d\u0140\u0001\u0000\u0000\u0000\u013e\u013c"+
		"\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0141"+
		"\u0001\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0141\u0142"+
		"\u0005/\u0000\u0000\u0142\u0015\u0001\u0000\u0000\u0000\u0143\u0144\u0003"+
		"\"\u0011\u0000\u0144\u0017\u0001\u0000\u0000\u0000\u0145\u0149\u0005\b"+
		"\u0000\u0000\u0146\u0147\u0003\u001a\r\u0000\u0147\u0148\u0005/\u0000"+
		"\u0000\u0148\u014a\u0001\u0000\u0000\u0000\u0149\u0146\u0001\u0000\u0000"+
		"\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000"+
		"\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u0019\u0001\u0000\u0000"+
		"\u0000\u014d\u014e\u0003\u0004\u0002\u0000\u014e\u014f\u00051\u0000\u0000"+
		"\u014f\u0150\u0003\u001e\u000f\u0000\u0150\u001b\u0001\u0000\u0000\u0000"+
		"\u0151\u0152\u0005\u0007\u0000\u0000\u0152\u0153\u00057\u0000\u0000\u0153"+
		"\u0154\u0003\"\u0011\u0000\u0154\u0155\u00058\u0000\u0000\u0155\u001d"+
		"\u0001\u0000\u0000\u0000\u0156\u0161\u0003 \u0010\u0000\u0157\u0158\u0003"+
		"&\u0013\u0000\u0158\u0159\u0003 \u0010\u0000\u0159\u0161\u0001\u0000\u0000"+
		"\u0000\u015a\u0161\u0003\u0004\u0002\u0000\u015b\u015c\u0003&\u0013\u0000"+
		"\u015c\u015d\u0003\u0004\u0002\u0000\u015d\u0161\u0001\u0000\u0000\u0000"+
		"\u015e\u0161\u0003*\u0015\u0000\u015f\u0161\u0003\u001c\u000e\u0000\u0160"+
		"\u0156\u0001\u0000\u0000\u0000\u0160\u0157\u0001\u0000\u0000\u0000\u0160"+
		"\u015a\u0001\u0000\u0000\u0000\u0160\u015b\u0001\u0000\u0000\u0000\u0160"+
		"\u015e\u0001\u0000\u0000\u0000\u0160\u015f\u0001\u0000\u0000\u0000\u0161"+
		"\u001f\u0001\u0000\u0000\u0000\u0162\u0165\u0003\"\u0011\u0000\u0163\u0165"+
		"\u0003$\u0012\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0164\u0163\u0001"+
		"\u0000\u0000\u0000\u0165!\u0001\u0000\u0000\u0000\u0166\u0167\u0005O\u0000"+
		"\u0000\u0167#\u0001\u0000\u0000\u0000\u0168\u0169\u0005P\u0000\u0000\u0169"+
		"%\u0001\u0000\u0000\u0000\u016a\u016b\u0007\u0000\u0000\u0000\u016b\'"+
		"\u0001\u0000\u0000\u0000\u016c\u016d\u0007\u0001\u0000\u0000\u016d)\u0001"+
		"\u0000\u0000\u0000\u016e\u016f\u0005N\u0000\u0000\u016f+\u0001\u0000\u0000"+
		"\u0000\u0170\u0174\u0005$\u0000\u0000\u0171\u0172\u0003.\u0017\u0000\u0172"+
		"\u0173\u0005/\u0000\u0000\u0173\u0175\u0001\u0000\u0000\u0000\u0174\u0171"+
		"\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0176\u0174"+
		"\u0001\u0000\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0177-\u0001"+
		"\u0000\u0000\u0000\u0178\u0179\u0003\u0004\u0002\u0000\u0179\u017d\u0005"+
		"1\u0000\u0000\u017a\u017e\u00034\u001a\u0000\u017b\u017e\u00030\u0018"+
		"\u0000\u017c\u017e\u00032\u0019\u0000\u017d\u017a\u0001\u0000\u0000\u0000"+
		"\u017d\u017b\u0001\u0000\u0000\u0000\u017d\u017c\u0001\u0000\u0000\u0000"+
		"\u017e/\u0001\u0000\u0000\u0000\u017f\u0181\u0005\u0010\u0000\u0000\u0180"+
		"\u0182\u0003l6\u0000\u0181\u0180\u0001\u0000\u0000\u0000\u0181\u0182\u0001"+
		"\u0000\u0000\u0000\u0182\u0183\u0001\u0000\u0000\u0000\u0183\u0184\u0005"+
		"0\u0000\u0000\u0184\u0185\u0003x<\u0000\u01851\u0001\u0000\u0000\u0000"+
		"\u0186\u0188\u0005\u001c\u0000\u0000\u0187\u0189\u0003l6\u0000\u0188\u0187"+
		"\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u01893\u0001"+
		"\u0000\u0000\u0000\u018a\u018e\u00036\u001b\u0000\u018b\u018e\u0003>\u001f"+
		"\u0000\u018c\u018e\u0003`0\u0000\u018d\u018a\u0001\u0000\u0000\u0000\u018d"+
		"\u018b\u0001\u0000\u0000\u0000\u018d\u018c\u0001\u0000\u0000\u0000\u018e"+
		"5\u0001\u0000\u0000\u0000\u018f\u0194\u00038\u001c\u0000\u0190\u0194\u0003"+
		":\u001d\u0000\u0191\u0194\u0003<\u001e\u0000\u0192\u0194\u0003B!\u0000"+
		"\u0193\u018f\u0001\u0000\u0000\u0000\u0193\u0190\u0001\u0000\u0000\u0000"+
		"\u0193\u0191\u0001\u0000\u0000\u0000\u0193\u0192\u0001\u0000\u0000\u0000"+
		"\u01947\u0001\u0000\u0000\u0000\u0195\u0196\u00057\u0000\u0000\u0196\u0197"+
		"\u0003r9\u0000\u0197\u0198\u00058\u0000\u0000\u01989\u0001\u0000\u0000"+
		"\u0000\u0199\u019a\u0003\u001e\u000f\u0000\u019a\u019b\u0005@\u0000\u0000"+
		"\u019b\u019c\u0003\u001e\u000f\u0000\u019c;\u0001\u0000\u0000\u0000\u019d"+
		"\u01a0\u0003\u0004\u0002\u0000\u019e\u01a0\u0007\u0002\u0000\u0000\u019f"+
		"\u019d\u0001\u0000\u0000\u0000\u019f\u019e\u0001\u0000\u0000\u0000\u01a0"+
		"=\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005\u001b\u0000\u0000\u01a2\u01a5"+
		"\u0003@ \u0000\u01a3\u01a5\u0003@ \u0000\u01a4\u01a1\u0001\u0000\u0000"+
		"\u0000\u01a4\u01a3\u0001\u0000\u0000\u0000\u01a5?\u0001\u0000\u0000\u0000"+
		"\u01a6\u01ab\u0003D\"\u0000\u01a7\u01ab\u0003L&\u0000\u01a8\u01ab\u0003"+
		"Z-\u0000\u01a9\u01ab\u0003^/\u0000\u01aa\u01a6\u0001\u0000\u0000\u0000"+
		"\u01aa\u01a7\u0001\u0000\u0000\u0000\u01aa\u01a8\u0001\u0000\u0000\u0000"+
		"\u01aa\u01a9\u0001\u0000\u0000\u0000\u01abA\u0001\u0000\u0000\u0000\u01ac"+
		"\u01ad\u0005F\u0000\u0000\u01ad\u01b0\u00059\u0000\u0000\u01ae\u01b1\u0003"+
		"\u0004\u0002\u0000\u01af\u01b1\u0003 \u0010\u0000\u01b0\u01ae\u0001\u0000"+
		"\u0000\u0000\u01b0\u01af\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000"+
		"\u0000\u0000\u01b2\u01b3\u0005;\u0000\u0000\u01b3C\u0001\u0000\u0000\u0000"+
		"\u01b4\u01b5\u0005\u0002\u0000\u0000\u01b5\u01b6\u00059\u0000\u0000\u01b6"+
		"\u01b7\u0003F#\u0000\u01b7\u01b8\u0005;\u0000\u0000\u01b8\u01b9\u0005"+
		"\u0019\u0000\u0000\u01b9\u01ba\u0003J%\u0000\u01ba\u01c3\u0001\u0000\u0000"+
		"\u0000\u01bb\u01bc\u0005\u0002\u0000\u0000\u01bc\u01bd\u0005:\u0000\u0000"+
		"\u01bd\u01be\u0003F#\u0000\u01be\u01bf\u0005<\u0000\u0000\u01bf\u01c0"+
		"\u0005\u0019\u0000\u0000\u01c0\u01c1\u0003J%\u0000\u01c1\u01c3\u0001\u0000"+
		"\u0000\u0000\u01c2\u01b4\u0001\u0000\u0000\u0000\u01c2\u01bb\u0001\u0000"+
		"\u0000\u0000\u01c3E\u0001\u0000\u0000\u0000\u01c4\u01c9\u0003H$\u0000"+
		"\u01c5\u01c6\u0005.\u0000\u0000\u01c6\u01c8\u0003H$\u0000\u01c7\u01c5"+
		"\u0001\u0000\u0000\u0000\u01c8\u01cb\u0001\u0000\u0000\u0000\u01c9\u01c7"+
		"\u0001\u0000\u0000\u0000\u01c9\u01ca\u0001\u0000\u0000\u0000\u01caG\u0001"+
		"\u0000\u0000\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cc\u01cd\u0003"+
		"6\u001b\u0000\u01cdI\u0001\u0000\u0000\u0000\u01ce\u01cf\u00034\u001a"+
		"\u0000\u01cfK\u0001\u0000\u0000\u0000\u01d0\u01d2\u0005\u001f\u0000\u0000"+
		"\u01d1\u01d3\u0003N\'\u0000\u01d2\u01d1\u0001\u0000\u0000\u0000\u01d2"+
		"\u01d3\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4"+
		"\u01d5\u0005\r\u0000\u0000\u01d5M\u0001\u0000\u0000\u0000\u01d6\u01d9"+
		"\u0003P(\u0000\u01d7\u01d8\u0005/\u0000\u0000\u01d8\u01da\u0003T*\u0000"+
		"\u01d9\u01d7\u0001\u0000\u0000\u0000\u01d9\u01da\u0001\u0000\u0000\u0000"+
		"\u01da\u01dd\u0001\u0000\u0000\u0000\u01db\u01dd\u0003T*\u0000\u01dc\u01d6"+
		"\u0001\u0000\u0000\u0000\u01dc\u01db\u0001\u0000\u0000\u0000\u01ddO\u0001"+
		"\u0000\u0000\u0000\u01de\u01e3\u0003R)\u0000\u01df\u01e0\u0005/\u0000"+
		"\u0000\u01e0\u01e2\u0003R)\u0000\u01e1\u01df\u0001\u0000\u0000\u0000\u01e2"+
		"\u01e5\u0001\u0000\u0000\u0000\u01e3\u01e1\u0001\u0000\u0000\u0000\u01e3"+
		"\u01e4\u0001\u0000\u0000\u0000\u01e4Q\u0001\u0000\u0000\u0000\u01e5\u01e3"+
		"\u0001\u0000\u0000\u0000\u01e6\u01e7\u0003r9\u0000\u01e7\u01e8\u00050"+
		"\u0000\u0000\u01e8\u01e9\u00034\u001a\u0000\u01e9S\u0001\u0000\u0000\u0000"+
		"\u01ea\u01eb\u0005\u0005\u0000\u0000\u01eb\u01ec\u0003V+\u0000\u01ec\u01ed"+
		"\u0005\u0019\u0000\u0000\u01ed\u01f2\u0003X,\u0000\u01ee\u01ef\u0005/"+
		"\u0000\u0000\u01ef\u01f1\u0003X,\u0000\u01f0\u01ee\u0001\u0000\u0000\u0000"+
		"\u01f1\u01f4\u0001\u0000\u0000\u0000\u01f2\u01f0\u0001\u0000\u0000\u0000"+
		"\u01f2\u01f3\u0001\u0000\u0000\u0000\u01f3U\u0001\u0000\u0000\u0000\u01f4"+
		"\u01f2\u0001\u0000\u0000\u0000\u01f5\u01f6\u0003\u0004\u0002\u0000\u01f6"+
		"\u01f7\u00050\u0000\u0000\u01f7\u01f8\u0003<\u001e\u0000\u01f8\u01fb\u0001"+
		"\u0000\u0000\u0000\u01f9\u01fb\u0003<\u001e\u0000\u01fa\u01f5\u0001\u0000"+
		"\u0000\u0000\u01fa\u01f9\u0001\u0000\u0000\u0000\u01fbW\u0001\u0000\u0000"+
		"\u0000\u01fc\u01fd\u0003t:\u0000\u01fd\u01fe\u00050\u0000\u0000\u01fe"+
		"\u01ff\u00057\u0000\u0000\u01ff\u0200\u0003N\'\u0000\u0200\u0201\u0005"+
		"8\u0000\u0000\u0201Y\u0001\u0000\u0000\u0000\u0202\u0203\u0005!\u0000"+
		"\u0000\u0203\u0204\u0005\u0019\u0000\u0000\u0204\u0205\u0003\\.\u0000"+
		"\u0205[\u0001\u0000\u0000\u0000\u0206\u0207\u00036\u001b\u0000\u0207]"+
		"\u0001\u0000\u0000\u0000\u0208\u0209\u0005\u000e\u0000\u0000\u0209\u020a"+
		"\u0005\u0019\u0000\u0000\u020a\u020d\u00034\u001a\u0000\u020b\u020d\u0005"+
		"\u000e\u0000\u0000\u020c\u0208\u0001\u0000\u0000\u0000\u020c\u020b\u0001"+
		"\u0000\u0000\u0000\u020d_\u0001\u0000\u0000\u0000\u020e\u020f\u0005=\u0000"+
		"\u0000\u020f\u0210\u0003<\u001e\u0000\u0210a\u0001\u0000\u0000\u0000\u0211"+
		"\u0212\u0005&\u0000\u0000\u0212\u0217\u0003d2\u0000\u0213\u0214\u0005"+
		"/\u0000\u0000\u0214\u0216\u0003d2\u0000\u0215\u0213\u0001\u0000\u0000"+
		"\u0000\u0216\u0219\u0001\u0000\u0000\u0000\u0217\u0215\u0001\u0000\u0000"+
		"\u0000\u0217\u0218\u0001\u0000\u0000\u0000\u0218\u021a\u0001\u0000\u0000"+
		"\u0000\u0219\u0217\u0001\u0000\u0000\u0000\u021a\u021b\u0005/\u0000\u0000"+
		"\u021bc\u0001\u0000\u0000\u0000\u021c\u021d\u0003r9\u0000\u021d\u021e"+
		"\u00050\u0000\u0000\u021e\u021f\u00034\u001a\u0000\u021fe\u0001\u0000"+
		"\u0000\u0000\u0220\u0221\u0003h4\u0000\u0221\u0222\u0005/\u0000\u0000"+
		"\u0222g\u0001\u0000\u0000\u0000\u0223\u0226\u0003j5\u0000\u0224\u0226"+
		"\u0003v;\u0000\u0225\u0223\u0001\u0000\u0000\u0000\u0225\u0224\u0001\u0000"+
		"\u0000\u0000\u0226i\u0001\u0000\u0000\u0000\u0227\u0228\u0005\u001c\u0000"+
		"\u0000\u0228\u022a\u0003\u0004\u0002\u0000\u0229\u022b\u0003l6\u0000\u022a"+
		"\u0229\u0001\u0000\u0000\u0000\u022a\u022b\u0001\u0000\u0000\u0000\u022b"+
		"\u022c\u0001\u0000\u0000\u0000\u022c\u022d\u0005/\u0000\u0000\u022d\u022e"+
		"\u0003\u0006\u0003\u0000\u022ek\u0001\u0000\u0000\u0000\u022f\u0230\u0005"+
		"7\u0000\u0000\u0230\u0235\u0003n7\u0000\u0231\u0232\u0005/\u0000\u0000"+
		"\u0232\u0234\u0003n7\u0000\u0233\u0231\u0001\u0000\u0000\u0000\u0234\u0237"+
		"\u0001\u0000\u0000\u0000\u0235\u0233\u0001\u0000\u0000\u0000\u0235\u0236"+
		"\u0001\u0000\u0000\u0000\u0236\u0238\u0001\u0000\u0000\u0000\u0237\u0235"+
		"\u0001\u0000\u0000\u0000\u0238\u0239\u00058\u0000\u0000\u0239m\u0001\u0000"+
		"\u0000\u0000\u023a\u0242\u0003p8\u0000\u023b\u023c\u0005&\u0000\u0000"+
		"\u023c\u0242\u0003p8\u0000\u023d\u023e\u0005\u0010\u0000\u0000\u023e\u0242"+
		"\u0003p8\u0000\u023f\u0240\u0005\u001c\u0000\u0000\u0240\u0242\u0003p"+
		"8\u0000\u0241\u023a\u0001\u0000\u0000\u0000\u0241\u023b\u0001\u0000\u0000"+
		"\u0000\u0241\u023d\u0001\u0000\u0000\u0000\u0241\u023f\u0001\u0000\u0000"+
		"\u0000\u0242o\u0001\u0000\u0000\u0000\u0243\u0244\u0003r9\u0000\u0244"+
		"\u0245\u00050\u0000\u0000\u0245\u0246\u0003<\u001e\u0000\u0246q\u0001"+
		"\u0000\u0000\u0000\u0247\u024c\u0003\u0004\u0002\u0000\u0248\u0249\u0005"+
		".\u0000\u0000\u0249\u024b\u0003\u0004\u0002\u0000\u024a\u0248\u0001\u0000"+
		"\u0000\u0000\u024b\u024e\u0001\u0000\u0000\u0000\u024c\u024a\u0001\u0000"+
		"\u0000\u0000\u024c\u024d\u0001\u0000\u0000\u0000\u024ds\u0001\u0000\u0000"+
		"\u0000\u024e\u024c\u0001\u0000\u0000\u0000\u024f\u0254\u0003\u001e\u000f"+
		"\u0000\u0250\u0251\u0005.\u0000\u0000\u0251\u0253\u0003\u001e\u000f\u0000"+
		"\u0252\u0250\u0001\u0000\u0000\u0000\u0253\u0256\u0001\u0000\u0000\u0000"+
		"\u0254\u0252\u0001\u0000\u0000\u0000\u0254\u0255\u0001\u0000\u0000\u0000"+
		"\u0255u\u0001\u0000\u0000\u0000\u0256\u0254\u0001\u0000\u0000\u0000\u0257"+
		"\u0258\u0005\u0010\u0000\u0000\u0258\u025a\u0003\u0004\u0002\u0000\u0259"+
		"\u025b\u0003l6\u0000\u025a\u0259\u0001\u0000\u0000\u0000\u025a\u025b\u0001"+
		"\u0000\u0000\u0000\u025b\u025c\u0001\u0000\u0000\u0000\u025c\u025d\u0005"+
		"0\u0000\u0000\u025d\u025e\u0003x<\u0000\u025e\u025f\u0005/\u0000\u0000"+
		"\u025f\u0260\u0003\u0006\u0003\u0000\u0260w\u0001\u0000\u0000\u0000\u0261"+
		"\u0262\u0003<\u001e\u0000\u0262y\u0001\u0000\u0000\u0000\u0263\u0264\u0003"+
		"\u0016\u000b\u0000\u0264\u0265\u00050\u0000\u0000\u0265\u0266\u0003|>"+
		"\u0000\u0266\u0269\u0001\u0000\u0000\u0000\u0267\u0269\u0003|>\u0000\u0268"+
		"\u0263\u0001\u0000\u0000\u0000\u0268\u0267\u0001\u0000\u0000\u0000\u0269"+
		"{\u0001\u0000\u0000\u0000\u026a\u026d\u0003~?\u0000\u026b\u026d\u0003"+
		"\u00acV\u0000\u026c\u026a\u0001\u0000\u0000\u0000\u026c\u026b\u0001\u0000"+
		"\u0000\u0000\u026d}\u0001\u0000\u0000\u0000\u026e\u0273\u0003\u0080@\u0000"+
		"\u026f\u0273\u0003\u00a0P\u0000\u0270\u0273\u0003\u00a6S\u0000\u0271\u0273"+
		"\u0003\u00a8T\u0000\u0272\u026e\u0001\u0000\u0000\u0000\u0272\u026f\u0001"+
		"\u0000\u0000\u0000\u0272\u0270\u0001\u0000\u0000\u0000\u0272\u0271\u0001"+
		"\u0000\u0000\u0000\u0273\u007f\u0001\u0000\u0000\u0000\u0274\u0275\u0003"+
		"\u0082A\u0000\u0275\u0276\u0005-\u0000\u0000\u0276\u0277\u0003\u0084B"+
		"\u0000\u0277\u0081\u0001\u0000\u0000\u0000\u0278\u0279\u0005>\u0000\u0000"+
		"\u0279\u027c\u0003\u0004\u0002\u0000\u027a\u027c\u0003\u0004\u0002\u0000"+
		"\u027b\u0278\u0001\u0000\u0000\u0000\u027b\u027a\u0001\u0000\u0000\u0000"+
		"\u027c\u0298\u0001\u0000\u0000\u0000\u027d\u027e\u00059\u0000\u0000\u027e"+
		"\u0283\u0003\u0084B\u0000\u027f\u0280\u0005.\u0000\u0000\u0280\u0282\u0003"+
		"\u0084B\u0000\u0281\u027f\u0001\u0000\u0000\u0000\u0282\u0285\u0001\u0000"+
		"\u0000\u0000\u0283\u0281\u0001\u0000\u0000\u0000\u0283\u0284\u0001\u0000"+
		"\u0000\u0000\u0284\u0286\u0001\u0000\u0000\u0000\u0285\u0283\u0001\u0000"+
		"\u0000\u0000\u0286\u0287\u0005;\u0000\u0000\u0287\u0297\u0001\u0000\u0000"+
		"\u0000\u0288\u0289\u0005:\u0000\u0000\u0289\u028e\u0003\u0084B\u0000\u028a"+
		"\u028b\u0005.\u0000\u0000\u028b\u028d\u0003\u0084B\u0000\u028c\u028a\u0001"+
		"\u0000\u0000\u0000\u028d\u0290\u0001\u0000\u0000\u0000\u028e\u028c\u0001"+
		"\u0000\u0000\u0000\u028e\u028f\u0001\u0000\u0000\u0000\u028f\u0291\u0001"+
		"\u0000\u0000\u0000\u0290\u028e\u0001\u0000\u0000\u0000\u0291\u0292\u0005"+
		"<\u0000\u0000\u0292\u0297\u0001\u0000\u0000\u0000\u0293\u0294\u0005?\u0000"+
		"\u0000\u0294\u0297\u0003\u0004\u0002\u0000\u0295\u0297\u0005=\u0000\u0000"+
		"\u0296\u027d\u0001\u0000\u0000\u0000\u0296\u0288\u0001\u0000\u0000\u0000"+
		"\u0296\u0293\u0001\u0000\u0000\u0000\u0296\u0295\u0001\u0000\u0000\u0000"+
		"\u0297\u029a\u0001\u0000\u0000\u0000\u0298\u0296\u0001\u0000\u0000\u0000"+
		"\u0298\u0299\u0001\u0000\u0000\u0000\u0299\u0083\u0001\u0000\u0000\u0000"+
		"\u029a\u0298\u0001\u0000\u0000\u0000\u029b\u029f\u0003\u0088D\u0000\u029c"+
		"\u029d\u0003\u0086C\u0000\u029d\u029e\u0003\u0084B\u0000\u029e\u02a0\u0001"+
		"\u0000\u0000\u0000\u029f\u029c\u0001\u0000\u0000\u0000\u029f\u02a0\u0001"+
		"\u0000\u0000\u0000\u02a0\u0085\u0001\u0000\u0000\u0000\u02a1\u02a2\u0007"+
		"\u0003\u0000\u0000\u02a2\u0087\u0001\u0000\u0000\u0000\u02a3\u02a7\u0003"+
		"\u008cF\u0000\u02a4\u02a5\u0003\u008aE\u0000\u02a5\u02a6\u0003\u0088D"+
		"\u0000\u02a6\u02a8\u0001\u0000\u0000\u0000\u02a7\u02a4\u0001\u0000\u0000"+
		"\u0000\u02a7\u02a8\u0001\u0000\u0000\u0000\u02a8\u0089\u0001\u0000\u0000"+
		"\u0000\u02a9\u02aa\u0007\u0004\u0000\u0000\u02aa\u008b\u0001\u0000\u0000"+
		"\u0000\u02ab\u02af\u0003\u0090H\u0000\u02ac\u02ad\u0003\u008eG\u0000\u02ad"+
		"\u02ae\u0003\u008cF\u0000\u02ae\u02b0\u0001\u0000\u0000\u0000\u02af\u02ac"+
		"\u0001\u0000\u0000\u0000\u02af\u02b0\u0001\u0000\u0000\u0000\u02b0\u008d"+
		"\u0001\u0000\u0000\u0000\u02b1\u02b2\u0007\u0005\u0000\u0000\u02b2\u008f"+
		"\u0001\u0000\u0000\u0000\u02b3\u02b5\u0007\u0000\u0000\u0000\u02b4\u02b3"+
		"\u0001\u0000\u0000\u0000\u02b4\u02b5\u0001\u0000\u0000\u0000\u02b5\u02b6"+
		"\u0001\u0000\u0000\u0000\u02b6\u02b7\u0003\u0092I\u0000\u02b7\u0091\u0001"+
		"\u0000\u0000\u0000\u02b8\u02c4\u0003\u0082A\u0000\u02b9\u02ba\u00057\u0000"+
		"\u0000\u02ba\u02bb\u0003\u0084B\u0000\u02bb\u02bc\u00058\u0000\u0000\u02bc"+
		"\u02c4\u0001\u0000\u0000\u0000\u02bd\u02c4\u0003\u0096K\u0000\u02be\u02c4"+
		"\u0003\u0094J\u0000\u02bf\u02c4\u0003\u009aM\u0000\u02c0\u02c1\u0005\u0018"+
		"\u0000\u0000\u02c1\u02c4\u0003\u0092I\u0000\u02c2\u02c4\u0003(\u0014\u0000"+
		"\u02c3\u02b8\u0001\u0000\u0000\u0000\u02c3\u02b9\u0001\u0000\u0000\u0000"+
		"\u02c3\u02bd\u0001\u0000\u0000\u0000\u02c3\u02be\u0001\u0000\u0000\u0000"+
		"\u02c3\u02bf\u0001\u0000\u0000\u0000\u02c3\u02c0\u0001\u0000\u0000\u0000"+
		"\u02c3\u02c2\u0001\u0000\u0000\u0000\u02c4\u0093\u0001\u0000\u0000\u0000"+
		"\u02c5\u02ca\u0003 \u0010\u0000\u02c6\u02ca\u0003\u001c\u000e\u0000\u02c7"+
		"\u02ca\u0003*\u0015\u0000\u02c8\u02ca\u0005\u0017\u0000\u0000\u02c9\u02c5"+
		"\u0001\u0000\u0000\u0000\u02c9\u02c6\u0001\u0000\u0000\u0000\u02c9\u02c7"+
		"\u0001\u0000\u0000\u0000\u02c9\u02c8\u0001\u0000\u0000\u0000\u02ca\u0095"+
		"\u0001\u0000\u0000\u0000\u02cb\u02cc\u0003\u0004\u0002\u0000\u02cc\u02cd"+
		"\u00057\u0000\u0000\u02cd\u02ce\u0003\u0098L\u0000\u02ce\u02cf\u00058"+
		"\u0000\u0000\u02cf\u0097\u0001\u0000\u0000\u0000\u02d0\u02d5\u0003\u00a2"+
		"Q\u0000\u02d1\u02d2\u0005.\u0000\u0000\u02d2\u02d4\u0003\u00a2Q\u0000"+
		"\u02d3\u02d1\u0001\u0000\u0000\u0000\u02d4\u02d7\u0001\u0000\u0000\u0000"+
		"\u02d5\u02d3\u0001\u0000\u0000\u0000\u02d5\u02d6\u0001\u0000\u0000\u0000"+
		"\u02d6\u0099\u0001\u0000\u0000\u0000\u02d7\u02d5\u0001\u0000\u0000\u0000"+
		"\u02d8\u02d9\u00059\u0000\u0000\u02d9\u02da\u0003\u009cN\u0000\u02da\u02db"+
		"\u0005;\u0000\u0000\u02db\u02e1\u0001\u0000\u0000\u0000\u02dc\u02dd\u0005"+
		":\u0000\u0000\u02dd\u02de\u0003\u009cN\u0000\u02de\u02df\u0005<\u0000"+
		"\u0000\u02df\u02e1\u0001\u0000\u0000\u0000\u02e0\u02d8\u0001\u0000\u0000"+
		"\u0000\u02e0\u02dc\u0001\u0000\u0000\u0000\u02e1\u009b\u0001\u0000\u0000"+
		"\u0000\u02e2\u02e7\u0003\u009eO\u0000\u02e3\u02e4\u0005.\u0000\u0000\u02e4"+
		"\u02e6\u0003\u009eO\u0000\u02e5\u02e3\u0001\u0000\u0000\u0000\u02e6\u02e9"+
		"\u0001\u0000\u0000\u0000\u02e7\u02e5\u0001\u0000\u0000\u0000\u02e7\u02e8"+
		"\u0001\u0000\u0000\u0000\u02e8\u02ec\u0001\u0000\u0000\u0000\u02e9\u02e7"+
		"\u0001\u0000\u0000\u0000\u02ea\u02ec\u0001\u0000\u0000\u0000\u02eb\u02e2"+
		"\u0001\u0000\u0000\u0000\u02eb\u02ea\u0001\u0000\u0000\u0000\u02ec\u009d"+
		"\u0001\u0000\u0000\u0000\u02ed\u02f0\u0003\u0084B\u0000\u02ee\u02ef\u0005"+
		"@\u0000\u0000\u02ef\u02f1\u0003\u0084B\u0000\u02f0\u02ee\u0001\u0000\u0000"+
		"\u0000\u02f0\u02f1\u0001\u0000\u0000\u0000\u02f1\u009f\u0001\u0000\u0000"+
		"\u0000\u02f2\u02f7\u0003\u0004\u0002\u0000\u02f3\u02f4\u00057\u0000\u0000"+
		"\u02f4\u02f5\u0003\u0098L\u0000\u02f5\u02f6\u00058\u0000\u0000\u02f6\u02f8"+
		"\u0001\u0000\u0000\u0000\u02f7\u02f3\u0001\u0000\u0000\u0000\u02f7\u02f8"+
		"\u0001\u0000\u0000\u0000\u02f8\u00a1\u0001\u0000\u0000\u0000\u02f9\u02fd"+
		"\u0003\u0084B\u0000\u02fa\u02fc\u0003\u00a4R\u0000\u02fb\u02fa\u0001\u0000"+
		"\u0000\u0000\u02fc\u02ff\u0001\u0000\u0000\u0000\u02fd\u02fb\u0001\u0000"+
		"\u0000\u0000\u02fd\u02fe\u0001\u0000\u0000\u0000\u02fe\u00a3\u0001\u0000"+
		"\u0000\u0000\u02ff\u02fd\u0001\u0000\u0000\u0000\u0300\u0301\u00050\u0000"+
		"\u0000\u0301\u0302\u0003\u0084B\u0000\u0302\u00a5\u0001\u0000\u0000\u0000"+
		"\u0303\u0304\u0005\u0011\u0000\u0000\u0304\u0305\u0003\u0016\u000b\u0000"+
		"\u0305\u00a7\u0001\u0000\u0000\u0000\u0306\u0307\u0001\u0000\u0000\u0000"+
		"\u0307\u00a9\u0001\u0000\u0000\u0000\u0308\u0309\u0001\u0000\u0000\u0000"+
		"\u0309\u00ab\u0001\u0000\u0000\u0000\u030a\u030f\u0003\u00aeW\u0000\u030b"+
		"\u030f\u0003\u00b2Y\u0000\u030c\u030f\u0003\u00ba]\u0000\u030d\u030f\u0003"+
		"\u00c8d\u0000\u030e\u030a\u0001\u0000\u0000\u0000\u030e\u030b\u0001\u0000"+
		"\u0000\u0000\u030e\u030c\u0001\u0000\u0000\u0000\u030e\u030d\u0001\u0000"+
		"\u0000\u0000\u030f\u00ad\u0001\u0000\u0000\u0000\u0310\u0311\u0005\u0003"+
		"\u0000\u0000\u0311\u0312\u0003\u00b0X\u0000\u0312\u0313\u0005\r\u0000"+
		"\u0000\u0313\u00af\u0001\u0000\u0000\u0000\u0314\u0319\u0003z=\u0000\u0315"+
		"\u0316\u0005/\u0000\u0000\u0316\u0318\u0003z=\u0000\u0317\u0315\u0001"+
		"\u0000\u0000\u0000\u0318\u031b\u0001\u0000\u0000\u0000\u0319\u0317\u0001"+
		"\u0000\u0000\u0000\u0319\u031a\u0001\u0000\u0000\u0000\u031a\u00b1\u0001"+
		"\u0000\u0000\u0000\u031b\u0319\u0001\u0000\u0000\u0000\u031c\u031f\u0003"+
		"\u00b4Z\u0000\u031d\u031f\u0003\u00b6[\u0000\u031e\u031c\u0001\u0000\u0000"+
		"\u0000\u031e\u031d\u0001\u0000\u0000\u0000\u031f\u00b3\u0001\u0000\u0000"+
		"\u0000\u0320\u0321\u0005\u0012\u0000\u0000\u0321\u0322\u0003\u0084B\u0000"+
		"\u0322\u0323\u0005\"\u0000\u0000\u0323\u0326\u0003z=\u0000\u0324\u0325"+
		"\u0005\f\u0000\u0000\u0325\u0327\u0003z=\u0000\u0326\u0324\u0001\u0000"+
		"\u0000\u0000\u0326\u0327\u0001\u0000\u0000\u0000\u0327\u00b5\u0001\u0000"+
		"\u0000\u0000\u0328\u0329\u0005\u0005\u0000\u0000\u0329\u032a\u0003\u0084"+
		"B\u0000\u032a\u032b\u0005\u0019\u0000\u0000\u032b\u0330\u0003\u00b8\\"+
		"\u0000\u032c\u032d\u0005/\u0000\u0000\u032d\u032f\u0003\u00b8\\\u0000"+
		"\u032e\u032c\u0001\u0000\u0000\u0000\u032f\u0332\u0001\u0000\u0000\u0000"+
		"\u0330\u032e\u0001\u0000\u0000\u0000\u0330\u0331\u0001\u0000\u0000\u0000"+
		"\u0331\u0336\u0001\u0000\u0000\u0000\u0332\u0330\u0001\u0000\u0000\u0000"+
		"\u0333\u0334\u0005/\u0000\u0000\u0334\u0335\u0005\f\u0000\u0000\u0335"+
		"\u0337\u0003\u00b0X\u0000\u0336\u0333\u0001\u0000\u0000\u0000\u0336\u0337"+
		"\u0001\u0000\u0000\u0000\u0337\u0338\u0001\u0000\u0000\u0000\u0338\u0339"+
		"\u0005\r\u0000\u0000\u0339\u00b7\u0001\u0000\u0000\u0000\u033a\u033b\u0003"+
		"t:\u0000\u033b\u033c\u00050\u0000\u0000\u033c\u033d\u0003z=\u0000\u033d"+
		"\u00b9\u0001\u0000\u0000\u0000\u033e\u0342\u0003\u00bc^\u0000\u033f\u0342"+
		"\u0003\u00be_\u0000\u0340\u0342\u0003\u00c0`\u0000\u0341\u033e\u0001\u0000"+
		"\u0000\u0000\u0341\u033f\u0001\u0000\u0000\u0000\u0341\u0340\u0001\u0000"+
		"\u0000\u0000\u0342\u00bb\u0001\u0000\u0000\u0000\u0343\u0344\u0005\'\u0000"+
		"\u0000\u0344\u0345\u0003\u0084B\u0000\u0345\u0346\u0005\n\u0000\u0000"+
		"\u0346\u0347\u0003z=\u0000\u0347\u00bd\u0001\u0000\u0000\u0000\u0348\u0349"+
		"\u0005 \u0000\u0000\u0349\u034a\u0003\u00b0X\u0000\u034a\u034b\u0005%"+
		"\u0000\u0000\u034b\u034c\u0003\u0084B\u0000\u034c\u00bf\u0001\u0000\u0000"+
		"\u0000\u034d\u034e\u0005\u000f\u0000\u0000\u034e\u034f\u0003\u0004\u0002"+
		"\u0000\u034f\u0350\u0005-\u0000\u0000\u0350\u0351\u0003\u00c2a\u0000\u0351"+
		"\u0352\u0005\n\u0000\u0000\u0352\u0353\u0003z=\u0000\u0353\u00c1\u0001"+
		"\u0000\u0000\u0000\u0354\u0355\u0003\u00c4b\u0000\u0355\u0356\u0007\u0006"+
		"\u0000\u0000\u0356\u0357\u0003\u00c6c\u0000\u0357\u00c3\u0001\u0000\u0000"+
		"\u0000\u0358\u0359\u0003\u0084B\u0000\u0359\u00c5\u0001\u0000\u0000\u0000"+
		"\u035a\u035b\u0003\u0084B\u0000\u035b\u00c7\u0001\u0000\u0000\u0000\u035c"+
		"\u035d\u0005(\u0000\u0000\u035d\u035e\u0003\u00cae\u0000\u035e\u035f\u0005"+
		"\n\u0000\u0000\u035f\u0360\u0003z=\u0000\u0360\u00c9\u0001\u0000\u0000"+
		"\u0000\u0361\u0366\u0003\u0082A\u0000\u0362\u0363\u0005.\u0000\u0000\u0363"+
		"\u0365\u0003\u0082A\u0000\u0364\u0362\u0001\u0000\u0000\u0000\u0365\u0368"+
		"\u0001\u0000\u0000\u0000\u0366\u0364\u0001\u0000\u0000\u0000\u0366\u0367"+
		"\u0001\u0000\u0000\u0000\u0367\u00cb\u0001\u0000\u0000\u0000\u0368\u0366"+
		"\u0001\u0000\u0000\u0000H\u00ce\u00d7\u00d9\u00dd\u00e5\u00ed\u00f8\u00fa"+
		"\u010b\u0111\u011a\u0132\u013e\u014b\u0160\u0164\u0176\u017d\u0181\u0188"+
		"\u018d\u0193\u019f\u01a4\u01aa\u01b0\u01c2\u01c9\u01d2\u01d9\u01dc\u01e3"+
		"\u01f2\u01fa\u020c\u0217\u0225\u022a\u0235\u0241\u024c\u0254\u025a\u0268"+
		"\u026c\u0272\u027b\u0283\u028e\u0296\u0298\u029f\u02a7\u02af\u02b4\u02c3"+
		"\u02c9\u02d5\u02e0\u02e7\u02eb\u02f0\u02f7\u02fd\u030e\u0319\u031e\u0326"+
		"\u0330\u0336\u0341\u0366";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}