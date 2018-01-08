package com.cox.pwdutility;
import java.io.ByteArrayOutputStream;
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
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;

import org.apache.commons.lang.StringUtils;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class TestME {


	private static String getReagionId(SOAPMessage message) {
		String xml = null;
		try {
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			message.writeTo(out);
			String strMsg = new String(out.toByteArray());
			System.out.println("**************************");
			System.out.println("SOAP MESSAGE:" + strMsg);
			System.out.println("**************************");
			
			String value = StringUtils.substringBetween(strMsg, "<ReagionID>", "</ReagionID>");
			
			System.out.println("Value:" + value);
			
			SOAPPart sp = message.getSOAPPart();
			SOAPEnvelope env = sp.getEnvelope();
			NodeList lst = env.getOwnerDocument().getDocumentElement().getChildNodes();
			for (int i = 0; i < lst.getLength(); i++) {
				Node nd = lst.item(i);
				if (nd.getNodeName().contains("SOAP-ENV:Body")) {
					System.out.println("nd::"+nd);
					NodeList lst1 = nd.getChildNodes();
					for (int j = 0; j < lst1.getLength(); j++) {
						Node nd1 = lst1.item(j);
						if (nd1.getNodeName().contains(":onNotifications")) {
							NodeList lst2 = nd1.getChildNodes();
							for (int k = 0; k < lst2.getLength(); k++) {
								Node nd2 = lst2.item(k);
								if (nd2.getNodeName().contains("Response")) {
									NodeList lst3 = nd2.getChildNodes();
									for (int a = 0; a < lst3.getLength(); a++) {
										Node nd3 = lst3.item(a);
										if (nd3.getNodeName().contains("ReagionID")) {
											System.out.println("ReagionID0::"+nd3);
System.out.println("ReagionID::"+nd3.getNodeName());
System.out.println("ReagionID2::"+nd3.getNodeValue());
											if (nd3.getFirstChild() != null) {
												
											}

										} 

									}
								}
							}
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		
		
		File initialFile = new File("D:/Cox-Communications/Telephony-Paas/cposs-codebase/pwdutility/src/main/java/com/cox/pwdutility/dummy.txt");
	    InputStream targetStream =null;
		try {
			targetStream = new FileInputStream(initialFile);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			SOAPMessage request = MessageFactory.newInstance().createMessage(null, targetStream);
			System.out.println("request"+request);
			getReagionId(request);
		} catch (IOException | SOAPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
