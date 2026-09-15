/* embeddable class */

package com.vector.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Address {
	
	private String houseNo;
	private String street;
	private String city;
	private Integer pincode;

}
