/*
 * Copyright (c) 2016  Ohmer.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.kotlinthree.andex.component

import android.app.Activity
import android.view.View

/**
 * Created by ohmer on 1/13/16.
 */


/**
 * finds a view that was identified by the id attribute from the XML that
 * was processed in {@link #onCreate}.
 * @param id
 * @return The view that has the given id in the hierarchy or null
 */
fun <T : View> Activity.findView(id: Int): T = findViewById(id) as T