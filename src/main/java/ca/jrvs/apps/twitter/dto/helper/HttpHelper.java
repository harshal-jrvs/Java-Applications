package ca.jrvs.apps.twitter.dto.helper;

import org.apache.http.HttpResponse;
import org.apache.http.entity.StringEntity;

import java.net.URI;

public interface HttpHelper {

    org.apache.http.HttpResponse httpPost(URI uri) throws Exception;

    HttpResponse httpPost(URI uri, StringEntity stringEntity);

    org.apache.http.HttpResponse httpGet(URI uri) throws Exception;
}