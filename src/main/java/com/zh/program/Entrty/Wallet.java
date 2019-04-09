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
@Table(name = "wallet")
@Data
public class Wallet implements Serializable {

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
     * 会员卡编号
     */
    private String walletNumber;
    /**
     * 可用金额
     */
    private BigDecimal availBalance;
    /**
     * 冻结金额
     */
    private BigDecimal frozenBalance;
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
        return "Wallet{" +
        ", id=" + id +
        ", userId=" + userId +
        ", walletNumber=" + walletNumber +
        ", availBalance=" + availBalance +
        ", frozenBalance=" + frozenBalance +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
