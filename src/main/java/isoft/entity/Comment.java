package isoft.entity;

import java.io.Serializable;
import java.util.Date;

public class Comment implements Serializable {
    private Integer id;
    private Integer newsid;
    private Integer userid;
    private String content;
    private Date addDatetime;


    public Comment(){
    }

    public Comment(Integer id, Integer newsid, Integer userid, String content, Date addDatetime) {
        this.id = id;
        this.newsid = newsid;
        this.userid = userid;
        this.content = content;
        this.addDatetime = addDatetime;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNewsid() {
        return newsid;
    }

    public void setNewsid(Integer newsid) {
        this.newsid = newsid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getAddDatetime() {
        return addDatetime;
    }

    public void setAddDatetime(Date addDatetime) {
        this.addDatetime = addDatetime;
    }



    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", newsid=" + newsid +
                ", userid=" + userid +
                ", content='" + content + '\'' +
                ", addDatetime=" + addDatetime +

                '}';
    }
}
