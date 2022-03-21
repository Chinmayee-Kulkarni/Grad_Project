package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Interviewer {
	
	@Id
	private String emailid;
	
	private String username;
	private String primary_Skill;
	private String secondary_Skill;
	private String tertiary_Skill;
	private String round_Alloted ;
	private int no_Of_Interviews;
    private String profile_Image;
   
    
    

	
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPrimary_Skill() {
		return primary_Skill;
	}
	public void setPrimary_Skill(String primary_Skill) {
		this.primary_Skill = primary_Skill;
	}
	public String getSecondary_Skill() {
		return secondary_Skill;
	}
	public void setSecondary_Skill(String secondary_Skill) {
		this.secondary_Skill = secondary_Skill;
	}
	public String getTertiary_Skill() {
		return tertiary_Skill;
	}
	public void setTertiary_Skill(String tertiary_Skill) {
		this.tertiary_Skill = tertiary_Skill;
	}
	public String getRound_Alloted() {
		return round_Alloted;
	}
	public void setRound_Alloted(String round_Alloted) {
		this.round_Alloted = round_Alloted;
	}
	public int getNo_Of_Interviews() {
		return no_Of_Interviews;
	}
	public void setNo_Of_Interviews(int no_Of_Interviews) {
		this.no_Of_Interviews = no_Of_Interviews;
	}
	public String getProfile_Image() {
		return profile_Image;
	}
	public void setProfile_Image(String profile_Image) {
		this.profile_Image = profile_Image;
	}
	public Interviewer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Interviewer(String emailid, String username, String primary_Skill, String secondary_Skill,
			String tertiary_Skill, String round_Alloted, int no_Of_Interviews, String profile_Image,
			Boolean is_Active) {
		super();
		this.emailid = emailid;
		this.username = username;
		this.primary_Skill = primary_Skill;
		this.secondary_Skill = secondary_Skill;
		this.tertiary_Skill = tertiary_Skill;
		this.round_Alloted = round_Alloted;
		this.no_Of_Interviews = no_Of_Interviews;
		this.profile_Image = profile_Image;
		
	}
	@Override
	public String toString() {
		return "Interviewer [emailid=" + emailid + ", username=" + username + ", primary_Skill=" + primary_Skill
				+ ", secondary_Skill=" + secondary_Skill + ", tertiary_Skill=" + tertiary_Skill + ", round_Alloted="
				+ round_Alloted + ", no_Of_Interviews=" + no_Of_Interviews + ", profile_Image=" + profile_Image
				+ "";
	}
	
	

}
