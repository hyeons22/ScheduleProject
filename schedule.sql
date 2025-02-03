CREATE TABLE schedule(
                         id INT AUTO_INCREMENT PRIMARY KEY COMMENT '번호',
                         user_name VARCHAR(15) COMMENT '작성자명',
                         password VARCHAR(30) COMMENT '비밀번호',
                         work_contents VARCHAR(100) COMMENT '할일',
                         create_date DATE COMMENT '작성일',
                         modify_date DATE COMMENT '수정일'
)