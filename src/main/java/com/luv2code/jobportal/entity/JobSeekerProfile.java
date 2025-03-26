package com.luv2code.jobportal.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "job_seeker_profile")
public class JobSeekerProfile {
   @Id
   private int userAccountId;

   @OneToOne
   @JoinColumn(name="user_account_id")
   @MapsId
   private Users userid;

   private String firstName;
   private String lastName;
   private String city;
   private String state;
   private String Country;
   private String workAuthorization;
   private String employmentType;
   private String resume;

   @Column(nullable = true, length = 64)
   private String profilePhoto;

   @OneToMany(targetEntity = Skills.class, cascade = CascadeType.ALL,
           mappedBy = "jobSeekerProfile")
   private List<Skills> skills;

    public JobSeekerProfile() {
    }

    public JobSeekerProfile(int userAccountId, Users userid, String firstName,
                            String lastName, String city, String state,
                            String country, String workAuthorization, String employmentType,
                            String resume, String profilePhoto, List<Skills> skills) {
        this.userAccountId = userAccountId;
        this.userid = userid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        Country = country;
        this.workAuthorization = workAuthorization;
        this.employmentType = employmentType;
        this.resume = resume;
        this.profilePhoto = profilePhoto;
        this.skills = skills;
    }

    public JobSeekerProfile(Users users) {
        this.userid = users;
    }

    public int getUserAccountId() {
        return userAccountId;
    }

    public void setUserAccountId(int userAccountId) {
        this.userAccountId = userAccountId;
    }

    public Users getUserid() {
        return userid;
    }

    public void setUserid(Users userid) {
        this.userid = userid;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getWorkAuthorization() {
        return workAuthorization;
    }

    public void setWorkAuthorization(String workAuthorization) {
        this.workAuthorization = workAuthorization;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public List<Skills> getSkills() {
        return skills;
    }

    public void setSkills(List<Skills> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "JobSeekerProfile{" +
                "userAccountId=" + userAccountId +
                ", userid=" + userid +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", Country='" + Country + '\'' +
                ", workAuthorization='" + workAuthorization + '\'' +
                ", employmentType='" + employmentType + '\'' +
                ", resume='" + resume + '\'' +
                ", profilePhoto='" + profilePhoto + '\'' +
                ", skills=" + skills +
                '}';
    }
}
