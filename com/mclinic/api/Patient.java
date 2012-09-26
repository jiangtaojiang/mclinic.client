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
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Patient {

    private Integer id;

    private String givenName;

    private String middleName;

    private String familyName;

    private String gender;

    private Date birthdate;

    private Boolean birthdateEstimated;

    private Set<PatientAttribute> attributes;

    private Set<PatientIdentifier> identifiers;

    private String uuid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Boolean getBirthdateEstimated() {
        return birthdateEstimated;
    }

    public void setBirthdateEstimated(Boolean birthdateEstimated) {
        this.birthdateEstimated = birthdateEstimated;
    }

    public Set<PatientAttribute> getAttributes() {
        if (attributes == null)
            attributes = new TreeSet<PatientAttribute>();
        return attributes;
    }

    public void setAttributes(Set<PatientAttribute> attributes) {
        this.attributes = attributes;
    }

    public Set<PatientIdentifier> getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(Set<PatientIdentifier> identifiers) {
        this.identifiers = identifiers;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
