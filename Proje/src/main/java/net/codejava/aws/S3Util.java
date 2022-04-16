package net.codejava.aws;

import java.io.IOException;
import java.io.InputStream;

import software.amazon.awssdk.awscore.exception.AwsServiceException;
import software.amazon.awssdk.core.exception.SdkClientException;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;
import software.amazon.awssdk.services.s3.model.S3Exception;

public class S3Util {

	public static final String BUCKET = "erndmrhn";
	public static void uploadFile (String fileName , InputStream inputStream) throws S3Exception, AwsServiceException, SdkClientException, IOException {
		
		Region region = Region.US_WEST_2;
		S3Client ec2Client = S3Client.builder()
		        .region(region)
		        .build();
		
		S3Client client = S3Client.builder().build();
		
		PutObjectRequest request = PutObjectRequest.builder()
				                                   .bucket(BUCKET)
				                                   .key(fileName)
				                                   .build();
		
		
		
		client.putObject(request , RequestBody.fromInputStream(inputStream, inputStream.available()));
		
		
		
		
	}
	
}