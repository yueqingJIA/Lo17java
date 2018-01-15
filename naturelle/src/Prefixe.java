import java.util.StringTokenizer;
import java.io.*;
import java.util.Hashtable;
import java.lang.Math.*;

class Prefixe {
	//declaration table hash du fichier txt : le lexique
	private Hashtable<char[], char[]> HT; 
	//déclaration table hash (proximité, mot)
	public Hashtable<char[], Integer> Prox;
	//public char[] candidat;
	public int prox_max;
	//public Hashtable<char[], Integer>  liste_candidat;
	
	public Prefixe(char[] motS, String fichier) {
		this.HT = new Hashtable<char[], char[]>();
		this.Prox = new Hashtable<char[], Integer>();
		//this.liste_candidat = new Hashtable<char[], Integer>();
		//Cat.java
		BufferedReader br=null;
		String chaine;
		int longueur_motS = motS.length;
		//plus tard on rejetera les mots contenant au max 3 lettres (taille)
		Integer seuil_Min = 3;
		//plus tard on rejetera les mots de lettres communes < 4 (lettres communes)
		Integer	seuil_Max = 4;
		int seuil_exigence = 70;
		this.prox_max = 0;
		
	    
	    try {
	         try {
	             br = new BufferedReader(new FileReader(fichier));
	             //pour chaque ligne du fichier entré en paramètre 
	             while ((chaine=br.readLine())!=null){
	            	StringTokenizer token = new StringTokenizer(chaine);
	            	char[] motL = token.nextToken().toCharArray();
	            	char[] lemme = token.nextToken().toCharArray();
	            	Integer lg_motL = motL.length;
	            	int longueur_motL = (int) lg_motL;
	            	HT.put(motL, lemme);
	            	int longueur_max = Math.max(longueur_motS, longueur_motL);
	            	
	            	
	            	if ((longueur_motS < seuil_Min)||(longueur_motL < seuil_Min)) {
	            		//Prox.put(motL, 0);
	            	}
	            	else if (Math.abs(longueur_motS - longueur_motL) >= seuil_Max){
	            		//Prox.put(motL, 0);
	            	}
	            	else {
	            		int i = 0;
	            		while ((i < Math.min(longueur_motS, longueur_motL)) && (motS[i] == motL[i])) {
	            			i++;
	            		}
	            		int calcul_prox = 100*i/longueur_max;
	            		if (calcul_prox > seuil_exigence) {
	            			/*if (!this.liste_candidat.containsKey(this.HT.get(motL))) {
	            				this.liste_candidat.put(this.HT.get(motL), calcul_prox);
	            			}*/
	            			Prox.put(motL, calcul_prox);
	            			if(calcul_prox > this.prox_max){
		            			this.prox_max = calcul_prox;
		            			//this.candidat = motL;
		            		}
	            		}
	            		else {
	            			//Prox.put(motL, 0);
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
