Feature: query02
  Background: Connection
    * Database baglantisi kurulur.
    @Query2
    Scenario: appointment_payment tablosunda odeme turu olarak "offline" secenl hasta id'lerinin (1,2,3,16,17,18,20,21,24,25,31) oldugunu dogrulayiniz.
      * Query2 olusturulur ve dogrulanir
      * Database baglantisi kapatilir
