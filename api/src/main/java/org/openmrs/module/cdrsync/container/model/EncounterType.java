//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.06 at 02:19:42 AM WAT 
//

package org.openmrs.module.cdrsync.container.model;

import java.io.Serializable;
import java.util.Date;

public class EncounterType implements Serializable {
	
	private int encounterId;
	
	private int encounterTypeId;
	
	private int patientId;
	
	private int locationId;
	
	private int formId;
	
	private String pmmForm;
	
	private Date encounterDatetime;
	
	private int creator;
	
	private Date dateCreated;
	
	private int voided;
	
	private int voidedBy;
	
	private Date dateVoided;
	
	private int changedBy;
	
	private Date dateChanged;
	
	private int visitId;
	
	private String patientUuid;
	
	private String encounterUuid;
	
	private String datimId;
	
	private String visitUuid;
	
	public int getEncounterId() {
		return encounterId;
	}
	
	public void setEncounterId(int encounterId) {
		this.encounterId = encounterId;
	}
	
	public int getEncounterTypeId() {
		return encounterTypeId;
	}
	
	public void setEncounterTypeId(int encounterTypeId) {
		this.encounterTypeId = encounterTypeId;
	}
	
	public int getPatientId() {
		return patientId;
	}
	
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	
	public int getLocationId() {
		return locationId;
	}
	
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	
	public int getFormId() {
		return formId;
	}
	
	public void setFormId(int formId) {
		this.formId = formId;
	}
	
	public String getPmmForm() {
		return pmmForm;
	}
	
	public void setPmmForm(String pmmForm) {
		this.pmmForm = pmmForm;
	}
	
	public Date getEncounterDatetime() {
		return encounterDatetime;
	}
	
	public void setEncounterDatetime(Date encounterDatetime) {
		this.encounterDatetime = encounterDatetime;
	}
	
	public int getCreator() {
		return creator;
	}
	
	public void setCreator(int creator) {
		this.creator = creator;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	public int getVoided() {
		return voided;
	}
	
	public void setVoided(int voided) {
		this.voided = voided;
	}
	
	public int getVoidedBy() {
		return voidedBy;
	}
	
	public void setVoidedBy(int voidedBy) {
		this.voidedBy = voidedBy;
	}
	
	public Date getDateVoided() {
		return dateVoided;
	}
	
	public void setDateVoided(Date dateVoided) {
		this.dateVoided = dateVoided;
	}
	
	public int getChangedBy() {
		return changedBy;
	}
	
	public void setChangedBy(int changedBy) {
		this.changedBy = changedBy;
	}
	
	public Date getDateChanged() {
		return dateChanged;
	}
	
	public void setDateChanged(Date dateChanged) {
		this.dateChanged = dateChanged;
	}
	
	public int getVisitId() {
		return visitId;
	}
	
	public void setVisitId(int visitId) {
		this.visitId = visitId;
	}
	
	public String getPatientUuid() {
		return patientUuid;
	}
	
	public void setPatientUuid(String patientUuid) {
		this.patientUuid = patientUuid;
	}
	
	public String getEncounterUuid() {
		return encounterUuid;
	}
	
	public void setEncounterUuid(String encounterUuid) {
		this.encounterUuid = encounterUuid;
	}
	
	public String getDatimId() {
		return datimId;
	}
	
	public void setDatimId(String datimId) {
		this.datimId = datimId;
	}
	
	public String getVisitUuid() {
		return visitUuid;
	}
	
	public void setVisitUuid(String visitUuid) {
		this.visitUuid = visitUuid;
	}
}
