package com.hms.service;

import com.hms.model.Medicine;
import com.hms.model.User;
import org.hibernate.query.Page;

import java.util.List;

public interface MedicineService {
    public Medicine saveMedicine(Medicine medicine);

    public List<Medicine> fetchMedicineList();

    public Medicine fetchMedicineById(int medicineId);

    public void deleteById(int medicineId);

    public Medicine updateMedicineById(int medicineId, Medicine medicine);
    //Code for pagination
    //Page<Medicine> findPaginated(int pagNo, int pageSize, String sortField, String sortDir);

}
