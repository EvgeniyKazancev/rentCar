package ru.rentCar.application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.util.UUID;

@XmlRootElement(name = "auto")
@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@Setter
@AllArgsConstructor
public class GetXmlAuto {
    @XmlElement(name = "ID")
    private UUID id;

    @NotBlank(message = "Number of PTS is mandatory")
    @XmlElement(name = "numberPts")
    private BigDecimal numberPts;

    @NotBlank(message = "Make is mandatory")
    @XmlElement(name = "make")
    private String make;

    @NotBlank(message = "Model is mandatory")
    @XmlElement(name = "model")
    private String model;

    @Min(value = 2010, message = "Year should not be less than 2010")
    @Max(value = 2050, message = "Year should be not greater than 2050")
    @XmlElement(name = "year")
    private int year;

    @XmlElement(name = "color")
    @NotBlank(message = "Color is mandatory")
    private String color;

    @NotNull(message = "Rental price in day is mandatory")
    @XmlElement(name = "rentalPricePerDay")
    private double rentalPricePerDay;

    @NotBlank(message = "Mileage is mandatory")
    @XmlElement
    private Long mileage;

    @XmlElement(name = "rented")
    private boolean rented;
}
