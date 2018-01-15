import java.io.*;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.StringTokenizer;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
//import org.divxdede.util.text.StringOperation;

import java.io.*;
import java.util.Scanner;
//import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.StringTokenizer;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;

class Saisie{
     public static void main(String[] args) {
     BufferedReader br=null;
     String chaine;
     String mot;
     Lexique monLexique = new Lexique("lemmes.txt");
     String req = "";
     int seuil_Leven = 0;
     try {
          try {
        	  //cap1 pour la saisie
              br = new BufferedReader(new InputStreamReader(System.in));
              System.out.print("saisie : ");
              chaine=br.readLine();
              System.out.println("j'ai saisi "+chaine);
              //cap1
              //convertion en minuscule de la chaine
              chaine = chaine.toLowerCase();
              // separer une chaine en 2 mots
              StringTokenizer token = new StringTokenizer(chaine);

              while (token.hasMoreElements()) {
            	mot = token.nextToken();
            	if (monLexique.get_mot(mot)!=null) {
      				String tmp = monLexique.get_mot(mot);
      				if (tmp.indexOf("_")>-1){
      					String[] tmp2;
          				tmp2 = tmp.split("_");
          				req += tmp2[0] + " " + tmp2[1]+ " ";
      				}
      			//si lemme n'est pas 0
      				else if(!tmp.equals("0"))
      				{
      					req += tmp + " ";
      				}
      			}         	  
      			else {
      				//cap3 prefix
      				char[] cast_mot = mot.toCharArray();
      				Prefixe Prox = new Prefixe(cast_mot, "lemmes.txt");
      				Levenshtein Leven = new Levenshtein(cast_mot, "lemmes.txt");
      				//initialisation de seuil_leven
  					int longeur = mot.length();
      				seuil_Leven = longeur/4;
      				System.out.println(seuil_Leven);
      				if (Prox.prox_max > 0) {//seuil défini dans le class Prefixe
      					for(Iterator it = Prox.Prox.keySet().iterator();it.hasNext();){
      						char[] key = (char[]) it.next();
      						Integer numprox = Prox.Prox.get(key);  
      						if(numprox == Prox.prox_max) {
      							if(!Prox.getLemme(key).equals("0"))
      		      				{
      		      					req += String.valueOf(Prox.getLemme(key)) + " ";
      		      				}
      							break;
      						}
      						System.out.println();
      					}
      				}
      				//cap3 end of prefixe
      				//tester seuil pour un mot ->  touver le seuil
      				//cap4 leven
      				
      				
      				else if (Leven.distance_min <= seuil_Leven){
      					
          				for(Iterator it = Leven.Dist.keySet().iterator();it.hasNext();){
      						char[] key = (char[]) it.next();
      						Integer numdist = Leven.Dist.get(key);  
      						if(numdist == Leven.distance_min) {
      							//System.out.print(Leven.HT.get(key));
      							//si lemme n'est pas 0
      							if(!Leven.HT.get(key).toString().equals("0"))
      		      				{
      								req += String.valueOf(Leven.HT.get(key)) + " ";
      		      				}
      							break;
      						}
                        } 
          				System.out.println();
      				}//cap4 end of Levenshtein
      				//tester seuil pour un mot ->  touver le seuil
      				else {
      					req += mot + " ";
      				}
      			}
              }
              //pour traiter les accents
              //req = StringOperation.transform(req , 16);
              StringTokenizer token2 = new StringTokenizer(req);
              String rubrique;
              String requete_rubrique = "";

              //parcours des mots de la requête
              while (token2.hasMoreElements()) {
            	String mot_req = token2.nextToken();
            	if(mot_req.equals("rubrique")){
            		requete_rubrique += mot_req + " ";
            		String mot_2 = token2.nextToken();
            		if(mot_2.equals("parler")) {
            			requete_rubrique += mot_2 + " ";
            			rubrique = token2.nextToken();
            			//mettre la première lettre en majuscule du mot qui suit "rubrique parler"
            			rubrique = rubrique.replace(rubrique.substring(0,1), rubrique.substring(0,1).toUpperCase());
            			requete_rubrique += rubrique + " .";
            			req = requete_rubrique;
            		}
            	}
            	else {
            		requete_rubrique += mot_req + " ";
            	}
              }
              System.out.println(req);
              
              
            
	          //TD Antlrwork
	          /********************/
	          //cap6
              try{
		              	System.out.print("SQL : ");
		                categorie_1Lexer lexer = new categorie_1Lexer(new ANTLRReaderStream(new StringReader(req)));
		                CommonTokenStream tokens = new CommonTokenStream(lexer);
		                categorie_1Parser parser = new categorie_1Parser(tokens);
		                String arbre = parser.listerequetes();
		                req = arbre;
		                System.out.println(arbre);
	          } 
	          catch(Exception e) {  }
            //cap6
	          /********************/
	          //TD Api JAVA 
	          /********************/
	          String username;
	      	  String password;
	      	  String url;
	      	  String nom;
	      	  int nbre;
      		
	      	  // ---- configure START
	      	  username = "lo17xxx";
	      	  password = "dblo17";
	      	  // The URL that will connect to TECFA's MySQL server
	      	  // Syntax: jdbc:TYPE:machine:port/DB_NAME
	      	  url = "jdbc:postgresql://tuxa.sme.utc/dblo17";
      		
      		  // INSTALL/load the Driver (Vendor specific Code)
	      	  try {
	      		  Class.forName("org.postgresql.Driver");
	      	  } 
	      	  catch(java.lang.ClassNotFoundException e) {
		      	  System.err.print("ClassNotFoundException: ");
		      	  System.err.println(e.getMessage());
	      	  }
	      	  try {
	      			Connection con;
	      			Statement stmt;
	      		    
	      			// Establish Connection to the database at URL with usename and password
	      			con = DriverManager.getConnection(url, username, password);
	      			stmt = con.createStatement();
	      			
	      			ResultSet rs = stmt.executeQuery(req);
	      			
	      			//on récupère les métadonnées à partir de Connection 
	      			DatabaseMetaData dmd = con.getMetaData(); 
	      			ResultSetMetaData resultSetMetaData = rs.getMetaData();
	      			
	      			for(int j=0; j<resultSetMetaData.getColumnCount(); j++){ 
	      					String col = resultSetMetaData.getColumnName(j+1); 
	      					System.out.print(col + '\t');					    
	      			}
	      			System.out.println();
	      			while (rs.next()){
	      				for(int i = 1; i <=  resultSetMetaData.getColumnCount(); i++){
	      					System.out.print(rs.getObject(i).toString() + '\t');	
	      				}
	      				System.out.println();
	      			}
	      			
	      		// Close resources
	      		stmt.close();
	      		con.close();
	      	 }
      		 // print out decent erreur messages
	      	 catch(SQLException ex) {
	      		    System.err.println("==> SQLException: ");
	      			while (ex != null) {
		      			System.out.println("Message:   " + ex.getMessage ());
		      			System.out.println("SQLState:  " + ex.getSQLState ());
		      			System.out.println("ErrorCode: " + ex.getErrorCode ());
		      			ex = ex.getNextException();
		      			System.out.println("");
	      			}
	      	 }
          }
          //end of try
        
          
		  catch(EOFException e) {
			  br.close();
		  }
     } 
	 catch(IOException e) {
		 System.out.println("IO Exception");
	 }
     }
}

