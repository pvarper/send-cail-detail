package micrium.calldetail.test;

import java.io.File;
import micrium.calldetail.Send;
import org.apache.log4j.xml.DOMConfigurator;

public class Test {

	//private static final Logger log = Logger.getLogger(Send.class);
	public static int ses=0;
	public static void main(String[] args) {
		DOMConfigurator.configure("etc" + File.separator + "log4j.xml");
		// continueTest();
		//log();
		//conexionOracle();
		Send.send();
	}
}
