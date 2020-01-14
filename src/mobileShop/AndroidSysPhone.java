package mobileShop;

public class AndroidSysPhone extends MobilePhone {
	// 特有属性：像素
	private String Pixel;

	public AndroidSysPhone(String system, String brand, String model,
			int years, String color, String Pixel) {
		super(system, brand, model, years, color);
		this.Pixel = Pixel;
	}
}
