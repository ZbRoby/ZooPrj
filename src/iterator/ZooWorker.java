package iterator;

import composite.Animal;

import java.util.Iterator;

public class ZooWorker {
    private AnimalIterator am;
    private AnimalIterator ar;

    public ZooWorker(AnimalIterator am,AnimalIterator ar){
        this.am=am;
        this.ar=ar;
    }

    public void show(){
        Iterator iam = am.createIterator();
        Iterator iar = ar.createIterator();
        System.out.println("Mammal:");
        display(iam);
        System.out.println("Reptile:");
        display(iar);
    }

    public void display(Iterator iterator){
        while (iterator.hasNext())
        {
            Animal animal = (Animal) iterator.next();
            System.out.println("Animal is :" + animal);
        }
    }

}
