package com.zh.program.Entrty;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "user_login_log")
@Data
public class UserLoginLog implements Serializable {
    private static final long serialVersionUID = -7919523432172209922L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer userId;

    private Boolean succeed;

    private String ip;

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
        sb.append(", succeed=").append(succeed);
        sb.append(", ip=").append(ip);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}