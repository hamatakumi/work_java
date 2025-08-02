package work_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Lesson06 {

	public static void main(String[] args) {
		//課題１
		List<String> list = new ArrayList<>(Arrays.asList("dog", "cat", "bird"));
		
		//課題２
		list.add("pig");
		
		//課題３
		list.get(3);
		//アクセスした値を表示
		System.out.println(list.get(3));
		
		
		//課題４
		Map<String, Object> map = new HashMap<>();
		map.put("name", "pochi");
		map.put("colour", "brown");
		map.put("age", 3);
		
		//課題５
		map.put("weight", 5);
		
		//課題６
		map.get("weight");
		//アクセスした値を表示
		System.out.println(map.get("weight"));
		
		
		//課題７
		//リストとMapを使用した多次元配列を作成
		List<Map<String, Object>> data = new ArrayList<>();

		//Mapを作成しリストに追加
		Map<String, Object> person1 = new LinkedHashMap<>();
		person1.put("name", "taro");
		person1.put("age", 20);
		person1.put("from", "tokyo");
		data.add(person1);

		Map<String, Object> person2 = new LinkedHashMap<>();
		person2.put("name", "jiro");
		person2.put("age", 25);
		person2.put("from", "osaka");
		data.add(person2);

		Map<String, Object> person3 = new LinkedHashMap<>();
		person3.put("name", "saburo");
		person3.put("age", 30);
		person3.put("from", "aichi");
		data.add(person3);

		//拡張for文でpersonを表示
		for(Map<String, Object> person : data) {
		    System.out.println(person);
		}
		
	}

}
