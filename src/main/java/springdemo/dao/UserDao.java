package springdemo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import springdemo.pojo.User;

@Component
@Mapper
public interface UserDao {
    User selectUserbyid(Integer id);
    User selectUserbyname(String name);
}
