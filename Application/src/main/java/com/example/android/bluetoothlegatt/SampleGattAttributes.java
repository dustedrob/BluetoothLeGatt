/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.bluetoothlegatt;

import java.util.UUID;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
public class SampleGattAttributes {

    public static final UUID SERVICE_UUID=UUID.fromString("ffc2dedc-bf02-442e-a69d-b5caff5e9b21");
    public static final UUID CHARACTERISTIC_UUID=UUID.fromString("fbdca8dd-1b1d-4a4c-bc07-040e80c1cb63");
    public static final UUID BLE_NOTIFICATION = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
}

