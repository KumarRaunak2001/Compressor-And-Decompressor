/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp_decomp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author Raunak
 */
public class compressor {
    public static void method(File file) throws IOException{ 
        String fileDirectory=file.getParent(); 
        FileInputStream fis=new FileInputStream(file); // help in reading the byte of array 
          FileOutputStream fos=new FileOutputStream(fileDirectory+"/CompressedFile.gz"); 
          // it helps in wriiting the byts of array.
        GZIPOutputStream gzip=new GZIPOutputStream(fos); 
        // those output string is a compreesd one .
        
        byte[] buffer=new byte[1024]; 
        int len; // representing the length of the file input stream 
        while((len=fis.read(buffer))!=-1) { 
            gzip.write(buffer,0,len); // it start wriiting from the first charcacter 
            // 0 >> Represent ofset Value or length from where u want to start
            // len mean number of bytes 
        
        
          // buffer array represents the data  
          
        }
        
      
        gzip.close();

        fos.close(); 
        fis.close(); 
        
        // close all the stream
    } 
    public static void main(String[] args) throws IOException{
File path=new File("/Users/Raunak/Downloads/Compressor/compressordecompressor/testfile"); 
method(path);
        
    }
} 
