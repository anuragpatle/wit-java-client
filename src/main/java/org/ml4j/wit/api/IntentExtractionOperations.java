/*
 * Copyright 2015 the original author or authors.
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
package org.ml4j.wit.api;

import java.io.File;
import java.io.IOException;

import org.ml4j.wit.api.impl.json.Context;
import org.ml4j.wit.api.impl.json.IntentExtractionResponse;

/**
 * @author Michael Lavelle
 */
public interface IntentExtractionOperations {

	public IntentExtractionResponse getIntent(String text);
	
	public IntentExtractionResponse getIntent(String text,Context context);
	
	public IntentExtractionResponse getPreviousIntentById(String id);


	public IntentExtractionResponse getIntent(File audioFile,Context context) throws IOException;


	public IntentExtractionResponse getIntent(File audioFile) throws IOException;

}
