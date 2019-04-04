package src.database.model.deserializer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import src.database.model.Manager;

public class JsonUserDeserializer extends StdDeserializer<List> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected JsonUserDeserializer(Class<List> t) {
		super(t);
	}

	protected JsonUserDeserializer() {
		super(List.class);
	}

	@Override
	public List deserialize(JsonParser parser, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		
		List<Manager> users = new ArrayList<>();
//		
//		JsonNode node = parser.getCodec().readTree(parser);
//		Iterator<JsonNode> elements = null;
//		
//		if (node != null) {
//			JsonNode jsonNode = node.get("_embedded");
//			if (jsonNode != null) {
//				elements = jsonNode.get("users").elements();
//			}
//		}
//
//		if (elements != null) {
//			elements.forEachRemaining(e -> {
//				Manager user = new Manager();
//				user.setAge(e.get("age").numberValue().byteValue());
//				user.setFirstName(e.get("firstName").toString());
//				user.setSurename(e.get("surename").toString());
//				users.add(user);
//			});
//		}

		return users;
	}

}
