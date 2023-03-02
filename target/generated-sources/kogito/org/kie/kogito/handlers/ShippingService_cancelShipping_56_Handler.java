package org.kie.kogito.handlers;

import org.kie.kogito.process.workitem.WorkItemExecutionException;

@javax.enterprise.context.ApplicationScoped()
public class ShippingService_cancelShipping_56_Handler implements org.kie.kogito.internal.process.runtime.KogitoWorkItemHandler {

    org.kie.kogito.ShippingService service;

    public ShippingService_cancelShipping_56_Handler() {
        this(new org.kie.kogito.ShippingService());
    }

    @javax.inject.Inject()
    public ShippingService_cancelShipping_56_Handler(org.kie.kogito.ShippingService service) {
        this.service = service;
    }

    public void executeWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
        java.lang.Object result;
        result = service.cancelShipping((java.lang.String) workItem.getParameter("shippingId"));
        workItemManager.completeWorkItem(workItem.getStringId(), java.util.Collections.singletonMap("Parameter", result));
    }

    public void abortWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
    }

    public String getName() {
        return "org.kie.kogito.ShippingService_cancelShipping_56_Handler";
    }
}
