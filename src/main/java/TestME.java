import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.TimeZone;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class TestME {

	private static String getReagionId(SOAPMessage message) {
		String reagionid = null;

		try {

			SOAPPart sp = message.getSOAPPart();
			SOAPEnvelope env = sp.getEnvelope();
			NodeList lst = env.getOwnerDocument().getDocumentElement().getChildNodes();
			for (int i = 0; i < lst.getLength(); i++) {
				Node nd = lst.item(i);
				if (nd.getNodeName().contains("SOAP-ENV:Body")) {
					NodeList lst1 = nd.getChildNodes();
					for (int j = 0; j < lst1.getLength(); j++) {
						Node nd1 = lst1.item(j);
						if (nd1.getNodeName().contains(":onNotifications")) {
							NodeList lst2 = nd1.getChildNodes();
							for (int k = 0; k < lst2.getLength(); k++) {
								Node nd2 = lst2.item(k);
								if (nd2.getNodeName().contains("Response")) {
									reagionid = nd2.getFirstChild().getNodeValue();
									System.out.println(reagionid);
									/*
									 * for (int a = 0; a < lst3.getLength();
									 * a++) { Node nd3 = lst3.item(a); if
									 * (nd3.getNodeName().contains("ReagionID"))
									 * { reagionid =nd3.getNodeValue(); }
									 * 
									 * }
									 */
								}
							}
						}
					}
				}
			}
		} catch (SOAPException e) {
			//LOGGER.logError("Exception while reading Reagion id" + e.getMessage());
		}
		return reagionid;
	}

	public static void main(String[] args) {
		
		
		File initialFile = new File("./dummy.txt");
	    InputStream targetStream =null;
		try {
			targetStream = new FileInputStream(initialFile);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			SOAPMessage request = MessageFactory.newInstance().createMessage(null, targetStream);
			getReagionId(request);
		} catch (IOException | SOAPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
