package com.thaiitwork.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Account implements Serializable {
     
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column
	private String username;
    
    @NotBlank(message = "Name is mandatory")
    @Size(min = 2, max = 50, message = "Please provide first size between 2 - 100")
    private String name;

    @Email
    @NotNull
    private String email;

    @Column
	@JsonIgnore
    @NotNull
	private String password;

    @Column
    @Temporal(TemporalType.TIME)
    @NotNull
    private Date created;

    @Column
    @Temporal(TemporalType.TIME)
    @NotNull
    private Date updated;

}
