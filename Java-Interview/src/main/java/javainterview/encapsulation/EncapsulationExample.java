package javainterview.encapsulation;

// Encapsulation : Hiding implementation with a well defined interface.

// The instance variables of CricketScorer are not exposed to
// other classes. (EncapsulationExample class in this case).

// Other classes need not access the variables. Instead, they can access the methods
// which will take care of the business logic.

// Now, the instance variables and the logic which is used in methods are not exposed.
// Other classes don't know the implementation and they just have to call the methods to get things done.

// When the implementation or the logic inside CricketScorer is modified,
// other classes don't require any change.

class CricketScorer {
	private int score = 0;

	public int getScore() {
		return score;
	}

	public void addRuns(int score) {
		this.score = this.score + score;
	}

	public void six() {
		addRuns(6);
	}

	public void four() {
		addRuns(4);
	}

	public void single() {
		addRuns(1);
	}

	public void printScore() {
		System.out.println("Score : " + score);
	}

}

public class EncapsulationExample {
	public static void main(String[] args) {
		CricketScorer scorer = new CricketScorer();
		scorer.four();
		scorer.four();
		scorer.single();
		scorer.six();
		scorer.six();
		scorer.six();
		scorer.four();
		scorer.printScore();
	}
}