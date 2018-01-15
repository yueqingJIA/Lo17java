// $ANTLR 3.5.1 /volsme/users/lo17a013/Antlr/categorie_2.g 2017-11-23 10:53:37

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class categorie_2Lexer extends Lexer {
	public static final int EOF=-1;
	public static final int ARTICLE=4;
	public static final int AUTEUR=5;
	public static final int BETWEEN=6;
	public static final int DATE=7;
	public static final int DONT=8;
	public static final int ET=9;
	public static final int NOT=10;
	public static final int OU=11;
	public static final int POINT=12;
	public static final int RUBRIQUE=13;
	public static final int SELECT=14;
	public static final int TITRE=15;
	public static final int VAR=16;
	public static final int WHERE=17;
	public static final int WS=18;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public categorie_2Lexer() {} 
	public categorie_2Lexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public categorie_2Lexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/volsme/users/lo17a013/Antlr/categorie_2.g"; }

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a013/Antlr/categorie_2.g:2:8: ( 'vouloir' )
			// /volsme/users/lo17a013/Antlr/categorie_2.g:2:10: 'vouloir'
			{
			match("vouloir"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SELECT"

	// $ANTLR start "ARTICLE"
	public final void mARTICLE() throws RecognitionException {
		try {
			int _type = ARTICLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a013/Antlr/categorie_2.g:5:9: ( 'article' | 'liste article' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='a') ) {
				alt1=1;
			}
			else if ( (LA1_0=='l') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// /volsme/users/lo17a013/Antlr/categorie_2.g:5:11: 'article'
					{
					match("article"); 

					}
					break;
				case 2 :
					// /volsme/users/lo17a013/Antlr/categorie_2.g:5:23: 'liste article'
					{
					match("liste article"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARTICLE"

	// $ANTLR start "AUTEUR"
	public final void mAUTEUR() throws RecognitionException {
		try {
			int _type = AUTEUR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a013/Antlr/categorie_2.g:8:8: ( 'auteur' | 'contact' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='a') ) {
				alt2=1;
			}
			else if ( (LA2_0=='c') ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// /volsme/users/lo17a013/Antlr/categorie_2.g:8:10: 'auteur'
					{
					match("auteur"); 

					}
					break;
				case 2 :
					// /volsme/users/lo17a013/Antlr/categorie_2.g:8:21: 'contact'
					{
					match("contact"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AUTEUR"

	// $ANTLR start "DATE"
	public final void mDATE() throws RecognitionException {
		try {
			int _type = DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a013/Antlr/categorie_2.g:11:6: ( 'date' )
			// /volsme/users/lo17a013/Antlr/categorie_2.g:11:8: 'date'
			{
			match("date"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE"

	// $ANTLR start "TITRE"
	public final void mTITRE() throws RecognitionException {
		try {
			int _type = TITRE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a013/Antlr/categorie_2.g:14:8: ( 'titre' )
			// /volsme/users/lo17a013/Antlr/categorie_2.g:14:11: 'titre'
			{
			match("titre"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TITRE"

	// $ANTLR start "RUBRIQUE"
	public final void mRUBRIQUE() throws RecognitionException {
		try {
			int _type = RUBRIQUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a013/Antlr/categorie_2.g:17:10: ( 'rubrique' )
			// /volsme/users/lo17a013/Antlr/categorie_2.g:17:13: 'rubrique'
			{
			match("rubrique"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RUBRIQUE"

	// $ANTLR start "WHERE"
	public final void mWHERE() throws RecognitionException {
		try {
			int _type = WHERE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a013/Antlr/categorie_2.g:20:7: ( 'parler' )
			// /volsme/users/lo17a013/Antlr/categorie_2.g:20:10: 'parler'
			{
			match("parler"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHERE"

	// $ANTLR start "DONT"
	public final void mDONT() throws RecognitionException {
		try {
			int _type = DONT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a013/Antlr/categorie_2.g:23:6: ( 'dont' )
			// /volsme/users/lo17a013/Antlr/categorie_2.g:23:7: 'dont'
			{
			match("dont"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DONT"

	// $ANTLR start "POINT"
	public final void mPOINT() throws RecognitionException {
		try {
			int _type = POINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a013/Antlr/categorie_2.g:26:7: ( '.' | '?' )
			// /volsme/users/lo17a013/Antlr/categorie_2.g:
			{
			if ( input.LA(1)=='.'||input.LA(1)=='?' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POINT"

	// $ANTLR start "ET"
	public final void mET() throws RecognitionException {
		try {
			int _type = ET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a013/Antlr/categorie_2.g:29:3: ( 'et' )
			// /volsme/users/lo17a013/Antlr/categorie_2.g:29:5: 'et'
			{
			match("et"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ET"

	// $ANTLR start "OU"
	public final void mOU() throws RecognitionException {
		try {
			int _type = OU;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a013/Antlr/categorie_2.g:32:3: ( 'ou' )
			// /volsme/users/lo17a013/Antlr/categorie_2.g:32:5: 'ou'
			{
			match("ou"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OU"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a013/Antlr/categorie_2.g:35:5: ( 'non' )
			// /volsme/users/lo17a013/Antlr/categorie_2.g:35:7: 'non'
			{
			match("non"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "BETWEEN"
	public final void mBETWEEN() throws RecognitionException {
		try {
			int _type = BETWEEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a013/Antlr/categorie_2.g:38:9: ( 'entre' )
			// /volsme/users/lo17a013/Antlr/categorie_2.g:38:11: 'entre'
			{
			match("entre"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BETWEEN"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a013/Antlr/categorie_2.g:41:5: ( ( ' ' | '\\t' | '\\r' ) | '\\n' )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='\t'||LA3_0=='\r'||LA3_0==' ') ) {
				alt3=1;
			}
			else if ( (LA3_0=='\n') ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /volsme/users/lo17a013/Antlr/categorie_2.g:41:7: ( ' ' | '\\t' | '\\r' )
					{
					if ( input.LA(1)=='\t'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					skip();
					}
					break;
				case 2 :
					// /volsme/users/lo17a013/Antlr/categorie_2.g:41:39: '\\n'
					{
					match('\n'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a013/Antlr/categorie_2.g:43:5: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' )+ | ( '0' .. '9' | '/' )+ )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( ((LA6_0 >= 'A' && LA6_0 <= 'Z')||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
				alt6=1;
			}
			else if ( ((LA6_0 >= '/' && LA6_0 <= '9')) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// /volsme/users/lo17a013/Antlr/categorie_2.g:43:7: ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' )+
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// /volsme/users/lo17a013/Antlr/categorie_2.g:43:29: ( 'a' .. 'z' )+
					int cnt4=0;
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// /volsme/users/lo17a013/Antlr/categorie_2.g:
							{
							if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
					}

					}
					break;
				case 2 :
					// /volsme/users/lo17a013/Antlr/categorie_2.g:43:43: ( '0' .. '9' | '/' )+
					{
					// /volsme/users/lo17a013/Antlr/categorie_2.g:43:43: ( '0' .. '9' | '/' )+
					int cnt5=0;
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( ((LA5_0 >= '/' && LA5_0 <= '9')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// /volsme/users/lo17a013/Antlr/categorie_2.g:
							{
							if ( (input.LA(1) >= '/' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt5 >= 1 ) break loop5;
							EarlyExitException eee = new EarlyExitException(5, input);
							throw eee;
						}
						cnt5++;
					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	@Override
	public void mTokens() throws RecognitionException {
		// /volsme/users/lo17a013/Antlr/categorie_2.g:1:8: ( SELECT | ARTICLE | AUTEUR | DATE | TITRE | RUBRIQUE | WHERE | DONT | POINT | ET | OU | NOT | BETWEEN | WS | VAR )
		int alt7=15;
		alt7 = dfa7.predict(input);
		switch (alt7) {
			case 1 :
				// /volsme/users/lo17a013/Antlr/categorie_2.g:1:10: SELECT
				{
				mSELECT(); 

				}
				break;
			case 2 :
				// /volsme/users/lo17a013/Antlr/categorie_2.g:1:17: ARTICLE
				{
				mARTICLE(); 

				}
				break;
			case 3 :
				// /volsme/users/lo17a013/Antlr/categorie_2.g:1:25: AUTEUR
				{
				mAUTEUR(); 

				}
				break;
			case 4 :
				// /volsme/users/lo17a013/Antlr/categorie_2.g:1:32: DATE
				{
				mDATE(); 

				}
				break;
			case 5 :
				// /volsme/users/lo17a013/Antlr/categorie_2.g:1:37: TITRE
				{
				mTITRE(); 

				}
				break;
			case 6 :
				// /volsme/users/lo17a013/Antlr/categorie_2.g:1:43: RUBRIQUE
				{
				mRUBRIQUE(); 

				}
				break;
			case 7 :
				// /volsme/users/lo17a013/Antlr/categorie_2.g:1:52: WHERE
				{
				mWHERE(); 

				}
				break;
			case 8 :
				// /volsme/users/lo17a013/Antlr/categorie_2.g:1:58: DONT
				{
				mDONT(); 

				}
				break;
			case 9 :
				// /volsme/users/lo17a013/Antlr/categorie_2.g:1:63: POINT
				{
				mPOINT(); 

				}
				break;
			case 10 :
				// /volsme/users/lo17a013/Antlr/categorie_2.g:1:69: ET
				{
				mET(); 

				}
				break;
			case 11 :
				// /volsme/users/lo17a013/Antlr/categorie_2.g:1:72: OU
				{
				mOU(); 

				}
				break;
			case 12 :
				// /volsme/users/lo17a013/Antlr/categorie_2.g:1:75: NOT
				{
				mNOT(); 

				}
				break;
			case 13 :
				// /volsme/users/lo17a013/Antlr/categorie_2.g:1:79: BETWEEN
				{
				mBETWEEN(); 

				}
				break;
			case 14 :
				// /volsme/users/lo17a013/Antlr/categorie_2.g:1:87: WS
				{
				mWS(); 

				}
				break;
			case 15 :
				// /volsme/users/lo17a013/Antlr/categorie_2.g:1:90: VAR
				{
				mVAR(); 

				}
				break;

		}
	}


	protected DFA7 dfa7 = new DFA7(this);
	static final String DFA7_eotS =
		"\17\uffff\12\16\1\47\1\16\1\51\13\16\1\uffff\1\16\1\uffff\1\66\5\16\1"+
		"\74\1\75\4\16\1\uffff\5\16\2\uffff\1\107\2\16\1\112\2\16\1\115\1\uffff"+
		"\1\16\1\uffff\1\16\1\120\1\uffff\1\121\1\105\1\uffff\1\115\1\16\2\uffff"+
		"\1\123\1\uffff";
	static final String DFA7_eofS =
		"\124\uffff";
	static final String DFA7_minS =
		"\1\11\10\141\1\uffff\3\141\2\uffff\1\165\2\164\1\163\1\156\1\164\1\156"+
		"\1\164\1\142\1\162\1\141\1\164\1\141\1\156\1\154\1\151\1\145\2\164\1\145"+
		"\1\164\2\162\1\154\1\uffff\1\162\1\uffff\1\141\1\157\1\143\1\165\1\145"+
		"\3\141\1\145\1\151\2\145\1\uffff\1\151\1\154\1\162\1\40\1\143\2\uffff"+
		"\1\141\1\161\1\162\1\141\1\162\1\145\1\141\1\uffff\1\164\1\uffff\1\165"+
		"\1\141\1\uffff\2\141\1\uffff\1\141\1\145\2\uffff\1\141\1\uffff";
	static final String DFA7_maxS =
		"\11\172\1\uffff\3\172\2\uffff\1\165\2\164\1\163\1\156\1\164\1\156\1\164"+
		"\1\142\1\162\1\172\1\164\1\172\1\156\1\154\1\151\1\145\2\164\1\145\1\164"+
		"\2\162\1\154\1\uffff\1\162\1\uffff\1\172\1\157\1\143\1\165\1\145\1\141"+
		"\2\172\1\145\1\151\2\145\1\uffff\1\151\1\154\1\162\1\40\1\143\2\uffff"+
		"\1\172\1\161\1\162\1\172\1\162\1\145\1\172\1\uffff\1\164\1\uffff\1\165"+
		"\1\172\1\uffff\2\172\1\uffff\1\172\1\145\2\uffff\1\172\1\uffff";
	static final String DFA7_acceptS =
		"\11\uffff\1\11\3\uffff\1\16\1\17\30\uffff\1\12\1\uffff\1\13\14\uffff\1"+
		"\14\5\uffff\1\4\1\10\7\uffff\1\2\1\uffff\1\5\2\uffff\1\15\2\uffff\1\3"+
		"\2\uffff\1\7\1\1\1\uffff\1\6";
	static final String DFA7_specialS =
		"\124\uffff}>";
	static final String[] DFA7_transitionS = {
			"\2\15\2\uffff\1\15\22\uffff\1\15\15\uffff\1\11\13\16\5\uffff\1\11\1\uffff"+
			"\32\16\6\uffff\1\2\1\16\1\4\1\5\1\12\6\16\1\3\1\16\1\14\1\13\1\10\1\16"+
			"\1\7\1\16\1\6\1\16\1\1\4\16",
			"\16\16\1\17\13\16",
			"\21\16\1\20\2\16\1\21\5\16",
			"\10\16\1\22\21\16",
			"\16\16\1\23\13\16",
			"\1\24\15\16\1\25\13\16",
			"\10\16\1\26\21\16",
			"\24\16\1\27\5\16",
			"\1\30\31\16",
			"",
			"\15\16\1\32\5\16\1\31\6\16",
			"\24\16\1\33\5\16",
			"\16\16\1\34\13\16",
			"",
			"",
			"\1\35",
			"\1\36",
			"\1\37",
			"\1\40",
			"\1\41",
			"\1\42",
			"\1\43",
			"\1\44",
			"\1\45",
			"\1\46",
			"\32\16",
			"\1\50",
			"\32\16",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"",
			"\1\65",
			"",
			"\32\16",
			"\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\32\16",
			"\32\16",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"",
			"",
			"\32\16",
			"\1\110",
			"\1\111",
			"\32\16",
			"\1\113",
			"\1\114",
			"\32\16",
			"",
			"\1\116",
			"",
			"\1\117",
			"\32\16",
			"",
			"\32\16",
			"\32\16",
			"",
			"\32\16",
			"\1\122",
			"",
			"",
			"\32\16",
			""
	};

	static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
	static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
	static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
	static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
	static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
	static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
	static final short[][] DFA7_transition;

	static {
		int numStates = DFA7_transitionS.length;
		DFA7_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
		}
	}

	protected class DFA7 extends DFA {

		public DFA7(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 7;
			this.eot = DFA7_eot;
			this.eof = DFA7_eof;
			this.min = DFA7_min;
			this.max = DFA7_max;
			this.accept = DFA7_accept;
			this.special = DFA7_special;
			this.transition = DFA7_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( SELECT | ARTICLE | AUTEUR | DATE | TITRE | RUBRIQUE | WHERE | DONT | POINT | ET | OU | NOT | BETWEEN | WS | VAR );";
		}
	}

}
