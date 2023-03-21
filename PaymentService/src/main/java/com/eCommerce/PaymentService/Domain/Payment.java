package com.eCommerce.PaymentService.Domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Payment {
    @Id
    private String id;
    private String orderNumber;
    private String customerNumber;
    private String paymentMethod;
    private LocalDate date;
    private PaymentStatus status;
    private double amount;
}