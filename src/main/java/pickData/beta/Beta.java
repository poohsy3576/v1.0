package pickData.beta;

import java.util.HashMap;
import java.util.Map;

public class Beta {
	public static void main(String[] args) {
		Map<String, Double> mapt13 = new HashMap<String, Double>();

		mapt13.put("bx", 0.0);
		mapt13.put("bo", -0.9493);
		mapt13.put("bk", -1.3525);
		mapt13.put("bg", 0.8241);
		mapt13.put("br", 0.0);

		Map<String, Double> mapc11 = new HashMap<String, Double>();

		Double[] betac11 = new Double[] { 1.8613, 0.6827, 0.1108, -0.4673, -0.752, -1.0232, -1.2449, -2.5241, -1.2892,
				-1.3312, -1.5922, 0.0 };

		for (int i = 0; i < betac11.length; i++) {
			String key = "b" + i;
			Double value = betac11[i];
			mapc11.put(key, value);
		}

		Map<String, Double> mapc3 = new HashMap<String, Double>();

		Double[] betac3 = new Double[] { -4.2021,	-3.0299, -2.2288, -1.7538, -1.1574, -0.8809,	-0.7598, 0.0 };

		for (int i = 0; i < betac3.length; i++) {
			String key = "b" + i;
			Double value = betac3[i];
			mapc3.put(key, value);
		}
		
		Map<String, Double> mapc9 = new HashMap<String, Double>();

		Double[] betac9 = new Double[] { -0.1807,	-0.2529, 0.4859, 	0.644,	0.8846, 1.1339, 1.2745,	0.7857,-0.1499,0.4584,0.1351,0.0};

		for (int i = 0; i < betac9.length; i++) {
			String key = "b" + i;
			Double value = betac9[i];
			mapc9.put(key, value);
		}
		
		Map<String, Double> mapi19 = new HashMap<String, Double>();

		Double[] betai19 = new Double[] { -2.3813,-2.1266,-2.0,-1.6275,-1.4356,-1.2816,-1.2377,-0.5328,0.0};

		for (int i = 0; i < betai19.length; i++) {
			String key = "b" + i;
			Double value = betai19[i];
			mapi19.put(key, value);
		}
		
		/*
		 * 맵 확인용 출력
		 */
		
		System.out.println("***********t13****************");
		for (Map.Entry<String, Double> elem : mapt13.entrySet()) {
			System.out.println(elem.getKey() + ", " + elem.getValue());
		}
		System.out.println();
		
		System.out.println("***********c11****************");
		for (Map.Entry<String, Double> elem : mapc11.entrySet()) {
			System.out.println(elem.getKey() + ", " + elem.getValue());
		}
		System.out.println();
		
		System.out.println("***********c3****************");
		for (Map.Entry<String, Double> elem : mapc3.entrySet()) {
			System.out.println(elem.getKey() + ", " + elem.getValue());
		}
		System.out.println();
		
		System.out.println("***********c9****************");
		for (Map.Entry<String, Double> elem : mapc9.entrySet()) {
			System.out.println(elem.getKey() + ", " + elem.getValue());
		}
		System.out.println();
		
		System.out.println("***********i19****************");
		for (Map.Entry<String, Double> elem : mapi19.entrySet()) {
			System.out.println(elem.getKey() + ", " + elem.getValue());
		}

	}
}
