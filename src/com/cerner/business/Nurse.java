package com.cerner.business;

import com.cerner.base.Person;

public class Nurse extends Person{

	public String getWorkingHoursType() {
		return workingHoursType;
	}
	public void setWorkingHoursType(String workingHoursType) {
		this.workingHoursType = workingHoursType;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getQualificationLevel() {
		return qualificationLevel;
	}
	public void setQualificationLevel(String qualificationLevel) {
		this.qualificationLevel = qualificationLevel;
	}
	public String workingHoursType;
	private String employeeId;
	private String qualificationLevel;


}
