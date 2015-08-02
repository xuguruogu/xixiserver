package com.xuguruogu.lingxi.dal.enums;

public enum PostStatusType {

    ACTIVE("active", "正常"),

    STICK("stick", "置顶"),

    FORBIDDEN("forbidden", "屏蔽");

    /** 码值 */
    private final String code;

    /** 描述 */
    private final String desc;

    private PostStatusType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * Getter method for property <tt>code</tt>.
     * 
     * @return property value of code
     */
    public String getCode() {
        return code;
    }

    /**
     * Getter method for property <tt>desc</tt>.
     * 
     * @return property value of desc
     */
    public String getDesc() {
        return desc;
    }

}