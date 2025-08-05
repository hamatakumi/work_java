package work_java;

import java.util.ArrayList;
import java.util.Arrays;

public class Lesson08 {

	public static void main(String[] args) {
//課題１
	double[] nums = {10, 1, 30};
	double ans =avg(nums);
	System.out.println(ans);
	
//課題２
	colorsExistence();
	
	}
	
	/**
	 * 課題１　３つの数値を引数として配列で受け取り、その平均値を返す
	 * 
	 * @param nums
	 * @return 引数が3つではない場合はエラーと0を返す
	 */
	public static double avg(double[] nums) {
		if (nums.length != 3) {
			System.out.println("エラー：引数は3つに設定してください。");
			return 0;
		}
		return (nums[0] + nums[1] + nums[2]) / 3;
	}

	
	/**
	 * 課題２　配列の合体、文字変換、要素追加、要素確認
	 * 
	 * 引数、戻り値なしのメソッド
	 */
	public static void colorsExistence() {
		String[] colors1 = {"BLUE", "RED", "GREEN"};
		String[] colors2 = {"yellow", "magenta", "cyan"};
		
		//配列colors1をArrayListに変換してからcolors3に代入し、colors3にcolors2を結合
        ArrayList<String> colors3 = new ArrayList<>(Arrays.asList(colors1));
        colors3.addAll(Arrays.asList(colors2));
		
		//colors3のすべての文字を小文字に揃える
        for (int i = 0; i < colors3.size(); i++) {
            colors3.set(i, colors3.get(i).toLowerCase());
        }
		
        //colors3に"black"を追加
        colors3.add("black");
        
	    // 確認用に出力
	    for (String mergedColors: colors3) {
	        System.out.println(mergedColors);
	    }
        
        //"green"が存在するかを判定
        if (colors3.contains("green")) {
            System.out.println("あり");
        } else {
            System.out.println("なし");
        }
        
	}

}
