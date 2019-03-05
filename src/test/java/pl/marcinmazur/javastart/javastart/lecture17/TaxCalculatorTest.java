package pl.marcinmazur.javastart.javastart.lecture17;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import pl.marcinmazur.javastart.javastart.lecture17.TaxCalcualtor;

public class TaxCalculatorTest {
	
	private TaxCalcualtor taxCalc = new TaxCalcualtor();

	@Test
	public void shouldReturnTaxValueEqualsTo2143dot98() {
		
		// given
		double yearSalary = 15000;
		BigDecimal expectedTaxValue = new BigDecimal("2143.98");
		
		// when
		BigDecimal taxValue = taxCalc.calcTaxValue(yearSalary);	
		
		// then
		assertThat(taxValue, CoreMatchers.is(expectedTaxValue));

	}
	
	@Test
	public void shouldReturnTaxValueEqualsToZero() {
		
		// given
		double yearSalary = 0;
		BigDecimal expectedTaxValue = new BigDecimal("0");
		
		// when
		BigDecimal taxValue = taxCalc.calcTaxValue(yearSalary);	
		
		// then
		assertThat(taxValue, CoreMatchers.is(expectedTaxValue));

	}
	
	@Test
	public void shouldReturnTaxValueEqualsTo14839dot02() {
		
		// given
		double yearSalary = 85528;
		BigDecimal expectedTaxValue = new BigDecimal("14839.02");
		
		// when
		BigDecimal taxValue = taxCalc.calcTaxValue(yearSalary);	
		
		// then
		assertThat(taxValue, CoreMatchers.is(expectedTaxValue));
		
	}
	
	@Test
	public void shouldReturnTaxValueEqualsTo19470dot06() {
		
		// given
		double yearSalary = 100000;
		BigDecimal expectedTaxValue = new BigDecimal("19470.06");
		
		// when
		BigDecimal taxValue = taxCalc.calcTaxValue(yearSalary);	
		
		// then
		assertThat(taxValue, CoreMatchers.is(expectedTaxValue));
		
	}
	
	

}
