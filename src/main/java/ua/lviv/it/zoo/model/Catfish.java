package ua.lviv.it.zoo.model;

public class Catfish extends AbstractFish {

	private double whiskerLengthInSantimeters;

	public Catfish(double aquariumVolumeInLitres, int lifespanInYears, Diet diet, double creatureLengthInSantimeters,
			String kindScientificName, int finCount, int gillsCount, double whiskerLengthInSantimeters) {
		super(aquariumVolumeInLitres, lifespanInYears, diet, creatureLengthInSantimeters, kindScientificName, finCount,
				gillsCount);
		this.whiskerLengthInSantimeters = whiskerLengthInSantimeters;
	}

	public double getWhiskerLengthInSantimeters() {
		return whiskerLengthInSantimeters;
	}

	public void setWhiskerLengthInSantimeters(double whiskerLengthInSantimeters) {
		this.whiskerLengthInSantimeters = whiskerLengthInSantimeters;
	}

}
