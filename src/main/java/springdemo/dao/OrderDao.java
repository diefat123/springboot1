package springdemo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import springdemo.pojo.Order;

import java.util.List;

@Mapper
@Component
public interface OrderDao {
    List<Order> getOrder();
    Order getOrderbyid(Integer id);
    int addOrder(Order order);
    int deleteOrderbyid(Integer id);
    int updateOrder(Order order);
}
