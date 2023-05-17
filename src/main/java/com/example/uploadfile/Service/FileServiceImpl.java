//package com.example.uploadfile.Service;
//
//import com.example.uploadfile.Model.FileEntity;
//import com.example.uploadfile.Repository.FileRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.IOException;
//
//@Service
//public class FileServiceImpl implements FileService {
//
//    @Autowired
//    private FileRepository fileRepository;
//    @Override
//    public FileEntity uploadFile(MultipartFile file) {
//        if(file.isEmpty()){
//            return  null;
//        }
//        FileEntity fileEntity = new FileEntity();
//        fileEntity.setFilename(file.getOriginalFilename());
//        fileEntity.setFileType(file.getContentType());
//        fileEntity.setFileSize(file.getSize());
//        try {
//            fileEntity.setFileData(file.getBytes()  );
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        return fileRepository.save(fileEntity);
//    }
//}
