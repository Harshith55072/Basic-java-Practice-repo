package org.tnsif.acc.c2tc.interfacedemo;
class SmartLight implements SmartDevice
{
	@Override
	public void turnOn() {
		System.out.println("SmartLight is On");
		
	}
	@Override
	public void turnOff() {
		System.out.println("Smartlight is off");
		
	}
	@Override
	public void getStatus() {
		System.out.println("SmartLight is standbymode");
		
	}
	
}
public class InterfaceDemo 
{
	public static void main(String[] args) {
		SmartDevice smart=new SmartLight();
		smart.turnOn();
        smart.turnOff();
        smart.getStatus();
	}
}
