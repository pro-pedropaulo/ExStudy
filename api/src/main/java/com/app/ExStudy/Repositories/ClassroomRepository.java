package com.app.ExStudy.Repositories;

import com.app.ExStudy.Model.Child;
import com.app.ExStudy.Model.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassroomRepository extends JpaRepository<Classroom, Long> {

}
