package ua.lviv.lgs.task1;

public class Engine{

	private int CylinderQty;

	public Engine(int CylinderQty) {
		this.CylinderQty = CylinderQty;
	}

	public int getCylinderQty() {
		return CylinderQty;
	}

	public void setCylinderQty(int cylinderQty) {
		CylinderQty = cylinderQty;
	}

	@Override
	public String toString() {
		return "Engine [CylinderQty=" + CylinderQty + "]";
	}

}
