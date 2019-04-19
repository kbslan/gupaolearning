package com.gupaoedu.vip.pattren.prototype.homework;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author lanchao
 * @version 1.0
 * @Date 2019/4/19 14:38
 */
public class SongFormBean extends SongEntity implements Cloneable{
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
    private String extra1;
    private String extra2;
    private String extra3;
    private String extra4;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getCopyrightID() {
        return copyrightID;
    }

    @Override
    public void setCopyrightID(String copyrightID) {
        this.copyrightID = copyrightID;
    }

    @Override
    public Integer getSongId() {
        return songId;
    }

    @Override
    public void setSongId(Integer songId) {
        this.songId = songId;
    }

    @Override
    public Integer getPortal_id() {
        return portal_id;
    }

    @Override
    public void setPortal_id(Integer portal_id) {
        this.portal_id = portal_id;
    }

    @Override
    public Integer getSongUserId() {
        return songUserId;
    }

    @Override
    public void setSongUserId(Integer songUserId) {
        this.songUserId = songUserId;
    }

    @Override
    public String getSongName() {
        return songName;
    }

    @Override
    public void setSongName(String songName) {
        this.songName = songName;
    }

    @Override
    public String getSingerName() {
        return singerName;
    }

    @Override
    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    @Override
    public String getAlbumName() {
        return albumName;
    }

    @Override
    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    @Override
    public Date getSongCreateTime() {
        return songCreateTime;
    }

    @Override
    public void setSongCreateTime(Date songCreateTime) {
        this.songCreateTime = songCreateTime;
    }

    @Override
    public Date getSongUpdateTime() {
        return songUpdateTime;
    }

    @Override
    public void setSongUpdateTime(Date songUpdateTime) {
        this.songUpdateTime = songUpdateTime;
    }

    @Override
    public Integer getSongStatus() {
        return songStatus;
    }

    @Override
    public void setSongStatus(Integer songStatus) {
        this.songStatus = songStatus;
    }

    @Override
    public Integer getSongShare() {
        return songShare;
    }

    @Override
    public void setSongShare(Integer songShare) {
        this.songShare = songShare;
    }

    @Override
    public Integer getSongSort() {
        return songSort;
    }

    @Override
    public void setSongSort(Integer songSort) {
        this.songSort = songSort;
    }

    @Override
    public String getMvCopyrghtId() {
        return mvCopyrghtId;
    }

    @Override
    public void setMvCopyrghtId(String mvCopyrghtId) {
        this.mvCopyrghtId = mvCopyrghtId;
    }

    @Override
    public List<String> getSingerArea() {
        return singerArea;
    }

    @Override
    public void setSingerArea(List<String> singerArea) {
        this.singerArea = singerArea;
    }

    public String getExtra1() {
        return extra1;
    }

    public void setExtra1(String extra1) {
        this.extra1 = extra1;
    }

    public String getExtra2() {
        return extra2;
    }

    public void setExtra2(String extra2) {
        this.extra2 = extra2;
    }

    public String getExtra3() {
        return extra3;
    }

    public void setExtra3(String extra3) {
        this.extra3 = extra3;
    }

    public String getExtra4() {
        return extra4;
    }

    public void setExtra4(String extra4) {
        this.extra4 = extra4;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        ByteOutputStream bos = new ByteOutputStream();
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            ByteInputStream bis = new ByteInputStream(bos.getBytes(),0,bos.getCount());
            ois = new ObjectInputStream(bis);
            return (SongEntity)ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(ois !=null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(oos!=null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    public static SongFormBean getDefault() {
        SongFormBean formBean = new SongFormBean();
        formBean.setId(123);
        formBean.setCopyrightID("版权ID");
        formBean.setSongId(456);
        formBean.setPortal_id(2019);
        formBean.setSongUserId(789);
        formBean.setSingerName("周杰伦");
        formBean.setAlbumName("七里香");
        formBean.setSongCreateTime(new Date());
        formBean.setSongStatus(1);
        formBean.setMvCopyrghtId("MV20190419145208CP");
        formBean.setExtra1("额外信息1");
        formBean.setExtra2("额外信息2");
        formBean.setExtra3("额外信息3");
        formBean.setExtra4("额外信息4");
        formBean.setSingerArea(Arrays.asList("大陆","香港","台湾","澳门"));
        return formBean;
    }

    @Override
    public String toString() {
        return "SongFormBean{" +
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
                ", extra1='" + extra1 + '\'' +
                ", extra2='" + extra2 + '\'' +
                ", extra3='" + extra3 + '\'' +
                ", extra4='" + extra4 + '\'' +
                '}';
    }
}
