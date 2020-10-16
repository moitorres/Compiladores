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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, NEWLINE=30, INT=31, 
		DIGIT=32, ID=33, LETTER=34, WS=35;
	public static final int
		RULE_prog = 0, RULE_expr = 1, RULE_assign = 2, RULE_goTo = 3, RULE_ifFalse = 4, 
		RULE_ifTrue = 5, RULE_array = 6, RULE_print = 7, RULE_operador = 8, RULE_operando = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "expr", "assign", "goTo", "ifFalse", "ifTrue", "array", "print", 
			"operador", "operando"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "':'", "'g'", "'o'", "'t'", "'i'", "'f'", "'F'", "'a'", 
			"'l'", "'s'", "'e'", "'T'", "'r'", "'u'", "'['", "']'", "'p'", "'n'", 
			"'('", "')'", "'*'", "'/'", "'+'", "'-'", "'<'", "'=='", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__17) | (1L << ID))) != 0)) {
				{
				{
				setState(20);
				expr();
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

	public static class ExprContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
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
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
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
				goTo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				ifFalse();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(31);
				ifTrue();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(32);
				array();
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
		enterRule(_localctx, 4, RULE_assign);
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				match(ID);
				setState(37);
				match(T__0);
				setState(38);
				operando();
				setState(39);
				operador();
				setState(40);
				operando();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				match(ID);
				setState(43);
				match(T__1);
				setState(44);
				match(ID);
				setState(45);
				match(T__0);
				setState(46);
				operando();
				setState(47);
				operador();
				setState(48);
				operando();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				match(ID);
				setState(51);
				match(T__0);
				setState(52);
				operando();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				match(ID);
				setState(54);
				match(T__1);
				setState(55);
				match(ID);
				setState(56);
				match(T__0);
				setState(57);
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
		enterRule(_localctx, 6, RULE_goTo);
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(T__2);
				setState(61);
				match(T__3);
				setState(62);
				match(T__4);
				setState(63);
				match(T__3);
				setState(64);
				match(ID);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(ID);
				setState(66);
				match(T__1);
				setState(67);
				match(T__2);
				setState(68);
				match(T__3);
				setState(69);
				match(T__4);
				setState(70);
				match(T__3);
				setState(71);
				match(ID);
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

	public static class IfFalseContext extends ParserRuleContext {
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
		enterRule(_localctx, 8, RULE_ifFalse);
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(T__5);
				setState(75);
				match(T__6);
				setState(76);
				match(T__7);
				setState(77);
				match(T__8);
				setState(78);
				match(T__9);
				setState(79);
				match(T__10);
				setState(80);
				match(T__11);
				setState(81);
				match(ID);
				setState(82);
				match(T__2);
				setState(83);
				match(T__3);
				setState(84);
				match(T__4);
				setState(85);
				match(T__3);
				setState(86);
				match(ID);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(ID);
				setState(88);
				match(T__1);
				setState(89);
				match(T__5);
				setState(90);
				match(T__6);
				setState(91);
				match(T__7);
				setState(92);
				match(T__8);
				setState(93);
				match(T__9);
				setState(94);
				match(T__10);
				setState(95);
				match(T__11);
				setState(96);
				match(ID);
				setState(97);
				match(T__2);
				setState(98);
				match(T__3);
				setState(99);
				match(T__4);
				setState(100);
				match(T__3);
				setState(101);
				match(ID);
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

	public static class IfTrueContext extends ParserRuleContext {
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
		enterRule(_localctx, 10, RULE_ifTrue);
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(T__5);
				setState(105);
				match(T__6);
				setState(106);
				match(T__12);
				setState(107);
				match(T__13);
				setState(108);
				match(T__14);
				setState(109);
				match(T__11);
				setState(110);
				match(ID);
				setState(111);
				match(T__2);
				setState(112);
				match(T__3);
				setState(113);
				match(T__4);
				setState(114);
				match(T__3);
				setState(115);
				match(ID);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(ID);
				setState(117);
				match(T__1);
				setState(118);
				match(T__5);
				setState(119);
				match(T__6);
				setState(120);
				match(T__12);
				setState(121);
				match(T__13);
				setState(122);
				match(T__14);
				setState(123);
				match(T__11);
				setState(124);
				match(ID);
				setState(125);
				match(T__2);
				setState(126);
				match(T__3);
				setState(127);
				match(T__4);
				setState(128);
				match(T__3);
				setState(129);
				match(ID);
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

	public static class ArrayContext extends ParserRuleContext {
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
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TACListener ) ((TACListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_array);
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(ID);
				setState(133);
				match(T__15);
				setState(134);
				operando();
				setState(135);
				match(T__16);
				setState(136);
				match(T__0);
				setState(137);
				operando();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(ID);
				setState(140);
				match(T__1);
				setState(141);
				match(ID);
				setState(142);
				match(T__15);
				setState(143);
				operando();
				setState(144);
				match(T__16);
				setState(145);
				match(T__0);
				setState(146);
				operando();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				match(ID);
				setState(149);
				match(T__0);
				setState(150);
				match(ID);
				setState(151);
				match(T__15);
				setState(152);
				operando();
				setState(153);
				match(T__16);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				match(ID);
				setState(156);
				match(T__1);
				setState(157);
				match(ID);
				setState(158);
				match(T__0);
				setState(159);
				match(ID);
				setState(160);
				match(T__15);
				setState(161);
				operando();
				setState(162);
				match(T__16);
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

	public static class PrintContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(TACParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TACParser.ID, i);
		}
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
		enterRule(_localctx, 14, RULE_print);
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(T__17);
				setState(167);
				match(T__13);
				setState(168);
				match(T__5);
				setState(169);
				match(T__18);
				setState(170);
				match(T__4);
				setState(171);
				match(T__19);
				setState(172);
				match(ID);
				setState(173);
				match(T__20);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(ID);
				setState(175);
				match(T__1);
				setState(176);
				match(T__17);
				setState(177);
				match(T__13);
				setState(178);
				match(T__5);
				setState(179);
				match(T__18);
				setState(180);
				match(T__4);
				setState(181);
				match(T__19);
				setState(182);
				match(ID);
				setState(183);
				match(T__20);
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
		enterRule(_localctx, 16, RULE_operador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) ) {
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
		enterRule(_localctx, 18, RULE_operando);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00c1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3%\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4=\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5K\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"i\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0085\n\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a7\n\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00bb\n"+
		"\t\3\n\3\n\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\4\3\2\30\37"+
		"\4\2!!##\2\u00c6\2\33\3\2\2\2\4$\3\2\2\2\6<\3\2\2\2\bJ\3\2\2\2\nh\3\2"+
		"\2\2\f\u0084\3\2\2\2\16\u00a6\3\2\2\2\20\u00ba\3\2\2\2\22\u00bc\3\2\2"+
		"\2\24\u00be\3\2\2\2\26\27\5\4\3\2\27\30\7 \2\2\30\32\3\2\2\2\31\26\3\2"+
		"\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\3\3\2\2\2\35\33\3\2"+
		"\2\2\36%\5\6\4\2\37%\5\b\5\2 %\5\n\6\2!%\5\f\7\2\"%\5\16\b\2#%\5\20\t"+
		"\2$\36\3\2\2\2$\37\3\2\2\2$ \3\2\2\2$!\3\2\2\2$\"\3\2\2\2$#\3\2\2\2%\5"+
		"\3\2\2\2&\'\7#\2\2\'(\7\3\2\2()\5\24\13\2)*\5\22\n\2*+\5\24\13\2+=\3\2"+
		"\2\2,-\7#\2\2-.\7\4\2\2./\7#\2\2/\60\7\3\2\2\60\61\5\24\13\2\61\62\5\22"+
		"\n\2\62\63\5\24\13\2\63=\3\2\2\2\64\65\7#\2\2\65\66\7\3\2\2\66=\5\24\13"+
		"\2\678\7#\2\289\7\4\2\29:\7#\2\2:;\7\3\2\2;=\5\24\13\2<&\3\2\2\2<,\3\2"+
		"\2\2<\64\3\2\2\2<\67\3\2\2\2=\7\3\2\2\2>?\7\5\2\2?@\7\6\2\2@A\7\7\2\2"+
		"AB\7\6\2\2BK\7#\2\2CD\7#\2\2DE\7\4\2\2EF\7\5\2\2FG\7\6\2\2GH\7\7\2\2H"+
		"I\7\6\2\2IK\7#\2\2J>\3\2\2\2JC\3\2\2\2K\t\3\2\2\2LM\7\b\2\2MN\7\t\2\2"+
		"NO\7\n\2\2OP\7\13\2\2PQ\7\f\2\2QR\7\r\2\2RS\7\16\2\2ST\7#\2\2TU\7\5\2"+
		"\2UV\7\6\2\2VW\7\7\2\2WX\7\6\2\2Xi\7#\2\2YZ\7#\2\2Z[\7\4\2\2[\\\7\b\2"+
		"\2\\]\7\t\2\2]^\7\n\2\2^_\7\13\2\2_`\7\f\2\2`a\7\r\2\2ab\7\16\2\2bc\7"+
		"#\2\2cd\7\5\2\2de\7\6\2\2ef\7\7\2\2fg\7\6\2\2gi\7#\2\2hL\3\2\2\2hY\3\2"+
		"\2\2i\13\3\2\2\2jk\7\b\2\2kl\7\t\2\2lm\7\17\2\2mn\7\20\2\2no\7\21\2\2"+
		"op\7\16\2\2pq\7#\2\2qr\7\5\2\2rs\7\6\2\2st\7\7\2\2tu\7\6\2\2u\u0085\7"+
		"#\2\2vw\7#\2\2wx\7\4\2\2xy\7\b\2\2yz\7\t\2\2z{\7\17\2\2{|\7\20\2\2|}\7"+
		"\21\2\2}~\7\16\2\2~\177\7#\2\2\177\u0080\7\5\2\2\u0080\u0081\7\6\2\2\u0081"+
		"\u0082\7\7\2\2\u0082\u0083\7\6\2\2\u0083\u0085\7#\2\2\u0084j\3\2\2\2\u0084"+
		"v\3\2\2\2\u0085\r\3\2\2\2\u0086\u0087\7#\2\2\u0087\u0088\7\22\2\2\u0088"+
		"\u0089\5\24\13\2\u0089\u008a\7\23\2\2\u008a\u008b\7\3\2\2\u008b\u008c"+
		"\5\24\13\2\u008c\u00a7\3\2\2\2\u008d\u008e\7#\2\2\u008e\u008f\7\4\2\2"+
		"\u008f\u0090\7#\2\2\u0090\u0091\7\22\2\2\u0091\u0092\5\24\13\2\u0092\u0093"+
		"\7\23\2\2\u0093\u0094\7\3\2\2\u0094\u0095\5\24\13\2\u0095\u00a7\3\2\2"+
		"\2\u0096\u0097\7#\2\2\u0097\u0098\7\3\2\2\u0098\u0099\7#\2\2\u0099\u009a"+
		"\7\22\2\2\u009a\u009b\5\24\13\2\u009b\u009c\7\23\2\2\u009c\u00a7\3\2\2"+
		"\2\u009d\u009e\7#\2\2\u009e\u009f\7\4\2\2\u009f\u00a0\7#\2\2\u00a0\u00a1"+
		"\7\3\2\2\u00a1\u00a2\7#\2\2\u00a2\u00a3\7\22\2\2\u00a3\u00a4\5\24\13\2"+
		"\u00a4\u00a5\7\23\2\2\u00a5\u00a7\3\2\2\2\u00a6\u0086\3\2\2\2\u00a6\u008d"+
		"\3\2\2\2\u00a6\u0096\3\2\2\2\u00a6\u009d\3\2\2\2\u00a7\17\3\2\2\2\u00a8"+
		"\u00a9\7\24\2\2\u00a9\u00aa\7\20\2\2\u00aa\u00ab\7\b\2\2\u00ab\u00ac\7"+
		"\25\2\2\u00ac\u00ad\7\7\2\2\u00ad\u00ae\7\26\2\2\u00ae\u00af\7#\2\2\u00af"+
		"\u00bb\7\27\2\2\u00b0\u00b1\7#\2\2\u00b1\u00b2\7\4\2\2\u00b2\u00b3\7\24"+
		"\2\2\u00b3\u00b4\7\20\2\2\u00b4\u00b5\7\b\2\2\u00b5\u00b6\7\25\2\2\u00b6"+
		"\u00b7\7\7\2\2\u00b7\u00b8\7\26\2\2\u00b8\u00b9\7#\2\2\u00b9\u00bb\7\27"+
		"\2\2\u00ba\u00a8\3\2\2\2\u00ba\u00b0\3\2\2\2\u00bb\21\3\2\2\2\u00bc\u00bd"+
		"\t\2\2\2\u00bd\23\3\2\2\2\u00be\u00bf\t\3\2\2\u00bf\25\3\2\2\2\n\33$<"+
		"Jh\u0084\u00a6\u00ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}