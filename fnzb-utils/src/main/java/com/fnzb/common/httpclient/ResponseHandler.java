package com.fnzb.common.httpclient;

import org.apache.http.HttpResponse;

public interface ResponseHandler<T> {

    T handle(HttpResponse response) throws HttpAccessException, CallbackWrapException;

}

