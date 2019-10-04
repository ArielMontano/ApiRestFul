package registro.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import registro.model.PhoneModelo;

@Table(name="PHONE")
@Entity
public class Phone implements Serializable{

	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="id_phone")
	private Long idPhone;
	@Column(name="number")
	private int number;
	@Column(name="city_code")
	private int cityCode;
	@Column(name="country_code")
	private int countryCode;
	
	public Phone() {
	}
	
	public Phone(PhoneModelo mPhone) {
		this.idPhone = mPhone.getIdPhone();
		this.number = mPhone.getNumber();
		this.cityCode = mPhone.getCityCode();
		this.countryCode = mPhone.getCountryCode();
	}
	
	@Override
	public String toString() {
		return "Phone [idPhone=" + idPhone + ", number=" + number + ", cityCode=" + cityCode + ", countryCode="
				+ countryCode + "]";
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
