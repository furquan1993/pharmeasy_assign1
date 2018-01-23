/**
 * 
 */
package com.furquan.pharmeasy_assign1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.furquan.pharmeasy_assign1.model.Prescription;
import com.furquan.pharmeasy_assign1.model.User;

/**
 * @author furquan.ahmed
 *
 */
@Repository
public abstract interface PrescriptionRepository extends JpaRepository<Prescription, Long> {
    public User findById(long id);
}
