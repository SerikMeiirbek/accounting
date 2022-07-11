package com.cydeo.service;

import com.cydeo.dto.ClientVendorDTO;

import java.util.List;

public interface ClientVendorService {


    List<ClientVendorDTO> listAllClientVendors();
    void save(ClientVendorDTO dto);
    void update(ClientVendorDTO dto);
    ClientVendorDTO  findById(Long id);
    //void deleteByName(String name);
}
