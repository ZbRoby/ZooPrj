package composite;

import visitor.ConcreteVisitor;


public class NotMain {
	public static void main(String[] args) {
		
		Animal animalia,mammal,reptile,shark,dog,cat,snake,lizard;
		animalia=new Class("Animalia");
		mammal=new Class("Mammal");
		reptile=new Class("Reptile");
		
		shark=new Specimen("Shark",10);
		dog=new Specimen("Dog",9);
		cat=new Specimen("Cat",14);
		snake=new Specimen("Snake",2);
		lizard=new Specimen("Lizard",5);
		
		mammal.add(cat);
		mammal.add(dog);
		reptile.add(lizard);
		reptile.add(snake);
		animalia.add(mammal);
		animalia.add(reptile);
		animalia.add(shark);
		System.out.println(animalia.getInfo());
		
		//---------------------------------------------
		
		ConcreteVisitor v = new ConcreteVisitor();
		
		animalia.acceptVisitor(v);
		
		System.out.println("Specimen: "+v.getCoutSpecimen());
		System.out.println("Class: "+v.getCoutClass());
	}

}
