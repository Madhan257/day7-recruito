package com.example.demo.Entity;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="Employee")
public class StudentEntity {
	@Id
	private int eid;
	private String efname;
	private String elname;
	private String email;
	private long mobile;
	private String address;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEfname() {
		return efname;
	}
	public void setEfname(String efname) {
		this.efname = efname;
	}
	public String getElname() {
		return elname;
	}
	public void setElname(String elname) {
		this.elname = elname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public StudentEntity(int eid, String efname, String elname, String email, long mobile, String address) {
		super();
		this.eid = eid;
		this.efname = efname;
		this.elname = elname;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
	}
    public StudentEntity() {
    }
	public String toString() {
		return "eid= "+eid+"efname= "+efname+"elname= "+elname+"email= "+email+"mobile= "+mobile+"address= "+address;
	}
}