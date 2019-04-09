package com.zh.program.Entrty;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "coupon")
@Data
public class Coupon implements Serializable {
    private static final long serialVersionUID = 2948314149009269937L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer score;

    private Byte level;

    private Integer amount;

    private Integer remain;

    private BigDecimal price;

    private Date effectiveTime;

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
        sb.append(", score=").append(score);
        sb.append(", level=").append(level);
        sb.append(", amount=").append(amount);
        sb.append(", remain=").append(remain);
        sb.append(", price=").append(price);
        sb.append(", effectiveTime=").append(effectiveTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}