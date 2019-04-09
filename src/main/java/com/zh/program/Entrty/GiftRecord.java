package com.zh.program.Entrty;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "gift_record")
@Data
public class GiftRecord implements Serializable {
    private static final long serialVersionUID = 950935854700903659L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer userId;

    private Integer acceptId;

    private Integer gId;

    private Byte state;

    private Date createTime;

    private Date updateTime;

    private String message;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", acceptId=").append(acceptId);
        sb.append(", gId=").append(gId);
        sb.append(", state=").append(state);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", message=").append(message);
        sb.append("]");
        return sb.toString();
    }
}