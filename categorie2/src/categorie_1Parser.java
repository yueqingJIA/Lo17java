// $ANTLR 3.5.1 /volsme/users/lo17a013/Antlr/categorie_1.g 2017-11-17 10:59:59

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class categorie_1Parser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "APRES", "ARTICLE", "AUTEUR", 
		"AVANT", "BETWEEN", "DATE", "DEPUIS", "DONT", "ET", "NOT", "OU", "POINT", 
		"RUBRIQUE", "SELECT", "TITRE", "VAR", "WHERE", "WS"
	};
	public static final int EOF=-1;
	public static final int APRES=4;
	public static final int ARTICLE=5;
	public static final int AUTEUR=6;
	public static final int AVANT=7;
	public static final int BETWEEN=8;
	public static final int DATE=9;
	public static final int DEPUIS=10;
	public static final int DONT=11;
	public static final int ET=12;
	public static final int NOT=13;
	public static final int OU=14;
	public static final int POINT=15;
	public static final int RUBRIQUE=16;
	public static final int SELECT=17;
	public static final int TITRE=18;
	public static final int VAR=19;
	public static final int WHERE=20;
	public static final int WS=21;

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
	// /volsme/users/lo17a013/Antlr/categorie_1.g:58:1: listerequetes returns [String sql = \"\"] : r= requete POINT ;
	public final String listerequetes() throws RecognitionException {
		String sql =  "";


		Arbre r =null;

		Arbre lr_arbre;
		try {
			// /volsme/users/lo17a013/Antlr/categorie_1.g:59:25: (r= requete POINT )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:60:3: r= requete POINT
			{
			pushFollow(FOLLOW_requete_in_listerequetes255);
			r=requete();
			state._fsp--;

			match(input,POINT,FOLLOW_POINT_in_listerequetes257); 

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
	// /volsme/users/lo17a013/Antlr/categorie_1.g:67:1: requete returns [Arbre req_arbre = new Arbre(\"\")] : SELECT ( ARTICLE ( ( WHERE ps= paramArticle | DONT ( TITRE WHERE ps= paramTitre | RUBRIQUE WHERE ps= paramRubrique | DATE WHERE ps= paramDate | AUTEUR WHERE ps= paramAuteur ) ) ) | ( AUTEUR | DATE | RUBRIQUE | TITRE ) ( DONT ARTICLE WHERE ps= paramArticle ) ) ;
	public final Arbre requete() throws RecognitionException {
		Arbre req_arbre =  new Arbre("");


		Arbre ps =null;

		Arbre ps_arbre;
		try {
			// /volsme/users/lo17a013/Antlr/categorie_1.g:68:26: ( SELECT ( ARTICLE ( ( WHERE ps= paramArticle | DONT ( TITRE WHERE ps= paramTitre | RUBRIQUE WHERE ps= paramRubrique | DATE WHERE ps= paramDate | AUTEUR WHERE ps= paramAuteur ) ) ) | ( AUTEUR | DATE | RUBRIQUE | TITRE ) ( DONT ARTICLE WHERE ps= paramArticle ) ) )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:69:3: SELECT ( ARTICLE ( ( WHERE ps= paramArticle | DONT ( TITRE WHERE ps= paramTitre | RUBRIQUE WHERE ps= paramRubrique | DATE WHERE ps= paramDate | AUTEUR WHERE ps= paramAuteur ) ) ) | ( AUTEUR | DATE | RUBRIQUE | TITRE ) ( DONT ARTICLE WHERE ps= paramArticle ) )
			{
			match(input,SELECT,FOLLOW_SELECT_in_requete284); 

							req_arbre.ajouteFils(new Arbre("","select distinct"));
						
			// /volsme/users/lo17a013/Antlr/categorie_1.g:73:3: ( ARTICLE ( ( WHERE ps= paramArticle | DONT ( TITRE WHERE ps= paramTitre | RUBRIQUE WHERE ps= paramRubrique | DATE WHERE ps= paramDate | AUTEUR WHERE ps= paramAuteur ) ) ) | ( AUTEUR | DATE | RUBRIQUE | TITRE ) ( DONT ARTICLE WHERE ps= paramArticle ) )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==ARTICLE) ) {
				alt4=1;
			}
			else if ( (LA4_0==AUTEUR||LA4_0==DATE||LA4_0==RUBRIQUE||LA4_0==TITRE) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// /volsme/users/lo17a013/Antlr/categorie_1.g:73:4: ARTICLE ( ( WHERE ps= paramArticle | DONT ( TITRE WHERE ps= paramTitre | RUBRIQUE WHERE ps= paramRubrique | DATE WHERE ps= paramDate | AUTEUR WHERE ps= paramAuteur ) ) )
					{
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete296); 
					// /volsme/users/lo17a013/Antlr/categorie_1.g:74:3: ( ( WHERE ps= paramArticle | DONT ( TITRE WHERE ps= paramTitre | RUBRIQUE WHERE ps= paramRubrique | DATE WHERE ps= paramDate | AUTEUR WHERE ps= paramAuteur ) ) )
					// /volsme/users/lo17a013/Antlr/categorie_1.g:74:4: ( WHERE ps= paramArticle | DONT ( TITRE WHERE ps= paramTitre | RUBRIQUE WHERE ps= paramRubrique | DATE WHERE ps= paramDate | AUTEUR WHERE ps= paramAuteur ) )
					{
					// /volsme/users/lo17a013/Antlr/categorie_1.g:74:4: ( WHERE ps= paramArticle | DONT ( TITRE WHERE ps= paramTitre | RUBRIQUE WHERE ps= paramRubrique | DATE WHERE ps= paramDate | AUTEUR WHERE ps= paramAuteur ) )
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==WHERE) ) {
						alt2=1;
					}
					else if ( (LA2_0==DONT) ) {
						alt2=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 2, 0, input);
						throw nvae;
					}

					switch (alt2) {
						case 1 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:74:5: WHERE ps= paramArticle
							{
							match(input,WHERE,FOLLOW_WHERE_in_requete303); 
							pushFollow(FOLLOW_paramArticle_in_requete313);
							ps=paramArticle();
							state._fsp--;


										req_arbre.ajouteFils(new Arbre("","fichier"));
										req_arbre.ajouteFils(new Arbre("","from public.titretexte"));
										req_arbre.ajouteFils(new Arbre("","where"));
										ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
										
							}
							break;
						case 2 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:84:3: DONT ( TITRE WHERE ps= paramTitre | RUBRIQUE WHERE ps= paramRubrique | DATE WHERE ps= paramDate | AUTEUR WHERE ps= paramAuteur )
							{
							match(input,DONT,FOLLOW_DONT_in_requete327); 
							// /volsme/users/lo17a013/Antlr/categorie_1.g:85:3: ( TITRE WHERE ps= paramTitre | RUBRIQUE WHERE ps= paramRubrique | DATE WHERE ps= paramDate | AUTEUR WHERE ps= paramAuteur )
							int alt1=4;
							switch ( input.LA(1) ) {
							case TITRE:
								{
								alt1=1;
								}
								break;
							case RUBRIQUE:
								{
								alt1=2;
								}
								break;
							case DATE:
								{
								alt1=3;
								}
								break;
							case AUTEUR:
								{
								alt1=4;
								}
								break;
							default:
								NoViableAltException nvae =
									new NoViableAltException("", 1, 0, input);
								throw nvae;
							}
							switch (alt1) {
								case 1 :
									// /volsme/users/lo17a013/Antlr/categorie_1.g:85:4: TITRE WHERE ps= paramTitre
									{
									match(input,TITRE,FOLLOW_TITRE_in_requete333); 
									match(input,WHERE,FOLLOW_WHERE_in_requete335); 
									pushFollow(FOLLOW_paramTitre_in_requete341);
									ps=paramTitre();
									state._fsp--;


												req_arbre.ajouteFils(new Arbre("","fichier"));
												req_arbre.ajouteFils(new Arbre("","from public.titre"));
												req_arbre.ajouteFils(new Arbre("","where"));
												ps_arbre = ps;
												req_arbre.ajouteFils(ps_arbre);
												
									}
									break;
								case 2 :
									// /volsme/users/lo17a013/Antlr/categorie_1.g:93:6: RUBRIQUE WHERE ps= paramRubrique
									{
									match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete353); 
									match(input,WHERE,FOLLOW_WHERE_in_requete355); 
									pushFollow(FOLLOW_paramRubrique_in_requete361);
									ps=paramRubrique();
									state._fsp--;


												req_arbre.ajouteFils(new Arbre("","fichier"));
												req_arbre.ajouteFils(new Arbre("","from public.rubrique"));
												req_arbre.ajouteFils(new Arbre("","where"));
												ps_arbre = ps;
												req_arbre.ajouteFils(ps_arbre);
												
									}
									break;
								case 3 :
									// /volsme/users/lo17a013/Antlr/categorie_1.g:101:6: DATE WHERE ps= paramDate
									{
									match(input,DATE,FOLLOW_DATE_in_requete374); 
									match(input,WHERE,FOLLOW_WHERE_in_requete376); 
									pushFollow(FOLLOW_paramDate_in_requete382);
									ps=paramDate();
									state._fsp--;


												req_arbre.ajouteFils(new Arbre("","fichier"));
												req_arbre.ajouteFils(new Arbre("","from public.date"));
												req_arbre.ajouteFils(new Arbre("","where"));
												ps_arbre = ps;
												req_arbre.ajouteFils(ps_arbre);
												
									}
									break;
								case 4 :
									// /volsme/users/lo17a013/Antlr/categorie_1.g:109:6: AUTEUR WHERE ps= paramAuteur
									{
									match(input,AUTEUR,FOLLOW_AUTEUR_in_requete395); 
									match(input,WHERE,FOLLOW_WHERE_in_requete397); 
									pushFollow(FOLLOW_paramAuteur_in_requete402);
									ps=paramAuteur();
									state._fsp--;


												req_arbre.ajouteFils(new Arbre("","fichier"));
												req_arbre.ajouteFils(new Arbre("","from public.email"));
												req_arbre.ajouteFils(new Arbre("","where"));
												ps_arbre = ps;
												req_arbre.ajouteFils(ps_arbre);
												
									}
									break;

							}

							}
							break;

					}

					}

					}
					break;
				case 2 :
					// /volsme/users/lo17a013/Antlr/categorie_1.g:120:3: ( AUTEUR | DATE | RUBRIQUE | TITRE ) ( DONT ARTICLE WHERE ps= paramArticle )
					{
					// /volsme/users/lo17a013/Antlr/categorie_1.g:120:3: ( AUTEUR | DATE | RUBRIQUE | TITRE )
					int alt3=4;
					switch ( input.LA(1) ) {
					case AUTEUR:
						{
						alt3=1;
						}
						break;
					case DATE:
						{
						alt3=2;
						}
						break;
					case RUBRIQUE:
						{
						alt3=3;
						}
						break;
					case TITRE:
						{
						alt3=4;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						throw nvae;
					}
					switch (alt3) {
						case 1 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:120:5: AUTEUR
							{
							match(input,AUTEUR,FOLLOW_AUTEUR_in_requete427); 

										req_arbre.ajouteFils(new Arbre("","email"));
										req_arbre.ajouteFils(new Arbre("","from public.email"));
										ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
										
							}
							break;
						case 2 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:127:5: DATE
							{
							match(input,DATE,FOLLOW_DATE_in_requete438); 

									req_arbre.ajouteFils(new Arbre("","jour, mois, annee"));
									req_arbre.ajouteFils(new Arbre("","from public.date JOIN public.titretexte ON public.date.ficher=public.titretexte.fichier "));
									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);
									
							}
							break;
						case 3 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:134:5: RUBRIQUE
							{
							match(input,RUBRIQUE,FOLLOW_RUBRIQUE_in_requete449); 

									req_arbre.ajouteFils(new Arbre("","rubrique"));
									req_arbre.ajouteFils(new Arbre("","from public.rubrique JOIN public.titretexte ON public.rubrique.ficher=public.titretexte.fichier"));
									ps_arbre = ps;
									req_arbre.ajouteFils(ps_arbre);
									
							}
							break;
						case 4 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:141:5: TITRE
							{
							match(input,TITRE,FOLLOW_TITRE_in_requete459); 

										req_arbre.ajouteFils(new Arbre("","mot"));
										req_arbre.ajouteFils(new Arbre("","from public.titretexte"));
										ps_arbre = ps;
										req_arbre.ajouteFils(ps_arbre);
										
							}
							break;

					}

					// /volsme/users/lo17a013/Antlr/categorie_1.g:149:3: ( DONT ARTICLE WHERE ps= paramArticle )
					// /volsme/users/lo17a013/Antlr/categorie_1.g:149:4: DONT ARTICLE WHERE ps= paramArticle
					{
					match(input,DONT,FOLLOW_DONT_in_requete474); 
					match(input,ARTICLE,FOLLOW_ARTICLE_in_requete476); 
					match(input,WHERE,FOLLOW_WHERE_in_requete478); 
					pushFollow(FOLLOW_paramArticle_in_requete485);
					ps=paramArticle();
					state._fsp--;


								req_arbre.ajouteFils(new Arbre("","where"));
								ps_arbre = ps;
								req_arbre.ajouteFils(ps_arbre);
								
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
	// /volsme/users/lo17a013/Antlr/categorie_1.g:159:1: paramAuteur returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= paramA ( ( ET | OU ) ( ( NOT par2= paramA ) | (par2= paramA ) ) )* ;
	public final Arbre paramAuteur() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// /volsme/users/lo17a013/Antlr/categorie_1.g:160:40: (par1= paramA ( ( ET | OU ) ( ( NOT par2= paramA ) | (par2= paramA ) ) )* )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:161:3: par1= paramA ( ( ET | OU ) ( ( NOT par2= paramA ) | (par2= paramA ) ) )*
			{
			pushFollow(FOLLOW_paramA_in_paramAuteur524);
			par1=paramA();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// /volsme/users/lo17a013/Antlr/categorie_1.g:166:3: ( ( ET | OU ) ( ( NOT par2= paramA ) | (par2= paramA ) ) )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==ET||LA7_0==OU) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// /volsme/users/lo17a013/Antlr/categorie_1.g:166:4: ( ET | OU ) ( ( NOT par2= paramA ) | (par2= paramA ) )
					{
					// /volsme/users/lo17a013/Antlr/categorie_1.g:166:4: ( ET | OU )
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==ET) ) {
						alt5=1;
					}
					else if ( (LA5_0==OU) ) {
						alt5=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 5, 0, input);
						throw nvae;
					}

					switch (alt5) {
						case 1 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:166:5: ET
							{
							match(input,ET,FOLLOW_ET_in_paramAuteur536); 

											les_pars_arbre.ajouteFils(new Arbre("", "AND"));
										
							}
							break;
						case 2 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:170:5: OU
							{
							match(input,OU,FOLLOW_OU_in_paramAuteur549); 

											les_pars_arbre.ajouteFils(new Arbre("", "OR"));
										
							}
							break;

					}

					// /volsme/users/lo17a013/Antlr/categorie_1.g:176:3: ( ( NOT par2= paramA ) | (par2= paramA ) )
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==NOT) ) {
						alt6=1;
					}
					else if ( (LA6_0==VAR) ) {
						alt6=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 6, 0, input);
						throw nvae;
					}

					switch (alt6) {
						case 1 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:176:4: ( NOT par2= paramA )
							{
							// /volsme/users/lo17a013/Antlr/categorie_1.g:176:4: ( NOT par2= paramA )
							// /volsme/users/lo17a013/Antlr/categorie_1.g:176:5: NOT par2= paramA
							{
							match(input,NOT,FOLLOW_NOT_in_paramAuteur567); 

											les_pars_arbre.ajouteFils(new Arbre("", "NOT"));
										
							pushFollow(FOLLOW_paramA_in_paramAuteur580);
							par2=paramA();
							state._fsp--;


											par2_arbre = par2;
											les_pars_arbre.ajouteFils(par2_arbre);
										
							}

							}
							break;
						case 2 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:186:5: (par2= paramA )
							{
							// /volsme/users/lo17a013/Antlr/categorie_1.g:186:5: (par2= paramA )
							// /volsme/users/lo17a013/Antlr/categorie_1.g:186:6: par2= paramA
							{
							pushFollow(FOLLOW_paramA_in_paramAuteur600);
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
					break loop7;
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
	// /volsme/users/lo17a013/Antlr/categorie_1.g:196:1: paramA returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre paramA() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// /volsme/users/lo17a013/Antlr/categorie_1.g:196:52: (a= VAR )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:197:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_paramA637); 
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
	// /volsme/users/lo17a013/Antlr/categorie_1.g:201:1: paramArticle returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= paramArt ( ( ET | OU ) ( ( NOT par2= paramArt ) | (par2= paramArt ) ) )* ;
	public final Arbre paramArticle() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// /volsme/users/lo17a013/Antlr/categorie_1.g:202:40: (par1= paramArt ( ( ET | OU ) ( ( NOT par2= paramArt ) | (par2= paramArt ) ) )* )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:203:3: par1= paramArt ( ( ET | OU ) ( ( NOT par2= paramArt ) | (par2= paramArt ) ) )*
			{
			pushFollow(FOLLOW_paramArt_in_paramArticle667);
			par1=paramArt();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// /volsme/users/lo17a013/Antlr/categorie_1.g:208:3: ( ( ET | OU ) ( ( NOT par2= paramArt ) | (par2= paramArt ) ) )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==ET||LA10_0==OU) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// /volsme/users/lo17a013/Antlr/categorie_1.g:208:4: ( ET | OU ) ( ( NOT par2= paramArt ) | (par2= paramArt ) )
					{
					// /volsme/users/lo17a013/Antlr/categorie_1.g:208:4: ( ET | OU )
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==ET) ) {
						alt8=1;
					}
					else if ( (LA8_0==OU) ) {
						alt8=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 8, 0, input);
						throw nvae;
					}

					switch (alt8) {
						case 1 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:208:5: ET
							{
							match(input,ET,FOLLOW_ET_in_paramArticle678); 

											les_pars_arbre.ajouteFils(new Arbre("", "AND"));
										
							}
							break;
						case 2 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:212:5: OU
							{
							match(input,OU,FOLLOW_OU_in_paramArticle691); 

											les_pars_arbre.ajouteFils(new Arbre("", "OR"));
										
							}
							break;

					}

					// /volsme/users/lo17a013/Antlr/categorie_1.g:217:3: ( ( NOT par2= paramArt ) | (par2= paramArt ) )
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==NOT) ) {
						alt9=1;
					}
					else if ( (LA9_0==VAR) ) {
						alt9=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 9, 0, input);
						throw nvae;
					}

					switch (alt9) {
						case 1 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:217:4: ( NOT par2= paramArt )
							{
							// /volsme/users/lo17a013/Antlr/categorie_1.g:217:4: ( NOT par2= paramArt )
							// /volsme/users/lo17a013/Antlr/categorie_1.g:217:5: NOT par2= paramArt
							{
							match(input,NOT,FOLLOW_NOT_in_paramArticle706); 

											les_pars_arbre.ajouteFils(new Arbre("", "NOT"));
										
							pushFollow(FOLLOW_paramArt_in_paramArticle719);
							par2=paramArt();
							state._fsp--;


											par2_arbre = par2;
											les_pars_arbre.ajouteFils(par2_arbre);
										
							}

							}
							break;
						case 2 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:227:5: (par2= paramArt )
							{
							// /volsme/users/lo17a013/Antlr/categorie_1.g:227:5: (par2= paramArt )
							// /volsme/users/lo17a013/Antlr/categorie_1.g:227:6: par2= paramArt
							{
							pushFollow(FOLLOW_paramArt_in_paramArticle739);
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
					break loop10;
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
	// /volsme/users/lo17a013/Antlr/categorie_1.g:237:1: paramArt returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre paramArt() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// /volsme/users/lo17a013/Antlr/categorie_1.g:237:54: (a= VAR )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:238:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_paramArt776); 
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
	// /volsme/users/lo17a013/Antlr/categorie_1.g:242:1: paramTitre returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= paramT ( ( ET | OU ) ( ( NOT par2= paramT ) | (par2= paramT ) ) )* ;
	public final Arbre paramTitre() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// /volsme/users/lo17a013/Antlr/categorie_1.g:243:40: (par1= paramT ( ( ET | OU ) ( ( NOT par2= paramT ) | (par2= paramT ) ) )* )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:244:3: par1= paramT ( ( ET | OU ) ( ( NOT par2= paramT ) | (par2= paramT ) ) )*
			{
			pushFollow(FOLLOW_paramT_in_paramTitre806);
			par1=paramT();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// /volsme/users/lo17a013/Antlr/categorie_1.g:249:3: ( ( ET | OU ) ( ( NOT par2= paramT ) | (par2= paramT ) ) )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==ET||LA13_0==OU) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// /volsme/users/lo17a013/Antlr/categorie_1.g:249:4: ( ET | OU ) ( ( NOT par2= paramT ) | (par2= paramT ) )
					{
					// /volsme/users/lo17a013/Antlr/categorie_1.g:249:4: ( ET | OU )
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==ET) ) {
						alt11=1;
					}
					else if ( (LA11_0==OU) ) {
						alt11=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 11, 0, input);
						throw nvae;
					}

					switch (alt11) {
						case 1 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:249:5: ET
							{
							match(input,ET,FOLLOW_ET_in_paramTitre817); 

											les_pars_arbre.ajouteFils(new Arbre("", "AND"));
										
							}
							break;
						case 2 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:253:5: OU
							{
							match(input,OU,FOLLOW_OU_in_paramTitre830); 

											les_pars_arbre.ajouteFils(new Arbre("", "OR"));
										
							}
							break;

					}

					// /volsme/users/lo17a013/Antlr/categorie_1.g:258:3: ( ( NOT par2= paramT ) | (par2= paramT ) )
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==NOT) ) {
						alt12=1;
					}
					else if ( (LA12_0==VAR) ) {
						alt12=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 12, 0, input);
						throw nvae;
					}

					switch (alt12) {
						case 1 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:258:4: ( NOT par2= paramT )
							{
							// /volsme/users/lo17a013/Antlr/categorie_1.g:258:4: ( NOT par2= paramT )
							// /volsme/users/lo17a013/Antlr/categorie_1.g:258:5: NOT par2= paramT
							{
							match(input,NOT,FOLLOW_NOT_in_paramTitre845); 

											les_pars_arbre.ajouteFils(new Arbre("", "NOT"));
										
							pushFollow(FOLLOW_paramT_in_paramTitre858);
							par2=paramT();
							state._fsp--;


											par2_arbre = par2;
											les_pars_arbre.ajouteFils(par2_arbre);
										
							}

							}
							break;
						case 2 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:268:5: (par2= paramT )
							{
							// /volsme/users/lo17a013/Antlr/categorie_1.g:268:5: (par2= paramT )
							// /volsme/users/lo17a013/Antlr/categorie_1.g:268:6: par2= paramT
							{
							pushFollow(FOLLOW_paramT_in_paramTitre878);
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
					break loop13;
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
	// /volsme/users/lo17a013/Antlr/categorie_1.g:278:1: paramT returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre paramT() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// /volsme/users/lo17a013/Antlr/categorie_1.g:278:52: (a= VAR )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:279:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_paramT915); 
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
	// /volsme/users/lo17a013/Antlr/categorie_1.g:283:1: paramRubrique returns [Arbre les_pars_arbre = new Arbre(\"\")] : par1= paramR ( ( ET | OU ) ( ( NOT par2= paramR ) | (par2= paramR ) ) )* ;
	public final Arbre paramRubrique() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// /volsme/users/lo17a013/Antlr/categorie_1.g:284:40: (par1= paramR ( ( ET | OU ) ( ( NOT par2= paramR ) | (par2= paramR ) ) )* )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:285:3: par1= paramR ( ( ET | OU ) ( ( NOT par2= paramR ) | (par2= paramR ) ) )*
			{
			pushFollow(FOLLOW_paramR_in_paramRubrique945);
			par1=paramR();
			state._fsp--;


							par1_arbre = par1;
							les_pars_arbre.ajouteFils(par1_arbre);
						
			// /volsme/users/lo17a013/Antlr/categorie_1.g:290:3: ( ( ET | OU ) ( ( NOT par2= paramR ) | (par2= paramR ) ) )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==ET||LA16_0==OU) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// /volsme/users/lo17a013/Antlr/categorie_1.g:290:4: ( ET | OU ) ( ( NOT par2= paramR ) | (par2= paramR ) )
					{
					// /volsme/users/lo17a013/Antlr/categorie_1.g:290:4: ( ET | OU )
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==ET) ) {
						alt14=1;
					}
					else if ( (LA14_0==OU) ) {
						alt14=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 14, 0, input);
						throw nvae;
					}

					switch (alt14) {
						case 1 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:290:5: ET
							{
							match(input,ET,FOLLOW_ET_in_paramRubrique956); 

											les_pars_arbre.ajouteFils(new Arbre("", "AND"));
										
							}
							break;
						case 2 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:294:5: OU
							{
							match(input,OU,FOLLOW_OU_in_paramRubrique969); 

											les_pars_arbre.ajouteFils(new Arbre("", "OR"));
										
							}
							break;

					}

					// /volsme/users/lo17a013/Antlr/categorie_1.g:299:3: ( ( NOT par2= paramR ) | (par2= paramR ) )
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==NOT) ) {
						alt15=1;
					}
					else if ( (LA15_0==VAR) ) {
						alt15=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 15, 0, input);
						throw nvae;
					}

					switch (alt15) {
						case 1 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:299:4: ( NOT par2= paramR )
							{
							// /volsme/users/lo17a013/Antlr/categorie_1.g:299:4: ( NOT par2= paramR )
							// /volsme/users/lo17a013/Antlr/categorie_1.g:299:5: NOT par2= paramR
							{
							match(input,NOT,FOLLOW_NOT_in_paramRubrique984); 

											les_pars_arbre.ajouteFils(new Arbre("", "NOT"));
										
							pushFollow(FOLLOW_paramR_in_paramRubrique997);
							par2=paramR();
							state._fsp--;


											par2_arbre = par2;
											les_pars_arbre.ajouteFils(par2_arbre);
										
							}

							}
							break;
						case 2 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:309:5: (par2= paramR )
							{
							// /volsme/users/lo17a013/Antlr/categorie_1.g:309:5: (par2= paramR )
							// /volsme/users/lo17a013/Antlr/categorie_1.g:309:6: par2= paramR
							{
							pushFollow(FOLLOW_paramR_in_paramRubrique1017);
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
					break loop16;
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
	// /volsme/users/lo17a013/Antlr/categorie_1.g:319:1: paramR returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre paramR() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// /volsme/users/lo17a013/Antlr/categorie_1.g:319:52: (a= VAR )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:320:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_paramR1054); 
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
	// /volsme/users/lo17a013/Antlr/categorie_1.g:324:1: paramDate returns [Arbre les_pars_arbre = new Arbre(\"\")] : (par1= paramD | ( BETWEEN par1= paramDS ET par2= paramDI | AVANT par1= paramDIS | APRES par1= paramDSS | DEPUIS par1= paramDS ) );
	public final Arbre paramDate() throws RecognitionException {
		Arbre les_pars_arbre =  new Arbre("");


		Arbre par1 =null;
		Arbre par2 =null;

		Arbre par1_arbre, par2_arbre;
		try {
			// /volsme/users/lo17a013/Antlr/categorie_1.g:325:40: (par1= paramD | ( BETWEEN par1= paramDS ET par2= paramDI | AVANT par1= paramDIS | APRES par1= paramDSS | DEPUIS par1= paramDS ) )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==VAR) ) {
				alt18=1;
			}
			else if ( (LA18_0==APRES||(LA18_0 >= AVANT && LA18_0 <= BETWEEN)||LA18_0==DEPUIS) ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// /volsme/users/lo17a013/Antlr/categorie_1.g:326:3: par1= paramD
					{
					pushFollow(FOLLOW_paramD_in_paramDate1084);
					par1=paramD();
					state._fsp--;


									par1_arbre = par1;
									les_pars_arbre.ajouteFils(par1_arbre);
								
					}
					break;
				case 2 :
					// /volsme/users/lo17a013/Antlr/categorie_1.g:331:5: ( BETWEEN par1= paramDS ET par2= paramDI | AVANT par1= paramDIS | APRES par1= paramDSS | DEPUIS par1= paramDS )
					{
					// /volsme/users/lo17a013/Antlr/categorie_1.g:331:5: ( BETWEEN par1= paramDS ET par2= paramDI | AVANT par1= paramDIS | APRES par1= paramDSS | DEPUIS par1= paramDS )
					int alt17=4;
					switch ( input.LA(1) ) {
					case BETWEEN:
						{
						alt17=1;
						}
						break;
					case AVANT:
						{
						alt17=2;
						}
						break;
					case APRES:
						{
						alt17=3;
						}
						break;
					case DEPUIS:
						{
						alt17=4;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 17, 0, input);
						throw nvae;
					}
					switch (alt17) {
						case 1 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:331:6: BETWEEN par1= paramDS ET par2= paramDI
							{
							match(input,BETWEEN,FOLLOW_BETWEEN_in_paramDate1096); 
							pushFollow(FOLLOW_paramDS_in_paramDate1102);
							par1=paramDS();
							state._fsp--;

							match(input,ET,FOLLOW_ET_in_paramDate1104); 
							pushFollow(FOLLOW_paramDI_in_paramDate1110);
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
							// /volsme/users/lo17a013/Antlr/categorie_1.g:339:5: AVANT par1= paramDIS
							{
							match(input,AVANT,FOLLOW_AVANT_in_paramDate1121); 
							pushFollow(FOLLOW_paramDIS_in_paramDate1128);
							par1=paramDIS();
							state._fsp--;


											par1_arbre = par1;
											les_pars_arbre.ajouteFils(par1_arbre);
										
							}
							break;
						case 3 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:344:5: APRES par1= paramDSS
							{
							match(input,APRES,FOLLOW_APRES_in_paramDate1139); 
							pushFollow(FOLLOW_paramDSS_in_paramDate1146);
							par1=paramDSS();
							state._fsp--;


											par1_arbre = par1;
											les_pars_arbre.ajouteFils(par1_arbre);
										
							}
							break;
						case 4 :
							// /volsme/users/lo17a013/Antlr/categorie_1.g:349:5: DEPUIS par1= paramDS
							{
							match(input,DEPUIS,FOLLOW_DEPUIS_in_paramDate1157); 
							pushFollow(FOLLOW_paramDS_in_paramDate1164);
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
	// /volsme/users/lo17a013/Antlr/categorie_1.g:357:1: paramD returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre paramD() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// /volsme/users/lo17a013/Antlr/categorie_1.g:357:52: (a= VAR )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:358:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_paramD1191); 
			 lepar_arbre.ajouteFils(new Arbre("date =", "'"+a.getText()+"'"));
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
	// /volsme/users/lo17a013/Antlr/categorie_1.g:362:1: paramDI returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre paramDI() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// /volsme/users/lo17a013/Antlr/categorie_1.g:362:53: (a= VAR )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:363:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_paramDI1213); 
			 lepar_arbre.ajouteFils(new Arbre("date <=", "'"+a.getText()+"'"));
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
	// /volsme/users/lo17a013/Antlr/categorie_1.g:367:1: paramDS returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre paramDS() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// /volsme/users/lo17a013/Antlr/categorie_1.g:367:53: (a= VAR )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:368:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_paramDS1235); 
			 lepar_arbre.ajouteFils(new Arbre("date >=", "'"+a.getText()+"'"));
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
	// /volsme/users/lo17a013/Antlr/categorie_1.g:372:1: paramDIS returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre paramDIS() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// /volsme/users/lo17a013/Antlr/categorie_1.g:372:54: (a= VAR )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:373:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_paramDIS1257); 
			 lepar_arbre.ajouteFils(new Arbre("date <", "'"+a.getText()+"'"));
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
	// /volsme/users/lo17a013/Antlr/categorie_1.g:377:1: paramDSS returns [Arbre lepar_arbre = new Arbre(\"\")] : a= VAR ;
	public final Arbre paramDSS() throws RecognitionException {
		Arbre lepar_arbre =  new Arbre("");


		Token a=null;

		try {
			// /volsme/users/lo17a013/Antlr/categorie_1.g:377:54: (a= VAR )
			// /volsme/users/lo17a013/Antlr/categorie_1.g:378:2: a= VAR
			{
			a=(Token)match(input,VAR,FOLLOW_VAR_in_paramDSS1279); 
			 lepar_arbre.ajouteFils(new Arbre("date >", "'"+a.getText()+"'"));
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



	public static final BitSet FOLLOW_requete_in_listerequetes255 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_POINT_in_listerequetes257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_requete284 = new BitSet(new long[]{0x0000000000050260L});
	public static final BitSet FOLLOW_ARTICLE_in_requete296 = new BitSet(new long[]{0x0000000000100800L});
	public static final BitSet FOLLOW_WHERE_in_requete303 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_paramArticle_in_requete313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DONT_in_requete327 = new BitSet(new long[]{0x0000000000050240L});
	public static final BitSet FOLLOW_TITRE_in_requete333 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_WHERE_in_requete335 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_paramTitre_in_requete341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete353 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_WHERE_in_requete355 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_paramRubrique_in_requete361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_requete374 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_WHERE_in_requete376 = new BitSet(new long[]{0x0000000000080590L});
	public static final BitSet FOLLOW_paramDate_in_requete382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTEUR_in_requete395 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_WHERE_in_requete397 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_paramAuteur_in_requete402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTEUR_in_requete427 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_DATE_in_requete438 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_RUBRIQUE_in_requete449 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_TITRE_in_requete459 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_DONT_in_requete474 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARTICLE_in_requete476 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_WHERE_in_requete478 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_paramArticle_in_requete485 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramA_in_paramAuteur524 = new BitSet(new long[]{0x0000000000005002L});
	public static final BitSet FOLLOW_ET_in_paramAuteur536 = new BitSet(new long[]{0x0000000000082000L});
	public static final BitSet FOLLOW_OU_in_paramAuteur549 = new BitSet(new long[]{0x0000000000082000L});
	public static final BitSet FOLLOW_NOT_in_paramAuteur567 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_paramA_in_paramAuteur580 = new BitSet(new long[]{0x0000000000005002L});
	public static final BitSet FOLLOW_paramA_in_paramAuteur600 = new BitSet(new long[]{0x0000000000005002L});
	public static final BitSet FOLLOW_VAR_in_paramA637 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramArt_in_paramArticle667 = new BitSet(new long[]{0x0000000000005002L});
	public static final BitSet FOLLOW_ET_in_paramArticle678 = new BitSet(new long[]{0x0000000000082000L});
	public static final BitSet FOLLOW_OU_in_paramArticle691 = new BitSet(new long[]{0x0000000000082000L});
	public static final BitSet FOLLOW_NOT_in_paramArticle706 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_paramArt_in_paramArticle719 = new BitSet(new long[]{0x0000000000005002L});
	public static final BitSet FOLLOW_paramArt_in_paramArticle739 = new BitSet(new long[]{0x0000000000005002L});
	public static final BitSet FOLLOW_VAR_in_paramArt776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramT_in_paramTitre806 = new BitSet(new long[]{0x0000000000005002L});
	public static final BitSet FOLLOW_ET_in_paramTitre817 = new BitSet(new long[]{0x0000000000082000L});
	public static final BitSet FOLLOW_OU_in_paramTitre830 = new BitSet(new long[]{0x0000000000082000L});
	public static final BitSet FOLLOW_NOT_in_paramTitre845 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_paramT_in_paramTitre858 = new BitSet(new long[]{0x0000000000005002L});
	public static final BitSet FOLLOW_paramT_in_paramTitre878 = new BitSet(new long[]{0x0000000000005002L});
	public static final BitSet FOLLOW_VAR_in_paramT915 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramR_in_paramRubrique945 = new BitSet(new long[]{0x0000000000005002L});
	public static final BitSet FOLLOW_ET_in_paramRubrique956 = new BitSet(new long[]{0x0000000000082000L});
	public static final BitSet FOLLOW_OU_in_paramRubrique969 = new BitSet(new long[]{0x0000000000082000L});
	public static final BitSet FOLLOW_NOT_in_paramRubrique984 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_paramR_in_paramRubrique997 = new BitSet(new long[]{0x0000000000005002L});
	public static final BitSet FOLLOW_paramR_in_paramRubrique1017 = new BitSet(new long[]{0x0000000000005002L});
	public static final BitSet FOLLOW_VAR_in_paramR1054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramD_in_paramDate1084 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BETWEEN_in_paramDate1096 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_paramDS_in_paramDate1102 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_ET_in_paramDate1104 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_paramDI_in_paramDate1110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AVANT_in_paramDate1121 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_paramDIS_in_paramDate1128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_APRES_in_paramDate1139 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_paramDSS_in_paramDate1146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEPUIS_in_paramDate1157 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_paramDS_in_paramDate1164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_paramD1191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_paramDI1213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_paramDS1235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_paramDIS1257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_paramDSS1279 = new BitSet(new long[]{0x0000000000000002L});
}
