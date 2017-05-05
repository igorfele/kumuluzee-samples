/*
 *  Copyright (c) 2014-2017 Kumuluz and/or its affiliates
 *  and other contributors as indicated by the @author tags and
 *  the contributor list.
 *
 *  Licensed under the MIT License (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  https://opensource.org/licenses/MIT
 *
 *  The software is provided "AS IS", WITHOUT WARRANTY OF ANY KIND, express or
 *  implied, including but not limited to the warranties of merchantability,
 *  fitness for a particular purpose and noninfringement. in no event shall the
 *  authors or copyright holders be liable for any claim, damages or other
 *  liability, whether in an action of contract, tort or otherwise, arising from,
 *  out of or in connection with the software or the use or other dealings in the
 *  software. See the License for the specific language governing permissions and
 *  limitations under the License.
*/
package com.kumuluz.ee.samples.jaxws;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

/**
 * Created by Benjamin on 26. apr. 2017.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {
            "output"
        }
)
@XmlRootElement(name = "GetCustomersResponse")
public class GetCustomersResponse implements Serializable {

    @XmlElement(required = true)
    private GetCustomersResponseMessage output;

    public GetCustomersResponseMessage getOutput() {
        return output;
    }

    public void setOutput(GetCustomersResponseMessage output) {
        this.output = output;
    }
}