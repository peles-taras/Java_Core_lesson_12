package ua.lviv.lgs.task1;

public class Car extends Helm {

	private int horsePowerQty;
	private int manufacturingYear;

	public Car(int CylinderQty, int wheelDiameter, String material, 
		int horsePowerQty, int manufacturingYear) {
		super(CylinderQty, wheelDiameter, material);
		this.horsePowerQty = horsePowerQty;
		this.manufacturingYear = manufacturingYear;
	}

	public int getHorsePowerQty() {
		return horsePowerQty;
	}

	public void setHorsePowerQty(int horsePowerQty) {
		this.horsePowerQty = horsePowerQty;
	}

	public int getManufacturingYear() {
		return manufacturingYear;
	}

	public void setManufacturingYear(int manufacturingYear) {
		this.manufacturingYear = manufacturingYear;
	}

	@Override
	public String toString() {
		return "Car horsePowerQty=" + horsePowerQty + ", manufacturingYear=" + manufacturingYear
				+ ", WheelDiameter=" + getWheelDiameter() + ", Material=" + getMaterial()
				+ ", CylinderQty=" + getCylinderQty() + "";
	}

}
