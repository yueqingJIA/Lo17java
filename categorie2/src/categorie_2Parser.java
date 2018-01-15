// $ANTLR 3.5.1 /volsme/users/lo17a013/Antlr/categorie_2.g 2017-11-23 10:53:36

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class categorie_2Parser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARTICLE", "AUTEUR", "BETWEEN", 
		"DATE", "DONT", "ET", "NOT", "OU", "POINT", "RUBRIQUE", "SELECT", "TITRE", 
		"VAR", "WHERE", "WS"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public categorie_2Parser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public categorie_2Parser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return categorie_2Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "/volsme/users/lo17a013/Antlr/categorie_2.g"; }



	// $ANTLR start "listerequetes"
	// /volsme/users/lo17a013/Antlr/categorie_2.g:46:1: listerequetes returns [String sql = \"\"] : r= requete POINT ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// /volsme/users/lo17a013/Antlr/categorie_2.g:47:25: (r= requete POINT )
			// /volsme/users/lo17a013/Antlr/categorie_2.g:48:3: r= requete POINT
			{
			pushFollow(FOLLOW_requete_in_listerequetes226);
			r=requete();
			state._fsp--;

			match(input,POINT,FOLLOW_POINT_in_listerequetes228); 

							lr_arbre = r;
							sql = lr_arbre.sortArbre();
						
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return sql;
	}
	// $ANTLR end "listerequetes"



	// $ANTLR start "requete"
	// /volsme/users/lo17a013/Antlr/categorie_2.g:55:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : SELECT ( ARTICLE ET ( DATE ( DONT ARTICLE WHERE | ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) ) ) | RUBRIQUE ( DONT ARTICLE WHERE | ( ET DATE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) ) ) | AUTEUR ( DONT ARTICLE WHERE | ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) | ET DATE ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) ) ) ) ps1= paramArticle ( ET ps2= paramArticle )* ) ;
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");


		Arbre ps1 =null;
		Arbre ps2 =null;

		Arbre ps_arbre;
		try {
			// /volsme/users/lo17a013/Antlr/categorie_2.g:56:26: ( SELECT ( ARTICLE ET ( DATE ( DONT ARTICLE WHERE | ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) ) ) | RUBRIQUE ( DONT ARTICLE WHERE | ( ET DATE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) ) ) | AUTEUR ( DONT ARTICLE WHERE | ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) | ET DATE ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) ) ) ) ps1= paramArticle ( ET ps2= paramArticle )* ) )
			// /volsme/users/lo17a013/Antlr/categorie_2.g:57:3: SELECT ( ARTICLE ET ( DATE ( DONT ARTICLE WHERE | ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) ) ) | RUBRIQUE ( DONT ARTICLE WHERE | ( ET DATE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) ) ) | AUTEUR ( DONT ARTICLE WHERE | ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) | ET DATE ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) ) ) ) ps1= paramArticle ( ET ps2= paramArticle )* )
			{
			match(input,SELECT,FOLLOW_SELECT_in_requete255); 

							req_arbre.ajouteFils(new Arbre("","select distinct"));
						
			// /volsme/users/lo17a013/Antlr/categorie_2.g:61:3: ( ARTICLE ET ( DATE ( DONT ARTICLE WHERE | ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) ) ) | RUBRIQUE ( DONT ARTICLE WHERE | ( ET DATE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) ) ) | AUTEUR ( DONT ARTICLE WHERE | ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) | ET DATE ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) ) ) ) ps1= paramArticle ( ET ps2= paramArticle )* )
			// /volsme/users/lo17a013/Antlr/categorie_2.g:61:4: ARTICLE ET ( DATE ( DONT ARTICLE WHERE | ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) ) ) | RUBRIQUE ( DONT ARTICLE WHERE | ( ET DATE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) ) ) | AUTEUR ( DONT ARTICLE WHERE | ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) | ET DATE ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) ) ) ) ps1= paramArticle ( ET ps2= paramArticle )*
			{
			match(input,ARTICLE,FOLLOW_ARTICLE_in_requete267); 

					req_arbre.ajouteFils(new Arbre("","fichier"));
					
			match(input,ET,FOLLOW_ET_in_requete276); 
			// /volsme/users/lo17a013/Antlr/categorie_2.g:66:3: ( DATE ( DONT ARTICLE WHERE | ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) ) ) | RUBRIQUE ( DONT ARTICLE WHERE | ( ET DATE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) ) ) | AUTEUR ( DONT ARTICLE WHERE | ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) | ET DATE ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) ) ) )
			int alt13=3;
			switch ( input.LA(1) ) {
			case DATE:
				{
				alt13=1;
				}
				break;
			case RUBRIQUE:
				{
				alt13=2;
				}
				break;
			case AUTEUR:
				{
				alt13=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// /volsme/users/lo17a013/Antlr/categorie_2.g:66:4: DATE ( DONT ARTICLE WHERE | ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) ) )
					{
					match(input,DATE,FOLLOW_DATE_in_requete282); 

							req_arbre.ajouteFils(new Arbre("",", date"));
							
					// /volsme/users/lo17a013/Antlr/categorie_2.g:70:3: ( DONT ARTICLE WHERE | ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) ) )
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==DONT) ) {
						alt4=1;
					}
					else if ( (LA4_0==ET) ) {
						alt4=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						throw nvae;
					}

					switch (alt4) {
						case 1 :
							// /volsme/users/lo17a013/Antlr/categorie_2.g:70:4: DONT ARTICLE WHERE
							{
							match(input,DONT,FOLLOW_DONT_in_requete291); 
							match(input,ARTICLE,FOLLOW_ARTICLE_in_requete293); 
							match(input,WHERE,FOLLOW_WHERE_in_requete296); 

									req_arbre.ajouteFils(new Arbre("","from public.titretexte TT JOIN public.date D ON TT.fichier = D.fichier"));
									req_arbre.ajouteFils(new Arbre("","where"));
									
							}
							break;
						case 2 :
							// /volsme/users/lo17a013/Antlr/categorie_2.g:75:5: ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) )
							{
							// /volsme/users/lo17a013/Antlr/categorie_2.g:75:5: ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) )
							int alt3=2;
							int LA3_0 = input.LA(1);
							if ( (LA3_0==ET) ) {
								int LA3_1 = input.LA(2);
								if ( (LA3_1==RUBRIQUE) ) {
									alt3=1;
								}
								else if ( (LA3_1==AUTEUR) ) {
									alt3=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 3, 1, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 3, 0, input);
								throw nvae;
							}

							switch (alt3) {
								case 1 :
									// /volsme/users/lo17a013/Antlr/categorie_2.g:75:6: ET RUBRIQUE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE )
									{
									match(input,ET,FOLLOW_ET_in_requete308); 
									match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete310); 

											req_arbre.ajouteFils(new Arbre("",", rubrique"));
											
									// /volsme/users/lo17a013/Antlr/categorie_2.g:79:3: ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE )
									int alt1=2;
									int LA1_0 = input.LA(1);
									if ( (LA1_0==DONT) ) {
										alt1=1;
									}
									else if ( (LA1_0==ET) ) {
										alt1=2;
									}

									else {
										NoViableAltException nvae =
											new NoViableAltException("", 1, 0, input);
										throw nvae;
									}

									switch (alt1) {
										case 1 :
											// /volsme/users/lo17a013/Antlr/categorie_2.g:79:4: DONT ARTICLE WHERE
											{
											match(input,DONT,FOLLOW_DONT_in_requete320); 
											match(input,ARTICLE,FOLLOW_ARTICLE_in_requete322); 
											match(input,WHERE,FOLLOW_WHERE_in_requete324); 

													req_arbre.ajouteFils(new Arbre("","from public.titretexte TT JOIN public.date D ON TT.fichier = D.fichier"));
													req_arbre.ajouteFils(new Arbre("","JOIN public.rubrique R ON TT.fichier = R.fichier"));
													req_arbre.ajouteFils(new Arbre("","where"));
													
											}
											break;
										case 2 :
											// /volsme/users/lo17a013/Antlr/categorie_2.g:85:5: ET AUTEUR DONT ARTICLE WHERE
											{
											match(input,ET,FOLLOW_ET_in_requete335); 
											match(input,AUTEUR,FOLLOW_AUTEUR_in_requete337); 

													req_arbre.ajouteFils(new Arbre("",", contact"));
													
											match(input,DONT,FOLLOW_DONT_in_requete346); 
											match(input,ARTICLE,FOLLOW_ARTICLE_in_requete348); 
											match(input,WHERE,FOLLOW_WHERE_in_requete351); 

													req_arbre.ajouteFils(new Arbre("","from public.titretexte TT JOIN public.date D ON TT.fichier = D.fichier"));
													req_arbre.ajouteFils(new Arbre("","JOIN public.rubrique R ON TT.fichier = R.fichier"));
													req_arbre.ajouteFils(new Arbre("","JOIN public.contact C ON TT.fichier = C.fichier"));
													req_arbre.ajouteFils(new Arbre("","where"));
													
											}
											break;

									}

									}
									break;
								case 2 :
									// /volsme/users/lo17a013/Antlr/categorie_2.g:96:5: ET AUTEUR ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE )
									{
									match(input,ET,FOLLOW_ET_in_requete363); 
									match(input,AUTEUR,FOLLOW_AUTEUR_in_requete365); 

											req_arbre.ajouteFils(new Arbre("",", contact"));
											
									// /volsme/users/lo17a013/Antlr/categorie_2.g:100:3: ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE )
									int alt2=2;
									int LA2_0 = input.LA(1);
									if ( (LA2_0==DONT) ) {
										alt2=1;
									}
									else if ( (LA2_0==ET) ) {
										alt2=2;
									}

									else {
										NoViableAltException nvae =
											new NoViableAltException("", 2, 0, input);
										throw nvae;
									}

									switch (alt2) {
										case 1 :
											// /volsme/users/lo17a013/Antlr/categorie_2.g:100:4: DONT ARTICLE WHERE
											{
											match(input,DONT,FOLLOW_DONT_in_requete375); 
											match(input,ARTICLE,FOLLOW_ARTICLE_in_requete377); 
											match(input,WHERE,FOLLOW_WHERE_in_requete380); 

													req_arbre.ajouteFils(new Arbre("","from public.titretexte TT JOIN public.date D ON TT.fichier = D.fichier"));
													req_arbre.ajouteFils(new Arbre("","JOIN public.contact C ON TT.fichier = C.fichier"));
													req_arbre.ajouteFils(new Arbre("","where"));
													
											}
											break;
										case 2 :
											// /volsme/users/lo17a013/Antlr/categorie_2.g:106:5: ET RUBRIQUE DONT ARTICLE WHERE
											{
											match(input,ET,FOLLOW_ET_in_requete391); 
											match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete393); 

													req_arbre.ajouteFils(new Arbre("",", rubrique"));
													
											match(input,DONT,FOLLOW_DONT_in_requete401); 
											match(input,ARTICLE,FOLLOW_ARTICLE_in_requete403); 
											match(input,WHERE,FOLLOW_WHERE_in_requete406); 

													req_arbre.ajouteFils(new Arbre("","from public.titretexte TT JOIN public.date D ON TT.fichier = D.fichier"));
													req_arbre.ajouteFils(new Arbre("","JOIN public.contact C ON TT.fichier = C.fichier"));
													req_arbre.ajouteFils(new Arbre("","JOIN public.rubrique R ON TT.fichier = R.fichier"));
													req_arbre.ajouteFils(new Arbre("","where"));
													
											}
											break;

									}

									}
									break;

							}

							}
							break;

					}

					}
					break;
				case 2 :
					// /volsme/users/lo17a013/Antlr/categorie_2.g:119:5: RUBRIQUE ( DONT ARTICLE WHERE | ( ET DATE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) ) )
					{
					match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete426); 

							req_arbre.ajouteFils(new Arbre("",", rubrique"));
							
					// /volsme/users/lo17a013/Antlr/categorie_2.g:123:3: ( DONT ARTICLE WHERE | ( ET DATE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) ) )
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==DONT) ) {
						alt8=1;
					}
					else if ( (LA8_0==ET) ) {
						alt8=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 8, 0, input);
						throw nvae;
					}

					switch (alt8) {
						case 1 :
							// /volsme/users/lo17a013/Antlr/categorie_2.g:123:4: DONT ARTICLE WHERE
							{
							match(input,DONT,FOLLOW_DONT_in_requete436); 
							match(input,ARTICLE,FOLLOW_ARTICLE_in_requete438); 
							match(input,WHERE,FOLLOW_WHERE_in_requete441); 

									req_arbre.ajouteFils(new Arbre("","from public.titretexte TT JOIN public.rubrique R ON TT.fichier = R.fichier"));
									req_arbre.ajouteFils(new Arbre("","where"));
									
							}
							break;
						case 2 :
							// /volsme/users/lo17a013/Antlr/categorie_2.g:128:5: ( ET DATE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) )
							{
							// /volsme/users/lo17a013/Antlr/categorie_2.g:128:5: ( ET DATE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) )
							int alt7=2;
							int LA7_0 = input.LA(1);
							if ( (LA7_0==ET) ) {
								int LA7_1 = input.LA(2);
								if ( (LA7_1==DATE) ) {
									alt7=1;
								}
								else if ( (LA7_1==AUTEUR) ) {
									alt7=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 7, 1, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 7, 0, input);
								throw nvae;
							}

							switch (alt7) {
								case 1 :
									// /volsme/users/lo17a013/Antlr/categorie_2.g:128:6: ET DATE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE )
									{
									match(input,ET,FOLLOW_ET_in_requete453); 
									match(input,DATE,FOLLOW_DATE_in_requete455); 

											req_arbre.ajouteFils(new Arbre("",", date"));
											
									// /volsme/users/lo17a013/Antlr/categorie_2.g:132:3: ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE )
									int alt5=2;
									int LA5_0 = input.LA(1);
									if ( (LA5_0==DONT) ) {
										alt5=1;
									}
									else if ( (LA5_0==ET) ) {
										alt5=2;
									}

									else {
										NoViableAltException nvae =
											new NoViableAltException("", 5, 0, input);
										throw nvae;
									}

									switch (alt5) {
										case 1 :
											// /volsme/users/lo17a013/Antlr/categorie_2.g:132:4: DONT ARTICLE WHERE
											{
											match(input,DONT,FOLLOW_DONT_in_requete465); 
											match(input,ARTICLE,FOLLOW_ARTICLE_in_requete467); 
											match(input,WHERE,FOLLOW_WHERE_in_requete470); 

													req_arbre.ajouteFils(new Arbre("","from public.titretexte TT JOIN public.rubrique R ON TT.fichier = R.fichier"));
													req_arbre.ajouteFils(new Arbre(""," JOIN public.date D ON TT.fichier = D.fichier"));
													req_arbre.ajouteFils(new Arbre("","where"));
													
											}
											break;
										case 2 :
											// /volsme/users/lo17a013/Antlr/categorie_2.g:138:5: ET AUTEUR DONT ARTICLE WHERE
											{
											match(input,ET,FOLLOW_ET_in_requete481); 
											match(input,AUTEUR,FOLLOW_AUTEUR_in_requete483); 

													req_arbre.ajouteFils(new Arbre("",", contact"));
													
											match(input,DONT,FOLLOW_DONT_in_requete491); 
											match(input,ARTICLE,FOLLOW_ARTICLE_in_requete493); 
											match(input,WHERE,FOLLOW_WHERE_in_requete496); 

													req_arbre.ajouteFils(new Arbre("","from public.titretexte TT JOIN public.rubrique R ON TT.fichier = R.fichier"));
													req_arbre.ajouteFils(new Arbre(""," JOIN public.date D ON TT.fichier = D.fichier"));
													req_arbre.ajouteFils(new Arbre(""," JOIN public.contact C ON TT.fichier = C.fichier"));
													req_arbre.ajouteFils(new Arbre("","where"));
													
											}
											break;

									}

									}
									break;
								case 2 :
									// /volsme/users/lo17a013/Antlr/categorie_2.g:149:5: ET AUTEUR ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE )
									{
									match(input,ET,FOLLOW_ET_in_requete508); 
									match(input,AUTEUR,FOLLOW_AUTEUR_in_requete510); 

											req_arbre.ajouteFils(new Arbre("",", contact"));
											
									// /volsme/users/lo17a013/Antlr/categorie_2.g:153:3: ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE )
									int alt6=2;
									int LA6_0 = input.LA(1);
									if ( (LA6_0==DONT) ) {
										alt6=1;
									}
									else if ( (LA6_0==ET) ) {
										alt6=2;
									}

									else {
										NoViableAltException nvae =
											new NoViableAltException("", 6, 0, input);
										throw nvae;
									}

									switch (alt6) {
										case 1 :
											// /volsme/users/lo17a013/Antlr/categorie_2.g:153:4: DONT ARTICLE WHERE
											{
											match(input,DONT,FOLLOW_DONT_in_requete520); 
											match(input,ARTICLE,FOLLOW_ARTICLE_in_requete522); 
											match(input,WHERE,FOLLOW_WHERE_in_requete525); 

													req_arbre.ajouteFils(new Arbre("","from public.titretexte TT JOIN public.rubrique R ON TT.fichier = R.fichier"));
													req_arbre.ajouteFils(new Arbre(""," JOIN public.rubrique R ON TT.fichier = R.fichier"));
													req_arbre.ajouteFils(new Arbre(""," JOIN public.contact C ON TT.fichier = C.fichier"));
													req_arbre.ajouteFils(new Arbre("","where"));
													
											}
											break;
										case 2 :
											// /volsme/users/lo17a013/Antlr/categorie_2.g:160:5: ET DATE DONT ARTICLE WHERE
											{
											match(input,ET,FOLLOW_ET_in_requete536); 
											match(input,DATE,FOLLOW_DATE_in_requete538); 

													req_arbre.ajouteFils(new Arbre("",", date"));
													
											match(input,DONT,FOLLOW_DONT_in_requete546); 
											match(input,ARTICLE,FOLLOW_ARTICLE_in_requete548); 
											match(input,WHERE,FOLLOW_WHERE_in_requete551); 

													req_arbre.ajouteFils(new Arbre("","from public.titretexte TT JOIN public.rubrique R ON TT.fichier = R.fichier"));
													req_arbre.ajouteFils(new Arbre(""," JOIN public.rubrique R ON TT.fichier = R.fichier"));
													req_arbre.ajouteFils(new Arbre(""," JOIN public.contact C ON TT.fichier = C.fichier"));
													req_arbre.ajouteFils(new Arbre("","where"));
													
											}
											break;

									}

									}
									break;

							}

							}
							break;

					}

					}
					break;
				case 3 :
					// /volsme/users/lo17a013/Antlr/categorie_2.g:173:5: AUTEUR ( DONT ARTICLE WHERE | ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) | ET DATE ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) ) )
					{
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete571); 

							req_arbre.ajouteFils(new Arbre("",", contact"));
							
					// /volsme/users/lo17a013/Antlr/categorie_2.g:177:3: ( DONT ARTICLE WHERE | ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) | ET DATE ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) ) )
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==DONT) ) {
						alt12=1;
					}
					else if ( (LA12_0==ET) ) {
						alt12=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 12, 0, input);
						throw nvae;
					}

					switch (alt12) {
						case 1 :
							// /volsme/users/lo17a013/Antlr/categorie_2.g:177:4: DONT ARTICLE WHERE
							{
							match(input,DONT,FOLLOW_DONT_in_requete581); 
							match(input,ARTICLE,FOLLOW_ARTICLE_in_requete583); 
							match(input,WHERE,FOLLOW_WHERE_in_requete586); 

									req_arbre.ajouteFils(new Arbre("","from public.titretexte TT JOIN public.contact C ON TT.fichier = C.fichier"));
									req_arbre.ajouteFils(new Arbre("","where"));
									
							}
							break;
						case 2 :
							// /volsme/users/lo17a013/Antlr/categorie_2.g:182:5: ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) | ET DATE ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) )
							{
							// /volsme/users/lo17a013/Antlr/categorie_2.g:182:5: ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) | ET DATE ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) )
							int alt11=2;
							int LA11_0 = input.LA(1);
							if ( (LA11_0==ET) ) {
								int LA11_1 = input.LA(2);
								if ( (LA11_1==RUBRIQUE) ) {
									alt11=1;
								}
								else if ( (LA11_1==DATE) ) {
									alt11=2;
								}

								else {
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 11, 1, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 11, 0, input);
								throw nvae;
							}

							switch (alt11) {
								case 1 :
									// /volsme/users/lo17a013/Antlr/categorie_2.g:182:6: ET RUBRIQUE ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE )
									{
									match(input,ET,FOLLOW_ET_in_requete598); 
									match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete600); 

											req_arbre.ajouteFils(new Arbre("",", rubrique"));
											
									// /volsme/users/lo17a013/Antlr/categorie_2.g:186:3: ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE )
									int alt9=2;
									int LA9_0 = input.LA(1);
									if ( (LA9_0==DONT) ) {
										alt9=1;
									}
									else if ( (LA9_0==ET) ) {
										alt9=2;
									}

									else {
										NoViableAltException nvae =
											new NoViableAltException("", 9, 0, input);
										throw nvae;
									}

									switch (alt9) {
										case 1 :
											// /volsme/users/lo17a013/Antlr/categorie_2.g:186:4: DONT ARTICLE WHERE
											{
											match(input,DONT,FOLLOW_DONT_in_requete609); 
											match(input,ARTICLE,FOLLOW_ARTICLE_in_requete611); 
											match(input,WHERE,FOLLOW_WHERE_in_requete614); 

													req_arbre.ajouteFils(new Arbre("","from public.titretexte TT JOIN public.contact C ON TT.fichier = C.fichier"));
													req_arbre.ajouteFils(new Arbre("","JOIN public.rubrique R ON TT.fichier = R.fichier"));
													req_arbre.ajouteFils(new Arbre("","where"));
													
											}
											break;
										case 2 :
											// /volsme/users/lo17a013/Antlr/categorie_2.g:192:5: ET DATE DONT ARTICLE WHERE
											{
											match(input,ET,FOLLOW_ET_in_requete625); 
											match(input,DATE,FOLLOW_DATE_in_requete627); 

													req_arbre.ajouteFils(new Arbre("",", date"));
													
											match(input,DONT,FOLLOW_DONT_in_requete635); 
											match(input,ARTICLE,FOLLOW_ARTICLE_in_requete637); 
											match(input,WHERE,FOLLOW_WHERE_in_requete640); 

													req_arbre.ajouteFils(new Arbre("","from public.titretexte TT JOIN public.contact C ON TT.fichier = C.fichier"));
													req_arbre.ajouteFils(new Arbre("","JOIN public.rubrique R ON TT.fichier = R.fichier"));
													req_arbre.ajouteFils(new Arbre("","JOIN public.date D ON TT.fichier = D.fichier"));
													req_arbre.ajouteFils(new Arbre("","where"));
													
											}
											break;

									}

									}
									break;
								case 2 :
									// /volsme/users/lo17a013/Antlr/categorie_2.g:203:5: ET DATE ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE )
									{
									match(input,ET,FOLLOW_ET_in_requete652); 
									match(input,DATE,FOLLOW_DATE_in_requete654); 

											req_arbre.ajouteFils(new Arbre("",", date"));
											
									// /volsme/users/lo17a013/Antlr/categorie_2.g:207:3: ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE )
									int alt10=2;
									int LA10_0 = input.LA(1);
									if ( (LA10_0==DONT) ) {
										alt10=1;
									}
									else if ( (LA10_0==ET) ) {
										alt10=2;
									}

									else {
										NoViableAltException nvae =
											new NoViableAltException("", 10, 0, input);
										throw nvae;
									}

									switch (alt10) {
										case 1 :
											// /volsme/users/lo17a013/Antlr/categorie_2.g:207:4: DONT ARTICLE WHERE
											{
											match(input,DONT,FOLLOW_DONT_in_requete663); 
											match(input,ARTICLE,FOLLOW_ARTICLE_in_requete665); 
											match(input,WHERE,FOLLOW_WHERE_in_requete668); 

													req_arbre.ajouteFils(new Arbre("","from public.titretexte TT JOIN public.contact C ON TT.fichier = C.fichier"));
													req_arbre.ajouteFils(new Arbre("","JOIN public.date D ON TT.fichier = D.fichier"));
													req_arbre.ajouteFils(new Arbre("","where"));
													
											}
											break;
										case 2 :
											// /volsme/users/lo17a013/Antlr/categorie_2.g:213:5: ET RUBRIQUE DONT ARTICLE WHERE
											{
											match(input,ET,FOLLOW_ET_in_requete679); 
											match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete681); 

													req_arbre.ajouteFils(new Arbre("",", rubrique"));
													
											match(input,DONT,FOLLOW_DONT_in_requete690); 
											match(input,ARTICLE,FOLLOW_ARTICLE_in_requete692); 
											match(input,WHERE,FOLLOW_WHERE_in_requete695); 

													req_arbre.ajouteFils(new Arbre("","from public.titretexte TT JOIN public.contact C ON TT.fichier = C.fichier"));
													req_arbre.ajouteFils(new Arbre("","JOIN public.date D ON TT.fichier = D.fichier"));
													req_arbre.ajouteFils(new Arbre("","JOIN public.rubrique R ON TT.fichier = R.fichier"));
													req_arbre.ajouteFils(new Arbre("","where"));
													
											}
											break;

									}

									}
									break;

							}

							}
							break;

					}

					}
					break;

			}

			pushFollow(FOLLOW_paramArticle_in_requete721);
			ps1=paramArticle();
			state._fsp--;

			// /volsme/users/lo17a013/Antlr/categorie_2.g:227:22: ( ET ps2= paramArticle )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==ET) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// /volsme/users/lo17a013/Antlr/categorie_2.g:227:23: ET ps2= paramArticle
					{
					match(input,ET,FOLLOW_ET_in_requete724); 
					pushFollow(FOLLOW_paramArticle_in_requete730);
					ps2=paramArticle();
					state._fsp--;

					}
					break;

				default :
					break loop14;
				}
			}


					ps_arbre = ps1;
					req_arbre.ajouteFils(ps_arbre);
					ps_arbre = ps2;
					req_arbre.ajouteFils(ps_arbre);
					
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return req_arbre;
	}
	// $ANTLR end "requete"



	// $ANTLR start "paramArticle"
	// /volsme/users/lo17a013/Antlr/categorie_2.g:237:1: paramArticle returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= paramArt ( ( ET | OU ) ( ( NOT par2= paramArt ) | (par2= paramArt ) ) )* ;
	public final Arbre paramArticle() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// /volsme/users/lo17a013/Antlr/categorie_2.g:238:40: (par1= paramArt ( ( ET | OU ) ( ( NOT par2= paramArt ) | (par2= paramArt ) ) )* )
			// /volsme/users/lo17a013/Antlr/categorie_2.g:239:3: par1= paramArt ( ( ET | OU ) ( ( NOT par2= paramArt ) | (par2= paramArt ) ) )*
			{
			pushFollow(FOLLOW_paramArt_in_paramArticle766);
			par1=paramArt();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// /volsme/users/lo17a013/Antlr/categorie_2.g:244:3: ( ( ET | OU ) ( ( NOT par2= paramArt ) | (par2= paramArt ) ) )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==ET) ) {
					int LA17_1 = input.LA(2);
					if ( (LA17_1==NOT||LA17_1==VAR) ) {
						alt17=1;
					}

				}
				else if ( (LA17_0==OU) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// /volsme/users/lo17a013/Antlr/categorie_2.g:244:4: ( ET | OU ) ( ( NOT par2= paramArt ) | (par2= paramArt ) )
					{
					// /volsme/users/lo17a013/Antlr/categorie_2.g:244:4: ( ET | OU )
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==ET) ) {
						alt15=1;
					}
					else if ( (LA15_0==OU) ) {
						alt15=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 15, 0, input);
						throw nvae;
					}

					switch (alt15) {
						case 1 :
							// /volsme/users/lo17a013/Antlr/categorie_2.g:244:5: ET
							{
							match(input,ET,FOLLOW_ET_in_paramArticle777); 

											les_pars_arbre.ajouteFils(new Arbre("", "AND"));
										
							}
							break;
						case 2 :
							// /volsme/users/lo17a013/Antlr/categorie_2.g:248:5: OU
							{
							match(input,OU,FOLLOW_OU_in_paramArticle790); 

											les_pars_arbre.ajouteFils(new Arbre("", "OR"));
									
							}
							break;

					}

					// /volsme/users/lo17a013/Antlr/categorie_2.g:252:3: ( ( NOT par2= paramArt ) | (par2= paramArt ) )
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==NOT) ) {
						alt16=1;
					}
					else if ( (LA16_0==VAR) ) {
						alt16=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 16, 0, input);
						throw nvae;
					}

					switch (alt16) {
						case 1 :
							// /volsme/users/lo17a013/Antlr/categorie_2.g:252:4: ( NOT par2= paramArt )
							{
							// /volsme/users/lo17a013/Antlr/categorie_2.g:252:4: ( NOT par2= paramArt )
							// /volsme/users/lo17a013/Antlr/categorie_2.g:252:5: NOT par2= paramArt
							{
							match(input,NOT,FOLLOW_NOT_in_paramArticle802); 

											les_pars_arbre.ajouteFils(new Arbre("", "NOT"));
										
							pushFollow(FOLLOW_paramArt_in_paramArticle815);
							par2=paramArt();
							state._fsp--;


											par2_arbre = par2;
											les_pars_arbre.ajouteFils(par2_arbre);
										
							}

							}
							break;
						case 2 :
							// /volsme/users/lo17a013/Antlr/categorie_2.g:262:5: (par2= paramArt )
							{
							// /volsme/users/lo17a013/Antlr/categorie_2.g:262:5: (par2= paramArt )
							// /volsme/users/lo17a013/Antlr/categorie_2.g:262:6: par2= paramArt
							{
							pushFollow(FOLLOW_paramArt_in_paramArticle835);
							par2=paramArt();
							state._fsp--;


											par2_arbre = par2;
											les_pars_arbre.ajouteFils(par2_arbre);
										
							}

							}
							break;

					}

					}
					break;

				default :
					break loop17;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return les_pars_arbre;
	}
	// $ANTLR end "paramArticle"



	// $ANTLR start "paramArt"
	// /volsme/users/lo17a013/Antlr/categorie_2.g:272:1: paramArt returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre paramArt() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// /volsme/users/lo17a013/Antlr/categorie_2.g:272:54: (a= VAR )
			// /volsme/users/lo17a013/Antlr/categorie_2.g:273:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_paramArt872); 
			 lepar_arbre.ajouteFils(new Arbre("mot =", "'"+a.getText()+"'"));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return lepar_arbre;
	}
	// $ANTLR end "paramArt"

	// Delegated rules



	public static final BitSet FOLLOW_requete_in_listerequetes226 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_POINT_in_listerequetes228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete255 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete267 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_ET_in_requete276 = new BitSet(new long[]{0x00000000000020A0L});
	public static final BitSet FOLLOW_DATE_in_requete282 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_DONT_in_requete291 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete293 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_WHERE_in_requete296 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_ET_in_requete308 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete310 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_DONT_in_requete320 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete322 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_WHERE_in_requete324 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_ET_in_requete335 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_AUTEUR_in_requete337 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_DONT_in_requete346 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete348 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_WHERE_in_requete351 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_ET_in_requete363 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_AUTEUR_in_requete365 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_DONT_in_requete375 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete377 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_WHERE_in_requete380 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_ET_in_requete391 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete393 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_DONT_in_requete401 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete403 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_WHERE_in_requete406 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete426 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_DONT_in_requete436 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete438 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_WHERE_in_requete441 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_ET_in_requete453 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_DATE_in_requete455 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_DONT_in_requete465 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete467 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_WHERE_in_requete470 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_ET_in_requete481 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_AUTEUR_in_requete483 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_DONT_in_requete491 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete493 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_WHERE_in_requete496 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_ET_in_requete508 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_AUTEUR_in_requete510 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_DONT_in_requete520 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete522 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_WHERE_in_requete525 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_ET_in_requete536 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_DATE_in_requete538 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_DONT_in_requete546 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete548 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_WHERE_in_requete551 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_AUTEUR_in_requete571 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_DONT_in_requete581 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete583 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_WHERE_in_requete586 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_ET_in_requete598 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete600 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_DONT_in_requete609 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete611 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_WHERE_in_requete614 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_ET_in_requete625 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_DATE_in_requete627 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_DONT_in_requete635 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete637 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_WHERE_in_requete640 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_ET_in_requete652 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_DATE_in_requete654 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_DONT_in_requete663 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete665 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_WHERE_in_requete668 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_ET_in_requete679 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete681 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_DONT_in_requete690 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ARTICLE_in_requete692 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_WHERE_in_requete695 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_paramArticle_in_requete721 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_ET_in_requete724 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_paramArticle_in_requete730 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_paramArt_in_paramArticle766 = new BitSet(new long[]{0x0000000000000A02L});
	public static final BitSet FOLLOW_ET_in_paramArticle777 = new BitSet(new long[]{0x0000000000010400L});
	public static final BitSet FOLLOW_OU_in_paramArticle790 = new BitSet(new long[]{0x0000000000010400L});
	public static final BitSet FOLLOW_NOT_in_paramArticle802 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_paramArt_in_paramArticle815 = new BitSet(new long[]{0x0000000000000A02L});
	public static final BitSet FOLLOW_paramArt_in_paramArticle835 = new BitSet(new long[]{0x0000000000000A02L});
	public static final BitSet FOLLOW_VAR_in_paramArt872 = new BitSet(new long[]{0x0000000000000002L});
}
