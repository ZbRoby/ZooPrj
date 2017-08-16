package com.msg.zooPrj.command;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.msg.zooPrj.composite.Specimen;
import com.msg.zooPrj.composite.SpecimenGroupAL;
import com.msg.zooPrj.composite.SpecimenGroupHM;
import com.msg.zooPrj.singleton.SingletonEnum;
import com.msg.zooPrj.singleton.ZooLog;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

/**
 * @author marius
 * Implementation of command interface
 * Open from xml file. Objects from xml file. 
 */

public class CommandOpen implements Command{

	private String file;
	
	public CommandOpen(String file) {
		this.file = file;
		ZooLog.logger.info("Open command created...");
	}

	@Override
	public void execute() {
		String text ="";
		FileReader filereader = null;
		BufferedReader breader = null;
		try {
			filereader = new FileReader(file);
			breader = new BufferedReader(filereader);
			
			String line;
		    while ((line = breader.readLine()) != null) {
		    	text += line;
		    }
			
		} catch (FileNotFoundException e) {
			ZooLog.logger.severe("File not found exception.");
			e.printStackTrace();
		} catch (IOException e) {
			ZooLog.logger.severe("IO exception.");
			e.printStackTrace();
		}finally{
	    
	    try {
			filereader.close();
			breader.close();
		} catch (IOException e) {
			ZooLog.logger.severe("IO exception.");
			e.printStackTrace();
		}
		}
		
		Class<?>[] classes = new Class[] { SpecimenGroupAL.class, SpecimenGroupHM.class,Specimen.class  };
		XStream xstream = new XStream(new StaxDriver());
		XStream.setupDefaultSecurity(xstream);
	    xstream.allowTypes(classes);
	       
		SpecimenGroupAL all = (SpecimenGroupAL) xstream.fromXML(text);
		
		SingletonEnum.INSTANCE.setSpecime(all);
		
		ZooLog.logger.info("Open command executed...");
	}

}
