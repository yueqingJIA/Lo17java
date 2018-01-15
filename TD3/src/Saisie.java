import java.io.*;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.StringTokenizer;

class Saisie{
     public static void main(String[] args) {
     BufferedReader br=null;
     String chaine;
     String mot;
     Lexique monLexique = new Lexique("filtreCorpus_P16.txt");
     //Lexique monLexique = new Lexique("test.txt");
     try {
          try {
              br = new BufferedReader(new InputStreamReader(System.in));
              System.out.print("saisie : ");
              chaine=br.readLine();
              System.out.println("j'ai saisi "+chaine);
              //convertion en minuscule de la chaine
              chaine = chaine.toLowerCase();
              //création des tokens de la chaine
              StringTokenizer token = new StringTokenizer(chaine);
              while (token.hasMoreElements()) {
            	mot = token.nextToken();
      			if (monLexique.get_mot(mot)!=null) {
      				System.out.println(monLexique.get_mot(mot));
      			}
      			
      			else{
      				char[] cast_mot = mot.toCharArray();
      				Prefixe Prox = new Prefixe(cast_mot, "filtreCorpus_P16.txt");
      				if (Prox.prox_max > 0) {//seuil de Préfixe déjà défini dans Lexique.java
      					//parcourir pour afficher tous les mots qui ont une proximité maximale
      					for(Iterator it = Prox.Prox.keySet().iterator();it.hasNext();){
      						char[] key = (char[]) it.next();
      						Integer numprox = Prox.Prox.get(key);  
      						if(numprox == Prox.prox_max) {
      							System.out.print(Prox.getLemme(key));
      							System.out.print("  ");
      						}
                        } 
      				System.out.println();
      				}//end of prefixe
      				/*
      				//else {
      				int seuil_leven = 1;
          				Levenshtein Leven = new Levenshtein(cast_mot, "filtreCorpus_P16.txt");
          				//si la distance minimale est inférieur à seuil minimal
          				if (Leven.distance_min <= seuil_leven){
          					//parcourir pour afficher tous les mots qui ont une distance
	          				for(Iterator it = Leven.Dist.keySet().iterator();it.hasNext();){
	      						char[] key = (char[]) it.next();
	      						Integer numdist = Leven.Dist.get(key);  
	      						if(numdist == Leven.distance_min) {
	      							System.out.print(key);
	      							System.out.print("  ");
	      						}
	                        } 
          				System.out.println();
          				}
      				//}//end of Levenshtein
      				 
      				 */
      				//else {
      					//System.out.println("aucun lemme n'a été trouvé pour le token : " + mot);
      				//}
      			}//end of else
              }//end of while
          }//end of try
          catch(EOFException e) {
               br.close();
               }
          } 
     catch(IOException e) {
          System.out.println("IO Exception");
          }
     }
}

