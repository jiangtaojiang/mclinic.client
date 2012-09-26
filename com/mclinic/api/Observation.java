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

package com.mclinic.api;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Date getObservationDatetime() {
        return observationDatetime;
    }

    public void setObservationDatetime(Date observationDatetime) {
        this.observationDatetime = observationDatetime;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getDatatype() {
        return datatype;
    }

    public void setDatatype(Integer datatype) {
        this.datatype = datatype;
    }

    public Integer getConceptId() {
        return conceptId;
    }

    public void setConceptId(Integer conceptId) {
        this.conceptId = conceptId;
    }

    public String getConceptName() {
        return conceptName;
    }

    public void setConceptName(String conceptName) {
        this.conceptName = conceptName;
    }

    public Integer getObservationGroup() {
        return observationGroup;
    }

    public void setObservationGroup(Integer observationGroup) {
        this.observationGroup = observationGroup;
    }
}
