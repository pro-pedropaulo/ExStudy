package com.app.ExStudy.Services;

import com.app.ExStudy.DTOS.AddressDTO;
import com.app.ExStudy.DTOS.AdminDTO;
import com.app.ExStudy.Model.Address;
import com.app.ExStudy.Model.Admin;
import com.app.ExStudy.Repositories.AddressRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private ModelMapper modelMapper;

    public AddressDTO createAddress(AddressDTO addressDTO) {
        Address address = modelMapper.map(addressDTO, Address.class);
        return modelMapper.map(addressRepository.save(address), AddressDTO.class);
    }

    public Address updateAddress(Long id, AddressDTO addressDTO) {
        Optional<Address> addressData = addressRepository.findById(id);
        if (addressData.isPresent()) {
            Address address = addressData.get();
            addressDTO.setIdAddress(address.getIdAddress());
            modelMapper.map(addressDTO, address);
            return addressRepository.save(address);
        }
        return null;
    }

    public void deleteAddress(Long id) {
        addressRepository.deleteById(id);
    }

    public List<AddressDTO> getAllAddresses() {
        return addressRepository.findAll().stream()
                .map(address -> modelMapper.map(address, AddressDTO.class))
                .collect(Collectors.toList());
    }

    public AddressDTO getAddressById(Long id) {
        Address address = addressRepository.findById(id).orElse(null);
        return modelMapper.map(address, AddressDTO.class);
    }

}
