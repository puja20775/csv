package com.crud.demo;

public class ResposeMessage {

	private String message;
	private String fileDownloadUri;
	

	  public ResposeMessage(String message, String fileDownloadUri) {
	    this.message = message;
	    this.fileDownloadUri = fileDownloadUri;
	  }

	  public String getMessage() {
	    return message;
	  }

	  public void setMessage(String message) {
	    this.message = message;
	  }

	public String getFileDownloadUri() {
		return fileDownloadUri;
	}

	public void setFileDownloadUri(String fileDownloadUri) {
		this.fileDownloadUri = fileDownloadUri;
	}

}

