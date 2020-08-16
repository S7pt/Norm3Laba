package ua.lviv.it.zoo.manager;

import java.util.Comparator;
import java.util.List;
import ua.lviv.it.zoo.model.AbstractSwimmingCreature;
import ua.lviv.it.zoo.model.SortType;

public class ZooManagerUtils {

  private static final SorterByAquariumVolume SORTER_BY_AQUARIUM_VOLUME = new SorterByAquariumVolume();

  public static void sortByAquariumVolume(List<AbstractSwimmingCreature> creatures, SortType sortType) {
    if (sortType == SortType.ASCENDING) {
      creatures.sort(SORTER_BY_AQUARIUM_VOLUME);
    } else {
      creatures.sort(SORTER_BY_AQUARIUM_VOLUME.reversed());
    }
  }

  public static void sortByKindScientificName(List<AbstractSwimmingCreature> creatures, SortType sortType) {
    if (sortType == SortType.ASCENDING) {
      creatures.sort(new ZooManagerUtils().new SorterByKindScientificName());
    } else {
      creatures.sort(new ZooManagerUtils().new SorterByKindScientificName().reversed());
    }
  }

  public static void sortByVolumeAndKindScientificName(List<AbstractSwimmingCreature> creatures, SortType sortType) {
    Comparator<AbstractSwimmingCreature> comparator = new Comparator<AbstractSwimmingCreature>() {
      public int compare(AbstractSwimmingCreature creature1, AbstractSwimmingCreature creature2) {
        int volumeComparisonResult = (int) (creature1.getAquariumVolumeInLitres()
            - creature2.getAquariumVolumeInLitres());
        if (volumeComparisonResult != 0) {
          return volumeComparisonResult;
        }
        return creature1.getKindScientificName().compareTo(creature2.getKindScientificName());
      }
    };
    creatures.sort(sortType == SortType.ASCENDING ? comparator : comparator.reversed());
  }

  public static void sortByLength(List<AbstractSwimmingCreature> creatures, SortType sortType) {
    class LengthComparator implements Comparator<AbstractSwimmingCreature> {
      public int compare(AbstractSwimmingCreature creature1, AbstractSwimmingCreature creature2) {
        return (int) (creature1.getCreatureLengthInSantimeters() - creature2.getCreatureLengthInSantimeters());
      }
    }
    ;
    LengthComparator comparator = new LengthComparator();
    creatures.sort(sortType == SortType.ASCENDING ? comparator : comparator.reversed());
  }

  public static void sortByLifespanUsingLambda(List<AbstractSwimmingCreature> creatures, SortType sortType) {
    if (sortType == SortType.ASCENDING) {
      creatures.sort((creature1, creature2) -> creature1.getLifespan() - creature2.getLifespan());
    } else if (sortType == SortType.DESCENDING) {
      creatures.sort((creature1, creature2) -> creature2.getLifespan() - creature1.getLifespan());
    }
  }

  public static class SorterByAquariumVolume implements Comparator<AbstractSwimmingCreature> {

    public int compare(AbstractSwimmingCreature creature1, AbstractSwimmingCreature creature2) {
      return (int) (creature1.getAquariumVolumeInLitres() - creature2.getAquariumVolumeInLitres());
    }
  }

  public class SorterByKindScientificName implements Comparator<AbstractSwimmingCreature> {
    public int compare(AbstractSwimmingCreature creature1, AbstractSwimmingCreature creature2) {
      return creature1.getKindScientificName().compareTo(creature2.getKindScientificName());
    }
  }

}
