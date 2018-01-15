/*import xmlrpclib;

class test {
	 public static void main(String[] args) {


info = xmlrpclib.ServerProxy('https://demo.odoo.com/start').start()
	url, db, username, password = \
	    info['host'], info['database'], info['user'], info['password']
	 }
}
*/
import java.x
final XmlRpcClient client = new XmlRpcClient();

final XmlRpcClientConfigImpl start_config = new XmlRpcClientConfigImpl();
start_config.setServerURL(new URL("https://demo.odoo.com/start"));
final Map<String, String> info = (Map<String, String>)client.execute(
    start_config, "start", emptyList());

final String url = info.get("host"),
              db = info.get("database"),
        username = info.get("user"),
        password = info.get("password");