package com.zh.program.Entrty;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "wallet_record")
@Data
@Entity
public class WalletRecord implements Serializable {
    private static final long serialVersionUID = -5421163085314757122L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer userId;

    private Byte type;

    private String orderNumber;

    private BigDecimal amount;

    private BigDecimal accBalance;

    private Integer score;

    private Date createTime;

    private Date updateTime;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", type=").append(type);
        sb.append(", orderNumber=").append(orderNumber);
        sb.append(", amount=").append(amount);
        sb.append(", accBalance=").append(accBalance);
        sb.append(", score=").append(score);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}