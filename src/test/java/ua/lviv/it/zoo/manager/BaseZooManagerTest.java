package ua.lviv.it.zoo.manager;

import java.util.*;

import ua.lviv.it.zoo.model.AbstractSwimmingCreature;
import ua.lviv.it.zoo.model.*;

public abstract class BaseZooManagerTest {
	
	protected List<AbstractSwimmingCreature> creatures;
	
    public void createCreature() {
    	creatures=new LinkedList<AbstractSwimmingCreature>();
    	creatures.add(new Piranha(7.5,10,Diet.CARNIVORE,35.7,"Serrasalmidae",5,2,0.7));
    	creatures.add(new Dolphin(75700,20,Diet.CARNIVORE,200,"Delphinus",4,2));
    	creatures.add(new Otter(14500,9,Diet.CARNIVORE,80,"Lutrinae",6,12));
    	creatures.add(new Catfish(37.8,60,Diet.OMNIVORE,160,"Siluriformes",7,2,15));
    }
}
