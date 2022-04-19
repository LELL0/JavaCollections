import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class MyLinkedList {
	static LinkedList<String> linkedListNames = new LinkedList<String>();

	static long timeStart, timeFinish, elapsed;

	BufferedReader br;

	public long insertTime(String filename) {
		String strCurrentLine;
		FileReader input;
		try {
			input = new FileReader(filename);
			br = new BufferedReader(input);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		timeStart = System.nanoTime();
		try {
			while ((strCurrentLine = br.readLine()) != null) {
				linkedListNames.add(strCurrentLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		timeFinish = System.nanoTime();

		elapsed = (timeFinish - timeStart) / 1000000;
		return elapsed;

	}

	public long displayTime() {
		timeStart = System.nanoTime();
		for (int i = 0; i < linkedListNames.size(); i++) {
			linkedListNames.get(i);
		}
		timeFinish = System.nanoTime();

		elapsed = (timeFinish - timeStart) / 1000000;
		return elapsed;
	}

	public long deleteTime() {

		timeStart = System.nanoTime();
		while (!linkedListNames.isEmpty()) {
			linkedListNames.remove();
		}

		timeFinish = System.nanoTime();

		elapsed = (timeFinish - timeStart) / 1000000;
		return elapsed;
	}

}
