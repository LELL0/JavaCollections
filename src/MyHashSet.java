import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

public class MyHashSet {
	static HashSet<String> hashSetNames = new HashSet();

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
				hashSetNames.add(strCurrentLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		timeFinish = System.nanoTime();

		elapsed = (timeFinish - timeStart) / 1000000;
		return elapsed;
	}

	public long displayTime() {

		Iterator itr = hashSetNames.iterator();

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
		hashSetNames.clear();

		timeFinish = System.nanoTime();

		elapsed = (timeFinish - timeStart) / 1000000;
		return elapsed;
	}
}
