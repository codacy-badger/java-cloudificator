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
public class AwsPropertiesCwAlarm {

    /**
     * Used only for alarms that are based on percentiles. Specifies whether to evaluate the data and potentially change the alarm state if there are too few data points to be statistically significant. 
     */
    private String EvaluateLowSampleCountPercentile;

    /**
     * The percentile statistic for the metric. Specify a value between p0.0 and p100. 
     */
    private String ExtendedStatistic;

    /**
     * The arithmetic operation to use when comparing the specified Statistic and Threshold. AWS CloudFormation uses the value of Statistic as the first operand. 
     */
    private String ComparisonOperator;

    /**
     * Sets how this alarm is to handle missing data points. If TreatMissingData is omitted, the default behavior of missing is used. For more information, see PutMetricAlarm in the Amazon CloudWatch API Reference and Configuring How CloudWatch Alarms Treats Missing Data in the Amazon CloudWatch User Guide. 
     */
    private String TreatMissingData;

    /**
     * The dimensions of the metric for the alarm. 
     */
    private String Dimensions;

    /**
     * The time over which the specified statistic is applied. Specify time in seconds, in multiples of 60. 
     */
    private String Period;

    /**
     * The number of periods over which data is compared to the specified threshold. 
     */
    private String EvaluationPeriods;

    /**
     * The unit for the metric that is associated with the alarm. 
     */
    private String Unit;

    /**
     * The namespace of the metric that is associated with the alarm. 
     */
    private String Namespace;

    /**
     * The list of actions to execute when this alarm transitions into an OK state. Specify each action as an Amazon Resource Number (ARN). Currently, the only action supported is publishing to an SNS topic or an Auto Scaling policy. 
     */
    private String OKActions;

    /**
     * The list of actions to execute when this alarm transitions into an ALARM state from any other state. Specify each action as an Amazon Resource Name (ARN). For more information about creating alarms and the actions that you can specify, see PutMetricAlarm in the Amazon CloudWatch API Reference and Creating Amazon CloudWatch Alarms in the Amazon CloudWatch User Guide. 
     */
    private String AlarmActions;

    /**
     * The name of the metric associated with the alarm. For more information about the metrics that you can specify, see Amazon CloudWatch Namespaces, Dimensions, and Metrics Reference in the Amazon CloudWatch User Guide. 
     */
    private String MetricName;

    /**
     * Indicates whether actions should be executed during changes to the CloudWatch alarm's state. 
     */
    private String ActionsEnabled;

    /**
     * The description of the alarm. 
     */
    private String AlarmDescription;

    /**
     * A name for the alarm. If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the alarm name. For more information, see Name Type. 
     */
    private String AlarmName;

    /**
     * The statistic to apply to the alarm's associated metric. 
     */
    private String Statistic;

    /**
     * The list of actions to execute when this alarm transitions into an INSUFFICIENT_DATA state. Specify each action as an Amazon Resource Number (ARN). Currently, the only action supported is publishing to an Amazon SNS topic or an Auto Scaling policy. 
     */
    private String InsufficientDataActions;

    /**
     * The value against which the specified statistic is compared. 
     */
    private String Threshold;

    /**
     * @return the EvaluateLowSampleCountPercentile
     */
    public String getEvaluateLowSampleCountPercentile() {
        return EvaluateLowSampleCountPercentile;
    }

    /**
     * @param EvaluateLowSampleCountPercentile the EvaluateLowSampleCountPercentile to set
     */
    public void setEvaluateLowSampleCountPercentile(String EvaluateLowSampleCountPercentile) {
	this.EvaluateLowSampleCountPercentile = EvaluateLowSampleCountPercentile;
    }

    /**
     * @return the ExtendedStatistic
     */
    public String getExtendedStatistic() {
        return ExtendedStatistic;
    }

    /**
     * @param ExtendedStatistic the ExtendedStatistic to set
     */
    public void setExtendedStatistic(String ExtendedStatistic) {
	this.ExtendedStatistic = ExtendedStatistic;
    }

    /**
     * @return the ComparisonOperator
     */
    public String getComparisonOperator() {
        return ComparisonOperator;
    }

