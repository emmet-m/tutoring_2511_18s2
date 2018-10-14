package smells.switchstmt.refactored;

public class HighRiskPremiumCalculator implements PremiumCalculator {

	@Override
	public double calculatePremium(double insuranceValue) {
		return insuranceValue * 0.06;
	}

}
