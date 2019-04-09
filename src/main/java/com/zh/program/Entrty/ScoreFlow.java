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
@Table(name = "score_flow")
@Data
public class ScoreFlow implements Serializable{

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
     * 操作类型
     */
    private Integer operType;
    /**
     * 操作人ID
     */
    private Integer operId;
    /**
     * 操作积分
     */
    private BigDecimal amount;
    /**
     * 操作后积分
     */
    private BigDecimal resultAmount;
    /**
     * 积分过期时间
     */
    private Date endTime;
    /**
     * 状态 0有效 1过期
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
        return "ScoreFlow{" +
        ", id=" + id +
        ", userId=" + userId +
        ", operType=" + operType +
        ", operId=" + operId +
        ", amount=" + amount +
        ", resultAmount=" + resultAmount +
        ", endTime=" + endTime +
        ", state=" + state +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
