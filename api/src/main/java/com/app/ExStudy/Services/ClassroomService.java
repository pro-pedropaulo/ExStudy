package com.app.ExStudy.Services;

import com.app.ExStudy.DTOS.ClassroomDTO;
import com.app.ExStudy.Model.Classroom;
import com.app.ExStudy.Repositories.ClassroomRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClassroomService {

    @Autowired
    private ClassroomRepository classroomRepository;

    @Autowired
    private ModelMapper modelMapper;

//    public Classroom createClassroom(ClassroomDTO classroomDTO) {
//        Classroom classroom = modelMapper.map(classroomDTO, Classroom.class);
//        return classroomRepository.save(classroom);
//    }
//
//    public Classroom updateClassroom(Long id, ClassroomDTO classroomDTO) {
//        Optional<Classroom> classroomData = classroomRepository.findById(id);
//        if (classroomData.isPresent()) {
//            Classroom classroom = classroomData.get();
//            classroomDTO.setId(classroom.getIdClassroom());
//            modelMapper.map(classroomDTO, classroom);
//            return classroomRepository.save(classroom);
//        }
//        return null;
//    }
//
//    public void deleteClassroom(Long id) {
//        classroomRepository.deleteById(id);
//    }
//
//    public List<ClassroomDTO> getAllClassrooms() {
//        return classroomRepository.findAll().stream()
//                .map(classroom -> modelMapper.map(classroom, ClassroomDTO.class))
//                .collect(Collectors.toList());
//    }
//
//    public ClassroomDTO getClassroomById(Long id) {
//        Classroom classroom = classroomRepository.findById(id).orElse(null);
//        return modelMapper.map(classroom, ClassroomDTO.class);
//    }


}