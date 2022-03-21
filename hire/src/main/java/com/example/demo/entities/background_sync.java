package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class background_sync {
	
	@Id
	private String interviews;
	private String applicant_name;
	private String Category;
	private String jobstage;
	private String evaluation_date_time;
	
	
	public String getInterviews() {
		return interviews;
	}
	public void setInterviews(String string) {
		this.interviews = string;
	}
	public String getApplicant_name() {
		return applicant_name;
	}
	public void setApplicant_name(String applicant_name) {
		this.applicant_name = applicant_name;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getJobstage() {
		return jobstage;
	}
	public void setJobstage(String jobstage) {
		this.jobstage = jobstage;
	}
	public String getEvaluation_date_time() {
		return evaluation_date_time;
	}
	public void setEvaluation_date_time(String evaluation_date_time) {
		this.evaluation_date_time = evaluation_date_time;
	}
	public background_sync() {
		super();
		// TODO Auto-generated constructor stub
	}
	public background_sync(String interviews, String applicant_name, String category, String jobstage,
			String evaluation_date_time) {
		super();
		this.interviews = interviews;
		this.applicant_name = applicant_name;
		Category = category;
		this.jobstage = jobstage;
		this.evaluation_date_time = evaluation_date_time;
	}

}
