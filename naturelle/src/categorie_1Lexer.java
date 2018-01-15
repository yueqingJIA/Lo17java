// $ANTLR 3.5.1 /volsme/users/lo17a013/Antlr/categorie_1.g 2017-11-30 13:27:27

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class categorie_1Lexer extends Lexer {
	public static final int EOF=-1;
	public static final int APRES=4;
	public static final int ARTICLE=5;
	public static final int AUTEUR=6;
	public static final int AVANT=7;
	public static final int BETWEEN=8;
	public static final int COUNT=9;
	public static final int DATE=10;
	public static final int DEPUIS=11;
	public static final int DONT=12;
	public static final int EN=13;
	public static final int ET=14;
	public static final int NOT=15;
	public static final int OU=16;
	public static final int POINT=17;
	public static final int RUBRIQUE=18;
	public static final int SELECT=19;
	public static final int TITRE=20;
	public static final int VAR=21;
	public static final int WHERE=22;
	public static final int WS=23;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public categorie_1Lexer() {} 
	public categorie_1Lexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public categorie_1Lexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/volsme/users/lo17a013/Antlr/categorie_1.g"; }

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a013/Antlr/categorie_1.g:2:8: ( 'vouloir' )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:2:10: 'vouloir'
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
			// /volsme/users/lo17a013/Antlr/categorie_1.g:5:9: ( 'article' | 'liste article' )
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
					// /volsme/users/lo17a013/Antlr/categorie_1.g:5:11: 'article'
					{
					match("article"); 

					}
					break;
				case 2 :
					// /volsme/users/lo17a013/Antlr/categorie_1.g:5:23: 'liste article'
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
			// /volsme/users/lo17a013/Antlr/categorie_1.g:8:8: ( 'auteur' | 'contact' )
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
					// /volsme/users/lo17a013/Antlr/categorie_1.g:8:10: 'auteur'
					{
					match("auteur"); 

					}
					break;
				case 2 :
					// /volsme/users/lo17a013/Antlr/categorie_1.g:8:21: 'contact'
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
			// /volsme/users/lo17a013/Antlr/categorie_1.g:11:6: ( 'date' )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:11:8: 'date'
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
			// /volsme/users/lo17a013/Antlr/categorie_1.g:14:8: ( 'titre' )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:14:11: 'titre'
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
			// /volsme/users/lo17a013/Antlr/categorie_1.g:17:10: ( 'rubrique' )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:17:13: 'rubrique'
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

	// $ANTLR start "DONT"
	public final void mDONT() throws RecognitionException {
		try {
			int _type = DONT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a013/Antlr/categorie_1.g:20:5: ( 'dont' )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:20:7: 'dont'
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

	// $ANTLR start "WHERE"
	public final void mWHERE() throws RecognitionException {
		try {
			int _type = WHERE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a013/Antlr/categorie_1.g:23:7: ( 'parler' )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:23:10: 'parler'
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

	// $ANTLR start "COUNT"
	public final void mCOUNT() throws RecognitionException {
		try {
			int _type = COUNT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a013/Antlr/categorie_1.g:26:6: ( 'nombre article' )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:26:8: 'nombre article'
			{
			match("nombre article"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COUNT"

	// $ANTLR start "EN"
	public final void mEN() throws RecognitionException {
		try {
			int _type = EN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a013/Antlr/categorie_1.g:29:3: ( 'en' )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:29:4: 'en'
			{
			match("en"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EN"

	// $ANTLR start "POINT"
	public final void mPOINT() throws RecognitionException {
		try {
			int _type = POINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a013/Antlr/categorie_1.g:32:7: ( '.' | '?' )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:
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
			// /volsme/users/lo17a013/Antlr/categorie_1.g:35:4: ( 'et' )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:35:6: 'et'
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
			// /volsme/users/lo17a013/Antlr/categorie_1.g:38:3: ( 'ou' )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:38:5: 'ou'
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
			// /volsme/users/lo17a013/Antlr/categorie_1.g:41:5: ( 'non' )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:41:7: 'non'
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
			// /volsme/users/lo17a013/Antlr/categorie_1.g:44:9: ( 'entre' )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:44:11: 'entre'
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

	// $ANTLR start "AVANT"
	public final void mAVANT() throws RecognitionException {
		try {
			int _type = AVANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a013/Antlr/categorie_1.g:47:7: ( 'avant' )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:47:8: 'avant'
			{
			match("avant"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AVANT"

	// $ANTLR start "APRES"
	public final void mAPRES() throws RecognitionException {
		try {
			int _type = APRES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a013/Antlr/categorie_1.g:50:7: ( 'après' )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:50:8: 'après'
			{
			match("après"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "APRES"

	// $ANTLR start "DEPUIS"
	public final void mDEPUIS() throws RecognitionException {
		try {
			int _type = DEPUIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a013/Antlr/categorie_1.g:53:8: ( 'depuis' )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:53:9: 'depuis'
			{
			match("depuis"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEPUIS"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /volsme/users/lo17a013/Antlr/categorie_1.g:56:5: ( ( ' ' | '\\t' | '\\r' ) | '\\n' )
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
					// /volsme/users/lo17a013/Antlr/categorie_1.g:56:7: ( ' ' | '\\t' | '\\r' )
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
					// /volsme/users/lo17a013/Antlr/categorie_1.g:56:39: '\\n'
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
			// /volsme/users/lo17a013/Antlr/categorie_1.g:58:5: ( ( '0' .. '9' | '-' | '.' )+ ( 'a' .. 'z' )* | ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' | '-' | '@' | '.' )+ )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( ((LA7_0 >= '-' && LA7_0 <= '.')||(LA7_0 >= '0' && LA7_0 <= '9')) ) {
				alt7=1;
			}
			else if ( ((LA7_0 >= 'A' && LA7_0 <= 'Z')||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// /volsme/users/lo17a013/Antlr/categorie_1.g:58:7: ( '0' .. '9' | '-' | '.' )+ ( 'a' .. 'z' )*
					{
					// /volsme/users/lo17a013/Antlr/categorie_1.g:58:7: ( '0' .. '9' | '-' | '.' )+
					int cnt4=0;
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '-' && LA4_0 <= '.')||(LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:
							{
							if ( (input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '9') ) {
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

					// /volsme/users/lo17a013/Antlr/categorie_1.g:58:27: ( 'a' .. 'z' )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( ((LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:
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
							break loop5;
						}
					}

					}
					break;
				case 2 :
					// /volsme/users/lo17a013/Antlr/categorie_1.g:58:41: ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' | '-' | '@' | '.' )+
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// /volsme/users/lo17a013/Antlr/categorie_1.g:58:63: ( 'a' .. 'z' | '-' | '@' | '.' )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '-' && LA6_0 <= '.')||LA6_0=='@'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:
							{
							if ( (input.LA(1) >= '-' && input.LA(1) <= '.')||input.LA(1)=='@'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
							if ( cnt6 >= 1 ) break loop6;
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
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
		// /volsme/users/lo17a013/Antlr/categorie_1.g:1:8: ( SELECT | ARTICLE | AUTEUR | DATE | TITRE | RUBRIQUE | DONT | WHERE | COUNT | EN | POINT | ET | OU | NOT | BETWEEN | AVANT | APRES | DEPUIS | WS | VAR )
		int alt8=20;
		alt8 = dfa8.predict(input);
		switch (alt8) {
			case 1 :
				// /volsme/users/lo17a013/Antlr/categorie_1.g:1:10: SELECT
				{
				mSELECT(); 

				}
				break;
			case 2 :
				// /volsme/users/lo17a013/Antlr/categorie_1.g:1:17: ARTICLE
				{
				mARTICLE(); 

				}
				break;
			case 3 :
				// /volsme/users/lo17a013/Antlr/categorie_1.g:1:25: AUTEUR
				{
				mAUTEUR(); 

				}
				break;
			case 4 :
				// /volsme/users/lo17a013/Antlr/categorie_1.g:1:32: DATE
				{
				mDATE(); 

				}
				break;
			case 5 :
				// /volsme/users/lo17a013/Antlr/categorie_1.g:1:37: TITRE
				{
				mTITRE(); 

				}
				break;
			case 6 :
				// /volsme/users/lo17a013/Antlr/categorie_1.g:1:43: RUBRIQUE
				{
				mRUBRIQUE(); 

				}
				break;
			case 7 :
				// /volsme/users/lo17a013/Antlr/categorie_1.g:1:52: DONT
				{
				mDONT(); 

				}
				break;
			case 8 :
				// /volsme/users/lo17a013/Antlr/categorie_1.g:1:57: WHERE
				{
				mWHERE(); 

				}
				break;
			case 9 :
				// /volsme/users/lo17a013/Antlr/categorie_1.g:1:63: COUNT
				{
				mCOUNT(); 

				}
				break;
			case 10 :
				// /volsme/users/lo17a013/Antlr/categorie_1.g:1:69: EN
				{
				mEN(); 

				}
				break;
			case 11 :
				// /volsme/users/lo17a013/Antlr/categorie_1.g:1:72: POINT
				{
				mPOINT(); 

				}
				break;
			case 12 :
				// /volsme/users/lo17a013/Antlr/categorie_1.g:1:78: ET
				{
				mET(); 

				}
				break;
			case 13 :
				// /volsme/users/lo17a013/Antlr/categorie_1.g:1:81: OU
				{
				mOU(); 

				}
				break;
			case 14 :
				// /volsme/users/lo17a013/Antlr/categorie_1.g:1:84: NOT
				{
				mNOT(); 

				}
				break;
			case 15 :
				// /volsme/users/lo17a013/Antlr/categorie_1.g:1:88: BETWEEN
				{
				mBETWEEN(); 

				}
				break;
			case 16 :
				// /volsme/users/lo17a013/Antlr/categorie_1.g:1:96: AVANT
				{
				mAVANT(); 

				}
				break;
			case 17 :
				// /volsme/users/lo17a013/Antlr/categorie_1.g:1:102: APRES
				{
				mAPRES(); 

				}
				break;
			case 18 :
				// /volsme/users/lo17a013/Antlr/categorie_1.g:1:108: DEPUIS
				{
				mDEPUIS(); 

				}
				break;
			case 19 :
				// /volsme/users/lo17a013/Antlr/categorie_1.g:1:115: WS
				{
				mWS(); 

				}
				break;
			case 20 :
				// /volsme/users/lo17a013/Antlr/categorie_1.g:1:118: VAR
				{
				mVAR(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA8_eotS =
		"\13\uffff\1\16\4\uffff\16\17\1\61\1\62\1\63\16\17\1\102\1\17\3\uffff\4"+
		"\17\1\uffff\2\17\1\112\1\113\5\17\1\uffff\4\17\1\125\2\17\2\uffff\1\17"+
		"\1\131\3\17\1\135\2\17\1\140\2\uffff\1\17\1\142\1\uffff\1\17\1\144\1\17"+
		"\1\uffff\1\146\1\126\1\uffff\1\140\1\uffff\1\17\3\uffff\1\150\1\uffff";
	static final String DFA8_eofS =
		"\151\uffff";
	static final String DFA8_minS =
		"\1\11\14\55\3\uffff\1\165\2\164\1\141\1\162\1\163\1\156\1\164\1\156\1"+
		"\160\1\164\1\142\1\162\1\155\3\55\1\154\1\151\1\145\1\156\1\u00e8\2\164"+
		"\1\145\1\164\1\165\2\162\1\154\1\142\1\55\1\162\3\uffff\1\157\1\143\1"+
		"\165\1\164\1\uffff\1\145\1\141\2\55\1\151\1\145\1\151\1\145\1\162\1\uffff"+
		"\1\145\1\151\1\154\1\162\1\55\1\40\1\143\2\uffff\1\163\1\55\1\161\1\162"+
		"\1\145\1\55\1\162\1\145\1\55\2\uffff\1\164\1\55\1\uffff\1\165\1\55\1\40"+
		"\1\uffff\2\55\1\uffff\1\55\1\uffff\1\145\3\uffff\1\55\1\uffff";
	static final String DFA8_maxS =
		"\15\172\3\uffff\1\165\2\164\1\141\1\162\1\163\1\156\1\164\1\156\1\160"+
		"\1\164\1\142\1\162\1\156\3\172\1\154\1\151\1\145\1\156\1\u00e8\2\164\1"+
		"\145\1\164\1\165\2\162\1\154\1\142\1\172\1\162\3\uffff\1\157\1\143\1\165"+
		"\1\164\1\uffff\1\145\1\141\2\172\1\151\1\145\1\151\1\145\1\162\1\uffff"+
		"\1\145\1\151\1\154\1\162\1\172\1\40\1\143\2\uffff\1\163\1\172\1\161\1"+
		"\162\1\145\1\172\1\162\1\145\1\172\2\uffff\1\164\1\172\1\uffff\1\165\1"+
		"\172\1\40\1\uffff\2\172\1\uffff\1\172\1\uffff\1\145\3\uffff\1\172\1\uffff";
	static final String DFA8_acceptS =
		"\15\uffff\1\23\1\13\1\24\41\uffff\1\12\1\14\1\15\4\uffff\1\21\11\uffff"+
		"\1\16\7\uffff\1\4\1\7\11\uffff\1\20\1\2\2\uffff\1\5\3\uffff\1\17\2\uffff"+
		"\1\3\1\uffff\1\22\1\uffff\1\10\1\11\1\1\1\uffff\1\6";
	static final String DFA8_specialS =
		"\151\uffff}>";
	static final String[] DFA8_transitionS = {
			"\2\15\2\uffff\1\15\22\uffff\1\15\14\uffff\1\17\1\13\1\uffff\12\17\5\uffff"+
			"\1\16\1\uffff\32\17\6\uffff\1\2\1\17\1\4\1\5\1\12\6\17\1\3\1\17\1\11"+
			"\1\14\1\10\1\17\1\7\1\17\1\6\1\17\1\1\4\17",
			"\2\17\21\uffff\1\17\40\uffff\16\17\1\20\13\17",
			"\2\17\21\uffff\1\17\40\uffff\17\17\1\24\1\17\1\21\2\17\1\22\1\23\4\17",
			"\2\17\21\uffff\1\17\40\uffff\10\17\1\25\21\17",
			"\2\17\21\uffff\1\17\40\uffff\16\17\1\26\13\17",
			"\2\17\21\uffff\1\17\40\uffff\1\27\3\17\1\31\11\17\1\30\13\17",
			"\2\17\21\uffff\1\17\40\uffff\10\17\1\32\21\17",
			"\2\17\21\uffff\1\17\40\uffff\24\17\1\33\5\17",
			"\2\17\21\uffff\1\17\40\uffff\1\34\31\17",
			"\2\17\21\uffff\1\17\40\uffff\16\17\1\35\13\17",
			"\2\17\21\uffff\1\17\40\uffff\15\17\1\36\5\17\1\37\6\17",
			"\2\17\1\uffff\12\17\47\uffff\32\17",
			"\2\17\21\uffff\1\17\40\uffff\24\17\1\40\5\17",
			"",
			"",
			"",
			"\1\41",
			"\1\42",
			"\1\43",
			"\1\44",
			"\1\45",
			"\1\46",
			"\1\47",
			"\1\50",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\56\1\57",
			"\2\17\21\uffff\1\17\40\uffff\23\17\1\60\6\17",
			"\2\17\21\uffff\1\17\40\uffff\32\17",
			"\2\17\21\uffff\1\17\40\uffff\32\17",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\2\17\21\uffff\1\17\40\uffff\32\17",
			"\1\103",
			"",
			"",
			"",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"",
			"\1\110",
			"\1\111",
			"\2\17\21\uffff\1\17\40\uffff\32\17",
			"\2\17\21\uffff\1\17\40\uffff\32\17",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\2\17\21\uffff\1\17\40\uffff\32\17",
			"\1\126",
			"\1\127",
			"",
			"",
			"\1\130",
			"\2\17\21\uffff\1\17\40\uffff\32\17",
			"\1\132",
			"\1\133",
			"\1\134",
			"\2\17\21\uffff\1\17\40\uffff\32\17",
			"\1\136",
			"\1\137",
			"\2\17\21\uffff\1\17\40\uffff\32\17",
			"",
			"",
			"\1\141",
			"\2\17\21\uffff\1\17\40\uffff\32\17",
			"",
			"\1\143",
			"\2\17\21\uffff\1\17\40\uffff\32\17",
			"\1\145",
			"",
			"\2\17\21\uffff\1\17\40\uffff\32\17",
			"\2\17\21\uffff\1\17\40\uffff\32\17",
			"",
			"\2\17\21\uffff\1\17\40\uffff\32\17",
			"",
			"\1\147",
			"",
			"",
			"",
			"\2\17\21\uffff\1\17\40\uffff\32\17",
			""
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( SELECT | ARTICLE | AUTEUR | DATE | TITRE | RUBRIQUE | DONT | WHERE | COUNT | EN | POINT | ET | OU | NOT | BETWEEN | AVANT | APRES | DEPUIS | WS | VAR );";
		}
	}

}
