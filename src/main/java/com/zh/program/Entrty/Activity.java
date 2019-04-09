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
@Table(name = "activity")
@Data
public class Activity implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 活动描述
     */
    private String desc;
    /**
     * 目标商品数量
     */
    private BigDecimal aimNumber;
    /**
     * 赠送数量
     */
    private BigDecimal giveNumber;
    /**
     * 状态 0关闭 1开启
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
        return "Activity{" +
        ", id=" + id +
        ", goodsName=" + goodsName +
        ", desc=" + desc +
        ", aimNumber=" + aimNumber +
        ", giveNumber=" + giveNumber +
        ", state=" + state +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
