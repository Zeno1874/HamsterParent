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
 * 仓鼠用品表
 * @TableName TblHamsterProduct
 */
@TableName(value ="TblHamsterProduct")
@Data
public class HamsterProductDo extends HamsterParentApplication implements Serializable {
    /**
     * 产品ID
     */
    @TableId(value = "product_id", type = IdType.AUTO)
    private Long product_id;

    /**
     * 产品UUID
     */
    @TableField(value = "product_uuid")
    private String product_uuid;

    /**
     * 产品名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 产品类别
     */
    @TableField(value = "category")
    private String category;

    /**
     * 产品价格(元)
     */
    @TableField(value = "price")
    private BigDecimal price;

    /**
     * 库存数量
     */
    @TableField(value = "stock_quantity")
    private Integer stock_quantity;

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
        HamsterProductDo other = (HamsterProductDo) that;
        return (this.getProduct_id() == null ? other.getProduct_id() == null : this.getProduct_id().equals(other.getProduct_id()))
            && (this.getProduct_uuid() == null ? other.getProduct_uuid() == null : this.getProduct_uuid().equals(other.getProduct_uuid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCategory() == null ? other.getCategory() == null : this.getCategory().equals(other.getCategory()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getStock_quantity() == null ? other.getStock_quantity() == null : this.getStock_quantity().equals(other.getStock_quantity()))
            && (this.getCreated_at() == null ? other.getCreated_at() == null : this.getCreated_at().equals(other.getCreated_at()))
            && (this.getUpdated_at() == null ? other.getUpdated_at() == null : this.getUpdated_at().equals(other.getUpdated_at()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProduct_id() == null) ? 0 : getProduct_id().hashCode());
        result = prime * result + ((getProduct_uuid() == null) ? 0 : getProduct_uuid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCategory() == null) ? 0 : getCategory().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getStock_quantity() == null) ? 0 : getStock_quantity().hashCode());
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
        sb.append(", product_id=").append(product_id);
        sb.append(", product_uuid=").append(product_uuid);
        sb.append(", name=").append(name);
        sb.append(", category=").append(category);
        sb.append(", price=").append(price);
        sb.append(", stock_quantity=").append(stock_quantity);
        sb.append(", created_at=").append(created_at);
        sb.append(", updated_at=").append(updated_at);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}