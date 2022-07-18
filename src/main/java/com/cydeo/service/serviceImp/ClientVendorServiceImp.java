package com.cydeo.service.serviceImp;

import com.cydeo.dto.ClientVendorDTO;
import com.cydeo.model.ClientVendor;
import com.cydeo.repository.ClientVendorRepository;
import com.cydeo.service.ClientVendorService;
import com.cydeo.util.MapperUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClientVendorServiceImp implements ClientVendorService {

    private final ClientVendorRepository clientVendorRepository;
    private final MapperUtil mapperUtil;;

    public ClientVendorServiceImp(ClientVendorRepository clientVendorRepository, MapperUtil mapperUtil) {
        this.clientVendorRepository = clientVendorRepository;
        this.mapperUtil = mapperUtil;
    }


    @Override
    public List<ClientVendorDTO> listAllClientVendors() {

        return clientVendorRepository.findAll().stream().map(clientVendor -> mapperUtil.convert(clientVendor, new ClientVendorDTO())).collect(Collectors.toList());

    }

    @Override
    public void save(ClientVendorDTO dto) {
        ClientVendor clientVendor=mapperUtil.convert(dto, new ClientVendor());
        clientVendorRepository.save(clientVendor);

    }

    @Override
    public void update(ClientVendorDTO dto) {
        Optional<ClientVendor> clientVendor=clientVendorRepository.findById(dto.getId());
        ClientVendor convertedClientVendor=mapperUtil.convert(dto,new ClientVendor());
        convertedClientVendor.setId(clientVendor.get().getId());
        clientVendorRepository.save(convertedClientVendor);
    }

    @Override
    public ClientVendorDTO findById(Long id) {
        Optional<ClientVendor> clientVendor = clientVendorRepository.findById(id);
        return mapperUtil.convert(clientVendor, new ClientVendorDTO());
    }

//    @Override
//    public void deleteByName(String name) {
//
//    }

}