package com.hms.controller;
import com.hms.model.Medicine;
import com.hms.repository.MedicineRepo;
import com.hms.service.MedicineService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Getter
@Setter
@RestController

public class MedicineController {

        //
        @Autowired
        MedicineRepo medicineRepo;
        //
        @Autowired //(required=true)
        private MedicineService medicineService;

        @PostMapping("/medicine")
        public Medicine saveMedicine (@RequestBody Medicine medicine){
            return medicineService.saveMedicine(medicine);
        }

        @GetMapping("/medicine")
        public List<Medicine> fetchMedicineList(){
            return medicineService.fetchMedicineList();
        }

        @GetMapping("/medicine/{id}")
        public Medicine fetchMedicineById(@PathVariable("id") int medicineId ){
            return medicineService.fetchMedicineById(medicineId);
        }

        @DeleteMapping("/medicine/{id}")
        public String deleteById(@PathVariable("id") int medicineId){ medicineService.deleteById(medicineId);
            return "Medicine deleted successfully!";
        }

        @PutMapping("/medicine/{id}")
        public Medicine updateMedicineById(@PathVariable("id") int medicineId, @RequestBody Medicine medicine){
            return medicineService.updateMedicineById(medicineId,medicine);}

    //code for pagination and sorting
//    @GetMapping("/page/{pageNo}")
//    public String findPaginated(@PathVariable(value = "pageNo"));
//        @RequestParam("sortField") String sortField, @RequestParam("sortDir") String sortDir,
    }

