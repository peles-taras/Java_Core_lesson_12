package ua.lviv.lgs.task1;

public class Helm extends Engine{



	private int wheelDiameter;
	private String material;

	public Helm(int CylinderQty,int wheelDiameter, String material ) {
		super(CylinderQty);
		this.wheelDiameter = wheelDiameter; 
		this.material = material;
	}

	public int getWheelDiameter() {
		return wheelDiameter;
	}

	public void setWheelDiameter(int wheelDiameter) {
		this.wheelDiameter = wheelDiameter;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	
}
