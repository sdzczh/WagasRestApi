package com.zh.program.Entrty;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "coupon_info")
@Data
public class CouponInfo implements Serializable {
    private static final long serialVersionUID = 533211963722553104L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer couponId;

    private String title;

    private String desc;

    private String rules;

    private String showImgUrl;

    private String infoImgUrl;

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
        sb.append(", couponId=").append(couponId);
        sb.append(", title=").append(title);
        sb.append(", desc=").append(desc);
        sb.append(", rules=").append(rules);
        sb.append(", showImgUrl=").append(showImgUrl);
        sb.append(", infoImgUrl=").append(infoImgUrl);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}