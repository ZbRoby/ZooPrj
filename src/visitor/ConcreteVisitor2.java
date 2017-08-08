package visitor;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import composite.Animal;
import composite.Specimen;
import composite.SpecimenGroupAL;
import composite.SpecimenGroupHT;
import singleton.Singleton;

public class ConcreteVisitor2 implements Visitor{
	
	private String text;

	@Override
	public void visit(SpecimenGroupAL a) {
		text += a.getName() + "\n";
		
	}

	@Override
	public void visit(SpecimenGroupHT a) {
		text += a.getName() + "\n";
		
	}

	@Override
	public void visit(Specimen s) {
		text += s.getName() + "\n";
		
	}
	
	public void save(  String filename) {
		
		text = "";
		Singleton.getInstace().getSpecime().acceptVisitor(this);
		
		 try {
			 
			PrintWriter writer = new PrintWriter(filename, "UTF-8");
			writer.print(text);
			writer.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
