package com.app.ExStudy.Controllers;

import com.app.ExStudy.DTOS.ClassroomDTO;
import com.app.ExStudy.Services.ClassroomService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classrooms")
public class ClassroomController {

    @Autowired
    private ClassroomService classroomService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public ResponseEntity<List<ClassroomDTO>> getAllClassrooms() {
        List<ClassroomDTO> classrooms = classroomService.getAllClassrooms();
        return ResponseEntity.ok(classrooms);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClassroomDTO> getClassroomById(@PathVariable Long id) {
        ClassroomDTO classroomDTO = classroomService.getClassroomById(id);
        if (classroomDTO != null) {
            return ResponseEntity.ok(classroomDTO);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<ClassroomDTO> createClassroom(@RequestBody ClassroomDTO classroomDTO) {
        ClassroomDTO createdClassroom = modelMapper.map(classroomService.createClassroom(classroomDTO), ClassroomDTO.class);
        return ResponseEntity.ok(createdClassroom);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClassroomDTO> updateClassroom(@PathVariable Long id, @RequestBody ClassroomDTO classroomDTO) {
        ClassroomDTO updatedClassroom = modelMapper.map(classroomService.updateClassroom(id, classroomDTO), ClassroomDTO.class);
        if (updatedClassroom != null) {
            return ResponseEntity.ok(updatedClassroom);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClassroom(@PathVariable Long id) {
        classroomService.deleteClassroom(id);
        return ResponseEntity.ok().build();
    }
}
