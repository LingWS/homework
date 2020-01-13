package mobilephone;

/**
 * 
 * @author WuShaoling
 * @description 手机类
 * 
 */
public class MobilePhone {

	private String system;// 手机系统
	private String brand;// 手机品牌
	private String model;// 手机型号
	private int years;// 发行年份
	private String color;// 手机颜色

	// 带参构造方法
	public MobilePhone(String system, String brand, String model, int years,
			String color) {
		super();
		this.setSystem(system);
		this.setBrand(brand);
		this.setModel(model);
		this.setYears(years);
		this.setColor(color);
	}

	// 无参构造方法
	public MobilePhone() {

	}

	public String getSystem() {
		return system;
	}

	public void setSystem(String system) {
		this.system = system;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// 获取手机信息
	public String getDetails() {
		String str = "手机信息如下：\n运行系统：" + this.getSystem() + "\n手机品牌："
				+ this.getBrand() + "\n手机型号：" + this.getModel() + "\n发行年份："
				+ this.getYears() + "\n手机颜色：" + this.getColor();
		return str;
	}
}
