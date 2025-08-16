package work_java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lesson07 {

	public static void main(String[] args) {
//課題１
		//for文をネストしsumを表示
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				int sum = i * j;
				System.out.println(i + " * " + j + " = " + sum);
			}
		}

//課題２
		HashMap<String, HashMap<String, String>> employees = new HashMap<String, HashMap<String, String>>() {
		    {
		        put("中田", new HashMap<String, String>() {
		            {
		                put("age", "23");
		                put("pref", "東京");
		            }
		        });
		        put("山本", new HashMap<String, String>() {
		            {
		                put("age", "19");
		                put("pref", "京都");
		            }
		        });
		        put("佐藤", new HashMap<String, String>() {
		            {
		                put("age", "30");
		                put("pref", "大阪");
		            }
		        });
		        put("小林", new HashMap<String, String>() {
		            {
		                put("age", "22");
		                put("pref", "福岡");
		            }
		        });
		    }
		};
		
		//多次元配列employeesを出力
		for (Map.Entry<String, HashMap<String, String>> entry : employees.entrySet()) {
			//名前を取得
			String name = entry.getKey();
		    //entryのvalueの部分を取得
		    HashMap<String, String> info = entry.getValue();
		    //年齢と都道府県を取得
		    String age = info.get("age");
		    String pref = info.get("pref");
		    //各値を表示
		    System.out.println(name + "　" + age + "歳　" + pref);
		}
		
//応用問題１
		//数値を格納するArrayListを作成
		ArrayList<Integer> number = new ArrayList<>();
		//1から40までiをインクリメントし、その中で3の倍数もしくは3を含むiをnumberに追加
		for (int i = 1; i <= 40; i++) {
			if (i % 3 == 0 || String.valueOf(i).contains("3")) {
				number.add(i);
			}
		}
		//numberを表示
		System.out.println(number);
		
//応用問題２
        //名前と年齢だけの連想配列を作成
        List<HashMap<String, String>> newList = new ArrayList<>();
        
        //課題２の配列から全ての名前を取得し、HashMapを新たに作成。infoに名前と年齢を格納後それをnewListに格納。
        for (String name : employees.keySet()) {
            HashMap<String, String> info = new HashMap<>();
            info.put("name", name);
            info.put("age", employees.get(name).get("age"));
            newList.add(info);
        }

        //作成した配列を表示
        for (HashMap<String, String> entry : newList) {
        	String name = entry.get("name");
        	String age = entry.get("age");
            System.out.println(name + "　" + age + "歳");
        }
		
	}

}
