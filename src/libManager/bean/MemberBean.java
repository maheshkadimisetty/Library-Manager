package libManager.bean;

import java.util.Date;

public class MemberBean {
	private int sId;
	private String sName;
	private int booksLimit;
	private int noOfBooks;
	private int totalFine;
	private Date issueDate;
	private String mobileNo;
	private String emailId;
	
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getBooksLimit() {
		return booksLimit;
	}
	public void setBooksLimit(int booksLimit) {
		this.booksLimit = booksLimit;
	}
	public int getNoOfBooks() {
		return noOfBooks;
	}
	public void setNoOfBooks(int noOfBooks) {
		this.noOfBooks = noOfBooks;
	}
	public int getTotalFine() {
		return totalFine;
	}
	public void setTotalFine(int totalFine) {
		this.totalFine = totalFine;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	

}
