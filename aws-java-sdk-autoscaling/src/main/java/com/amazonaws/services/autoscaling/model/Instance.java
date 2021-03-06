/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an EC2 instance.
 * </p>
 */
public class Instance implements Serializable {

    /**
     * The ID of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String instanceId;

    /**
     * The Availability Zone associated with this instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String availabilityZone;

    /**
     * A description of the current lifecycle state. <note> <p>The
     * <code>Quarantined</code> lifecycle state is not used. </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Pending:Wait, Pending:Proceed, Quarantined, InService, Terminating, Terminating:Wait, Terminating:Proceed, Terminated, Detaching, Detached, EnteringStandby, Standby
     */
    private String lifecycleState;

    /**
     * The health status of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String healthStatus;

    /**
     * The launch configuration associated with the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String launchConfigurationName;

    /**
     * The ID of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The ID of the instance.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param instanceId The ID of the instance.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 16<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param instanceId The ID of the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * The Availability Zone associated with this instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The Availability Zone associated with this instance.
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    
    /**
     * The Availability Zone associated with this instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param availabilityZone The Availability Zone associated with this instance.
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    
    /**
     * The Availability Zone associated with this instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param availabilityZone The Availability Zone associated with this instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * A description of the current lifecycle state. <note> <p>The
     * <code>Quarantined</code> lifecycle state is not used. </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Pending:Wait, Pending:Proceed, Quarantined, InService, Terminating, Terminating:Wait, Terminating:Proceed, Terminated, Detaching, Detached, EnteringStandby, Standby
     *
     * @return A description of the current lifecycle state. <note> <p>The
     *         <code>Quarantined</code> lifecycle state is not used. </note>
     *
     * @see LifecycleState
     */
    public String getLifecycleState() {
        return lifecycleState;
    }
    
    /**
     * A description of the current lifecycle state. <note> <p>The
     * <code>Quarantined</code> lifecycle state is not used. </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Pending:Wait, Pending:Proceed, Quarantined, InService, Terminating, Terminating:Wait, Terminating:Proceed, Terminated, Detaching, Detached, EnteringStandby, Standby
     *
     * @param lifecycleState A description of the current lifecycle state. <note> <p>The
     *         <code>Quarantined</code> lifecycle state is not used. </note>
     *
     * @see LifecycleState
     */
    public void setLifecycleState(String lifecycleState) {
        this.lifecycleState = lifecycleState;
    }
    
    /**
     * A description of the current lifecycle state. <note> <p>The
     * <code>Quarantined</code> lifecycle state is not used. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Pending:Wait, Pending:Proceed, Quarantined, InService, Terminating, Terminating:Wait, Terminating:Proceed, Terminated, Detaching, Detached, EnteringStandby, Standby
     *
     * @param lifecycleState A description of the current lifecycle state. <note> <p>The
     *         <code>Quarantined</code> lifecycle state is not used. </note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see LifecycleState
     */
    public Instance withLifecycleState(String lifecycleState) {
        this.lifecycleState = lifecycleState;
        return this;
    }

    /**
     * A description of the current lifecycle state. <note> <p>The
     * <code>Quarantined</code> lifecycle state is not used. </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Pending:Wait, Pending:Proceed, Quarantined, InService, Terminating, Terminating:Wait, Terminating:Proceed, Terminated, Detaching, Detached, EnteringStandby, Standby
     *
     * @param lifecycleState A description of the current lifecycle state. <note> <p>The
     *         <code>Quarantined</code> lifecycle state is not used. </note>
     *
     * @see LifecycleState
     */
    public void setLifecycleState(LifecycleState lifecycleState) {
        this.lifecycleState = lifecycleState.toString();
    }
    
    /**
     * A description of the current lifecycle state. <note> <p>The
     * <code>Quarantined</code> lifecycle state is not used. </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Pending:Wait, Pending:Proceed, Quarantined, InService, Terminating, Terminating:Wait, Terminating:Proceed, Terminated, Detaching, Detached, EnteringStandby, Standby
     *
     * @param lifecycleState A description of the current lifecycle state. <note> <p>The
     *         <code>Quarantined</code> lifecycle state is not used. </note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see LifecycleState
     */
    public Instance withLifecycleState(LifecycleState lifecycleState) {
        this.lifecycleState = lifecycleState.toString();
        return this;
    }

    /**
     * The health status of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The health status of the instance.
     */
    public String getHealthStatus() {
        return healthStatus;
    }
    
    /**
     * The health status of the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param healthStatus The health status of the instance.
     */
    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }
    
    /**
     * The health status of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param healthStatus The health status of the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }

    /**
     * The launch configuration associated with the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The launch configuration associated with the instance.
     */
    public String getLaunchConfigurationName() {
        return launchConfigurationName;
    }
    
    /**
     * The launch configuration associated with the instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param launchConfigurationName The launch configuration associated with the instance.
     */
    public void setLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
    }
    
    /**
     * The launch configuration associated with the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param launchConfigurationName The launch configuration associated with the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Instance withLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getAvailabilityZone() != null) sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getLifecycleState() != null) sb.append("LifecycleState: " + getLifecycleState() + ",");
        if (getHealthStatus() != null) sb.append("HealthStatus: " + getHealthStatus() + ",");
        if (getLaunchConfigurationName() != null) sb.append("LaunchConfigurationName: " + getLaunchConfigurationName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode()); 
        hashCode = prime * hashCode + ((getLifecycleState() == null) ? 0 : getLifecycleState().hashCode()); 
        hashCode = prime * hashCode + ((getHealthStatus() == null) ? 0 : getHealthStatus().hashCode()); 
        hashCode = prime * hashCode + ((getLaunchConfigurationName() == null) ? 0 : getLaunchConfigurationName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Instance == false) return false;
        Instance other = (Instance)obj;
        
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null) return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false) return false; 
        if (other.getLifecycleState() == null ^ this.getLifecycleState() == null) return false;
        if (other.getLifecycleState() != null && other.getLifecycleState().equals(this.getLifecycleState()) == false) return false; 
        if (other.getHealthStatus() == null ^ this.getHealthStatus() == null) return false;
        if (other.getHealthStatus() != null && other.getHealthStatus().equals(this.getHealthStatus()) == false) return false; 
        if (other.getLaunchConfigurationName() == null ^ this.getLaunchConfigurationName() == null) return false;
        if (other.getLaunchConfigurationName() != null && other.getLaunchConfigurationName().equals(this.getLaunchConfigurationName()) == false) return false; 
        return true;
    }
    
}
    