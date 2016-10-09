package Bean;

import utils.RandomUtils;

public class NutritionFacts {
	
	private final int servingSize;// ��Ҫ
	private final int servings;// ��Ҫ
	private final int calories;// ��ѡ
	private final int fat;// ��ѡ
	private final int sodium;// ��ѡ
	private final int carbohydrate;// ��ѡ

	public int getServingSize() {
		return servingSize;
	}

	public int getServings() {
		return servings;
	}

	public int getCalories() {
		return calories;
	}

	public int getFat() {
		return fat;
	}

	public int getSodium() {
		return sodium;
	}

	public int getCarbohydrate() {
		return carbohydrate;
	}

	public static class Builder {
		private final int servingSize;// ��Ҫ
		private final int servings;// ��Ҫ
		private int calories = 0;// ��ѡ
		private int fat = 0;// ��ѡ
		private int sodium = 0;// ��ѡ
		private int carbohydrate = 0;// ��ѡ

		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}

		public Builder calories(int val) {
			calories = val;
			return this;
		}

		public Builder fat(int val) {
			fat = val;
			return this;
		}

		public Builder sodium(int val) {
			this.sodium = val;
			return this;
		}
		public NutritionFacts build() {
			return new NutritionFacts(this);
		}

	}

	private NutritionFacts(Builder builder) {

		this.servingSize = builder.servingSize;
		this.servings = builder.servings;
		this.calories = builder.calories;
		this.fat = builder.fat;
		this.sodium = builder.sodium;
		this.carbohydrate = builder.carbohydrate;
	}
}
