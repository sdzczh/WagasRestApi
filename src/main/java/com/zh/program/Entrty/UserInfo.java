package com.zh.program.Entrty;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Table(name = "user_info")
public class UserInfo implements Serializable {
    private static final long serialVersionUID = -7376704816488022537L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer userId;

    private String city;

    private String phone;

    private String email;

    private Byte interest;

    private Date birthday;

    private String nickName;

    private Integer sex;

    private String headImgUrl;

    private Date createTime;

    private Date updateTime;


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", city=").append(city);
        sb.append(", phone=").append(phone);
        sb.append(", email=").append(email);
        sb.append(", interest=").append(interest);
        sb.append(", birthday=").append(birthday);
        sb.append(", nickName=").append(nickName);
        sb.append(", sex=").append(sex);
        sb.append(", headImgUrl=").append(headImgUrl);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}