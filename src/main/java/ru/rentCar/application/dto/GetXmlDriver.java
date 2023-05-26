package ru.rentCar.application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;
import java.util.UUID;

@XmlRootElement(name = "driver")
@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@Setter
@AllArgsConstructor
public class GetXmlDriver {
    @XmlElement
    private UUID Id;

    @NotBlank(message = "First name is mandatory")
    @XmlElement
    private String firstName;

    @NotBlank(message = "Last name is mandatory")
    @XmlElement
    private String lastName;

    @Email(message = "Email should be valid ")
    @XmlElement
    private String email;

    @Pattern(regexp = "\\+?[0-9]{10,12}", message = "Phone number should be valid")
    @XmlElement
    private String phoneNumber;

    @NotBlank(message = "License number is mandatory")
    @XmlElement
    private String licenseNumber;

    @NotBlank(message = "Data is birth is mandatory")
    @XmlElement
    @XmlJavaTypeAdapter(type = Date.class, value = XmlAdapter.class) //Под вопросом оформление аннотации!!
    private Date dateOfBirth;
}
