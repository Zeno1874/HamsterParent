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
 * 喂养记录表
 * @TableName TblFeedingRecord
 */
@TableName(value ="TblFeedingRecord")
@Data
public class FeedingRecordDo extends HamsterParentApplication implements Serializable {
    /**
     * 喂养记录ID
     */
    @TableId(value = "feeding_id", type = IdType.AUTO)
    private Long feeding_id;

    /**
     * 喂养UUID
     */
    @TableField(value = "feeding_uuid")
    private String feeding_uuid;

    /**
     * 仓鼠UUID
     */
    @TableField(value = "hamster_uuid")
    private String hamster_uuid;

    /**
     * 喂养时间
     */
    @TableField(value = "feed_time")
    private LocalDateTime feed_time;

    /**
     * 食物类型
     */
    @TableField(value = "food_type")
    private String food_type;

    /**
     * 食物数量
     */
    @TableField(value = "quantity")
    private BigDecimal quantity;

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
        FeedingRecordDo other = (FeedingRecordDo) that;
        return (this.getFeeding_id() == null ? other.getFeeding_id() == null : this.getFeeding_id().equals(other.getFeeding_id()))
            && (this.getFeeding_uuid() == null ? other.getFeeding_uuid() == null : this.getFeeding_uuid().equals(other.getFeeding_uuid()))
            && (this.getHamster_uuid() == null ? other.getHamster_uuid() == null : this.getHamster_uuid().equals(other.getHamster_uuid()))
            && (this.getFeed_time() == null ? other.getFeed_time() == null : this.getFeed_time().equals(other.getFeed_time()))
            && (this.getFood_type() == null ? other.getFood_type() == null : this.getFood_type().equals(other.getFood_type()))
            && (this.getQuantity() == null ? other.getQuantity() == null : this.getQuantity().equals(other.getQuantity()))
            && (this.getCreated_at() == null ? other.getCreated_at() == null : this.getCreated_at().equals(other.getCreated_at()))
            && (this.getUpdated_at() == null ? other.getUpdated_at() == null : this.getUpdated_at().equals(other.getUpdated_at()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFeeding_id() == null) ? 0 : getFeeding_id().hashCode());
        result = prime * result + ((getFeeding_uuid() == null) ? 0 : getFeeding_uuid().hashCode());
        result = prime * result + ((getHamster_uuid() == null) ? 0 : getHamster_uuid().hashCode());
        result = prime * result + ((getFeed_time() == null) ? 0 : getFeed_time().hashCode());
        result = prime * result + ((getFood_type() == null) ? 0 : getFood_type().hashCode());
        result = prime * result + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
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
        sb.append(", feeding_id=").append(feeding_id);
        sb.append(", feeding_uuid=").append(feeding_uuid);
        sb.append(", hamster_uuid=").append(hamster_uuid);
        sb.append(", feed_time=").append(feed_time);
        sb.append(", food_type=").append(food_type);
        sb.append(", quantity=").append(quantity);
        sb.append(", created_at=").append(created_at);
        sb.append(", updated_at=").append(updated_at);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}