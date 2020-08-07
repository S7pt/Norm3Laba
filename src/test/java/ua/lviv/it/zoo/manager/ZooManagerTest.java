package ua.lviv.it.zoo.manager;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.it.zoo.model.AbstractSwimmingCreature;
import ua.lviv.it.zoo.model.Catfish;
import ua.lviv.it.zoo.model.Diet;
import ua.lviv.it.zoo.model.Dolphin;
import ua.lviv.it.zoo.model.Otter;
import ua.lviv.it.zoo.model.Piranha;

class ZooManagerTest extends BaseZooManagerTest {

  private ZooManager zooManager;

  @BeforeEach
  public void setUp() {
    zooManager = new ZooManager();
    zooManager.addCreature(new Piranha(7.5, 10, Diet.CARNIVORE, 35.7, "Serrasalmidae", 5, 2, 0.7));
    zooManager.addCreature(new Dolphin(75700, 20, Diet.CARNIVORE, 200, "Delphinus", 4, 2));
    zooManager.addCreature(new Otter(14500, 9, Diet.CARNIVORE, 80, "Lutrinae", 6, 12));
    zooManager.addCreature(new Catfish(37.8, 60, Diet.OMNIVORE, 160, "Siluriformes", 7, 2, 15));
  }

  @Test
  public void findCreaturesWithLifespanGreaterThanTest() {
    createCreature();
    zooManager.addCreatures(creatures);
    List<AbstractSwimmingCreature> creaturesToTest = zooManager.findCreaturesWithLifespanBiggerThan(10);
    assertEquals(4, creaturesToTest.size());
  }
}
