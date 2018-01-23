/**
 * 
 */
package com.furquan.pharmeasy_assign1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.furquan.pharmeasy_assign1.model.PrescriptionAccessControl;

/**
 * @author furquan.ahmed
 *
 */
@Repository
public abstract interface PrescriptionAccessControlRepository extends JpaRepository<PrescriptionAccessControl, Long> {
	public List<PrescriptionAccessControl> findByUserId(long id);
}
