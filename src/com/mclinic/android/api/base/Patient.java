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
	 * @return the givenName
	 */
	public String getGivenName() {
		return givenName;
	}
	/**
	 * @param givenName the givenName to set
	 */
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}
	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	/**
	 * @return the familyName
	 */
	public String getFamilyName() {
		return familyName;
	}
	/**
	 * @param familyName the familyName to set
	 */
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the birthdate
	 */
	public Date getBirthdate() {
		return birthdate;
	}
	/**
	 * @param birthdate the birthdate to set
	 */
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	/**
	 * @return the birthdateEstimated
	 */
	public Boolean getBirthdateEstimated() {
		return birthdateEstimated;
	}
	/**
	 * @param birthdateEstimated the birthdateEstimated to set
	 */
	public void setBirthdateEstimated(Boolean birthdateEstimated) {
		this.birthdateEstimated = birthdateEstimated;
	}
	/**
	 * @return the attributes
	 */
	public Set<PatientAttribute> getAttributes() {
		if (attributes == null)
            attributes = new TreeSet<PatientAttribute>();
		return attributes;
	}
	/**
	 * @param attributes the attributes to set
	 */
	public void setAttributes(Set<PatientAttribute> attributes) {
		this.attributes = attributes;
	}
	/**
	 * @return the identifiers
	 */
	public Set<PatientIdentifier> getIdentifiers() {
		return identifiers;
	}
	/**
	 * @param identifiers the identifiers to set
	 */
	public void setIdentifiers(Set<PatientIdentifier> identifiers) {
		this.identifiers = identifiers;
	}
	/**
	 * @return the uuid
	 */
	public String getUuid() {
		return uuid;
	}
	/**
	 * @param uuid the uuid to set
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

    
    
    
    
 
}
