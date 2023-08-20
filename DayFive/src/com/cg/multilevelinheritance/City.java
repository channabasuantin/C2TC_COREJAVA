package com.cg.multilevelinheritance;

public class City extends State {
	
	private String cityname;
	private String pincode;
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "City [cityname=" + cityname + ", pincode=" + pincode + ", getStatename()=" + getStatename()
				+ ", getLanguage()=" + getLanguage() + ", getCountryName()=" + getCountryName() + ", getCapital()="
				+ getCapital() + "]";
	}
	
	
	
	

}
