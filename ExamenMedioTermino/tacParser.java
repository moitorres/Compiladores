// Generated from C:/Users/Moisés Uriel Torres/Desktop/Compiladores/src\TAC.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TACParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, NEWLINE=19, INT=20, DIGIT=21, ID=22, LETTER=23, WS=24;
	public static final int
		RULE_prog = 0, RULE_statement = 1, RULE_operando = 2, RULE_assign = 3, 
		RULE_assignArray = 4, RULE_goTo = 5, RULE_ifFalse = 6, RULE_ifFalseArray = 7, 
		RULE_ifTrue = 8, RULE_ifTrueArray = 9, RULE_print = 10, RULE_printArray = 11, 
		RULE_operador = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "statement", "operando", "assign", "assignArray", "goTo", "ifFalse", 
			"ifFalseArray", "ifTrue", "ifTrueArray", "print", "printArray", "operador"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'='", "'['", "']'", "'goto'", "'ifFalse'", "'ifTrue'", 
			"'print('", "')'", "'])'", "'+'", "'-'", "'*'", "'/'", "'<'", "'=='", 
			"'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "NEWLINE", "INT", "DIGIT", 
			"ID", "LETTER", "WS"
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
	public String getGrammarFileName() { return "TAC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TACParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(TACParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(TACParser.NEWLINE, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << ID))) != 0)) {
				{
				{
				setState(26);
				statement();
				setState(27);
				match(NEWLINE);
				}
				}
				setState(33);
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

	public static class StatementContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public AssignArrayContext assignArray() {
			return getRuleContext(AssignArrayContext.class,0);
		}
		public GoToContext goTo() {
			return getRuleContext(GoToContext.class,0);
		}
		public IfFalseContext ifFalse() {
			return getRuleContext(IfFalseContext.class,0);
		}
		public IfFalseArrayContext ifFalseArray() {
			return getRuleContext(IfFalseArrayContext.class,0);
		}
		public IfTrueContext ifTrue() {
			return getRuleContext(IfTrueContext.class,0);
		}
		public IfTrueArrayContext ifTrueArray() {
			return getRuleContext(IfTrueArrayContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public PrintArrayContext printArray() {
			return getRuleContext(PrintArrayContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				assignArray();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				goTo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(37);
				ifFalse();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(38);
				ifFalseArray();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(39);
				ifTrue();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(40);
				ifTrueArray();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(41);
				print();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(42);
				printArray();
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

	public static class OperandoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TACParser.ID, 0); }
		public TerminalNode INT() { return getToken(TACParser.INT, 0); }
		public OperandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).enterOperando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).exitOperando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitOperando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandoContext operando() throws RecognitionException {
		OperandoContext _localctx = new OperandoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_operando);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==ID) ) {
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

	public static class AssignContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(TACParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TACParser.ID, i);
		}
		public List<OperandoContext> operando() {
			return getRuleContexts(OperandoContext.class);
		}
		public OperandoContext operando(int i) {
			return getRuleContext(OperandoContext.class,i);
		}
		public OperadorContext operador() {
			return getRuleContext(OperadorContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assign);
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(47);
					match(ID);
					setState(48);
					match(T__0);
					}
					break;
				}
				setState(51);
				match(ID);
				setState(52);
				match(T__1);
				setState(53);
				operando();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(54);
					match(ID);
					setState(55);
					match(T__0);
					}
					break;
				}
				setState(58);
				match(ID);
				setState(59);
				match(T__1);
				setState(60);
				operando();
				setState(61);
				operador();
				setState(62);
				operando();
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

	public static class AssignArrayContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(TACParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TACParser.ID, i);
		}
		public List<OperandoContext> operando() {
			return getRuleContexts(OperandoContext.class);
		}
		public OperandoContext operando(int i) {
			return getRuleContext(OperandoContext.class,i);
		}
		public AssignArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).enterAssignArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).exitAssignArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitAssignArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignArrayContext assignArray() throws RecognitionException {
		AssignArrayContext _localctx = new AssignArrayContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignArray);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(66);
					match(ID);
					setState(67);
					match(T__0);
					}
					break;
				}
				setState(70);
				match(ID);
				setState(71);
				match(T__2);
				setState(72);
				operando();
				setState(73);
				match(T__3);
				setState(74);
				match(T__1);
				setState(75);
				operando();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(77);
					match(ID);
					setState(78);
					match(T__0);
					}
					break;
				}
				setState(81);
				match(ID);
				setState(82);
				match(T__1);
				setState(83);
				match(ID);
				setState(84);
				match(T__2);
				setState(85);
				operando();
				setState(86);
				match(T__3);
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

	public static class GoToContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(TACParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TACParser.ID, i);
		}
		public GoToContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goTo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).enterGoTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).exitGoTo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitGoTo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoToContext goTo() throws RecognitionException {
		GoToContext _localctx = new GoToContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_goTo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(90);
				match(ID);
				setState(91);
				match(T__0);
				}
			}

			setState(94);
			match(T__4);
			setState(95);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfFalseContext extends ParserRuleContext {
		public OperandoContext operando() {
			return getRuleContext(OperandoContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(TACParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TACParser.ID, i);
		}
		public IfFalseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifFalse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).enterIfFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).exitIfFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitIfFalse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfFalseContext ifFalse() throws RecognitionException {
		IfFalseContext _localctx = new IfFalseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifFalse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(97);
				match(ID);
				setState(98);
				match(T__0);
				}
			}

			setState(101);
			match(T__5);
			setState(102);
			operando();
			setState(103);
			match(T__4);
			setState(104);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfFalseArrayContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(TACParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TACParser.ID, i);
		}
		public OperandoContext operando() {
			return getRuleContext(OperandoContext.class,0);
		}
		public IfFalseArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifFalseArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).enterIfFalseArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).exitIfFalseArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitIfFalseArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfFalseArrayContext ifFalseArray() throws RecognitionException {
		IfFalseArrayContext _localctx = new IfFalseArrayContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifFalseArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(106);
				match(ID);
				setState(107);
				match(T__0);
				}
			}

			setState(110);
			match(T__5);
			setState(111);
			match(ID);
			setState(112);
			match(T__2);
			setState(113);
			operando();
			setState(114);
			match(T__3);
			setState(115);
			match(T__4);
			setState(116);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfTrueContext extends ParserRuleContext {
		public OperandoContext operando() {
			return getRuleContext(OperandoContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(TACParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TACParser.ID, i);
		}
		public IfTrueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifTrue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).enterIfTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).exitIfTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitIfTrue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfTrueContext ifTrue() throws RecognitionException {
		IfTrueContext _localctx = new IfTrueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifTrue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(118);
				match(ID);
				setState(119);
				match(T__0);
				}
			}

			setState(122);
			match(T__6);
			setState(123);
			operando();
			setState(124);
			match(T__4);
			setState(125);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfTrueArrayContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(TACParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TACParser.ID, i);
		}
		public OperandoContext operando() {
			return getRuleContext(OperandoContext.class,0);
		}
		public IfTrueArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifTrueArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).enterIfTrueArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).exitIfTrueArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitIfTrueArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfTrueArrayContext ifTrueArray() throws RecognitionException {
		IfTrueArrayContext _localctx = new IfTrueArrayContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifTrueArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(127);
				match(ID);
				setState(128);
				match(T__0);
				}
			}

			setState(131);
			match(T__6);
			setState(132);
			match(ID);
			setState(133);
			match(T__2);
			setState(134);
			operando();
			setState(135);
			match(T__3);
			setState(136);
			match(T__4);
			setState(137);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public OperandoContext operando() {
			return getRuleContext(OperandoContext.class,0);
		}
		public TerminalNode ID() { return getToken(TACParser.ID, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(139);
				match(ID);
				setState(140);
				match(T__0);
				}
			}

			setState(143);
			match(T__7);
			setState(144);
			operando();
			setState(145);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintArrayContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(TACParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TACParser.ID, i);
		}
		public OperandoContext operando() {
			return getRuleContext(OperandoContext.class,0);
		}
		public PrintArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).enterPrintArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).exitPrintArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitPrintArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintArrayContext printArray() throws RecognitionException {
		PrintArrayContext _localctx = new PrintArrayContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_printArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(147);
				match(ID);
				setState(148);
				match(T__0);
				}
			}

			setState(151);
			match(T__7);
			setState(152);
			match(ID);
			setState(153);
			match(T__2);
			setState(154);
			operando();
			setState(155);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperadorContext extends ParserRuleContext {
		public OperadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).enterOperador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).exitOperador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitOperador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorContext operador() throws RecognitionException {
		OperadorContext _localctx = new OperadorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u00a2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\7\2 \n\2\f\2\16\2#\13\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\4\3\4\3\5\3\5\5\5\64\n\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5;\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5C\n\5\3\6\3\6"+
		"\5\6G\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6R\n\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6[\n\6\3\7\3\7\5\7_\n\7\3\7\3\7\3\7\3\b\3\b\5\bf\n\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\5\to\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\5\n{\n\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\5\13\u0084\n\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\5\f\u0090\n\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\5\r\u0098\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\2\2\17\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\2\4\4\2\26\26\30\30\3\2\r\24\2\u00aa\2!"+
		"\3\2\2\2\4-\3\2\2\2\6/\3\2\2\2\bB\3\2\2\2\nZ\3\2\2\2\f^\3\2\2\2\16e\3"+
		"\2\2\2\20n\3\2\2\2\22z\3\2\2\2\24\u0083\3\2\2\2\26\u008f\3\2\2\2\30\u0097"+
		"\3\2\2\2\32\u009f\3\2\2\2\34\35\5\4\3\2\35\36\7\25\2\2\36 \3\2\2\2\37"+
		"\34\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\3\3\2\2\2#!\3\2\2\2$.\5"+
		"\b\5\2%.\5\n\6\2&.\5\f\7\2\'.\5\16\b\2(.\5\20\t\2).\5\22\n\2*.\5\24\13"+
		"\2+.\5\26\f\2,.\5\30\r\2-$\3\2\2\2-%\3\2\2\2-&\3\2\2\2-\'\3\2\2\2-(\3"+
		"\2\2\2-)\3\2\2\2-*\3\2\2\2-+\3\2\2\2-,\3\2\2\2.\5\3\2\2\2/\60\t\2\2\2"+
		"\60\7\3\2\2\2\61\62\7\30\2\2\62\64\7\3\2\2\63\61\3\2\2\2\63\64\3\2\2\2"+
		"\64\65\3\2\2\2\65\66\7\30\2\2\66\67\7\4\2\2\67C\5\6\4\289\7\30\2\29;\7"+
		"\3\2\2:8\3\2\2\2:;\3\2\2\2;<\3\2\2\2<=\7\30\2\2=>\7\4\2\2>?\5\6\4\2?@"+
		"\5\32\16\2@A\5\6\4\2AC\3\2\2\2B\63\3\2\2\2B:\3\2\2\2C\t\3\2\2\2DE\7\30"+
		"\2\2EG\7\3\2\2FD\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\7\30\2\2IJ\7\5\2\2JK\5"+
		"\6\4\2KL\7\6\2\2LM\7\4\2\2MN\5\6\4\2N[\3\2\2\2OP\7\30\2\2PR\7\3\2\2QO"+
		"\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\7\30\2\2TU\7\4\2\2UV\7\30\2\2VW\7\5\2\2"+
		"WX\5\6\4\2XY\7\6\2\2Y[\3\2\2\2ZF\3\2\2\2ZQ\3\2\2\2[\13\3\2\2\2\\]\7\30"+
		"\2\2]_\7\3\2\2^\\\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\7\7\2\2ab\7\30\2\2b\r"+
		"\3\2\2\2cd\7\30\2\2df\7\3\2\2ec\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\7\b\2\2"+
		"hi\5\6\4\2ij\7\7\2\2jk\7\30\2\2k\17\3\2\2\2lm\7\30\2\2mo\7\3\2\2nl\3\2"+
		"\2\2no\3\2\2\2op\3\2\2\2pq\7\b\2\2qr\7\30\2\2rs\7\5\2\2st\5\6\4\2tu\7"+
		"\6\2\2uv\7\7\2\2vw\7\30\2\2w\21\3\2\2\2xy\7\30\2\2y{\7\3\2\2zx\3\2\2\2"+
		"z{\3\2\2\2{|\3\2\2\2|}\7\t\2\2}~\5\6\4\2~\177\7\7\2\2\177\u0080\7\30\2"+
		"\2\u0080\23\3\2\2\2\u0081\u0082\7\30\2\2\u0082\u0084\7\3\2\2\u0083\u0081"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\7\t\2\2\u0086"+
		"\u0087\7\30\2\2\u0087\u0088\7\5\2\2\u0088\u0089\5\6\4\2\u0089\u008a\7"+
		"\6\2\2\u008a\u008b\7\7\2\2\u008b\u008c\7\30\2\2\u008c\25\3\2\2\2\u008d"+
		"\u008e\7\30\2\2\u008e\u0090\7\3\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3"+
		"\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\7\n\2\2\u0092\u0093\5\6\4\2\u0093"+
		"\u0094\7\13\2\2\u0094\27\3\2\2\2\u0095\u0096\7\30\2\2\u0096\u0098\7\3"+
		"\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009a\7\n\2\2\u009a\u009b\7\30\2\2\u009b\u009c\7\5\2\2\u009c\u009d\5"+
		"\6\4\2\u009d\u009e\7\f\2\2\u009e\31\3\2\2\2\u009f\u00a0\t\3\2\2\u00a0"+
		"\33\3\2\2\2\21!-\63:BFQZ^enz\u0083\u008f\u0097";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}