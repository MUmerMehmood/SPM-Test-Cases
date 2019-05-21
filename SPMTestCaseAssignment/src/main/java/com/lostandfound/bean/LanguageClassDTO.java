package com.lostandfound.bean;

public class LanguageClassDTO {
	
	private long id;
	private String languageName;
	private String languageCountry;
	
	public LanguageClassDTO () {
		super();
	}

	public LanguageClassDTO(long id, String languageName, String languageCountry) {
		super();
		this.id = id;
		this.languageName = languageName;
		this.languageCountry = languageCountry;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLanguageName() {
		return languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	public String getLanguageCountry() {
		return languageCountry;
	}

	public void setLanguageCountry(String languageCountry) {
		this.languageCountry = languageCountry;
	}
	
	

}
