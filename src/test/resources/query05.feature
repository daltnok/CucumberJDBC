Feature: query05
  Background: Connection
    * Database baglantisi kurulur.
  @Query5
  Scenario: Database üzerinden bed tablosunda bed group id'si 4 ve is_active= "no" olan hastanin name bilgisinin 105 oldugunu dogrulayiniz.
    * Query5 olusturulur ve dogrulanir
    * Database baglantisi kapatilir