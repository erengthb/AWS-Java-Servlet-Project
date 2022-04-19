package net.codejava.aws;

import java.util.List;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.Bucket;

public class ListS3Buckets {

	public static void main ( String args) {
		
		// Amazonda mevcut olan bucketlarý listeler.
		
		
		final AmazonS3 s3 =  AmazonS3ClientBuilder.defaultClient();
		List<Bucket> buckets = s3.listBuckets();
		
		System.out.println("Your Amazon buckets are : ");
		
		for ( Bucket b : buckets) {
			System.out.println("* "+b.getName());
			
		}
		
		
		
	}
	
}
