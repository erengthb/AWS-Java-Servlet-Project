package net.codejava.aws;

import java.io.File;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

public class UploadFile {

	public static void main(String[] args) {
		final AmazonS3 s3 =  AmazonS3ClientBuilder.defaultClient();
		// dosya ad? ve path? belirtiyoruz ?al??t?r?ld???nda bucket a dosyay? g?deriyor 
		String bucket_name="erndmrhn";
		String key_name="";
		String file_path="";
		
		try {
			s3.putObject(bucket_name,key_name , new File(file_path));
		} catch (AmazonServiceException e) {
			
			System.err.println(e.getErrorMessage());
			System.exit(1);
		}

	}

}
