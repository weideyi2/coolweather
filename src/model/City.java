package model;

public class City {
	private int id;
	private String cityName;
	private String cityCode;
	private int provinceId;
//*********************************id	
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
//*********************************name	
	public String getCityName(){
		return cityName;
	}
	public void setCityName(String cityName){
		this.cityName=cityName;
	}
//*********************************code	
	public String getCityCode(){
		return cityCode;
	}
	public void setCityCode(String cityCode){
		this.cityCode=cityCode;
	}
//*******************************provinceId	
	public int getProvinceId(){
		return provinceId;
	}
	public void setProvinceId(int provinceId){
		this.provinceId=provinceId;
	}
	

}
