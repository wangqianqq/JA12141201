public class Test{
	public static void main(String[] args){
		//MiWifi mi=new MiWifi();
		
		USB_WIFI mi=new MiWifi();//����ת��
		
		
	//	MiWiFi mi2=(MiWiFi)mi;//����ת��
		System.out.println(((MiWifi)mi).brand);//����ת��
		
		mi.open();
		mi.close();
		mi.read();
		mi.write();
		mi.usb2wifi();
	}

}