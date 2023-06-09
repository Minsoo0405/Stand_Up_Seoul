package com.project.backend.places.service;

import com.project.backend.places.dto.HotplacesDto;
import com.project.backend.places.repository.entity.Hotplaces;

public interface HotPlacesService {

    HotplacesDto transfer(Hotplaces entity);

    default HotplacesDto enttiyToDto(Hotplaces hotplaces){
        HotplacesDto dto = HotplacesDto.builder()
                .id(hotplaces.getId())
                .contentId(hotplaces.getContentId())
                .contentType(hotplaces.getContentType())
                .mapX(hotplaces.getMapX())
                .mapY(hotplaces.getMapY())
                .title(hotplaces.getTitle())
//                .subway(hotplaces.getSubway())
                .fileName(hotplaces.getFileName())
                .address(hotplaces.getAddress())
                .createdDate(hotplaces.getCreatedDate())
                .build();
        return dto;
    }
}
