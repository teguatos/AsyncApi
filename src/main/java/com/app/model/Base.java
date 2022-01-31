package com.app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@MappedSuperclass
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Base implements Serializable {
	private static final long serialVersionUID = -8777405755360398489L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@CreationTimestamp
	@Column(name = "CreationTime", updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date creationTime;

	@UpdateTimestamp
	@Column(name = "ModificationTime")
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date modificationTime;

}