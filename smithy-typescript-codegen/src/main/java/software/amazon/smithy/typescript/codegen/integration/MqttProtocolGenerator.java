/*
 * Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

 package software.amazon.smithy.typescript.codegen.integration;

import java.util.logging.Logger;
import software.amazon.smithy.model.shapes.OperationShape;
import software.amazon.smithy.model.shapes.ShapeId;
import software.amazon.smithy.typescript.codegen.ApplicationProtocol;

public class MqttProtocolGenerator implements ProtocolGenerator {
    private static final Logger LOGGER = Logger.getLogger(MqttProtocolGenerator.class.getName());

    @Override
    public ShapeId getProtocol() {
        return ShapeId.from("smithy.mqtt#mqttJson");
    }

    @Override
    public ApplicationProtocol getApplicationProtocol() {
        return new ApplicationProtocol("mqtt", null, null, null);
    }

    @Override
    public void generateRequestSerializers(GenerationContext context) {
        LOGGER.info("TODO generateRequestSerializers");
    }

    @Override
    public void generateRequestDeserializers(GenerationContext context) {
        // TODO Auto-generated method stub
        LOGGER.info("TODO generateRequestDeserializers");
    }

    @Override
    public void generateResponseSerializers(GenerationContext context) {
        // TODO Auto-generated method stub
        LOGGER.info("TODO generateResponseSerializers");
    }

    @Override
    public void generateFrameworkErrorSerializer(GenerationContext serverContext) {
        // TODO Auto-generated method stub
        LOGGER.info("TODO generateFrameworkErrorSerializer");
    }

    @Override
    public void generateServiceHandlerFactory(GenerationContext context) {
        // TODO Auto-generated method stub
        LOGGER.info("TODO generateServiceHandlerFactory");
    }

    @Override
    public void generateOperationHandlerFactory(GenerationContext context, OperationShape operation) {
        // TODO Auto-generated method stub
        LOGGER.info("TODO generateOperationHandlerFactory");
    }

    @Override
    public void generateResponseDeserializers(GenerationContext context) {
        // TODO Auto-generated method stub
        LOGGER.info("TODO generateResponseDeserializers");
    }

    @Override
    public void generateProtocolTests(GenerationContext context) {
        // TODO Auto-generated method stub
        LOGGER.info("TODO generateProtocolTests");
    }

}
