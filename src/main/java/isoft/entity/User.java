package isoft.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class User implements Serializable {
   private  Integer id;
   private String name;
   private  String password;
   private Date  regDatetime;
   private  Integer status;
   private String photoUrl;
   private List<Comment> comment;
    public User(){
    }

    public User(Integer id, String name, String password, Date regDatetime, Integer status, String photoUrl, List<Comment> comment) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.regDatetime = regDatetime;
        this.status = status;
        this.photoUrl = photoUrl;
        this.comment = comment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRegDatetime() {
        return regDatetime;
    }

    public void setRegDatetime(Date regDatetime) {
        this.regDatetime = regDatetime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public List<Comment> getCommentList() {
        return comment;
    }

    public void setCommentList(List<Comment> commentList) {
        this.comment = comment;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", regDatetime=" + regDatetime +
                ", status=" + status +
                ", photoUrl='" + photoUrl + '\'' +
                ", comment=" + comment +
                '}';
    }
}
