package net.codejava.aws;

import java.io.File;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.s3.transfer.MultipleFileUpload;
import com.amazonaws.services.s3.transfer.TransferManager;

public class WriteFolder {

	public static void main(String[] args) {
		
		//lokalden amazon servislerine direkt dosya yazd?rma i?leminis sa?l?yor
		
		
		TransferManager xfer_mgr = new TransferManager();
		
		String dir_path = "";
		
		String key_prefix = "";
		
		String bucket_name ="";
		
		boolean recursive = false ;
		
		MultipleFileUpload  xfer = xfer_mgr.uploadDirectory(bucket_name, key_prefix, new File (dir_path), recursive);
		
		try {
			xfer.waitForCompletion();
			
		}catch (AmazonServiceException e) {
			System.out.println("Amazon service error : "+e.getMessage());
			System.exit(1);
			
		}catch (AmazonClientException e) {
			System.out.println("Aazon client error : "+e.getMessage());
		    System.exit(1);
		    
		}catch (InterruptedException e) {
			
			System.err.println(" Transfer interrupted : "+e.getMessage());
			System.exit(1);
			
		}
		
		xfer_mgr.shutdownNow();
		

	}

}
