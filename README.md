# 🛍️ Spring Boot & JPA 基盤 ECサイトプロジェクト

## 🔗 🛠 技術スタック (Tech Stack)

- **Framework**: Spring Boot (Spring Web)
- **ORM**: Spring Data JPA
- **Template Engine**: Thymeleaf
- **Database**: H2 Database

---

## ❓ 作成背景 (Motivation)

**「学んだ理論を、実際のビジネスロジックとして形にしたかった」**

Spring BootとJPAの概念を学習する中で、単に講義を聞くだけでは技術の習得が不十分だと感じました。
そこで、実際の現場で最も多く扱われる**ECサイト（E-commerce）ドメイン**を自ら実装し、以下の目標を達成するためにこのプロジェクトを始めました。

- **オブジェクト指向設計**: JPAを活用し、オブジェクトとリレーショナルデータベース(RDB)間のインピーダンスミスマッチを解消
- **MVCパターンの体得**: Controller, Service, Repositoryへと繋がるWebアプリケーションの全体フローを把握
- **実践的な実装**: 単純なCRUDを超え、注文・配送・会員などの複雑なリレーション(連関関係)のマッピングを練習

このプロジェクトは、**安定したバックエンド技術の習得と、クリーンなコード作成**を目標としています。

---

## 📌 こだわりポイント (Key Concepts)

- **Web層 (Web Layer)**: Thymeleafを活用したサーバーサイドレンダリング(SSR)の実装
- **ドメインモデルパターン**: ビジネスロジックをエンティティ内に持たせ、オブジェクト指向的な設計を追求
- **データアクセス**: Spring Data JPAを使用し、反復的なSQLを排除して生産性の高い開発を実現
- **開発環境**: H2 Databaseを採用し、軽量かつ高速な開発・テスト環境を構築



<img width="676" height="557" alt="image" src="https://github.com/user-attachments/assets/cdcf8ec2-ec0a-408e-812e-3c0ac95e0624" />
