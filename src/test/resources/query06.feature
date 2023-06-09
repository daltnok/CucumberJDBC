Feature: query06
  Background: Connection
    * Database baglantisi kurulur.
  @Query6
  Scenario: Database üzerinden birth_report tablosunda agirligi 2,5 kg ve ustu olan bebek sayisinin 6 oldugunu dogrulayiniz.
    * Query6 olusturulur ve dogrulanir
    * Database baglantisi kapatilir