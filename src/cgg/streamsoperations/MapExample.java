package cgg.streamsoperations;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapExample {

	public static void main(String[] args) {
		ArrayList<String> urls = new ArrayList<String>();
		
		urls.add("C:\\MyFile1.txt");
		urls.add("C:\\MyFile2.txt");
		urls.add("C:\\MyFile3.txt");
		urls.add("C:\\MyFile4.txt");
	
		//convert into a stream and then call map
		//some kind of operations which are simple use map
		//map takes apply function which takes T argument and returns R argument
		
		
		Stream <Path> map=urls.stream().map((uri->Paths.get(uri)));
		map.forEach(System.out::println);
		
		System.out.println("----------------------");
		List<Details> details	 = new ArrayList<Details>();
		List<String> parts1 = new ArrayList<String>();
		parts1.add("Parts_1");
		parts1.add("Parts_2");
		parts1.add("Parts_3");
		parts1.add("Parts_4");
		
		List<String> parts2= new ArrayList<String>();
		parts2.add("Parts_1");
		parts2.add("Parts_2");
		parts2.add("Parts_3");
		parts2.add("Parts_4");
		
		Details details1 = new Details(1001,parts1);
		Details details2 = new Details(1002,parts2);
		
		details.add(details1);
		details.add(details2);
		
		//takes a stream flatmap convert into a stream return type is another stream 
		Stream<String> flatMap = details.stream().flatMap(d->d.getParts().stream());
		flatMap.forEach(System.out::println);
		
	}

}
