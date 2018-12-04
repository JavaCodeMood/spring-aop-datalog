package com.lhf.aop.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName: Changeltem
 * @Description:
 * @Author: liuhefei
 * @Date: 2018/12/4
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
/*@Setter
@Getter*/
public class ChangeItem {
    private String field;   //字段

    private String fieldShowName;  //字段中文名

    private String oldValue;  //旧值

    private String newValue;  //新值

    public String getFieldShowName() {
        return fieldShowName;
    }

    public void setFieldShowName(String fieldShowName) {
        this.fieldShowName = fieldShowName;
    }

    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }

    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}

