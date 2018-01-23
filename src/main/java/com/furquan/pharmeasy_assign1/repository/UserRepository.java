/**
 * 
 */
package com.furquan.pharmeasy_assign1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.furquan.pharmeasy_assign1.model.User;

/**
 * @author furquan.ahmed
 *
 */
@Repository
public abstract interface UserRepository extends JpaRepository<User, Long> {

    public User findById(long id);

    public User findByUsername(String username);

    public User findByEmailId(String emailId);

}
