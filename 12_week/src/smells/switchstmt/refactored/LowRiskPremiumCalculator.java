package smells.switchstmt.refactored;

public class LowRiskPremiumCalculator implements PremiumCalculator {

	@Override
	public double calculatePremium(double insuranceValue) {
		return insuranceValue * 0.02;
	}

}
