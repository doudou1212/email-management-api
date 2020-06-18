package com.autraining.email.management.emailmanagementapi.model;


import lombok.*;

import javax.persistence.Entity;

@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Email {
    @NonNull
    private String address;
}
