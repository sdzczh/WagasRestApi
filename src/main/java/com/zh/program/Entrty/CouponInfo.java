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
@Table(name = "coupon_info")
@Data
public class CouponInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * 优惠券ID
     */
    private Integer couponId;
    /**
     * 名称
     */
    private String title;
    /**
     * 描述
     */
    private String desc;
    /**
     * 用法规则
     */
    private String rules;
    /**
     * 展示图片
     */
    private String showImgUrl;
    /**
     * 介绍图片
     */
    private String infoImgUrl;
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
        return "CouponInfo{" +
        ", id=" + id +
        ", couponId=" + couponId +
        ", title=" + title +
        ", desc=" + desc +
        ", rules=" + rules +
        ", showImgUrl=" + showImgUrl +
        ", infoImgUrl=" + infoImgUrl +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
