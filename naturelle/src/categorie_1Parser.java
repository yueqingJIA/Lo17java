// $ANTLR 3.5.1 /volsme/users/lo17a013/Antlr/categorie_1.g 2017-11-30 13:27:26

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class categorie_1Parser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "APRES", "ARTICLE", "AUTEUR", 
		"AVANT", "BETWEEN", "COUNT", "DATE", "DEPUIS", "DONT", "EN", "ET", "NOT", 
		"OU", "POINT", "RUBRIQUE", "SELECT", "TITRE", "VAR", "WHERE", "WS"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public categorie_1Parser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public categorie_1Parser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return categorie_1Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "/volsme/users/lo17a013/Antlr/categorie_1.g"; }



	// $ANTLR start "listerequetes"
	// /volsme/users/lo17a013/Antlr/categorie_1.g:64:1: listerequetes returns [String sql = \"\"] : r= requete POINT ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// /volsme/users/lo17a013/Antlr/categorie_1.g:65:25: (r= requete POINT )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:66:3: r= requete POINT
			{
			pushFollow(FOLLOW_requete_in_listerequetes283);
			r=requete();
			state._fsp--;

			match(input,POINT,FOLLOW_POINT_in_listerequetes285); 

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
	// /volsme/users/lo17a013/Antlr/categorie_1.g:73:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : SELECT ( ( ( ARTICLE | COUNT ) ( ( WHERE ps= paramArticle | DONT ( TITRE WHERE ps= paramTitre | RUBRIQUE WHERE ps= paramRubrique | AUTEUR WHERE ps= paramAuteur ) | DATE ps= paramDate ) ) | ( ARTICLE ET ( DATE ( DONT ARTICLE WHERE | ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) ) ) | RUBRIQUE ( DONT ARTICLE WHERE | ( ET DATE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) ) ) | AUTEUR ( DONT ARTICLE WHERE | ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) | ET DATE ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) ) ) ) ps1= paramArticle ) ) | ( ( AUTEUR ) ( DONT ARTICLE ( WHERE ps= paramArticle ) ) ) | ( RUBRIQUE ( DONT ARTICLE ( WHERE ps= paramArticle ) ) ) | ( DATE ( DONT ARTICLE ( WHERE ps= paramArticle ) ) ) ) ;
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");


		Arbre ps =null;
		Arbre ps1 =null;

		Arbre ps_arbre;
		try {
			// /volsme/users/lo17a013/Antlr/categorie_1.g:74:26: ( SELECT ( ( ( ARTICLE | COUNT ) ( ( WHERE ps= paramArticle | DONT ( TITRE WHERE ps= paramTitre | RUBRIQUE WHERE ps= paramRubrique | AUTEUR WHERE ps= paramAuteur ) | DATE ps= paramDate ) ) | ( ARTICLE ET ( DATE ( DONT ARTICLE WHERE | ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) ) ) | RUBRIQUE ( DONT ARTICLE WHERE | ( ET DATE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) ) ) | AUTEUR ( DONT ARTICLE WHERE | ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) | ET DATE ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) ) ) ) ps1= paramArticle ) ) | ( ( AUTEUR ) ( DONT ARTICLE ( WHERE ps= paramArticle ) ) ) | ( RUBRIQUE ( DONT ARTICLE ( WHERE ps= paramArticle ) ) ) | ( DATE ( DONT ARTICLE ( WHERE ps= paramArticle ) ) ) ) )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:75:3: SELECT ( ( ( ARTICLE | COUNT ) ( ( WHERE ps= paramArticle | DONT ( TITRE WHERE ps= paramTitre | RUBRIQUE WHERE ps= paramRubrique | AUTEUR WHERE ps= paramAuteur ) | DATE ps= paramDate ) ) | ( ARTICLE ET ( DATE ( DONT ARTICLE WHERE | ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) ) ) | RUBRIQUE ( DONT ARTICLE WHERE | ( ET DATE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) ) ) | AUTEUR ( DONT ARTICLE WHERE | ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) | ET DATE ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) ) ) ) ps1= paramArticle ) ) | ( ( AUTEUR ) ( DONT ARTICLE ( WHERE ps= paramArticle ) ) ) | ( RUBRIQUE ( DONT ARTICLE ( WHERE ps= paramArticle ) ) ) | ( DATE ( DONT ARTICLE ( WHERE ps= paramArticle ) ) ) )
			{
			match(input,SELECT,FOLLOW_SELECT_in_requete312); 

							req_arbre.ajouteFils(new Arbre("","select distinct"));
						
			// /volsme/users/lo17a013/Antlr/categorie_1.g:79:3: ( ( ( ARTICLE | COUNT ) ( ( WHERE ps= paramArticle | DONT ( TITRE WHERE ps= paramTitre | RUBRIQUE WHERE ps= paramRubrique | AUTEUR WHERE ps= paramAuteur ) | DATE ps= paramDate ) ) | ( ARTICLE ET ( DATE ( DONT ARTICLE WHERE | ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) ) ) | RUBRIQUE ( DONT ARTICLE WHERE | ( ET DATE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) ) ) | AUTEUR ( DONT ARTICLE WHERE | ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) | ET DATE ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) ) ) ) ps1= paramArticle ) ) | ( ( AUTEUR ) ( DONT ARTICLE ( WHERE ps= paramArticle ) ) ) | ( RUBRIQUE ( DONT ARTICLE ( WHERE ps= paramArticle ) ) ) | ( DATE ( DONT ARTICLE ( WHERE ps= paramArticle ) ) ) )
			int alt18=4;
			switch ( input.LA(1) ) {
			case ARTICLE:
			case COUNT:
				{
				alt18=1;
				}
				break;
			case AUTEUR:
				{
				alt18=2;
				}
				break;
			case RUBRIQUE:
				{
				alt18=3;
				}
				break;
			case DATE:
				{
				alt18=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// /volsme/users/lo17a013/Antlr/categorie_1.g:79:4: ( ( ARTICLE | COUNT ) ( ( WHERE ps= paramArticle | DONT ( TITRE WHERE ps= paramTitre | RUBRIQUE WHERE ps= paramRubrique | AUTEUR WHERE ps= paramAuteur ) | DATE ps= paramDate ) ) | ( ARTICLE ET ( DATE ( DONT ARTICLE WHERE | ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) ) ) | RUBRIQUE ( DONT ARTICLE WHERE | ( ET DATE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) ) ) | AUTEUR ( DONT ARTICLE WHERE | ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) | ET DATE ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) ) ) ) ps1= paramArticle ) )
					{
					// /volsme/users/lo17a013/Antlr/categorie_1.g:79:4: ( ( ARTICLE | COUNT ) ( ( WHERE ps= paramArticle | DONT ( TITRE WHERE ps= paramTitre | RUBRIQUE WHERE ps= paramRubrique | AUTEUR WHERE ps= paramAuteur ) | DATE ps= paramDate ) ) | ( ARTICLE ET ( DATE ( DONT ARTICLE WHERE | ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) ) ) | RUBRIQUE ( DONT ARTICLE WHERE | ( ET DATE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) ) ) | AUTEUR ( DONT ARTICLE WHERE | ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) | ET DATE ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) ) ) ) ps1= paramArticle ) )
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==ARTICLE) ) {
						int LA17_1 = input.LA(2);
						if ( (LA17_1==DATE||LA17_1==DONT||LA17_1==WHERE) ) {
							alt17=1;
						}
						else if ( (LA17_1==ET) ) {
							alt17=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 17, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA17_0==COUNT) ) {
						alt17=1;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 17, 0, input);
						throw nvae;
					}

					switch (alt17) {
						case 1 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:79:5: ( ARTICLE | COUNT ) ( ( WHERE ps= paramArticle | DONT ( TITRE WHERE ps= paramTitre | RUBRIQUE WHERE ps= paramRubrique | AUTEUR WHERE ps= paramAuteur ) | DATE ps= paramDate ) )
							{
							// /volsme/users/lo17a013/Antlr/categorie_1.g:79:5: ( ARTICLE | COUNT )
							int alt1=2;
							int LA1_0 = input.LA(1);
							if ( (LA1_0==ARTICLE) ) {
								alt1=1;
							}
							else if ( (LA1_0==COUNT) ) {
								alt1=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 1, 0, input);
								throw nvae;
							}

							switch (alt1) {
								case 1 :
									// /volsme/users/lo17a013/Antlr/categorie_1.g:79:6: ARTICLE
									{
									match(input,ARTICLE,FOLLOW_ARTICLE_in_requete326); 

											req_arbre.ajouteFils(new Arbre("","TT.fichier"));
											
									}
									break;
								case 2 :
									// /volsme/users/lo17a013/Antlr/categorie_1.g:83:5: COUNT
									{
									match(input,COUNT,FOLLOW_COUNT_in_requete337); 

											req_arbre.ajouteFils(new Arbre("","COUNT(TT.fichier)"));
											
									}
									break;

							}

							// /volsme/users/lo17a013/Antlr/categorie_1.g:88:3: ( ( WHERE ps= paramArticle | DONT ( TITRE WHERE ps= paramTitre | RUBRIQUE WHERE ps= paramRubrique | AUTEUR WHERE ps= paramAuteur ) | DATE ps= paramDate ) )
							// /volsme/users/lo17a013/Antlr/categorie_1.g:88:4: ( WHERE ps= paramArticle | DONT ( TITRE WHERE ps= paramTitre | RUBRIQUE WHERE ps= paramRubrique | AUTEUR WHERE ps= paramAuteur ) | DATE ps= paramDate )
							{
							// /volsme/users/lo17a013/Antlr/categorie_1.g:88:4: ( WHERE ps= paramArticle | DONT ( TITRE WHERE ps= paramTitre | RUBRIQUE WHERE ps= paramRubrique | AUTEUR WHERE ps= paramAuteur ) | DATE ps= paramDate )
							int alt3=3;
							switch ( input.LA(1) ) {
							case WHERE:
								{
								alt3=1;
								}
								break;
							case DONT:
								{
								alt3=2;
								}
								break;
							case DATE:
								{
								alt3=3;
								}
								break;
							default:
								NoViableAltException nvae =
									new NoViableAltException("", 3, 0, input);
								throw nvae;
							}
							switch (alt3) {
								case 1 :
									// /volsme/users/lo17a013/Antlr/categorie_1.g:88:5: WHERE ps= paramArticle
									{
									match(input,WHERE,FOLLOW_WHERE_in_requete351); 
									pushFollow(FOLLOW_paramArticle_in_requete361);
									ps=paramArticle();
									state._fsp--;


												req_arbre.ajouteFils(new Arbre("","from titretexte TT"));
												req_arbre.ajouteFils(new Arbre("","where"));
												ps_arbre = ps;
												req_arbre.ajouteFils(ps_arbre);
												
									}
									break;
								case 2 :
									// /volsme/users/lo17a013/Antlr/categorie_1.g:97:3: DONT ( TITRE WHERE ps= paramTitre | RUBRIQUE WHERE ps= paramRubrique | AUTEUR WHERE ps= paramAuteur )
									{
									match(input,DONT,FOLLOW_DONT_in_requete375); 
									// /volsme/users/lo17a013/Antlr/categorie_1.g:98:3: ( TITRE WHERE ps= paramTitre | RUBRIQUE WHERE ps= paramRubrique | AUTEUR WHERE ps= paramAuteur )
									int alt2=3;
									switch ( input.LA(1) ) {
									case TITRE:
										{
										alt2=1;
										}
										break;
									case RUBRIQUE:
										{
										alt2=2;
										}
										break;
									case AUTEUR:
										{
										alt2=3;
										}
										break;
									default:
										NoViableAltException nvae =
											new NoViableAltException("", 2, 0, input);
										throw nvae;
									}
									switch (alt2) {
										case 1 :
											// /volsme/users/lo17a013/Antlr/categorie_1.g:98:4: TITRE WHERE ps= paramTitre
											{
											match(input,TITRE,FOLLOW_TITRE_in_requete381); 
											match(input,WHERE,FOLLOW_WHERE_in_requete383); 
											pushFollow(FOLLOW_paramTitre_in_requete389);
											ps=paramTitre();
											state._fsp--;


														req_arbre.ajouteFils(new Arbre("","from titre TT"));
														req_arbre.ajouteFils(new Arbre("","where"));
														ps_arbre = ps;
														req_arbre.ajouteFils(ps_arbre);
														
											}
											break;
										case 2 :
											// /volsme/users/lo17a013/Antlr/categorie_1.g:105:6: RUBRIQUE WHERE ps= paramRubrique
											{
											match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete401); 
											match(input,WHERE,FOLLOW_WHERE_in_requete403); 
											pushFollow(FOLLOW_paramRubrique_in_requete409);
											ps=paramRubrique();
											state._fsp--;


														req_arbre.ajouteFils(new Arbre("","from rubrique TT"));
														req_arbre.ajouteFils(new Arbre("","where"));
														ps_arbre = ps;
														req_arbre.ajouteFils(ps_arbre);
														
											}
											break;
										case 3 :
											// /volsme/users/lo17a013/Antlr/categorie_1.g:112:6: AUTEUR WHERE ps= paramAuteur
											{
											match(input,AUTEUR,FOLLOW_AUTEUR_in_requete422); 
											match(input,WHERE,FOLLOW_WHERE_in_requete424); 
											pushFollow(FOLLOW_paramAuteur_in_requete429);
											ps=paramAuteur();
											state._fsp--;


														req_arbre.ajouteFils(new Arbre("","from email TT"));
														req_arbre.ajouteFils(new Arbre("","where"));
														ps_arbre = ps;
														req_arbre.ajouteFils(ps_arbre);
														
											}
											break;

									}

									}
									break;
								case 3 :
									// /volsme/users/lo17a013/Antlr/categorie_1.g:121:3: DATE ps= paramDate
									{
									match(input,DATE,FOLLOW_DATE_in_requete447); 
									pushFollow(FOLLOW_paramDate_in_requete454);
									ps=paramDate();
									state._fsp--;


												req_arbre.ajouteFils(new Arbre("","from date TT"));
												req_arbre.ajouteFils(new Arbre("","where"));
												ps_arbre = ps;
												req_arbre.ajouteFils(ps_arbre);
												
									}
									break;

							}

							}

							}
							break;
						case 2 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:130:3: ( ARTICLE ET ( DATE ( DONT ARTICLE WHERE | ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) ) ) | RUBRIQUE ( DONT ARTICLE WHERE | ( ET DATE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) ) ) | AUTEUR ( DONT ARTICLE WHERE | ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) | ET DATE ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) ) ) ) ps1= paramArticle )
							{
							// /volsme/users/lo17a013/Antlr/categorie_1.g:130:3: ( ARTICLE ET ( DATE ( DONT ARTICLE WHERE | ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) ) ) | RUBRIQUE ( DONT ARTICLE WHERE | ( ET DATE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) ) ) | AUTEUR ( DONT ARTICLE WHERE | ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) | ET DATE ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) ) ) ) ps1= paramArticle )
							// /volsme/users/lo17a013/Antlr/categorie_1.g:130:4: ARTICLE ET ( DATE ( DONT ARTICLE WHERE | ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) ) ) | RUBRIQUE ( DONT ARTICLE WHERE | ( ET DATE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) ) ) | AUTEUR ( DONT ARTICLE WHERE | ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) | ET DATE ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) ) ) ) ps1= paramArticle
							{
							match(input,ARTICLE,FOLLOW_ARTICLE_in_requete474); 

									req_arbre.ajouteFils(new Arbre("","TT.fichier"));
									
							match(input,ET,FOLLOW_ET_in_requete483); 
							// /volsme/users/lo17a013/Antlr/categorie_1.g:135:3: ( DATE ( DONT ARTICLE WHERE | ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) ) ) | RUBRIQUE ( DONT ARTICLE WHERE | ( ET DATE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) ) ) | AUTEUR ( DONT ARTICLE WHERE | ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) | ET DATE ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) ) ) )
							int alt16=3;
							switch ( input.LA(1) ) {
							case DATE:
								{
								alt16=1;
								}
								break;
							case RUBRIQUE:
								{
								alt16=2;
								}
								break;
							case AUTEUR:
								{
								alt16=3;
								}
								break;
							default:
								NoViableAltException nvae =
									new NoViableAltException("", 16, 0, input);
								throw nvae;
							}
							switch (alt16) {
								case 1 :
									// /volsme/users/lo17a013/Antlr/categorie_1.g:135:4: DATE ( DONT ARTICLE WHERE | ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) ) )
									{
									match(input,DATE,FOLLOW_DATE_in_requete489); 

											req_arbre.ajouteFils(new Arbre("",", D.jour, D.mois, D.annee"));
											
									// /volsme/users/lo17a013/Antlr/categorie_1.g:139:3: ( DONT ARTICLE WHERE | ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) ) )
									int alt7=2;
									int LA7_0 = input.LA(1);
									if ( (LA7_0==DONT) ) {
										alt7=1;
									}
									else if ( (LA7_0==ET) ) {
										alt7=2;
									}

									else {
										NoViableAltException nvae =
											new NoViableAltException("", 7, 0, input);
										throw nvae;
									}

									switch (alt7) {
										case 1 :
											// /volsme/users/lo17a013/Antlr/categorie_1.g:139:4: DONT ARTICLE WHERE
											{
											match(input,DONT,FOLLOW_DONT_in_requete498); 
											match(input,ARTICLE,FOLLOW_ARTICLE_in_requete500); 
											match(input,WHERE,FOLLOW_WHERE_in_requete503); 

													req_arbre.ajouteFils(new Arbre("","from titretexte TT JOIN date D ON TT.fichier = D.fichier"));
													req_arbre.ajouteFils(new Arbre("","where"));
													
											}
											break;
										case 2 :
											// /volsme/users/lo17a013/Antlr/categorie_1.g:144:5: ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) )
											{
											// /volsme/users/lo17a013/Antlr/categorie_1.g:144:5: ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) )
											int alt6=2;
											int LA6_0 = input.LA(1);
											if ( (LA6_0==ET) ) {
												int LA6_1 = input.LA(2);
												if ( (LA6_1==RUBRIQUE) ) {
													alt6=1;
												}
												else if ( (LA6_1==AUTEUR) ) {
													alt6=2;
												}

												else {
													int nvaeMark = input.mark();
													try {
														input.consume();
														NoViableAltException nvae =
															new NoViableAltException("", 6, 1, input);
														throw nvae;
													} finally {
														input.rewind(nvaeMark);
													}
												}

											}

											else {
												NoViableAltException nvae =
													new NoViableAltException("", 6, 0, input);
												throw nvae;
											}

											switch (alt6) {
												case 1 :
													// /volsme/users/lo17a013/Antlr/categorie_1.g:144:6: ET RUBRIQUE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE )
													{
													match(input,ET,FOLLOW_ET_in_requete515); 
													match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete517); 

															req_arbre.ajouteFils(new Arbre("",", R.rubrique"));
															
													// /volsme/users/lo17a013/Antlr/categorie_1.g:148:3: ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE )
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
															// /volsme/users/lo17a013/Antlr/categorie_1.g:148:4: DONT ARTICLE WHERE
															{
															match(input,DONT,FOLLOW_DONT_in_requete527); 
															match(input,ARTICLE,FOLLOW_ARTICLE_in_requete529); 
															match(input,WHERE,FOLLOW_WHERE_in_requete531); 

																	req_arbre.ajouteFils(new Arbre("","from titretexte TT JOIN date D ON TT.fichier = D.fichier"));
																	req_arbre.ajouteFils(new Arbre("","JOIN rubrique R ON TT.fichier = R.fichier"));
																	req_arbre.ajouteFils(new Arbre("","where"));
																	
															}
															break;
														case 2 :
															// /volsme/users/lo17a013/Antlr/categorie_1.g:154:5: ET AUTEUR DONT ARTICLE WHERE
															{
															match(input,ET,FOLLOW_ET_in_requete542); 
															match(input,AUTEUR,FOLLOW_AUTEUR_in_requete544); 

																	req_arbre.ajouteFils(new Arbre("",", C.email"));
																	
															match(input,DONT,FOLLOW_DONT_in_requete553); 
															match(input,ARTICLE,FOLLOW_ARTICLE_in_requete555); 
															match(input,WHERE,FOLLOW_WHERE_in_requete558); 

																	req_arbre.ajouteFils(new Arbre("","from titretexte TT JOIN date D ON TT.fichier = D.fichier"));
																	req_arbre.ajouteFils(new Arbre("","JOIN rubrique R ON TT.fichier = R.fichier"));
																	req_arbre.ajouteFils(new Arbre("","JOIN email C ON TT.fichier = C.fichier"));
																	req_arbre.ajouteFils(new Arbre("","where"));
																	
															}
															break;

													}

													}
													break;
												case 2 :
													// /volsme/users/lo17a013/Antlr/categorie_1.g:165:5: ET AUTEUR ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE )
													{
													match(input,ET,FOLLOW_ET_in_requete570); 
													match(input,AUTEUR,FOLLOW_AUTEUR_in_requete572); 

															req_arbre.ajouteFils(new Arbre("",", C.email"));
															
													// /volsme/users/lo17a013/Antlr/categorie_1.g:169:3: ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE )
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
															// /volsme/users/lo17a013/Antlr/categorie_1.g:169:4: DONT ARTICLE WHERE
															{
															match(input,DONT,FOLLOW_DONT_in_requete582); 
															match(input,ARTICLE,FOLLOW_ARTICLE_in_requete584); 
															match(input,WHERE,FOLLOW_WHERE_in_requete587); 

																	req_arbre.ajouteFils(new Arbre("","from titretexte TT JOIN date D ON TT.fichier = D.fichier"));
																	req_arbre.ajouteFils(new Arbre("","JOIN email C ON TT.fichier = C.fichier"));
																	req_arbre.ajouteFils(new Arbre("","where"));
																	
															}
															break;
														case 2 :
															// /volsme/users/lo17a013/Antlr/categorie_1.g:175:5: ET RUBRIQUE DONT ARTICLE WHERE
															{
															match(input,ET,FOLLOW_ET_in_requete598); 
															match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete600); 

																	req_arbre.ajouteFils(new Arbre("",", R.rubrique"));
																	
															match(input,DONT,FOLLOW_DONT_in_requete608); 
															match(input,ARTICLE,FOLLOW_ARTICLE_in_requete610); 
															match(input,WHERE,FOLLOW_WHERE_in_requete613); 

																	req_arbre.ajouteFils(new Arbre("","from titretexte TT JOIN date D ON TT.fichier = D.fichier"));
																	req_arbre.ajouteFils(new Arbre("","JOIN email C ON TT.fichier = C.fichier"));
																	req_arbre.ajouteFils(new Arbre("","JOIN rubrique R ON TT.fichier = R.fichier"));
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
									// /volsme/users/lo17a013/Antlr/categorie_1.g:188:5: RUBRIQUE ( DONT ARTICLE WHERE | ( ET DATE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) ) )
									{
									match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete633); 

											req_arbre.ajouteFils(new Arbre("",", R.rubrique"));
											
									// /volsme/users/lo17a013/Antlr/categorie_1.g:192:3: ( DONT ARTICLE WHERE | ( ET DATE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) ) )
									int alt11=2;
									int LA11_0 = input.LA(1);
									if ( (LA11_0==DONT) ) {
										alt11=1;
									}
									else if ( (LA11_0==ET) ) {
										alt11=2;
									}

									else {
										NoViableAltException nvae =
											new NoViableAltException("", 11, 0, input);
										throw nvae;
									}

									switch (alt11) {
										case 1 :
											// /volsme/users/lo17a013/Antlr/categorie_1.g:192:4: DONT ARTICLE WHERE
											{
											match(input,DONT,FOLLOW_DONT_in_requete643); 
											match(input,ARTICLE,FOLLOW_ARTICLE_in_requete645); 
											match(input,WHERE,FOLLOW_WHERE_in_requete648); 

													req_arbre.ajouteFils(new Arbre("","from titretexte TT JOIN rubrique R ON TT.fichier = R.fichier"));
													req_arbre.ajouteFils(new Arbre("","where"));
													
											}
											break;
										case 2 :
											// /volsme/users/lo17a013/Antlr/categorie_1.g:197:5: ( ET DATE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) )
											{
											// /volsme/users/lo17a013/Antlr/categorie_1.g:197:5: ( ET DATE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE ) | ET AUTEUR ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) )
											int alt10=2;
											int LA10_0 = input.LA(1);
											if ( (LA10_0==ET) ) {
												int LA10_1 = input.LA(2);
												if ( (LA10_1==DATE) ) {
													alt10=1;
												}
												else if ( (LA10_1==AUTEUR) ) {
													alt10=2;
												}

												else {
													int nvaeMark = input.mark();
													try {
														input.consume();
														NoViableAltException nvae =
															new NoViableAltException("", 10, 1, input);
														throw nvae;
													} finally {
														input.rewind(nvaeMark);
													}
												}

											}

											else {
												NoViableAltException nvae =
													new NoViableAltException("", 10, 0, input);
												throw nvae;
											}

											switch (alt10) {
												case 1 :
													// /volsme/users/lo17a013/Antlr/categorie_1.g:197:6: ET DATE ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE )
													{
													match(input,ET,FOLLOW_ET_in_requete660); 
													match(input,DATE,FOLLOW_DATE_in_requete662); 

															req_arbre.ajouteFils(new Arbre("",", D.jour, D.mois, D.annee"));
															
													// /volsme/users/lo17a013/Antlr/categorie_1.g:201:3: ( DONT ARTICLE WHERE | ET AUTEUR DONT ARTICLE WHERE )
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
															// /volsme/users/lo17a013/Antlr/categorie_1.g:201:4: DONT ARTICLE WHERE
															{
															match(input,DONT,FOLLOW_DONT_in_requete672); 
															match(input,ARTICLE,FOLLOW_ARTICLE_in_requete674); 
															match(input,WHERE,FOLLOW_WHERE_in_requete677); 

																	req_arbre.ajouteFils(new Arbre("","from titretexte TT JOIN rubrique R ON TT.fichier = R.fichier"));
																	req_arbre.ajouteFils(new Arbre(""," JOIN date D ON TT.fichier = D.fichier"));
																	req_arbre.ajouteFils(new Arbre("","where"));
																	
															}
															break;
														case 2 :
															// /volsme/users/lo17a013/Antlr/categorie_1.g:207:5: ET AUTEUR DONT ARTICLE WHERE
															{
															match(input,ET,FOLLOW_ET_in_requete688); 
															match(input,AUTEUR,FOLLOW_AUTEUR_in_requete690); 

																	req_arbre.ajouteFils(new Arbre("",", C.email"));
																	
															match(input,DONT,FOLLOW_DONT_in_requete698); 
															match(input,ARTICLE,FOLLOW_ARTICLE_in_requete700); 
															match(input,WHERE,FOLLOW_WHERE_in_requete703); 

																	req_arbre.ajouteFils(new Arbre("","from titretexte TT JOIN rubrique R ON TT.fichier = R.fichier"));
																	req_arbre.ajouteFils(new Arbre(""," JOIN date D ON TT.fichier = D.fichier"));
																	req_arbre.ajouteFils(new Arbre(""," JOIN email C ON TT.fichier = C.fichier"));
																	req_arbre.ajouteFils(new Arbre("","where"));
																	
															}
															break;

													}

													}
													break;
												case 2 :
													// /volsme/users/lo17a013/Antlr/categorie_1.g:218:5: ET AUTEUR ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE )
													{
													match(input,ET,FOLLOW_ET_in_requete715); 
													match(input,AUTEUR,FOLLOW_AUTEUR_in_requete717); 

															req_arbre.ajouteFils(new Arbre("",", C.email"));
															
													// /volsme/users/lo17a013/Antlr/categorie_1.g:222:3: ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE )
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
															// /volsme/users/lo17a013/Antlr/categorie_1.g:222:4: DONT ARTICLE WHERE
															{
															match(input,DONT,FOLLOW_DONT_in_requete727); 
															match(input,ARTICLE,FOLLOW_ARTICLE_in_requete729); 
															match(input,WHERE,FOLLOW_WHERE_in_requete732); 

																	req_arbre.ajouteFils(new Arbre("","from titretexte TT JOIN rubrique R ON TT.fichier = R.fichier"));
																	req_arbre.ajouteFils(new Arbre(""," JOIN rubrique R ON TT.fichier = R.fichier"));
																	req_arbre.ajouteFils(new Arbre(""," JOIN email C ON TT.fichier = C.fichier"));
																	req_arbre.ajouteFils(new Arbre("","where"));
																	
															}
															break;
														case 2 :
															// /volsme/users/lo17a013/Antlr/categorie_1.g:229:5: ET DATE DONT ARTICLE WHERE
															{
															match(input,ET,FOLLOW_ET_in_requete743); 
															match(input,DATE,FOLLOW_DATE_in_requete745); 

																	req_arbre.ajouteFils(new Arbre("",", D.jour, D.mois, D.annee"));
																	
															match(input,DONT,FOLLOW_DONT_in_requete753); 
															match(input,ARTICLE,FOLLOW_ARTICLE_in_requete755); 
															match(input,WHERE,FOLLOW_WHERE_in_requete758); 

																	req_arbre.ajouteFils(new Arbre("","from titretexte TT JOIN rubrique R ON TT.fichier = R.fichier"));
																	req_arbre.ajouteFils(new Arbre(""," JOIN rubrique R ON TT.fichier = R.fichier"));
																	req_arbre.ajouteFils(new Arbre(""," JOIN email C ON TT.fichier = C.fichier"));
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
									// /volsme/users/lo17a013/Antlr/categorie_1.g:242:5: AUTEUR ( DONT ARTICLE WHERE | ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) | ET DATE ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) ) )
									{
									match(input,AUTEUR,FOLLOW_AUTEUR_in_requete778); 

											req_arbre.ajouteFils(new Arbre("",", C.email"));
											
									// /volsme/users/lo17a013/Antlr/categorie_1.g:246:3: ( DONT ARTICLE WHERE | ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) | ET DATE ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) ) )
									int alt15=2;
									int LA15_0 = input.LA(1);
									if ( (LA15_0==DONT) ) {
										alt15=1;
									}
									else if ( (LA15_0==ET) ) {
										alt15=2;
									}

									else {
										NoViableAltException nvae =
											new NoViableAltException("", 15, 0, input);
										throw nvae;
									}

									switch (alt15) {
										case 1 :
											// /volsme/users/lo17a013/Antlr/categorie_1.g:246:4: DONT ARTICLE WHERE
											{
											match(input,DONT,FOLLOW_DONT_in_requete788); 
											match(input,ARTICLE,FOLLOW_ARTICLE_in_requete790); 
											match(input,WHERE,FOLLOW_WHERE_in_requete793); 

													req_arbre.ajouteFils(new Arbre("","from titretexte TT JOIN email C ON TT.fichier = C.fichier"));
													req_arbre.ajouteFils(new Arbre("","where"));
													
											}
											break;
										case 2 :
											// /volsme/users/lo17a013/Antlr/categorie_1.g:251:5: ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) | ET DATE ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) )
											{
											// /volsme/users/lo17a013/Antlr/categorie_1.g:251:5: ( ET RUBRIQUE ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE ) | ET DATE ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE ) )
											int alt14=2;
											int LA14_0 = input.LA(1);
											if ( (LA14_0==ET) ) {
												int LA14_1 = input.LA(2);
												if ( (LA14_1==RUBRIQUE) ) {
													alt14=1;
												}
												else if ( (LA14_1==DATE) ) {
													alt14=2;
												}

												else {
													int nvaeMark = input.mark();
													try {
														input.consume();
														NoViableAltException nvae =
															new NoViableAltException("", 14, 1, input);
														throw nvae;
													} finally {
														input.rewind(nvaeMark);
													}
												}

											}

											else {
												NoViableAltException nvae =
													new NoViableAltException("", 14, 0, input);
												throw nvae;
											}

											switch (alt14) {
												case 1 :
													// /volsme/users/lo17a013/Antlr/categorie_1.g:251:6: ET RUBRIQUE ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE )
													{
													match(input,ET,FOLLOW_ET_in_requete805); 
													match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete807); 

															req_arbre.ajouteFils(new Arbre("",", R.rubrique"));
															
													// /volsme/users/lo17a013/Antlr/categorie_1.g:255:3: ( DONT ARTICLE WHERE | ET DATE DONT ARTICLE WHERE )
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
															// /volsme/users/lo17a013/Antlr/categorie_1.g:255:4: DONT ARTICLE WHERE
															{
															match(input,DONT,FOLLOW_DONT_in_requete816); 
															match(input,ARTICLE,FOLLOW_ARTICLE_in_requete818); 
															match(input,WHERE,FOLLOW_WHERE_in_requete821); 

																	req_arbre.ajouteFils(new Arbre("","from titretexte TT JOIN email C ON TT.fichier = C.fichier"));
																	req_arbre.ajouteFils(new Arbre("","JOIN rubrique R ON TT.fichier = R.fichier"));
																	req_arbre.ajouteFils(new Arbre("","where"));
																	
															}
															break;
														case 2 :
															// /volsme/users/lo17a013/Antlr/categorie_1.g:261:5: ET DATE DONT ARTICLE WHERE
															{
															match(input,ET,FOLLOW_ET_in_requete832); 
															match(input,DATE,FOLLOW_DATE_in_requete834); 

																	req_arbre.ajouteFils(new Arbre("",", D.jour, D.mois, D.annee"));
																	
															match(input,DONT,FOLLOW_DONT_in_requete842); 
															match(input,ARTICLE,FOLLOW_ARTICLE_in_requete844); 
															match(input,WHERE,FOLLOW_WHERE_in_requete847); 

																	req_arbre.ajouteFils(new Arbre("","from titretexte TT JOIN email C ON TT.fichier = C.fichier"));
																	req_arbre.ajouteFils(new Arbre("","JOIN rubrique R ON TT.fichier = R.fichier"));
																	req_arbre.ajouteFils(new Arbre("","JOIN date D ON TT.fichier = D.fichier"));
																	req_arbre.ajouteFils(new Arbre("","where"));
																	
															}
															break;

													}

													}
													break;
												case 2 :
													// /volsme/users/lo17a013/Antlr/categorie_1.g:272:5: ET DATE ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE )
													{
													match(input,ET,FOLLOW_ET_in_requete859); 
													match(input,DATE,FOLLOW_DATE_in_requete861); 

															req_arbre.ajouteFils(new Arbre("",", D.jour, D.mois, D.annee"));
															
													// /volsme/users/lo17a013/Antlr/categorie_1.g:276:3: ( DONT ARTICLE WHERE | ET RUBRIQUE DONT ARTICLE WHERE )
													int alt13=2;
													int LA13_0 = input.LA(1);
													if ( (LA13_0==DONT) ) {
														alt13=1;
													}
													else if ( (LA13_0==ET) ) {
														alt13=2;
													}

													else {
														NoViableAltException nvae =
															new NoViableAltException("", 13, 0, input);
														throw nvae;
													}

													switch (alt13) {
														case 1 :
															// /volsme/users/lo17a013/Antlr/categorie_1.g:276:4: DONT ARTICLE WHERE
															{
															match(input,DONT,FOLLOW_DONT_in_requete870); 
															match(input,ARTICLE,FOLLOW_ARTICLE_in_requete872); 
															match(input,WHERE,FOLLOW_WHERE_in_requete875); 

																	req_arbre.ajouteFils(new Arbre("","from titretexte TT JOIN email C ON TT.fichier = C.fichier"));
																	req_arbre.ajouteFils(new Arbre("","JOIN date D ON TT.fichier = D.fichier"));
																	req_arbre.ajouteFils(new Arbre("","where"));
																	
															}
															break;
														case 2 :
															// /volsme/users/lo17a013/Antlr/categorie_1.g:282:5: ET RUBRIQUE DONT ARTICLE WHERE
															{
															match(input,ET,FOLLOW_ET_in_requete886); 
															match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete888); 

																	req_arbre.ajouteFils(new Arbre("",", R.rubrique"));
																	
															match(input,DONT,FOLLOW_DONT_in_requete897); 
															match(input,ARTICLE,FOLLOW_ARTICLE_in_requete899); 
															match(input,WHERE,FOLLOW_WHERE_in_requete902); 

																	req_arbre.ajouteFils(new Arbre("","from titretexte TT JOIN email C ON TT.fichier = C.fichier"));
																	req_arbre.ajouteFils(new Arbre("","JOIN date D ON TT.fichier = D.fichier"));
																	req_arbre.ajouteFils(new Arbre("","JOIN rubrique R ON TT.fichier = R.fichier"));
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

							pushFollow(FOLLOW_paramArticle_in_requete928);
							ps1=paramArticle();
							state._fsp--;


									ps_arbre = ps1;
									req_arbre.ajouteFils(ps_arbre);
									
							}

							}
							break;

					}

					}
					break;
				case 2 :
					// /volsme/users/lo17a013/Antlr/categorie_1.g:303:3: ( ( AUTEUR ) ( DONT ARTICLE ( WHERE ps= paramArticle ) ) )
					{
					// /volsme/users/lo17a013/Antlr/categorie_1.g:303:3: ( ( AUTEUR ) ( DONT ARTICLE ( WHERE ps= paramArticle ) ) )
					// /volsme/users/lo17a013/Antlr/categorie_1.g:303:4: ( AUTEUR ) ( DONT ARTICLE ( WHERE ps= paramArticle ) )
					{
					// /volsme/users/lo17a013/Antlr/categorie_1.g:303:4: ( AUTEUR )
					// /volsme/users/lo17a013/Antlr/categorie_1.g:303:6: AUTEUR
					{
					match(input,AUTEUR,FOLLOW_AUTEUR_in_requete948); 

								req_arbre.ajouteFils(new Arbre("","C.email"));
								req_arbre.ajouteFils(new Arbre("","from email C JOIN titretexte TT ON C.fichier = TT.fichier"));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
								
					}

					// /volsme/users/lo17a013/Antlr/categorie_1.g:312:3: ( DONT ARTICLE ( WHERE ps= paramArticle ) )
					// /volsme/users/lo17a013/Antlr/categorie_1.g:312:4: DONT ARTICLE ( WHERE ps= paramArticle )
					{
					match(input,DONT,FOLLOW_DONT_in_requete963); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete965); 
					// /volsme/users/lo17a013/Antlr/categorie_1.g:313:3: ( WHERE ps= paramArticle )
					// /volsme/users/lo17a013/Antlr/categorie_1.g:313:4: WHERE ps= paramArticle
					{
					match(input,WHERE,FOLLOW_WHERE_in_requete971); 
					pushFollow(FOLLOW_paramArticle_in_requete978);
					ps=paramArticle();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("","where"));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
								
					}

					}

					}

					}
					break;
				case 3 :
					// /volsme/users/lo17a013/Antlr/categorie_1.g:322:3: ( RUBRIQUE ( DONT ARTICLE ( WHERE ps= paramArticle ) ) )
					{
					// /volsme/users/lo17a013/Antlr/categorie_1.g:322:3: ( RUBRIQUE ( DONT ARTICLE ( WHERE ps= paramArticle ) ) )
					// /volsme/users/lo17a013/Antlr/categorie_1.g:322:4: RUBRIQUE ( DONT ARTICLE ( WHERE ps= paramArticle ) )
					{
					match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete1002); 

								req_arbre.ajouteFils(new Arbre("","R.rubrique"));
								req_arbre.ajouteFils(new Arbre("","from rubrique R JOIN titretexte TT ON R.fichier = TT.fichier"));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					// /volsme/users/lo17a013/Antlr/categorie_1.g:329:3: ( DONT ARTICLE ( WHERE ps= paramArticle ) )
					// /volsme/users/lo17a013/Antlr/categorie_1.g:329:4: DONT ARTICLE ( WHERE ps= paramArticle )
					{
					match(input,DONT,FOLLOW_DONT_in_requete1012); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1014); 
					// /volsme/users/lo17a013/Antlr/categorie_1.g:330:3: ( WHERE ps= paramArticle )
					// /volsme/users/lo17a013/Antlr/categorie_1.g:330:4: WHERE ps= paramArticle
					{
					match(input,WHERE,FOLLOW_WHERE_in_requete1020); 
					pushFollow(FOLLOW_paramArticle_in_requete1027);
					ps=paramArticle();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("","where"));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
								
					}

					}

					}

					}
					break;
				case 4 :
					// /volsme/users/lo17a013/Antlr/categorie_1.g:339:3: ( DATE ( DONT ARTICLE ( WHERE ps= paramArticle ) ) )
					{
					// /volsme/users/lo17a013/Antlr/categorie_1.g:339:3: ( DATE ( DONT ARTICLE ( WHERE ps= paramArticle ) ) )
					// /volsme/users/lo17a013/Antlr/categorie_1.g:339:4: DATE ( DONT ARTICLE ( WHERE ps= paramArticle ) )
					{
					match(input,DATE,FOLLOW_DATE_in_requete1051); 

								req_arbre.ajouteFils(new Arbre("","D.jour, D.mois, D.annee"));
								req_arbre.ajouteFils(new Arbre("","from date D JOIN titretexte TT ON D.fichier = TT.fichier"));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
							
					// /volsme/users/lo17a013/Antlr/categorie_1.g:346:3: ( DONT ARTICLE ( WHERE ps= paramArticle ) )
					// /volsme/users/lo17a013/Antlr/categorie_1.g:346:4: DONT ARTICLE ( WHERE ps= paramArticle )
					{
					match(input,DONT,FOLLOW_DONT_in_requete1060); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete1062); 
					// /volsme/users/lo17a013/Antlr/categorie_1.g:347:3: ( WHERE ps= paramArticle )
					// /volsme/users/lo17a013/Antlr/categorie_1.g:347:4: WHERE ps= paramArticle
					{
					match(input,WHERE,FOLLOW_WHERE_in_requete1068); 
					pushFollow(FOLLOW_paramArticle_in_requete1075);
					ps=paramArticle();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("","where"));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
								
					}

					}

					}

					}
					break;

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



	// $ANTLR start "paramAuteur"
	// /volsme/users/lo17a013/Antlr/categorie_1.g:358:1: paramAuteur returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= paramA ( ( ET | OU ) ( ( NOT par2= paramA ) | (par2= paramA ) ) )* ;
	public final Arbre paramAuteur() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// /volsme/users/lo17a013/Antlr/categorie_1.g:359:40: (par1= paramA ( ( ET | OU ) ( ( NOT par2= paramA ) | (par2= paramA ) ) )* )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:360:3: par1= paramA ( ( ET | OU ) ( ( NOT par2= paramA ) | (par2= paramA ) ) )*
			{
			pushFollow(FOLLOW_paramA_in_paramAuteur1120);
			par1=paramA();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// /volsme/users/lo17a013/Antlr/categorie_1.g:365:3: ( ( ET | OU ) ( ( NOT par2= paramA ) | (par2= paramA ) ) )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==ET||LA21_0==OU) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// /volsme/users/lo17a013/Antlr/categorie_1.g:365:4: ( ET | OU ) ( ( NOT par2= paramA ) | (par2= paramA ) )
					{
					// /volsme/users/lo17a013/Antlr/categorie_1.g:365:4: ( ET | OU )
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==ET) ) {
						alt19=1;
					}
					else if ( (LA19_0==OU) ) {
						alt19=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 19, 0, input);
						throw nvae;
					}

					switch (alt19) {
						case 1 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:365:5: ET
							{
							match(input,ET,FOLLOW_ET_in_paramAuteur1132); 

											les_pars_arbre.ajouteFils(new Arbre("", "AND"));
										
							}
							break;
						case 2 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:369:5: OU
							{
							match(input,OU,FOLLOW_OU_in_paramAuteur1145); 

											les_pars_arbre.ajouteFils(new Arbre("", "OR"));
										
							}
							break;

					}

					// /volsme/users/lo17a013/Antlr/categorie_1.g:375:3: ( ( NOT par2= paramA ) | (par2= paramA ) )
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==NOT) ) {
						alt20=1;
					}
					else if ( (LA20_0==VAR) ) {
						alt20=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 20, 0, input);
						throw nvae;
					}

					switch (alt20) {
						case 1 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:375:4: ( NOT par2= paramA )
							{
							// /volsme/users/lo17a013/Antlr/categorie_1.g:375:4: ( NOT par2= paramA )
							// /volsme/users/lo17a013/Antlr/categorie_1.g:375:5: NOT par2= paramA
							{
							match(input,NOT,FOLLOW_NOT_in_paramAuteur1163); 

											les_pars_arbre.ajouteFils(new Arbre("", "NOT"));
										
							pushFollow(FOLLOW_paramA_in_paramAuteur1176);
							par2=paramA();
							state._fsp--;


											par2_arbre = par2;
											les_pars_arbre.ajouteFils(par2_arbre);
										
							}

							}
							break;
						case 2 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:385:5: (par2= paramA )
							{
							// /volsme/users/lo17a013/Antlr/categorie_1.g:385:5: (par2= paramA )
							// /volsme/users/lo17a013/Antlr/categorie_1.g:385:6: par2= paramA
							{
							pushFollow(FOLLOW_paramA_in_paramAuteur1196);
							par2=paramA();
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
					break loop21;
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
	// $ANTLR end "paramAuteur"



	// $ANTLR start "paramA"
	// /volsme/users/lo17a013/Antlr/categorie_1.g:395:1: paramA returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre paramA() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// /volsme/users/lo17a013/Antlr/categorie_1.g:395:52: (a= VAR )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:396:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_paramA1233); 
			 lepar_arbre.ajouteFils(new Arbre("email =", "'"+a.getText()+"'"));
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
	// $ANTLR end "paramA"



	// $ANTLR start "paramArticle"
	// /volsme/users/lo17a013/Antlr/categorie_1.g:400:1: paramArticle returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= paramArt ( ( ET | OU ) ( ( NOT par2= paramArt ) | (par2= paramArt ) ) )* ;
	public final Arbre paramArticle() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// /volsme/users/lo17a013/Antlr/categorie_1.g:401:40: (par1= paramArt ( ( ET | OU ) ( ( NOT par2= paramArt ) | (par2= paramArt ) ) )* )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:402:3: par1= paramArt ( ( ET | OU ) ( ( NOT par2= paramArt ) | (par2= paramArt ) ) )*
			{
			pushFollow(FOLLOW_paramArt_in_paramArticle1263);
			par1=paramArt();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// /volsme/users/lo17a013/Antlr/categorie_1.g:407:3: ( ( ET | OU ) ( ( NOT par2= paramArt ) | (par2= paramArt ) ) )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==ET||LA24_0==OU) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// /volsme/users/lo17a013/Antlr/categorie_1.g:407:4: ( ET | OU ) ( ( NOT par2= paramArt ) | (par2= paramArt ) )
					{
					// /volsme/users/lo17a013/Antlr/categorie_1.g:407:4: ( ET | OU )
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==ET) ) {
						alt22=1;
					}
					else if ( (LA22_0==OU) ) {
						alt22=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 22, 0, input);
						throw nvae;
					}

					switch (alt22) {
						case 1 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:407:5: ET
							{
							match(input,ET,FOLLOW_ET_in_paramArticle1274); 

											les_pars_arbre.ajouteFils(new Arbre("", "AND"));
										
							}
							break;
						case 2 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:411:5: OU
							{
							match(input,OU,FOLLOW_OU_in_paramArticle1287); 

											les_pars_arbre.ajouteFils(new Arbre("", "OR"));
										
							}
							break;

					}

					// /volsme/users/lo17a013/Antlr/categorie_1.g:416:3: ( ( NOT par2= paramArt ) | (par2= paramArt ) )
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==NOT) ) {
						alt23=1;
					}
					else if ( (LA23_0==VAR) ) {
						alt23=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 23, 0, input);
						throw nvae;
					}

					switch (alt23) {
						case 1 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:416:4: ( NOT par2= paramArt )
							{
							// /volsme/users/lo17a013/Antlr/categorie_1.g:416:4: ( NOT par2= paramArt )
							// /volsme/users/lo17a013/Antlr/categorie_1.g:416:5: NOT par2= paramArt
							{
							match(input,NOT,FOLLOW_NOT_in_paramArticle1302); 

											les_pars_arbre.ajouteFils(new Arbre("", "NOT"));
										
							pushFollow(FOLLOW_paramArt_in_paramArticle1315);
							par2=paramArt();
							state._fsp--;


											par2_arbre = par2;
											les_pars_arbre.ajouteFils(par2_arbre);
										
							}

							}
							break;
						case 2 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:426:5: (par2= paramArt )
							{
							// /volsme/users/lo17a013/Antlr/categorie_1.g:426:5: (par2= paramArt )
							// /volsme/users/lo17a013/Antlr/categorie_1.g:426:6: par2= paramArt
							{
							pushFollow(FOLLOW_paramArt_in_paramArticle1335);
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
					break loop24;
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
	// /volsme/users/lo17a013/Antlr/categorie_1.g:436:1: paramArt returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre paramArt() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// /volsme/users/lo17a013/Antlr/categorie_1.g:436:54: (a= VAR )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:437:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_paramArt1372); 
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



	// $ANTLR start "paramTitre"
	// /volsme/users/lo17a013/Antlr/categorie_1.g:441:1: paramTitre returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= paramT ( ( ET | OU ) ( ( NOT par2= paramT ) | (par2= paramT ) ) )* ;
	public final Arbre paramTitre() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// /volsme/users/lo17a013/Antlr/categorie_1.g:442:40: (par1= paramT ( ( ET | OU ) ( ( NOT par2= paramT ) | (par2= paramT ) ) )* )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:443:3: par1= paramT ( ( ET | OU ) ( ( NOT par2= paramT ) | (par2= paramT ) ) )*
			{
			pushFollow(FOLLOW_paramT_in_paramTitre1402);
			par1=paramT();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// /volsme/users/lo17a013/Antlr/categorie_1.g:448:3: ( ( ET | OU ) ( ( NOT par2= paramT ) | (par2= paramT ) ) )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==ET||LA27_0==OU) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// /volsme/users/lo17a013/Antlr/categorie_1.g:448:4: ( ET | OU ) ( ( NOT par2= paramT ) | (par2= paramT ) )
					{
					// /volsme/users/lo17a013/Antlr/categorie_1.g:448:4: ( ET | OU )
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==ET) ) {
						alt25=1;
					}
					else if ( (LA25_0==OU) ) {
						alt25=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 25, 0, input);
						throw nvae;
					}

					switch (alt25) {
						case 1 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:448:5: ET
							{
							match(input,ET,FOLLOW_ET_in_paramTitre1413); 

											les_pars_arbre.ajouteFils(new Arbre("", "AND"));
										
							}
							break;
						case 2 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:452:5: OU
							{
							match(input,OU,FOLLOW_OU_in_paramTitre1426); 

											les_pars_arbre.ajouteFils(new Arbre("", "OR"));
										
							}
							break;

					}

					// /volsme/users/lo17a013/Antlr/categorie_1.g:457:3: ( ( NOT par2= paramT ) | (par2= paramT ) )
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==NOT) ) {
						alt26=1;
					}
					else if ( (LA26_0==VAR) ) {
						alt26=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 26, 0, input);
						throw nvae;
					}

					switch (alt26) {
						case 1 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:457:4: ( NOT par2= paramT )
							{
							// /volsme/users/lo17a013/Antlr/categorie_1.g:457:4: ( NOT par2= paramT )
							// /volsme/users/lo17a013/Antlr/categorie_1.g:457:5: NOT par2= paramT
							{
							match(input,NOT,FOLLOW_NOT_in_paramTitre1441); 

											les_pars_arbre.ajouteFils(new Arbre("", "NOT"));
										
							pushFollow(FOLLOW_paramT_in_paramTitre1454);
							par2=paramT();
							state._fsp--;


											par2_arbre = par2;
											les_pars_arbre.ajouteFils(par2_arbre);
										
							}

							}
							break;
						case 2 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:467:5: (par2= paramT )
							{
							// /volsme/users/lo17a013/Antlr/categorie_1.g:467:5: (par2= paramT )
							// /volsme/users/lo17a013/Antlr/categorie_1.g:467:6: par2= paramT
							{
							pushFollow(FOLLOW_paramT_in_paramTitre1474);
							par2=paramT();
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
					break loop27;
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
	// $ANTLR end "paramTitre"



	// $ANTLR start "paramT"
	// /volsme/users/lo17a013/Antlr/categorie_1.g:477:1: paramT returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre paramT() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// /volsme/users/lo17a013/Antlr/categorie_1.g:477:52: (a= VAR )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:478:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_paramT1511); 
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
	// $ANTLR end "paramT"



	// $ANTLR start "paramRubrique"
	// /volsme/users/lo17a013/Antlr/categorie_1.g:482:1: paramRubrique returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= paramR ( ( ET | OU ) ( ( NOT par2= paramR ) | (par2= paramR ) ) )* ;
	public final Arbre paramRubrique() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// /volsme/users/lo17a013/Antlr/categorie_1.g:483:40: (par1= paramR ( ( ET | OU ) ( ( NOT par2= paramR ) | (par2= paramR ) ) )* )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:484:3: par1= paramR ( ( ET | OU ) ( ( NOT par2= paramR ) | (par2= paramR ) ) )*
			{
			pushFollow(FOLLOW_paramR_in_paramRubrique1541);
			par1=paramR();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// /volsme/users/lo17a013/Antlr/categorie_1.g:489:3: ( ( ET | OU ) ( ( NOT par2= paramR ) | (par2= paramR ) ) )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==ET||LA30_0==OU) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// /volsme/users/lo17a013/Antlr/categorie_1.g:489:4: ( ET | OU ) ( ( NOT par2= paramR ) | (par2= paramR ) )
					{
					// /volsme/users/lo17a013/Antlr/categorie_1.g:489:4: ( ET | OU )
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==ET) ) {
						alt28=1;
					}
					else if ( (LA28_0==OU) ) {
						alt28=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 28, 0, input);
						throw nvae;
					}

					switch (alt28) {
						case 1 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:489:5: ET
							{
							match(input,ET,FOLLOW_ET_in_paramRubrique1552); 

											les_pars_arbre.ajouteFils(new Arbre("", "AND"));
										
							}
							break;
						case 2 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:493:5: OU
							{
							match(input,OU,FOLLOW_OU_in_paramRubrique1565); 

											les_pars_arbre.ajouteFils(new Arbre("", "OR"));
										
							}
							break;

					}

					// /volsme/users/lo17a013/Antlr/categorie_1.g:498:3: ( ( NOT par2= paramR ) | (par2= paramR ) )
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==NOT) ) {
						alt29=1;
					}
					else if ( (LA29_0==VAR) ) {
						alt29=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 29, 0, input);
						throw nvae;
					}

					switch (alt29) {
						case 1 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:498:4: ( NOT par2= paramR )
							{
							// /volsme/users/lo17a013/Antlr/categorie_1.g:498:4: ( NOT par2= paramR )
							// /volsme/users/lo17a013/Antlr/categorie_1.g:498:5: NOT par2= paramR
							{
							match(input,NOT,FOLLOW_NOT_in_paramRubrique1580); 

											les_pars_arbre.ajouteFils(new Arbre("", "NOT"));
										
							pushFollow(FOLLOW_paramR_in_paramRubrique1593);
							par2=paramR();
							state._fsp--;


											par2_arbre = par2;
											les_pars_arbre.ajouteFils(par2_arbre);
										
							}

							}
							break;
						case 2 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:508:5: (par2= paramR )
							{
							// /volsme/users/lo17a013/Antlr/categorie_1.g:508:5: (par2= paramR )
							// /volsme/users/lo17a013/Antlr/categorie_1.g:508:6: par2= paramR
							{
							pushFollow(FOLLOW_paramR_in_paramRubrique1613);
							par2=paramR();
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
					break loop30;
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
	// $ANTLR end "paramRubrique"



	// $ANTLR start "paramR"
	// /volsme/users/lo17a013/Antlr/categorie_1.g:518:1: paramR returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre paramR() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// /volsme/users/lo17a013/Antlr/categorie_1.g:518:52: (a= VAR )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:519:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_paramR1650); 
			 lepar_arbre.ajouteFils(new Arbre("rubrique =", "'"+a.getText()+"'"));
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
	// $ANTLR end "paramR"



	// $ANTLR start "paramDate"
	// /volsme/users/lo17a013/Antlr/categorie_1.g:523:1: paramDate returns [Arbre les_pars_arbre = new Arbre(\"\")] : ( EN par1= paramD ( ( OU par2= paramD )+ )? | ( BETWEEN par1= paramDS ET par2= paramDI | AVANT par1= paramDIS | APRES par1= paramDSS | DEPUIS par1= paramDS ) );
	public final Arbre paramDate() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// /volsme/users/lo17a013/Antlr/categorie_1.g:524:40: ( EN par1= paramD ( ( OU par2= paramD )+ )? | ( BETWEEN par1= paramDS ET par2= paramDI | AVANT par1= paramDIS | APRES par1= paramDSS | DEPUIS par1= paramDS ) )
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==EN) ) {
				alt34=1;
			}
			else if ( (LA34_0==APRES||(LA34_0 >= AVANT && LA34_0 <= BETWEEN)||LA34_0==DEPUIS) ) {
				alt34=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}

			switch (alt34) {
				case 1 :
					// /volsme/users/lo17a013/Antlr/categorie_1.g:525:3: EN par1= paramD ( ( OU par2= paramD )+ )?
					{
					match(input,EN,FOLLOW_EN_in_paramDate1676); 
					pushFollow(FOLLOW_paramD_in_paramDate1682);
					par1=paramD();
					state._fsp--;


									par1_arbre = par1;
									les_pars_arbre.ajouteFils(par1_arbre);
								
					// /volsme/users/lo17a013/Antlr/categorie_1.g:530:3: ( ( OU par2= paramD )+ )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==OU) ) {
						alt32=1;
					}
					switch (alt32) {
						case 1 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:530:4: ( OU par2= paramD )+
							{
							// /volsme/users/lo17a013/Antlr/categorie_1.g:530:4: ( OU par2= paramD )+
							int cnt31=0;
							loop31:
							while (true) {
								int alt31=2;
								int LA31_0 = input.LA(1);
								if ( (LA31_0==OU) ) {
									alt31=1;
								}

								switch (alt31) {
								case 1 :
									// /volsme/users/lo17a013/Antlr/categorie_1.g:530:5: OU par2= paramD
									{
									match(input,OU,FOLLOW_OU_in_paramDate1693); 
									pushFollow(FOLLOW_paramD_in_paramDate1700);
									par2=paramD();
									state._fsp--;


													par2_arbre = par2;
													les_pars_arbre.ajouteFils(new Arbre("", "OR"));
													les_pars_arbre.ajouteFils(par2_arbre);
												
									}
									break;

								default :
									if ( cnt31 >= 1 ) break loop31;
									EarlyExitException eee = new EarlyExitException(31, input);
									throw eee;
								}
								cnt31++;
							}

							}
							break;

					}

					}
					break;
				case 2 :
					// /volsme/users/lo17a013/Antlr/categorie_1.g:537:5: ( BETWEEN par1= paramDS ET par2= paramDI | AVANT par1= paramDIS | APRES par1= paramDSS | DEPUIS par1= paramDS )
					{
					// /volsme/users/lo17a013/Antlr/categorie_1.g:537:5: ( BETWEEN par1= paramDS ET par2= paramDI | AVANT par1= paramDIS | APRES par1= paramDSS | DEPUIS par1= paramDS )
					int alt33=4;
					switch ( input.LA(1) ) {
					case BETWEEN:
						{
						alt33=1;
						}
						break;
					case AVANT:
						{
						alt33=2;
						}
						break;
					case APRES:
						{
						alt33=3;
						}
						break;
					case DEPUIS:
						{
						alt33=4;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 33, 0, input);
						throw nvae;
					}
					switch (alt33) {
						case 1 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:537:6: BETWEEN par1= paramDS ET par2= paramDI
							{
							match(input,BETWEEN,FOLLOW_BETWEEN_in_paramDate1719); 
							pushFollow(FOLLOW_paramDS_in_paramDate1725);
							par1=paramDS();
							state._fsp--;

							match(input,ET,FOLLOW_ET_in_paramDate1727); 
							pushFollow(FOLLOW_paramDI_in_paramDate1733);
							par2=paramDI();
							state._fsp--;


											par1_arbre = par1;
											les_pars_arbre.ajouteFils(par1_arbre);
											les_pars_arbre.ajouteFils(new Arbre("", "AND"));
											par2_arbre = par2;
											les_pars_arbre.ajouteFils(par2_arbre);
										
							}
							break;
						case 2 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:545:5: AVANT par1= paramDIS
							{
							match(input,AVANT,FOLLOW_AVANT_in_paramDate1744); 
							pushFollow(FOLLOW_paramDIS_in_paramDate1751);
							par1=paramDIS();
							state._fsp--;


											par1_arbre = par1;
											les_pars_arbre.ajouteFils(par1_arbre);
										
							}
							break;
						case 3 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:550:5: APRES par1= paramDSS
							{
							match(input,APRES,FOLLOW_APRES_in_paramDate1762); 
							pushFollow(FOLLOW_paramDSS_in_paramDate1769);
							par1=paramDSS();
							state._fsp--;


											par1_arbre = par1;
											les_pars_arbre.ajouteFils(par1_arbre);
										
							}
							break;
						case 4 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:555:5: DEPUIS par1= paramDS
							{
							match(input,DEPUIS,FOLLOW_DEPUIS_in_paramDate1780); 
							pushFollow(FOLLOW_paramDS_in_paramDate1787);
							par1=paramDS();
							state._fsp--;


											par1_arbre = par1;
											les_pars_arbre.ajouteFils(par1_arbre);
										
							}
							break;

					}

					}
					break;

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
	// $ANTLR end "paramDate"



	// $ANTLR start "paramD"
	// /volsme/users/lo17a013/Antlr/categorie_1.g:563:1: paramD returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre paramD() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// /volsme/users/lo17a013/Antlr/categorie_1.g:563:52: (a= VAR )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:564:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_paramD1814); 
			 
					lepar_arbre.ajouteFils(new Arbre("TT.jour = (SELECT substring( ","'"+a.getText()+"'"));
					lepar_arbre.ajouteFils(new Arbre(""," from 9 for 2))"));
					lepar_arbre.ajouteFils(new Arbre("AND TT.mois = (SELECT substring( ","'"+a.getText()+ "'"));
					lepar_arbre.ajouteFils(new Arbre("", " from 6 for 2))"));
					lepar_arbre.ajouteFils(new Arbre("AND TT.annee = (SELECT substring( ","'"+a.getText()+"'"));
					lepar_arbre.ajouteFils(new Arbre(""," from 1 for 4))"));
					
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
	// $ANTLR end "paramD"



	// $ANTLR start "paramDI"
	// /volsme/users/lo17a013/Antlr/categorie_1.g:575:1: paramDI returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre paramDI() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// /volsme/users/lo17a013/Antlr/categorie_1.g:575:53: (a= VAR )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:576:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_paramDI1836); 
			 
					lepar_arbre.ajouteFils(new Arbre("TT.annee <= (SELECT substring( ","'"+a.getText()+"'"));
					lepar_arbre.ajouteFils(new Arbre(""," from 1 for 4))"));
					lepar_arbre.ajouteFils(new Arbre(" OR (TT.annee = (SELECT substring( ","'"+a.getText()+"'"));
					lepar_arbre.ajouteFils(new Arbre(""," from 1 for 4))"));
					lepar_arbre.ajouteFils(new Arbre("AND TT.mois <= (SELECT substring( ","'"+a.getText()+ "'"));
					lepar_arbre.ajouteFils(new Arbre("", " from 6 for 2)))"));
					lepar_arbre.ajouteFils(new Arbre(" OR (TT.annee = (SELECT substring( ","'"+a.getText()+"'"));
					lepar_arbre.ajouteFils(new Arbre(""," from 1 for 4))"));
					lepar_arbre.ajouteFils(new Arbre("AND TT.mois = (SELECT substring( ","'"+a.getText()+ "'"));
					lepar_arbre.ajouteFils(new Arbre("", " from 6 for 2))"));
					lepar_arbre.ajouteFils(new Arbre("AND TT.jour <= (SELECT substring( ","'"+a.getText()+"'"));
					lepar_arbre.ajouteFils(new Arbre(""," from 9 for 2)))"));
					
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
	// $ANTLR end "paramDI"



	// $ANTLR start "paramDS"
	// /volsme/users/lo17a013/Antlr/categorie_1.g:593:1: paramDS returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre paramDS() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// /volsme/users/lo17a013/Antlr/categorie_1.g:593:53: (a= VAR )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:594:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_paramDS1858); 
			 lepar_arbre.ajouteFils(new Arbre("TT.annee >= (SELECT substring( ","'"+a.getText()+"'"));
					lepar_arbre.ajouteFils(new Arbre(""," from 1 for 4))"));
					lepar_arbre.ajouteFils(new Arbre(" OR (TT.annee = (SELECT substring( ","'"+a.getText()+"'"));
					lepar_arbre.ajouteFils(new Arbre(""," from 1 for 4))"));
					lepar_arbre.ajouteFils(new Arbre("AND TT.mois >= (SELECT substring( ","'"+a.getText()+ "'"));
					lepar_arbre.ajouteFils(new Arbre("", " from 6 for 2)))"));
					lepar_arbre.ajouteFils(new Arbre(" OR (TT.annee = (SELECT substring( ","'"+a.getText()+"'"));
					lepar_arbre.ajouteFils(new Arbre(""," from 1 for 4))"));
					lepar_arbre.ajouteFils(new Arbre("AND TT.mois = (SELECT substring( ","'"+a.getText()+ "'"));
					lepar_arbre.ajouteFils(new Arbre("", " from 6 for 2))"));
					lepar_arbre.ajouteFils(new Arbre("AND TT.jour >= (SELECT substring( ","'"+a.getText()+"'"));
					lepar_arbre.ajouteFils(new Arbre(""," from 9 for 2)))"));
					
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
	// $ANTLR end "paramDS"



	// $ANTLR start "paramDIS"
	// /volsme/users/lo17a013/Antlr/categorie_1.g:610:1: paramDIS returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre paramDIS() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// /volsme/users/lo17a013/Antlr/categorie_1.g:610:54: (a= VAR )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:611:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_paramDIS1880); 
			lepar_arbre.ajouteFils(new Arbre("TT.annee < (SELECT substring( ","'"+a.getText()+"'"));
					lepar_arbre.ajouteFils(new Arbre(""," from 1 for 4))"));
					lepar_arbre.ajouteFils(new Arbre(" OR (TT.annee = (SELECT substring( ","'"+a.getText()+"'"));
					lepar_arbre.ajouteFils(new Arbre(""," from 1 for 4))"));
					lepar_arbre.ajouteFils(new Arbre("AND TT.mois < (SELECT substring( ","'"+a.getText()+ "'"));
					lepar_arbre.ajouteFils(new Arbre("", " from 6 for 2)))"));
					lepar_arbre.ajouteFils(new Arbre(" OR (TT.annee = (SELECT substring( ","'"+a.getText()+"'"));
					lepar_arbre.ajouteFils(new Arbre(""," from 1 for 4))"));
					lepar_arbre.ajouteFils(new Arbre("AND TT.mois = (SELECT substring( ","'"+a.getText()+ "'"));
					lepar_arbre.ajouteFils(new Arbre("", " from 6 for 2))"));
					lepar_arbre.ajouteFils(new Arbre("AND TT.jour < (SELECT substring( ","'"+a.getText()+"'"));
					lepar_arbre.ajouteFils(new Arbre(""," from 9 for 2)))"));
					
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
	// $ANTLR end "paramDIS"



	// $ANTLR start "paramDSS"
	// /volsme/users/lo17a013/Antlr/categorie_1.g:627:1: paramDSS returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre paramDSS() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// /volsme/users/lo17a013/Antlr/categorie_1.g:627:54: (a= VAR )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:628:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_paramDSS1902); 
			 lepar_arbre.ajouteFils(new Arbre("TT.annee > (SELECT substring( ","'"+a.getText()+"'"));
					lepar_arbre.ajouteFils(new Arbre(""," from 1 for 4))"));
					lepar_arbre.ajouteFils(new Arbre(" OR (TT.annee = (SELECT substring( ","'"+a.getText()+"'"));
					lepar_arbre.ajouteFils(new Arbre(""," from 1 for 4))"));
					lepar_arbre.ajouteFils(new Arbre("AND TT.mois > (SELECT substring( ","'"+a.getText()+ "'"));
					lepar_arbre.ajouteFils(new Arbre("", " from 6 for 2)))"));
					lepar_arbre.ajouteFils(new Arbre(" OR (TT.annee = (SELECT substring( ","'"+a.getText()+"'"));
					lepar_arbre.ajouteFils(new Arbre(""," from 1 for 4))"));
					lepar_arbre.ajouteFils(new Arbre("AND TT.mois = (SELECT substring( ","'"+a.getText()+ "'"));
					lepar_arbre.ajouteFils(new Arbre("", " from 6 for 2))"));
					lepar_arbre.ajouteFils(new Arbre("AND TT.jour > (SELECT substring( ","'"+a.getText()+"'"));
					lepar_arbre.ajouteFils(new Arbre(""," from 9 for 2)))"));
					
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
	// $ANTLR end "paramDSS"

	// Delegated rules



	public static final BitSet FOLLOW_requete_in_listerequetes283 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_POINT_in_listerequetes285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete312 = new BitSet(new long[]{0x0000000000040660L});
	public static final BitSet FOLLOW_ARTICLE_in_requete326 = new BitSet(new long[]{0x0000000000401400L});
	public static final BitSet FOLLOW_COUNT_in_requete337 = new BitSet(new long[]{0x0000000000401400L});
	public static final BitSet FOLLOW_WHERE_in_requete351 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_paramArticle_in_requete361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DONT_in_requete375 = new BitSet(new long[]{0x0000000000140040L});
	public static final BitSet FOLLOW_TITRE_in_requete381 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_WHERE_in_requete383 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_paramTitre_in_requete389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete401 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_WHERE_in_requete403 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_paramRubrique_in_requete409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTEUR_in_requete422 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_WHERE_in_requete424 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_paramAuteur_in_requete429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_requete447 = new BitSet(new long[]{0x0000000000002990L});
	public static final BitSet FOLLOW_paramDate_in_requete454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARTICLE_in_requete474 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ET_in_requete483 = new BitSet(new long[]{0x0000000000040440L});
	public static final BitSet FOLLOW_DATE_in_requete489 = new BitSet(new long[]{0x0000000000005000L});
	public static final BitSet FOLLOW_DONT_in_requete498 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete500 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_WHERE_in_requete503 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ET_in_requete515 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete517 = new BitSet(new long[]{0x0000000000005000L});
	public static final BitSet FOLLOW_DONT_in_requete527 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete529 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_WHERE_in_requete531 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ET_in_requete542 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete544 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_DONT_in_requete553 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete555 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_WHERE_in_requete558 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ET_in_requete570 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete572 = new BitSet(new long[]{0x0000000000005000L});
	public static final BitSet FOLLOW_DONT_in_requete582 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete584 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_WHERE_in_requete587 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ET_in_requete598 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete600 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_DONT_in_requete608 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete610 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_WHERE_in_requete613 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete633 = new BitSet(new long[]{0x0000000000005000L});
	public static final BitSet FOLLOW_DONT_in_requete643 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete645 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_WHERE_in_requete648 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ET_in_requete660 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_DATE_in_requete662 = new BitSet(new long[]{0x0000000000005000L});
	public static final BitSet FOLLOW_DONT_in_requete672 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete674 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_WHERE_in_requete677 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ET_in_requete688 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete690 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_DONT_in_requete698 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete700 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_WHERE_in_requete703 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ET_in_requete715 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AUTEUR_in_requete717 = new BitSet(new long[]{0x0000000000005000L});
	public static final BitSet FOLLOW_DONT_in_requete727 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete729 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_WHERE_in_requete732 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ET_in_requete743 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_DATE_in_requete745 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_DONT_in_requete753 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete755 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_WHERE_in_requete758 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_AUTEUR_in_requete778 = new BitSet(new long[]{0x0000000000005000L});
	public static final BitSet FOLLOW_DONT_in_requete788 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete790 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_WHERE_in_requete793 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ET_in_requete805 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete807 = new BitSet(new long[]{0x0000000000005000L});
	public static final BitSet FOLLOW_DONT_in_requete816 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete818 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_WHERE_in_requete821 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ET_in_requete832 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_DATE_in_requete834 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_DONT_in_requete842 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete844 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_WHERE_in_requete847 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ET_in_requete859 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_DATE_in_requete861 = new BitSet(new long[]{0x0000000000005000L});
	public static final BitSet FOLLOW_DONT_in_requete870 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete872 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_WHERE_in_requete875 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_ET_in_requete886 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete888 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_DONT_in_requete897 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete899 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_WHERE_in_requete902 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_paramArticle_in_requete928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTEUR_in_requete948 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_DONT_in_requete963 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete965 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_WHERE_in_requete971 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_paramArticle_in_requete978 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete1002 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_DONT_in_requete1012 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1014 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_WHERE_in_requete1020 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_paramArticle_in_requete1027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_requete1051 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_DONT_in_requete1060 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete1062 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_WHERE_in_requete1068 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_paramArticle_in_requete1075 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramA_in_paramAuteur1120 = new BitSet(new long[]{0x0000000000014002L});
	public static final BitSet FOLLOW_ET_in_paramAuteur1132 = new BitSet(new long[]{0x0000000000208000L});
	public static final BitSet FOLLOW_OU_in_paramAuteur1145 = new BitSet(new long[]{0x0000000000208000L});
	public static final BitSet FOLLOW_NOT_in_paramAuteur1163 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_paramA_in_paramAuteur1176 = new BitSet(new long[]{0x0000000000014002L});
	public static final BitSet FOLLOW_paramA_in_paramAuteur1196 = new BitSet(new long[]{0x0000000000014002L});
	public static final BitSet FOLLOW_VAR_in_paramA1233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramArt_in_paramArticle1263 = new BitSet(new long[]{0x0000000000014002L});
	public static final BitSet FOLLOW_ET_in_paramArticle1274 = new BitSet(new long[]{0x0000000000208000L});
	public static final BitSet FOLLOW_OU_in_paramArticle1287 = new BitSet(new long[]{0x0000000000208000L});
	public static final BitSet FOLLOW_NOT_in_paramArticle1302 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_paramArt_in_paramArticle1315 = new BitSet(new long[]{0x0000000000014002L});
	public static final BitSet FOLLOW_paramArt_in_paramArticle1335 = new BitSet(new long[]{0x0000000000014002L});
	public static final BitSet FOLLOW_VAR_in_paramArt1372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramT_in_paramTitre1402 = new BitSet(new long[]{0x0000000000014002L});
	public static final BitSet FOLLOW_ET_in_paramTitre1413 = new BitSet(new long[]{0x0000000000208000L});
	public static final BitSet FOLLOW_OU_in_paramTitre1426 = new BitSet(new long[]{0x0000000000208000L});
	public static final BitSet FOLLOW_NOT_in_paramTitre1441 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_paramT_in_paramTitre1454 = new BitSet(new long[]{0x0000000000014002L});
	public static final BitSet FOLLOW_paramT_in_paramTitre1474 = new BitSet(new long[]{0x0000000000014002L});
	public static final BitSet FOLLOW_VAR_in_paramT1511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramR_in_paramRubrique1541 = new BitSet(new long[]{0x0000000000014002L});
	public static final BitSet FOLLOW_ET_in_paramRubrique1552 = new BitSet(new long[]{0x0000000000208000L});
	public static final BitSet FOLLOW_OU_in_paramRubrique1565 = new BitSet(new long[]{0x0000000000208000L});
	public static final BitSet FOLLOW_NOT_in_paramRubrique1580 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_paramR_in_paramRubrique1593 = new BitSet(new long[]{0x0000000000014002L});
	public static final BitSet FOLLOW_paramR_in_paramRubrique1613 = new BitSet(new long[]{0x0000000000014002L});
	public static final BitSet FOLLOW_VAR_in_paramR1650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EN_in_paramDate1676 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_paramD_in_paramDate1682 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_OU_in_paramDate1693 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_paramD_in_paramDate1700 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_BETWEEN_in_paramDate1719 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_paramDS_in_paramDate1725 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ET_in_paramDate1727 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_paramDI_in_paramDate1733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AVANT_in_paramDate1744 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_paramDIS_in_paramDate1751 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_APRES_in_paramDate1762 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_paramDSS_in_paramDate1769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEPUIS_in_paramDate1780 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_paramDS_in_paramDate1787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_paramD1814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_paramDI1836 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_paramDS1858 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_paramDIS1880 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_paramDSS1902 = new BitSet(new long[]{0x0000000000000002L});
}
