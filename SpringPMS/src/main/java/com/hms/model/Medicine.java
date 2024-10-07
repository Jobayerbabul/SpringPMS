package com.hms.model;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Medicine {

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    @JsonFormat(pattern = "dd-MM-yyyy  hh-mm-ss a")
    private LocalDateTime lastUpdate;

    @PrePersist
    private void onCreate(){
        lastUpdate = LocalDateTime.now();
    }


    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int mid;

        @Setter
        private String medicineName;
        private String medicineType;
        private String companyName;
        private String productionDate;
        private String expirationDate;
        private String place;
        private float quantity;
        private float UnitPrice;

        public Medicine (String medicineName, String medicineType, String companyName, String productionDate, String expirationDate, String place, float quantity, float UnitPrice) {
            this.medicineName = medicineName;
            this.medicineType = medicineType;
            this.companyName = companyName;
            this.productionDate = productionDate;
            this.expirationDate = expirationDate;
            this.place = place;
            this.quantity = quantity;
            this.UnitPrice = UnitPrice;
        }

    }
