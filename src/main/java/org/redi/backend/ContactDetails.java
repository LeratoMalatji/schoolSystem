package org.redi.backend;

import javax.persistence.Embeddable;

@Embeddable
public class ContactDetails {

	private String cellNumber;
	private String landLine ;
    private String Email;
    
	
 public ContactDetails()
 {
	 
	 
 }
 
	
	public String getCellNumber() {
		return cellNumber;
	}
	public void setCellNumber(String cellNumber) {
		this.cellNumber = cellNumber;
	}
	public String getLandLine() {
		return landLine;
	}
	public void setLandLine(String landLine) {
		this.landLine = landLine;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
}
