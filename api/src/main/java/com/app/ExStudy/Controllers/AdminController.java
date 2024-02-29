package com.app.ExStudy.Controllers;

import com.app.ExStudy.DTOS.AdminDTO;
import com.app.ExStudy.Services.AdminService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public ResponseEntity<List<AdminDTO>> getAllUsers() {
        List<AdminDTO> users = adminService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AdminDTO> getUserById(@PathVariable Long id) {
        AdminDTO adminDTO = adminService.getUserById(id);
        if (adminDTO != null) {
            return ResponseEntity.ok(adminDTO);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<AdminDTO> createUser(@RequestBody AdminDTO adminDTO) {
        AdminDTO createdUser = modelMapper.map(adminService.createUser(adminDTO), AdminDTO.class);
        return ResponseEntity.ok(createdUser);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AdminDTO> updateUser(@PathVariable Long id, @RequestBody AdminDTO adminDTO) {
        AdminDTO updatedUser = modelMapper.map(adminService.updateUser(id, adminDTO), AdminDTO.class);
        if (updatedUser != null) {
            return ResponseEntity.ok(updatedUser);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        adminService.deleteUser(id);
        return ResponseEntity.ok().build();
    }
}
