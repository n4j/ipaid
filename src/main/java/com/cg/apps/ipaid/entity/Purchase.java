package com.cg.apps.ipaid.entity;

import java.util.Date;

public class Purchase implements Comparable<Purchase>{

	private String id;	  
	private PurchaseMetaData metadata;
	private String filename;
	private String contentType;
	private Long chunkSize;
	private Long length;
	private Date uploadDate;
	private String md5;
	private String aliases;
	  
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public PurchaseMetaData getMetadata() {
		return metadata;
	}
	public void setMetadata(PurchaseMetaData metadata) {
		this.metadata = metadata;
	}

	public void setFileName(String fileName) {
		this.filename = fileName;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public Long getChunkSize() {
		return chunkSize;
	}
	public void setChunkSize(Long chunkSize) {
		this.chunkSize = chunkSize;
	}
	public Long getLength() {
		return length;
	}
	public void setLength(Long length) {
		this.length = length;
	}
	public Date getUploadDate() {
		return uploadDate;
	}
	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}
	public String getMd5() {
		return md5;
	}
	public void setMd5(String md5) {
		this.md5 = md5;
	}
	public String getAliases() {
		return aliases;
	}
	public void setAliases(String aliases) {
		this.aliases = aliases;
	}
	@Override
	public int compareTo(Purchase o) {
		if(this.getMetadata().getProductCost() < o.getMetadata().getProductCost()) {
			return -1;
		} else if(this.getMetadata().getProductCost() > o.getMetadata().getProductCost()) {
			return 1;
		} else {
			return 0;
		}
	}
	
	
	  
	  
	 
}