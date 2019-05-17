package ZAPI_API;
	
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

public class Zapi_Api {

	Client client = ClientBuilder.newClient();
	Entity payload = Entity.json("{  'executions': [    '18',    '17'  ],  'projectId': '10000',  'versionId': '-1',  'clearStatusFlag': true,  'clearDefectMappingFlag': true}");
	Response response = client.target("http://localhost:2990/jira/rest/zapi/latest/cycle/{id}/copy")
	  .request(MediaType.APPLICATION_JSON_TYPE)
	  .put(payload);
/*
	System.out.println("status: " + response.getStatus());
	System.out.println("headers: " + response.getHeaders());
	System.out.println("body:" + response.readEntity(String.class));
*/
}

//Refer
//https://getzephyr.docs.apiary.io/#reference/cycleresource/copy-executions-to-cycle/copy-executions-to-cycle


//JSon
//{
//"jobProgressToken": "0001491865646411-242b71effff9574-0001"
//}


/*
<dependency>
<groupId>org.glassfish.jersey.core</groupId>
<artifactId>jersey-client</artifactId>
<version>2.8</version>
</dependency>
<dependency>
<groupId>org.glassfish.jersey.media</groupId>
<artifactId>jersey-media-json-jackson</artifactId>
<version>2.8</version>
</dependency>
*/

