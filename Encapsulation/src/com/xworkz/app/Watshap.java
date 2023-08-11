package com.xworkz.app;

public class Watshap {

	private String profile;
	private long number;
	private String image;
	private int date;
	private String noofmsg;
	private int documents;
	private String downloads;
	private int rating;
	private boolean isuseful;
	private String status;
	private String color;
	private String vediocall;
	private String cameraclarity;
	private int noofcontacts;
	
	public String getprofile() {
		System.out.println("watshap profile :"+this.profile);
		return profile; 
	}
	public void setprofile(String profile) {
		this.profile=profile;
	}
	
	public long getnumber() {
		System.out.println("watshap number :"+this.number);
		return number;
	}
	public void setnumber(long number) {
		this.number=number;
	}
	
	public String getimage() {
		System.out.println("watshap image :"+this.image);
		return image;
	}
	public void setimage(String image) {
		this.image=image;
	}
	
	public int getdate() {
		return date;
	}
	
	public void setdate(int date) {
		this.date=date;
	}
	
	public String getnoofmsg() {
		return noofmsg;
	}
	public void setnoofmsg(String noofmsg) {
		this.noofmsg=noofmsg;
	}
	
	public int getdocuments() {
		return documents;
	}
	public void setdocuments(int documents) {
		this.documents=documents;
	}
	
	public String getdownloads() {
		return downloads;
	}
	public void setdownloads(String downloads) {
		this.downloads=downloads;
	}
	
	public int getrating() {
		return rating;
	}
	public void setrating(int rating) {
		this.rating=rating;
	}
	
	public boolean getisuseful() {
		return isuseful;
	}
	public void setisuseful(boolean isuseful) {
		this.isuseful=isuseful;
	}
	
	public String getstatus() {
		return status;
	}
	public void setstatus(String status) {
		this.status=status;
	}
	
	public String getcolor() {
		return color;
	}
	public void setcolor(String color) {
		this.color=color;
	}
	
	public String getvediocall() {
		return vediocall;
	}
	public void setvediocall(String vediocall) {
		this.vediocall=vediocall;
	}
	
	public String getcameraclarity() {
		return cameraclarity;
	}
	public void setcameraclarity(String cameraclarity) {
		this.cameraclarity=cameraclarity;
	}
	
	public int getnoofcontacts() {
		return noofcontacts;
	}
	public void setnoofcontacts(int noofcontacts) {
		this.noofcontacts=noofcontacts;
	}
}
