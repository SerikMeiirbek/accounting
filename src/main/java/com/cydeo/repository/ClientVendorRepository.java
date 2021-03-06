package com.cydeo.repository;

import com.cydeo.dto.ClientVendorDTO;
import com.cydeo.model.ClientVendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClientVendorRepository extends JpaRepository<ClientVendor,Long> {

}
