import java.util.StringTokenizer;
import java.io.*;
import java.util.Hashtable;
import java.lang.Math.*;

class Prefixe {
	//hashtable HT <mot, lemme> pour stocker le mot et son lemme
	private Hashtable<char[], char[]> HT; 
	//hashtable prox <mot, proximité> 
	//pour stocker le mot et sa valeur de proximité par rapport à un mot donné
	public Hashtable<char[], Integer> Prox;
	//valeur maximale de proximité dans la hashtable Prox
	public int prox_max;

	public Prefixe(char[] motS, String fichier) {
		this.HT = new Hashtable<char[], char[]>();
		this.Prox = new Hashtable<char[], Integer>();
		BufferedReader br=null;
		String chaine;
		int longueur_motS = motS.length;
		//seuil minimal pour rejeter un mot très court
		Integer seuil_Min = 3;
		//si la différence des longueurs des deux mots est supérieure au seuil minimal, on rejette
		Integer	seuil_Max = 4;
		//on ajoute seulement les mots dans la hashtable Prox qui ont la 
		//valeur de proximité supérieure au seuil d’exigence
		int seuil_exigence = 80;
		this.prox_max = 0;//initialisation de la valeur maximale de proximité 
	    try {
	         try {
	             br = new BufferedReader(new FileReader(fichier));
	             //pour chaque ligne du fichier entrée en paramètre 
	             while ((chaine=br.readLine())!=null){
	            	StringTokenizer token = new StringTokenizer(chaine);
	            	char[] motL = token.nextToken().toCharArray();
	            	char[] lemme = token.nextToken().toCharArray();
	            	Integer lg_motL = motL.length;
	            	int longueur_motL = (int) lg_motL;
	            	HT.put(motL, lemme);
	            	int longueur_max = Math.max(longueur_motS, longueur_motL);
	            	if ((longueur_motS <= seuil_Min)||(longueur_motL <= seuil_Min)) {
	            		//le mot est trop court, on ne fait rien
	            	}
	            	else if (Math.abs(longueur_motS - longueur_motL) >= seuil_Max){
	            		//la différence des longueurs des deux mots est trop grande, on ne fait rien
	            	}
	            	else {
	            		int i = 0;
	            		while ((i < Math.min(longueur_motS, longueur_motL)) && (motS[i] == motL[i])) {
	            			i++;
	            		}
	            		int calcul_prox = 100*i/longueur_max;
	            		if (calcul_prox > seuil_exigence) {
	            			//on ajoute le mot et sa valeur de proximité dans la hashtable Prox
	            			Prox.put(motL, calcul_prox);
	            			if(calcul_prox > this.prox_max){
	            				//on met à jour la valeur maximale
		            			this.prox_max = calcul_prox;
		            		}
	            		}
	            		else {
	            			//la valeur de proximité est trop faible, on ne fait rien
	            		}
	            	}
	             }
	             
	             } 
	         catch(EOFException e) {
	              br.close();
	              }
	         } 
	    catch(FileNotFoundException e) {
	         System.out.println("fichier inconnu : " + fichier);
	         } 
	    catch(IOException e) {
	         System.out.println("IO Exception");
	         }
	    }
	
	public Hashtable<char[], Integer> getProx() {
		return this.Prox;
	}
	
	public char[] getLemme(char[] motL) {
		return this.HT.get(motL);
	}
	
}
