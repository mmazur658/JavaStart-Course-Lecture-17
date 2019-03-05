package pl.marcinmazur.javastart.javastart.lecture17;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class TaxCalcualtor {

	private final int TAX = 85528;
	private Scanner scanner = new Scanner(System.in);

	public void readTaxValue() {

		System.out.println("Podaj wartość wynagrodzenia brutto: ");
		double yearSalary = scanner.nextDouble();

		BigDecimal taxValue = calcTaxValue(yearSalary);

		System.out.println(taxValue);

	}

	public BigDecimal calcTaxValue(double yearSalary) {

		BigDecimal taxValue;

		if (yearSalary <= TAX) {

			taxValue = BigDecimal.valueOf((0.18 * yearSalary) - 556.02).setScale(2, RoundingMode.HALF_EVEN);

			int compateResult = taxValue.compareTo(new BigDecimal("0"));

			if (compateResult > 0)
				return taxValue;
			else
				return new BigDecimal("0");

		} else {

			taxValue = BigDecimal.valueOf((0.32 * (yearSalary - TAX)) + 14839.02).setScale(2, RoundingMode.HALF_EVEN);

			return taxValue;

		}

	}

}
