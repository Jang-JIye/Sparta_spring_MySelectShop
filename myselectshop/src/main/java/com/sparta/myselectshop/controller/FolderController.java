package com.sparta.myselectshop.controller;

import com.sparta.myselectshop.dto.FolderRequestDto;
import com.sparta.myselectshop.entity.Folder;
import com.sparta.myselectshop.service.FolderService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class FolderController {

    private final FolderService folderService;

    @PostMapping("/folders")
    public List<Folder> addFolders(
            @RequestBody FolderRequestDto folderRequestDto,
            HttpServletRequest request
    ) {

        List<String> folderNames = folderRequestDto.getFolderNames();

        return folderService.addFolders(folderNames, request);
    }


}