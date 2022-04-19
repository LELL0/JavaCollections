import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;

public class MyArrayDeque {
	static ArrayDeque<String> arrayDequeNames = new ArrayDeque<String>();

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
				arrayDequeNames.add(strCurrentLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		timeFinish = System.nanoTime();

		elapsed = (timeFinish - timeStart) / 1000000;
		return elapsed;

	}

	public long displayTime() {
		Iterator itr = arrayDequeNames.iterator();
		timeStart = System.nanoTime();
		while (itr.hasNext()) {
			itr.next();
		}
		timeFinish = System.nanoTime();

		elapsed = (timeFinish - timeStart) / 1000000;
		return elapsed;
	}

	public long deleteTime() {

		timeStart = System.nanoTime();
		while (!arrayDequeNames.isEmpty()) {
			arrayDequeNames.remove();
		}

		timeFinish = System.nanoTime();

		elapsed = (timeFinish - timeStart) / 1000000;
		return elapsed;
	}
}
