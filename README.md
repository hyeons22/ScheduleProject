### 일정 API 설계
|기능  |Method  |URL  |request  |response  |상태코드  |
|--|----|--|--|--|--|
|스케줄 생성  |`POST`|/api/schedules  |요청  |등록 정보  |200:정상등록|
|스케줄 전체 목록 조회  |`GET`|/api/schedules  |요청  |다건 응답 정보  |200:정상조회|
|스케줄 단건 목록 조회  |`GET`|/api/schedules/{id}  |요청  |단건 응답 정보  |200:정상조회|
|스케줄 단건 이름 내용 수정  |`PATCH`|/api/schedules/{id}  |요청  |수정정보  |200:정상수정|
|스케줄 삭제  |`DELETE`|/api/schedules/{id}  |요청  |-  |200:정상삭제|


### ERD
![image](https://github.com/user-attachments/assets/c8c3afa7-e987-4cd9-9d8b-ba44d39641b3)
