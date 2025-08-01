package work_java;

public class Lesson05 {

	public static void main(String[] args) {
//		課題１
		//１から１０までの数値をランダムで生成
		int r1 = new java.util.Random().nextInt(10) +1;
		
		//２で割った余りが０なら偶数、偽であれば奇数と表示。
		if (r1 % 2 == 0) {
			System.out.println(r1 + "は偶数です。");
		} else
			System.out.println(r1 + "は奇数です。");

		
//		課題２
		//１から１００までの数値(点数)をランダムで生成。
		int r2 = new java.util.Random().nextInt(101);
		
		//生成された数値(点数)に応じて、その値と評価を表示
		if (0 <= r2 && r2 <= 49) {
			System.out.println("点数：" + r2 + "　評価：不可");
		} else if (50 <= r2 && r2 <= 69) {
			System.out.println("点数：" + r2 + "　評価：可");
		} else if (70 <= r2 && r2 <= 79) {
			System.out.println("点数：" + r2 + "　評価：良");
		} else if (80 <= r2 && r2 <= 99) {
			System.out.println("点数：" + r2 + "　評価：優");
		} else {
			System.out.println("点数：" + r2 + "　評価：満点");
		}
		
//		課題３
		//１から１００までの数値(点数)をランダムで生成(２科目分)。
		int sbj1 = new java.util.Random().nextInt(101);
		int sbj2 = new java.util.Random().nextInt(101);
		
		//各科目の点数を表示。
		System.out.println("科目１：" + sbj1);
		System.out.println("科目２：" + sbj2);
		
		//合計点数を初期化し表示。
		int sum = sbj1 + sbj2;
		System.out.println("合計点：" + sum);
		
		//条件に応じて評価を表示。
		if (sbj1 >= 60 && sbj2 >= 60) {
			System.out.println("合格");
		} else if (sum >= 130) {
			System.out.println("合格");
		} else if (sum >= 100 && (sbj1 >= 90 || sbj2 >= 90)) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}
		
	}

}