package pl.marcinmazur.javastart.javastart.lecture17;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class EulerChallengeTest {

	@Test
	public void test10() {

		// given
		Euler1 euler = new Euler1();

		// when
		int result = euler.calculate(10);

		// then
		assertThat(result, is(23));

	}

	@Test
	public void test1000() {

		// given
		Euler1 euler = new Euler1();

		// when
		int result = euler.calculate(1000);

		// then
		assertThat(result, is(233168));

	}
	

}
