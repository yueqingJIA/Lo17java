package odoo2;

import java.lang.reflect.Array;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.xmlrpc.XmlRpcException;

//import java.net.MalformedURLException;
//import java.net.URL;


//import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.*;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
//import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;
//import java.util.Collections;
public class testodoo {
	public static void main(String[] args)  {
		//final String url = "http://172.16.130.223:8069",
	     //      db = "Emmaus",
	      //  username = "admin",
	      //  password = "admin";
		//System.out.println(password);
		XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl(); 
		try {
			config.setServerURL(new URL("http://172.16.130.223:8069"));
			XmlRpcClient client = new XmlRpcClient();  
            client.setConfig(config);
            final XmlRpcClientConfigImpl common_config = new XmlRpcClientConfigImpl();
            common_config.setServerURL(
                new URL(String.format("%s/xmlrpc/common", "http://172.16.130.223:8069")));
            String[] list = null;

final XmlRpcClientConfigImpl start_config = new XmlRpcClientConfigImpl();
start_config.setServerURL(new URL("https://demo.odoo.com/start"));
final Map<String, String> info = (Map<String, String>)client.execute(
    start_config, "start", list);

final String url = info.get("host");
//              db = info.get("database"),
//        username = info.get("user"),
//        password = info.get("password");
           // Map map = null;
           // client.execute(common_config, "version", list);
           // int uid = (int)client.execute(
           // 	    common_config, "authenticate", asList(
           // 	        db, username, password, map));
//final XmlRpcClientConfigImpl common_config = new XmlRpcClientConfigImpl();
common_config.setServerURL(
    new URL(String.format("%s/xmlrpc/common", "http://172.16.130.223:8069")));
final Map<String, String> info2 = (Map<String, String>)client.execute(common_config, "version", list);
//System.out.println(list);
String db= "Emmaus";
String password = "admin";
//------------------------Cette partie sert � connecter
int uid = (int)client.execute(
	    common_config, "authenticate", Arrays.asList("Emmaus", "admin", "admin", info2));	
//db2 = info2.get("protocol_version");
//String username2 = info2.get("uid");
final XmlRpcClient models = new XmlRpcClient() {{
    setConfig(new XmlRpcClientConfigImpl() {{
        setServerURL(new URL(String.format("%s/xmlrpc/object", "http://172.16.130.223:8069")));
    }});
}};
/*Object map;
map=models.execute("execute_kw", Arrays.asList(
    db, uid, password,
    "res.partner", "active", Arrays.asList("read"),
    new HashMap() {{ put("raise_exception", false); }}
));
System.out.println(map);*/
//password2 = info2.get("password");

//--------------Cette partie est pour afficher les identifiants des utilisatuers avec une condition.
Object map;
map=Arrays.asList((Object[])models.execute("execute_kw", Arrays.asList(
	    db, uid, password,
	    "res.partner", "search",
	    Arrays.asList(Arrays.asList(
	        Arrays.asList("display_name", "<>", "x")
	        ))
	)));
System.out.println(map);
//Object[] params = new Object[0];
List list2=null;
Object[] params = new Object[0];
/*models.execute("execute_kw", Arrays.asList(
	    db, uid, password,
	    "res.partner", "fields_get",
	    list2,
	    new HashMap() {{
	        put("attributes", Arrays.asList("string", "help", "type"));
	    }}
	));*/

//--------------------Cette partie est pour extraire des donn�es d'un table avec une condition
map=Arrays.asList((Object[])models.execute("execute_kw", Arrays.asList(
	    db, uid, password,
	    "res.partner", "search_read",
	    Arrays.asList(Arrays.asList(
	        Arrays.asList("is_company", "=", false))),
	    new HashMap() {{
	        put("fields", Arrays.asList("name","display_name"));
	        put("limit",5);
	    }}
	)));
System.out.println(map);
		} catch (MalformedURLException | XmlRpcException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//XmlRpcClient client = new XmlRpcClient();
		//new URL(String.format("%s/xmlrpc/2/common", url)));
		//client.execute(common_config, "version", emptyList());
		System.out.println("na17");

}
}
