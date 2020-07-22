package javainterview.cohesionSolution;

//This is a better way of approaching the problem. Different classes have their
//own responsibilities.

//Good classes are highly cohesive.
//This class is highly cohesive.

class InternetDownloader {
	public void downloadFromInternet() {

	}
}

class DataParser {
	public void parseData(String content) {
	}
}

class DatabaseStorer {
	public void storeIntoDatabase(String data) {
	}
}

class DownloadAndStore {
	void doEverything() {
		new InternetDownloader().downloadFromInternet();
		new DataParser().parseData("");
		new DatabaseStorer().storeIntoDatabase("");
	}
}

public class CohesionExampleSolution {

}