    /**
     * @param ComparisonOperator the ComparisonOperator to set
     */
    public void setComparisonOperator(String ComparisonOperator) {
	this.ComparisonOperator = ComparisonOperator;
    }

    /**
     * @return the TreatMissingData
     */
    public String getTreatMissingData() {
        return TreatMissingData;
    }

    /**
     * @param TreatMissingData the TreatMissingData to set
     */
    public void setTreatMissingData(String TreatMissingData) {
	this.TreatMissingData = TreatMissingData;
    }

    /**
     * @return the Dimensions
     */
    public String getDimensions() {
        return Dimensions;
    }

    /**
     * @param Dimensions the Dimensions to set
     */
    public void setDimensions(String Dimensions) {
	this.Dimensions = Dimensions;
    }

    /**
     * @return the Period
     */
    public String getPeriod() {
        return Period;
    }

    /**
     * @param Period the Period to set
     */
    public void setPeriod(String Period) {
	this.Period = Period;
    }

    /**
     * @return the EvaluationPeriods
     */
    public String getEvaluationPeriods() {
        return EvaluationPeriods;
    }

    /**
     * @param EvaluationPeriods the EvaluationPeriods to set
     */
    public void setEvaluationPeriods(String EvaluationPeriods) {
	this.EvaluationPeriods = EvaluationPeriods;
    }

    /**
     * @return the Unit
     */
    public String getUnit() {
        return Unit;
    }

    /**
     * @param Unit the Unit to set
     */
    public void setUnit(String Unit) {
	this.Unit = Unit;
    }

    /**
     * @return the Namespace
     */
    public String getNamespace() {
        return Namespace;
    }

    /**
     * @param Namespace the Namespace to set
     */
    public void setNamespace(String Namespace) {
	this.Namespace = Namespace;
    }

    /**
     * @return the OKActions
     */
    public String getOKActions() {
        return OKActions;
    }

    /**
     * @param OKActions the OKActions to set
     */
    public void setOKActions(String OKActions) {
	this.OKActions = OKActions;
    }

    /**
     * @return the AlarmActions
     */
    public String getAlarmActions() {
        return AlarmActions;
    }

    /**
     * @param AlarmActions the AlarmActions to set
     */
    public void setAlarmActions(String AlarmActions) {
	this.AlarmActions = AlarmActions;
    }

    /**
     * @return the MetricName
     */
    public String getMetricName() {
        return MetricName;
    }

    /**
     * @param MetricName the MetricName to set
     */
    public void setMetricName(String MetricName) {
	this.MetricName = MetricName;
    }

    /**
     * @return the ActionsEnabled
     */
    public String getActionsEnabled() {
        return ActionsEnabled;
    }

    /**
     * @param ActionsEnabled the ActionsEnabled to set
     */
    public void setActionsEnabled(String ActionsEnabled) {
	this.ActionsEnabled = ActionsEnabled;
    }

    /**
     * @return the AlarmDescription
     */
    public String getAlarmDescription() {
        return AlarmDescription;
    }

    /**
     * @param AlarmDescription the AlarmDescription to set
     */
    public void setAlarmDescription(String AlarmDescription) {
	this.AlarmDescription = AlarmDescription;
    }

    /**
     * @return the AlarmName
     */
    public String getAlarmName() {
        return AlarmName;
    }

    /**
     * @param AlarmName the AlarmName to set
     */
    public void setAlarmName(String AlarmName) {
	this.AlarmName = AlarmName;
    }

    /**
     * @return the Statistic
     */
    public String getStatistic() {
        return Statistic;
    }

    /**
     * @param Statistic the Statistic to set
     */
    public void setStatistic(String Statistic) {
	this.Statistic = Statistic;
    }

    /**
     * @return the InsufficientDataActions
     */
    public String getInsufficientDataActions() {
        return InsufficientDataActions;
    }

    /**
     * @param InsufficientDataActions the InsufficientDataActions to set
     */
    public void setInsufficientDataActions(String InsufficientDataActions) {
	this.InsufficientDataActions = InsufficientDataActions;
    }

    /**
     * @return the Threshold
     */
    public String getThreshold() {
        return Threshold;
    }

    /**
     * @param Threshold the Threshold to set
     */
    public void setThreshold(String Threshold) {
	this.Threshold = Threshold;
    }


}