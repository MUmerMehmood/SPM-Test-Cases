package com.lostandfound.bean;

import javax.persistence.Entity;

@Entity
public class Package {
	
	private long iD;
	private String pkgName;
	private String pkgLang;
	
	public Package() {
		super();
	}

	public Package(long iD, String pkgName, String pkgLang) {
		super();
		this.iD = iD;
		this.pkgName = pkgName;
		this.pkgLang = pkgLang;
	}

	public long getiD() {
		return iD;
	}

	public void setiD(long iD) {
		this.iD = iD;
	}

	public String getPkgName() {
		return pkgName;
	}

	public void setPkgName(String pkgName) {
		this.pkgName = pkgName;
	}

	public String getPkgLang() {
		return pkgLang;
	}

	public void setPkgLang(String pkgLang) {
		this.pkgLang = pkgLang;
	}
	
}
