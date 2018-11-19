
package com.linkedin.samples.page;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.servlet.http.Part;

/**
 *
 * @author Eyitayo Koleoso
 */

@RequestScoped
@Named("fileUpload")
public class FileUploadPageBean {
    
    private double fileSize;
    private String fileType;
    private Part file;

    
    public void completedUpload(){
        if(file != null){
            System.out.println("The filename "+file.getSubmittedFileName());
            System.out.println("The file size "+file.getSize());
            System.out.println("The content encoding "+file.getContentType());
        }
    }
    
    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public Part getFile() {
        return file;
    }

    public void setFile(Part file) {
        this.file = file;
    }

  
}
