package ua.lviv.it.zoo.model;

public abstract class AbstractFish extends AbstractSwimmingCreature {

  protected int finsCount;

  protected int gillsCount;

  @Override
  public String getHeaders() {
    return super.getHeaders() + ",finsCount,gillsCount";
  }

  @Override
  public String toCsv() {
    return super.toCsv() + "," + "Fins: " + finsCount + "," + "Gills: " + gillsCount;
  }

  public AbstractFish(double aquariumVolumeInLitres, int lifespanInYears, Diet diet, double creatureLengthInSantimeters,
      String kindScientificName, int finCount, int gillsCount) {
    super(aquariumVolumeInLitres, lifespanInYears, diet, creatureLengthInSantimeters, kindScientificName);
    this.finsCount = finCount;

  public int getFinCount() {
    return finsCount;
  }

  public void setFinCount(int finCount) {
    this.finsCount = finCount;
  }

  public int getGillsCount() {
    return gillsCount;
  }

  public void setGillsCount(int gillsCount) {
    this.gillsCount = gillsCount;
  }

}
