package registro.model;

import registro.entity.Phone;

public class PhoneModelo {
	private Long idPhone;
	private int number;
	private int cityCode;
	private int countryCode;
	
	public PhoneModelo(Phone phone) {
		this.idPhone = phone.getIdPhone();
		this.number = phone.getNumber();
		this.cityCode = phone.getCityCode();
		this.countryCode = phone.getCountryCode();
	}

	public Long getIdPhone() {
		return idPhone;
	}
	public void setIdPhone(Long idPhone) {
		this.idPhone = idPhone;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getCityCode() {
		return cityCode;
	}
	public void setCityCode(int cityCode) {
		this.cityCode = cityCode;
	}
	public int getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}
}
