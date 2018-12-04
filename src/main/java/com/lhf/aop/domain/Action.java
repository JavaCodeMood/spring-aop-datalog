package com.lhf.aop.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName: Action
 * @Description:
 * @Author: liuhefei
 * @Date: 2018/12/4
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
//@Setter
//@Getter
public class Action {

    private String id;

    private Long objectId;   //对象id

    private String objectClass;  //对象类

    private String operator;   //操作者

    private Date operateTime;  //操作实际

    private ActionType actionType;  //操作类型

    private List<ChangeItem> changes = new ArrayList<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getObjectId() {
        return objectId;
    }

    public void setObjectId(Long objectId) {
        this.objectId = objectId;
    }

    public String getObjectClass() {
        return objectClass;
    }

    public void setObjectClass(String objectClass) {
        this.objectClass = objectClass;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Date getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public ActionType getActionType() {
        return actionType;
    }

    public void setActionType(ActionType actionType) {
        this.actionType = actionType;
    }

    public List<ChangeItem> getChanges() {
        return changes;
    }

    public void setChanges(List<ChangeItem> changes) {
        this.changes = changes;
    }

}
