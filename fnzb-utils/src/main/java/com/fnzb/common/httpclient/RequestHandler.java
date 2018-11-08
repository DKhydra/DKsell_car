package com.fnzb.common.httpclient;

import org.apache.http.client.methods.HttpUriRequest;

public interface RequestHandler {

    void handle(HttpUriRequest request);

}

