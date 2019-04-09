package com.zh.program.Entrty;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Table(name = "score_flow")
public class ScoreFlow implements Serializable {
    private static final long serialVersionUID = -5634269323202286098L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer userId;

    private Byte operType;

    private Integer operId;

    private Integer amount;

    private Integer resultAmount;

    private Date endTime;

    private Byte state;

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
        sb.append(", operType=").append(operType);
        sb.append(", operId=").append(operId);
        sb.append(", amount=").append(amount);
        sb.append(", resultAmount=").append(resultAmount);
        sb.append(", endTime=").append(endTime);
        sb.append(", state=").append(state);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}