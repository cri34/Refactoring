package refactoritzacions;

public class Order {
	public float applyVAT (int vatType) {
		float [] vats{1.04f,1.18f,1.21f};
		if (vatType >=0 vatType < vats.length){
			return vats[vatType];
		}
		return  -1;
	}
}
