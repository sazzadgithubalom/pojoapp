package com.mosambee.utils;


import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.mosambee.model.MessageEventDto;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class MessageDtoToJsonConverter {

	public MessageEventDto getJSonPayload(String messageEventRequest) {
		Gson gson = new Gson();
		MessageEventDto messageRequest = gson.fromJson(messageEventRequest, MessageEventDto.class);
		try {
			JSONObject payload = new JSONObject(messageEventRequest);
			log.debug("coverted string to payload : {}", payload );


		} catch (JSONException jsonException) {
			log.debug("exception occured while building payload from string : {}", jsonException.getMessage());
		}

		return messageRequest;
	}
}
