package com.zh.program.Entrty;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Table(name = "score")
@Entity
public class Score implements Serializable {
    private static final long serialVersionUID = -6733028433979908629L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer userId;

    private Byte level;

    private Integer availBalance;

    private Integer frozenBalance;

    private Integer addBalance;

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
        sb.append(", level=").append(level);
        sb.append(", availBalance=").append(availBalance);
        sb.append(", frozenBalance=").append(frozenBalance);
        sb.append(", addBalance=").append(addBalance);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}