package ua.lviv.it.zoo.model;

public class Otter extends AbstractMammal {

	private float furLengthInMillimeters;
	 
	public Otter(double aquariumVolumeInLitres, int lifespanInYears, Diet diet, double creatureLengthInSantimeters,
			String kindScientificName, int milkConsumptionPeriodInMonths, float furLengthInMillimeters) {
		super(aquariumVolumeInLitres, lifespanInYears, diet, creatureLengthInSantimeters, kindScientificName,
				milkConsumptionPeriodInMonths);
		this.furLengthInMillimeters = furLengthInMillimeters;
	}

	public float getFurLengthInMillimeters() {
		return furLengthInMillimeters;
	}

	public void setFurLengthInMillimeters(float furLengthInMillimeters) {
		this.furLengthInMillimeters = furLengthInMillimeters;
	}

}
