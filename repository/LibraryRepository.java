package com.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.library.model.Library;

@Repository

public interface LibraryRepository extends JpaRepository<Library, Long> {
	public Library findByName(String name);

}
