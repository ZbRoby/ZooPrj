package com.msg.zooPrj.command;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.stream.StreamResult;

import org.xml.sax.InputSource;

import com.msg.zooPrj.singleton.SingletonEnum;
import com.msg.zooPrj.singleton.ZooLog;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

/**
 * @author marius
 * Implementation of command interface
 * Save to xml file. Objects to xml file.
 */

public class CommandSaveToXML implements Command{

	private String file;
	
	public CommandSaveToXML(String file) {
		this.file = file;
		ZooLog.logger.info("SaveToXML command created...");
	}

	
	@Override
	public void execute() {
		XStream xstream = new XStream(new StaxDriver());
		String xml = xstream.toXML(SingletonEnum.INSTANCE.getSpecime());
		
		try {
			
			PrintWriter writer = new PrintWriter(file, "UTF-8");
			writer.print(formatXml(xml));
			writer.close();

		} catch (FileNotFoundException e) {
			ZooLog.logger.severe("File not found exception.");
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			ZooLog.logger.severe("Unsupported encoding exception.");
			e.printStackTrace();
		}
		
		ZooLog.logger.info("SaveToXML command executed...");
		
	}
	
	
	public static String formatXml(String xml){
	 	   
        try{
           Transformer serializer = SAXTransformerFactory.newInstance().newTransformer();
           
           serializer.setOutputProperty(OutputKeys.INDENT, "yes");
           serializer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
           
           Source xmlSource = new SAXSource(new InputSource(new ByteArrayInputStream(xml.getBytes())));
           StreamResult res =  new StreamResult(new ByteArrayOutputStream());            
           
           serializer.transform(xmlSource, res);
           
           return new String(((ByteArrayOutputStream)res.getOutputStream()).toByteArray());
           
        }catch(Exception e){
           return xml;
        }
     }

}
