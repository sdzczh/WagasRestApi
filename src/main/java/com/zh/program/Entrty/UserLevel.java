package com.zh.program.Entrty;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhaohe
 * @since 2019-04-04
 */
@Entity
@Table(name = "user_level")
@Data
public class UserLevel implements  Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     * 会员等级名称
     */
    private String name;
    /**
     * 折扣系数
     */
    private BigDecimal discount;


    @Override
    public String toString() {
        return "UserLevel{" +
        ", id=" + id +
        ", name=" + name +
        ", discount=" + discount +
        "}";
    }
}
