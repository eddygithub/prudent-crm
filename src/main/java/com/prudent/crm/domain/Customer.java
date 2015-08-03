package com.prudent.crm.domain;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Customer {

	@Id
	private String id;
	private String firstName;
	private String lastName;
	private int ssn;
	private String phoneNumber;
	private String email;
	private Address address;
	private LocalDate dateOfBirth;
	private MaritalStatus maritalStatus;
	private int numberOfChild;
	private boolean ownProperty;
	private boolean ownVehicle;
	private boolean isSelfEmployed;
	private double adjustedGrossIncome;
	private String dialect;
	private LegalStatus legalStatus;
	private String personality;
	private double federalRefundAmount;
	private double stateRefundAmount;
	private String auditIRScomments;
	private String internalComments;
	private double feeCharged;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public MaritalStatus getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public int getNumberOfChild() {
		return numberOfChild;
	}
	public void setNumberOfChild(int numberOfChild) {
		this.numberOfChild = numberOfChild;
	}
	public boolean isOwnProperty() {
		return ownProperty;
	}
	public void setOwnProperty(boolean ownProperty) {
		this.ownProperty = ownProperty;
	}
	public boolean isOwnVehicle() {
		return ownVehicle;
	}
	public void setOwnVehicle(boolean ownVehicle) {
		this.ownVehicle = ownVehicle;
	}
	public boolean isSelfEmployed() {
		return isSelfEmployed;
	}
	public void setSelfEmployed(boolean isSelfEmployed) {
		this.isSelfEmployed = isSelfEmployed;
	}
	public double getAdjustedGrossIncome() {
		return adjustedGrossIncome;
	}
	public void setAdjustedGrossIncome(double adjustedGrossIncome) {
		this.adjustedGrossIncome = adjustedGrossIncome;
	}
	public String getDialect() {
		return dialect;
	}
	public void setDialect(String dialect) {
		this.dialect = dialect;
	}
	public LegalStatus getLegalStatus() {
		return legalStatus;
	}
	public void setLegalStatus(LegalStatus legalStatus) {
		this.legalStatus = legalStatus;
	}
	public String getPersonality() {
		return personality;
	}
	public void setPersonality(String personality) {
		this.personality = personality;
	}
	public double getFederalRefundAmount() {
		return federalRefundAmount;
	}
	public void setFederalRefundAmount(double federalRefundAmount) {
		this.federalRefundAmount = federalRefundAmount;
	}
	public double getStateRefundAmount() {
		return stateRefundAmount;
	}
	public void setStateRefundAmount(double stateRefundAmount) {
		this.stateRefundAmount = stateRefundAmount;
	}
	public String getAuditIRScomments() {
		return auditIRScomments;
	}
	public void setAuditIRScomments(String auditIRScomments) {
		this.auditIRScomments = auditIRScomments;
	}
	public String getInternalComments() {
		return internalComments;
	}
	public void setInternalComments(String internalComments) {
		this.internalComments = internalComments;
	}
	public double getFeeCharged() {
		return feeCharged;
	}
	public void setFeeCharged(double feeCharged) {
		this.feeCharged = feeCharged;
	}

}
