package com.app.ExStudy.Repositories;

import com.app.ExStudy.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
