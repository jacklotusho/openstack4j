/*
 * 
 */
package org.openstack4j.model.workflow;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.workflow.builder.WorkflowExecutionBuilder;

import javax.annotation.Nullable;
import java.util.Map;


/**
 * A workflow execution.
 *
 * @author Renat Akhmerov
 */
public interface WorkflowExecution extends Execution, Buildable<WorkflowExecutionBuilder> {
    /**
     * @return The meta parameters of workflow execution specific to workflow type.
     *      Example: a reverse workflow requires the parameter 'task_name' which
     *      specifies the target task in the workflow graph.
     */
    Map<String, ?> getParameters();

    /**
     * @return The id of the parent task execution.
     */
    @Nullable
    String getTaskExecutionId();

    /**
     * @return The input parameters of this workflow execution.
     */
    Map<String, ?> getInput();

    /**
     * @return The output of this workflow execution.
     */
    Map<String, ?> getOutput();
}
