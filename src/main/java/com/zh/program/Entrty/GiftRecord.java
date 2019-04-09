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
@Table(name = "gift_record")
@Data
public class GiftRecord implements Serializable {

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
     * 接受方ID
     */
    private Integer acceptId;
    /**
     * 礼物ID
     */
    private Integer gId;
    /**
     * 状态 0未领取 1已领取 2已退回
     */
    private Integer state;
    /**
     * 留言
     */
    private String message;
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
        return "GiftRecord{" +
        ", id=" + id +
        ", userId=" + userId +
        ", acceptId=" + acceptId +
        ", gId=" + gId +
        ", state=" + state +
        ", message=" + message +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
