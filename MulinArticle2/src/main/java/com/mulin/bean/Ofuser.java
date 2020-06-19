package com.mulin.bean;

public class Ofuser {
    private String username;

    private String plainpassword;

    private String encryptedpassword;

    private String name;

    private String email;

    private String creationdate;

    private String modificationdate;

    private String storedkey;

    private String serverkey;

    private String salt;

    private Integer iterations;

    private String headimage;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPlainpassword() {
        return plainpassword;
    }

    public void setPlainpassword(String plainpassword) {
        this.plainpassword = plainpassword == null ? null : plainpassword.trim();
    }

    public String getEncryptedpassword() {
        return encryptedpassword;
    }

    public void setEncryptedpassword(String encryptedpassword) {
        this.encryptedpassword = encryptedpassword == null ? null : encryptedpassword.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(String creationdate) {
        this.creationdate = creationdate == null ? null : creationdate.trim();
    }

    public String getModificationdate() {
        return modificationdate;
    }

    public void setModificationdate(String modificationdate) {
        this.modificationdate = modificationdate == null ? null : modificationdate.trim();
    }

    public String getStoredkey() {
        return storedkey;
    }

    public void setStoredkey(String storedkey) {
        this.storedkey = storedkey == null ? null : storedkey.trim();
    }

    public String getServerkey() {
        return serverkey;
    }

    public void setServerkey(String serverkey) {
        this.serverkey = serverkey == null ? null : serverkey.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public Integer getIterations() {
        return iterations;
    }

    public void setIterations(Integer iterations) {
        this.iterations = iterations;
    }

    public String getHeadimage() {
        return headimage;
    }

    public void setHeadimage(String headimage) {
        this.headimage = headimage == null ? null : headimage.trim();
    }

	@Override
	public String toString() {
		return "Ofuser [username=" + username + ", plainpassword=" + plainpassword + ", encryptedpassword="
				+ encryptedpassword + ", name=" + name + ", email=" + email + ", creationdate=" + creationdate
				+ ", modificationdate=" + modificationdate + ", storedkey=" + storedkey + ", serverkey=" + serverkey
				+ ", salt=" + salt + ", iterations=" + iterations + ", headimage=" + headimage + "]";
	}
    
}