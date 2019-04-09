package com.zh.program.Entrty;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "gift")
@Data
public class Gift implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * 礼物名称
     */
    private String giftName;
    /**
     * 图片url
     */
    private String imgUrl;
    /**
     * 类型 0礼物卡 1美食
     */
    private Integer type;
    /**
     * 价格
     */
    private BigDecimal price;
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
        return "Gift{" +
        ", id=" + id +
        ", giftName=" + giftName +
        ", imgUrl=" + imgUrl +
        ", type=" + type +
        ", price=" + price +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
