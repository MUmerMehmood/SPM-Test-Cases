package com.lostandfound.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lostandfound.bean.LanguageCLass;

@Repository
public interface LanguageRepo extends JpaRepository<LanguageCLass, Long> {

}
