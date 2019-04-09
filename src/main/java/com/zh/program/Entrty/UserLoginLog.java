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
@Table(name = "user_login_log")
@Data
public class UserLoginLog implements Serializable{

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
     * 是否成功 0失败 1成功
     */
    private Integer succeed;
    /**
     * IP
     */
    private String ip;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;


    @Override
    public String toString() {
        return "UserLoginLog{" +
        ", id=" + id +
        ", userId=" + userId +
        ", succeed=" + succeed +
        ", ip=" + ip +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
