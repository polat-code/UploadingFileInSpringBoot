package com.example.uploadingfile.repository;

import com.example.uploadingfile.model.DogPics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogPicsRepository extends JpaRepository<DogPics,Long> {
}
