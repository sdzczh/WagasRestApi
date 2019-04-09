package com.zh.program.Entrty;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "wallet")
public class Wallet implements Serializable {
    private static final long serialVersionUID = 4376397908557111417L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer userId;

    private String walletNumber;

    private BigDecimal availBalance;

    private BigDecimal frozenBalance;

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
        sb.append(", walletNumber=").append(walletNumber);
        sb.append(", availBalance=").append(availBalance);
        sb.append(", frozenBalance=").append(frozenBalance);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}