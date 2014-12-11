public class Test{
	public static void main(String[] args){
		//MiWifi mi=new MiWifi();
		
		USB_WIFI mi=new MiWifi();//向上转型
		
		
	//	MiWiFi mi2=(MiWiFi)mi;//向下转型
		System.out.println(((MiWifi)mi).brand);//向下转型
		
		mi.open();
		mi.close();
		mi.read();
		mi.write();
		mi.usb2wifi();
	}

}