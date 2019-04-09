package com.zh.program.Entrty;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "gift")
@Data
public class Gift implements Serializable {
    private static final long serialVersionUID = 7074158935160535648L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String giftName;

    private String imgUrl;

    private Byte type;

    private BigDecimal price;

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
        sb.append(", giftName=").append(giftName);
        sb.append(", imgUrl=").append(imgUrl);
        sb.append(", type=").append(type);
        sb.append(", price=").append(price);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}