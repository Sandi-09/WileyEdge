package assingment6;

public class EmployeeAddress {
private int flatNo;
private String flatName;
private String roadName;
private String cityName;
private EmployeeAddressType empAddType;



public EmployeeAddress(int flatNo, String flatName, String roadName, String cityName,EmployeeAddressType empAddType) {
	super();
	this.flatNo = flatNo;
	this.flatName = flatName;
	this.roadName = roadName;
	this.cityName = cityName;
	this.empAddType=empAddType;
}

public int getFlatNo() {
	return flatNo;
}

public void setFlatNo(int flatNo) {
	this.flatNo = flatNo;
}

public String getFlatName() {
	return flatName;
}

public void setFlatName(String flatName) {
	this.flatName = flatName;
}

public String getRoadName() {
	return roadName;
}

public void setRoadName(String roadName) {
	this.roadName = roadName;
}

public String getCityName() {
	return cityName;
}

public void setCityName(String cityName) {
	this.cityName = cityName;
}
public EmployeeAddressType getEmpAddType() {
	return empAddType;
}

public void setEmpAddType(EmployeeAddressType empAddType) {
	this.empAddType = empAddType;
}

@Override
public String toString() {
	return "EmployeeAddress [flatNo=" + flatNo + ", flatName=" + flatName + ", roadName=" + roadName + ", cityName="
			+ cityName + ", empAddType=" + empAddType + "]";
}


}
