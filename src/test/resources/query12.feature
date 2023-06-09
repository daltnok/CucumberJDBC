Feature: query12
  Background: Connection
    * Database baglantisi kurulur.
  @Query12
  Scenario:Database üzerinden doctor_shift tablosunda staff_id=2 olan doctorun sali gunu kac saat calistigini dogrulayiniz. (2)
    * Query12 olusturulur ve dogrulanir
    * Database baglantisi kapatilir