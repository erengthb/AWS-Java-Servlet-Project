package net.codejava.aws;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;


import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.S3Object;

public class Read {

	public static void main(String[] args) {
		
		String key_name = "";
		String bucket_name ="";
		
		
		
		final AmazonS3 s3 =  AmazonS3ClientBuilder.defaultClient();
		
		S3Object object = s3.getObject(new GetObjectRequest(bucket_name,key_name));
		InputStream objectData = object.getObjectContent();
		
		try {
			
			BufferedReader reader = new BufferedReader (new InputStreamReader(object.getObjectContent()));
			
			String line ;
			while ((line = reader.readLine()) != null) {
				
				System.out.println(line);
			}
			
			objectData.close();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}

	}

}
