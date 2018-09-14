package com.ybl.repository;

import javax.persistence.Table;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.ybl.pojo.User;

@Repository
@Table(name="t_user")
@Qualifier("userRepository")
public interface UserRepository extends CrudRepository<User,Long>{
	public User findOne(Long id);
	
	@Query("select t from User t where t.username=:name")
	public User findUserByName(@Param("name") String name);

	@Query("select t from User t where t.sex=:sex")
	public User findUserBySex(@Param("sex") String sex);
}
