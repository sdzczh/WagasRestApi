package com.zh.program.Entrty;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhaohe
 * @since 2019-04-04
 */
@Entity
@Table(name = "user_info")
@Data
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 城市
     */
    private String city;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 电子邮箱
     */
    private String email;
    /**
     * 兴趣
     */
    private Integer interest;
    /**
     * 生日
     */
    private Date birthday;
    /**
     * 微信昵称
     */
    private String nickName;
    /**
     * 性别
     */
    private Integer sex;
    /**
     * 微信头像url
     */
    private String headImgUrl;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;

    @Override
    public String toString() {
        return "UserInfo{" +
        ", id=" + id +
        ", userId=" + userId +
        ", city=" + city +
        ", phone=" + phone +
        ", email=" + email +
        ", interest=" + interest +
        ", birthday=" + birthday +
        ", nickName=" + nickName +
        ", sex=" + sex +
        ", headImgUrl=" + headImgUrl +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
