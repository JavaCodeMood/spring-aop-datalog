package com.lhf.aop.datalog;

import com.lhf.aop.domain.Action;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @ClassName: ActionDao
 * @Description:
 * @Author: liuhefei
 * @Date: 2018/12/4
 * @blog: https://www.imooc.com/u/1323320/articles
 **/
public interface ActionDao extends MongoRepository<Action,String> {
}