package cgg.streampipeline;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamPipeline {

	public static void main(String[] args) {
	
			Stream<String> onceModifiedStream = Stream.of("moy","vae","rsec").skip(1);
			onceModifiedStream.forEach(System.out::println);
			//after we need some conversion to be done so we apply map method
			Stream<String> stream = Stream.of("hari","rada","vanar","sena");
			Stream<String> map = stream.skip(1).map(e->e.substring(0, 3));
			//from every string we only get first three characters
			map.forEach(System.out::println);
			
			System.out.println("---------------------");
			List<String> list = Arrays.asList("abc1","abc2","abc3");
			long count = list.stream().skip(2).map(s->s.substring(0, 3)).sorted().count();
			//first stream and skip 2nd element and use substring to get only first 3 char and use sorted-
			System.out.println("count is :"+count);
			
			
			}

}
