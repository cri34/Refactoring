package xxxxx;


public class Conversor {
	private float equivalencia=166.386f;
	public float conversorEurosPesetas (float quantityEuros) {
		float pesetas = quantityEuros * equivalencia;
		return pesetas;
	   }
}
