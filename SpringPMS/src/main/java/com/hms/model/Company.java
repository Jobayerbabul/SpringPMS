package com.hms.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Company {

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
        private String companyName;

        public Company (String companyName) {
                this.companyName = companyName;
        }

}
