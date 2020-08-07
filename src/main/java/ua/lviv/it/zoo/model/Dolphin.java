package ua.lviv.it.zoo.model;

public class Dolphin extends AbstractMammal {

  private float blowholeDiameterInSantimeters;

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
