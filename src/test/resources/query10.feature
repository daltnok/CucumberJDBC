Feature: query10
  Background: Connection
    * Database baglantisi kurulur.
  @Query10
  Scenario: Database üzerinden death_report tablosundaki ölüm tarihlerine göre en son ölen hastanin guardian_name bilgisinin Kane Stark oldugunu dogrulayiniz.
    * Query10 olusturulur ve dogrulanir
    * Database baglantisi kapatilir