CREATE TABLE schedule(
                         id INT AUTO_INCREMENT PRIMARY KEY COMMENT '번호',
                         name VARCHAR(15) COMMENT '작성자명',
                         password VARCHAR(30) COMMENT '비밀번호',
                         title VARCHAR(30) COMMENT '제목',
                         contents VARCHAR(100) COMMENT '할일',
                         created_date DATE COMMENT '작성일',
                         modified_date DATE COMMENT '수정일'
);