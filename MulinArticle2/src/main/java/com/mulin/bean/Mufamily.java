package com.mulin.bean;

import java.util.List;

public class Mufamily {
    private String name;

    private String familytype;

    private String nickname;

    private String tags;

    private String creationdate;

    private String icon;

    private String communityid;

    private String address;

    private String fid;

    private Integer isspecial;

    private Integer openOnly10;
    
    private List<Mufamilyuser> mufamilyusers;
    
    
    public List<Mufamilyuser> getMufamilyusers() {
		return mufamilyusers;
	}

	public void setMufamilyusers(List<Mufamilyuser> mufamilyusers) {
		this.mufamilyusers = mufamilyusers;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getFamilytype() {
        return familytype;
    }

    public void setFamilytype(String familytype) {
        this.familytype = familytype == null ? null : familytype.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    public String getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(String creationdate) {
        this.creationdate = creationdate == null ? null : creationdate.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getCommunityid() {
        return communityid;
    }

    public void setCommunityid(String communityid) {
        this.communityid = communityid == null ? null : communityid.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid == null ? null : fid.trim();
    }

    public Integer getIsspecial() {
        return isspecial;
    }

    public void setIsspecial(Integer isspecial) {
        this.isspecial = isspecial;
    }

    public Integer getOpenOnly10() {
        return openOnly10;
    }

    public void setOpenOnly10(Integer openOnly10) {
        this.openOnly10 = openOnly10;
    }
}