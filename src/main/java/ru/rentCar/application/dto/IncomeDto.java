package ru.rentCar.application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;


@Getter
@Setter
@AllArgsConstructor
public class IncomeDto {

    private Long id;


    private int income;

    private Date date;

}
