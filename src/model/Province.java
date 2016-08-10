package model;

public class Province {
	private int id;
	private String provinceName;
	private String provinceCode;
//**********************************id	
	public int getId(){
		return id;		
	}
	
	public void setId(int id){
		this.id=id;
	}
//************************************name	
	public String getProvinceName(){
		return provinceName;		
	}
	
	public void setProvinceName(String provinceName){
		this.provinceName=provinceName;
	}
//*************************************code(代号)	
	public String getProvinceCode(){
		return provinceCode;		
	}
	public void setProvinceCode(String provinceCode){
		this.provinceCode=provinceCode;
	}

}
