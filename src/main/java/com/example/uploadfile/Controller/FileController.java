package com.example.uploadfile.Controller;

//import com.example.uploadfile.Service.FileServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@RestController
public class FileController {

//    @Autowired
//    private FileServiceImpl fileService;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) throws IOException {
        System.out.println(file.getOriginalFilename());
        System.out.println(file.getContentType());
        System.out.println(file.getSize());
        try {
            System.out.println(file.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // cho ảnh vào trong folder image
        String pathDirectory ="D:\\IdeaProjects\\LearnSpringBoot\\uploadFile\\src\\main\\resources\\static\\image";
        Files.copy(file.getInputStream(), Paths.get(pathDirectory+ File.separator+file.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
        return ResponseEntity.status(HttpStatus.OK).body("Upload successfully");
    }

}
