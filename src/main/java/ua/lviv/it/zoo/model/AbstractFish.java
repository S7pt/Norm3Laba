package ua.lviv.it.zoo.model;

public abstract class AbstractFish extends AbstractSwimmingCreature {

  protected int finCount;

  protected int gillsCount;

  public AbstractFish(double aquariumVolumeInLitres, int lifespanInYears, Diet diet, double creatureLengthInSantimeters,
      String kindScientificName, int finCount, int gillsCount) {
    super(aquariumVolumeInLitres, lifespanInYears, diet, creatureLengthInSantimeters, kindScientificName);
    this.finCount = finCount;
    this.gillsCount = gillsCount;
  }

  public int getFinCount() {
    return finCount;
  }

  public void setFinCount(int finCount) {
    this.finCount = finCount;
  }

  public int getGillsCount() {
    return gillsCount;
  }

  public void setGillsCount(int gillsCount) {
    this.gillsCount = gillsCount;
  }

}
