Feature: query15
  Background: Connection
    * Database baglantisi kurulur.
  @Query15
  Scenario:Database üzerinden vehicles tablosundaki araclarin manufacture_year bilgisine göre en eskiden yeniye listelendiginde ve created_at bilgisine görede eskiden yeniye siralanip listelendiginde iki listede de ayni indexte yer alan arac oldugunu dogrulayiniz.
    * Query151 olusturulur
    * Query152 olusturulur
    * Her iki query sonucu karsilastirilir
    * Database baglantisi kapatilir