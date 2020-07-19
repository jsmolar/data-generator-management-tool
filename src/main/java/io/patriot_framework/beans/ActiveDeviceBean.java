/*
 * Copyright 2019 Patriot project
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package io.patriot_framework.beans;

import io.patriot_framework.generator.device.active.ActiveDevice;

import java.util.ArrayList;
import java.util.List;

public class ActiveDeviceBean implements CoAPServer{

    private List<ActiveDevice> active = new ArrayList<>();

    public void startSimulationAll() {
        active.forEach(ActiveDevice::start);
    }

    public void stopSimulationAll() {
        active.forEach(ActiveDevice::stop);
    }

    public void registerToCoAPAll() {
        active.forEach(i -> i.getDevice().registerToCoapServer());
    }

    public List<ActiveDevice> getActive() {
        return active;
    }

    public void setActive(List<ActiveDevice> active) {
        this.active = active;
    }
}
