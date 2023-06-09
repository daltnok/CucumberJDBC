Feature: query08
  Background: Connection
    * Database baglantisi kurulur.
  @Query8
  Scenario: Database üzerinden blood_donor tablosundaki id= 7 olan donorun donor_name'i Maria, date_of_birth=2001-03-02, gender=Female, father_name=Jhonson, address=England oldugunu dogrulayiniz.
    * Query8 olusturulur ve dogrulanir
    * Database baglantisi kapatilir