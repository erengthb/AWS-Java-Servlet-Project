package net.codejava.aws;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

public class DeleteFile {

	public static void main(String[] args) {
		
		
		final AmazonS3 s3 =  AmazonS3ClientBuilder.defaultClient();

		String bucket_name = "erndmrhn";              // buraya amazondaki bucket ad�n� yaz�yoruz
		String object_key = "\"b.jpg";                   // Buraya amazondaki silmek istedi�imiz dosyan�n ad�n� veriyoruz
		
		try {
			
			s3.deleteObject(bucket_name , object_key);
         			
			
		}  catch (AmazonServiceException e) {
			
			System.err.println(e.getErrorMessage());
			System.exit(1);
			
		}
		
		
		
		
	}

}
