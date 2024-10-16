package com.tuempresa.ejemplo1.modelo;

import java.time.*;

import javax.persistence.*;

import org.openxava.model.*;


@Entity 
public class pet extends Identifiable {
	
	private String name;
	private String breed;
	private String description;
	private LocalDate dateofbirth;
	
	

}
