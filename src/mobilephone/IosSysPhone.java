package mobilephone;

public class IosSysPhone extends MobilePhone {
	// 特有属性：价格

	private double price;

	public IosSysPhone(String system, String brand, String model, int years,
			String color, double price) {
		super(system, brand, model, years, color);

		this.price = price;
	}

}
