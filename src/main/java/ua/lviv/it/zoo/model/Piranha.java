package ua.lviv.it.zoo.model;

public class Piranha extends AbstractFish {

  private double scaleLengthInMillimeters;

  @Override
  public String getHeaders() {
    // TODO Auto-generated method stub
    return super.getHeaders() + ",scaleLengthInMillimeters";
  }

  @Override
  public String toCsv() {
    return super.toCsv() + "," + "Scale length in millimeters:" + scaleLengthInMillimeters;
  }

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
