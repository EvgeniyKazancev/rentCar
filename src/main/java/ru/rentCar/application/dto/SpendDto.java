package ru.rentCar.application.dto;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;


@Getter
@Setter
@AllArgsConstructor
public class SpendDto {


    private Long id;


    private int spend;


    private Date date;
}
