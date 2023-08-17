package com.akshithSpring.jobListing.Model;

import java.util.Arrays;

import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "JobPost")
public class Post {
	private String Profile;
	private String desc;
	private int exp;
	private String techs[];
	public String getProfile() {
		return Profile;
	}
	public void setProfile(String profile) {
		Profile = profile;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String[] getTechs() {
		return techs;
	}
	public void setTechs(String[] techs) {
		this.techs = techs;
	}
	public Post() {
		super();
	}
	@Override
	public String toString() {
		return "Post [Profile=" + Profile + ", desc=" + desc + ", exp=" + exp + ", techs=" + Arrays.toString(techs)
				+ "]";
	}
	
	
	
	
	
}
