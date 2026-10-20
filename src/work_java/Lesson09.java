package work_java;

import java.util.List;
import java.util.Map;

public class Lesson09 {

    // JSON内の必要な要素を宣言
    public static class Prefecture {
        String id;
      
        //shortを変数として使えないので@SerializedNameを使用
        //@SerializedName("short")

        String shortName;
        List<City> city;
    }

    // 課題２用のCityクラス
    public static class City {
        String city;
    }

    public static void main(String[] args) throws Exception {
//    	Reader reader = new FileReader("/Users/hamamototakumi/Downloads/sample.json");
//    	Gson gson = new Gson();
    	
    	//JSONをMap形式で読み込み、prefecturesに代入。この値を各メソッドの引数とする。
//        Map<String, Prefecture> prefectures = gson.fromJson(reader, new TypeToken<Map<String, Prefecture>>() {}.getType());

        // 課題１のメソッドを呼び出し
//        task1(prefectures);

        // 課題２のメソッドを呼び出し
//        task2(prefectures);
    }

	/**課題１　各都道府県のidと名前（short）を表示するメソッド
	 * 
	 * @param prefectures
	 */
    public static void task1(Map<String, Prefecture> prefectures) {
        for (Prefecture pref : prefectures.values()) {
        	//文字列の"id"をint型に変換
            int idInt = Integer.parseInt(pref.id);
            //Prefectureクラスで宣言した変数を利用し表示
            System.out.println("id:" + idInt + "は" + pref.shortName);
        }
    }

	/**課題２　県ごとの市区町村の数を表示するメソッド
	 * 
	 * @param prefectures
	 */
    public static void task2(Map<String, Prefecture> prefectures) {
        for (Prefecture pref : prefectures.values()) {
        	//Prefectureクラスで宣言した変数を利用し表示。
            System.out.println(pref.shortName + ":" + pref.city.size());
        }
    }
}
