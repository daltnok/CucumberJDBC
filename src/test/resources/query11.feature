Feature: query11
  Background: Connection
    * Database baglantisi kurulur.
  @Query11
  Scenario: Database üzerinden discharge_card tablosundaki opd_details_id'si 11 ile 31 arasindaki (11 ve 31 haric) verlerin created_at bilgilerini dogrulayiniz
    * Query11 olusturulur ve dogrulanir
    * Database baglantisi kapatilir