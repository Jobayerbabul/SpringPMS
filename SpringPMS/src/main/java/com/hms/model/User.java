
package com.hms.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {

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
//    @Column(unique = true, nullable = false) // Ensure username is unique
    private String userName;
//    @Column(unique = true, nullable = false) // Ensure phone is unique
    private String phone;
    private String fullName;
    private String dob;
    private String sex;
    private String address;
    private String userType;
    private String password;

    public User(String userName, String password, String fullName, String phone, String dob, String sex, String address, String userType)
    {
        this.userName = userName;
        this.password = password;
        this.fullName = fullName;
        this.phone = phone;
        this.dob = dob;
        this.sex = sex;
        this.address = address;
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", phone='" + phone + '\'' +
                ", dob=" + dob +'\'' +
                ", sex=" + sex +'\'' +
                ", address='" + address + '\'' +
                ", userType='" + userType + '\'' +
                ",password='" + password + '\'' +
                '}';
    }
}


