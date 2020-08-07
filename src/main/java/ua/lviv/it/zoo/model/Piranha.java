package ua.lviv.it.zoo.model;

public class Piranha extends AbstractFish {

  private double scaleLengthInMillimeters;

  public Piranha(double aquariumVolumeInLitres, int lifespanInYears, Diet diet, double creatureLengthInSantimeters,
      String kindScientificName, int finCount, int gillsCount, double scaleLengthInMillimeters) {
    super(aquariumVolumeInLitres, lifespanInYears, diet, creatureLengthInSantimeters, kindScientificName, finCount,
        gillsCount);
    this.scaleLengthInMillimeters = scaleLengthInMillimeters;
  }

  public double getScaleLengthInMillimeters() {
    return scaleLengthInMillimeters;
  }

  public void setScaleLengthInMillimeters(double scaleLengthInMillimeters) {
    this.scaleLengthInMillimeters = scaleLengthInMillimeters;
  }

}
