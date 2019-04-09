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
 * @since 2019-04-08
 */
@Entity
@Table(name = "coupon_user")
@Data
public class CouponUser implements Serializable{

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
     * 优惠券ID
     */
    private Integer couponId;
    /**
     * 开始时间
     */
    private Date startTime;
    /**
     * 失效时间
     */
    private Date endTime;
    /**
     * 状态 0未使用 1已使用 2已过期
     */
    private Integer state;
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
        return "CouponUser{" +
        ", id=" + id +
        ", userId=" + userId +
        ", couponId=" + couponId +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", state=" + state +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
