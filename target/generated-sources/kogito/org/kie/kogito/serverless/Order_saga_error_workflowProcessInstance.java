package org.kie.kogito.serverless;

public class Order_saga_error_workflowProcessInstance extends org.kie.kogito.process.impl.AbstractProcessInstance<Order_saga_error_workflowModel> {

    public Order_saga_error_workflowProcessInstance(org.kie.kogito.serverless.Order_saga_error_workflowProcess process, Order_saga_error_workflowModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, processRuntime);
    }

    public Order_saga_error_workflowProcessInstance(org.kie.kogito.serverless.Order_saga_error_workflowProcess process, Order_saga_error_workflowModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime) {
        super(process, value, businessKey, processRuntime);
    }

    public Order_saga_error_workflowProcessInstance(org.kie.kogito.serverless.Order_saga_error_workflowProcess process, Order_saga_error_workflowModel value, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, processRuntime, wpi);
    }

    public Order_saga_error_workflowProcessInstance(org.kie.kogito.serverless.Order_saga_error_workflowProcess process, Order_saga_error_workflowModel value, org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        super(process, value, wpi);
    }

    public Order_saga_error_workflowProcessInstance(org.kie.kogito.serverless.Order_saga_error_workflowProcess process, Order_saga_error_workflowModel value, java.lang.String businessKey, org.kie.api.runtime.process.ProcessRuntime processRuntime, org.kie.kogito.correlation.CompositeCorrelation correlation) {
        super(process, value, businessKey, processRuntime, correlation);
    }

    protected java.util.Map<String, Object> bind(Order_saga_error_workflowModel variables) {
        if (null != variables)
            return variables.toMap();
        else
            return new java.util.HashMap();
    }

    protected void unbind(Order_saga_error_workflowModel variables, java.util.Map<String, Object> vmap) {
        variables.fromMap(this.id(), vmap);
    }
}
