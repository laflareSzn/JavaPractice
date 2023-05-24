import java.util.Scanner;
	public class AirConditioner{
	
	private boolean isOn;
	private String productName;
	private int temperature;
	
	public AirConditioner(String AirConditioner) {}
	public void decreaseTemperature() {}
	public void increaseTemperature() {}
	public void setTemperature(int newtemperature) {this.temperature = newtemperature;}
	
	public int getTemperature () {return temperature;}
	public boolean isOn () {return true;}

	public void setOn (boolean newOn) {if (isOn== true);isOn = newOn;}
	
	public void setProuctName(String newproductName){this.productName = newproductName;}
	public String getProductName () {return productName;}

}
