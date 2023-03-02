package org.kie.kogito.handlers;

import org.kie.kogito.process.workitem.WorkItemExecutionException;

@javax.enterprise.context.ApplicationScoped()
public class StockService_reserveStock_7_Handler implements org.kie.kogito.internal.process.runtime.KogitoWorkItemHandler {

    org.kie.kogito.StockService service;

    public StockService_reserveStock_7_Handler() {
        this(new org.kie.kogito.StockService());
    }

    @javax.inject.Inject()
    public StockService_reserveStock_7_Handler(org.kie.kogito.StockService service) {
        this.service = service;
    }

    public void executeWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
        java.lang.Object result;
        result = service.reserveStock((java.lang.String) workItem.getParameter("orderId"), (java.lang.String) workItem.getParameter("failService"));
        workItemManager.completeWorkItem(workItem.getStringId(), java.util.Collections.singletonMap("Parameter", result));
    }

    public void abortWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
    }

    public String getName() {
        return "org.kie.kogito.StockService_reserveStock_7_Handler";
    }
}
