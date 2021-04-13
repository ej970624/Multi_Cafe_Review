# Multi-Cafe-Review

## API 정리

### ☕CAFE

-----------------------------------------
### 🧾MENU

----------------------------------------
### ✒REVIEW
**[리뷰 CRUD]**

`POST` **/api/user/review** : 리뷰 추가 (Reivew 객체 보내줘야함)
```json
{
  "reviewId":"",
  "reviewDate":"",
  "content":"리뷰내용",
  "good:":"",
  "grade":"",
  "userId":"sunga",
  "menuId":50000130,
  "sweet":"",
  "bitter":"",
  "sour":""
}
```
`GET` **/api/review/{menuId}** :  메뉴별 리뷰 가져오기

`GET` **/api/review/good/{menuId}** : 좋아요 많은 순으로 리뷰 가져오기

`DELETE` **/api/review/{reviewId}** : 리뷰삭제

`PUT` **/api/user/review** : 리뷰 수정(Review 객체로 넘겨줘야 함) 

`GET` **/api/user/review/my/{userId}** : 특정 사용자가 작성한 리뷰 리스트 보여주기

</br>

**[리뷰 좋아요]**

`POST` **/api/user/review/good/count** : 리뷰 좋아요/좋아요 취소 (ReviewLike 객체 보내줘야함) 
  - reviewLike 테이블에 넘겨주는 객체가 없는 상태면 테이블에 해당 객체 삽입&좋아요+1 , 있는 상태면 해당 객체 삭제&좋아요-1
  - 같은 ID로 한번 Post하면(좋아요) 1 리턴, 다시 Post 하면 (좋아요 취소) 0 리턴

```
{
  "reviewLikeId":"",
  "reviewId":70000013,
  "userId":"sunga"
} 
```
</br>

**[리뷰 신고 기능]**

`GET` **/api/user/{userId}/reports** : 신고횟수로 리뷰를 작성할 수 있는 사용자인지 판단 (true/false) 

`PUT` **/api/review/{reviewId}/{userId}/reports** : 신고 버튼 누를 때 처리할 일 

`GET` **/api/review/{reviewId}/{userId}/reports** : 사용자가 이미 신고한 리뷰인지 판단(0일 때 신고 가능) 

</br>

----------------------------------------
### 👨‍👩‍👧USER



-----------------------------------------
### ⚙ADMIN
**[카페]**

`POST` **/api/admin/cafe** : 카페 추가
```
{
  "cafeId":"",
  "name":"스타벅스",
  "image":"url"
}
```

`DELETE` **/api/admin/cafe/{cafeId}** : 카페 삭제 </br></br>


**[리뷰 관련]**

`GET` **/api/admin/review/reports** : 관리자페이지에서 신고건수 10회 이상인 리뷰 조회 </br>

`DELETE` **/api/admin/review/{reviewId}** : 관리자 페이지에서 리뷰 삭제 </br>
