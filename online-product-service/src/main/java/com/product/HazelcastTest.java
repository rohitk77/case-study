package com.product;

import java.util.Collection;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

public class HazelcastTest {
	
	public static void main(String[] args)
	{
		ClientConfig clientConfig = new ClientConfig();
		clientConfig.addAddress("localhost:5701");
		clientConfig.setProperty("hazelcast.initial.min.cluster.size","2");
		HazelcastInstance client = HazelcastClient.newHazelcastClient(clientConfig);
		
		HazelcastInstance firstInstance = Hazelcast.newHazelcastInstance(new Config());
		
		HazelcastInstance secondInstance = Hazelcast.newHazelcastInstance(new Config());
		
		// Introducing a sample data in a map using the first instance
		firstInstance.getMap("TEST_MAP").put("key", "test_value");
		
		// Prints the value using the second instance. The result will be 'test_value'
		System.out.println(secondInstance.getMap("TEST_MAP").get("key"));
		
		
		Collection collections = client.getDistributedObjects();
		System.out.println("Distributed Objects length" + collections.size());
		System.out.println("Hazelcast client"+client.getName());
	}

}
