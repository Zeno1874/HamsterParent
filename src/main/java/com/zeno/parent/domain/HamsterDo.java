package com.zeno.parent.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zeno.parent.HamsterParentApplication;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 仓鼠信息表
 * @TableName TblHamster
 */
@TableName(value ="TblHamster")
@Data
public class HamsterDo extends HamsterParentApplication implements Serializable {
    /**
     * 仓鼠ID
     */
    @TableId(value = "hamster_id", type = IdType.AUTO)
    private Long hamster_id;

    /**
     * 仓鼠UUID
     */
    @TableField(value = "hamster_uuid")
    private String hamster_uuid;

    /**
     * 名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 年龄
     */
    @TableField(value = "age")
    private Integer age;

    /**
     * 性别
     */
    @TableField(value = "gender")
    private String gender;

    /**
     * 种类
     */
    @TableField(value = "species")
    private String species;

    /**
     * 颜色
     */
    @TableField(value = "color")
    private String color;

    /**
     * 重量(克)
     */
    @TableField(value = "weight")
    private BigDecimal weight;

    /**
     * 价格(元)
     */
    @TableField(value = "price")
    private BigDecimal price;

    /**
     * 库存
     */
    @TableField(value = "inventory")
    private String inventory;

    /**
     * 创建时间
     */
    @TableField(value = "created_at")
    private LocalDateTime created_at;

    /**
     * 更新时间
     */
    @TableField(value = "updated_at")
    private LocalDateTime updated_at;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        HamsterDo other = (HamsterDo) that;
        return (this.getHamster_id() == null ? other.getHamster_id() == null : this.getHamster_id().equals(other.getHamster_id()))
            && (this.getHamster_uuid() == null ? other.getHamster_uuid() == null : this.getHamster_uuid().equals(other.getHamster_uuid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getSpecies() == null ? other.getSpecies() == null : this.getSpecies().equals(other.getSpecies()))
            && (this.getColor() == null ? other.getColor() == null : this.getColor().equals(other.getColor()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getInventory() == null ? other.getInventory() == null : this.getInventory().equals(other.getInventory()))
            && (this.getCreated_at() == null ? other.getCreated_at() == null : this.getCreated_at().equals(other.getCreated_at()))
            && (this.getUpdated_at() == null ? other.getUpdated_at() == null : this.getUpdated_at().equals(other.getUpdated_at()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHamster_id() == null) ? 0 : getHamster_id().hashCode());
        result = prime * result + ((getHamster_uuid() == null) ? 0 : getHamster_uuid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getSpecies() == null) ? 0 : getSpecies().hashCode());
        result = prime * result + ((getColor() == null) ? 0 : getColor().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getInventory() == null) ? 0 : getInventory().hashCode());
        result = prime * result + ((getCreated_at() == null) ? 0 : getCreated_at().hashCode());
        result = prime * result + ((getUpdated_at() == null) ? 0 : getUpdated_at().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hamster_id=").append(hamster_id);
        sb.append(", hamster_uuid=").append(hamster_uuid);
        sb.append(", name=").append(name);
        sb.append(", age=").append(age);
        sb.append(", gender=").append(gender);
        sb.append(", species=").append(species);
        sb.append(", color=").append(color);
        sb.append(", weight=").append(weight);
        sb.append(", price=").append(price);
        sb.append(", inventory=").append(inventory);
        sb.append(", created_at=").append(created_at);
        sb.append(", updated_at=").append(updated_at);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}