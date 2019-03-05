package pl.marcinmazur.javastart.javastart.lecture17;

public class Euler1 {

	public int calculate(int i) {

		int sum = 0;

		for (int j = 0; j < i; j++) {
			if (j % 3 == 0 || j % 5 == 0)
				sum += j;

		}

		return sum;
	}

}
