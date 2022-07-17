package com.cydeo.repository;

import com.cydeo.dto.ClientVendorDTO;
import com.cydeo.model.ClientVendor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientVendorRepository extends JpaRepository<ClientVendor,Long> {



}
