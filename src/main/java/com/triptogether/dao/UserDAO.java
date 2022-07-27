package com.triptogether.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.triptogether.vo.UserVO;

@Mapper
@Repository
public interface UserDAO {
   //ȸ������ - joinForm>joinOk
   public int userInsert(UserVO vo, String filePath);
   //���̵� �ߺ� üũ
   public int idCheck(String id);
   
   //ȸ���������� �� ����>�α��� ���� �������� //user 1�� ����
   public UserVO userSelect(String id);
   //ȸ������ ���� - userEdit>userEditOk
   public int userUpdate(UserVO vo, String filePath);
   
   
   //�α��� (�ӽ�)
   public UserVO loginCheck(UserVO vo);
   public UserVO inquiryOfUserById(String id);
   
   //������ �ҷ��� ���� (userView)
   public UserVO userView(String id);
   
   //ȸ��Ż��	-- 220421 ������ �߰�
   public int userDelete(String id);
   
   // 전체 멤버 선택하기
   public List<UserVO> userAllSelect();
   
   // 관리자 선택 회원삭제
   public int userListMultiDelete(UserVO vo);
}