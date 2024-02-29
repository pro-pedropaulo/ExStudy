package com.app.ExStudy.Services;

import com.app.ExStudy.DTOS.AdminDTO;
import com.app.ExStudy.Model.Address;
import com.app.ExStudy.Model.Admin;
import com.app.ExStudy.Repositories.AddressRepository;
import com.app.ExStudy.Repositories.AdminRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private AddressRepository addressRepository;

    public Admin createUser(AdminDTO adminDTO) {
        Admin admin = modelMapper.map(adminDTO, Admin.class);
        if(adminDTO.getIdAddress() != null) {
            Address address = addressRepository.findById(adminDTO.getIdAddress()).orElse(null);
            admin.setAddress(address);
        }
        return adminRepository.save(admin);
    }

    public Admin updateUser(Long id, AdminDTO adminDTO) {
        Optional<Admin> userData = adminRepository.findById(id);
        if (userData.isPresent()) {
            Admin admin = userData.get();

            admin.setName(adminDTO.getName());
            admin.setEmployeeCode(adminDTO.getEmployeeCode());
            admin.setPassword(adminDTO.getPassword());
            admin.setRole(adminDTO.getRole());

            if (adminDTO.getIdAddress() != null) {
                Address address = addressRepository.findById(adminDTO.getIdAddress()).orElseThrow(()
                        -> new RuntimeException("Address not found"));
                admin.setAddress(address);
            }

            return adminRepository.save(admin);
        } else {
            throw new RuntimeException("admin not found");
        }
    }

    public void deleteUser(Long id) {
        adminRepository.deleteById(id);
    }

    public List<AdminDTO> getAllUsers() {
        return adminRepository.findAll().stream()
                .map(admin -> modelMapper.map(admin, AdminDTO.class))
                .collect(Collectors.toList());
    }

    public AdminDTO getUserById(Long id) {
        Admin admin = adminRepository.findById(id).orElse(null);
        return modelMapper.map(admin, AdminDTO.class);
    }
}
