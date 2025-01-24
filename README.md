### 일정 API 설계
|기능  |Method  |URL  |request  |response  |상태코드  |
|--|----|--|--|--|--|
|일정 생성  |`POST`|/api/schedules  |요청  |등록 정보  |200:정상등록|
|전체 일정 조회  |`GET`|/api/schedules/{Id}  |요청  |단건 응답 정보  |200:정상조회|
|선택 일정 조회  |`GET`|/api/schedules  |요청  |다건 응답 정보  |200:정상조회|
|선택 일정 수정  |`PUT`|/api/schedules/{Id}  |요청  |수정정보  |200:정상수정|
|선택 일정 삭제  |`DELETE`|/api/schedules/{{Id}  |요청  |-  |200:정상삭제|


