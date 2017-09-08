package com.toyo.operation.history.model;



public class KpiOthersModel {

	public PcTreatmentSection pcTreatmentSection;
	public PcTreatmentSection getPcTreatmentSection() {
		return pcTreatmentSection;
	}
	public void setPcTreatmentSection(PcTreatmentSection pcTreatmentSection) {
		this.pcTreatmentSection = pcTreatmentSection;
	}
	public TankLevel getTankLevel() {
		return tankLevel;
	}
	public void setTankLevel(TankLevel tankLevel) {
		this.tankLevel = tankLevel;
	}
	public Utility getUtility() {
		return utility;
	}
	public void setUtility(Utility utility) {
		this.utility = utility;
	}
	public TankLevel tankLevel;
	public Utility utility;
	
}



