package com.hms.repository;

import com.hms.model.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface MedicineRepo extends JpaRepository<Medicine, String> {
    // Code for search medicine data
//    @Query("SELECT medicine FROM Medicine medicine WHERE CONCAT (medicine.medicineId, '', medicine.medicineName) LIKE %?1%")
//    public List<Medicine> serach(String keyword);
//    public Medicine findBymedicineName(String medicine);
}
