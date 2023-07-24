package com.org.interview;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Test3 {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("prince",101);
		map.put("akash",102);
		map.put("rajesh",105);
		map.put("suresh",103);
		map.put("pankaj", 106);
		map.put("rakesh", 104);
		map.put("dnkit", 107);
		
		System.out.println(map);
		
		Map<String, Integer> sortedMap = map.entrySet().stream().sorted((o1,o2)->o1.getValue()<o2.getValue() ?1 :
			o1.getValue()>o2.getValue() ?-1:0)
		.collect(Collectors.toMap(k->k.getKey(), v->v.getValue()));
		System.out.println(sortedMap);
		List<Entry<String,Integer>> collect = map.entrySet().stream().sorted((o1,o2)->o1.getValue()<o2.getValue() ?1 :
			o1.getValue()>o2.getValue() ?-1:0)
		.collect(Collectors.toList());
		System.out.println(collect);
		
	}

}
