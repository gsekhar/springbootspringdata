package com.cox.pwdutility.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "userinfo")
public class User {

	@Id
	@Column(name = "USERSEQID")
	private Long userSeqId;

	@Column(name = "AGREEMENTID", length = 12)
	private Long agreementId;

	@Column(name = "USERID", length = 60)
	private String userId;

	@Column(name = "PASSWORD", length = 128)
	private String passWord;

	@Column(name = "FNAME", length = 40)
	private String firstName;

	@Column(name = "LNAME", length = 40)
	private String lastName;

	@Column(name = "TELNUMBER", length = 10)
	private String telNumber;

	@Column(name = "ALTTELNUMBER", length = 10)
	private String altTelNumber;

	@Column(name = "EMAILID", length = 100)
	private String userEmailId;

	@Column(name = "COMPANYID")
	private int companyid; 
	
	@Temporal(TemporalType.DATE)
	@Column(name = "LAST_LOGON", length = 7)
	private java.util.Date lastLogOn;

	@Column(name = "ACTIVE", length = 1)
	private Boolean userActive;

	@Column(name = "COMPANYACTIVE", length = 1)
	private Boolean userCompanyActive;

	@Column(name = "AGREMENTCONFIRM", length = 1)
	private Character confirm;

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATEDATE", length = 7)
	private java.util.Date createdDate;

	@Temporal(TemporalType.DATE)
	@Column(name = "UPDATEDATE", length = 7)
	private java.util.Date updatedDate;

	@Column(name = "CREATE_USERID", length = 60)
	private String createdUserId;

	@Column(name = "UPDATE_USERID", length = 60)
	private String updatedUserId;

	@Temporal(TemporalType.DATE)
	@Column(name = "NOTIFICATION_SENT_DATE", length = 7)
	private java.util.Date notificationSentDate;

	@Column(name = "EMAIL_RESPONSE", length = 1)
	private Boolean emailResponse;
	
	@Column(name = "HASH", length=256)
	private String hash;

	@Temporal(TemporalType.DATE)
	@Column(name = "HASH_SENT_DATE", length=7)
	private java.util.Date hashSentDate;

	public Long getUserSeqId() {
		return userSeqId;
	}

	public void setUserSeqId(Long userSeqId) {
		this.userSeqId = userSeqId;
	}

	public Long getAgreementId() {
		return agreementId;
	}

	public void setAgreementId(Long agreementId) {
		this.agreementId = agreementId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
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

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	public String getAltTelNumber() {
		return altTelNumber;
	}

	public void setAltTelNumber(String altTelNumber) {
		this.altTelNumber = altTelNumber;
	}

	public String getUserEmailId() {
		return userEmailId;
	}

	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}

	public java.util.Date getLastLogOn() {
		return lastLogOn;
	}

	public void setLastLogOn(java.util.Date lastLogOn) {
		this.lastLogOn = lastLogOn;
	}

	public Boolean getUserActive() {
		return userActive;
	}

	public void setUserActive(Boolean userActive) {
		this.userActive = userActive;
	}

	public Boolean getUserCompanyActive() {
		return userCompanyActive;
	}

	public void setUserCompanyActive(Boolean userCompanyActive) {
		this.userCompanyActive = userCompanyActive;
	}

	public Character getConfirm() {
		return confirm;
	}

	public void setConfirm(Character confirm) {
		this.confirm = confirm;
	}

	public java.util.Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(java.util.Date createdDate) {
		this.createdDate = createdDate;
	}

	public java.util.Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(java.util.Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getCreatedUserId() {
		return createdUserId;
	}

	public void setCreatedUserId(String createdUserId) {
		this.createdUserId = createdUserId;
	}

	public String getUpdatedUserId() {
		return updatedUserId;
	}

	public void setUpdatedUserId(String updatedUserId) {
		this.updatedUserId = updatedUserId;
	}

	public java.util.Date getNotificationSentDate() {
		return notificationSentDate;
	}

	public void setNotificationSentDate(java.util.Date notificationSentDate) {
		this.notificationSentDate = notificationSentDate;
	}

	public Boolean getEmailResponse() {
		return emailResponse;
	}

	public void setEmailResponse(Boolean emailResponse) {
		this.emailResponse = emailResponse;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public java.util.Date getHashSentDate() {
		return hashSentDate;
	}

	public void setHashSentDate(java.util.Date hashSentDate) {
		this.hashSentDate = hashSentDate;
	}

	public int getCompanyid() {
		return companyid;
	}

	public void setCompanyid(int companyid) {
		this.companyid = companyid;
	}

}
