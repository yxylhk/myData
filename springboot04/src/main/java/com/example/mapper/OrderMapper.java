package com.example.mapper;

import com.example.order.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderMapper {
    Integer add(@Param("order1") Order order);

    Integer del(Integer oid);

    Integer update(@Param("order2") Order order);

    Order findById(Integer oid);

}
