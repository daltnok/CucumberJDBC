Feature: query14
  Background: Connection
    * Database baglantisi kurulur.
  @Query14
  Scenario:Database üzerinden staff tablosundaki qualification=MS, specialization= Neurology olan iceriklerin account_title verilerini harf sirasina göre siralayarak listeyiniz.
    * Query14 olusturulur ve dogrulanir
    * Database baglantisi kapatilir