package org.kie.kogito.handlers;

import org.kie.kogito.process.workitem.WorkItemExecutionException;

@javax.enterprise.context.ApplicationScoped()
public class PaymentService_cancelPayment_37_Handler implements org.kie.kogito.internal.process.runtime.KogitoWorkItemHandler {

    org.kie.kogito.PaymentService service;

    public PaymentService_cancelPayment_37_Handler() {
        this(new org.kie.kogito.PaymentService());
    }

    @javax.inject.Inject()
    public PaymentService_cancelPayment_37_Handler(org.kie.kogito.PaymentService service) {
        this.service = service;
    }

    public void executeWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
        java.lang.Object result;
        result = service.cancelPayment((java.lang.String) workItem.getParameter("paymentId"));
        workItemManager.completeWorkItem(workItem.getStringId(), java.util.Collections.singletonMap("Parameter", result));
    }

    public void abortWorkItem(org.kie.kogito.internal.process.runtime.KogitoWorkItem workItem, org.kie.kogito.internal.process.runtime.KogitoWorkItemManager workItemManager) {
    }

    public String getName() {
        return "org.kie.kogito.PaymentService_cancelPayment_37_Handler";
    }
}
