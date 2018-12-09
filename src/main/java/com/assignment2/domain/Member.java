package com.assignment2.domain;

public class Member {

	private int memberId;
	private String memberEmail;
	private String memberName;
	private String memberPassword;
	private boolean memberEnabled;
	
	public Member(int memberId, String memberEmail, String memberName, String memberPassword, boolean memberEnabled) {
		super();
		this.memberId = memberId;
		this.memberEmail = memberEmail;
		this.memberName = memberName;
		this.memberPassword = memberPassword;
		this.memberEnabled = memberEnabled;
	}

	public Member() {
		
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberPassword() {
		return memberPassword;
	}

	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}

	public boolean isMemberEnabled() {
		return memberEnabled;
	}

	public void setMemberEnabled(boolean memberEnabled) {
		this.memberEnabled = memberEnabled;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberEmail=" + memberEmail + ", memberName=" + memberName
				+ ", memberPassword=" + memberPassword + ", memberEnabled=" + memberEnabled + "]";
	}
}
