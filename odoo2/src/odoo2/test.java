package odoo2;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.*;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.util.Collections;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

public class test {

	public static void main(String[] args) throws XmlRpcException, MalformedURLException {
		// TODO Auto-generated method stub
		System.out.println("fine there");
		
		final String url = "http://172.16.130.223:8069/xmlrpc/common",
	          db = "Emmaus",
	        username = "admin",
	        password = "admin";
		
		final XmlRpcClient client = new XmlRpcClient();
		System.out.println("fine there2");
		final XmlRpcClientConfigImpl common_config = new XmlRpcClientConfigImpl();
		common_config.setServerURL(
		    new URL(String.format("%s/xmlrpc/2/common", url)));
		client.execute(common_config, "version",Collections.emptyList());
		
		/*int uid = (int)client.execute(
			    common_config, "authenticate", asList(
			        db, username, password, Collections.emptyMap()));*/
		
		/*final XmlRpcClient client = new XmlRpcClient();
		System.out.println("fine there2");
		final XmlRpcClientConfigImpl start_config = new XmlRpcClientConfigImpl();
		start_config.setServerURL(new URL("172.16.130.223:8069"));
		//172.16.130.223:8069
		final Map<String, String> info = (Map<String, String>)client.execute(
		    start_config, "start", Collections.emptyList());

		final String url = info.get("host"),
		              db = info.get("database"),
		        username = info.get("user"),
		        password = info.get("password");
		System.out.println("url : "+url+"\ndb : "+db+"\nusername : "+username+"\npassword : "+password);
*/
	}

}
