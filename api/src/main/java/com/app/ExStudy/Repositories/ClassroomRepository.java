package com.app.ExStudy.Repositories;

import com.app.ExStudy.Model.Children;
import com.app.ExStudy.Model.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassroomRepository extends JpaRepository<Classroom, Long> {
    Classroom findByNomenclature(String nomenclature);
    Classroom findByType(String type);
    Classroom findByStudentCount(int studentCount);
    Classroom findByChildren(Children children);
}
