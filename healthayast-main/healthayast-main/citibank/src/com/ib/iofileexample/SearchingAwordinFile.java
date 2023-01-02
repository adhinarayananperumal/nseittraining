package com.ib.iofileexample;

import java.io.FileReader;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import java.util.stream.Stream;

public class SearchingAwordinFile {

	private static void searchStringFromFile() {
		Path path = FileSystems.getDefault().getPath("", "c://healthasyst//newfile.txt");
		String searchTerm = "creaa";

		try (Stream<String> streamOfLines = Files.lines(path)) {
			Optional<String> line = streamOfLines.filter(l -> l.contains(searchTerm)).findFirst();
			if (line.isPresent()) {
				System.out.println(line.get());
			} else
				System.out.println("Not found");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		FileReader myWriter = null;

		searchStringFromFile();

	}

}
