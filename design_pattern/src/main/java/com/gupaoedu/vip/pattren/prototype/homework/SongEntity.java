package com.gupaoedu.vip.pattren.prototype.homework;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class SongEntity implements Serializable {
	private static final long serialVersionUID = -3728646576964049413L;
	private Integer id;
	private String copyrightID;
	private Integer songId;
	private Integer portal_id;
	private Integer songUserId;
	private String songName;
	private String singerName;
	private String albumName;
	private Date songCreateTime;
	private Date songUpdateTime;
	private Integer songStatus;
	private Integer songShare;
	private Integer songSort;
	private String mvCopyrghtId;
	private List<String> singerArea;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCopyrightID() {
		return copyrightID;
	}

	public void setCopyrightID(String copyrightID) {
		this.copyrightID = copyrightID;
	}

	public Integer getSongId() {
		return songId;
	}

	public void setSongId(Integer songId) {
		this.songId = songId;
	}

	public Integer getPortal_id() {
		return portal_id;
	}

	public void setPortal_id(Integer portal_id) {
		this.portal_id = portal_id;
	}

	public Integer getSongUserId() {
		return songUserId;
	}

	public void setSongUserId(Integer songUserId) {
		this.songUserId = songUserId;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getSingerName() {
		return singerName;
	}

	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public Date getSongCreateTime() {
		return songCreateTime;
	}

	public void setSongCreateTime(Date songCreateTime) {
		this.songCreateTime = songCreateTime;
	}

	public Date getSongUpdateTime() {
		return songUpdateTime;
	}

	public void setSongUpdateTime(Date songUpdateTime) {
		this.songUpdateTime = songUpdateTime;
	}

	public Integer getSongStatus() {
		return songStatus;
	}

	public void setSongStatus(Integer songStatus) {
		this.songStatus = songStatus;
	}

	public Integer getSongShare() {
		return songShare;
	}

	public void setSongShare(Integer songShare) {
		this.songShare = songShare;
	}

	public Integer getSongSort() {
		return songSort;
	}

	public void setSongSort(Integer songSort) {
		this.songSort = songSort;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getMvCopyrghtId() {
		return mvCopyrghtId;
	}

	public void setMvCopyrghtId(String mvCopyrghtId) {
		this.mvCopyrghtId = mvCopyrghtId;
	}

	public List<String> getSingerArea() {
		return singerArea;
	}

	public void setSingerArea(List<String> singerArea) {
		this.singerArea = singerArea;
	}

	@Override
	public String toString() {
		return "SongEntity{" +
				"id=" + id +
				", copyrightID='" + copyrightID + '\'' +
				", songId=" + songId +
				", portal_id=" + portal_id +
				", songUserId=" + songUserId +
				", songName='" + songName + '\'' +
				", singerName='" + singerName + '\'' +
				", albumName='" + albumName + '\'' +
				", songCreateTime=" + songCreateTime +
				", songUpdateTime=" + songUpdateTime +
				", songStatus=" + songStatus +
				", songShare=" + songShare +
				", songSort=" + songSort +
				", mvCopyrghtId='" + mvCopyrghtId + '\'' +
				", singerArea=" + singerArea +
				'}';
	}
}
