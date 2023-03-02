package org.kie.kogito.handlers;

import org.kie.kogito.process.workitem.WorkItemExecutionException;

@javax.enterprise.context.ApplicationScoped()
public class OrderService_success_72_Handler implements org.kie.kogito.internal.process.runtime.KogitoWorkItemHandler {

    org.kie.kogito.OrderService service;

    public OrderService_success_72_Handler() {
        this(new org.kie.kogito.OrderService());
    }

    @javax.inject.Inject()
    public OrderService_success_72_Handler(org.kie.kogito.OrderService service) {
        this.service = service;
    }

    public void executeWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
        java.lang.Object result;
        result = service.success((java.lang.String) workItem.getParameter("orderId"));
        workItemManager.completeWorkItem(workItem.getStringId(), java.util.Collections.singletonMap("Parameter", result));
    }

    public void abortWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
    }

    public String getName() {
        return "org.kie.kogito.OrderService_success_72_Handler";
    }
}
