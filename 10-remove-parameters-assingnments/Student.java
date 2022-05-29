package xxx.refactorings.removeparameterassignment;


public class Student {
	public float evaluateTerm(float homeworkMark, float examMark, float attitude) {
		float finalMark;
		finalMark=(examMark < 5)?1:examMark;
		finalMark+=(homeworkMark < 4)?1:homeworkMark;
		return finalMark / 2 + attitude;
	}
}
