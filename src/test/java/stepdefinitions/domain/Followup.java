package stepdefinitions.domain;

import java.util.ArrayList;

public class Followup {
	
	private String id;
	 private String name;
	 private String startDate;
	 private String endDate;
	 private String academicYear;
	 private String status;
	 ArrayList < Task > tasks = new ArrayList < Task > ();
	 ArrayList < String > taskIds = new ArrayList < String > ();
	 private float numberOfSchools;
	 private float numberOfSubmissions;
	 private float numberOfParticipants;
	 private String createdAt;
	 private String description;
	
	public Followup() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(String academicYear) {
		this.academicYear = academicYear;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ArrayList<Task> getTasks() {
		return tasks;
	}

	public void setTasks(ArrayList<Task> tasks) {
		this.tasks = tasks;
	}

	public ArrayList<String> getTaskIds() {
		return taskIds;
	}

	public void setTaskIds(ArrayList<String> taskIds) {
		this.taskIds = taskIds;
	}

	public float getNumberOfSchools() {
		return numberOfSchools;
	}

	public void setNumberOfSchools(float numberOfSchools) {
		this.numberOfSchools = numberOfSchools;
	}

	public float getNumberOfSubmissions() {
		return numberOfSubmissions;
	}

	public void setNumberOfSubmissions(float numberOfSubmissions) {
		this.numberOfSubmissions = numberOfSubmissions;
	}

	public float getNumberOfParticipants() {
		return numberOfParticipants;
	}

	public void setNumberOfParticipants(float numberOfParticipants) {
		this.numberOfParticipants = numberOfParticipants;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
