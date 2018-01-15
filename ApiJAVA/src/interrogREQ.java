import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class interrogREQ {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
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

		String requete ="";
		BufferedReader br=null;
		
		// saisie de la requete
		
		try {
			try {
				br = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("saisir la requete : ");
				requete=br.readLine();
				System.out.println(requete);
			} 
			catch(EOFException e) {
				br.close();
			}
		} 
		catch(IOException e) {
			System.out.println("IO Exception");
		}

		// INSTALL/load the Driver (Vendor specific Code)
		try {
			Class.forName("org.postgresql.Driver");
		} catch(java.lang.ClassNotFoundException e) {
		System.err.print("ClassNotFoundException: ");
		System.err.println(e.getMessage());
		}

		try {
			Connection con;
			Statement stmt;
		    
			// Establish Connection to the database at URL with usename and password
			con = DriverManager.getConnection(url, username, password);
			stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery(requete);
			
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

	private static String[] split(char c, String requete) {
		// TODO Auto-generated method stub
		return null;
	}
	}
