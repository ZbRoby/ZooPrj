package com.msg.zooPrj.visitor;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import com.msg.zooPrj.composite.Animal;
import com.msg.zooPrj.composite.Specimen;
import com.msg.zooPrj.composite.SpecimenGroupAL;
import com.msg.zooPrj.composite.SpecimenGroupHM;
import com.msg.zooPrj.singleton.ZooLog;

/**
 * @author marius
 * Implementation of visitor interface
 * Saves the name attribute of visited classes in a file
 */

public class SaveVisitor implements Visitor {

	private String text;

	public SaveVisitor() {
		ZooLog.logger.info("Save visitor created...");
	}

	@Override
	public void visit(SpecimenGroupAL a) {
		text += a.getName() + "\n";

	}

	@Override
	public void visit(SpecimenGroupHM a) {
		text += a.getName() + "\n";

	}

	@Override
	public void visit(Specimen s) {
		text += s.getName() + "\n";

	}

	public void save(Animal a, String filename) {

		text = "";
		a.acceptVisitor(this);
		
		try {

			PrintWriter writer = new PrintWriter(filename, "UTF-8");
			writer.print(text);
			writer.close();

		} catch (FileNotFoundException e) {
			ZooLog.logger.severe("File not found exception.");
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			ZooLog.logger.severe("Unsupported encoding exception.");
			e.printStackTrace();
		}

	}
	
	

}
