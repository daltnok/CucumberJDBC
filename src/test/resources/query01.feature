# Soru 1: Database üzerinden appointment tablosundaki
# patient_id = 20 olan hastanin canli muayene isteginin acik oldugunu dogrulayiniz.
Feature: query01
  Background: Connection
    * Database baglantisi kurulur.
  @Query1
  Scenario:Appointment tablosundaki patient_id 20 olan hastanin canli muayene isteginin acik oldugunun dogrulanmasi
    * Query olusturulur ve dogrulanir
    * Database baglantisi kapatilir

