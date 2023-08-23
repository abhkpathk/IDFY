package com.Jocata.IDfy.REPOSITORY;

import com.Jocata.IDfy.DATAMODEL.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmplRespository extends JpaRepository<Employee,Long> {

}
