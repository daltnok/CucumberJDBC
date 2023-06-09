Feature: query07
  Background: Connection
    * Database baglantisi kurulur.
  @Query7
  Scenario: Database üzerinden birth_report tablosunda kardes olan bebekleri listeleyip isimlerini dogrulayiniz.
    * Query7 olusturulur ve dogrulanir
    * Database baglantisi kapatilir