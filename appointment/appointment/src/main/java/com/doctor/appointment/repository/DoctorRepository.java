package com.doctor.appointment.repository;

import com.doctor.appointment.dto.DoctorDto;
import com.doctor.appointment.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}
