package smells.example3;

public class InsuranceQuote {
	private Motorist motorist;

	public InsuranceQuote(Motorist m) {
		this.motorist = m;
	}
	
	public RiskFactor calculateMotoristRisk() {
		if (motorist.getPointsOnLicense() > 3 || motorist.getAge() < 25) {
			return RiskFactor.HIGH;
		}
		if (motorist.getPointsOnLicense() > 0 ) {
			return RiskFactor.MEDIUM;
		}
		return RiskFactor.LOW;
	}
	
	public double calculateInsurancePremium(double insuranceValue) {
		RiskFactor riskFactor = calculateMotoristRisk();
		switch(riskFactor) {
			case LOW:
				return insuranceValue * 0.02;
			case MEDIUM:
				return insuranceValue * 0.04;
			default:
				return insuranceValue * 0.06;
		}
	}
}
