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
@Table(name = "score")
@Data
public class Score implements Serializable {

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
     * 用户级别
     */
    private Integer level;
    /**
     * 可用积分
     */
    private BigDecimal availBalance;
    /**
     * 冻结积分
     */
    private BigDecimal frozenBalance;
    /**
     * 累计积分
     */
    private BigDecimal addBalance;
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
        return "Score{" +
        ", id=" + id +
        ", userId=" + userId +
        ", level=" + level +
        ", availBalance=" + availBalance +
        ", frozenBalance=" + frozenBalance +
        ", addBalance=" + addBalance +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
