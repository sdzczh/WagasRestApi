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
 * @since 2019-04-04
 */
@Entity
@Table(name = "wallet_record")
@Data
public class WalletRecord implements Serializable{

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
     * 类型 0储值卡 1礼物
     */
    private Integer type;
    /**
     * 订单号
     */
    private String orderNumber;
    /**
     * 金额
     */
    private BigDecimal amount;
    /**
     * 操作后金额
     */
    private BigDecimal accBalance;
    /**
     * 积分
     */
    private BigDecimal score;
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
        return "Record{" +
        ", id=" + id +
        ", userId=" + userId +
        ", type=" + type +
        ", orderNumber=" + orderNumber +
        ", amount=" + amount +
        ", accBalance=" + accBalance +
        ", score=" + score +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
