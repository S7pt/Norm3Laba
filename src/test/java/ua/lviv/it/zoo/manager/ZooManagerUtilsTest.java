package ua.lviv.it.zoo.manager;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.it.zoo.model.SortType;

class ZooManagerUtilsTest extends BaseZooManagerTest {

  @BeforeEach
  public void setUp() {
  }

  @Test
  public void testSortByAquariumVolumeAscending() {
    createCreature();
    ZooManagerUtils.sortByAquariumVolume(creatures, SortType.ASCENDING);
    assertEquals(7.5, creatures.get(0).getAquariumVolumeInLitres());
    assertEquals(37.8, creatures.get(1).getAquariumVolumeInLitres());
    assertEquals(14500, creatures.get(2).getAquariumVolumeInLitres());
    assertEquals(75700, creatures.get(3).getAquariumVolumeInLitres());
  }

  @Test
  public void testSortByAquariumVolumeDescending() {
    createCreature();
    ZooManagerUtils.sortByAquariumVolume(creatures, SortType.DESCENDING);
    assertEquals(75700, creatures.get(0).getAquariumVolumeInLitres());
    assertEquals(14500, creatures.get(1).getAquariumVolumeInLitres());
    assertEquals(37.8, creatures.get(2).getAquariumVolumeInLitres());
    assertEquals(7.5, creatures.get(3).getAquariumVolumeInLitres());

  }

  @Test
  public void testSortByKindScientificName() {
    createCreature();
    ZooManagerUtils.sortByKindScientificName(creatures, SortType.ASCENDING);
    assertEquals("Delphinus", creatures.get(0).getKindScientificName());
    assertEquals("Lutrinae", creatures.get(1).getKindScientificName());
    assertEquals("Serrasalmidae", creatures.get(2).getKindScientificName());
    assertEquals("Siluriformes", creatures.get(3).getKindScientificName());
  }

  @Test
  public void testSortByVolumeAndKindScientificName() {
    createCreature();
    ZooManagerUtils.sortByVolumeAndKindScientificName(creatures, SortType.ASCENDING);
    assertEquals(7.5, creatures.get(0).getAquariumVolumeInLitres());
    assertEquals(37.8, creatures.get(1).getAquariumVolumeInLitres());
    assertEquals(14500, creatures.get(2).getAquariumVolumeInLitres());
    assertEquals(75700, creatures.get(3).getAquariumVolumeInLitres());
  }

  @Test
  public void testSortByLength() {
    createCreature();
    ZooManagerUtils.sortByLength(creatures, SortType.ASCENDING);
    assertEquals(35.7, creatures.get(0).getCreatureLengthInSantimeters());
    assertEquals(80, creatures.get(1).getCreatureLengthInSantimeters());
    assertEquals(160, creatures.get(2).getCreatureLengthInSantimeters());
    assertEquals(200, creatures.get(3).getCreatureLengthInSantimeters());
  }

  @Test
  public void testSortByLifespanUsingLambda() {
    createCreature();
    ZooManagerUtils.sortByLifespanUsingLambda(creatures, SortType.ASCENDING);
    assertEquals(9, creatures.get(0).getLifespan());
    assertEquals(10, creatures.get(1).getLifespan());
    assertEquals(20, creatures.get(2).getLifespan());
    assertEquals(60, creatures.get(3).getLifespan());
  }

}
