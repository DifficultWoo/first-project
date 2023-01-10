package com.greenart.firstproject.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.greenart.firstproject.entity.UserEntity;
import com.greenart.firstproject.vo.superadmin.AdminUserVO;

public interface UserRepository extends JpaRepository<UserEntity, Long>{
    public Integer countByEmail(String eamil);
    public UserEntity findByEmailAndPwd(String eamil, String pwd);
    public UserEntity findByPwd(String pwd);
    @Query(value = "SELECT new com.greenart.firstproject.vo.superadmin.AdminUserVO(u.seq, u.name, u.email, u.nickname, u.birth, u.phone, u.address, u.status, u.regDt) FROM UserEntity u")
    Page<AdminUserVO> findAdminUserVOAll(Pageable pageable);
    @Query(value = "SELECT new com.greenart.firstproject.vo.superadmin.AdminUserVO(u.seq, u.name, u.email, u.nickname, u.birth, u.phone, u.address, u.status, u.regDt) FROM UserEntity u WHERE u.seq = :seq")
    AdminUserVO findAdminUserVOBySeq(@Param("seq") Long seq);
}
