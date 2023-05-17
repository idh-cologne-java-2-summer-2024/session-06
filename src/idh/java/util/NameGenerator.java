package idh.java.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class NameGenerator {
	List<String> firstNames = new LinkedList<String>();
	List<String> lastNames = new LinkedList<String>();
	Random random = new Random();

	public NameGenerator() throws IOException {
		File file = new File("resources/names.txt");
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			for (String line; (line = br.readLine()) != null;) {
				lastNames.add(line);
			}
		}

		file = new File("resources/first-names.txt");
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			for (String line; (line = br.readLine()) != null;) {
				firstNames.add(line);
			}
		}
	}

	public String getName() {
		StringBuilder b = new StringBuilder();
		b.append(firstNames.get(random.nextInt(firstNames.size())));
		b.append(' ');
		b.append(lastNames.get(random.nextInt(lastNames.size())));
		return b.toString();
	}

}
