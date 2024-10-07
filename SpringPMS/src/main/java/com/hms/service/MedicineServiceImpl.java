package com.hms.service;

import com.hms.model.Medicine;
import com.hms.repository.MedicineRepo;
import org.hibernate.query.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class MedicineServiceImpl implements MedicineService {


        @Autowired
        private MedicineRepo medicineRepo;

        @Override
        public Medicine saveMedicine (Medicine medicine) { return medicineRepo.save(medicine); }

        @Override
        public List<Medicine> fetchMedicineList() {
            return medicineRepo.findAll();
        }

        @Override
        public Medicine fetchMedicineById(int medicineId) {
            return medicineRepo.findById(String.valueOf(medicineId)).get();
        }

        @Override
        public void deleteById(int medicineId) { medicineRepo.deleteById(String.valueOf(medicineId));}

        @Override
        public Medicine updateMedicineById(int medicineId, Medicine medicine) {
            Medicine updateMedicineDB = medicineRepo.findById(String.valueOf(medicineId)).get();

            if (Objects.nonNull(medicine.getMedicineName()) && !"".equalsIgnoreCase(medicine.getMedicineName())) {
                updateMedicineDB.setMedicineName(medicine.getMedicineName());
            }
            if (Objects.nonNull(medicine.getMedicineType()) && !"".equalsIgnoreCase(medicine.getMedicineType())) {
                updateMedicineDB.setMedicineType(medicine.getMedicineType());
            }
            if (Objects.nonNull(medicine.getCompanyName()) && !"".equalsIgnoreCase(medicine.getCompanyName())) {
                updateMedicineDB.setCompanyName(medicine.getCompanyName());
            }
            if (Objects.nonNull(medicine.getProductionDate()) && !"".equalsIgnoreCase(String.valueOf(medicine.getProductionDate()))) {
                updateMedicineDB.setProductionDate(medicine.getProductionDate());
            }
            if (Objects.nonNull(medicine.getExpirationDate()) && !"".equalsIgnoreCase(String.valueOf(medicine.getExpirationDate()))) {
                updateMedicineDB.setExpirationDate(medicine.getExpirationDate());
            }
            if (Objects.nonNull(medicine.getPlace()) && !"".equalsIgnoreCase(String.valueOf(medicine.getPlace()))) {
                updateMedicineDB.setPlace(medicine.getPlace());
            }
            if (Objects.nonNull(medicine.getQuantity()) && !"".equalsIgnoreCase(String.valueOf(medicine.getQuantity()))) {
                updateMedicineDB.setQuantity(medicine.getQuantity());
            }
            if (Objects.nonNull(medicine.getUnitPrice()) && !"".equalsIgnoreCase(String.valueOf(medicine.getUnitPrice()))) {
                updateMedicineDB.setUnitPrice(medicine.getUnitPrice());
            }
            return medicineRepo.save(updateMedicineDB);
        }

//    @Override
//    public Page<Medicine> findPaginated(int pagNo, int pageSize, String sortField, String sortDir) {
//        return null;
//    }

}

