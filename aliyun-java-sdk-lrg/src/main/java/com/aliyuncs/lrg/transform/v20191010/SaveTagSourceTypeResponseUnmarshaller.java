/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.lrg.transform.v20191010;

import com.aliyuncs.lrg.model.v20191010.SaveTagSourceTypeResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveTagSourceTypeResponseUnmarshaller {

	public static SaveTagSourceTypeResponse unmarshall(SaveTagSourceTypeResponse saveTagSourceTypeResponse, UnmarshallerContext _ctx) {
		
		saveTagSourceTypeResponse.setCode(_ctx.integerValue("SaveTagSourceTypeResponse.code"));
		saveTagSourceTypeResponse.setData(_ctx.mapValue("SaveTagSourceTypeResponse.data"));
		saveTagSourceTypeResponse.setMessage(_ctx.stringValue("SaveTagSourceTypeResponse.message"));
		saveTagSourceTypeResponse.setSuccess(_ctx.booleanValue("SaveTagSourceTypeResponse.success"));
	 
	 	return saveTagSourceTypeResponse;
	}
}