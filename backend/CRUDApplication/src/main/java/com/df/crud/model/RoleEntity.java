package com.df.crud.model;
import org.hibernate.annotations.NaturalId;
import javax.persistence.*;
/**
 * Created by lalitha eti on 01/08/17.
 */
@Entity
@Table(name = "roles")
public class RoleEntity {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @NaturalId
	    @Column(length = 60)
	    private String name;
	    public RoleEntity() {
	    }

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

		public void setName(String name) {
			this.name = name;
		}
	}

