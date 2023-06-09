Feature: query09
  Background: Connection
    * Database baglantisi kurulur.
  @Query9
  Scenario: Database uzerinden charge_categories tablosundaki name bilgisi "P" ile baslayan iceriklerin charge_type_id numaralarini tekrardan arindirilmis olarak listeleyiniz ve dogrulayiniz. (6 , 7)
    * Query9 olusturulur ve dogrulanir
    * Database baglantisi kapatilir