package smells.switchstmt.refactored;

public class MediumRiskPremiumCalculator implements PremiumCalculator {

	@Override
	public double calculatePremium(double insuranceValue) {
		return insuranceValue * 0.04;
	}

}
