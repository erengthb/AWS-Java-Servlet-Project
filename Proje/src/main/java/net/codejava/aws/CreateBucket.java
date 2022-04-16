package net.codejava.aws;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.services.s3.model.Bucket;


public class CreateBucket {

	
	public static void  main(String args) {
		
		
		final AmazonS3 s3 =  AmazonS3ClientBuilder.defaultClient();
		String bucket_name= "erndmrhn";
		
		try {
			s3.createBucket(bucket_name);
			
		}catch (AmazonS3Exception e) {
			System.err.println(e.getErrorMessage());
		}
		
		
	}
	
	
}
