package com.xworkz.app;

public class Instagram {
	   
	        private String username;
	        private String email;
	        private int password;
	        private String profilepicture;
	        private int followers;
	        private int following;
	        private int posts;
	        private String bio;
	        private String location;
	        private String website;
	        private boolean privateaccount;
	        private boolean verified;
	        private String last_active;

	    public void setusername(String username) {
	        this.username = username;
	    }
	    public String getusername(){
	    	System.out.println("instagram username : "+this.username);
	        return username;
	    }

	    public void setemail(String email) {
	        this.email = email;
	    }

	    public String getemail() {
	        return email;
	    }

	    public void setpassword(int password) {
	        this.password = password;
	    }

	    public int getpassword() {
	        return password;
	    }

	    public void setprofilepicture(String profilepicture) {
	        this.profilepicture = profilepicture;
	    }
	    public String getprofilepicture() {
	        return profilepicture;
	    }

	    public void  setfollowers( int followers) {
	        this.followers = followers;
	    }

	    public int getfollowers() {
	    	System.out.println("istagram follower :"+this.followers);
	        return followers;
	    } 
	    
	    public void setfollowing(int following) {
	        this.following = following;
	    }

	    public int getfollowing() {
	        return following;
	    }

	    public void setposts(int posts) {
	        this.posts = posts;
	    }

	    public  int getposts() {
	        return posts;
	    }
	    
	    public void setbio(String bio) {
	        this.bio = bio;
	    }

	    public String getbio() {
	        return bio;
	    }

	    public void setlocation(String location) {
	        this.location = location;
	    }

	    public String getlocation() {
	        return location;
	    }

	    public void setwebsite(String website) {
	        this.website = website;
	    }

	    public  String getwebsite() {
	        return website;
	    }

	    public void setprivateaccount(boolean privateaccount) {
	        this.privateaccount = privateaccount;
	    }

	    public boolean getprivateaccount() {
	        return privateaccount;
	    }

	    public void setverified(boolean verified) {
	        this.verified = verified;
	    }

	    public boolean getverified() {
	        return verified;
	    }

	    public void setlast_active(String last_active) {
	        this.last_active = last_active;
	    }

	    public String getlast_active() {
	        return last_active;
	    }

}