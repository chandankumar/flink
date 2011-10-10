/***********************************************************************************************************************
 *
 * Copyright (C) 2010 by the Stratosphere project (http://stratosphere.eu)
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 **********************************************************************************************************************/


package eu.stratosphere.pact.test.testPrograms.tpch9;

import eu.stratosphere.pact.common.io.output.TextOutputFormat;
import eu.stratosphere.pact.common.type.KeyValuePair;
import eu.stratosphere.pact.common.type.base.PactString;

public class StringIntPairStringDataOutFormat extends TextOutputFormat<StringIntPair, PactString> {

	@Override
	public byte[] writeLine(KeyValuePair<StringIntPair, PactString> pair) {
		StringIntPair key = pair.getKey();
		return (key.getFirst().toString() + "|" + key.getSecond().toString() + "|" + pair.getValue().toString() + "\n").getBytes();
	}

}
