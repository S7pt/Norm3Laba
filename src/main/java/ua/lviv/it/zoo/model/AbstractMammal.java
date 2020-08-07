package ua.lviv.it.zoo.model;

public abstract class AbstractMammal extends AbstractSwimmingCreature {

	protected int milkConsumptionPeriodInMonths;

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
