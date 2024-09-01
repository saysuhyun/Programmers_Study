# 🖥 알고리즘 스터디

<table>
  <tr>
    <td>진행 기간</td>
    <td>2024년 9월 7일 ~ </td>
  </tr>
  <tr>
    <td>스터디 장소</td>
    <td>온라인</td>
  </tr>
  <tr>
    <td>정기 스터디 시간</td>
    <td>토요일 10:00 ~ 11:00 [1h]
  </tr>
  <tr>
    <td>플랫폼</td>
    <td>프로그래머스</td>
  </tr>
</table>

<br/>

## 🧑🏻‍🎓 스터디 멤버

<table>
  <tr>
    <td align="center">
      <a href="https://github.com/saysuhyun">
        <img src="https://avatars.githubusercontent.com/u/172836819?v=4" width="100px;" alt=""/>
        <br />
        <sub>최수현</sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/sm9171">
        <img src="https://avatars.githubusercontent.com/u/18053020?v=4" width="100px;" alt=""/>
        <br />
        <sub>나상민</sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/ibmitw">
        <img src="https://avatars.githubusercontent.com/u/43196969?v=4" width="100px;" alt=""/>
        <br />
        <sub>전상현</sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/devheshD">
        <img src="https://avatars.githubusercontent.com/u/72979429?v=4" width="100px;" alt=""/>
        <br />
        <sub>기라성</sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/DanielYY95">
        <img src="https://avatars.githubusercontent.com/u/84573015?v=4" width="100px;" alt=""/>
        <br />
        <sub>양초명</sub>
      </a>
    </td>
    <td align="center">
      <a href="https://github.com/JaeHyunPyun">
        <img src="https://avatars.githubusercontent.com/u/179315815?v=4" width="100px;" alt=""/>
        <br />
        <sub>편재현</sub>
      </a>
    </td>
  </tr>
</table>

<br/>

## 📌 스터디 규칙
- 스터디는 온라인으로 `1시간을 기본`으로 한다. 
  - 각 주차별 맡은 문제의 풀이과정을 발표 후 QnA진행
  - 각자 힘들었던 문제 혹은 풀지 못한 문제가 있다면 같이 공유 후 토의
- `스터디 시작 전까지 PR`을 완료한다.
- 스터디장은 스터디가 끝난 후 PR들을 확인 후 문제가 없으면 MR한다.
- 스터디원은 불참 및 지각, 발표 준비 미흡의 경우 벌금을 내야한다. 
- 스터디 시작 전 미리 연락한 경우에 한 해 총 2번의 벌금 면제를 부여한다. 

<br/>

## 🔍 참여 방법
1. 이 저장소를 `fork` 한다.
2. 생성된 저장소에 `각자 이름`으로 폴더를 생성한다.
3. 알고리즘 풀이 후 원본 저장소에 `PR`를 보낸다.

- 기타 : 모르거나 다 같이 풀이를 했으면 하는 문제에 대해서는 `Issue`를 등록한다
- 아래 나와있는`Repository 폴더 구조`와 `Convention 규칙`을 지키면서 참여한다.

<br/>

## 📁 Repository 폴더 구조
```
{각자 이름}/{주차}/{문제이름}.{확장자}
```

- 💡 예시: `suhyun/1week/김서방 찾기.java`

<br/>

##  ⚠Convention 규칙
> commit 컨벤션은 gitmoji 와 AngularJS Git Commit Message Conventions을 참고했습니다.

### **Issue**
```
 [해당 주차] {문제이름} - {작성자}  
```  
- 💡 예시: `[1주차] 다리놓기 - 최수현` 

### **PR - 알고리즘 문제** 
```
 [해당 주차] 제출 - {이름}  
```
- 💡 예시: `[1주차] 제출 - 최수현` 

### **PR - 알고리즘 문제 외 파일** 
```
 [해당 날짜] {간략한 수정 내역} - {이름}  
```
- 💡 예시: `[2024/09/07]  초기 문서 정리 - 최수현` 

### **Commit - 알고리즘 문제** 
```
 태그: {문제이름}
``` 
- 💡 예시: `feat: 다리놓기` 

### **Commit - 알고리즘 문제 외 파일** 
```
 태그: {파일명} {작업 내용}
```
- 💡 예시: `docs: README.md  전반적인 항목 수정` 

### **태그**
| 태그       | 설명                    |
|:---------|:------------------------|
| feat     | 새로운 문제 추가            |
| fix      | 버그 혹은 충돌 수정             |
| refactor | 코드 리팩토링              |
| comment  | 주석 추가(코드 변경 X) 혹은 오타 수정 |
| docs     | README와 같은 문서 혹은 그 외 파일 수정 및 추가       |
| rename   | 파일, 폴더명 수정 혹은 이동        |
| delete   | 파일, 폴더 삭제        |


<br/>