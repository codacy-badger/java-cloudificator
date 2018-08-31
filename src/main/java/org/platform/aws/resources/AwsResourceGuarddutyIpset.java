/*******************************************************************************
 * Copyright 2018
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package org.platform.aws.resources;

/**
 * Generated class
 */
public class AwsResourceGuarddutyIpset {

    /**
     * The format of the file that contains the IP set. Valid values are TXT, STIX, and OTX_CSV. 
     */
    private String Format;

    /**
     * A Boolean value that indicates whether GuardDuty is to start using the uploaded IP set. 
     */
    private String Activate;

    /**
     * The detector ID that specifies the GuardDuty service for which an IP set is to be created. 
     */
    private String DetectorId;

    /**
     * The URI of the file that contains the IP set. 
     */
    private String Location;

    /**
     * The friendly name to identify the IP set. This name is displayed in all findings that are triggered by activity that involves IP addresses included in this IP set. 
     */
    private String Name;

    /**
     * @return the Format
     */
    public String getFormat() {
        return Format;
    }

    /**
     * @param Format the Format to set
     */
    public void setFormat(String Format) {
	this.Format = Format;
    }

    /**
     * @return the Activate
     */
    public String getActivate() {
        return Activate;
    }

    /**
     * @param Activate the Activate to set
     */
    public void setActivate(String Activate) {
	this.Activate = Activate;
    }

    /**
     * @return the DetectorId
     */
    public String getDetectorId() {
        return DetectorId;
    }

    /**
     * @param DetectorId the DetectorId to set
     */
    public void setDetectorId(String DetectorId) {
	this.DetectorId = DetectorId;
    }

    /**
     * @return the Location
     */
    public String getLocation() {
        return Location;
    }

    /**
     * @param Location the Location to set
     */
    public void setLocation(String Location) {
	this.Location = Location;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
	this.Name = Name;
    }


}