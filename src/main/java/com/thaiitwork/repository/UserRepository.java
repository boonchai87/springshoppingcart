package com.thaiitwork.repository;

import com.thaiitwork.model.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Account, Long> {
	
}