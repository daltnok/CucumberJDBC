Feature: query04
  Background: Connection
    * Database baglantisi kurulur.
  @Query4
  Scenario: Database uzerinden bed tablosunda created_at = 2021-10-25 03:34:25 olan yatagin active oldugunu dogrulayiniz
      * Query4 olusturulur ve dogrulanir
      * Database baglantisi kapatilir