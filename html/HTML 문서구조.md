# HTML 문서 구조 (HTML Structure)

HTML 문서는 요소(Element)들의 계층 구조로 이루어져 있으며, 이 구조를 통해 웹 페이지의 골격과 콘텐츠를 정의합니다.

<img width="450" src="https://github.com/user-attachments/assets/cb74b6a9-23cf-49da-a251-908e50a39373" />

[개념 모음으로 돌아가기](../README.md)

## 목차
* [HTML 태그](#html-태그)
* [Root(루트) 란?](#root루트-란)
* [메타데이터(Metadata)란?](#메타데이터metadata란)
* [상대 경로 vs 절대 경로](#상대-경로-vs-절대-경로)
* [Block vs Inline](#block-vs-inline)
* [주요 태그 모음](#주요-태그-모음)

## HTML 태그

HTML에서 구조를 만들 때 사용하는 기본 단위입니다.<br>
요소의 성격(제목, 이미지, 본문 등)을 브라우저에게 알려주는 역할을 합니다.

```html
<p class="tag">내용</p>
```

+ **시작 태그:** `<p>`

+ **속성(Attribute):** `class="tag"` (속성명="속성값")

+ **종료 태그:** `</p>` (슬래시 `/` 포함)

+ **빈 태그(Empty Tag):** `<br>`, `<img>`, `<input>` 처럼 닫는 태그 없이 단독으로 사용하는 태그입니다.

### 주요 속성값의 종류

+ **텍스트:** `class="container"`, `href="https://..."`

+ **숫자:** `width="300"`, `height="200"`

+ **논리값:** `checked`, `readonly` (존재 자체가 true를 의미)

+ **색상:** `color="red"` 또는 `#ffffff`

+ **함수(JS):** `onclick="alert()"`

[목차로 돌아가기](#목차)

## Root(루트) 란?

계층 구조(Tree Structure)에서 최상위에 위치한 요소를 말합니다.

<img width="450" src="https://github.com/user-attachments/assets/02be4158-68f7-4ddf-b145-521b545f1130" />

HTML 문서에서 루트 요소는 `<html>` 태그입니다.

모든 다른 요소들은 이 루트 요소의 자식(Child)으로 구성되어 연결됩니다.

[목차로 돌아가기](#목차)

## 메타데이터(Metadata)란?

<strong>"데이터에 대한 데이터"</strong>를 의미하며, 브라우저나 검색 엔진에 웹 페이지의 정보를 제공합니다.

<img width="450" src="https://github.com/user-attachments/assets/9ca91222-d93a-4d11-b4c7-5eb68941d267" />

+ HTML의 `<head>` 영역 안에 위치합니다.

+ 주요 정보: 문자 인코딩(UTF-8), 페이지 설명, 키워드, 작성자, 뷰포트 설정 등

[목차로 돌아가기](#목차)

## 상대 경로 vs 절대 경로

이미지(`src`)나 링크(`href`)를 지정할 때 사용하는 주소 체계입니다.

+ **상대 경로: 현재 파일의 위치**를 기준으로 경로를 지정합니다. (예: `./images/logo.png`, `../index.html`)

+ **절대 경로: 루트 디렉터리나 전체 URL**을 기준으로 경로를 지정합니다. (예: `https://google.com/img.jpg`, `/assets/main.css`)

[목차로 돌아가기](#목차)

## Block vs Inline

HTML 요소는 화면에 배치되는 방식에 따라 크게 두 가지로 나뉩니다.

### 블록 요소 (Block)

+ 수직으로 쌓이며, 부모 요소의 전체 너비를 차지합니다.

+ 새로운 줄에서 시작하여 자동으로 줄바꿈이 일어납니다.

+ 대표 태그: `<div>`, `<p>`, `<h1>~<h6>`, `<ul>`, `<li>`, `<section>`

### 인라인 요소 (Inline)

+ 콘텐츠의 크기만큼만 너비를 차지하며, 줄바꿈 없이 옆으로 배치됩니다.

+ 텍스트의 일부를 감싸거나 스타일을 적용할 때 주로 사용합니다.

+ 대표 태그: `<a>`, `<span>`, `<img>`, `<strong>`, `<em>`

[목차로 돌아가기](#목차)

## 주요 태그 모음

### 필수 및 구조 태그

+ `<head>`: 메타데이터와 외부 리소스 연결 영역

+ `<body>`: 실제 화면에 출력되는 콘텐츠 영역

+ `<h1>~<h6>`: 제목 (중요도 순서)

+ `<p>`: 단락(Paragraph)

+ `<div>` / `<span>`: 레이아웃 및 스타일을 위한 컨테이너

### 목록 및 양식 태그

+ `<ul>` / `<ol>` / `<li>`: 리스트

+ `<a>`: 하이퍼링크 (href 필수)

+ `<img>`: 이미지 삽입 (src, alt 필수)

+ `<form>`: 사용자 입력 양식 정의

+ `<input>`: 입력 필드

+ `<table>`: 표 작성 (`<tr>`, `<td>`, `<th>`)

🏗️ 시멘틱 태그 (Semantic Tags)

태그 자체에 의미를 부여하여 SEO와 접근성을 높입니다.

+ `<header>`, `<nav>`, `<main>`, `<section>`, `<article>`, `<aside>`, `<footer>`

[목차로 돌아가기](#목차)