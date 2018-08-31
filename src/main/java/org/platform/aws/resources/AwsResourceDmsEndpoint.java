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
public class AwsResourceDmsEndpoint {

    /**
     * The KMS key identifier that will be used to encrypt the connection parameters. If you do not specify a value for the KmsKeyId parameter, then AWS DMS will use your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS region. 
     */
    private String KmsKeyId;

    /**
     * The port used by the endpoint database. 
     */
    private String Port;

    /**
     * The name of the endpoint database. 
     */
    private String DatabaseName;

    /**
     * Settings in JSON format for the target Amazon S3 endpoint. For more information about the available settings, see the Extra Connection Attributes section at Using Amazon S3 as a Target for AWS Database Migration Service in the AWS Database Migration Service User Guide. 
     */
    private String S3Settings;

    /**
     * The type of engine for the endpoint. Valid values depend on the EndPointType and include MYSQL, ORACLE, POSTGRES, MARIADB, AURORA, REDSHIFT, S3, SYBASE, DYNAMODB, MONGODB, and SQLSERVER. 
     */
    private String EngineName;

    /**
     * Settings in JSON format for the target DynamoDB endpoint. For more information about the available settings, see the Using Object Mapping to Migrate Data to DynamoDB section at Using an Amazon DynamoDB Database as a Target for AWS Database Migration Service. 
     */
    private String DynamoDbSettings;

    /**
     * The user name to be used to login to the endpoint database. 
     */
    private String Username;

    /**
     * The SSL mode to use for the SSL connection. 
     */
    private String SslMode;

    /**
     * Additional attributes associated with the connection. 
     */
    private String ExtraConnectionAttributes;

    /**
     * The name of the server where the endpoint database resides. 
     */
    private String ServerName;

    /**
     * The type of endpoint. Valid values are source and target. 
     */
    private String EndpointType;

    /**
     * The tags that you want to attach to the DMS endpoint. 
     */
    private String Tags;

    /**
     * The Amazon Resource Number (ARN) for the certificate. 
     */
    private String CertificateArn;

    /**
     * The database endpoint identifier. Identifiers must begin with a letter; must contain only ASCII letters, digits, and hyphens; and must not end with a hyphen or contain two consecutive hyphens. 
     */
    private String EndpointIdentifier;

    /**
     * Settings in JSON format for the source MongoDB endpoint. For more information about the available settings, see the Configuration Properties When Using MongoDB as a Source for AWS Database Migration Service section at Using Amazon S3 as a Target for AWS Database Migration Service. 
     */
    private String MongoDbSettings;

    /**
     * The password to be used to login to the endpoint database. Do not use this parameter directly. Use Password as an input parameter with noEcho as shown in the Parameters. For best practices information, see Do Not Embed Credentials in Your Templates. 
     */
    private String Password;

    /**
     * @return the KmsKeyId
     */
    public String getKmsKeyId() {
        return KmsKeyId;
    }

    /**
     * @param KmsKeyId the KmsKeyId to set
     */
    public void setKmsKeyId(String KmsKeyId) {
	this.KmsKeyId = KmsKeyId;
    }

    /**
     * @return the Port
     */
    public String getPort() {
        return Port;
    }

    /**
     * @param Port the Port to set
     */
    public void setPort(String Port) {
	this.Port = Port;
    }

    /**
     * @return the DatabaseName
     */
    public String getDatabaseName() {
        return DatabaseName;
    }

    /**
     * @param DatabaseName the DatabaseName to set
     */
    public void setDatabaseName(String DatabaseName) {
	this.DatabaseName = DatabaseName;
    }

    /**
     * @return the S3Settings
     */
    public String getS3Settings() {
        return S3Settings;
    }

    /**
     * @param S3Settings the S3Settings to set
     */
    public void setS3Settings(String S3Settings) {
	this.S3Settings = S3Settings;
    }

    /**
     * @return the EngineName
     */
    public String getEngineName() {
        return EngineName;
    }

    /**
     * @param EngineName the EngineName to set
     */
    public void setEngineName(String EngineName) {
	this.EngineName = EngineName;
    }

    /**
     * @return the DynamoDbSettings
     */
    public String getDynamoDbSettings() {
        return DynamoDbSettings;
    }

    /**
     * @param DynamoDbSettings the DynamoDbSettings to set
     */
    public void setDynamoDbSettings(String DynamoDbSettings) {
	this.DynamoDbSettings = DynamoDbSettings;
    }

    /**
     * @return the Username
     */
    public String getUsername() {
        return Username;
    }

    /**
     * @param Username the Username to set
     */
    public void setUsername(String Username) {
	this.Username = Username;
    }

    /**
     * @return the SslMode
     */
    public String getSslMode() {
        return SslMode;
    }

    /**
     * @param SslMode the SslMode to set
     */
    public void setSslMode(String SslMode) {
	this.SslMode = SslMode;
    }

    /**
     * @return the ExtraConnectionAttributes
     */
    public String getExtraConnectionAttributes() {
        return ExtraConnectionAttributes;
    }

    /**
     * @param ExtraConnectionAttributes the ExtraConnectionAttributes to set
     */
    public void setExtraConnectionAttributes(String ExtraConnectionAttributes) {
	this.ExtraConnectionAttributes = ExtraConnectionAttributes;
    }

    /**
     * @return the ServerName
     */
    public String getServerName() {
        return ServerName;
    }

    /**
     * @param ServerName the ServerName to set
     */
    public void setServerName(String ServerName) {
	this.ServerName = ServerName;
    }

    /**
     * @return the EndpointType
     */
    public String getEndpointType() {
        return EndpointType;
    }

    /**
     * @param EndpointType the EndpointType to set
     */
    public void setEndpointType(String EndpointType) {
	this.EndpointType = EndpointType;
    }

    /**
     * @return the Tags
     */
    public String getTags() {
        return Tags;
    }

    /**
     * @param Tags the Tags to set
     */
    public void setTags(String Tags) {
	this.Tags = Tags;
    }

    /**
     * @return the CertificateArn
     */
    public String getCertificateArn() {
        return CertificateArn;
    }

    /**
     * @param CertificateArn the CertificateArn to set
     */
    public void setCertificateArn(String CertificateArn) {
	this.CertificateArn = CertificateArn;
    }

    /**
     * @return the EndpointIdentifier
     */
    public String getEndpointIdentifier() {
        return EndpointIdentifier;
    }

    /**
     * @param EndpointIdentifier the EndpointIdentifier to set
     */
    public void setEndpointIdentifier(String EndpointIdentifier) {
	this.EndpointIdentifier = EndpointIdentifier;
    }

    /**
     * @return the MongoDbSettings
     */
    public String getMongoDbSettings() {
        return MongoDbSettings;
    }

    /**
     * @param MongoDbSettings the MongoDbSettings to set
     */
    public void setMongoDbSettings(String MongoDbSettings) {
	this.MongoDbSettings = MongoDbSettings;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
	this.Password = Password;
    }


}