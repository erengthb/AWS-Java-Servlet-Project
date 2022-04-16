package net.codejava.aws;

import java.util.List;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.S3ObjectSummary;

public class ListFiles {
static String bucket_name = "erndmrhn";
	
	public static void main(String[] args) {
	
		final AmazonS3 s3 =  AmazonS3ClientBuilder.defaultClient();
		ObjectListing ol =  s3.listObjects(bucket_name);
		List<S3ObjectSummary> objects = ol.getObjectSummaries();
		
		for(S3ObjectSummary os: objects) {
			System.out.println("Your  bucket objects : "+os.getKey());
			
			
		}
		
		
		
	}

}
