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
		NEWLINE=18, INT=19, DIGIT=20, ID=21, LETTER=22, WS=23;
	public static final int
		RULE_prog = 0, RULE_statement = 1, RULE_operando = 2, RULE_assign = 3, 
		RULE_assignArray = 4, RULE_goTo = 5, RULE_ifFalse = 6, RULE_ifTrue = 7, 
		RULE_print = 8, RULE_operador = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "statement", "operando", "assign", "assignArray", "goTo", "ifFalse", 
			"ifTrue", "print", "operador"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'='", "'['", "']'", "'goto'", "'ifFalse'", "'ifTrue'", 
			"'print('", "')'", "'+'", "'-'", "'*'", "'/'", "'<'", "'=='", "'&&'", 
			"'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "NEWLINE", "INT", "DIGIT", "ID", 
			"LETTER", "WS"
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
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << ID))) != 0)) {
				{
				{
				setState(20);
				statement();
				setState(21);
				match(NEWLINE);
				}
				}
				setState(27);
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
		public IfTrueContext ifTrue() {
			return getRuleContext(IfTrueContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
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
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				assignArray();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				goTo();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(31);
				ifFalse();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(32);
				ifTrue();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(33);
				print();
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
			setState(36);
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
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(38);
					match(ID);
					setState(39);
					match(T__0);
					}
					break;
				}
				setState(42);
				match(ID);
				setState(43);
				match(T__1);
				setState(44);
				operando();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(45);
					match(ID);
					setState(46);
					match(T__0);
					}
					break;
				}
				setState(49);
				match(ID);
				setState(50);
				match(T__1);
				setState(51);
				operando();
				setState(52);
				operador();
				setState(53);
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
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(57);
					match(ID);
					setState(58);
					match(T__0);
					}
					break;
				}
				setState(61);
				match(ID);
				setState(62);
				match(T__2);
				setState(63);
				operando();
				setState(64);
				match(T__3);
				setState(65);
				match(T__1);
				setState(66);
				operando();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(68);
					match(ID);
					setState(69);
					match(T__0);
					}
					break;
				}
				setState(72);
				match(ID);
				setState(73);
				match(T__1);
				setState(74);
				match(ID);
				setState(75);
				match(T__2);
				setState(76);
				operando();
				setState(77);
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
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(81);
				match(ID);
				setState(82);
				match(T__0);
				}
			}

			setState(85);
			match(T__4);
			setState(86);
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
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(88);
				match(ID);
				setState(89);
				match(T__0);
				}
			}

			setState(92);
			match(T__5);
			setState(93);
			operando();
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
		enterRule(_localctx, 14, RULE_ifTrue);
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
			match(T__6);
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
		enterRule(_localctx, 16, RULE_print);
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
			match(T__7);
			setState(111);
			operando();
			setState(112);
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
		enterRule(_localctx, 18, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31w\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3%\n"+
		"\3\3\4\3\4\3\5\3\5\5\5+\n\5\3\5\3\5\3\5\3\5\3\5\5\5\62\n\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\5:\n\5\3\6\3\6\5\6>\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6I\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6R\n\6\3\7\3\7\5\7V\n\7\3"+
		"\7\3\7\3\7\3\b\3\b\5\b]\n\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\5\tf\n\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\5\no\n\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\2\2\f\2"+
		"\4\6\b\n\f\16\20\22\24\2\4\4\2\25\25\27\27\3\2\f\23\2|\2\33\3\2\2\2\4"+
		"$\3\2\2\2\6&\3\2\2\2\b9\3\2\2\2\nQ\3\2\2\2\fU\3\2\2\2\16\\\3\2\2\2\20"+
		"e\3\2\2\2\22n\3\2\2\2\24t\3\2\2\2\26\27\5\4\3\2\27\30\7\24\2\2\30\32\3"+
		"\2\2\2\31\26\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\3\3"+
		"\2\2\2\35\33\3\2\2\2\36%\5\b\5\2\37%\5\n\6\2 %\5\f\7\2!%\5\16\b\2\"%\5"+
		"\20\t\2#%\5\22\n\2$\36\3\2\2\2$\37\3\2\2\2$ \3\2\2\2$!\3\2\2\2$\"\3\2"+
		"\2\2$#\3\2\2\2%\5\3\2\2\2&\'\t\2\2\2\'\7\3\2\2\2()\7\27\2\2)+\7\3\2\2"+
		"*(\3\2\2\2*+\3\2\2\2+,\3\2\2\2,-\7\27\2\2-.\7\4\2\2.:\5\6\4\2/\60\7\27"+
		"\2\2\60\62\7\3\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\64\7\27"+
		"\2\2\64\65\7\4\2\2\65\66\5\6\4\2\66\67\5\24\13\2\678\5\6\4\28:\3\2\2\2"+
		"9*\3\2\2\29\61\3\2\2\2:\t\3\2\2\2;<\7\27\2\2<>\7\3\2\2=;\3\2\2\2=>\3\2"+
		"\2\2>?\3\2\2\2?@\7\27\2\2@A\7\5\2\2AB\5\6\4\2BC\7\6\2\2CD\7\4\2\2DE\5"+
		"\6\4\2ER\3\2\2\2FG\7\27\2\2GI\7\3\2\2HF\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK"+
		"\7\27\2\2KL\7\4\2\2LM\7\27\2\2MN\7\5\2\2NO\5\6\4\2OP\7\6\2\2PR\3\2\2\2"+
		"Q=\3\2\2\2QH\3\2\2\2R\13\3\2\2\2ST\7\27\2\2TV\7\3\2\2US\3\2\2\2UV\3\2"+
		"\2\2VW\3\2\2\2WX\7\7\2\2XY\7\27\2\2Y\r\3\2\2\2Z[\7\27\2\2[]\7\3\2\2\\"+
		"Z\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\7\b\2\2_`\5\6\4\2`a\7\7\2\2ab\7\27\2"+
		"\2b\17\3\2\2\2cd\7\27\2\2df\7\3\2\2ec\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\7"+
		"\t\2\2hi\5\6\4\2ij\7\7\2\2jk\7\27\2\2k\21\3\2\2\2lm\7\27\2\2mo\7\3\2\2"+
		"nl\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7\n\2\2qr\5\6\4\2rs\7\13\2\2s\23\3\2"+
		"\2\2tu\t\3\2\2u\25\3\2\2\2\16\33$*\619=HQU\\en";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}