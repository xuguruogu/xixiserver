package com.xuguruogu.lingxi.dal.dataobject;

import java.util.Date;

/**
 * @author kent
 *
 */
public class LxMSGDO extends Entity {

    /**  */
    private static final long serialVersionUID = -2580129251406218993L;

    /** 创建时间 */
    private Date              gmtCreated;

    /** 处理时间 */
    private Date              gmtHandled;

    /** 用户 */
    private long              userId;

    /** 朋友 */
    private long              friendId;

    /** 内容 */
    private String            content;

    /** 状态 */
    private String            status;

    /**
     * Getter method for property <tt>userId</tt>.
     * 
     * @return property value of userId
     */
    public long getUserId() {
        return userId;
    }

    /**
     * Setter method for property <tt>userId</tt>.
     * 
     * @param userId value to be assigned to property userId
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }

    /**
     * Getter method for property <tt>gmtCreated</tt>.
     * 
     * @return property value of gmtCreated
     */
    public Date getGmtCreated() {
        return gmtCreated;
    }

    /**
     * Setter method for property <tt>gmtCreated</tt>.
     * 
     * @param gmtCreated value to be assigned to property gmtCreated
     */
    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    /**
     * Getter method for property <tt>gmtHandled</tt>.
     * 
     * @return property value of gmtHandled
     */
    public Date getGmtHandled() {
        return gmtHandled;
    }

    /**
     * Setter method for property <tt>gmtHandled</tt>.
     * 
     * @param gmtHandled value to be assigned to property gmtHandled
     */
    public void setGmtHandled(Date gmtHandled) {
        this.gmtHandled = gmtHandled;
    }

    /**
     * Getter method for property <tt>friendId</tt>.
     * 
     * @return property value of friendId
     */
    public long getFriendId() {
        return friendId;
    }

    /**
     * Setter method for property <tt>friendId</tt>.
     * 
     * @param friendId value to be assigned to property friendId
     */
    public void setFriendId(long friendId) {
        this.friendId = friendId;
    }

    /**
     * Getter method for property <tt>content</tt>.
     * 
     * @return property value of content
     */
    public String getContent() {
        return content;
    }

    /**
     * Setter method for property <tt>content</tt>.
     * 
     * @param content value to be assigned to property content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Getter method for property <tt>status</tt>.
     * 
     * @return property value of status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Setter method for property <tt>status</tt>.
     * 
     * @param status value to be assigned to property status
     */
    public void setStatus(String status) {
        this.status = status;
    }

}
