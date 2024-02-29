package com.app.ExStudy.Controllers;

import com.app.ExStudy.DTOS.AddressDTO;
import com.app.ExStudy.Services.AddressService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public ResponseEntity<List<AddressDTO>> getAllAddresses() {
        List<AddressDTO> addresses = addressService.getAllAddresses();
        return ResponseEntity.ok(addresses);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AddressDTO> getAddressById(Long id) {
        AddressDTO addressDTO = addressService.getAddressById(id);
        if (addressDTO != null) {
            return ResponseEntity.ok(addressDTO);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<AddressDTO> createAddress(@RequestBody AddressDTO addressDTO) {
        AddressDTO createdAddress = modelMapper.map(addressService.createAddress(addressDTO), AddressDTO.class);
        return ResponseEntity.ok(createdAddress);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AddressDTO> updateAddress(@PathVariable Long id, @RequestBody AddressDTO addressDTO) {
        AddressDTO updatedAddress = modelMapper.map(addressService.updateAddress(id, addressDTO), AddressDTO.class);
        if (updatedAddress != null) {
            return ResponseEntity.ok(updatedAddress);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAddress(@PathVariable Long id) {
        addressService.deleteAddress(id);
        return ResponseEntity.ok().build();
    }

}
