package ua.lviv.it.zoo.model;

public abstract class AbstractSwimmingCreature {

  protected double aquariumVolumeInLitres;

  protected int lifespanInYears;

  protected Diet diet;

  protected double creatureLengthInSantimeters;

  protected String kindScientificName;

  public AbstractSwimmingCreature(double aquariumVolumeInLitres, int lifespanInYears, Diet diet,
      double creatureLengthInSantimeters, String kindScientificName) {
    super();
    this.aquariumVolumeInLitres = aquariumVolumeInLitres;
    this.lifespanInYears = lifespanInYears;
    this.diet = diet;
    this.creatureLengthInSantimeters = creatureLengthInSantimeters;
    this.kindScientificName = kindScientificName;
  }

  public double getCreatureLengthInSantimeters() {
    return creatureLengthInSantimeters;
  }

  public void setCreatureLengthInSantimeters(double creatureLengthInSantimeters) {
    this.creatureLengthInSantimeters = creatureLengthInSantimeters;
  }

  public String getKindScientificName() {
    return kindScientificName;
  }

  public void setKindScientificName(String kindScientificName) {
    this.kindScientificName = kindScientificName;
  }

  public int getLifespan() {
    return lifespanInYears;
  }

  public void setLifespan(int lifespan) {
    this.lifespanInYears = lifespan;
  }

  public double getAquariumVolumeInLitres() {
    return aquariumVolumeInLitres;
  }

  public void setAquariumVolumeInLitres(float aquariumVolumeInLitres) {
    this.aquariumVolumeInLitres = aquariumVolumeInLitres;
  }
}
