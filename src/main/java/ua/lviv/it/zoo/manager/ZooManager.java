package ua.lviv.it.zoo.manager;

import java.util.LinkedList;
import java.util.List;
import ua.lviv.it.zoo.model.AbstractSwimmingCreature;

public class ZooManager {

  public List<AbstractSwimmingCreature> creatures;

  public void addCreature(AbstractSwimmingCreature creature) {
    if (creatures == null) {
      creatures = new LinkedList<AbstractSwimmingCreature>();
    }
    creatures.add(creature);
  }

  public void addCreatures(List<AbstractSwimmingCreature> creatures) {
    if (creatures == null) {
      creatures = new LinkedList<AbstractSwimmingCreature>();
    }
    this.creatures.addAll(creatures);
  }

  public List<AbstractSwimmingCreature> findCreaturesWithLifespanBiggerThan(int years) {
    List<AbstractSwimmingCreature> result = new LinkedList<AbstractSwimmingCreature>();
    for (AbstractSwimmingCreature creature : creatures) {
      if (creature.getLifespan() > years) {
        result.add(creature);
      }
    }
    return result;
  }
}
