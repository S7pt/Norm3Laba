package ua.lviv.it.zoo.model;

public class Dolphin extends AbstractMammal {

  private float blowholeDiameterInSantimeters;

  @Override
  public String getHeaders() {
    return super.getHeaders() + ",blowholeDiameterInSantimeters";
  }

  @Override
  public String toCsv() {
    // TODO Auto-generated method stub
    return super.toCsv() + "," + "Blowhole diameter in santimeters: " + blowholeDiameterInSantimeters;
  }

  public Dolphin(double aquariumVolumeInLitres, int lifespanInYears, Diet diet, double creatureLengthInSantimeters,
      String kindScientificName, int milkConsumptionPeriodInMonths, float blowholeDiameterInSantimeters) {
    super(aquariumVolumeInLitres, lifespanInYears, diet, creatureLengthInSantimeters, kindScientificName,
        milkConsumptionPeriodInMonths);
    this.blowholeDiameterInSantimeters = blowholeDiameterInSantimeters;
  }

  public float getBlowholeDiameterInSantimeters() {
    return blowholeDiameterInSantimeters;
  }

  public void setBlowholeDiameterInSantimeters(float blowholeDiameterInSantimeters) {
    this.blowholeDiameterInSantimeters = blowholeDiameterInSantimeters;
  }
}
