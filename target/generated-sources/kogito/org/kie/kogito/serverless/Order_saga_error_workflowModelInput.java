/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kie.kogito.serverless;

import org.kie.kogito.MapInput;
import org.kie.kogito.MapInputId;
import org.kie.kogito.MapOutput;
import java.util.Map;
import java.util.HashMap;
import org.kie.kogito.MappableToModel;
import org.kie.kogito.Model;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.kie.kogito.ProcessInput;

@org.kie.kogito.codegen.Generated(value = "kogito-codegen", reference = "order_saga_error_workflow", name = "Order_saga_error_workflow", hidden = true)
@ProcessInput(processName = "order_saga_error_workflow")
public class Order_saga_error_workflowModelInput implements Model, MapInput, MapInputId, MapOutput, MappableToModel<Order_saga_error_workflowModel> {

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "workflowdata")
    @javax.validation.Valid()
    @Schema(implementation = java.lang.Object.class)
    private com.fasterxml.jackson.databind.JsonNode workflowdata;

    public com.fasterxml.jackson.databind.JsonNode getWorkflowdata() {
        return workflowdata;
    }

    public void setWorkflowdata(com.fasterxml.jackson.databind.JsonNode workflowdata) {
        this.workflowdata = workflowdata;
    }

    @Override()
    public Order_saga_error_workflowModel toModel() {
        Order_saga_error_workflowModel result = new Order_saga_error_workflowModel();
        result.setWorkflowdata(getWorkflowdata());
        return result;
    }
}
