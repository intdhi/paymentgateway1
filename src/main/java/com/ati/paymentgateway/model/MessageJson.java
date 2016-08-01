package com.ati.paymentgateway.model;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MessageJson{
	private int errorCode;
	private int statusCode;
	private String message;
	private Long objectID;
	
	public MessageJson(int errorCode, int statusCode,String message){
		this.errorCode=errorCode;
		this.statusCode=statusCode;
		this.message=message;
	}
	
	public MessageJson(){
		
	}

	


	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


	public Long getObjectID() {
		return objectID;
	}

	public void setObjectID(Long objectID) {
		this.objectID = objectID;
	}

	@Override
	public String toString() {
		return "MessageJson [errorCode=" + errorCode + ", statusCode=" + statusCode + ", message=" + message
				+ ", objectID=" + objectID + "]";
	}
	
	
}
