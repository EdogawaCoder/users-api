# Overview

This project was developed as part of a personal study plan to strengthen skills in Spring Boot 3, JPA/Hibernate, and RESTful API design using Java 21.
It implements a simple backend API for user and profile management, following clean code principles and a layered architecture (Controller, Service, Repository).

## Purpose
The main purpose of this project is educational — it was built to explore:
- REST API development with Spring Boot 3.5.7
- Entity mapping and relationships with JPA and Hibernate
- Integration with PostgreSQL database
- Validation and exception handling best practices
- Layer separation and clean architecture concepts

## Technologies Used
- Java 21
- Spring Boot 3.5.7
- Spring Data JPA
- PostgreSQL
- Maven
- Lombok
- Spring Boot DevTools

## How to Run
1. Clone this repository:
   git clone https://github.com/EdogawaCoder/usersApi.git

2. Navigate to the project directory:
   cd usersApi

3. Run the application:
   mvn spring-boot:run

4. The API will be available at:
   http://localhost:8082

## Example Endpoints
| Method | Endpoint    | Description          |
|--------|-------------|----------------------|
| POST   | /users      | Create a new user    |
| GET    | /users      | List all users       |
| GET    | /users/{id} | Get a user by ID     |
| POST   | /profiles   | Create a new profile |
| GET    | /profiles   | List all profiles    |

Notes~~~~
This project was created for learning and portfolio purposes.
It is not intended for production use.


# 日本語版


このプロジェクトは、Spring Boot 3、JPA/Hibernate、および RESTful API 設計の理解を深めるための学習プロジェクトとして作成されました。
ユーザーとプロフィールを管理するシンプルなバックエンドAPIを実装し、クリーンなコードとレイヤードアーキテクチャ（Controller、Service、Repository）を採用しています。

## 目的
このプロジェクトの主な目的は教育用です。以下の内容を中心に学習を行いました。
- Spring Boot 3.5.7 を使用した REST API 開発
- JPA と Hibernate を用いたエンティティのマッピングとリレーション設計
- PostgreSQL データベースとの統合
- バリデーションと例外処理のベストプラクティス
- クリーンアーキテクチャと層の分離の概念

## 使用技術
- Java 21
- Spring Boot 3.5.7
- Spring Data JPA
- PostgreSQL
- Maven
- Lombok
- Spring Boot DevTools

## 実行方法
1. リポジトリをクローンします:
   git clone https://github.com/EdogawaCoder/usersApi.git

2. プロジェクトディレクトリへ移動します:
   cd usersApi

3. アプリケーションを実行します:
   mvn spring-boot:run

4. 次のURLでアクセスできます:
   http://localhost:8082

## エンドポイント例
メソッド | エンドポイント | 説明
-----------|----------------|------
POST | /users | 新しいユーザーを作成
GET  | /users | すべてのユーザーを取得
GET  | /users/{id} | IDでユーザーを取得
POST | /profiles | 新しいプロフィールを作成
GET  | /profiles | すべてのプロフィールを取得

## 注意
このプロジェクトは学習とポートフォリオのデモンストレーションを目的として作成されました。
実運用を目的としたものではありません。
