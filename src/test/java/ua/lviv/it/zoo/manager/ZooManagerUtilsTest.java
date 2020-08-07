package ua.lviv.it.zoo.manager;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.it.zoo.model.SortType;

class ZooManagerUtilsTest extends BaseZooManagerTest {
	
    @BeforeEach
	public void setUp() {}
	
	@Test
	public void testSortingAscending() {
		createCreature();
		ZooManagerUtils.sortByAquariumVolume(creatures, SortType.ASCENDING);
		assertEquals(7.5, creatures.get(0).getAquariumVolumeInLitres());
		assertEquals(75700, creatures.get(1).getAquariumVolumeInLitres());
		assertEquals(14500, creatures.get(2).getAquariumVolumeInLitres());
		assertEquals(37.8, creatures.get(3).getAquariumVolumeInLitres());
	}

	@Test
	public void testSortingDescending() {
		createCreature();
		ZooManagerUtils.sortByAquariumVolume(creatures, SortType.DESCENDING);
		assertEquals(7.5, creatures.get(0).getAquariumVolumeInLitres());
		assertEquals(75700, creatures.get(1).getAquariumVolumeInLitres());
		assertEquals(14500, creatures.get(2).getAquariumVolumeInLitres());
		assertEquals(37.8, creatures.get(3).getAquariumVolumeInLitres());

	}

}
