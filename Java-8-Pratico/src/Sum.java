
public class Sum {
	/**
	 * 
	 * @param d
	 * @param e
	 * @return
	 */
	public static double sum(double d, double e) {
		if (d < 0) {
			throw new IllegalArgumentException("O primeiro n�mero n�o pode ser negativo!");
		}
		if (e < 0) {
			throw new IllegalArgumentException("O segundo n�mero n�o pode ser negativo!");
		}
		return d + e;
	}

}
