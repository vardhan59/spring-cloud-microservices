/**
 * 
 */
package com.example.web;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.example.mdoel.TollUsage;
import com.example.repository.TollUsageFeignMSRepo;
import com.example.service.TollServiceintf;

/**
 * @author Administrator
 *
 */
@RestController
public class TollRestApi {

	/*@Autowired
	DiscoveryClient client;*/
	
	@Autowired
	TollServiceintf tollServiceintf;
	
	@RequestMapping("/client")
	public List<TollUsage> findAll(){
		return tollServiceintf.findAll();
	}
	
	@RequestMapping(value="/client/{id}")
	public TollUsage getById(@PathVariable("id") String id){
		return tollServiceintf.getById(id);
	}
	
	
	/*@SuppressWarnings("unchecked")
	@RequestMapping(value="/client")
	public List<TollUsage> findAll(){
		List<ServiceInstance> list = client.getInstances("tollusagems");
		ServiceInstance serviceInstance=list.get(0);
		URI uri=serviceInstance.getUri();
		List<TollUsage> tolls=null;
		try {
			tolls = new RestTemplate().getForEntity(new URI(uri.toString().concat("/tolls")), List.class).getBody();
		} catch (RestClientException | URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tolls;
	}*/
}
