package au.edu.scu.s3app;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.GetObjectRequest;
import software.amazon.awssdk.services.s3.model.GetObjectResponse;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;
import software.amazon.awssdk.services.s3.model.ListObjectsV2Request;
import software.amazon.awssdk.services.s3.model.ListObjectsV2Response;
import software.amazon.awssdk.services.s3.paginators.ListObjectsV2Iterable;
import software.amazon.awssdk.services.s3.model.DeleteObjectRequest;
import software.amazon.awssdk.services.s3.model.S3Request;
import software.amazon.awssdk.services.s3.model.S3Object;
import software.amazon.awssdk.services.s3.model.NoSuchKeyException;
import software.amazon.awssdk.core.sync.RequestBody;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Path;
import java.nio.file.FileSystems;
import java.nio.file.FileAlreadyExistsException; 

/**
 * S3 bucket!
 *
 */
public class App
{
    public static S3Client s3;
    
    public static void main( String[] args )throws IOException
    {

        
        String bucket = "psudas10a1s3bucket";
        String key = "psudas10-detail.txt"; 
        Region region = Region.US_EAST_1;
        S3Client s3 = S3Client.builder().region(region).build(); 
        
        // //create psudas10-detail.txt file in psudas10a1s3 bucket
        //  try{
        //      byte bytes[] = "name- Sudasinghe Appuhamilage Pasindu Pushpika , Student ID- 22712785 , Unit Studying- 3".getBytes();
        //      ByteBuffer data = ByteBuffer.wrap(bytes);
        //      PutObjectRequest req = PutObjectRequest.builder().bucket(bucket).key(key).build();
        //      s3.putObject (req, RequestBody.fromByteBuffer(data));   
            
        //  }  
            
            
          //create psudas10-detail.tmp in AWS    
          try {
              Path path = FileSystems.getDefault().getPath("psudas10-detail.tmp");
              GetObjectRequest req = GetObjectRequest.builder().bucket(bucket).key(key).build(); 
              GetObjectResponse resp = s3.getObject(req, path);
            
            
          }
           
           catch(NoSuchKeyException e) {
        } 



}


}