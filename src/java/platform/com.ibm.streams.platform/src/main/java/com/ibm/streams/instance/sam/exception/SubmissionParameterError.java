/*
 * Copyright 2021 IBM Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ibm.streams.instance.sam.exception;

import com.ibm.streams.messages.StreamsRuntimeMessagesKey.Key;

public class SubmissionParameterError extends SAMException {

  private static final long serialVersionUID = -5476585315531291002L;

  public SubmissionParameterError(String param) {
    super(Key.SAMSubmissionParameterError, param);
  }
}