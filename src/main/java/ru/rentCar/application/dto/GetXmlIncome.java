package ru.rentCar.application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.sql.Date;

@XmlRootElement(name = "INCOME")
@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@Setter
@AllArgsConstructor
public class GetXmlIncome {
    @Id
    @XmlElement(name = "ID")
    private Long id;

    @XmlElement(name = "INCOME")
    private int income;

    @XmlElement(name = "DATE")
    private Date date;

}
