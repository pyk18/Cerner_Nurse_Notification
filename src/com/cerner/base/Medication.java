package com.cerner.base;

public class Medication {

private String medicineName;
private String medicineClass;
private String frequency;
private boolean isAlergic;

public String getMedicineName() {
	return medicineName;
}
public void setMedicineName(String medicineName) {
	this.medicineName = medicineName;
}
public String getMedicineClass() {
	return medicineClass;
}
public void setMedicineClass(String medicineClass) {
	this.medicineClass = medicineClass;
}
public String getFrequency() {
	return frequency;
}
public void setFrequency(String frequency) {
	this.frequency = frequency;
}
public boolean isAlergic() {
	return isAlergic;
}
public void setAlergic(boolean isAlergic) {
	this.isAlergic = isAlergic;
} 


}
