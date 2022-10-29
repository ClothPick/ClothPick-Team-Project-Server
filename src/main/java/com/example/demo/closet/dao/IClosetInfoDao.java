package com.example.demo.closet.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.closet.vo.ClosetInfoVo;

@Mapper
public interface IClosetInfoDao {
	public List<ClosetInfoVo> ClosetInfoAllListDao(); // 옷 정보 조회
	public int ClosetInfoWrite(Map<String, Object> map); // 옷 정보 작성
	public int ClosetInfoEditDao(Map<String, String> map); // 옷 정보 수정
	public int ClosetInfoDeleteDao(Map<String,Object> map); // 옷 정보 삭제
}