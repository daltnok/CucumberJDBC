Feature: query13
  Background: Connection
    * Database baglantisi kurulur.
  @Query13
  Scenario:Database üzerinden medicine_supplier tablosundaki address bilgisi "Andheri, Mumbai" olan verinin diger bilgilerinin dogru oldugunu kontrol ediniz.
    * Query13 olusturulur ve dogrulanir
    * Database baglantisi kapatilir