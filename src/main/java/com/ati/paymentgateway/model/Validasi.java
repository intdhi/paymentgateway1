package com.ati.paymentgateway.model;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Validasi {
	private Long id;
	private String nameValidation;
	private String description;
	private String field;
	private String valueOperator;
	private String typeData;
	private Date dateValue;
	private Date dateValue2;
	private String stringValue;
	private int intValue;
	private int intValue2;
	
	public Date getDateValue2() {
		return dateValue2;
	}
	public void setDateValue2(Date dateValue2) {
		this.dateValue2 = dateValue2;
	}
	public int getIntValue2() {
		return intValue2;
	}
	public void setIntValue2(int intValue2) {
		this.intValue2 = intValue2;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNameValidation() {
		return nameValidation;
	}
	public void setNameValidation(String nameValidation) {
		this.nameValidation = nameValidation;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getValueOperator() {
		return valueOperator;
	}
	public void setValueOperator(String valueOperator) {
		this.valueOperator = valueOperator;
	}
	public String getTypeData() {
		return typeData;
	}
	public void setTypeData(String typeData) {
		this.typeData = typeData;
	}
	public Date getDateValue() {
		return dateValue;
	}
	public void setDateValue(Date dateValue) {
		this.dateValue = dateValue;
	}
	public String getStringValue() {
		return stringValue;
	}
	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}
	public int getIntValue() {
		return intValue;
	}
	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateValue == null) ? 0 : dateValue.hashCode());
		result = prime * result + ((dateValue2 == null) ? 0 : dateValue2.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((field == null) ? 0 : field.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + intValue;
		result = prime * result + intValue2;
		result = prime * result + ((nameValidation == null) ? 0 : nameValidation.hashCode());
		result = prime * result + ((stringValue == null) ? 0 : stringValue.hashCode());
		result = prime * result + ((typeData == null) ? 0 : typeData.hashCode());
		result = prime * result + ((valueOperator == null) ? 0 : valueOperator.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Validasi other = (Validasi) obj;
		if (dateValue == null) {
			if (other.dateValue != null)
				return false;
		} else if (!dateValue.equals(other.dateValue))
			return false;
		if (dateValue2 == null) {
			if (other.dateValue2 != null)
				return false;
		} else if (!dateValue2.equals(other.dateValue2))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (field == null) {
			if (other.field != null)
				return false;
		} else if (!field.equals(other.field))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (intValue != other.intValue)
			return false;
		if (intValue2 != other.intValue2)
			return false;
		if (nameValidation == null) {
			if (other.nameValidation != null)
				return false;
		} else if (!nameValidation.equals(other.nameValidation))
			return false;
		if (stringValue == null) {
			if (other.stringValue != null)
				return false;
		} else if (!stringValue.equals(other.stringValue))
			return false;
		if (typeData == null) {
			if (other.typeData != null)
				return false;
		} else if (!typeData.equals(other.typeData))
			return false;
		if (valueOperator == null) {
			if (other.valueOperator != null)
				return false;
		} else if (!valueOperator.equals(other.valueOperator))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Validasi [id=" + id + ", nameValidation=" + nameValidation + ", description=" + description + ", field="
				+ field + ", valueOperator=" + valueOperator + ", typeData=" + typeData + ", dateValue=" + dateValue
				+ ", dateValue2=" + dateValue2 + ", stringValue=" + stringValue + ", intValue=" + intValue
				+ ", intValue2=" + intValue2 + "]";
	}
	StringBuilder sb = new StringBuilder();
	public StringBuilder toStringBuilder() {
		return sb.append("Validasi [id=" + id + ", nameValidation=" + nameValidation + ", description=" + description + ", field="
				+ field + ", valueOperator=" + valueOperator + ", typeData=" + typeData + ", dateValue=" + dateValue
				+ ", dateValue2=" + dateValue2 + ", stringValue=" + stringValue + ", intValue=" + intValue
				+ ", intValue2=" + intValue2 + "]");
	}
	
}
