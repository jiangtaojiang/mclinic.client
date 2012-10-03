/**
 *  Copyright 2012 mClinic
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.mclinic.android.api.base;

import java.util.Date;

public class Observation {

    private Integer id;
    private Patient patient;
    private Date observationDatetime;
    private String value;
    private Integer datatype;
    private Integer conceptId;
    private String conceptName;
    private Integer observationGroup;
    
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the patient
	 */
	public Patient getPatient() {
		return patient;
	}
	/**
	 * @param patient the patient to set
	 */
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	/**
	 * @return the observationDatetime
	 */
	public Date getObservationDatetime() {
		return observationDatetime;
	}
	/**
	 * @param observationDatetime the observationDatetime to set
	 */
	public void setObservationDatetime(Date observationDatetime) {
		this.observationDatetime = observationDatetime;
	}
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	/**
	 * @return the datatype
	 */
	public Integer getDatatype() {
		return datatype;
	}
	/**
	 * @param datatype the datatype to set
	 */
	public void setDatatype(Integer datatype) {
		this.datatype = datatype;
	}
	/**
	 * @return the conceptId
	 */
	public Integer getConceptId() {
		return conceptId;
	}
	/**
	 * @param conceptId the conceptId to set
	 */
	public void setConceptId(Integer conceptId) {
		this.conceptId = conceptId;
	}
	/**
	 * @return the conceptName
	 */
	public String getConceptName() {
		return conceptName;
	}
	/**
	 * @param conceptName the conceptName to set
	 */
	public void setConceptName(String conceptName) {
		this.conceptName = conceptName;
	}
	/**
	 * @return the observationGroup
	 */
	public Integer getObservationGroup() {
		return observationGroup;
	}
	/**
	 * @param observationGroup the observationGroup to set
	 */
	public void setObservationGroup(Integer observationGroup) {
		this.observationGroup = observationGroup;
	}
}