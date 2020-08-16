package ua.lviv.it.zoo.model;

public abstract class AbstractMammal extends AbstractSwimmingCreature {

  protected int milkConsumptionPeriodInMonths;

  @Override
  public String getHeaders() {
    return super.getHeaders() + ",milkConsumptionPeriodInMonths";
  }

  @Override
  public String toCsv() {
    return super.toCsv() + "," + "Milk consumption period in months:" + milkConsumptionPeriodInMonths;
  }

  public AbstractMammal(double aquariumVolumeInLitres, int lifespanInYears, Diet diet,
      double creatureLengthInSantimeters, String kindScientificName, int milkConsumptionPeriodInMonths) {
    super(aquariumVolumeInLitres, lifespanInYears, diet, creatureLengthInSantimeters, kindScientificName);
    this.milkConsumptionPeriodInMonths = milkConsumptionPeriodInMonths;
  }

  public int getMilkConsumptionPeriodInMonths() {
    return milkConsumptionPeriodInMonths;
  }

  public void setMilkConsumptionPeriodInMonths(int milkConsumptionPeriodInMonths) {
    this.milkConsumptionPeriodInMonths = milkConsumptionPeriodInMonths;
  }

}
