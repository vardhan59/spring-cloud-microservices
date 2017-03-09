/**
 * 
 */
package com.example.service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.example.mdoel.TollUsage;
import com.example.repository.TollUsageFeignMSRepo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;

/**
 * @author Administrator
 *
 */
//@RestController
@Service
public class TollService implements TollServiceintf{

	/*@Autowired
	DiscoveryClient client;*/
	
	@Autowired
	TollUsageFeignMSRepo feignRepo;
	
	@Override
	@HystrixCommand(fallbackMethod="listofTollUsageFallBack")
	public List<TollUsage> findAll(){
		return feignRepo.findAll();
	}
	
	public List<TollUsage> listofTollUsageFallBack(){
		List<TollUsage> list = new ArrayList<>();
		list.add(new TollUsage("dummyid","dummystation","dummylicenseplate","dummytimeStamp"));
		return list;
	}
	
	@Override
	public TollUsage getById(String id){
		return feignRepo.findById(id);
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
