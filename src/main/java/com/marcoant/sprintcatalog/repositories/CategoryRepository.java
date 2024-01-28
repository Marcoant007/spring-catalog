package com.marcoant.sprintcatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcoant.sprintcatalog.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
