package mobileShop;

public class MobileShop {
	// 添加手机
	public void addMobile() {
		// 创建对象数组
		MobilePhone[] MP = new MobilePhone[5];

		// 对象实例化并赋值
		IosSysPhone phoneOne = new IosSysPhone("IOS", "Apple", "Iphone 11",
				2019, "紫色", 6000);
		AndroidSysPhone phoneTwo = new AndroidSysPhone("安卓", "华为", "Iphone 11",
				2019, "花青色", "4800万");

	}
}
