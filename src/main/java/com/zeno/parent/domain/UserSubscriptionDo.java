package com.zeno.parent.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zeno.parent.HamsterParentApplication;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 用户订阅表
 * @TableName TblUserSubscription
 */
@TableName(value ="TblUserSubscription")
@Data
public class UserSubscriptionDo extends HamsterParentApplication implements Serializable {
    /**
     * 订阅ID
     */
    @TableId(value = "subscription_id", type = IdType.AUTO)
    private Long subscription_id;

    /**
     * 订阅UUID
     */
    @TableField(value = "subscription_uuid")
    private String subscription_uuid;

    /**
     * 用户UUID
     */
    @TableField(value = "user_uuid")
    private String user_uuid;

    /**
     * 订阅日期
     */
    @TableField(value = "subscription_date")
    private LocalDateTime subscription_date;

    /**
     * 订阅状态
     */
    @TableField(value = "status")
    private String status;

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
        UserSubscriptionDo other = (UserSubscriptionDo) that;
        return (this.getSubscription_id() == null ? other.getSubscription_id() == null : this.getSubscription_id().equals(other.getSubscription_id()))
            && (this.getSubscription_uuid() == null ? other.getSubscription_uuid() == null : this.getSubscription_uuid().equals(other.getSubscription_uuid()))
            && (this.getUser_uuid() == null ? other.getUser_uuid() == null : this.getUser_uuid().equals(other.getUser_uuid()))
            && (this.getSubscription_date() == null ? other.getSubscription_date() == null : this.getSubscription_date().equals(other.getSubscription_date()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreated_at() == null ? other.getCreated_at() == null : this.getCreated_at().equals(other.getCreated_at()))
            && (this.getUpdated_at() == null ? other.getUpdated_at() == null : this.getUpdated_at().equals(other.getUpdated_at()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSubscription_id() == null) ? 0 : getSubscription_id().hashCode());
        result = prime * result + ((getSubscription_uuid() == null) ? 0 : getSubscription_uuid().hashCode());
        result = prime * result + ((getUser_uuid() == null) ? 0 : getUser_uuid().hashCode());
        result = prime * result + ((getSubscription_date() == null) ? 0 : getSubscription_date().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
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
        sb.append(", subscription_id=").append(subscription_id);
        sb.append(", subscription_uuid=").append(subscription_uuid);
        sb.append(", user_uuid=").append(user_uuid);
        sb.append(", subscription_date=").append(subscription_date);
        sb.append(", status=").append(status);
        sb.append(", created_at=").append(created_at);
        sb.append(", updated_at=").append(updated_at);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}