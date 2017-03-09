package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.TollUsage;
import com.example.repository.TollUsageFeignMSRepo;

@RestController
public class TollServiceClient {

	@Autowired
	TollUsageFeignMSRepo feignMSRepo;
	
	@RequestMapping(value="/client")
	public List<TollUsage> findAll() {
		return feignMSRepo.findAll();
	}
	
	@RequestMapping(value="/client/{id}")
	public TollUsage findById(@PathVariable("id") String id) {
		return feignMSRepo.findById(id);
	}
	
	/*@Autowired
	DiscoveryClient client;

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/client")
	public List<TollUsage> findAll() {
		List<ServiceInstance> list = client.getInstances("tollusagems");
		ServiceInstance instance = list.get(0);
		URI uri = instance.getUri();
		List<TollUsage> tolls = null;
		try {
			tolls = new RestTemplate().getForEntity(new URI(uri.toString().concat("/tolls")), List.class).getBody();
		} catch (RestClientException | URISyntaxException e) {
			e.printStackTrace();
		}
		return tolls;
	}*/
}
