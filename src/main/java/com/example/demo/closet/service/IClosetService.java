package com.example.demo.closet.service;

import java.util.List;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import com.example.demo.closet.vo.ClosetImgInfoVo;
import com.example.demo.closet.vo.ClosetInfoVo;
import com.example.demo.closet.vo.ConnectClosetImgVo;

public interface IClosetService {
	// IClosetImgInfoDao - 옷장 이미지 정보
	public String ClosetImgInfoUploadDao(MultipartFile file); // 옷 이미지 추가(작성)
//	public String ClosetImgInfoGetDao(); // 옷 이미지 정보 get
	
	// IClosetInfoDao - 옷장 정보
	public List<ClosetInfoVo> ClosetInfoAllListDao(); 
	public String ClosetInfoWrite(ClosetInfoVo closetInfoVo); // 옷 정보 작성
	public int ClosetInfoEditDao(ClosetInfoVo ClosetInfoVo, String clothId); // 옷 정보 수정
	public int ClosetInfoDeleteDao(String clothId); // 옷 정보 삭제
	
	// IConnectClosetImgDao - 옷,이미지 연결 테이블
	public List<ConnectClosetImgVo> ConnectClosetImgGetDao(); // 조회
	public int ConnectClosetImgPostDao(ConnectClosetImgVo ConnectClosetImgVo); // 작성
	public int ConnectClosetImgDeleteDao(String clothId); // 삭제
}