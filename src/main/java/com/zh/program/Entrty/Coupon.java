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
@Table(name = "coupon")
@Data
public class Coupon implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * 所需积分
     */
    private BigDecimal score;
    /**
     * 所需等级
     */
    private Integer level;
    /**
     * 总量
     */
    private BigDecimal amount;
    /**
     * 剩余数量
     */
    private BigDecimal remain;
    /**
     * 单价
     */
    private BigDecimal price;
    /**
     * 有效期至
     */
    private Date effectiveTime;
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
        return "Coupon{" +
        ", id=" + id +
        ", score=" + score +
        ", level=" + level +
        ", amount=" + amount +
        ", remain=" + remain +
        ", price=" + price +
        ", effectiveTime=" + effectiveTime +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
