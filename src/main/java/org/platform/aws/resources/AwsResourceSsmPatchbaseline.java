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
public class AwsResourceSsmPatchbaseline {

    /**
     * Defines the operating system that the patch baseline applies to. Supported operating systems include WINDOWS, AMAZON_LINUX, AMAZON_LINUX_2, UBUNTU, REDHAT_ENTERPRISE_LINUX, SUSE, and CENTOS. The default value is WINDOWS. 
     */
    private String OperatingSystem;

    /**
     * A list of explicitly approved patches for the baseline. 
     */
    private String ApprovedPatches;

    /**
     * The names of the patch groups to register with the patch baseline. 
     */
    private String PatchGroups;

    /**
     * A description of the patch baseline. 
     */
    private String Description;

    /**
     * The compliance level for approved patches. This means that if an approved patch is reported as missing, this is the severity of the compliance violation. Valid compliance severity levels include the following: CRITICAL, HIGH, MEDIUM, LOW, INFORMATIONAL, and UNSPECIFIED. The default value is UNSPECIFIED. 
     */
    private String ApprovedPatchesComplianceLevel;

    /**
     * A set of rules that are used to include patches in the baseline. 
     */
    private String ApprovalRules;

    /**
     * A set of global filters that are used to exclude patches from the baseline. 
     */
    private String GlobalFilters;

    /**
     * The name of the patch baseline. 
     */
    private String Name;

    /**
     * A list of explicitly rejected patches for the baseline. 
     */
    private String RejectedPatches;

    /**
     * @return the OperatingSystem
     */
    public String getOperatingSystem() {
        return OperatingSystem;
    }

    /**
     * @param OperatingSystem the OperatingSystem to set
     */
    public void setOperatingSystem(String OperatingSystem) {
	this.OperatingSystem = OperatingSystem;
    }

    /**
     * @return the ApprovedPatches
     */
    public String getApprovedPatches() {
        return ApprovedPatches;
    }

    /**
     * @param ApprovedPatches the ApprovedPatches to set
     */
    public void setApprovedPatches(String ApprovedPatches) {
	this.ApprovedPatches = ApprovedPatches;
    }

    /**
     * @return the PatchGroups
     */
    public String getPatchGroups() {
        return PatchGroups;
    }

    /**
     * @param PatchGroups the PatchGroups to set
     */
    public void setPatchGroups(String PatchGroups) {
	this.PatchGroups = PatchGroups;
    }

    /**
     * @return the Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * @param Description the Description to set
     */
    public void setDescription(String Description) {
	this.Description = Description;
    }

    /**
     * @return the ApprovedPatchesComplianceLevel
     */
    public String getApprovedPatchesComplianceLevel() {
        return ApprovedPatchesComplianceLevel;
    }

    /**
     * @param ApprovedPatchesComplianceLevel the ApprovedPatchesComplianceLevel to set
     */
    public void setApprovedPatchesComplianceLevel(String ApprovedPatchesComplianceLevel) {
	this.ApprovedPatchesComplianceLevel = ApprovedPatchesComplianceLevel;
    }

    /**
     * @return the ApprovalRules
     */
    public String getApprovalRules() {
        return ApprovalRules;
    }

    /**
     * @param ApprovalRules the ApprovalRules to set
     */
    public void setApprovalRules(String ApprovalRules) {
	this.ApprovalRules = ApprovalRules;
    }

    /**
     * @return the GlobalFilters
     */
    public String getGlobalFilters() {
        return GlobalFilters;
    }

    /**
     * @param GlobalFilters the GlobalFilters to set
     */
    public void setGlobalFilters(String GlobalFilters) {
	this.GlobalFilters = GlobalFilters;
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

    /**
     * @return the RejectedPatches
     */
    public String getRejectedPatches() {
        return RejectedPatches;
    }

    /**
     * @param RejectedPatches the RejectedPatches to set
     */
    public void setRejectedPatches(String RejectedPatches) {
	this.RejectedPatches = RejectedPatches;
    }


}