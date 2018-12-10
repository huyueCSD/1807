package cn.tedu.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.tedu.ssm.pojo.User;

public interface UserMapper {
	
	public List<User> findAll();
	
	@Select("SELECT *FROM USER WHERE id=#{id};")
	public User get(@Param("id") Integer id);
	
	@Insert("INSERT INTO USER (name,birthday,address)VALUES(#{name},#{birthday},#{address})")
	public void add(User user);
	
	@Update("UPDATE USER SET name=#{name},birthday=#{birthday},address=#{address} where id=#{id};")
	public void update(User user);
	
	@Delete("DELETE FROM USER WHERE id=#{id}")
	public void delete(@Param("id") Integer id);
	
}
