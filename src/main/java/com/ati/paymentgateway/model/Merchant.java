package com.ati.paymentgateway.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Merchant implements Serializable {
	private Long id;
	private String merchantName;
	private String terminalName;
	private String merchantType;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date registeredDateTime;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date activateDateTime;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getTerminalName() {
		return terminalName;
	}
	public void setTerminalName(String terminalName) {
		this.terminalName = terminalName;
	}
	public String getMerchantType() {
		return merchantType;
	}
	public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
	}

	public Date getRegisteredDateTime() {
		return registeredDateTime;
	}
	public void setRegisteredDateTime(Date registeredDateTime) {
		this.registeredDateTime = registeredDateTime;
	}

	public Date getActivateDateTime() {
		return activateDateTime;
	}
	
	
	public void setActivateDateTime(Date activateDateTime) {
		this.activateDateTime = activateDateTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((activateDateTime == null) ? 0 : activateDateTime.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((merchantName == null) ? 0 : merchantName.hashCode());
		result = prime * result + ((merchantType == null) ? 0 : merchantType.hashCode());
		result = prime * result + ((registeredDateTime == null) ? 0 : registeredDateTime.hashCode());
		result = prime * result + ((terminalName == null) ? 0 : terminalName.hashCode());
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
		Merchant other = (Merchant) obj;
		if (activateDateTime == null) {
			if (other.activateDateTime != null)
				return false;
		} else if (!activateDateTime.equals(other.activateDateTime))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (merchantName == null) {
			if (other.merchantName != null)
				return false;
		} else if (!merchantName.equals(other.merchantName))
			return false;
		if (merchantType == null) {
			if (other.merchantType != null)
				return false;
		} else if (!merchantType.equals(other.merchantType))
			return false;
		if (registeredDateTime == null) {
			if (other.registeredDateTime != null)
				return false;
		} else if (!registeredDateTime.equals(other.registeredDateTime))
			return false;
		if (terminalName == null) {
			if (other.terminalName != null)
				return false;
		} else if (!terminalName.equals(other.terminalName))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Merchant [id=" + id + ", merchantName=" + merchantName + ", terminalName=" + terminalName
				+ ", merchantType=" + merchantType + ", registeredDateTime=" + registeredDateTime
				+ ", activateDateTime=" + activateDateTime + "]";
	}
}
