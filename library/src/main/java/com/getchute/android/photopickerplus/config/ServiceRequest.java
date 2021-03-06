/**
 * The MIT License (MIT)

Copyright (c) 2013 Chute

Permission is hereby granted, free of charge, to any person obtaining a copy of
this software and associated documentation files (the "Software"), to deal in
the Software without restriction, including without limitation the rights to
use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
the Software, and to permit persons to whom the Software is furnished to do so,
subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.getchute.android.photopickerplus.config;

import com.dg.libs.rest.callbacks.HttpCallback;
import com.dg.libs.rest.client.BaseRestClient.RequestMethod;
import com.dg.libs.rest.requests.ParameterHttpRequestImpl;

/**
 * The {@link ServiceRequest} used for exchanging messages with the server
 * (request-response). It uses the {@link ParameterHttpRequestImpl}
 * implementation.
 * 
 */
public class ServiceRequest extends ParameterHttpRequestImpl<ServiceResponseModel> {

  private String url;

  public ServiceRequest(String url,
      HttpCallback<ServiceResponseModel> callback) {
    super(RequestMethod.GET, new ServiceResponseParser(), callback);
    this.url = url;
  }

  @Override
  protected String getUrl() {
    return url;
  }

}
