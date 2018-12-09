package com.assignment2.domain;

import java.time.LocalDate;

public class Project {

	private int projectId;
	private String projectName;
	private String projectDescription;
	private int targetAmount;
	private int currentAmount;
	private LocalDate dateCreated;
	
	public Project(String projectName, String projectDescription, int targetAmount, int currentAmount,
			LocalDate dateCreated) {
		super();
		this.projectName = projectName;
		this.projectDescription = projectDescription;
		this.targetAmount = targetAmount;
		this.currentAmount = currentAmount;
		this.dateCreated = dateCreated;
	}
	
	public Project() {
		
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public int getTargetAmount() {
		return targetAmount;
	}

	public void setTargetAmount(int targetAmount) {
		this.targetAmount = targetAmount;
	}

	public int getCurrentAmount() {
		return currentAmount;
	}

	public void setCurrentAmount(int currentAmount) {
		this.currentAmount = currentAmount;
	}

	public LocalDate getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(LocalDate dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", projectDescription="
				+ projectDescription + ", targetAmount=" + targetAmount + ", currentAmount=" + currentAmount
				+ ", dateCreated=" + dateCreated + "]";
	}
}
