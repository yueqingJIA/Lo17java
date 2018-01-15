import java.io.*;
import java.util.Hashtable;
import java.util.StringTokenizer;
class Lexique {
	//declaration table hash
	Hashtable<String, String> HT = new Hashtable<String, String>();
	//récupérer les arguments
	public Lexique(String fichier) {
	//Cat.java
	BufferedReader br=null;
    String chaine;
    String mot;
    String valeur;
    
    try {
         try {
             br = new BufferedReader(new FileReader(fichier));
             //pour chaque ligne du fichier entré en paramètre 
             while ((chaine=br.readLine())!=null){
            	StringTokenizer token = new StringTokenizer(chaine);
           		HT.put(token.nextToken(),token.nextToken());
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
	public String get_mot(String mot){
		return HT.get(mot);
	}
}
