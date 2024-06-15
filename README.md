# Quick Link - Quick & Free URL shortener

[![Hits](https://hits.seeyoufarm.com/api/count/incr/badge.svg?url=https%3A%2F%2Fgithub.com%2Fseonghun-dev%2FQuickLink&count_bg=%231193F1&title_bg=%23555555&icon=&icon_color=%23E7E7E7&title=hits&edge_flat=false)](https://hits.seeyoufarm.com)



## 💁‍♂️ 서비스 소개

Quick Link는 단축 URL을 제공하는 무료 서비스입니다. 사용자는 긴 URL을 짧고 기억하기 쉬운 링크로 변환하여 간편하게 공유할 수 있습니다.

<img width="2032" alt="screenshot 2024-06-15 오후 3 44 06" src="https://github.com/seonghun-dev/QuickLink/assets/80201773/e94d29f5-f699-4eca-b276-867d009d3f04">



## 📈 Dependency and Quick Start
### 📦 Dependency

Quick Link를 실행하기 위해 필요한 의존성은 다음과 같습니다

- Java 21
- Spring Boot 3.3.0
- MySQL 8.0.1
- Gradle 8.8
  

### 🚀 Quick Start
1. 저장소를 clone 합니다.
```Bash
git clone https://github.com/seonghun-dev/QuickLink.git
cd QuickLink
```

2. Docker-compose를 통해 데이터베이스를 실행시키고, schema.sql 파일을 통해 데이터베이스에 스키마를 적용합니다.
```bash
docker-compose up -d
```

4. Gradle을 통해 빌드하고, 애플리케이션을 실행시킵니다.
```bash
./gradlew build
./gradlew bootRun
```

5. 브라우저에서 http://localhost:8080 으로 이동하여 서비스를 이용합니다.


## 🛠️ 구현
Quick Link는 URL 단축을 위해 Base62 인코딩과 Snowflake ID 생성 알고리즘을 사용합니다.

**Base62 인코딩**


Base62는 URL에 안전하게 사용할 수 있는 문자 집합을 사용하여 숫자 ID를 짧은 문자열로 변환하는 방식입니다. 
알파벳 대소문자와 숫자 (0-9)를 포함한 62개의 문자로 구성됩니다. 
이를 통해 단축된 URL이 상대적으로 짧고 사용하기 편리합니다.


**Snowflake ID 생성**


Snowflake 알고리즘은 트위터에서 개발한 분산 시스템을 위한 고유 ID 생성기입니다.
이 알고리즘은 64비트 숫자로 구성된 고유 ID를 생성하며, 타임스탬프, 데이터센터 ID, 머신 ID, 일련 번호 등을 조합하여 중복되지 않는 고유 ID를 빠르게 생성할 수 있습니다. .



### 📄 라이선스
이 프로젝트는 MIT 라이선스를 따릅니다. 자세한 내용은 LICENSE 파일을 참조하십시오.

