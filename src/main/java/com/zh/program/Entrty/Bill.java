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
@Table(name = "bill")
@Data
public class Bill implements Serializable {

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
     * 操作类型 0钱包 1优惠券 2活动 3礼物
     */
    private Integer type;
    /**
     * 操作数值
     */
    private BigDecimal amount;
    /**
     * 操作后数值
     */
    private BigDecimal accAmount;
    /**
     * 备注
     */
    private String remark;
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
        return "Bill{" +
        ", id=" + id +
        ", userId=" + userId +
        ", type=" + type +
        ", amount=" + amount +
        ", accAmount=" + accAmount +
        ", remark=" + remark +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
