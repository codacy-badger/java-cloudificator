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
public class AwsResourceWorkspacesWorkspace {

    /**
     * Indicates whether Amazon WorkSpaces encrypts data stored on the user volume (D: drive). 
     */
    private String UserVolumeEncryptionEnabled;

    /**
     * The identifier of the bundle from which you want to create the workspace. A bundle specifies the details of the workspace, such as the installed applications and the size of CPU, memory, and storage. Use the DescribeWorkspaceBundles action to list the bundles that AWS offers. 
     */
    private String BundleId;

    /**
     * The identifier of the AWS Directory Service directory in which you want to create the workspace. The directory must already be registered with Amazon WorkSpaces. Use the DescribeWorkspaceDirectories action to list the directories that are available. 
     */
    private String DirectoryId;

    /**
     * The name of the user to which the workspace is assigned. This user name must exist in the specified AWS Directory Service directory. 
     */
    private String UserName;

    /**
     * Indicates whether Amazon WorkSpaces encrypts data stored on the root volume (C: drive). 
     */
    private String RootVolumeEncryptionEnabled;

    /**
     * The AWS Key Management Service (AWS KMS) key ID that Amazon WorkSpaces uses to encrypt data stored on your workspace. 
     */
    private String VolumeEncryptionKey;

    /**
     * @return the UserVolumeEncryptionEnabled
     */
    public String getUserVolumeEncryptionEnabled() {
        return UserVolumeEncryptionEnabled;
    }

    /**
     * @param UserVolumeEncryptionEnabled the UserVolumeEncryptionEnabled to set
     */
    public void setUserVolumeEncryptionEnabled(String UserVolumeEncryptionEnabled) {
	this.UserVolumeEncryptionEnabled = UserVolumeEncryptionEnabled;
    }

    /**
     * @return the BundleId
     */
    public String getBundleId() {
        return BundleId;
    }

    /**
     * @param BundleId the BundleId to set
     */
    public void setBundleId(String BundleId) {
	this.BundleId = BundleId;
    }

    /**
     * @return the DirectoryId
     */
    public String getDirectoryId() {
        return DirectoryId;
    }

    /**
     * @param DirectoryId the DirectoryId to set
     */
    public void setDirectoryId(String DirectoryId) {
	this.DirectoryId = DirectoryId;
    }

    /**
     * @return the UserName
     */
    public String getUserName() {
        return UserName;
    }

    /**
     * @param UserName the UserName to set
     */
    public void setUserName(String UserName) {
	this.UserName = UserName;
    }

    /**
     * @return the RootVolumeEncryptionEnabled
     */
    public String getRootVolumeEncryptionEnabled() {
        return RootVolumeEncryptionEnabled;
    }

    /**
     * @param RootVolumeEncryptionEnabled the RootVolumeEncryptionEnabled to set
     */
    public void setRootVolumeEncryptionEnabled(String RootVolumeEncryptionEnabled) {
	this.RootVolumeEncryptionEnabled = RootVolumeEncryptionEnabled;
    }

    /**
     * @return the VolumeEncryptionKey
     */
    public String getVolumeEncryptionKey() {
        return VolumeEncryptionKey;
    }

    /**
     * @param VolumeEncryptionKey the VolumeEncryptionKey to set
     */
    public void setVolumeEncryptionKey(String VolumeEncryptionKey) {
	this.VolumeEncryptionKey = VolumeEncryptionKey;
    }


}